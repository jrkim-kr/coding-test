SELECT id, email, first_name, last_name
FROM developers
WHERE skill_code & (
    SELECT SUM(code)
    FROM skillcodes
    WHERE category = "Front End") > 0
ORDER BY id ASC