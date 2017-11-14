# Datauitwisseling – Controller naar Simulator
De controller stuurt informatie over de status van alle stoplichten naar de simulator wanneer één of meerdere stoplichten van status dient te veranderen.
## Databeschrijving
Array “Lights” met de volgende objecten:

| Naam | Beschrijving | Type |
| ------ | ------ | ------ | 
| Id | Id van verkeerslicht. Zie plattegrond voor de Id’s | integer |
| Status | Light status: zie beschrijving hieronder | integer |
| Time | Tijd in seconden voodat het licht op groen gaat | integer |
## Statussen
#### Auto, fiets, voetganger verkeerslicht (Id: 1xx & 3xx & 4xx)
| Status | Beschrijving |
| ------ | ------ |
| 0 | Stoppen (rood) |
| 1 | Stop indien mogelijk (oranje of -voor voetgangers- knipperend groen) |
| 2 | Doorrijden/lopen (groen) |
#### Bus verkeerslicht (Id: 2xx)
| Status | Beschrijving |
| ------ | ------ |
| 0 | Stoppen (rood) |
| 1 | Stop indien mogelijk (oranje) |
| 2 | Rechtdoor doorrijden |
| 3 | Linksaf doorrijden |
| 4 | Rechtsaf doorrijden |
| 5 | Linksaf + rechtdoor doorrijden |
| 6 | Rechtsaf + rechtdoor doorrijden |
| 7 | Linksaf + rechtsaf doorrijden |
| 8 | Alle richtingen doorrijden |
#### Spoorwegovergang (Id: 6xx)
| Status | Beschrijving |
| ------ | ------ |
| 0 | Stoppen (rood) |
| 2 | Doorrijden/lopen (groen) |

## Time property
- The `Time` property will be added to every object in the `Lights` array that the controller sends.
- The `Time` property is an integer.
- The value of `Time` must be `-1` if the `Id` of the object is not `3XX`.
- If the objects `Id` is `3XX` the value of `Time` may be a positive integer representing the time in seconds left before the light will go to green.
- If the objects `Id` is `3XX` the value of `Time` may be `-1` if the controller has not implemented this feature.
- If the simulator has not implemented this feature, it can ignore the `Time` property.
- The simulator keeps track of the time, it will count down the value by itself.
- The `Time` property can be updated with every message from the controller.

## Berichtvoorbeeld
```json
{
  "Lights": [
    {
      "Id": 101,
      "Status": 2,
      "Time": -1
    },
    {
      "Id": 102,
      "Status": 1,
      "Time": -1
    },
    {
      "Id": 103,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 104,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 105,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 106,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 107,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 108,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 109,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 110,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 201,
      "Status": 4,
      "Time": -1
    },
    {
      "Id": 301,
      "Status": 0,
      "Time": 7
    },
    {
      "Id": 302,
      "Status": 0,
      "Time": 14
    },
    {
      "Id": 303,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 304,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 305,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 401,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 402,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 403,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 404,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 405,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 406,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 601,
      "Status": 2,
      "Time": -1
    }
  ]
}

```
