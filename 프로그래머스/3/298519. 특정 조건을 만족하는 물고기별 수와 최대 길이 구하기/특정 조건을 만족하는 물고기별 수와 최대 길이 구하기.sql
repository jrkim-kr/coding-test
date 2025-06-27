SELECT COUNT(a.id) fish_count, MAX(a.length) max_length, a.fish_type
FROM
    (SELECT 
        id, fish_type, IFNULL(length, 10) length, time
    FROM fish_info) a
GROUP BY a.fish_type
HAVING AVG(a.length) >= 33
ORDER BY a.fish_type ASC