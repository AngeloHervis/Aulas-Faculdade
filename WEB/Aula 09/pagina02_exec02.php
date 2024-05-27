<?php 
    session_start();

    echo "Os dados recebidos foram:<br><br>";
    echo "Nome: " . $_SESSION['nome'] . "<br>";
    echo "Sobrenome: " . $_SESSION['sobrenome'] . "<br>";
    echo "Estado Civil: " . $_SESSION['estadoCivil'] . "<br>";
    echo "Formação: " . $_SESSION['formacao'] . "<br>";

    session_destroy();
?>