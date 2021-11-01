--2021-11-01
--JOIN
--CROSS JOIN : 단순히 테이블을 붙이는 조인

--컬럼을 붙이고, 행(데이터)는 집합의 합 연산(카티즌 곱)
-- ->전체 행은 R1의 개수 곱하기 R2 행의 개수
--EMP 테이블과 DEPT 테이블의 JOIN -> 14*4=56개의 행

--CROSS JOIN문
--SELECT * FROM 테이블명 , 테이블명 ....

SELECT *
FROM EMP,DEPT
ORDER BY DEPT.DEPTNO;


SELECT ENAME,dept.deptno,dname
FROM EMP,DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO AND ENAME = 'SCOTT';

--SCOTT 사원의 부서이름 출력
--스캇은 EMP에 있고 부서이름은 DEPT에 있어서 조인해야함
--우리가 다뤄야하는 데이터가 있는 테이블을 찾고 따로있으믄 조인한다


SELECT *
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO;

SELECT *
FROM SALGRADE S , EMP E
WHERE E.SAL >= S.LOSAL AND e.sal <= S.HISAL
ORDER BY e.empno

;

--나자신을참조 SELF JOIN
SELECT E.NAME,E.MGR,M.EMPNO,M.ENAME
FROM EMP E, EMP M
WHERE E.MGR=M.EMPNO
ORDER BY E.MGR
;

--결과의 행의 개수가 13이다!!! ->MGR NILL이면 무저건


SELECT *
FROM EMP E JOIN DEPT D
ON E.DEPTNO=D.DEPTNO;


SELECT E.NAME








