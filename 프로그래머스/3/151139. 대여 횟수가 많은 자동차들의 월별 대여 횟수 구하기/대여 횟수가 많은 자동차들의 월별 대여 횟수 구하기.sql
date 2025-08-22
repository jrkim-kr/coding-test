SELECT 
    MONTH(start_date) month,
    car_id,
    COUNT(*) records
FROM car_rental_company_rental_history
WHERE MONTH(start_date) BETWEEN 8 AND 10
    AND car_id IN
        (SELECT car_id
        FROM car_rental_company_rental_history
        WHERE MONTH(start_date) BETWEEN 8 AND 10
        GROUP BY car_id
        HAVING COUNT(*) >= 5)
GROUP BY MONTH(start_date), car_id
ORDER BY month ASC, car_id DESC