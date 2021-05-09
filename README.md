# news

all viewers can view news , admin 'admin' only can add news (must login)

#instalation
schema name 
news_schema
change name and password in pro file 

#schema

CREATE DATABASE  IF NOT EXISTS news_schema;
USE news_schema;

DROP TABLE IF EXISTS news;

CREATE TABLE news (
  id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(45)  Not NULL,
  description varchar(300) Not NULL,
  image  mediumblob DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


#for log in 
your user name = 'admin'
your password = 'admin'

#api url
#all user can view news
http://localhost:8181/news/view/all

#spacific news can view
http://localhost:8181/news/view/id

#admin can do 

you should login with user name and password 'admin' to get token the token work only for '24 hour' :
http://localhost:8181/news/authenticate

when you put token in header
Authorization : Bearer 'token'

in body
form-data
file 'data type file' : and upload photo
news : {
"title":"" ,
"description":""
}

#add news (post)
http://localhost:8181/news/author/news

#delete news
http://localhost:8181/news/author/deleteNews/id


