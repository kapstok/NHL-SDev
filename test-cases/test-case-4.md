# Test Case 4
Verantwoordelijke: **Jan Allersma**

## Doel
Simulator en controller om kunnen laten gaan met alle verskeerssituaties die zich voor kunnen doen. Denk bijvoorbeeld aan wegen waarbij auto's keuze hebben uit twee richtingen.

## Omschrijving
Er wordt willekeurig verkeer (auto's, fietsers, voetgangers, bussen, treinen) bij stoplichten gegenereerd in de Simulator. De Simulator stuurt dit in TrafficUpdates naar de Controller toe. De Controller past de statussen van de stoplichten aan, zodat het verkeer veilig kan rijden en stuurt deze in een Lights arrays naar de Simulator. De Simulator stuurt bij iedere wijziging van traffic een TrafficUpdate en de controller blijft verkeerslichten aansturen.

## Voorbeelden
Bericht 1: Simulator -> Controller - Er is een auto die naar rechts wil rijden (en dus niet rechtdoor).
```json
{
  "TrafficUpdate": {
    "LightId": 106,
    "Count": 1,
    "DirectionRequests": [
        4
    ]
  }
}
```
Bericht 2: Controller stuurt huidige verkeerssituatie als JSON naar Simulator.

Bericht 3: Simulator -> Controller - Twee bussen staan voor een stoplicht. De ene wil rechtdoor, de andere rechtsaf.
```json
{
  "TrafficUpdate": {
    "LightId": 201,
    "Count": 2,
    "DirectionRequests": [
        2,
        4
    ]
  }
}
```

Bericht 4: Controller stuurt huidige verkeerssituatie als JSON naar Simulator.

Bericht 5: Simulator -> Controller - Een trein van links wil het spoor over.
```json
{
  "TrafficUpdate": {
    "LightId": 501,
    "Count": 1,
    "DirectionRequests": null
  }
}
```
Bericht 6: Controller stuurt huidige verkeerssituatie als JSON naar Simulator.

Bericht 7, 8 en 9: Simulator -> Controller - Er staan 0 voertuigen bij verkeerslichten waar voorheen wel voertuigen stonden.
```json
{
  "TrafficUpdate": {
    "LightId": 106,
    "Count": 0,
    "DirectionRequests": null
  }
}
```
```json
{
  "TrafficUpdate": {
    "LightId": 501,
    "Count": 0,
    "DirectionRequests": null
  }
}
```
```json
{
  "TrafficUpdate": {
    "LightId": 201,
    "Count": 0,
    "DirectionRequests": null
  }
}
```
Bericht 10: Controller stuurt huidige verkeerssituatie als JSON naar Simulator.

## Testuitvoering
Er is tijdens de les 30 minuten beschikbaar voor het valideren van de test. Niet alle combinaties van controllers en simulators kunnen in die 30 minuten worden getest. Probeer als koppel je controller en simulator met zoveel mogelijk andere controllers en simulators te testen.

Rapporteer jouw resultaten z.s.m. na de les aan de verantwoordelijke van deze test, zodat hij de resultaten in kaart kan brengen.

## Resultaten
| Koppel | Resultaat | Opmerkingen |
| --- | --- | --- |
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |
| 5 | | |
| 6 | | |
| 7 | | |
| 8 | | |
| 9 | | |
| 10 | | |
| 11 | | |
| 12 | | |
| 13 | | |
| 14 | | |
