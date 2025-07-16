SELECT animal_id, i.name
FROM animal_ins i
JOIN animal_outs o USING (animal_id)
ORDER BY DATEDIFF(o.datetime, i.datetime) DESC
LIMIT 2