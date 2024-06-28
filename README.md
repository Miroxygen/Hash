# Hash Function Uniformity Test

This project tests the uniformity of a custom hash function by generating random strings and fixed words, hashing them, and analyzing the distribution of the hash values. It helps ensure that the hash function distributes values evenly across the output space.

## Core Functionalities

 -   Random String Generation: Generate random strings of varying lengths.
 -   Fixed Word Dictionary: Provide a set of predefined words for consistent testing.
-    Hash Function: Implement a custom hash function to hash the strings.
-    Uniformity Test: Test the uniformity of the hash function by analyzing the distribution of hash values for random and fixed strings.

### Technologies Used

 -   Java: Main programming language for the application.
 -   Collections: For managing lists and arrays of strings and hash values.

## Project Structure

  -  App.java: Main entry point of the application. Initializes components and runs the uniformity test.
  -  FixedWordDic.java: Contains a dictionary of predefined words for consistent testing.
  -  Hash.java: Implements the custom hash function.
 -   RandomStringGenerator.java: Generates random strings of varying lengths.
 -   UniformityTest.java: Conducts the uniformity test by generating strings, hashing them, and analyzing the distribution.

## Setup

  1. Clone the repository.

2. Compile the Java files:

   - javac -d bin src/*.java

3. Run the application:

    -  java -cp bin App

## Usage

1.  Run the application.
2.  The application generates a set of random strings and fixed words.
3.  It hashes these strings using the custom hash function.
4.  The application then analyzes and prints the distribution of the hash values to the console.

## Dependencies

  Java 8 or higher: Ensure you have Java installed on your system.

## License

This project is licensed under the MIT License.
