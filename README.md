# Java Client for the ChatGPT

<p align="center">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jjeanjacques10/chatgpt-java-client?color=FFCC00">
  <a href="https://github.com/jjeanjacques10/chatgpt-java-client/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jjeanjacques10/chatgpt-java-client?color=FFCC00">
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-FFCC00">
  <img alt="GitHub Pull Requests" src="https://img.shields.io/github/issues-pr/jjeanjacques10/chatgpt-java-client?color=FFCC00" />
  <a href="https://github.com/jjeanjacques10/chatgpt-java-client/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/jjeanjacques10/chatgpt-java-client?color=FFCC00&logo=github">
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
    <version>1.0.0</version>
</dependency>
```

## Usage

To use the Java client for the ChatGPT, you need to create an instance of the `ChatGpt` class and provide your
ChatGPT API Key (https://platform.openai.com/account/api-keys):

``` java
ChatGpt chatGPT = new ChatGpt("<your_api_key>");
```

## Support

If you encounter any issues or have any questions about this library,
please [open an issue on GitHub](https://github.com/jjeanjacques10/chatgpt/issues).

## License

This library is released under the [MIT License](LICENSE).