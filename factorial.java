# Take number input from the user
num = int(input("Enter a number: "))

# Initialize factorial to 1
factorial = 1

# Calculate factorial using for loop
for i in range(1, num + 1):
    factorial *= i

# Print the factorial
print(f"Factorial of {num} is {factorial}")
