SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, DATE_FORMAT(r.created_date, '%Y-%m-%d') AS created_date
FROM used_goods_board b
INNER JOIN used_goods_reply r
ON b.board_id = r.board_id
WHERE b.created_date LIKE '2022-10%'
ORDER BY r.created_date ASC, b.title ASC