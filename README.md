# The Summer 2019
<h3><i>My Spring boot learning in the summer 2019</i></h3>
<h6>#Modules which i researched</h6>
<ul>
    <li>Spring boot web</li>
    <li>Spring data jpa (MySql)</li>
    <li>Spring hibernate module</li>
    <li>Spring data mongodb (Mongodb)</li>
    <li>Spring security</li>
    <li>Spring task schedule</li>
    <li>Spring thymeleaf template engine</li>
    <li>Spring thymeleaf layout</li>
    <li>Spring email sending (running thread in queue, velocity template)</li>
    <li>Java project lombok</li>
</ul>

<h6>#Setting plugins</h6>
<p>
Project lombok:<br>
Intellij: https://projectlombok.org/setup/intellij<br>
Eclipse, Spring Tools Suite: https://projectlombok.org/setup/eclipse 
</p>

<h6>#Start mogodb server</h6>
<p>
cd E:\MongoDB\Server\4.0\bin (ignore this step if you created the mongodb's environment variable)<br>
mongod --dbpath your_db_location or mongod<br>
example: mongod --dppath E:\MongoDB\Data
</p>

<h6>#Application properties</h6>
<p>
#email<br>
spring.mail.username=your_email_address<br>
spring.mail.password=your_email_password
<br>#mysql<br>
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useUnicode=yes&characterEncoding=UTF-8
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
<br>#mongodb<br>
spring.data.mongodb.host=localhost<br>
spring.data.mongodb.port=27017<br>
spring.data.mongodb.database=your_database_name<br>
</p>

<h6>#fix port already use problem</h6>
<p>
change port: server.port=8081 => server.port=another_port<br>
if after port changing, still get error: open task manager and kill JavaTM program
</p>

<h6>#Tips for using Intellij Idea IDE</h6>
<h6>#Tips for using Eclipse IDE</h6>