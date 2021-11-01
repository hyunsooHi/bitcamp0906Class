--1101서브쿼리

--서브쿼리 (부속 질의)
--SELECT 구문안에 또 다른 SELECT 구문을 이용

--조인이용해서 2개부를거 1개할수있지만
--서브쿼리해서도 SELECT를 두개쓰니까 2개부를꺼 1번에가능

SELECT DNAME , EMP.DEPTNO
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO AND ENAME = 'SCOTT'
;

SELECT DNAME
FROM DEPT
WHERE DEPTNO = (
    SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT'

);

--1내부쿼리 먼저작성 SCOTT사원의 부서번호 
--2외부쿼리작성 : 부서번호로 부서이름검색
--SCOTT사원의 부서 이름

--뷰는 가상테이블, 셀렉트의 결과를 논리테이블로 등록하고사용
select deptno,dname from dept where deptno > 20;


--마당서점의 고객별판매액을 보이시오
--결과는 고객이름과 고객별 판매액

select * from customer;
select * from orders;
select custid , 
        (select name from customer c where o.custid = c.custid) as name,

sum(saleprice)
from orders o
group by custid
;

-- join 으로해봄
select o.custid , c.name , sum(o.saleprice)
from orders o, customer c
where o.custid = c.custid
group by o.custid , c.name

;

--사원의 이름과 부서 이름을 출력
select ename, deptno,
    (select dname from dept where emp.deptno=dept.deptno)

from emp
;
--join으로해봄
select ename,dname
from emp,dept
where emp.deptno=dept.deptno;

--인라인뷰 : from 뒤에오는 서브쿼리

--고객번호가 2이하인 고객의판매액
--결과는 고객이름과 고객별판매액 출력

select custid , name from customer where custid <= 2;
select o.custid , sum(saleprice) 
from orders o ,
(select custid , name from customer where custid <= 2) c
where o.custid = c.custid 
group by o.custid
;

--30번 부서의 인라인 뷰를 만들어서 사용
select *
from (select * from emp where deptno = 30);

select *
from orders 
where custid<=2
;


























































