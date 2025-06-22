SELECT SUM(score) score, emp_no, emp_name, position, email
FROM hr_grade g
LEFT JOIN hr_employees e
USING (emp_no)
WHERE g.year = 2022
GROUP BY emp_no, emp_name, position, email
ORDER BY score DESC
LIMIT 1