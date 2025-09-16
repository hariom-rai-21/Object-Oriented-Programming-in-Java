# Take number of terms input from the user
n = int(input("Enter the number of terms: "))

# Initialize the first two terms
a, b = 0, 1

# Print Fibonacci series up to n terms
print("Fibonacci series:")
for _ in range(n):
    print(a, end=" ")
    a, b = b, a + b
