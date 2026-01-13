# Write your MySQL query statement below

select name from customer
where referee_id is null
or id in (select id from customer where referee_id != 2);