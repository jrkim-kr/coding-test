SELECT member_name, review_text, DATE_FORMAT(review_date, "%Y-%m-%d") review_date
FROM member_profile
JOIN rest_review 
    USING (member_id)
WHERE member_id = 
    (SELECT member_id
    FROM member_profile
    JOIN rest_review 
        USING (member_id)
    GROUP BY member_id
    ORDER BY COUNT(review_id) DESC
    LIMIT 1)
ORDER BY review_date ASC, review_text ASC
