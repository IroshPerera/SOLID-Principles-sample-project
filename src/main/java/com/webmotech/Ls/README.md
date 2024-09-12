# Liskov Substitution Principle (LSP)

## Description

The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

## Good Example

In the `good` folder, subclasses (`MonthlyReport` and `YearlyReport`) correctly implement the `Report` abstract class:
- Both subclasses can be used interchangeably without altering the program's behavior.
- They correctly adhere to the contract set by the `Report` class.

### Benefits:
- **Substitutability**: Subclasses can be used in place of their base class without breaking the application.
- **Consistency**: The behavior of the program remains consistent across different subclasses.

## Bad Example

In the `bad` folder, the `YearlyReport` subclass violates LSP by throwing an exception in the `save` method, which is unexpected based on the base class (`Report`). This violates LSP because:
- It introduces unexpected behavior when using the subclass.
- The subclass cannot be reliably substituted for the base class.
