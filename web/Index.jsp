<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "Packcreatine.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="index.css" rel="stylesheet" type="type/css" media="screen">
        <title>Ajay's Doping Swag #creatine</title>
        <%  
            Creatine crea;
            
            crea = new Creatine();
            
            crea.voegtoevoedingswaarde();
            
             int i = 0;
            
            if(request.getParameter("submit") != null){
                i = Integer.parseInt(request.getParameter("pindakaas"));
            }
        %>
    </head>
    <body><center>
        <div id="wrapper">
            <h1>Ajay's Doping Swag #creatine</h1>
            <form action="#" method="get">
                <select name="pindakaas">
                    <option value="0">Potje 1</option>
                    <option value="1">Potje 2</option>
                    <option value="2">Potje 3</option>
                    
                </select>
                <input type="submit" name="submit" value="submit">
            </form>
            <%  if(request.getParameter("submit")!= null){ %>          
                <%= crea.getPotje(i) %>
                <%= crea.getPagina(i) %>
            <% } %>  
            
            <br />
        </div></center>
    </body>
</html>
