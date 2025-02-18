# DOCUMENTACION ASO-SERVICE-PROJECT
## Introducción

En este documento se registran los datos que **durante el desarrollo del mismo** pueden ser relevantes con la finalidad de dar apoyo en la **comprensión de la toma deciciones** para el desarrollo de un servicio *api-REST (ASO)*.

## Consideraciones

- Al no ser un ejercicio funcional se hizo un mapeo muy sencillo para mantener una estructura de flujo **Facade -> Business -> DAO -> Facade**, tratando de simular un servicio real en la medida de lo posible.
- El ejercicio toma como base un ejercico de clase, por eso la carpeta mantiene el nombre **asoexample_first_service**.
- Los nombres de las clases e interfaces (**SrvHelloWorld y derivados**) fueron refactorizados (renombrados) según lo visto en clase para dar mejor entendimiento. Sin embargo, los problemas fueron demaciados y no fue posible solventalos. Por lo que se mantuvieron identicos a los manejados anteriormente.
- En un principio estaba pensado el uso de **mapstruct** para facilitar el mapeo y manejo de los datos a través del flujo del servicio. Pero por motivos de falta de manejo adecuado y muchas complicaciones, se optó por realizar un mapeo manual.

## Tecnologías
- **Docker** para el levantamiento de un contenedor que permite el manejo del entorno local-
- **PostMan** para el consumo de los servicios Http (POST)
- **Intellij** como gestor de códigos
- Plugin **lombok** para reducir el número de lineas de código y evitar la generación de getters y setters cada que se modificaran los *paraetros y objetos* contenidos dentro de los DTOS de enrtrada y salida
- Plugin **JetBrains AI Assistant** como apoyo para el desarrollo del servicio

