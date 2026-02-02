DROP TABLE STUDENTS;

--1
CREATE TABLE STUDENTS(SID NUMBER, SNAME VARCHAR(20), MARKS NUMBER);
ALTER TABLE STUDENTS ADD (GRADE VARCHAR(20), DOB DATE);
DESC STUDENTS;

INSERT INTO STUDENTS VALUES (1,'SURYA', 82, 'B', '31-DEC-97');
INSERT INTO STUDENTS VALUES (2, 'KIRAN',20, 'F', '18-SEP-96');
INSERT INTO STUDENTS VALUES (3, 'ANUSHKA',98, 'A', '22-APR-98');
INSERT INTO STUDENTS VALUES (4, 'GOWTHAM',64, 'C', '06-JAN-95');
INSERT INTO STUDENTS VALUES (5, 'NITHISH', 45, 'D','12-MAR-96');

--2
ALTER TABLE STUDENTS ADD (EMAIL VARCHAR2(30));

--3
ALTER TABLE STUDENTS MODIFY SNAME VARCHAR2(20);

--4
ALTER TABLE STUDENTS DROP COLUMN GRADE;

--5
ALTER TABLE STUDENTS RENAME COLUMN SNAME TO NAME;

--6
DROP TABLE STUDENTS;

--7
FLASHBACK TABLE STUDENTS TO BEFORE DROP;

--8
RENAME STUDENTS TO STUDENTSDATA;

DESC STUDENTSDATA;

--9
CREATE TABLE AL(SNO NUMBER, SNAME VARCHAR2(10));
INSERT INTO AL VALUES (1 ,'SURYA');
INSERT INTO AL VALUES(2 , 'ANUSKHA');
COMMIT;

TRUNCATE TABLE AL;

SELECT * FROM AL;

--Practice Quries

--Write a query to display ENAME and monthly salary increased by 2000 with alias name as "UPDATED SAL".
SELECT ENAME,SAL + 2000 AS UPDATED_SAL FROM EMP ;

--Write a query to display ENAME, SAL and ANNUAL SALARY using alias "ANNUAL INCOME".
SELECT ENAME, SAL * 12 AS ANNUAL_INCOME FROM EMP;

--Write a query to display EMPNO, ENAME and daily salary (assume 30 days in a month).
SELECT EMPNO,ENAME,SAL FROM EMP;

--Write a query to display ENAME and EXPERIENCE IN YEARS using alias "EXP_YEARS".
SELECT ENAME, TRUNC((SYSDATE - HIREDATE)/365) AS EXP_YEARS FROM EMP;

--Write a query to display ENAME, SAL and salary after 15% hike with alias "NEW SALARY".
SELECT ENAME,SAL,SAL * 0.15 AS NEW_SALARY FROM EMP;

--Write a query to display SNO and TOTAL MARKS of students using alias "TOTAL".
SELECT SID,MARKS AS TOTAL FROM STUDENTS;

--Write a query to display SNO, TOTAL and AVERAGE marks using alias "AVG_MARKS".
SELECT * FROM STUDENTS;

--CASE
SELECT ENAME, SAL,
       CASE
         WHEN SAL < 3000 THEN 'LOW'
         WHEN SAL BETWEEN 3000 AND 6000 THEN 'MEDIUM'
         ELSE 'HIGH'
       END AS SALARY_RANGE
FROM EMP;


SELECT ENAME,
        CASE JOB
           WHEN 'CLERK' THEN 'STAFF'
           WHEN 'MANAGER' THEN 'ADMIN'
           WHEN 'SALESMAN' THEN 'SALESTAFF'
           ELSE 'EMPLOYEE'
        END AS DESIGNATION 
 FROM EMP;


 SELECT NAME,
           CASE MARKS
             WHEN 90 THEN 'A+'
             WHEN 80 THEN 'B+'
             WHEN 70 THEN 'C'
             WHEN 50 THEN 'D'
             ELSE 'NA'
             END AS GRADE 
  FROM STUDENTS;

--Write a query to display all employees sorted by ENAME in ascending order.
SELECT * FROM EMP ORDER BY ENAME ASC ;

--Write a query to display all employees sorted by salary in descending order.
SELECT * FROM EMP ORDER BY SAL DESC;

--Write a query to display employee details sorted by hiredate in ascending order.
SELECT * FROM EMP ORDER BY HIREDATE ASC;

--Write a query to display student details sorted by marks in descending order.
SELECT * FROM STUDENTS ORDER BY MARKS DESC;

--Write a query to display product details sorted by price in ascending order.
SELECT * FROM PRODUCT ORDER BY PRICE ASC;

--Write a query to display employees working as CLERK arranged by salary in ascending order.
SELECT * FROM EMP WHERE JOB IN 'CLERK' ORDER BY ENAME ASC;

--Write a query to display employees whose salary is greater than 3000 and arrange them by ENAME in descending order.
SELECT * FROM EMP WHERE SAL > 2000 ORDER BY ENAME DESC;

--Write a query to display employees belonging to department 10 arranged by hiredate.
SELECT * FROM EMP WHERE DEPTNO = 10 ORDER BY HIREDATE ;

--Write a query to display students who scored more than 60 marks and arrange them by marks in descending order.
SELECT * FROM STUDENTS WHERE MARKS > 60 ORDER BY MARKS DESC;

--Write a query to display employees working as MANAGER or ANALYST arranged by salary in descending order.
SELECT * FROM EMP WHERE JOB IN ('MANAGER','ANALYST') ORDER BY SAL DESC;

--Write a query to arrange employee list department wise ascending and salary wise descending within each department.
SELECT * FROM EMP ORDER BY DEPTNO ASC, SAL DESC;

--Write a query to arrange employee list job wise ascending and hiredate wise descending.
SELECT * FROM EMP ORDER BY JOB ASC, HIREDATE DESC;

--Write a query to arrange employees department wise descending and ENAME wise ascending.
SELECT * FROM EMP ORDER BY DEPTNO DESC, ENAME ASC;

--Write a query to arrange products category wise ascending and price wise descending.
SELECT * FROM PRODUCT ORDER BY CATEGORY ASC, PRICE DESC;

--Write a query to display employees sorted by COMM in ascending order, showing NULL values first.
SELECT * FROM EMP ORDER BY COMM ASC NULLS FIRST;

--Write a query to display employees sorted by COMM in descending order, showing NULL values last.
SELECT * FROM EMP ORDER BY COMM DESC NULLS LAST;

--Write a query to arrange employee list salary wise ascending and NULL salaries last.
SELECT * FROM EMP ORDER BY SAL ASC NULLS LAST;

--Write a query to sort employees using column alias in ORDER BY clause.
SELECT ENAME, SAL*12 AS ANNSAL FROM EMP ORDER BY ANNSAL;

--Write a query to demonstrate that column alias cannot be used in WHERE clause but can be used in ORDER BY.
-- Alias NOT allowed in WHERE, but allowed in ORDER BY
SELECT ENAME, SAL*12 AS ANNSAL
FROM EMP
--WHERE ANNSAL > 30000      -- ❌ INVALID (alias not allowed in WHERE)
ORDER BY ANNSAL;         -- ✅ VALID (alias allowed in ORDER BY)

--Write a query to display employees joined in 1981 and arrange them by ENAME.
SELECT * FROM EMP WHERE HIREDATE BETWEEN DATE '1981-01-01' AND DATE '1981-12-31' ORDER BY ENAME;

--Write a query to display employees working in IT department and arrange them by salary descending.
SELECT * FROM EMP WHERE JOB = 'SALESMAN' ORDER BY SAL DESC;

--Write a query to display employees sorted by second column in the SELECT list.
SELECT * FROM EMP ORDER BY 2;

--Write a query to display students sorted by third column using column position in ORDER BY.
SELECT * FROM EMP ORDER BY 3;

--Write a query to display distinct job names from the EMP table.
SELECT DISTINCT JOB FROM EMP;

--Write a query to display distinct department numbers from EMP table.
SELECT DISTINCT DEPTNO FROM EMP;

--Write a query to display distinct salaries from EMP table.
SELECT DISTINCT SAL FROM EMP;

--Write a query to display distinct job and deptno combinations from EMP table.
SELECT DISTINCT JOB,DEPTNO FROM EMP;

--Write a query to display distinct brands from PRODUCTS table.
SELECT DISTINCT CATEGORY FROM PRODUCT;

--Write a query to display distinct hire years from EMP table.  
SELECT DISTINCT HIREDATE FROM EMP;

--Write a query to display distinct salary values greater than 3000.
SELECT DISTINCT SAL FROM EMP WHERE SAL > 3000;

--Write a query to display first 5 rows from EMP table.
SELECT * FROM EMP FETCH FIRST 5 ROWS ONLY;

--Write a query to display top 3 highest paid employees.
SELECT * FROM EMP ORDER BY SAL DESC FETCH FIRST 3 ROWS ONLY;

--Write a query to display top 5 lowest paid employees.
SELECT * FROM EMP ORDER BY SAL ASC FETCH FIRST 5 ROWS ONLY;

--Write a query to display top 3 maximum salaries (without duplicates).
SELECT DISTINCT SAL FROM EMP ORDER BY SAL DESC FETCH FIRST 3 ROWS ONLY;

--Write a query to display 5th highest salary.
SELECT DISTINCT SAL 
FROM EMP 
ORDER BY SAL DESC 
OFFSET 4 ROWS FETCH NEXT 1 ROW ONLY;

--Write a query to display employees ranked from 4th row to 8th row.
SELECT DISTINCT SAL
FROM EMP
ORDER BY SAL ASC
OFFSET 4 ROWS FETCH NEXT 4 ROW ONLY;


--Write a query to display latest 5 joined employees.
SELECT *
FROM EMP
ORDER BY HIREDATE DESC
FETCH FIRST 5 ROWS ONLY;

--Write a query to display earliest 3 joined employees.
SELECT *
FROM EMP
ORDER BY HIREDATE ASC
FETCH FIRST 3 ROWS ONLY;

--Write a query to display top 5 employees based on experience.
SELECT * FROM EMP ORDER BY HIREDATE ASC FETCH FIRST 5 ROWS ONLY;

--Write a query to display 2nd highest salary employee.
SELECT * FROM EMP ORDER BY SAL DESC OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY;

--Write a query to display top 3 distinct salaries from EMP table.
SELECT DISTINCT SAL FROM EMP ORDER BY SAL DESC FETCH FIRST 3 ROWS ONLY;

--Write a query to display top 5 distinct departments from EMP table.
SELECT * FROM EMP ORDER BY DEPTNO DESC FETCH FIRST 5 ROWS ONLY;

--Write a query to display top 2 distinct job types sorted alphabetically.
SELECT * FROM EMP ORDER BY JOB ASC FETCH FIRST 2 ROWS ONLY;

--Write a query to display top 3 distinct salaries less than 5000.
SELECT * FROM EMP WHERE SAL < 5000 ORDER BY SAL DESC FETCH FIRST 3 ROWS ONLY;


--Write a query to update salary by 1000 for all employees.
UPDATE EMP SET SAL = SAL +1000;

--Write a query to update commission to 500 where commission is NULL.
UPDATE EMP SET COMM = 500;

--Write a query to set commission to NULL where commission is not NULL.
UPDATE EMP SET COMM = NULL WHERE COMM IS NOT NULL;

--Write a query to increase salary by 20% for SALESMAN.
UPDATE EMP SET SAL = SAL + (SAL *0.20) WHERE JOB = 'SALESMAN';

--Write a query to increase salary by 10% for employees joined in 1981.
UPDATE EMP SET SAL = SAL + (SAL * 0.10) WHERE HIREDATE BETWEEN DATE '1981-01-01' AND DATE '1981-12-31';

--Write a query to transfer employees from department 10 to 20.
UPDATE EMP SET DEPTNO = 20 WHERE DEPTNO = 10 ;

--Write a query to update salary and commission for a specific empno.
UPDATE EMP SET SAL = 2000, COMM = 500 WHERE EMPNO = 7369;
SELECT * FROM EMP;

--Write a query to increase salary based on department using CASE.
UPDATE EMP 
SET SAL = CASE DEPTNO 
                WHEN 10 THEN SAL + (SAL * 0.10)
                WHEN 20 THEN SAL + (SAL * 0.20)
                WHEN 30 THEN SAL + (SAL * 0.30)
                ELSE SAL + (SAL * 0.05)
              END;

--Write a query to swap jobs of two employees using CASE.
UPDATE EMP
SET JOB = CASE EMPNO
            WHEN 7369 THEN 'SALESMAN'
            WHEN 7499 THEN 'CLERK'
          END
WHERE EMPNO IN (7369, 7499);

-- SECTION–E : DELETE Command

--Write a query to delete all employees from EMP table.
DELETE FROM EMP;

--Write a query to delete employees having more than 10 years experience.
DELETE FROM EMP WHERE (SYSDATE - HIREDATE)/365 > 10;
ROLLBACK;
--Write a query to delete employees belonging to department 30.
DELETE FROM EMP WHERE DEPTNO = 30;

--Write a query to delete employees whose salary is less than 2000.
DELETE FROM EMP WHERE SAL < 2000;
ROLLBACK;



-- SECTION–F : FLASHBACK Queries

--Write a query to view EMP table data as it was 5 minutes ago.


--Write a query to view EMP table data as it was 10 minutes ago.

--Write a query to recover deleted data after COMMIT using FLASHBACK.

--Write a query to insert past data (5 minutes back) into current EMP table.

--Write a query to retrieve previous version of data using AS OF TIMESTAMP.