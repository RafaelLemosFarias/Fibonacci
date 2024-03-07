def calcularFibonacci(n):
    if n <= 0:
        return []
    elif n == 1:
        return [0]
    elif n == 2:
        return [0, 1]

    fibonacci = [0, 1]
    for i in range(2, n):
        next_num = fibonacci[i - 1] + fibonacci[i - 2]
        fibonacci.append(next_num)

    return fibonacci

numero = int(input("Insira um número para calcular a sequência de Fibonacci: "))

if not isinstance(numero, int):
    print("Por favor, insira um número válido.")
else:
    resultado = calcularFibonacci(numero)
    print(f"A sequência de Fibonacci até o {numero}º termo é: {', '.join(map(str, resultado))}")
