SELECT 
    emp_no,
    emp_name,
    CASE 
        WHEN AVG(score) >= 96 THEN 'S'
        WHEN AVG(score) >= 90 THEN 'A'
        WHEN AVG(score) >= 80 THEN 'B'
        ELSE 'C'
    END AS grade,
    CASE 
        WHEN AVG(score) >= 96 THEN sal * 0.2
        WHEN AVG(score) >= 90 THEN sal * 0.15
        WHEN AVG(score) >= 80 THEN sal * 0.1
        ELSE 0
    END AS bonus
FROM hr_employees
JOIN hr_grade
USING (emp_no)
GROUP BY emp_no, emp_name, sal
ORDER BY emp_no;