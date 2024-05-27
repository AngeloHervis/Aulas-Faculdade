<?php 
    $senha = "@teste";
    $senha_cripto = password_hash($senha, PASSWORD_DEFAULT);
    echo $senha_cripto;
    echo "<hr>";

    if(password_verify('@teste', $senha_cripto))
    {
        echo "senha confere";
    }
    else
    {
        echo "senha não confere";
    }
?>