SELECT INSTR('ABCDEFGHCDKMNBCDJ','CD',1,1) FROM DUAL;

select instr('ABCDEFGHCDKMNBCDJ','CD',5,2) from dual;

select instr('ABCDEFGHCDKMNBCDJ','CD',-5,2) from dual;

select instr('krishna stami lord krishna jai krishna','krishna',1,2) from dual;

select instr('krishna stami lord krishna jai krishna','krishna',-1,3) from dual;

select instr('gowtham raj','raj') from dual;

select instr('gowtham raj','sai') from dual;

select instr('ABC*D','*') from dual;
--2
SELECT INSTR('krishna stami lord krishna jai krishna','radha',1,1)FROM DUAL;

--3
SELECT INSTR('Maharashtraa','a',1,1)FROM DUAL;

--4
Select Substr( 'Ameerpet Hyderabad', Instr('Ameerpet Hyderabad',' ',1,1)+1 ) from Dual;

--5
create table emails
(
mailid varchar2(30)
);

insert into emails values('abc.xyz@gmail.com');
insert into emails values('pqrst.kkkk@gmail.com');
commit;

SELECT * FROM EMAILS;
SELECT SUBSTR(MAILID,1,INSTR(MAILID,'.')-1) AS FIRST_PART FROM EMAILS;

--6
select translate('india','in','xy'),replace('india','in','xy') from dual;

--7
select translate('JOHN','H','N') from dual;

--8
 select replace('JOHN','H','N') from dual;

 --9
 select translate('JOHN','H','AMMERPET') from dual;

--10
select replace('JOHN','H','AMMERPET') from dual;

--11
select translate('ABCDEF','FEDCBA','123456') from dual;

--12
select replace('A B C',' ','india')from dual;

--13
Select Replace( 'JACK AND JUE', 'J', 'BL' ) FROM DUAL;

--ORDER_ID            ORDERDATE
--------------     -----------
--ORDER_980125        12-MAY-03
--ORDER_9712667       13-MAY-03

--EXPECTED OUTPUT:
--ORDER_ID             ORDERDATE     EXTRACT_VALUE
---------------     ----------    --------------
--ORDER_980125        12-MAY-03        980125     
--ORDER_9712667       13-MAY-03        9712667

--8.Create order1 table and set the EXTRACT_VALUE as following by 
  --using substr(),instr()[Delta Technologies Technical Round Interview Question]

CREATE TABLE ORDER5(ORDER_ID VARCHAR2(30), ORDER_DATE DATE);

INSERT INTO ORDER5 VALUES('ORDER_980125','12-MAY-03');
INSERT INTO ORDER5 VALUES('ORDER_9712667','13-MAY-03');

SELECT * FROM ORDER5;
SELECT E.*,SUBSTR(ORDER_ID,INSTR(ORDER_ID,'_',1)+1) AS EXTRACT_VALUE FROM ORDER5 E;



--9.Create order2 table and set the EXTRACT_VALUE as following 
--  by using substr(),instr()[Delta Technologies Technical Round Interview Question]

--ORDER_ID             ORDERDATE
-------------------- ---------
--ORDER_356125_PID1    12-MAY-03
--ORDER_98032667_PID2  13-MAY-03

CREATE TABLE orders
(
  order_id   VARCHAR2(25),
  orderdate  DATE
);
INSERT INTO orders VALUES ('ORDER_356125_PID1', TO_DATE('12-MAY-03','DD-MON-YY'));
INSERT INTO orders VALUES ('ORDER_98032667_PID2', TO_DATE('13-MAY-03','DD-MON-YY'));
COMMIT;


update ORDERS set extract_value=substr(order_id,instr(order_id,'_',1,1)+1,instr(order_id,'_',1,2)-instr(order_id,'_',1,1)-1)||substr(order_id,-1,1);

SELECT O.*,SUBSTR(ORDER_ID,INSTR(ORDER_ID,'_',1)+1 , INSTR(ORDER_ID,'_',1,2) - INSTR(ORDER_ID,'_',1,1)-1) || substr(order_id,-1,1)as extract_value from orders o;

--EXPECTED OUTPUT:-
--================
--ORDER_ID               ORDERDATE     EXTRACT_VALUE
--------------------   ---------     --------------
--ORDER_356125_PID1      12-MAY-03       3561251 
--ORDER_98032667_PID2    13-MAY-03       980326672

