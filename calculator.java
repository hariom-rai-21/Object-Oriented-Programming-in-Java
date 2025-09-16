def calculator(num1, num2, operator):
    match operator:
        case '+':
            return num1 + num2
        case '-':
            return num1 - num2
        case '*':
            return num1 * num2
        case '/':
            return num1 / num2 if num2 != 0 else 'Error: Division by zero'
        case _:
            return 'Invalid operator'

# Taking input from user
n1 = float(input("Enter first number: "))
n2 = float(input("Enter second number: "))
op = input("Enter operator (+, -, *, /): ")

result = calculator(n1, n2, op)
print("Result:", result)
