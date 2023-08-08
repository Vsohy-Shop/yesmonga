# Passive Checkbox Jump Rules

- **Form Id**: 59cceb9da8ec2d268640f9bf
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Passive form with checkboxes and jump rules

* **Given** The form with formId 59cceb9da8ec2d268640f9bf
* **And** StartPage contains a Checkbox with Option1, Option2, Option3
* **And** StartPage has the following jump rules:
    * When Checkbox is Option1 jump to Page1
    * When Checkbox is Option1, Option2, Option3 jump to Page2
    * When Checkbox is Option3 jump to Page3
    * Otherwise jump to EndPage
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting Option1 |  Page1 should be displayed |
| Selecting Option1 and Option2 |  Page1 should be displayed |
| Selecting Option1 and Option3 |  Page1 should be displayed |
| Selecting Option1 and Option2 and Option3 |  Page1 should be displayed |
| Selecting Option2 |  Page2 should be displayed |
| Selecting Option3 |  Page2 should be displayed |
| Selecting nothing |  EndPage should be displayed |
