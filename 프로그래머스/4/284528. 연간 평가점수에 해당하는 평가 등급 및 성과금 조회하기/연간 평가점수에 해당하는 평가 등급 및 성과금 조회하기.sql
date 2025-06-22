WITH cte AS (
    SELECT AVG(score) score, emp_no, emp_name, sal, 
    'C' AS grade, 0 AS bonus
    FROM hr_grade
    JOIN hr_employees
    USING (emp_no)
    GROUP BY emp_no, emp_name, sal
    ORDER BY score DESC)

SELECT
    emp_no, emp_name,
    CASE
        WHEN score >= 96 THEN 'S'
        WHEN score >= 90 THEN 'A'
        WHEN score >= 80 THEN 'B'
        ELSE 'C'
    END AS grade,
    CASE
        WHEN score >= 96 THEN sal * 0.2
        WHEN score >= 90 THEN sal * 0.15
        WHEN score >= 80 THEN sal * 0.1
        ELSE 0
    END AS bonus
FROM cte
ORDER BY emp_no ASC