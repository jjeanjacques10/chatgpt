# Java Client for the ChatGPT

<p align="center">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jjeanjacques10/chatgpt?color=0AAA00">
  <a href="https://github.com/jjeanjacques10/chatgpt/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jjeanjacques10/chatgpt?color=0AAA00">
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-0AAA00">
  <img alt="GitHub Pull Requests" src="https://img.shields.io/github/issues-pr/jjeanjacques10/chatgpt?color=0AAA00" />
  <a href="https://github.com/jjeanjacques10/chatgpt/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/jjeanjacques10/chatgpt?color=0AAA00&logo=github">
  </a>
  <a href="https://img.shields.io/maven-central/v/com.jjeanjacques/chatgpt">
    <img alt="Stargazers" src="https://img.shields.io/maven-central/v/com.jjeanjacques/chatgpt?color=0AAA00&logo=github">
  </a>
</p>

This is a Java library that provides a simple way to integrate with the ChatGPT API. ChatGPT is an API that provides a
conversational interface powered by GPT-3 to allow developers to build chatbots and conversational apps.

## Installation

To use this library in your Java project, you can download it from Maven Central. Add the following dependency to your
pom.xml file:

``` xml
<dependency>
    <groupId>com.jjeanjacques</groupId>
    <artifactId>chatgpt</artifactId>
    <version>1.0.1</version>
</dependency>
```

## Configuration

1. Set the property `chatgpt.apikey` in your `application.properties` file:

``` properties
chatgpt:
  apikey: <your_api_key>
```

2. Enable the `@EnableChatGpt` annotation in your Spring Boot application:

``` java
@SpringBootApplication
@EnableChatGpt
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

## Usage

To use the Java client for the ChatGPT, you need to create an instance of the `ChatGpt` class and provide your
ChatGPT API Key (<https://platform.openai.com/account/api-keys>):

``` java
ChatGpt chatGPT = new ChatGpt();
```

Example of a simple chat:

``` java
chatGPT.chat("Hello!").getChoices().stream()
                .forEach(r -> System.out.println(r.getMessage().getContent()));
// Hello there! How can I assist you today?
```

Example of image creation:

``` java
chatGPT.image("A cute dinosaur coding a software")
        .forEach(i -> System.out.println(i.getUrl()));
// https://oaidalleapiprodscus.blob.core.windows.net/private/org-QC0lwWtCkWNqeRzkUrYNkm1S/user-btJ8VtoIdwu85D1FG8P257jy/img-1QxpNWqFsRqEn7cOAC0uuZJV.png?st=2023-03-09T22%3A47%3A25Z&se=2023-03-10T00%3A47%3A25Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-03-09T19%3A40%3A03Z&ske=2023-03-10T19%3A40%3A03Z&sks=b&skv=2021-08-06&sig=1va/vGtJ7MJPMneuoPq8NbSF2UBOvDE5204uhnuHXfY%3D
// https://oaidalleapiprodscus.blob.core.windows.net/private/org-QC0lwWtCkWNqeRzkUrYNkm1S/user-btJ8VtoIdwu85D1FG8P257jy/img-jdNelbeJ5Elwl6tKcjt3vCyK.png?st=2023-03-08T00%3A26%3A52Z&se=2023-03-08T02%3A26%3A52Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-03-07T21%3A42%3A09Z&ske=2023-03-08T21%3A42%3A09Z&sks=b&skv=2021-08-06&sig=Q3IbxDFP4Pp1nf8fCmgxVW9CxCPA00E4TyIKrWpd8fM%3D
```

## Support

If you encounter any issues or have any questions about this library,
please [open an issue on GitHub](https://github.com/jjeanjacques10/chatgpt/issues).

## License

This library is released under the [MIT License](LICENSE).
