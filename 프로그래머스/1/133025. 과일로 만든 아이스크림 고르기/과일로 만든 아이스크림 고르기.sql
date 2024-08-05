SELECT I.FLAVOR
FROM ICECREAM_INFO I
JOIN FIRST_HALF F ON F.FLAVOR = I.FLAVOR
WHERE F.TOTAL_ORDER > 3000 AND I.INGREDIENT_TYPE = 'FRUIT_BASED'
ORDER BY TOTAL_ORDER DESC

