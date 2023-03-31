This Project is to Implement JWT (JSON WEB TOKEN) for token based authentication
i.e no concept of cookies and no server side scripting


when request first come to server, then server validates the token 
if token failed to validate request is rejected 

Spring Boot version - 2.5.2 
Spring Security using WebSecurityConfigurerAdapter version - 5.5.1
Database - None (Hard Coded Value Used for Practical purpose)


**************Token Curl request**************

curl --location 'http://localhost:9595/token' \
--header 'Content-Type: application/json' \
--data '{
"username" : "oggy",
"password" : "oggy123"
}'


**************Welcome Page request*****************

curl --location 'http://localhost:9595/welcome' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJvZ2d5IiwiZXhwIjoxNjgwMjkwNzUwLCJpYXQiOjE2ODAyODcxNTB9.mHfbJvRySUTQIGmc2lIzsinIN971vPBwpId-C6S0q78'

