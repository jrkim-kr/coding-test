SELECT ingredient_type, SUM(a.total_order) total_order
FROM first_half a
LEFT JOIN icecream_info b USING (flavor)
GROUP BY ingredient_type
ORDER BY total_order ASC