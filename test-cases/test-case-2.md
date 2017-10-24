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
Er is tijdens de les 30 minuten beschikbaar voor het valideren van de test. De eerste 5 minuten reserveren we voor het klaarzetten van het lokaal. We zetten de tafels neer in groepjes van 2. Bij het testen hebben de controllers een vaste plek en schuiven de simulatoren steeds door naar een andere tafel/controller. De combinaties zijn steeksproefgewijs.

De kolomnamen zijn de controllers en in het grid staat met welke simulator de controller getest wordt voor iedere ronde.

|  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 |
|-------|----|----|----|----|----|----|----|----|----|----|----|----|----|----|
| 08:35 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 |
| 08:38 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 |
| 08:41 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 |
| 08:44 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 |
| 08:47 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 |
| 08:50 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 |
| 08:53 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
| 08:56 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
| 08:59 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| 09:02 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
| 09:05 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 |
| 09:08 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 |
| 09:11 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 |


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
