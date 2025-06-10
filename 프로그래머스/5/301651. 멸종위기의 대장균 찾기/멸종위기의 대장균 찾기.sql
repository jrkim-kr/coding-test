WITH RECURSIVE cte AS (
    SELECT id, parent_id, 1 AS generation
    FROM ecoli_data
    WHERE parent_id IS NULL
    
    UNION ALL
    
    SELECT e.id, e.parent_id, generation + 1 AS generation
    FROM ecoli_data e
    JOIN cte
    ON cte.id = e.parent_id   
)

SELECT 
    COUNT(c1.id) AS count,
    c1.generation AS generation
FROM cte c1
LEFT JOIN cte c2
ON c1.id = c2.parent_id
WHERE c2.parent_id IS NULL
GROUP BY c1.generation
ORDER BY c1.generation
