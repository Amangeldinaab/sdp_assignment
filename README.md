# SDP assignment - Fitness Tracker
This project shows Builder creational design pattern in Java for Fitness Tracker system.
It allows custom, step-by-step construction of complex `WorkoutPlan` objects with strict validation logic and preset configurations managed by a `WorkoutDirector`.

2. Architecture & Design Pattern
model: Domain objects (`Exercise`, `WorkoutPlan`) with encapsulation and immutable list safety.
builder: `Builder` interface and `WorkoutBuilder` implementation providing a fluent API for object construction.
director: `WorkoutDirector` encapsulating predefined workout recipes (e.g: Beginner Cardio, Advanced Strength).


3. Clean Code Principles
Single Responsibility: Each class has one job - `Workoutplan` holds data, `WorkoutBuilder` builds and validates and `WorkoutDirector` provides presets.
Clear Naming: Classes and methods directly reflect their function (e.g., `WorkoutBuilder`, `addExercise`, `validatePlan`).
Data Validation: `build()` checks required fields before object creation and throws exceptions for invalid inputs.
Immutability: `WorkoutPlan` uses `final` fields and defensive copying to protect data from unintended changes.
Fluent API: Method chaining (`return this`) simplifies object creation in `Main.java` without cluttering the code.