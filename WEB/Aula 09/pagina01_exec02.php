<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        if(isset($_REQUEST['valor']) and $_REQUEST['valor'] == 'enviado')
        {
            session_start();
            $_SESSION['nome'] = $_POST['FunciNome'];
            $_SESSION['sobrenome'] = $_POST['FunciSobrenome'];
            $_SESSION['estadoCivil'] = $_POST['FunciEstadoCivil'];
            $_SESSION['formacao'] = $_POST['FunciFormacao'];

            echo "<a href='pagina02_exec02.php'>Ir para página 2</a>";
        }
        else
        {
    ?>

    <form method="POST" action="pagina01_exec02.php?valor=enviado">
        Digite seu nome:
        <input type="text" name="FunciNome"><br><br>
        Digite seu sobrenome:
        <input type="text" name="FunciSobrenome"><br><br>
        Informe seu estado civil:
        <input type="text" name="FunciEstadoCivil"><br><br>
        Informe sua formação:
        <input type="text" name="FunciFormacao"><br><br>
        <input type="submit" value="Enviar">
    </form>
    <?php
    }
    ?>
</body>
</html>