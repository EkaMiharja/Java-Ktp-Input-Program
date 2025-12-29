# KTP Input Program (Java)

## Description
This project is a simple Java console application that allows users to input and display Indonesian ID card (KTP) data for two people.  
This program is **intended for beginner-level Java learners** to practice basic input, variables, and output formatting.

## Purpose
- Learn how to use `Scanner` for console input
- Understand basic Java data types (`String`)
- Practice `System.out.print` and `System.out.println`
- Understand the structure of a simple Java program

## Features
- Input KTP data for two users
- Display user data in a formatted KTP-like layout
- Uses basic Java syntax suitable for beginners

## Program Explanation

### 1. Scanner Initialization
The program uses the `Scanner` class to read input from the keyboard.

### 2. Input Process
The user is asked to enter the following data:
- NIK
- Name
- Place of birth
- Gender
- Blood type
- Address
- RT/RW
- Village (Kelurahan)
- District (Kecamatan)
- Religion
- Marital status
- Job
- Nationality
- Valid until date

All data is collected for **User 1** and **User 2**.

### 3. Output Process
After input is completed, the program prints:
- User 1 data
- User 2 data  
in a structured and readable format using console output.

## How to Run
1. Clone or download this repository
2. Compile the Java file:
   ```bash
   javac ktpinput.java
3. Run the program:
  java ktpinput

## Notes
1. This program does not include input validation
2. Mixing next() and nextLine() is intentional as part of beginner learning
3. Data is not stored permanently (no database or file output)
