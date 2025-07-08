SELECT animal_id, o.name
FROM animal_ins i
RIGHT JOIN animal_outs o
    USING (animal_id)
WHERE i.name IS NULL AND o.name IS NOT NULL
ORDER BY animal_id ASC