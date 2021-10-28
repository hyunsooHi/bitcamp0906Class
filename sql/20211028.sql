--2021.10.28
--명령어로테이블

--로그인한 사용자가 보유하고 있는 테이블 정보를 가지고 있는 메타데이터 테이블

SELECT
    *
FROM
    tab;

--테이블의 구조 확인

DESC dept;

SELECT
    *
FROM
    emp;

SELECT
    *
FROM
    dept;

SELECT
    *
FROM
    book;

SELECT
    *
FROM
    customer;

SELECT
    *
FROM
    orders;

SELECT
    orderid,
    custid,
    saleprice
FROM
    orders;

--select 구문에서 컬럼의 산술연산이 가능
SELECT
    sal,
    sal + 100
FROM
    emp;

SELECT
    *
FROM
    emp;

--회사 사원들의 이름과 월 급여 연봉을 리스트로 출력

SELECT
    ename,
    sal,
    sal * 12,
    comm,
    sal * 12 + comm,
    nvl(sal * 12 + comm, sal * 12)
FROM
    emp;

--연봉에 커미션(수당)을 해보자 +comm, 주의! comm의 값 중에는 null이있다
--널은 아직 정해지지 않은 값이다. 무한대일수도있다 있는것도 없는것도아니다
--연산할수없다 연산결과도 널이다


--nvl함수 null값을 치환해준다
--nvl(컬럼명 , 치환할데이터)

SELECT
    comm,
    nvl(comm, 100)
FROM
    emp;

--nvl함수이용해서 결과값을도출
SELECT
    ename,
    sal,
    sal * 12,
    comm,
    sal * 12 + comm,
    comm,
    nvl(comm, 0),
    sal * 12 + nvl(comm, 0)
FROM
    emp;


--별칭을 이용해서 컬럼이름 사용
SELECT
    ename as "사원이름",
    sal 월급,
    sal * 12 + nvl(comm, 0) AS "연봉"
FROM
    emp;
    
--문자열을 연결해주는 ||연산자
select ename || ' is a ' || job msg
from emp;

--사원들이 소속된 부서 번호 출력
select distinct deptno
from emp;

select *
from book;

==우리서점에 입점한 출판사 리스트
select distinct publisher
from book;

select distinct deptno , job
from emp;


----------------------------------------------where
select * --출력하고자 하는 컬럼
from emp --대상 테이블
where sal >= 3000 -- 조건: 비교연산 또는 논리연산 
;

-- 10번 부서의 소속된 -> 행을 검색할 조건 
-- 사원의 리스트 출력

select *
from emp
where deptno=10;

--이름이 ford인 사원의:행
--사원번호와 사원이름과 급여를 출력해보자

select empno , ename, sal  
from emp
where ename = 'FORD';

--셀렉트는 대소문자 안가림 근데 데이터는 대소문자 가림

--날짜비교 82년 이후 입사자
select * 
from emp
where hiredate >= '82/01/01'
;

------------10번부서소속인 사원들중에서
--직급이 메니저인사람 검색하여
--사원명 부서번호 직급을 출력
select ename,empno,job
from emp
where deptno=10 and job = 'MANAGER';


-----or

select ename,empno,job
from emp
where deptno = 10 or job = 'MANAGER';

--부서번호가 10번이 아닌 사원의 이름 부서번호 직급 출력
select ename,empno,job
from emp
where not deptno=10;
-- !=10
-- <>10 해도됨

--2000에서 3000사이의 급여를 받는 사원과 : 조건

select *
from emp
--where sal between 2000 and 3000;
where sal >=2000 and sal <= 3000; 


---1987년에 입사한 사원을 출력해봅시다
select *
from emp
where hiredate between '87/01/01' and '87/12/31'
;


--커미션이 300이거나 500이거나 1400인 사원을 검색하기위해 in사용
select *
from emp
--where comm = 300 or comm = 500 or comm = 1400;
where comm in(300,500,1400);


--like 연산자와 와일드카드 %는 0이상 아무거나 _는 1개문자
--컬럼이름 like 패턴

--찾으려는 이름이 F로 시작하는거는 안다

select *
from emp
where ename like 'F%'; -- 에프어쩌고~

--이름중에 a 포함하는거는 어쩌고 a 어쩌고 니까 %A%

select *
from emp
where ename like '%A%';

-- n으로 끝나는거 %n
select *
from emp
where ename like '%N';

--두번째 글자가 에이인것 _A어쩌고

select *
from emp
where ename like '_A%';

-- A를 포함하지 않는 사원
select *
from emp
where ename not like '%A%';

--커미션을 받는/않는 사원 검색
select *
from emp
where comm is not null and comm != 0;

--order by sal asc desc 생략하면 asc로됨 오름차순)

select *
from emp
order by ename asc;

--월급 입사일순
select *
from emp
order by hiredate, sal; -- 입사일이 같은순서로 먼저 배열하고 같은경우엔 샐러리순














































    