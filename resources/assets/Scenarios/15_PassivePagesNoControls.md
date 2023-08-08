# Passive Pages No Controls

- **Form Id**: 59f71af4877f8b293772b183
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Passive form with pages without controls

* **Given** The form with formId 59f71af4877f8b293772b183
* **And** Page 1 contains a mood control
* **And** Page 2 contains no control
* **And** End Page contains no control
* **When** the Next button from Page 1 is pressed
* **Then** Page 2 should be displayed without controls
* **When** the Next button from Page 2 is pressed
* **Then** End Page should be displayed without controls