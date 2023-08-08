# Banner NPS Jump Rules Goes To Pages And Toasts

- **Campaign Form Id**: 30bdb9b6-e4c8-489b-9948-8caaabd067e7
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign banner with NPS jump rules to pages and toasts

* **Given** The campaign with formId 30bdb9b6-e4c8-489b-9948-8caaabd067e7
* **And** Banner contains a mandatory NPS and no continue button
* **And** Banner has the following jump rules:
    * When NPS is 0 jump to Page 2
    * When NPS is 1 jump to Page 3
    * When NPS is 2 jump to Toast 1
    * When NPS is 3,4,5,6 jump to Toast 2
    * Otherwise jump to Page 1
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting 0 | Page 2 should be displayed |
| Selecting 1 | Page 3 should be displayed |
| Selecting 2 | Toast 1 should be displayed |
| Selecting 3, 4, 5 or 6 | Toast 2 should be displayed |
| Selecting 7, 8, 9 or 10 | Page 1 should be displayed |
