SELECT 
    ri.rest_id, 
    ri.rest_name, 
    ri.food_type, 
    ri.favorites, 
    ri.address, 
    ROUND(AVG(rr.review_score), 2) AS score
FROM rest_info ri
INNER JOIN rest_review rr USING (rest_id)
WHERE ri.address LIKE '서울%'
GROUP BY ri.rest_id, ri.rest_name, ri.food_type, ri.favorites, ri.address
ORDER BY score DESC, ri.favorites DESC;