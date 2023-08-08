# Accessibility Rating Control with 3 Moods

- **Form Id**: 5a0af07281bfe025a00405f8
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Rating control with 3 moods accessibility

* **Given** The mood component has 3 moods
* **When** `<action>`
* **Then** `<expected behavior>`
* **And** The accessibility label of the component is "Select a value out of 3"


| Action | Expected behavior |
|--------|-------------------|
| Selecting index 0 | accessibility value = Hate |
| Selecting index 1 | accessibility value = Neutral |
| Selecting index 2 | accessibility value = Love |
