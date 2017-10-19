# Test Case 3
Verantwoordelijke: **Jeffrey Verbeek**

## Doel
Het valideren dat zowel de controllers als de simulators dynamisch kunnen reageren op de gewijzigde statussen.

## Omschrijving
Er worden willekeurig autos bij stoplichten gegenereerd in de Simulator. De Simulator stuurt dit in TrafficUpdates naar de Controller toe. De Controller past de statussen van de stoplichten aan, zodat het verkeer veilig kan rijden en stuurt deze in een Lights arrays naar de Simulator. De Simulator stuurt bij iedere wijziging van traffic een TrafficUpdate en de controller blijft verkeerslichten aansturen.

Er worden in deze test-case dus nog **geen** fietsers, voetgangers, bussen of treinen getest.

## Voorbeelden
Bericht 1: Simulator -> Controller - Er staat 1 auto bij stoplicht 101.
```json
{
  "TrafficUpdate": {
    "LightId": 101,
    "Count": 1,
    "DirectionRequests": null
  }
}
```
Bericht 2: Simulator -> Controller - Er staan 2 auto's bij stoplicht 102.
```json
{
  "TrafficUpdate": {
    "LightId": 102,
    "Count": 2,
    "DirectionRequests": null
  }
}
```
Bericht 3: Controller -> Simulator - Stoplichten 101 en 102 gaan op groen. (Deze combinatie vormt geen gevaar)
```json
{
  "Lights": [
    {
      "Id": 101,
      "Status": 2
    },
    {
      "Id": 102,
      "Status": 2
    },
    {
      "Id": 103,
      "Status": 0
    },
    {
      "Id": 104,
      "Status": 0
    },
    {
      "Id": 105,
      "Status": 0
    },
    {
      "Id": 106,
      "Status": 0
    },
    {
      "Id": 107,
      "Status": 0
    },
    {
      "Id": 108,
      "Status": 0
    },
    {
      "Id": 109,
      "Status": 0
    },
    {
      "Id": 110,
      "Status": 0
    },
    {
      "Id": 201,
      "Status": 0
    },
    {
      "Id": 301,
      "Status": 0
    },
    {
      "Id": 302,
      "Status": 0
    },
    {
      "Id": 303,
      "Status": 0
    },
    {
      "Id": 304,
      "Status": 0
    },
    {
      "Id": 401,
      "Status": 0
    },
    {
      "Id": 402,
      "Status": 0
    },
    {
      "Id": 403,
      "Status": 0
    },
    {
      "Id": 404,
      "Status": 0
    },
    {
      "Id": 405,
      "Status": 0
    },
    {
      "Id": 406,
      "Status": 0
    },
    {
      "Id": 601,
      "Status": 0
    },
    {
      "Id": 602,
      "Status": 0
    },
    {
      "Id": 603,
      "Status": 0
    },
    {
      "Id": 604,
      "Status": 0
    }
  ]
}
```
Bericht 4: Simulator -> Controller - Er staan 0 auto's bij stoplicht 101.
```json
{
  "TrafficUpdate": {
    "LightId": 101,
    "Count": 0,
    "DirectionRequests": null
  }
}
```
Bericht 2: Simulator -> Controller - Er staan 0 auto's bij stoplicht 102.
```json
{
  "TrafficUpdate": {
    "LightId": 102,
    "Count": 0,
    "DirectionRequests": null
  }
}
```
Welke stoplichten worden gebruikt en de hoeveelheid auto's die bij een stoplicht staan mag de simulator bepalen.
Let op: de simulatie mag langer doorlopen dan 1 groep auto's, vergeet niet je lichten weer op rood te zetten wanneer er nieuw verkeer komt.

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
