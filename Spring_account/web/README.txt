sql:
用户登录
select * from account where cno = ? and pwd = ?
查询金额是否够
select * from account where cno = ? and pwd = ? and money>#{param}

select * from account where cno = ?

update account set money = money-? where cno = ?
update account set money = money+? where cno = ?
