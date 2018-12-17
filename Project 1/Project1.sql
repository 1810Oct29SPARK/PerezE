CREATE TABLE EMPLOYEE (
    EMPLOYEE_ID INTEGER PRIMARY KEY NOT NULL,
    EMPLOYEE_TYPE_ID INTEGER NOT NULL, --FOREIGN KEY
    FIRSTNAME VARCHAR2(30) NOT NULL,
    LASTNAME VARCHAR2(30) NOT NULL,
    EMAIL VARCHAR2(30) NOT NULL
);
/
CREATE TABLE REIMBURSEMENT (
    REIMBURSEMENT_ID INTEGER PRIMARY KEY NOT NULL,
    EMPLOYEE_ID INTEGER NOT NULL, --FOREIGN KEY
    REIMBURSEMENT_CATEGORY VARCHAR2(30) NOT NULL,
    AMOUNT NUMBER NOT NULL,
    STATUS VARCHAR2(30) NOT NULL,
    APPROVED_BY VARCHAR2(30) NOT NULL,
    DATE_SUBMITTED DATE NOT NULL,
    PICTURE BLOB
);
/
CREATE TABLE LOGIN (
    LOGIN_ID INTEGER PRIMARY KEY NOT NULL,
    EMPLOYEE_ID INTEGER NOT NULL, --FOREIGN KEY
    USERNAME VARCHAR2(30) NOT NULL,
    EMPLOYEE_PASSWORD VARCHAR2(30) NOT NULL
);
/
CREATE TABLE EMPLOYEE_TYPE (
    EMPLOYEE_TYPE_ID INTEGER PRIMARY KEY NOT NULL,
    EMP_TYPE VARCHAR2(30) NOT NULL
);
/
CREATE SEQUENCE SQ_EMPLOYEE_PK
START WITH 1
INCREMENT BY 1;
/
CREATE OR REPLACE TRIGGER TR_INSERT_EMPLOYEE
BEFORE INSERT ON EMPLOYEE --SPECIFY WHICH DML OPERATION, BEFORE/AFTER, AND WHICH TABLE
FOR EACH ROW
BEGIN
    SELECT SQ_EMPLOYEE_PK.NEXTVAL INTO :NEW.EMPLOYEE_ID FROM DUAL;
END;
/
CREATE SEQUENCE SQ_REIMBURSEMENT_PK
START WITH 1
INCREMENT BY 1;
/
CREATE OR REPLACE TRIGGER TR_INSERT_REIMBURSEMENT
BEFORE INSERT ON REIMBURSEMENT --SPECIFY WHICH DML OPERATION, BEFORE/AFTER, AND WHICH TABLE
FOR EACH ROW
BEGIN
    SELECT SQ_REIMBURSEMENT_PK.NEXTVAL INTO :NEW.REIMBURSEMENT_ID FROM DUAL;
END;
/
CREATE SEQUENCE SQ_LOGIN_PK
START WITH 1
INCREMENT BY 1;
/
CREATE OR REPLACE TRIGGER TR_INSERT_LOGIN
BEFORE INSERT ON LOGIN --SPECIFY WHICH DML OPERATION, BEFORE/AFTER, AND WHICH TABLE
FOR EACH ROW
BEGIN
    SELECT SQ_LOGIN_PK.NEXTVAL INTO :NEW.LOGIN_ID FROM DUAL;
END;
/
INSERT ALL 
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(1, 'John', 'Doe', 'Jdoe66@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(1, 'Mike', 'Smith', 'Msmith@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(2, 'Kelly', 'Parra', 'Kparra@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(1, 'Bob', 'Dillan', 'Bdillan@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(3, 'Devin', 'Huahn', 'Dhuahn@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(1, 'George', 'Davis', 'Gdavis10@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(4, 'Kevin', 'Johnson', 'Kjohnson77@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(2, 'Shelly', 'Wilson', 'Swilson99@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(2, 'Jeremy', 'Bjerke', 'Bjerke@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(3, 'Alexandria', 'Ducket', 'Aducket23@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(1, 'Roger', 'Douglas', 'Rdouglas@gmail.com')
INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES(1, 'Varsha', 'Kumar', 'Vkumar8@gmail.com')
SELECT * FROM DUAL; --DUAL IS A DUMMY TABLE 
/
INSERT ALL 
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(1, 'BRASS', 150.95, 'PENDING', 'JOHN', TO_DATE('12-2-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(2, 'STRING', 300, 'PENDING', 'BILL', TO_DATE('12-12-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(3, 'WOODWINDS', 25.67, 'APPROVED', 'JOHN', TO_DATE('12-8-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(4, 'PRECUSSION  ', 170.38, 'PENDING', 'BILL', TO_DATE('12-6-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(5, 'STRING', 500, 'APPROVED', 'BILL', TO_DATE('12-6-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(6, 'BRASS', 37.89, 'PENDING', 'JOHN', TO_DATE('12-12-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(7, 'WOODWIND', 27.61, 'PENDING', 'MARY', TO_DATE('12-6-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(8, 'PRECUSSION', 132.75, 'APPROVED', 'JOHN', TO_DATE('12-4-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(9, 'OFFICE SUPPLIES', 420, 'APPROVED', 'JOHN', TO_DATE('12-2-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(10, 'PRECUSSION', 666.69, 'PENDING', 'JOHN', TO_DATE('12-2-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(11, 'STRING', 21.55, 'APPROVED', 'MARY', TO_DATE('12-13-2018', 'MM-DD-YYYY'))
INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED)
VALUES(12, 'WOODWIND', 99.98, 'PENDING', 'MARY', TO_DATE('12-15-2018', 'MM-DD-YYYY'))
SELECT * FROM DUAL; --DUAL IS A DUMMY TABLE 
/
INSERT ALL 
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(1, 'John', 'EasyPassword123')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(2, 'Mikeyboi', 'Password69')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(3, 'Kikuri76', 'Sword7391')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(4, 'Bobyboy55', 'Notpassword') -- CHANGE THESE
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(5, 'DHuahn', 'MyPassword1')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(6, 'Gdavis42', 'Pwd321')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(7, 'Kjohnson', 'Bearlover')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(8, 'Swilson', 'Squeen21')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(9, 'Bjohns', 'Baconlover66')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(10, 'Aducket', 'Waterbucket')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(11, 'Rdouglas', 'Notagoodpass')
INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD)
VALUES(12, 'Mbrown38', 'H4ck3r')
SELECT * FROM DUAL; --DUAL IS A DUMMY TABLE 
/
INSERT ALL 
INTO EMPLOYEE_TYPE(EMPLOYEE_TYPE_ID, EMP_TYPE)
VALUES(1, 'EMPLOYEE')
INTO EMPLOYEE_TYPE(EMPLOYEE_TYPE_ID, EMP_TYPE)
VALUES(2, 'MANAGER1')
INTO EMPLOYEE_TYPE(EMPLOYEE_TYPE_ID, EMP_TYPE)
VALUES(3, 'MANAGER2')
INTO EMPLOYEE_TYPE(EMPLOYEE_TYPE_ID, EMP_TYPE)
VALUES(4, 'MANAGER3')
SELECT * FROM DUAL; --DUAL IS A DUMMY TABLE 
/
ALTER TABLE REIMBURSEMENT 
ADD CONSTRAINT FK_REIMBURSEMENT_EMPLOYEE
FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID);
/
ALTER TABLE LOGIN 
ADD CONSTRAINT FK_LOGIN_EMPLOYEE
FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID);
/
ALTER TABLE EMPLOYEE
ADD CONSTRAINT FK_EMPLOYEE_EMPLOYEE_TYPE
FOREIGN KEY (EMPLOYEE_TYPE_ID) REFERENCES EMPLOYEE_TYPE(EMPLOYEE_TYPE_ID);
/
INSERT INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL)
VALUES (3, 'Billy', 'Bob', 'Bdog8@gmail.com');
/
UPDATE EMPLOYEE
SET FIRSTNAME = 'Bobby', LASTNAME = 'McDouglas', EMAIL = 'Jontrich@gmail.com'
WHERE EMPLOYEE_ID = 13;
/
INSERT INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD) VALUES(21, 'Shibelover', '123pass');