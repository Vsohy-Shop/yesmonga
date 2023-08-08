# Accessibility Rating Control with 2 Moods

- **Form Id**: 5a0aebf781bfe025a6396a29
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Rating control with 2 moods accessibility

* **Given** The mood component has 2 moods
* **When** `<action>`
* **Then** `<expected behavior>`
* **And** The accessibility label of the component is "Select a value out of 2"


| Action | Expected behavior |
|--------|-------------------|
| Selecting index 0 | accessibility value = Hate |
| Selecting index 1 | accessibility value = Love |
