SELECT flavor
FROM first_half f
JOIN july j 
USING (flavor)
GROUP BY flavor
ORDER BY SUM(f.total_order) + SUM(j.total_order) DESC
LIMIT 3
