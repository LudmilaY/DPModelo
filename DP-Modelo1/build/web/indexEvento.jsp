<%-- 
    Document   : indexEvento
    Created on : 14/04/2016, 17:41:53
    Author     : Ludmila
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>DP-Modelo Evento</title>
    </head>
    <body>

    <h1>Cadastro de Eventos</h1>
    <form action="FrontController?action=GravarEvento" method="post">
      Entre com a descrição do evento
      <input type="text" name="textDescricao"/><br/>
      Entre com a data do evento
      <input type="text" name="textData"/><br/>
      Entre com o contato do evento
      <input type="text" name="textContato"/><br/>
      <input type="submit"/><br/><br/>
      <a href="index.jsp">Voltar</a><br/>
    </form>
    <%--
    This example uses JSTL, uncomment the taglib directive above.
    To test, display the page like this: index.jsp?sayHello=true&name=Murphy
    --%>
    <%--
    <c:if test="${param.sayHello}">
        <!-- Let's welcome the user ${param.name} -->
        Hello ${param.name}!
    </c:if>
    --%>
    
    </body>
</html>
