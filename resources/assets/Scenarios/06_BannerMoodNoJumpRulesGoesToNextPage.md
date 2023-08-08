# Banner Mood No Jump Rules Goes To Next Page

- **Campaign Form Id**: ad80200b-f23e-44bb-9160-7af08745f626
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign banner without jump rules goes to next page

* **Given** The campaign with formId ad80200b-f23e-44bb-9160-7af08745f626
* **And** Banner contains a mandatory Mood and no continue button
* **And** Banner has no jump rules
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting any Mood value |  Page1 should be displayed |
