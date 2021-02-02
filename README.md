### AnmatCloudERP

# Introduccion

El siguiente proyecto describe los artefactos necesarios para conectarsecon anmat produccion. 

# Instrucciones

Ya tiene el codigo de WSDL importado, con el plugin ``` jaxws-maven-plugin ``` el cual se corre con el comando ``` jaxws:wsimport ``` 
luego los jar necesarios para la compilacion y ejecucion del codigo se encuentran en 

Para comenzar a usar se debe instanciar la clase java Anmat y llamar al metodo connect, el cual devuelve un proxy con todos los mensajes que tiene el anmat. 

Ej:
``` 
Anmat miAnmat = new Anmat();
IWebServicePortType proxy = miAnmat.connect();
proxy.sendMedicamentos(crearMedicamento(), "pruebaws", "Clave1234"); 
```


Proyecto produccion de CloudERP
