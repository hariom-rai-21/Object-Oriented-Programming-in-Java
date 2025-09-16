# Take number input from the user
num = int(input("Enter a number: "))

# Initialize digit count
count = 0
temp = abs(num)  # Handle negative numbers

# Count digits using a while loop
if temp == 0:
    count = 1
else:
    while temp > 0:
        temp //= 10
        count += 1

# Print the count of digits
print(f"Number of digits in {num} is {count}")
