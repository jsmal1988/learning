Napisz metodê, która przyjmuje liczbê ca³kowit¹. Wywo³anie metody powinno uruchomiæ w¹tek 0., wewn¹trz tego w¹tku powinien zostaæ uruchomiony w¹tek 1. W¹tek 1. powinien uruchomiæ w¹tek 2. itd. do osi¹gniêcia zadanej liczby w¹tków. Ka¿dy z w¹tków powinien wypisaæ na konsolê swoj¹ domyœln¹ nazwê.

Na przyk³ad wywo³anie metody:

startNestedThreads(3);
Powinno skoñczyæ siê uruchomieniem 3 w¹tków i wypisaniem tekstu na konsolê:

Thread-0
Thread-1
Thread-2