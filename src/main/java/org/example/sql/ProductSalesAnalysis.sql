SELECT
    p.product_name,
    s.year,
    s.price
FROM sales s
INNER JOIN product p
ON s.product_id = p.product_id


// https://leetcode.com/problems/product-sales-analysis-i/description/?envType=study-plan-v2&envId=top-sql-50