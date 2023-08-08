# Banner Mood Jump Rules Goes To Pages

- **Campaign Form Id**: 94d4df32-bee2-4615-8216-0cf34446deac
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign banner with jump rules goes to pages

* **Given** The campaign with formId 94d4df32-bee2-4615-8216-0cf34446deac
* **And** Banner contains a mandatory Mood and no continue button
* **And** Banner has the following jump rules:
    * When Mood is value 1, 2 or 3 jump to Page1
    * When Mood is value 4 or 5 jump to Page2
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting Mood value 1, 2 or 3 |  Page1 should be displayed |
| Selecting Mood value 4 or 5 |  Page2 should be displayed |
