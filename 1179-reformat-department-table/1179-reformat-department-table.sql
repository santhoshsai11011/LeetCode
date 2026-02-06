# Write your MySQL query statement below

SELECT id,
SUM(CASE WHEN month = "Jan" THEN revenue ELSE null END) AS Jan_revenue,
SUM(CASE WHEN month = "Feb" THEN revenue ELSE null END) AS Feb_revenue,
SUM(CASE WHEN month = "Mar" THEN revenue ELSE null END) AS Mar_revenue,
SUM(CASE WHEN month = "Apr" THEN revenue ELSE null END) AS Apr_revenue,
SUM(CASE WHEN month = "May" THEN revenue ELSE null END) AS May_revenue,
SUM(CASE WHEN month = "Jun" THEN revenue ELSE null END) AS Jun_revenue,
SUM(CASE WHEN month = "Jul" THEN revenue ELSE null END) AS Jul_revenue,
SUM(CASE WHEN month = "Aug" THEN revenue ELSE null END) AS Aug_revenue,
SUM(CASE WHEN month = "Sep" THEN revenue ELSE null END) AS Sep_revenue,
SUM(CASE WHEN month = "Oct" THEN revenue ELSE null END) AS Oct_revenue,
SUM(CASE WHEN month = "Nov" THEN revenue ELSE null END) AS Nov_revenue,
SUM(CASE WHEN month = "Dec" THEN revenue ELSE null END) AS Dec_revenue
FROM Department
Group by id;