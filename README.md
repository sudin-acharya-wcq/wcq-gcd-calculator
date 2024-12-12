Overview
The GCDCalculator project is the first onboarding project on my engineering rotation. The application is designed to calculate the
Greatest Common Divisor(GCD) of a set of integers. 

Tech used
Language: Java 17
Build Tool: Gradle
Testing Framework: JUnit

Project Structure
wcq-gcd-calculator/
├── build.gradle       # Gradle build file
├── gradlew.bat
├── gradlew
├── settings.gradle    # Gradle settings file
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/learninggradle/
│   │   │       ├── application/
│   │   │       │   └── Application.java   # CLI entry point
│   │   │       └── businesslogic/
│   │   │           └── GcdCalculator.java      # Business logic for GCD calculation
│   └── test/
│       └── java/
│           └── com/learninggradle/
│               └── GcdTest.java      # Unit tests
└── README.md           # Project documentation


How to Build
The project uses Gradle to build the application
1. Clone the repository:
    git clone https://github.com/sudin-acharya-wcq/wcq-gcd-calculator.git
2. Generate gradle-wrapper.jar file
    gradle wrapper 
3. Build the project using gradle:
   ./gradlew build
This will compile the source files and generate the required build artifacts in the build/ directory

How to run
After building the project, it can be run by passing the integers as command-line arguments. 
./gradlew run --args="number1 number2 number3.....numberN"

for example:
./gradle run --args="2 3 5 7"

This will output: 
The GCD of provided numbers is : 1

If no argument is provided it will display an error message:
Please provide integers as a command line arguments.

How to test
The project includes unit tests for the GcdCalculation logic. The test can be run by:
    ./gradlew test

This will run all the tests located in src/test/java directory. The tests are written using JUnit 5.