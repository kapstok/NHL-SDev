# Controller
Dit is een command line app, afsluiten met `Ctrl-C` (dit sluit netjes de verbinding).
Er is nog een bugje met de slagbomen, deze weet ik alleen niet te reproduceren.
Doen je slagbomen raar? Uitleg met terminal inhoud is gewaardeerd.

### Dependencies
- Java 1.8
- De rest van de dependencies zitten al in de .jar

### Argumenten
`-h <hostname>` - Host address (standaart `localhost`)  
`-v <vhost>` - Naam vhost (standaart `/4`)  
Bijv.: `java -jar controller.jar -v /1`
