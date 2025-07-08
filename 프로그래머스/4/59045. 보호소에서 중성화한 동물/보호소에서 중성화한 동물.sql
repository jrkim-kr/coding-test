SELECT animal_id, i.animal_type, i.name
FROM animal_ins i
LEFT JOIN animal_outs o
    USING (animal_id)
WHERE i.sex_upon_intake LIKE "%Intact%"
    AND o.sex_upon_outcome NOT LIKE "%Intact%"
ORDER BY animal_id ASC