{i}.@Entity annotation marks this class as an entity.
 	
 	1. if required any other table name
 			@Entity(name=<Table_name>)
 			[layer of entity class name, entity  name, table name]
 			


@Table annotation specifies the table name where data of this entity is to be persisted.
 If you don't use @Table annotation, hibernate will use the class name as the table name by default.

@Id annotation marks the identifier for this entity.

@Column annotation specifies the details of the column for this property or field. 
If @Column annotation is not specified, property name will be used as the column name by default. 

		1.if cloumn name to be changed 
			@Column(name=<col_name>)
@Transient
used to store Temperoray data
