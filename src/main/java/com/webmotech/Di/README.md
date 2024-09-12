# Dependency Inversion Principle (DIP)

## Description

The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules but on abstractions. Additionally, abstractions should not depend on details, but details should depend on abstractions.

## Good Example

In the `good` folder, the system depends on abstractions (`Report` interface):
- `ReportService`: Depends on the `Report` interface rather than concrete implementations.
- `MonthlyReport`: Implements the `Report` interface, making it easy to switch implementations.

### Benefits:
- **Reduced Coupling**: High-level classes are not tightly coupled to low-level implementations.
- **Easier to Extend**: New implementations can be added without modifying high-level classes.

## Bad Example

In the `bad` folder, the `ReportFormatter` class depends directly on a concrete implementation (`MonthlyReport`). This violates DIP because:
- High-level classes are tightly coupled to low-level implementations.
- This makes the system harder to extend and maintain.
