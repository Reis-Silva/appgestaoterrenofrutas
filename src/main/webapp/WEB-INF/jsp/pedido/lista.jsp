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
        <c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

        <div class="container-fluid mt-3">
            <h3>Listagem de Pedidos:</h3>
            <h4><a href="/pedido">Novo Pedido</a></h4>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Descrição</th>
                        <th>Data</th>
                        <th>Web</th>
                        <th>Solicitante</th>
                        <th>Produtos</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="f" items="${listaPedido}">
                        <tr>
                            <td>${f.id}</td>
                            <td>${f.descricao}</td>
                            <td>${f.data}</td>
                            <td>${f.web}</td>
                            <td>${f.solicitante}</td>
                            <td>${f.produtos}</td>
                            <td><a href="/pedido/${f.id}/excluir">excluir</a> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>