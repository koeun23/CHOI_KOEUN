-- 코드를 입력하세요
SELECT price as max_price 
from (select * from product order by price desc)
where rownum=1; 