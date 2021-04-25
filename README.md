# MaAssignment

To start the web application, open the "application.properties" file and replace the value of "spring.datasource.url" property with a connection string pointing to your local Microsoft SQL Server. Important: do not provide a database name in your connection string! You can find the "application.properties" file under src/main/resources/ directory.

The SQL scripts can be found under src/main/resources/ directory as well. "schema.sql" contains DDL code and "data.sql" contains the DML one (just some mocked data).

There is no need to manually create a database or schema before starting the application first time, it will be done automatically. 

Note that each time when you start the application, the app will attempt to recreate the SQL Table and rewrite test data. If you wish to stop this behaviour, you should change the value of "spring.datasource.initialization-mode" property to "never". This property is also located in application.properties file mentioned above.