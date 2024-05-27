<?php 
    session_start();

    echo "Esta é a página inicial, onde a sessão será criada";

    $_SESSION['aula'] = "Linguagem PHP";
    $_SESSION['data'] = date('d/m/Y');
    $_SESSION['hora'] = time();

    //Link para a página 02
    echo '<br><a href="apresentacaoDados.php">Clique para ir á página 02</a>';
?>