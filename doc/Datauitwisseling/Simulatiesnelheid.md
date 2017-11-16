# Simulatiesnelheid
Bericht van de simulator naar de controller voor het aanpassen van de snelheid van de simulatie. De waarde 1.0 is real-time, oftewel 100% en de default waarde. De minimale waarde is 0.0, wat staat voor gepauzeerd. De maximale waarde is 100 en staat voor 100x real-time.

De controller stuurt een `Speed` bericht terug naar de simulator wanneer deze het eens is met de nieuwe snelheid. Als de simulator na het versturen van een `Speed` bericht dus geen reactie krijgt van de controller, mag de snelheid van de simulatie niet worden aangepast. Ook kan het zijn dat de controller wel reageert, maar met een andere waarde voor de snelheid. De simulator vraagt bijvoorbeeld om `"Speed": 10.0` maar de controller reageert met `"Speed": 8.0` omdat deze niet sneller kan. De uiteindelijke snelheid word dan dus `8.0`.

Dit is een optionele feature: Als de controller dit niet wil ondersteunen, reageert hij niet op het `Speed` bericht. Als de simulator dit niet will ondersteunen verzend hij nooit een `Speed` bericht.

## Berichtvoorbeelden
### Voorbeeld 1 – snelheid instellen op real-time (default)
```json
{
  "Speed": 1.0
}
```
### Voorbeeld 2 – pauzeren
```json
{
  "Speed": 0.0
}
```
### Voorbeeld 3 – snelheid instellen op de maximum snelheid van 100x real-time
```json
{
  "Speed": 100.0
}
```
### Voorbeeld 4 – snelheid instellen op 5x realtime
```json
{
  "Speed": 5.0
}
```
### Voorbeeld 5 – snelheid instellen op de helft van real-time
```json
{
  "Speed": 0.5
}
```
