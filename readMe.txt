ORM-object relational mapping
	*simplifies data creation,data manipulation,data acesss
	*maps objects to data stored in database
--------------------------------------------------------------------------------------
ORM TOOL
-Hibernate(implements specifications of JPA)
-ibatis
-toplink
--------------------------------------------------------------------------------------
Advantages of Hibernate
1.light weight & open source
2.database independent query
etc.....
----------------------------------------------------------------------------------
Persitance : concept of storing data (transient data)
------------------------------------------------------------------------------------------
JDBC,JNDI,JTA  one of them is used btw persistance obj & DB
--------------------------------------------------------------------------------------------------------
objects -tables -orm
	-> class structure same as table structure
	->objects represnt rows
-------------------------------------------------------------------------------------------------------------
The Hibernate architecture is categorized in four layers.

Java application layer
Hibernate framework layer
Backhand api layer
Database layer

SessionFactory
The SessionFactory is a factory of session and client of ConnectionProvider.

Session
The session object provides an interface between the application and data stored in the database.
It is a short-lived object and wraps the JDBC connection. It is factory of Transaction, Query and Criteria.
The org.hibernate.Session interface provides methods to insert, update and delete the object. It also provides factory methods for Transaction, Query and Criteria.

Transaction
The transaction object specifies the atomic unit of work. It is optional. The org.hibernate.Transaction interface provides methods for transaction management.

ConnectionProvider
It is a factory of JDBC connections. It abstracts the application from DriverManager or DataSource

TransactionFactory
It is a factory of Transaction
--------------------------------------------------------------------------------------------------------------------
Hibernate session
New state
Garbage state
garbage(); method of Hibernate 
Transient state
save (); method of Hibernate 
Persistence state
persist(); method of Hibernate 
Detached state
detach(); method of Hibernate 
Removed
remove (); method of Hibernate 
get(); method of Hibernate 
find(); method of Hibernate