Tutaj jako przyk�ad mamy interfejs employee, ktory przechowuje nam informacje o u�ytkowniku wyci�gni�tym z bazy.

Problem jaki sie pojawia, to kiedy dodamy np LDAP albo CSV do wyci�gania u�ytkownik�w.

Jak mo�na zobaczy�, EmployeeLdap czy EmployeeCSV maj� inne pola ni� te kt�re s� w EmployeeDB

Aby m�c u�ywa� tych user�w tak jak EmployeeDB potrzebujemy adaptera -> klasy kt�ra wezmie pola np z EmployeeLdap -> 
zaimplmenetuje wsp�lny interfejs Employee i na podsatwie obiektu EmployeeLdap wyci�gnie pola kt�re nas interesuj�

Dzi�ki temu mo�emy u�y� wsp�lnego interfejsu do wy�wietlenia p�l w tej samej konwencji nazewniczej, mimo �e klasy maj� inne pola. 