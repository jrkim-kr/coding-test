SELECT item_id, item_name, rarity
FROM item_info
LEFT JOIN item_tree USING (item_id)
WHERE parent_item_id IN (
    SELECT item_id 
    FROM item_info 
    WHERE rarity = 'RARE')
ORDER BY item_id DESC