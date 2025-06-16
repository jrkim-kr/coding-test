SELECT YEAR(b.sales_date) year, MONTH(b.sales_date) month, a.gender, COUNT(DISTINCT user_id) users
FROM user_info a
JOIN online_sale b
USING (user_id)
WHERE a.gender IS NOT NULL AND b.sales_amount > 0
GROUP BY YEAR(b.sales_date), MONTH(b.sales_date), a.gender
ORDER BY year ASC, month ASC, a.gender ASC