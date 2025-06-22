SELECT dept_id, dept_name_en, ROUND(AVG(sal)) avg_sal
FROM hr_department
JOIN hr_employees
USING (dept_id)
GROUP BY dept_id, dept_name_en
ORDER BY avg_sal DESC