<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>AppPedido</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-3">
            <h2>Cadastramento de Bebidas</h2>

            <form action="/fruta/incluir" method="post">

                <c:import url="/WEB-INF/jsp/produto/cadastro.jsp"/>

                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="congelado" value="true" checked>
                    <label class="form-check-label">Gelada</label>
                </div>

                <div class="mb-3 mt-3">
                    <label for="quantidade">Tamanho:</label>
                    <input type="text" class="form-control" value="99" id="quantidade" placeholder="Entre com a Quantidade" name="tamanho">
                </div>

                <div class="mb-3 mt-3">
                    <label for="marca">Marca:</label>
                    <input type="text" class="form-control" value="Marca" id="marca" placeholder="Entre com a sua Marca" name="marca">
                </div>

                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>