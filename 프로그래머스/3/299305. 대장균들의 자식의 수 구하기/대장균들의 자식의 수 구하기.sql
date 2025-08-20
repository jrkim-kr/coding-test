SELECT p.id, IFNULL(COUNT(c.id), 0) AS child_count
FROM ecoli_data p
LEFT JOIN ecoli_data c
    ON p.id = c.parent_id
GROUP BY p.id
ORDER BY p.id ASC