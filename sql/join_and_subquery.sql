--1 마당서점의 고객이 요구하는 다음질문에대해SQL 문을작성하시오.

--(5) 박지성이 구매한 도서의 출판사수
--커스토머에서 custid 1 구하고 올더에서 bookid 132 구하고 북에서 또 구해야함  
select count(PUBLISHER)
from book b,orders o,customer c
where 
    o.custid = c.custid 
    and c.name = '박지성' 
    and o.bookid = b.bookid
;


--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select *
from book ;

select *
from orders;

select *
from customer;

select b.bookname , b.price , b.price - o.saleprice price_gap
from book b , orders o , customer c
where c.name = '박지성' and 
o.custid = c.custid and
o.bookid = b.bookid
;

--(7) 박지성이구매하지않은도서의이름 이건 어떻게 구해? 북 목록에서 박지성이 구매한 도서를 제외시켜 제외시키는 명령어가 뭔데 북 아이디를 제외시켜
select *
from book ;

select *
from orders;

select *
from customer;


select bookname
from book 
where bookid not in 
(select b.bookid
from book b , orders o , customer c
where c.custid = o.custid and o.bookid = b.bookid and c.name = '박지성')
;



​

​

2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.

(8) 주문하지않은고객의이름(부속질의사용)


​

​

(9) 주문금액의총액과주문의평균금액


​

​

​

(10) 고객의이름과고객별구매액


​

​

​

​

(11) 고객의이름과고객이구매한도서목록


​

​

​

​

(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문


​

​

(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름


​

​

​

3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.

(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름


​

​

(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름


​