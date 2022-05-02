<h1>ADAPTER</h1>

<h5>===POL===</h5>
Tutaj jako przyk³ad mamy interfejs employee, ktory przechowuje nam informacje o u¿ytkowniku wyci¹gniêtym z bazy.

Problem jaki sie pojawia, to kiedy dodamy np LDAP albo CSV do wyci¹gania u¿ytkowników.

Jak mo¿na zobaczyæ, EmployeeLdap czy EmployeeCSV maj¹ inne pola ni¿ te które s¹ w EmployeeDB

Aby móc u¿ywaæ tych userów tak jak EmployeeDB potrzebujemy adaptera -> klasy która wezmie pola np z EmployeeLdap -> 
zaimplmenetuje wspólny interfejs Employee i na podsatwie obiektu EmployeeLdap wyci¹gnie pola które nas interesuj¹

Dziêki temu mo¿emy u¿yæ wspólnego interfejsu do wyœwietlenia pól w tej samej konwencji nazewniczej, mimo ¿e klasy maj¹ inne pola. 

<h5>===ENG===</h5>
Here, as an example, we have an employee interface that stores us information about a user extracted from the database.

The problem that arises is when we add, for example, LDAP or CSV to extract users.

As you can see, EmployeeLdap or EmployeeCSV have different fields than those in EmployeeDB

To be able to use these users like EmployeeDB, we need an adapter -> a class that will take fields, e.g. from EmployeeLdap -> implements the common Employee interface and extracts the fields that interest us on the basis of the EmployeeLdap object

This allows us to use a common interface to display fields under the same naming convention, even though the classes have different fields.