SELECT i.name, i.datetime
FROM animal_ins i
LEFT JOIN animal_outs o USING (animal_id)
WHERE o.datetime IS NULL
ORDER BY i.datetime ASC
LIMIT 3