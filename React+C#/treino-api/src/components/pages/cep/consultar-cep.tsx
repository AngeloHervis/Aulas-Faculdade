import React, { useEffect, useState } from 'react';

function ConsultarCep() {
    const [caixaTexto, setCaixaTexto] = useState('');
    const [rua, setRua] = useState('');

    //Evento de carremento do componente
    useEffect(() => {
        console.log("Executar algo ao carregar o componente...");
        //carregarCep();
    }, []);

    function carregarCep() {
        //FETCH ou AXIOS
        fetch("https://viacep.com.br/ws/83810000/json/")
            .then((resposta) => resposta.json())
            .then((dados) => console.log(dados));
    }
}