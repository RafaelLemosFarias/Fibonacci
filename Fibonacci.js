function calcularFibonacci(n) {
    if (n <= 0) {
        return [];
    } else if (n === 1) {
        return [0];
    } else if (n === 2) {
        return [0, 1];
    }

    const fibonacci = [0, 1];
    for (let i = 2; i < n; i++) {
        const next = fibonacci[i - 1] + fibonacci[i - 2];
        fibonacci.push(next);
    }

    return fibonacci;
}

const numero = parseInt(prompt("Insira um número para calcular a sequência de Fibonacci:"));

if (isNaN(numero)) {
    console.log("Por favor, insira um número válido.");
} else {
    const resultado = calcularFibonacci(numero);
    console.log(`A sequência de Fibonacci até o ${numero}º termo é: ${resultado.join(', ')}`);
}
