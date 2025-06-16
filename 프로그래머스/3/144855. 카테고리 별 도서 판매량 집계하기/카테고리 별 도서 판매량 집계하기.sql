SELECT category, SUM(b.sales) total_sales
FROM book a
JOIN book_sales b
USING (book_id)
WHERE YEAR(b.sales_date) = 2022 AND MONTH(b.sales_date) = 1
GROUP BY a.category
ORDER BY category ASC