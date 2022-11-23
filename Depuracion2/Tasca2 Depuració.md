# Tasca2: Depuració:
## 1. Explicad QUÈ FA EL MÈTODE MAIN:
###### El mètode main esta dividid en tres parts:

>Primera part: Es compon del tres constructor de Coche (c, c2 i c3), després s'importa random per a crear números aleatoris que els utilizarem per a definir la velocitat. El números aleatoris en guarden en les variables velocidad_nuevaX, aquests seran un número aleatori entre 0 i 80. Per últim, es guarda la velocitat en els objectes que hem creat utilitza'n la funció accelera.

![main1](Captures\main_1.png)

>Segona part: En un primer moment es fan dos sout, després es crida a la funció pinta tres vegades, una per cada objecte que hem creat.

![main2](Captures\main_2.png)

>Pinta: La funció pinta té dos bucles for que utilitzaran com a paràmetre la velocitat de l'objecte dividida entre deu. Aquests bucles tenen com a funció posar espais depenent de la velocitat, per exemple si la velocitat és 23 els espais seran dos perquè el bucle recorrerà des de 0 fins a 2.

![pinta](Captures\pinta.png)


>Frena: Deprès en torna a utilitzar les variables velocidad_nuevaX per a guardar un valor aleatori entre 0 i 100. Aquests valors s'utilitzaran amb la funcion frena per a disminuir la variable velocitat de l'objecte coche. La funció velocitat restara variable_nuevaX a variable velocitat de l'objecte, per últim si la variable velocitat és menor que 0 s'igualara a zero.

![Frena](Captures\frena.png)

>Tercera part: Per últim, tindrem dos sout i després es tornara a utilitzar la funció pinta per a cada objecte coche.


## 2. Posad un punt de ruptura (breakpoint) en la línia 27 del mètode main de la classe Principal i esbrineu els valors de les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3. Esbrineu també quines dades tenen en els seus paràmetres els cotxes amb variables c,c2 i c3.

###### Les variables velocitat tenen el valors

![](Captures\variables_velocitat.png)

Les variables velocitat tenen els valors |
------------ | -------------
velocidad_nueva1 | 15
velocidad_nueva2 | 11
velocidad_nueva3 | 61

Parametres dels cotxes |
------------ | -------------
c | ![](Captures\c.png)
c2 | ![](Captures\c2.png)
c3 | ![](Captures\c3.png)




## 3.  Posad un punt de ruptura (breakpoint) en la línia 46 del mètode main de la classe Principal i esbrineu els valors de les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3. Esbrineu també quines dades tenen en els seus paràmetres els cotxes amb variables c,c2 i c3.

![](Captures\variables_velocidad_2.png)

Les variables velocitat tenen els valors |
------------ | -------------
velocidad_nueva1 | 70
velocidad_nueva2 | 91
velocidad_nueva3 | 34

Parametres dels cotxes |
------------ | -------------
c | ![](Captures\c_1.png)
c2 | ![](Captures\c2_1.png)
c3 | ![](Captures\c3_1.png)