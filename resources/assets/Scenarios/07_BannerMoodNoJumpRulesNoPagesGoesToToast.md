# Banner Mood No Jump Rules No Pages Goes To Toast

- **Campaign Form Id**: 2906a9d0-5395-4637-b2e3-60e1ff8becb4
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign banner without jump rules and without pages goes to toast

* **Given** The campaign with formId 2906a9d0-5395-4637-b2e3-60e1ff8becb4
* **And** Banner contains a mandatory Mood and no continue button
* **And** Banner has no jump rules
* **When** `<action>`
* **Then** `<expected behavior>`

| Action | Expected behavior |
|--------|-------------------|
| Selecting any Mood value |  Toast1 should be displayed |
