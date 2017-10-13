# PlatteGrond #
![<MISSING: Plattegrond.png>](https://i.imgur.com/YCgOZhR.png)  
  

----------

# Plattegrond met routes #
![<MISSING: Plattegrond_With_Routes.png>](https://i.imgur.com/XvRjB3d.png)  
  
----------
# ID Nummering / Legenda #
|**Soort licht**|**Nummers**|**Kleur baan**|
| ------------- |:---------:| ------------:|
| Auto          | 100       | Grijs        |
| Bus           | 200       | Groen        |
| Fiets         | 300       | Oranje       |
| Voetgangers   | 400       | Lichtgrijs   |
| Trein         | 500       | Bruin        |
| Slagbomen     | 600       |              |  
  
Zwarte stippellijnen geven een verkeerslicht weer.
Rode stippellijnen geven slagbomen voor het spoor weer.
  
----------

### Nog belangrijk: ###
-	Vanuit het noorden komen twee banen die allebei linksaf kunnen. Deze banen delen een verkeerslicht. Dit is alleen belangrijk voor de simulatie. In principe kunnen verschillende simulaties of één of twee banen hier modelleren, dit maakt voor de controller niks uit. (Al moet er wel met Jos gecheckt worden of er van de situatie afgeweken mag)
-	Vanuit het zuiden komt een baan van waar auto’s zowel rechtdoor als rechtsaf kunnen. Deze baan heeft een enkel verkeerslicht (omdat het maar één baan is), wat betekent dat de auto’s voor deze beide richtingen altijd tegelijkertijd uitrijden.
-	Fietsers met id=304 kunnen allen oversteken van zuid naar noord.
-	Er is één buslijn, waaruit de bus rechtdoor of rechtsaf kan.
-	bij het spoor voor voetgangers en fietsers. Vanuit het zuiden worden auto’s al tegengehouden door het stoplicht. Vanuit de andere banen naar het zuiden toe zal het stoplicht niet op groen gaan als er een trein aankomt. Voor de voetgangers en fietsers hoort er dan nog een ‘stoplicht’ in de vorm van vier slagbomen te komen, in het diagram aangegeven als 601. Deze gaan altijd op hetzelfde moment open en dicht, dus kunnen samen aangestuurd worden onder id 601.
