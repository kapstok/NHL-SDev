# Test Case 4
Verantwoordelijke: **Jan Allersma**

## Doel
Simulator en controller om kunnen laten gaan met alle verskeerssituaties die zich voor kunnen doen. Denk bijvoorbeeld aan wegen waarbij auto's keuze hebben uit twee richtingen.

## Omschrijving
Er wordt willekeurig verkeer (auto's, fietsers, voetgangers, bussen, treinen) bij stoplichten gegenereerd in de Simulator. De Simulator stuurt dit in TrafficUpdates naar de Controller toe. De Controller past de statussen van de stoplichten aan, zodat het verkeer veilig kan rijden en stuurt deze in een Lights arrays naar de Simulator. De Simulator stuurt bij iedere wijziging van traffic een TrafficUpdate en de controller blijft verkeerslichten aansturen.
Het willekeurige verkeer wordt door de simulator gegenereerd middels random variabeles. Je kunt bijvoorbeeld (een equivalent van) ``` Math.Random() % AmountOfLights``` gebruiken.

## Voorbeelden
Bericht 1: Simulator -> Controller
```json
{
  "TrafficUpdate": {
    "LightId": <Random Light Id hier>,
    "Count": <Random getal tussen 1-3 hier>,
    "DirectionRequests": null
  }
}
```
Bericht 2: Controller stuurt huidige verkeerssituatie als JSON naar Simulator.

Bericht 3: Een ander random JSON object dan bij bericht 1.

Bericht 4: Controller stuurt huidige verkeerssituatie als JSON naar Simulator.

etc...

## Nog even dit...
Wellicht een onnodige opmerking, maar **implementeer de time nog niet!** Het kan zijn dat andermans programma dit niet kan handlen, waardoor we onnodige problemen krijgen tijdens het testen.

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
