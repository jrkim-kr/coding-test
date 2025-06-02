SELECT 
    b.title, 
    board_id, 
    r.reply_id, 
    r.writer_id, 
    r.contents, 
    DATE_FORMAT(r.created_date, '%Y-%m-%d') AS created_date
FROM 
    used_goods_board b
INNER JOIN 
    used_goods_reply r
USING (board_id)
WHERE 
    DATE_FORMAT(b.created_date, '%Y-%m') = '2022-10'
ORDER BY 
    r.created_date ASC, 
    b.title ASC;
