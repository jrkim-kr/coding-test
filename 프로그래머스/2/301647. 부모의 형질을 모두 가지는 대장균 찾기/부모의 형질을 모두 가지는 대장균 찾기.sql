SELECT c.id, c.genotype, p.genotype AS parent_genotype
FROM ecoli_data p
LEFT JOIN ecoli_data c
    ON p.id = c.parent_id
WHERE c.genotype & p.genotype = p.genotype