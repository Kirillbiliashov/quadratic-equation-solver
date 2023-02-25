# Quadratic Equation Solver
## Description 
This application is intended to solve quadratic equations based on 
input parameters a, b and c. 
The application supports interactive mode (when you specify parameters through CLI) and 
non-interactive mode (when parameters are read from a file).
## Steps for running application:
1. In pom.xml file, specify either org.example.AppInteractive or
org.example.AppNonInteractive main class (depending on your choice).
2. run ``` mvn package ``` command in your terminal (from root app directory).
3. Then run ``` java -jar target/quadratic-equation-solver-1.0-SNAPSHOT.jar ``` command, 
which executes main class specified in step 1.
## Format 
For non-interactive mode, your parameters should be specified
at the first line separated by whitespace.

Correct: 2 4 6.2

Incorrect: 1 some text 3 12 1

## Revert commit
Revert commit: https://github.com/Kirillbiliashov/quadratic-equation-solver/commit/66db50c0020b97f333d8177d18981cc9e3070f09
