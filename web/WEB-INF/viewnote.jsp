<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 4:41:46 PM
    Author     : 789438
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <form method="post" action="/note">
        <h1>Simple Note Keeper</h1>
        <h1>${editing}</h1>
        <h2>View Note</h2>
        <input type="text" name="title" value="${title}">
        <input type="text" name="content" value="${content}">
        <h3>Title:</h3>
        
        <h3>Contents : ${Note.content}</h3>
        <br>
        <p></p>
        
        <a href="note?edit">edit</a>
    </body>
</html>
