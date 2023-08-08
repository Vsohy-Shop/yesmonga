# Accessibility Rating Control with 5 Moods

- **Form Id**: 5a0af14f81bfe025a4540312
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Rating control with 5 moods accessibility

* **Given** The mood component has 5 moods
* **When** `<action>`
* **Then** `<expected behavior>`
* **And** The accessibility label of the component is "Select a value out of 5"


| Action | Expected behavior |
|--------|-------------------|
| Selecting index 0 | accessibility value = Hate |
| Selecting index 1 | accessibility value = Dislike |
| Selecting index 2 | accessibility value = Neutral |
| Selecting index 3 | accessibility value = Like |
| Selecting index 4 | accessibility value = Love |
