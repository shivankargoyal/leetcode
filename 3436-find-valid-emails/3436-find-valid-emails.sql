# Write your MySQL query statement below

select user_id, email
from Users
where (LENGTH(email) - LENGTH(REPLACE(email, '@', ''))) = 1
and not REGEXP_LIKE(upper(substr(email, 1, instr(email, '@') - 1)), '[^A-Z0-9]')
and REGEXP_LIKE(upper(substr(email, instr(email, '@') + 1, 1)), '[A-Z]')
and upper(email) like '%.COM';