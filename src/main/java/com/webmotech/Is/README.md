# Interface Segregation Principle (ISP)

## Description

The Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use. It encourages splitting large interfaces into smaller, more specific ones.

## Good Example

In the `good` folder, interfaces are designed to be small and specific:
- `Printable` interface: Only defines the `print` method.
- `Exportable` interface: Only defines the `export` method.
- `MonthlyReport`: Implements both interfaces but clients can depend on only the functionality they need.

### Benefits:
- **Specific Interfaces**: Clients depend only on the methods they actually use.
- **Flexibility**: Makes the system easier to maintain and extend.

## Bad Example

In the `bad` folder, a single interface (`Reportable`) defines both `print` and `export` methods. This violates ISP because:
- Clients that only need one method are forced to implement the other.
- It leads to less flexible and harder-to-maintain code.
