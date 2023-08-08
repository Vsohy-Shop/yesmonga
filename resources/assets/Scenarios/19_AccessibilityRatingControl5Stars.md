# Accessibility Rating Control with 5 Stars

- **Form Id**: 5a0af27481bfe025a454032e
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Rating control with 5 stars accessibility

* **Given** The rating control has 5 stars
* **When** `<action>`
* **Then** `<expected behavior>`
* **And** The accessibility label of the component is "Select a value out of 5"


| Action | Expected behavior |
|--------|-------------------|
| Selecting index 0 | accessibility value = 1 star |
| Selecting index 1 | accessibility value = 2 stars |
| Selecting index 2 | accessibility value = 3 stars |
| Selecting index 3 | accessibility value = 4 stars |
| Selecting index 4 | accessibility value = 5 stars |