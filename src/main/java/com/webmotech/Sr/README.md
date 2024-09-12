# Single Responsibility Principle (SRP)

## Description

The Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning it should have only one job or responsibility.

## Good Example

In the `good` folder, each class has a clearly defined responsibility:
- `Report` interface: Defines the blueprint for report generation.
- `MonthlyReport` and `YearlyReport` classes: Focus on generating specific types of reports.
- `ReportFormatter`: Responsible for formatting the report.
- `ReportGenerator`: Orchestrates the process of report generation and formatting.

### Benefits:
- **Single Responsibility**: Each class is focused on a single responsibility.
- **Easy Maintenance**: Changes to one part of the system don’t impact other parts.

## Bad Example

In the `bad` folder, a single class (`ReportService`) is responsible for generating and formatting different types of reports. This violates SRP because:
- It has multiple responsibilities.
- Changes to one type of report might affect the others.
