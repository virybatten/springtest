El proyecto se realizó utilizando Maven, es necesario contar con el plugin de Maven 
en el Eclipse IDE for Java EE Developers.

Para importar el proyecto en Eclipse (En caso de descargar el ZIP):
	Dar clic derecho en el explorador de proyectos y seleccionar la opción Import/Existing Maven Projects
	Seleccionar el directorio donde se encuentra el proyecto a importar
	Presionar Next>
	En la nueva pantalla, presionar Finish
	
Para compilar y ejecutar el proyecto en Eclipse, se debe dar clic derecho sobre el proyecto 
seleccionar la opción "Run As", posteriormente "Run on Server", después seleccionar el servidor
Tomcat a utilizar (en mi caso utilicé la versión 8.5).

NOTA: Es importante configurar el archivo hibernate.cfg.xml (src/main/java/hibernate.cfg.xml) 
con los datos de la base de datos para poder realizar correctamente las consultas a Postgresql 

Una vez ejecutado y el servidor iniciado, se pueden realizar las siguientes pruebas desde el navegador:
(La base de datos cuenta con cuatro tablas, las cuales están identificadas como Employee# (# es un numero consecutivo))
 * descargar todos los registros de una tabla específica (http://localhost:8080/springtest/table/nombreDeTabla):			
			http://localhost:8080/springtest/table/Employee1
			http://localhost:8080/springtest/table/Employee2
			http://localhost:8080/springtest/table/Employee3
			http://localhost:8080/springtest/table/Employee4
			
 * descargar todos los registros de todas las tablas de la base de datos:
			http://localhost:8080/springtest/tables

 * descargar todos los registros de una tabla específica, indicando fecha (http://localhost:8080/springtest/table/nombreDeTabla/DD/MM/YYYY):
			http://localhost:8080/springtest/table/Employee1/19/10/2004

 * descargar todos los registros de todas las tablas, indicando fecha (http://localhost:8080/springtest/tables/DD/MM/YYYY):
			http://localhost:8080/springtest/tables/20/10/2004

 * descargar todos los registros de una tabla específica, indicando rango de fechas
	(http://localhost:8080/springtest/table/nombreDeTabla/DD/MM/YYYY/DD/MM/YYYY):
			http://localhost:8080/springtest/table/Employee2/19/10/2004/30/12/2015
			http://localhost:8080/springtest/table/Employee3/19/10/1900/30/12/2015
			http://localhost:8080/springtest/table/Employee1/19/10/1900/30/12/2017
			http://localhost:8080/springtest/table/Employee4/19/10/2013/30/12/2015

 * descargar todos los registros de todas las tablas, indicando rango de fechas
	(http://localhost:8080/springtest/tables/DD/MM/YYYY/DD/MM/YYYY):
			http://localhost:8080/springtest/tables/19/10/2013/30/12/2015
			http://localhost:8080/springtest/tables/19/10/1990/30/12/2015
  