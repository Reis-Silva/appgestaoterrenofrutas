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
    <h3>Listagem de Encomendas:</h3>
    <h4><a href="/encomenda/cadastro">Nova Encomenda</a></h4>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Valor</th>
            <th>Código</th>
            <th>Quantidade</th>
            <th>Data de Possível Entrega</th>
            <th>Informacões Extras</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="f" items="${listaEncomenda}">
            <tr>
                <td>${f.id}</td>
                <td>${f.nome}</td>
                <td>${f.valor}</td>
                <td>${f.codigo}</td>
                <td>${f.quantidade}</td>
                <td>${f.dataPossivelEntrega}</td>
                <td>${f.informacoesExtras}</td>
                <td><a href="/encomenda/${f.id}/excluir">excluir</a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>