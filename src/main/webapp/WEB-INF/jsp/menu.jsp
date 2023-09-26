<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page  language="java"  contentType="text/html; UTF-8" pageEncoding="utf-8" %>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">appgestaoterrenofrutas</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/cliente/lista">Cliente</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/produto/lista">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/polpa/lista">Liquidos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/fruta/lista">Fruta</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/encomenda/lista">Encomendas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/pedido/lista">Pedido</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
