# Jump Rules Radio buttons control

## Acceptance criteria

**Scenario**: Jump rules of Radio Buttons
* **Given** Given a radio button with 2 options
* **And** the page has the following jump rules:
    * When Option 1 is checked jump to Page2
    * When Option 2 is checked jump to Page3
    * Otherwise jump to end page
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting Option 1 | Page2 should be displayed |
| Selecting Option 2 | Page3 should be displayed |
