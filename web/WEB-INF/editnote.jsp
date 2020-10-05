<%-- 
    Document   : editnote
    Created on : Oct 1, 2020, 4:42:10 PM
    Author     : 789438
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit the note</title>
    </head>
    <body>
        <form method="post" action="note"></form>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
    <lable>Title :</lable>
    <input type="text" name="title" value="">
    <br>
    <label>Contents :</label>
    <input type="textarea" name="content" value="">
    
    
    <input type="submit" value="submit"> 
    </body>
</html>
