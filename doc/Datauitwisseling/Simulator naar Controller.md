# Datauitwisseling – Simulator naar Controller
De simulator stuurt informatie over het verkeer bij het kruispunt door naar de controller.

## Databeschrijving
Object “Traffic” met de volgende data:

| Naam | Beschrijving | Type |
| ------ | ------ | ------ | 
| LightId | Id van verkeerslicht. Zie plattegrond voor de Id’s | integer |
| Count | Aantal voortuigen (auto’s, treinen, voetgangers, etc..) bij het verkeerslicht | integer |
| DirectionRequests | Verzoeken van bussen voor de richting van het stoplicht. Alleen gebruikt bij bussen. | Array van integers of null |

### DirectionRequests waarden
De mogelijke waarden in de array DirectionRequests. Alleen bedoeld voor bus-stoplichten. Gesorteerd op volgorde van de bussen; De eerste waarde is voor de bus vooraan bij het stoplicht.

| Status | Beschrijving |
| ------ | ------ |
| 2 | Rechtdoor |
| 3 | Linksaf |
| 4 | Rechtsaf |

Wanneer DirectionRequests geen waarden bevat dan moet deze, zoals ook in onderstaande voorbeelden, null zijn.
## Berichtvoorbeelden
### Voorbeeld 1 – drie autos bij verkeerslicht 104
```json
{
  "TrafficUpdate": {
    "LightId": 104,
    "Count": 3,
    "DirectionRequests": null
  }
}
```
### Voorbeeld 2 – één bus bij het bus-stoplicht die rechtsaf wil
```json
{
  "TrafficUpdate": {
    "LightId": 201,
    "Count": 1,
    "DirectionRequests": [
      4
    ]
  }
}
```
### Voorbeeld 3 – drie bussen bij het busstoplicht waarvan de eerst 2 rechtsaf willen en de achterste bus rechtdoor.
```json
{
  "TrafficUpdate": {
    "LightId": 201,
    "Count": 3,
    "DirectionRequests": [
      4,
      4,
      2
    ]
  }
}
```
### Voorbeeld 4 – geen bussen bij het bus-stoplicht
```json
{
  "TrafficUpdate": {
    "LightId": 201,
    "Count": 0,
    "DirectionRequests": null
  }
}
```
### Voorbeeld 5 – Trein in aantocht
```json
{
  "TrafficUpdate": {
    "LightId": 501,
    "Count": 1,
    "DirectionRequests": null
  }
}
```
