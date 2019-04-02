## Sanastosovellus

Sovellus on tehty *Ohjelmistotekniikka*-kurssia varten.


Sovelluksen avulla käyttäjät pystyvät opettelemaan haluamiaan sanoja kahden kielen välillä. Käyttäjät pystyvät sekä lisäämään että poistamaan sanapareja tarpeen mukaan, ja vaihtamaan sanojen opettelusuuntaa. Sovellukseen kirjaudutaan käyttäjätunnuksen ja salasanan avulla. 


### Dokumentaatio
[Vaatimusmäärittely](https://github.com/riinaalisah/ot-harjoitustyo/blob/master/documentation/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/riinaalisah/ot-harjoitustyo/blob/master/documentation/tyoaikakirjanpito.md)


### Komentorivitoiminnot

#### Ohjelman suorittaminen

Ohjelman pystyy suorittamaan komennolla
```
mvn compile exec:java -Dexec.mainClass=sanastosovellus.ui.SanastosovellusUI
```

#### Testaus

Testit voidaan suorittaa komennolla 
```
mvn test
```

Testikattavuusraportti luodaan komennolla
```
mvn jacoco:report
```



