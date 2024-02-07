-- 코드를 입력하세요
SELECT MCDP_CD AS "진료과 코드" , COUNT(APNT_NO) AS "5월예약건수"
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY `5월예약건수`,`진료과 코드`  #alias를 참조하기 위해서는 백틱을 사용해야한다.