<?php 
    try{
        $pdo = new PDO('mysql:host=localhost; dbname=teste', 'root', 'fukuda');
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        //$pdo->exec("INSERT INTO teste.tab_usuario (nomeUsu, estadoCivil, cpf, profissao) VALUES ('José da Silva', 'Casado', 03322578911, 'Engenheiro')");

        //$sql = $pdo->prepare("INSERT INTO teste.tab_usuario (nomeUsu, estadoCivil, cpf, profissao) VALUES ('Felipe Nunes', 'Solteiro', 05544578900, 'Estudante')");
        //$sql->execute();

    }
    catch(PDOException $erro)
    {
        echo "ERRO =>" . $erro->getMessage();
    }
?>