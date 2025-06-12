SELECT 
    YEAR(differentiation_date) AS year,
    ((SELECT MAX(size_of_colony)
    FROM ecoli_data
    WHERE YEAR(differentiation_date) = 
        YEAR(e.differentiation_date)) - size_of_colony) AS year_dev,
    id
FROM ecoli_data e
ORDER BY YEAR(differentiation_date) ASC, year_dev ASC