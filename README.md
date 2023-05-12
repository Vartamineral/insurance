<h2>The insurance web-application.</h2>

To run the app locally you should:
1. RUN "mvn clean package"
2. RUN "java -jar .\target\insurance-app.jar"
3. SWAGGER link - http://localhost:8080/swagger-ui.html
4. DB console link - http://localhost:8080/h2-console
   - JDBC URL - jdbc:h2:mem:testdb
   - User Name - sa
   - Password -


<h2>The task description.</h2>

Time estimation - 3-4 hours

Implement:
- Spring Boot micro-service written in Java
- Build with Maven
- Data will be stored in embeded H2 database
- micro-service will be able to run locally without any other external DB (etc.) dependencies
- provide source code to us preferably with link publicly available on the internet

Create endpoint for creation of Quotation.

Quotation has business attributes:
- beginingOfInsurance
- insuredAmount
- dateOfSigningMortgage
- Customer

Create endpoint for creation of Subscription.
Create endpoint for retrieving single Subscription object.

Subscription has business attributes:
- Quotation
- startDate
- validUntil


Create endpoint for updating Customer attributes.
Endpoint for updating Customer should be able to update and/or remove existing values of any/all attributes.

Customer has business attributes:
- firstName
- lastName
- middleName
- email
- phoneNumber
- birthDate


