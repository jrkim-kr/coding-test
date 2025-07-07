SELECT product_id, product_name, SUM(price * amount) total_sales
FROM food_product
LEFT JOIN food_order
    USING (product_id)
WHERE YEAR(produce_date) = "2022" AND MONTH(produce_date) = "5"
GROUP BY product_id, product_name
ORDER BY total_sales DESC, product_id ASC