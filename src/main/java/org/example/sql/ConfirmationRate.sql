SELECT
    s.user_id,
    CASE WHEN
        COUNT(action) = 0 THEN 0
    ELSE
        ROUND(
            COUNT(CASE WHEN action = 'confirmed' THEN 1 ELSE NULL END)
            / COUNT(action)
        , 2)
    END AS confirmation_rate
FROM signups s
LEFT JOIN confirmations c
ON s.user_id = c.user_id
GROUP BY s.user_id


// https://leetcode.com/problems/confirmation-rate/description/?envType=study-plan-v2&envId=top-sql-50