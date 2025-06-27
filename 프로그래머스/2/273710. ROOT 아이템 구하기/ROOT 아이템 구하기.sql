SELECT item_id, item_name
FROM item_info
JOIN item_tree
USING (item_id)
WHERE parent_item_id IS NULL
ORDER BY item_id ASC