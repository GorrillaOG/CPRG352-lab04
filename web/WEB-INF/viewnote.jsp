
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
     
         
        <h3>Title: ${note.title}</h3>
         <h3>Contents: ${note.contents}</h3>

            <p>  <a href="note?edit"> Edit</a></p>
            
          
    </body>
</html>
