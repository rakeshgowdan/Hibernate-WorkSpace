hibernate Example for Adding data for Existing table In a Database 
--------------------------------------------------------------------------------------------
Create the Persistent class
Create the mapping file for Persistent class
Create the Configuration file
Create the class that retrieves or stores the persistent object
Load the jar file
Run the first hibernate application
-------------------------------------------------------------------------------------------

The mapping file name conventionally, should be class_name.hbm.xml. There are many elements of the mapping file.

hibernate-mapping : It is the root element in the mapping file that contains all the mapping elements.
class : It is the sub-element of the hibernate-mapping element. It specifies the Persistent class.
id : It is the subelement of class. It specifies the primary key attribute in the class.
generator : It is the sub-element of id. It is used to generate the primary key. There are many generator classes such as assigned, increment, hilo, sequence, native etc. We will learn all the generator classes later.
property : It is the sub-element of class that specifies the property name of the Persistent class.