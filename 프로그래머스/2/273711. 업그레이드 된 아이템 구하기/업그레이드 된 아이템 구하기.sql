SELECT a.item_id, a.item_name, a.rarity
FROM (
    SELECT *
    FROM item_info
    LEFT JOIN item_tree USING (item_id)
    WHERE parent_item_id IN (
        SELECT item_id 
        FROM item_info 
        WHERE rarity = 'RARE')
    ) a
ORDER BY a.item_id DESC
