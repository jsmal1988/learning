Napisz metod�, kt�ra przyjmuje liczb� ca�kowit�. Wywo�anie metody powinno uruchomi� w�tek 0., wewn�trz tego w�tku powinien zosta� uruchomiony w�tek 1. W�tek 1. powinien uruchomi� w�tek 2. itd. do osi�gni�cia zadanej liczby w�tk�w. Ka�dy z w�tk�w powinien wypisa� na konsol� swoj� domy�ln� nazw�.

Na przyk�ad wywo�anie metody:

startNestedThreads(3);
Powinno sko�czy� si� uruchomieniem 3 w�tk�w i wypisaniem tekstu na konsol�:

Thread-0
Thread-1
Thread-2