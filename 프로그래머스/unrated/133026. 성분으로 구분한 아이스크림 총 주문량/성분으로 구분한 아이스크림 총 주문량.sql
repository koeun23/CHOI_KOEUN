select  ingredient_type, sum(total_order) as TOTAL_ORDER

from (SELECT *
    from  icecream_info a left join first_half b
    on a.flavor=b.flavor) 
    
group by ingredient_type
order by TOTAL_ORDER ASC