SELECT HOUR(datetime) hour, COUNT(DISTINCT animal_id) count
FROM animal_outs
WHERE HOUR(datetime) BETWEEN 9 AND 19
GROUP BY HOUR(datetime)
ORDER BY HOUR(datetime) ASC