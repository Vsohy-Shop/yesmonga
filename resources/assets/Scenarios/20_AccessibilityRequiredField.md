# Accessibility Required Field

- **Form Id**: 5a0d4688b392942594719508
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Accessibility of fields required or not

* **Given** The mood rating is required
* **And** The text area is not required
* **When** Displaying the form
* **Then** The accessibility label of the mood component is "Select a mood This Field is required"
* **And** The accessibility label of the text area component is "What do you think about us?"