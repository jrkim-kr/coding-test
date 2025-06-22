SELECT COUNT(id) fish_count, fish_name
FROM fish_info
JOIN fish_name_info
USING(fish_type)
GROUP BY fish_type, fish_name
ORDER BY fish_count DESC