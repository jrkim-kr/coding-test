SELECT 
    child.ID,
    child.GENOTYPE,
    parent.GENOTYPE AS PARENT_GENOTYPE
FROM ecoli_data child                    -- 자식을 메인 테이블로 설정
JOIN ecoli_data parent                   -- 부모를 조인 테이블로 설정
ON child.PARENT_ID = parent.ID           -- 자식의 PARENT_ID로 부모 찾기
WHERE (child.GENOTYPE & parent.GENOTYPE) = parent.GENOTYPE  -- 형질 포함 확인
ORDER BY child.ID;