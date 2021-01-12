# spring-auth-principal

With 2.4.1:

curl http://user:f2b12fe1-c221-46a9-8476-d8174093306a@127.0.0.1:8080/hello?what=hello
Principal is null!

Edit pom and change to boot to 2.3.7 and:

curl http://user:7e4e83e6-9863-441d-9538-e183219e0073@127.0.0.1:8080/hello?what=hello
user: hello

Take password from app startup log.