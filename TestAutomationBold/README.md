# Automatización DEMO-QA- Text Box

Este proyecto contiene el código fuente necesario para automatizar funcionalidad Text Box- Web pública https://demoqa.com/elements

# Se han usado los frameworks de:

- Selenium (Webdriver)
- Cucumber-BDD
- serenity-reports para la documentación
- Lenguaje de programación Java


# información en general del proyecto.

1- Proyecto construido por el gestor de dependencias Gradle.
2- Visualizar el feature que se definen para texbox
3- Dependencias en el Buid Gradle Utilizadas.

# mediante consola se puede ejecutar el proyecto gradle test aggregate generando el reporte de las pruebas en la carpeta targe/site/serenity/html.index que contiene la evidencia paso a paso de la las pruebas.

Example: ./gradlew clean test --tests bold.co.runners.RunnerTexBox.java* -i