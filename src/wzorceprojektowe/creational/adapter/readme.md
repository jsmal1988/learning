<h1>ADAPTER</h1>

<h5>===POL===</h5>
Tutaj jako przyk�ad mamy interfejs employee, ktory przechowuje nam informacje o u�ytkowniku wyci�gni�tym z bazy.

Problem jaki sie pojawia, to kiedy dodamy np LDAP albo CSV do wyci�gania u�ytkownik�w.

Jak mo�na zobaczy�, EmployeeLdap czy EmployeeCSV maj� inne pola ni� te kt�re s� w EmployeeDB

Aby m�c u�ywa� tych user�w tak jak EmployeeDB potrzebujemy adaptera -> klasy kt�ra wezmie pola np z EmployeeLdap -> 
zaimplmenetuje wsp�lny interfejs Employee i na podsatwie obiektu EmployeeLdap wyci�gnie pola kt�re nas interesuj�

Dzi�ki temu mo�emy u�y� wsp�lnego interfejsu do wy�wietlenia p�l w tej samej konwencji nazewniczej, mimo �e klasy maj� inne pola. 

<h5>===ENG===</h5>
Here, as an example, we have an employee interface that stores us information about a user extracted from the database.

The problem that arises is when we add, for example, LDAP or CSV to extract users.

As you can see, EmployeeLdap or EmployeeCSV have different fields than those in EmployeeDB

To be able to use these users like EmployeeDB, we need an adapter -> a class that will take fields, e.g. from EmployeeLdap -> implements the common Employee interface and extracts the fields that interest us on the basis of the EmployeeLdap object

This allows us to use a common interface to display fields under the same naming convention, even though the classes have different fields.