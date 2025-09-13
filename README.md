# Geometric Calculator

A Java application that demonstrates Object-Oriented Programming principles by calculating geometric properties of various shapes. Processes input from files to compute and output the total area of multiple shapes.

## Features

- Calculates area for various 2D and 3D shapes (Circle, Cube)
    
- Reads input parameters from a text file
    
- Implements OOP principles with inheritance and polymorphism
    
- Writes calculated results to an output file
    
- Clean architecture with abstract classes and interfaces

## Project Structure

```
Geometric-Calculator/
├── src/
│   ├── Circle.java          # Circle class implementation
│   ├── Cube.java            # Cube class implementation
│   ├── Drawable.java        # Interface for drawable objects
│   ├── Main.java            # Main application class
│   ├── Shape.java           # Abstract base class
│   └── ThreeDShape.java     # Abstract class for 3D shapes
├── input.txt                # Sample input file
├── output.txt               # Generated output file
└── README.md
```

## How to Use

1. **Prepare Input**: Create an `input.txt` file with the following format:
    
    ```
    [number_of_shapes] [shape1_type] [shape1_value] [shape2_type] [shape2_value] ...
    
    Example: 2 Circle 22.5 Cube 23.6

    ```
    
2. **Compile and Run**:
    
    ```
    javac src/*.java
    java -cp src Main
    ```
    
3. **View Results**: The program will generate an `output.txt` file with the total area of all shapes.
    

## Example

**Input (input.txt)**:

```
2 Circle 22.5 Cube 23.6
```

**Output (output.txt)**:

```
Total area of all shapes: 4932.191280879833
```

## Technical Details

- Implements inheritance hierarchy with abstract Shape class
    
- Uses polymorphism through the Drawable interface
    
- Demonstrates file I/O operations with BufferedReader/BufferedWriter
    
- Follows OOP principles for extensible design
