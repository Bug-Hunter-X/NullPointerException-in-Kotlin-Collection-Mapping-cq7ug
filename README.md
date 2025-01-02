# Kotlin NullPointerException in Collection Mapping

This repository demonstrates a common error in Kotlin involving null pointer exceptions when using collection functions like `map` with potentially nullable collections.

The `bug.kt` file contains code that throws a `NullPointerException` when a null list is passed to the `map` function. The `bugSolution.kt` file shows how to resolve the issue by using the `?.let` operator or safe call operator to handle null values gracefully. 

## How to reproduce

1. Clone this repository.
2. Open `bug.kt`.
3. Run the code. Observe the `NullPointerException`. 
4. Open `bugSolution.kt` and run the code to see how to resolve the issue. 
