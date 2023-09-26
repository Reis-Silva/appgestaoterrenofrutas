<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>appgestaoterrenofrutas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

        <div class="container-fluid mt-3">
            <h3>Cliente</h3>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>E-mail</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="c" items="${listaCliente}">
                    <tr>
                        <td>${c.nome}</td>
                        <td>${c.cpf}</td>
                        <td>${c.email}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>