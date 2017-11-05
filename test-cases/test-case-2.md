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
Er is tijdens de les 30 minuten beschikbaar voor het valideren van de test. De eerste 5 minuten reserveren we voor het klaarzetten van het lokaal. We zetten de tafels neer in groepjes van 2. Bij het testen hebben de controllers een vaste plek en schuiven de simulatoren steeds door naar een andere tafel/controller.

De kolomnamen zijn de controllers en in het grid staat met welke simulator de controller getest wordt voor iedere ronde.

|  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 |
|-------|----|----|----|----|----|----|----|----|----|----|----|----|----|----|
| 08:45 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 |
| 08:48 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 |
| 08:51 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 |
| 08:54 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 |
| 08:57 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 |
| 09:00 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 |
| 09:03 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
| 09:06 | 9 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
| 09:09 | 10 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| 09:12 | 11 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
| 09:15 | 12 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 |
| 09:18 | 13 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 |
| 09:21 | 14 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 |


Rapporteer jouw resultaten z.s.m. na de les aan de verantwoordelijke van deze test, zodat hij de resultaten in kaart kan brengen.

## Resultaten
| Koppel | Geslaagd Controller | Geslaagd Simulator | Opmerkingen |
| --- | --- | --- | --- |
| 1 | Nee | Nee | |
| 2 | Nee | Nee | |
| 3 | Nee | Nee | |
| 4 | Ja | Nee | Te weinig testresultaten voor simulator |
| 5 | Nee | Nee | Te weinig testresultaten |
| 6 | Nee | Ja | |
| 7 | Nee | Nee | |
| 8 | Nee | Nee | |
| 9 | - | - | Onduidelijk testresultaat, mogelijk geslaagd |
| 10 | Nee | Nee | |
| 11 | Nee | Nee | Te weinig testresultaten |
| 12 | Ja | Ja | |
| 13 | Ja | Nee | |
| 14 | Nee | Nee | |

Er waren een aantal problemen tijdens het testen, waardoor de test over het algemeen een negatief resultaat had. Een opsomming:
- Time To Live property niet (goed) geimplementeerd
- TrafficUpdate niet in een rootobject geplaatst met de naam TrafficUpdate.
- auto_delete niet op true bij queuedeclare

Doordat er veel problemen waren, en daarmee veel incompatibilteit tussen groepen, is het lastig om te bepalen welke groepen de test gehaald hebben, zoals bijvoorbeeld bij groep 9.

[Datauitwisseling: Simulator naar Controller]: </doc/Datauitwisseling/Simulator%20naar%20Controller.md>
[Datauitwisseling: Controller naar Simulator]: </doc/Datauitwisseling/Controller%20naar%20Simulator.md>
