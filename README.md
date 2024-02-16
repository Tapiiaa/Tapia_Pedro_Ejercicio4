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
#### DispositivoRed: Es la clase padre del programa, dado a que las clases Router y Switch heredan los atributos de la misma. La clase DispositivoRed contiene un constructor. 
#### Simulador: Esta clase contiene el main del programa, implementada con un método _identificarCuellosDeBotella_ (Contiene pseudocódigo).
--------------------------------------------------------------------------------
### Ejercicio 3
#### Enunciado: Implementar un sistema que analice datos de redes sociales (como Twitter o Facebook) para identificar tendencias actuales, temas populares o eventos emergentes. Utilizar técnicas de minería de datos y análisis de big data.
#### Pseudocódigo: función analizarTendencias(datos):
 tendencias = identificarTendencias(datos)
    para cada tendencia en tendencias:
        imprimir("Tendencia: ", tendencia)

datos = obtenerDatosRedesSociales()
analizarTendencias(datos)
#### Explicación: Creación de dos clases: Tendencias y AnalizadorDeTendencias
#### AnalizadorDeTendencias: Clase creada con un método _identificarTendencias_.
#### Tendencias: Se crea un objeto en esta clase de tipo AnalizadorDeTendencias. Posteriormente se aplica un for-each, imprimiendo las tendencias.

--------------------------------------------------------------------------------
### Ejercicio 5
#### Enunciado: Implementar un sistema de monitoreo ambiental utilizando dispositivos IoT (Internet de las Cosas). El sistema debe recolectar datos como temperatura, humedad y calidad del aire, y presentarlos en una interfaz de usuario para su análisis.
#### Pseudocódigo:
función monitorearAmbiente(dispositivos):
    datos = recolectarDatos(dispositivos)
    mostrarInterfazUsuario(datos)

dispositivos = obtenerDispositivosIoT()
monitorearAmbiente(dispositivos)
#### Explicación:
--------------------------------------------------------------------------------
### Ejercicio 6
#### Enunciado:Desarrollar un algoritmo que detecte posibles fraudes en transacciones financieras, utilizando técnicas de aprendizaje automático y análisis de patrones de comportamiento.
#### Pseudocódigo:
función detectarFraude(transacciones):
    para cada transacción en transacciones:
        si esFraudulenta(transacción):
            marcarComoFraudulenta(transacción)

transacciones = obtenerTransacciones()
detectarFraude(transacciones)
#### Explicación:
--------------------------------------------------------------------------------
### Ejercicio 7
#### Enunciado: Crear un programa que genere citas inspiradoras de forma aleatoria a partir de una base de datos de citas y autores. Permitir a los usuarios obtener una nueva cita cada vez que lo soliciten.
#### Pseudocódigo:
función generarCita():
    cita = obtenerCitaAleatoria()
    imprimir("Cita Inspiradora: ", cita)

mientras verdadero:
    generarCita()
    esperarSolicitudNuevaCita()
#### Explicación:
--------------------------------------------------------------------------------
### Ejercicio 9
#### Enunciado: Desarrollar un programa que valide si una expresión matemática introducida por el usuario es correcta en términos de sintaxis y paréntesis balanceados.
#### Pseudocódigo:
función validarExpresión(expresión):
    es_valida = comprobarSintaxis(expresión)
    si es_valida:
        imprimir("La expresión es válida")
    si no:
        imprimir("La expresión no es válida")

expresión = obtenerExpresiónUsuario()
validarExpresión(expresión)
#### Explicación:
--------------------------------------------------------------------------------
### Ejercicio 11
#### Enunciado: Desarrollar un programa que genere patrones artísticos en ASCII (como rectángulos, triángulos, rombos) basándose en la entrada del usuario y utilizando algoritmos de generación de patrones.
#### Pseudocódigo:
función generarPatrónASCII(tipo, tamaño, carácter):
    patrón = crearPatrón(tipo, tamaño, carácter)
    mostrarPatrón(patrón)

tipo = obtenerTipoPatrón()
tamaño = obtenerTamaño()
carácter = obtenerCarácter()
generarPatrónASCII(tipo, tamaño, carácter)
#### Explicación:
--------------------------------------------------------------------------------
