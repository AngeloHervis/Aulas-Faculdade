import React, { useEffect, useState } from 'react';
import { Endereco } from '../../../models/Endereco';

function ConsultarCep() {
    const [caixaTexto, setCaixaTexto] = useState('');
    const [rua, setRua] = useState('');
    const [bairro, setBairro] = useState('');
    const [cidade, setCidade] = useState('');
    const [estado, setEstado] = useState('');

    //Evento de carremento do componente
    useEffect(() => {
        console.log("Executar algo ao carregar o componente...");
        //carregarCep();
    }, []);

    function carregarCep() {
        //FETCH ou AXIOS
        fetch("https://viacep.com.br/ws/" + caixaTexto + "/json/")
            .then((resposta) => resposta.json())
            .then((endereco: Endereco) => {
                setRua(endereco.logradouro);
                setBairro(endereco.bairro);
                setCidade(endereco.localidade);
                setEstado(endereco.uf);
            }).catch((erro) => {
                alert("CEP não encontrado");
            });
    }

    return (
        <div>
            <h1>Consultar CEP</h1>
            <input type="text" value={caixaTexto} onChange={(e) => setCaixaTexto(e.target.value)} />
            <button onClick={carregarCep}>Consultar</button>
            <br />
            <label>Rua: {rua}</label><br />
            <label>Bairro: {bairro}</label><br />
            <label>Cidade: {cidade}</label><br />
            <label>Estado: {estado}</label><br />
        </div>
    );
}

export default ConsultarCep;