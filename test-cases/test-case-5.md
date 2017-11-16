# Test Case 5
Verantwoordelijke: **Jelmer Smid**

## Doel
Testen van de Speed en Time implementatie in de simulator en controller.

## Omschrijving
Voor de mensen die Time implementeren: 
- Er wordt een bericht gestuurd naar de controller dat er een fietser staat bij het stoplicht waar Time gedisplayed wordt. De controller past de status van het stoplicht aan stuurt in het bericht naast status ook de Time mee. Zie [Time] voor meer informatie over de Time property.

Voor de mensen die Speed implementeren: 
- De simulator stuur een bericht naar de controller met daarin de Speed. Als dit geimplementeerd is in de controller dient deze een bericht terug te sturen met daarin een bevestiging dat de Speed gezet is naar de aangevraagde snelheid. Indien dit niet geimplementeerd is in de controller wordt er geen bevestiging terug gestuurd en dient de snelheid niet te worden aangepast. Zie [Speed] voor meer informatie over het `Speed` bericht.

Willen simulatoren er voor zorgen dat er vast moeilijke situaties ontstaan in het verkeer? Dit kan simpelweg door veel verkeer te spawnen. Misschien is het een idee om geen treinen te spawnen voor deze test, aangezien de trein documentatie voor volgende week op de schop gaat. Als je treinen al in je programma hebt zitten mag je (van mij) gewoon treinen spawnen, als je nog geen treinen in je programma hebt zou ik dat niet deze week implementeren maar voor [test case 6].

## Voorbeelden

### Light voorbeeld:
(Let op: de `Lights` array bevat natuurlijk ALLE lichten, maar alleen lichten `301` en `302` bevatten nuttige `Time` values)
```json
{
  "Lights": [
    {
      "Id": 301,
      "Status": 0,
      "Time": 7.0
    },
    {
      "Id": 302,
      "Status": 0,
      "Time": 14.0
    }
  ]
}
```

### Speed voorbeeld:
Zet de snelheid op real-time:
```json
{
  "Speed": 1.0
}
```
Zet de snelheid op 5x real-time:
```json
{
  "Speed": 5.0
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

[Time]: </doc/Datauitwisseling/Controller%20naar%20Simulator.md>
[Speed]: </doc/Datauitwisseling/Simulatiesnelheid.md>
[test case 6]: </test-cases/test-case-6.md>
