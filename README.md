# dancing

### Run application:
First way: Intellij IDEA: Run 'Application.main()'

Second way:
```
mvn spring-boot:run
```

### Use application:

In browser: (for example)
```
localhost:8080/dp/2 0 7
```

### Use H2:
In browser:
```
localhost:8080/dp/h2
```

And insert:
```

Driver Class: org.h2.Driver

JDBC URL: jdbc:h2:file:~/h2/app_db

User Name: sa

Password:
```

Database navigation:

```
slelct * from competition;
```
