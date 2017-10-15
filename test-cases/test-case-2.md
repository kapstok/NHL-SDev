# Test Case 2
Verantwoordelijke: **Erwin Damsma**

## Doel
Het valideren van de implementatie van de gemaakte afspraken in Datauitwisseling.

## Omschrijving
De simulator stuurt een trafficupdate naar de controller waarin staat dat er 1 auto staat bij verkeerslicht 101. De Controller stuurt vervolgens de array Lights, die in iedergeval stoplicht 101 op groen zet. 5 sconden later stuurt de simulator een nieuwe Trafficupdate waarin staat dat er geen auto's meer wachten bij verkeerslicht 101.

Let goed op dat je alle afspraken volgt zoals beschreven in:
[Datauitwisseling: Simulator naar Controller] en  
[Datauitwisseling: Controller naar Simulator]

## Voorbeelden
### Bericht 1: TrafficUpdate van Simulator
```json
{
  "TrafficUpdate": {
    "LightId": 101,
    "Count": 1,
    "DirectionRequests": null
  }
}
```

### Bericht 2: Lights van Controller
```json
{
  "Lights": [
    {
      "Id": 101,
      "Status": 2
    },
    {
      "Id": 102,
      "Status": 0
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

### Bericht 3: TrafficUpdate van Simulator
```json
{
  "TrafficUpdate": {
    "LightId": 101,
    "Count": 0,
    "DirectionRequests": null
  }
}
```

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

[Datauitwisseling: Simulator naar Controller]: </doc/Datauitwisseling/Simulator%20naar%20Controller.md>
[Datauitwisseling: Controller naar Simulator]: </doc/Datauitwisseling/Controller%20naar%20Simulator.md>
