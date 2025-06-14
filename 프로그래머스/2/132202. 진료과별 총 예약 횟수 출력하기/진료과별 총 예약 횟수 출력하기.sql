SELECT mcdp_cd '진료과코드', COUNT(pt_no) '5월예약건수'
FROM appointment a
WHERE YEAR(apnt_ymd) = 2022 AND MONTH(apnt_ymd) = 5
GROUP BY mcdp_cd
ORDER BY 5월예약건수 ASC, 진료과코드 ASC