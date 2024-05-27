<?php
    session_start();

    if(isset($_POST['usuario']) and isset($_POST['senha']))
    {
        if($_POST['usuario'] == 'Professor' and $_POST['senha'] == '12345')
        {
            $_SESSION['usuario'] = $_POST['usuario'];
            header('Location: clientes.php');
        }
    }

    if(isset($_GET['erro']))
    {
        $erro = "É necessário logar para acessar o sistema";
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <div style="background-color:coral; margin:10px">
        <?php 
            //Se tiver erro printa na tela, senão coloca vazio
            echo $erro ?? '';
        ?>
    </div>

    <form action="" method="post">
        <input type="text" name="usuario" placeholder="Usuário"><br><br>
        <input type="password" name="senha" placeholder="Digite sua senha"><br><br>
        <input type="submit" name="login" value="Login">
    </form>
</body>
</html>