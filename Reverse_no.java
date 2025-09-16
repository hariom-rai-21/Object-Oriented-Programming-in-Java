# Take the number input from the user
num = int(input("Enter a number: "))

# Initialize the reverse number
reverse = 0
temp = num

# Reverse the digits using a while loop
while temp > 0:
    digit = temp % 10
    reverse = (reverse * 10) + digit
    temp //= 10

# Print the reversed number
print(f"Reversed number: {reverse}")
