# PlayStore Dialog Visibility

## Acceptance criteria

**Scenario**: PlayStore dialog
* **Given** A mood component
* **And** the form has the play store redirect option enabled
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting mood 4 and dismissing form from its last page | PlayStore dialog should be displayed |
| Selecting mood 3 and dismissing form from its last page | PlayStore dialog should not be displayed |
