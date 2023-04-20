<%@page import="uni9.calculadora.IMC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    float peso, altura, resultadoIMC;
    String classificacao;
    IMC imc = new IMC();
    
    peso = Float.parseFloat(request.getParameter("peso"));
    altura = Float.parseFloat(request.getParameter("altura"));
    
    resultadoIMC = imc.calcIMC(peso, altura);
    classificacao = imc.classificar(resultadoIMC);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC</title>
        
    </head>
    <body>
        
        <div class="card-imc">
            
            <h1>Calculadora IMC</h1>    
            <hr>
            
            <div class="resultado">
                <strong>Peso informado:</strong> <%= String.format("%.2f", peso) %> Kg
            </div>
            
            <div class="resultado">
                <strong>Altura informada:</strong> <%= String.format("%.2f" , altura) %> m
            </div>
            
            <div class="resultado">
                <strong>IMC:</strong> <%= String.format("%.2f", resultadoIMC) %>
            </div>
            
            <div class="resultado">
                <strong>Classificação:</strong> <%= classificacao %>
            </div>
            
            <a href="./">⇠ Calcular novamente</a>
        </div>
        
    </body>
</html>