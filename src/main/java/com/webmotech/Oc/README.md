# Open/Closed Principle (OCP)

## Description

The Open/Closed Principle (OCP) states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

## Good Example

In the `good` folder, the system is designed to allow easy extension:
- `Report` interface: Allows adding new report types without changing existing code.
- `MonthlyReport` and `YearlyReport` classes: Implement the `Report` interface, making it easy to extend the system with new types of reports.

### Benefits:
- **Extensibility**: New functionalities can be added with minimal changes to existing code.
- **Stability**: Existing code remains unchanged and reliable.

## Bad Example

In the `bad` folder, report generation is handled by a single class (`ReportService`) that uses conditionals to determine the type of report to generate. This violates OCP because:
- Adding a new report type requires modifying the existing class.
- This can introduce bugs and make the code harder to maintain.
