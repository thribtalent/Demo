CREATE TABLE user(
	id IDENTITY,
	name VARCHAR(50),
	number VARCHAR(255),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id) 
);
