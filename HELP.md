# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.tibaestiago.basic-project-springboot-aws' is invalid and this project uses 'com.tibaestiago.basicprojectspringbootaws' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.1/gradle-plugin/reference/html/#build-image)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)



#Rodar a aplicação no Docker:

docker run -it -p 8080:8080 --name base-project-spring-aws-container webstuff/base-project-spring-aws:1.0.5

#Explicação do comando 'docker run':
   O comando run irá subir um container com o nome (--name) base-project-spring-aws-container, 
baseado na imagem webstuff/base-project-spring-aws:1.0.5.  
   Esse container será executado na porta 8080, definido pelo mapeamento feito com o parâmetro -p.

Já o parâmetro -it, irá alocar um terminal para o container e tornará o processo interativo.

Agora você poderá acessar o endereço http://localhost:8080, 
no browser, e verificar a aplicação rodando. 