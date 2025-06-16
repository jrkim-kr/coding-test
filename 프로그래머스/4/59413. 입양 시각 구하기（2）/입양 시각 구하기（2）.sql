WITH RECURSIVE hours AS (
    SELECT 0 AS hour
    
    UNION ALL
    SELECT hour + 1
    FROM hours
    WHERE hour < 23)
    
SELECT h.hour, IFNULL(COUNT(animal_id), 0) count
FROM hours h
LEFT JOIN animal_outs ao
ON h.hour = HOUR(ao.datetime)
GROUP BY h.hour
ORDER BY h.hour ASC

