<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>appgestaoterrenofrutas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <c:import url="/WEB-INF/jsp/menu.jsp"/>

        <div class="container-fluid mt-3">
            <h3>Listagem de Polpas:</h3>
            <h4><a href="/polpa/cadastro">Nova Polpa</a></h4>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Valor</th>
                        <th>Código</th>
                        <th>Congelado</th>
                        <th>Quantidade</th>
                        <th>Marca</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="f" items="${listaPolpa}">
                        <tr>
                            <td>${f.id}</td>
                            <td>${f.nome}</td>
                            <td>${f.valor}</td>
                            <td>${f.codigo}</td>
                            <td>${f.congelado}</td>
                            <td>${f.quantidade}</td>
                            <td>${f.marca}</td>
                            <td><a href="/polpa/${f.id}/excluir">excluir</a> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>