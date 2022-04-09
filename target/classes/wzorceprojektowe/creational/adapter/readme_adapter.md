Tutaj jako przyk³ad mamy interfejs employee, ktory przechowuje nam informacje o u¿ytkowniku wyci¹gniêtym z bazy.

Problem jaki sie pojawia, to kiedy dodamy np LDAP albo CSV do wyci¹gania u¿ytkowników.

Jak mo¿na zobaczyæ, EmployeeLdap czy EmployeeCSV maj¹ inne pola ni¿ te które s¹ w EmployeeDB

Aby móc u¿ywaæ tych userów tak jak EmployeeDB potrzebujemy adaptera -> klasy która wezmie pola np z EmployeeLdap -> 
zaimplmenetuje wspólny interfejs Employee i na podsatwie obiektu EmployeeLdap wyci¹gnie pola które nas interesuj¹

Dziêki temu mo¿emy u¿yæ wspólnego interfejsu do wyœwietlenia pól w tej samej konwencji nazewniczej, mimo ¿e klasy maj¹ inne pola. 