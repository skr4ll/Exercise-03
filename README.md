# Hausaufgabe 3

Wenn eine Hausaufgabe aus mehreren Teilen besteht, dann sind die *ungefähr* nach Komplexität sortiert.
Die erste Aufgabe sollte für Sie auf jeden Fall gut lösbar sein. Wenn das nicht der Fall ist, 
habe ich entweder sehr schlecht erklärt oder Sie sollten den Stoff nochmal wiederholen.

Schreiben Sie innerhalb der Klasse `Exercise03` drei Funktionen.


## func1
Funktion `func1` soll einen `int`-Wert zurückgeben und zwei `double`-Werte als Argument nehmen. 
Innerhalb der Funktion werden die beiden Argumente miteinander multipliziert und dann durch sieben geteilt.


## dayOfYear
Die Funktion `dayOfYear` bekommt zwei `int`-Werte, die Tag und Monat eines Datums repräsentieren. Sie soll 
einen `float`-Wert zurückliefern, der angibt, wie groß der Anteil des Jahres ist, der schon vergangen ist.
Einige Beispiele:

```
dayOfYear(1,1);   // liefert 0.00277778
dayOfYear(15,7);  // liefert 0.54166667
dayOfYear(30,12); // liefert 1.0
```

Sie können der Einfachheit halber davon ausgehen, dass jeder Monat 30 Tage hat und ein Jahr also 360 Tage lang ist.


## isOdd

Die Funktion `isOdd` soll überprüfen ob eine Zahl ungerade ist. Ist sie das, gibt die 
Funktion `true` zurück, andernfalls `false`.

