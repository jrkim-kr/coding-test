SELECT a.id, b.fish_name, a.length
FROM fish_info a
LEFT JOIN fish_name_info b
USING (fish_type)
WHERE a.length = (
    SELECT MAX(length)
    FROM fish_info
    WHERE fish_type = a.fish_type
    )
ORDER BY a.id