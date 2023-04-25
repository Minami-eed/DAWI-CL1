# CASO LABORATORIO 1 
**Consideraciones generales:**
* **Se considerará el orden, la claridad de las respuestas y las buenas prácticas**.


* Las preguntas deben resolverse de acuerdo con los conceptos discutidos o analizados en clase. Para ello, aplicará su propio criterio para dar una solución a los problemas planteados.


* Para el desarrollo de la siguiente aplicación utilice los archivos proporcionados por el docente y cree el proyecto MAVEN con el nombre **DAWI_CL1_XXXX** (donde XXXX serán sus apellidos y nombres) cree la estructura de carpetas necesarias

|LOGRO DE LA EVALUACIÓN: |
| ------------------------| 
|Al término de la evaluación, el alumno implementa proceso de registro y listado de una tabla empleando JPA, realizando un correcto mapeado y una vista para su funcionalidad. | 

---
# PROBLEMA
La empresa **FDG COMPUTADORAS EIRL** lo tiene a Ud. como desarrollador y se le ha asignado la funcionalidad de **registro y consulta de Clientes**, para ello:

---
## PREGUNTA 1
* Mediante el uso de versiones con git **crea por lo menos 2 commit**.  Al iniciar y al finalizar el proyecto, agrega la información necesaria en cada uno.


* En el archivo pom.xml agrega las dependencias necesarias para el desarrollo


* Diseñe la base de datos **EC1_Apellido** y copia el código en un archivo *.txt* dentro de una carpeta del proyecto. 


* Dicha base de datos:


  * tabla **áreas** que servirá para generar un combo y guardar el área de trabajo de los clientes. Dicha tabla cuenta con: *id_area*, *nom_area* y *cant_clien_area*. Emplee los tipos de dato de que usted crea conveniente.


  * tabla **clientes** compuesta de: *id_cliente, nom_cliente, id_area* y 3 campos más de su elección. Emplee los tipos de dato de su preferencia.

* Ingrese 3 registros de prueba en cada tabla.
---
## PREGUNTA 2 - 3
Diseñe la GUI **APP-[TU APELLIDO]-REGISTRO** que permita **ingresar** los datos de los Clientes realizando validación de campos al pulsar el botón **registrar**:

* Realiza la validación del campo de *id_cliente* y 1 campo más de su elección.

* Para el ingreso del área, se debe mostrar mediante un combo que se obtiene con los datos de la tabla área.

* Si no hay problemas con los datos ingresados, **Mostrar un mensaje de registro exitoso** o error según corresponda.
---
## PREGUNTA 4
Diseñe la GUI **APP-[TU APELLIDO]-CONSULTA** que permita mostrar los datos del cliente y su **descripción del área**, según un criterio ingresado para la consulta
