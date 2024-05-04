function insert (num) {
    var numero = document.getElementById('resultado').innerHTML;
    /* inner.html retorna todo o conteúdo HTML dentro do elemento, incluindo as tags, não apenas o texto.*/ 
    document.getElementById('resultado').innerHTML = numero + num;
}

function clean() {
    document.getElementById('resultado').innerHTML = '';
}

function back() {
    var resultado = document.getElementById('resultado').innerHTML;
    document.getElementById('resultado').innerHTML = resultado.substring(0, resultado.length - 1);
}

function calcular() {
    var resultado = document.getElementById('resultado').innerHTML;
    if (resultado) {
        /*O eval serve para calculos*/
        document.getElementById('resultado').innerHTML = eval(resultado);
    } else {
        document.getElementById('resultado').innerHTML = 'Nada...'
    }
}