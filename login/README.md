# README #

### SwaggerUrl
http://localhost:8080/demo/swagger-ui/index.html
- Nota: El nombre o el valor de "demo" está definido en el applicatio.properties


### Comando para incicar Spring-boot
```Unix
mvn spring-boot:run
```

### Subir cambios al repositorio

```GIT
git add .
git commit -m "mensaje personalizado"
git push origin [branch]
```

### Ejemplos GET MAPPING

```java
	@RequestMapping(value="/prueba2")
	public ResponseEntity<?> metodo2() {
		System.out.println("hola_mundo2");
		return new ResponseEntity<String>("Hola Chicas", HttpStatus.OK);
	}
	
	@RequestMapping(value="/getUser/{id}" , method=RequestMethod.GET)
	public ResponseEntity<Users> getUser(@PathVariable("id") long id) {
		System.out.println("search user");
		Users u = userService.findUser(id);
		return new ResponseEntity<Users>(u, HttpStatus.OK);
	}
```







This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact