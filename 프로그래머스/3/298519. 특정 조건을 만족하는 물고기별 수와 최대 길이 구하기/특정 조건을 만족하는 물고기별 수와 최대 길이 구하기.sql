SELECT COUNT(id) fish_count, MAX(length) max_length, fish_type
FROM fish_info
GROUP BY fish_type
HAVING AVG(IFNULL(length, 10)) >= 33
ORDER BY fish_type ASC