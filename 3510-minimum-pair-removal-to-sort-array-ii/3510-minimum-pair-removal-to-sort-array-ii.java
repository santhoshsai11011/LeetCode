import java.util.*;

class Solution {
    static class Node {
        long val;
        Node prev, next;
        boolean alive = true;
        int id;

        Node(long v, int id) {
            this.val = v;
            this.id = id;
        }
    }

    static class Pair {
        long sum;
        Node left;

        Pair(long sum, Node left) {
            this.sum = sum;
            this.left = left;
        }
    }

    public int minimumPairRemoval(int[] nums) {   // 👈 FIXED NAME
        int n = nums.length;
        if (n <= 1) return 0;

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) nodes[i] = new Node(nums[i], i);

        for (int i = 0; i < n; i++) {
            if (i > 0) nodes[i].prev = nodes[i - 1];
            if (i < n - 1) nodes[i].next = nodes[i + 1];
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.sum != b.sum) return Long.compare(a.sum, b.sum);
            return Integer.compare(a.left.id, b.left.id);
        });

        for (int i = 0; i + 1 < n; i++) {
            pq.add(new Pair(nodes[i].val + nodes[i + 1].val, nodes[i]));
        }

        int ops = 0;

        while (!isSorted(nodes[0])) {
            Pair p;
            while (true) {
                p = pq.poll();
                Node a = p.left;
                Node b = a.next;
                if (a.alive && b != null && b.alive && a.val + b.val == p.sum) {
                    break;
                }
            }

            Node a = p.left;
            Node b = a.next;

            a.val += b.val;
            b.alive = false;

            a.next = b.next;
            if (b.next != null) b.next.prev = a;

            if (a.prev != null) {
                pq.add(new Pair(a.prev.val + a.val, a.prev));
            }
            if (a.next != null) {
                pq.add(new Pair(a.val + a.next.val, a));
            }

            ops++;
        }

        return ops;
    }

    private boolean isSorted(Node head) {
        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val > cur.next.val) return false;
            cur = cur.next;
        }
        return true;
    }
}


