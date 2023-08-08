# Banner Mood Jump Rules No Pages Goes To Toast

- **Campaign Form Id**: dffac2d9-23be-4a11-9dc2-20f396f71a90
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign banner with jump rules and without pages goes to toasts

* **Given** The campaign with formId dffac2d9-23be-4a11-9dc2-20f396f71a90
* **And** Banner contains a mandatory Mood and no continue button
* **And** Banner has the following jump rules:
  * When Mood is value 1, 2 or 3 jump to Toast1
  * When Mood is value 4 or 5 jump to Toast2
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting Mood value 1, 2 or 3 |  Toast1 should be displayed |
| Selecting Mood value 4 or 5 |  Toast2 should be displayed |
