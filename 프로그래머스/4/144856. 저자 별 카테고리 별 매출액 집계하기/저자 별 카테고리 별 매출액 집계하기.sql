SELECT author_id, c.author_name, b.category, SUM(a.sales * b.price) AS total_sales
FROM book_sales a
LEFT JOIN book b USING (book_id) 
LEFT JOIN author c USING (author_id)
WHERE DATE_FORMAT(a.sales_date, '%Y-%m') = '2022-01'
GROUP BY author_id, c.author_name, b.category
ORDER BY author_id ASC, b.category DESC