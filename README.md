# JT_lab2_Web

    Compulsory

Create a Web application containing:

input.jsp: a page containing a form for introducing some letters and a size.
result.jsp: a page describing the response in form of a table containing the words and the size given.

    Homework

Organize the application so it contains:

- an object-oriented domain model;
- a server-side component responsible with the business-logic of the application: writing the words to a file, reading data from a file (FileHandler, FileOperations)
- a server-side component responsible with controlling the web-flow.
- A web filter that will log all requests received by input.jsp. (LoggerFilter)
- A web filter that will decorate the response by adding a specific prelude (at the beginning) and a specific coda (at the end) to the generated HTML page. (DecoratorFilter)