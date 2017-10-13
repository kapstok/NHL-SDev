# Datauitwisseling – Controller naar Simulator
De controller stuurt informatie over de status van alle stoplichten naar de simulator wanneer één of meerdere stoplichten van status dient te veranderen.
## Databeschrijving
Array “Lights” met de volgende objecten:
| Naam | Beschrijving | Type |
| ------ | ------ | ------ | 
| Id | Id van verkeerslicht. Zie plattegrond voor de Id’s | integer |
| Status | Light status: zie beschrijving hieronder | integer |
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
| 5 | Alle richtingen doorrijden |
#### Spoorwegovergang (Id: 6xx)
| Status | Beschrijving |
| ------ | ------ |
| 0 | Stoppen (rood) |
| 2 | Doorrijden/lopen (groen) |
## Berichtvoorbeeld
```json
{
  "Lights": [
    {
      "Id": 101,
      "Status": 2
    },
    {
      "Id": 102,
      "Status": 1
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
      "Status": 4
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
      "Status": 2
    },
    {
      "Id": 602,
      "Status": 2
    },
    {
      "Id": 603,
      "Status": 2
    },
    {
      "Id": 604,
      "Status": 2
    }
  ]
}

```