# Tarea 4 - Técnicas de Programación 
## Por Pedro Tapia
### Link a mi repositorio: https://github.com/Tapiiaa/Tapia_Pedro_Ejercicio4.git
--------------------------------------------------------------------------------
### Ejercicio 1
#### Enunciado: Desarrollar un algoritmo que procese un conjunto de comentarios (por ejemplo, reseñas de productos) y determine el sentimiento general (positivo, negativo, neutral) de cada comentario. Utilizar técnicas de procesamiento de lenguaje natural (NLP).
#### Pseudocódigo: 
función analizarComentarios(comentarios):
    para cada comentario en comentarios:
        sentimiento = determinarSentimiento(comentario)
        imprimir("Comentario: ", comentario, " - Sentimiento: ", sentimiento)

comentarios = obtenerComentarios()
analizarComentarios(comentarios)

#### Explicación: Para el ejercicio 1, hemos creado una clase "Analizador", donde implementamos una lista de comentarios, además de los méotodos **analizarComentarios** y **determinarSentimiento**.
--------------------------------------------------------------------------------
### Ejercicio 2
#### Enunciado: Crear un simulador de gestión de redes que permita a los usuarios diseñar y configurar una red de computadoras virtual, incluyendo routers, switches y otros dispositivos. El simulador debe permitir la simulación de tráfico de red y visualización de posibles cuellos de botella.
#### Pseudocódigo: función simularRed(configuración):
red = crearRed(configuración)
    tráfico = simularTráfico(red)
    cuellos_de_botella = identificarCuellosDeBotella(tráfico)
    mostrarResultados(cuellos_de_botella)

configuración = obtenerConfiguraciónUsuario()
simularRed(configuración)
#### Explicación: Para el ejercicio dos, hemos creado 5 clases: **DispositivoRed**,**Red**,**Router**,**Simulador** y **Switch**
**DispositivoRed**: Es la clase padre del programa, dado a que las clases Router y Switch heredan los atributos de la misma. La clase DispositivoRed contiene un constructor. 
**Simulador**: Esta clase contiene el main del programa, implementada con un método _identificarCuellosDeBotella_ (Contiene pseudocódigo).
--------------------------------------------------------------------------------

