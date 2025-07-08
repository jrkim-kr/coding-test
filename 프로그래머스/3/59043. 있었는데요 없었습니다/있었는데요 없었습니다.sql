SELECT animal_id, i.name
FROM animal_ins i
JOIN animal_outs o USING (animal_id)
WHERE i.datetime > o.datetime
ORDER BY i.datetime ASC