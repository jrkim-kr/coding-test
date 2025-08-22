WITH RECURSIVE cte AS (
    SELECT id, parent_id, 1 AS generation
    FROM ecoli_data
    WHERE parent_id IS NULL
    UNION ALL
    SELECT e.id, e.parent_id, c.generation + 1
    FROM ecoli_data e
    JOIN cte c ON c.id = e.parent_id
    )

SELECT c.id
FROM cte c
WHERE c.generation = 3
ORDER BY c.id ASC