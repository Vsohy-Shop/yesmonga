# Banner Mood Jump Rules Page Goes To Toasts

- **Campaign Form Id**: 3e87017e-fbe0-4506-9433-c9d95eda77ac
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign banner with jump rules from page to toasts

* **Given** The campaign with formId 3e87017e-fbe0-4506-9433-c9d95eda77ac
* **And** Banner contains a mandatory Mood and no continue button
* **And** Page1 contains a checkbox field with two options and the continue button
* **And** Page1 has the following jump rules:
    * When Checkbox is Option1 jump to Toast2
    * When Checkbox is Option2 jump to Toast2
    * Otherwise jump to Toast1
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting Option1 |  Toast2 should be displayed |
| Selecting Option2 |  Toast3 should be displayed |
| Selecting nothing |  Toast1 should be displayed |
