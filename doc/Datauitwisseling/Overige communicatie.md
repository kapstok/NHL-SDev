# Datauitwisseling – Overige communicatie
In dit document worden extra afspraken beschreven over communicatie tussen de controller en simulator die niet betrekking hebben over de werking van de verkeerslichten of het verkeer.
## Simulatiesnelheid
Bericht van de simulator naar de controller voor het aanpassen van de snelheid van de simulatie. De waarde 1.0 is real-time, oftewel 100% en de default waarde. De minimale waarde is 0.0, wat staat voor gepauzeerd. De maximale waarde is 100 en staat voor 100x real-time.
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