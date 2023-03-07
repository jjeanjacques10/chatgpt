# Java Client for the ChatGPT

This is a Java library that provides a simple way to integrate with the ChatGPT API. ChatGPT is an API that provides a
conversational interface powered by GPT-3 to allow developers to build chatbots and conversational apps.

## Installation

To use this library in your Java project, you can download it from Maven Central. Add the following dependency to your
pom.xml file:

``` xml
<dependency>
    <groupId>com.jjeanjacques</groupId>
    <artifactId>chatgpt-java-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

To use the Java client for the ChatGPT, you need to create an instance of the `ChatGPT` class and provide your
ChatGPT API Key (https://platform.openai.com/account/api-keys):

``` java
ChatGPT chatGPT = new ChatGPT("<your_api_key>");
```

## Support

If you encounter any issues or have any questions about this library,
please [open an issue on GitHub](https://github.com/jjeanjacques10/chatgpt-java-client/issues).

## License

This library is released under the [MIT License](LICENSE).