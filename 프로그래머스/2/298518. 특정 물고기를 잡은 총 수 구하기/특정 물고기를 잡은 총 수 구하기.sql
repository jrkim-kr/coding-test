SELECT COUNT(*) fish_count
FROM fish_info
LEFT JOIN fish_name_info
USING (fish_type)
WHERE fish_name IN ('BASS', 'SNAPPER')