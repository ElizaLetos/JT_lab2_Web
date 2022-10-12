<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.secondlab.lab2tj.model.Word" %>
<%@ page import="com.secondlab.lab2tj.utils.FileOperations" %>
<!DOCTYPE html>
<%! FileOperations wordCategories = new FileOperations();%>
<% ArrayList<Word> words = wordCategories.getWordsFromFile(); %>
<% request.setAttribute("words", words);%>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Result</title>
    </head>
    <body>
        <div align="center">
            <h1>Table of words and sizes</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>Letters</th>
                        <th>Sizes</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="word" items="${words}">
                        <tr>
                            <td>${word.getLetters()}</td>
                            <td>${word.getSize()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
