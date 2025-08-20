(SELECT 
    DATE_FORMAT(sales_date, "%Y-%m-%d") AS sales_date, 
    product_id, 
    user_id, 
    sales_amount
FROM online_sale
WHERE YEAR(sales_date) = 2022 AND MONTH(sales_date) = 3
GROUP BY sales_date, product_id, user_id)

UNION

(SELECT 
    DATE_FORMAT(sales_date, "%Y-%m-%d") AS sales_date, 
    product_id, 
    NULL AS user_id, 
    sales_amount
FROM offline_sale
WHERE YEAR(sales_date) = 2022 AND MONTH(sales_date) = 3
GROUP BY sales_date, product_id)

ORDER BY sales_date ASC, product_id ASC, user_id ASC

