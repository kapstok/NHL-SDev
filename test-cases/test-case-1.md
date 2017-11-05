# Test Case 1
Verantwoordelijke: **Sietse Hoekstra**

## Doel
Het valideren van de implementatie van RabbitMQ

## Omschrijving
Een bericht wordt verzonden vanaf de simulator van `GROUP X` naar de controller van `GROUP Y` met als gevolg een response van de controller naar de simulator. Het eerste bericht heeft _"Simulator: `GROUP X ID`"_ als content en het tweede bericht (de response van de controller) _"Controller: `GROUP Y ID`"_.

De inhoud van de berichten is niet van belang voor het succes van de test, maar door het toevoegen van het groepsnummer kan er snel worden gezien of iedereen met de juiste groep is verbonden.

## Voorbeelden
### Bericht van simulator
`"Simulator: 5"`

### Response van controller
`"Controller: 6"`

## Testuitvoering
Er is tijdens de les 30 minuten beschikbaar voor het valideren van de test. Niet alle combinaties van controllers en simulators kunnen in die 30 minuten worden getest. Probeer als koppel je controller en simulator met zoveel mogelijk andere controllers en simulators te testen.

Rapporteer jouw resultaten direct na de les (in ieder geval dezelfde dag) aan de verantwoordelijke van deze test, zodat hij de resultaten in kaart kan brengen.

## Resultaten
| Koppel | Geslaagd Controller | Geslaagd Simulator | Opmerkingen |
| --- | --- | --- | --- |
| 1 | Ja | Ja | |
| 2 | Ja | Ja | |
| 3 | Nee | Nee | Te weinig restresultaten voor conclusie |
| 4 | Ja | Ja | |
| 5 | Ja | Ja | |
| 6 | Ja | Ja | |
| 7 | Ja | Ja | |
| 8 | Nee | Nee | 1 postief testresultaat voor Controller, Simulator geen testresultaten |
| 9 | Ja | Ja | |
| 10 | Ja | Nee | Geen resultaten voor simulator. Wel 2 positieve resultaten voor controller |
| 11 | Ja | Ja | |
| 12 | Ja | Ja | |
| 13 | Nee | Nee | Te weinig restresultaten voor conclusie |
| 14 | Nee | Nee | Geen testresultaten |
