# Accessibility Picker

## Acceptance criteria

**Scenario**: Accessibility of closed Picker

* **Given** The picker has three options
* **And** The picker is closed
* **Then** The picker is inaccessible

**Scenario**: Accessibility of open Picker

* **Given** The picker has three options
* **And** The picker is closed
* **And** The picker is inaccessible
* **When** The picker button is pressed
* **Then** The picker is expanded and focused


* **When** `<action>`
* **Then** the accessibility label will be `Expected accessibility value `


|Action             |Expected accessibility value |
|-------------------|----------------|
|select option 1 	|option 1	 	 |
|select option 2	|option 2	 	 |
|select option 3 	|option 3	 	 |
