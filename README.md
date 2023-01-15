# RetoTecnico-TrainingLeagues-Sofka
## Aplicacion web 🚀

**Importante: El proyecto se encuentra en la rama master**

En este reto se desarrolla una proyecto (aplicación web) a partir de una lectura, utilizando conceptos claves de programación orientada a objetos.

Aquí está el enlace de la lectura
https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales

Teniendo en cuenta el contexto anterior, se realiza lo siguiente: 📋
1. Extracción de atributos genéricos abstractos e interfaces identificadas en el artículo. Se crean las interfaces y clases abstractas convenientes según la lectura.
   
   **Se logró crear la interface interfaces.Misionable la cual contiene un metodo abstracto esta clase es 100% abstracta**
   **Se creó la clase Padre llamada NaveDTO como clase abstracta, para que apartir de allí se crearan los métodos abstractos**
   
3. Crear al menos dos comportamientos abstractos de una nave.
   **Se crearon los dos comportamientos abstractos en la Nave padre llamada models.NaveDTO**
   
5. Crear al menos cuatro tipos de naves diferentes con diferentes comportamientos, si es posible hacer una sobrecarga y una sobreescritura de métodos.
   
   **Se crearon 4 tipos de naves diferente, con diferentes comportamientos, se realizó sobrecarga y una sobre escritura**
    
    **Los 4 tipos de Naves son models.VehiculoLanzaderaDTO, models.NaveTripulada, models.NaveNoTripula, models.NaveRobotica hija de la clase NaveNoTripulada**
    
    **Se sobrecargó el metodo explorar de la NaveNoTripuladaDTO**
    
    ![image](https://user-images.githubusercontent.com/107648922/212519703-4bb279ca-bfdb-4d28-af69-fa965b461bfc.png)
    
    **Se sobreescribieron varios metodos heredados del padre**

7. Crear una clase principal que permita crear las naves de forma tal este bajo una condición booleana o por medio de una regla estipulada dentro de un switch-case o if-else.
   **Se creó una clase principal MainService donde se implementaron los métodos para crear un nave bajo un switch-case**
   
   ![image](https://user-images.githubusercontent.com/107648922/212519883-ff2c399a-8ede-4722-be56-134395405973.png)


## Diagrama UML 🧩
![Clase UML Estacion Espacial](https://user-images.githubusercontent.com/107648922/212518343-6a0690d6-656b-4641-bd1f-42a2ff8255fe.png)



## Herramientas usadas 🛠

Java Spring Boot - Lenguaje principal.

Thymeleaf - Motor de plantillas HTML.

Bootstrap - Librería de CSS.

PostgreSQL - Relational database management system.


## Arquitectura del sistema** 🏛

Se utilizó el Modelo-Vista-Controlador
![image](https://user-images.githubusercontent.com/107648922/212517874-83f0f90b-2a76-4443-a433-fdd60993bd51.png)

## Importante

**Para probar el proyecto, utilizarlo de forma local, con localhost:8080**

**postgres está en el puerto 5432**

**Para la implementación de conexion del Backend y Frontend se tuvieron inconvenientes con el Thymeleaf**

**El buscador en el Front es funcional debido al HTML**

![image](https://user-images.githubusercontent.com/107648922/212520950-a4b30ce6-48e8-45bb-884b-a19a2e88e5ca.png)




Autora ✒️

Jessica Andrea Lopez Obando - @JessiLopezObando



