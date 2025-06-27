SELECT COUNT(id) fish_count, MONTH(time) month
FROM fish_info
GROUP BY MONTH(time)
HAVING fish_count > 0
ORDER BY month ASC