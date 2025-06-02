SELECT flavor
FROM first_half
INNER JOIN icecream_info
USING (flavor)
WHERE (ingredient_type = 'fruit_based') AND (total_order > 3000)
ORDER BY total_order DESC