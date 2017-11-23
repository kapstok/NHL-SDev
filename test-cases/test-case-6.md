# Test Case 6
Verantwoordelijke: **Jeffrey Verbeek**

## Doel
Het toevoegen van 6 nieuwe stoplichten op de oversteekplaatsen van voetgangers en het volledig toevoegen van treinen.

## Omschrijving
### Nieuwe voetgangers stoplichten
Er worden 6 nieuwe stoplichten toegevoegd op oversteekplaatsen voor voetgangers in het noorden, westen en oosten. Alle huidige `ID`'s van stoplichten blijfen hetzelfde er worden alleen nieuwe stoplichten tussen de weghelften geplaatst. Deze nieuwe `ID`'s worden: `407`, `408`, `409`, `410`, `411` en `412`. Voor de exacte locatie van alle stoplichten, zie de nieuwe [plattegrond]. De situatie voor fietsers blijft hetzelfde, fietsers gaan in één keer naar de overkant en stoppen nooit tussen twee weghelften.

### Nieuwe situatie treinen
- De slagbomen (`ID: 601`) blijft ongewijzigd. De simulator verzendt nooit een `TrafficUpdate` voor `601`, deze wordt alleen door de controller meegestuurd in de `Lights` array om de slagboom open of dicht te doen.
- De "sensor" die `ID: 501` was wordt nu een stoplicht voor de treinen vanaf het station Leeuwarden. Dit licht staat standaard op rood, dus als de simulator een trein bij het station spawnt moet de controller 501 op groen zetten voor de trein mag rijden. De simulator kan dus gewoon een `TrafficUpdate` voor 501 verzenden om een trein te spawnen. Dit licht word nu dus ook toegevoegd aan de `Lights` array vanuit de controller.
- Er wordt een nieuwe "sensor" geplaatst aan de oostkant van de spoorweg, deze krijgt `ID: 502`. **Dit is dus GEEN stoplicht.** De simulator verzendt een `TrafficUpdate` naar de controller met dit `ID` wanneer er een trein vanuit het oosten komt. __Belangrijk: aangezien deze trein niet gestopt kan worden voordat hij bij het station is, is er dus geen stoplicht voor, en zit dit `ID` dus ook NIET in de `Lights` array van de controller.__ Treinen vanuit het oosten rijden in één keer door naar het station. De `TrafficUpdate` voor `ID: 502` wordt **20 seconden** van te voren gegeven om de controller genoeg tijd te geven de spoorwegovergang te sluiten en ervoor te zorgen dat er geen treinen vanaf het station zich nog op de spoorwerovergang bevinden.

Dus samengevat: De simulator verzendt `TrafficUpdate`s naar de controller voor `ID`'s `501` en `502`, en de controller stuurt alleen het stoplicht bij het station (`501`) en de slagbomen (`601`) aan (En uiteraard de rest van het kruispunt).

### De nieuwe plattegrond
![Plattegrond](/doc/Plattegrond/extra/PlattegrondV5.png)

### Timing
De trein uit Groningen moet eerder een `TrafficUpdate` sturen om rekening te houden met de snelheid van de trein en het feit dat deze trein niet gestopt mag worden. Ook moet er genoeg tijd zijn om ervoor te zorgen dat, wanneer er net een trein vanuit Leeuwarden is vertrokken, deze van de spoorwegovergang af is voordat de trein uit Groningen bij de spoorwegovergang aankomt. Wat er aan de oostkant buiten ons scherm gebeurt vind ik buiten de scope van onze opdracht.

| Tijd (totaal) | Tijd (per stap) | Beschrijving 501 |
| --- | --- | --- |
| 0 | | De simulator stuurt een `TrafficUpdate` dat er een trein staat bij `501` |
| | 3 | Ontruimingstijd van het kruispunt |
| 3 | | De controller stuurt dat de slagbomen dicht moeten. (`601` gaat op rood) |
| | 5 | Ontruimingstijd van de spoorwegovergang, de bellen luiden en lichten knipperen |
| 8 | | De slagbomen beginnen met dalen |
| | 12 | Animatie van het dalen |
| 20 | | De slagbomen zijn dicht. Als er geen treinen vanaf 502 komen zet de controller `501` op groen |
| | 20 | Ontruimingstijd voor de trein |
| 40 | | Simulator stuurt een `TrafficUpdate` dat er 0 treinen staan bij `501`. Als er geen andere treinen aankomen zet de controller `601` op groen |
| | 12 | Animatie openen van de slagbomen |
| 52 | | Slagbomen zijn open, controller stuurt alle stoplichten weer aan |

| Tijd (totaal) | Tijd (per stap) | Beschrijving 502 |
| --- | --- | --- |
| 0 | | De simulator stuurt een `TrafficUpdate` dat er een trein langs sensor `502` gaat |
| | 3 | Ontruimingstijd van het kruispunt |
| 3 | | De controller stuurt dat de slagbomen dicht moeten. (`601` gaat op rood) |
| | 5 | Ontruimingstijd van de spoorwegovergang, de bellen luiden en lichten knipperen |
| 8 | | De slagbomen beginnen met dalen |
| | 12 | Animatie van het dalen |
| 20 | | De slagbomen zijn dicht. De trein komt in beeld |
| | 20 | Ontruimingstijd voor de trein |
| 40 | | Simulator stuurt een `TrafficUpdate` dat er 0 treinen zijn bij `502`. Als er geen andere treinen aankomen zet de controller `601` op groen |
| | 12 | Animatie openen van de slagbomen |
| 52 | | Slagbomen zijn open, controller stuurt alle stoplichten weer aan |

## Voorbeelden
De nieuwe structuur van de `Lights` array:
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
      "Id": 407,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 408,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 409,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 410,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 411,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 412,
      "Status": 0,
      "Time": -1
    },
    {
      "Id": 501,
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

**Voor treinen zijn er 4 situaties:**

Er komen geen treinen aan, niet van links en niet van rechts:
- De slagbomen zijn open (`groen` / `2`)
- Treinen mogen niet vertrekken vanaf het station (`rood` / `0`)

Er komt een trein vanaf het station Leeuwarden:
- De simulator stuurt een `TrafficUpdate` naar de controller dat er een trein staat bij 501
- De controller zorgt ervoor dat de spoorwegovergang leeg wordt gemaakt
- De controller laat de slagbomen dalen (`rood` / `0`)
- De controller zet licht 501 op `groen` / `2`, de trein gaat rijden
- Wanneer de trein volledig over de spoorwegovergang is, gaan de slagbomen weer open (`groen` / `2`)

Er komt een trein vanaf station Groningen:
- De simulator stuurt 20 seconden van tevoren een `TrafficUpdate` naar de controller dat er een trein over de sensor 502 is gereden
- De controller maakt de spoorwegovergang leeg, sluit de slagbomen, zorgt ervoor dat het licht `501` op rood blijft zodat daar geen trein kan vertrekken, etc.
- Na de 20 seconden laat de simulator de trein zien in de simulatie
- Wanneer de trein de spoorwegovergang heeft verlaten, en er komen verder geen treinen aan, gaan de slagbomen weer open (`groen` / `2`)
- Eventueel wachtende treinen vanuit Leeuwarden kunnen nu vertrekken volgens de bovenstaande situatie als er verder niks uit Groningen komt

Er komen treinen van beide kanten:
- Er komt een `TrafficUpdate` dat er een trein staat bij het station (`501`)
- De controller sluit de spoorwegovergang, bla bla bla...
- `501` gaat op groen, de trein gaat rijden
- Direct hierna komt er ineens een trein vanaf `502`
    - Om deze reden moeten `TrafficUpdates` van `502` 20 seconden van tevoren worden gegeven
    - Er is nu genoeg tijd om de trein vanaf `501` de spoorwegovergang te laten oversteken
- De controller zet het licht `501` direct weer op `rood`, maar de trein was al vertrokken en blijft gewoon rijden
- De trein vanaf `501` heeft de spoorwegovergang gepaseert
- De slagbomen (`601`) bijft gesloten (`rood` / `0`)
- Na de `20` seconden komt de trein vanaf `502` in beeld
- De trein vanaf `502` heeft de spoorwegovergang volledig overgestoken
- De controller zet de de slagbomen weer open (`groen` / `2`)

## Testuitvoering
Wil iedereen voor zichzelf bijhouden met welke controllers/simulators hij heeft getest en wat de resultaten waren van deze test. Vervolgens vraag ik jullie de resultaten zelf in te vullen in de [spreadsheet] of de resultaten naar direct naar mij te sturen op Discord (dat is `@Jeffrey#9810`).

[plattegrond]: </doc/Plattegrond/README.md>
[spreadsheet]: <https://docs.google.com/spreadsheets/d/13h4-0Jm8kxli5NU8hVcNvMFXr5GHP8Ov3YPk-tpytnE/edit#gid=504097516>