
import math

def isPrime(num):
    if num <= 1:
        return False
    i = 2
    while i <= math.sqrt(num):
        if num % i == 0:
            return False
        i = i + 1

    return True #if everthing not equal 0, means prime

def main():
    # Loop continuously to ask for a number
    while True:
        try:
            # 1. Take input
            number_input = input("Enter a number to check (Type X to exit): ")
            
            # 2. Check for the exit command
            if number_input.lower() == 'x':
                print("Exiting program. Goodbye!")
                break
            
            # 3. Convert input to an integer (this must be inside the try block)
            number = int(number_input) 

            # 4. Check prime status and print result
            if isPrime(number):
                print(f"\n{number} is a prime number.\n")
            else:
                print(f"\n{number} is not a prime number.\n")

        except ValueError:
            # Handle non-numeric input that wasn't 'x'
            print("\nError: Please enter a valid integer or 'X' to exit.\n")

# Run the main function when the script is executed
if __name__ == "__main__":
    main()