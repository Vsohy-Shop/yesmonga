# Campaign Page Toast No Controls

- **Campaign Form Id**: a811367c-d158-4036-863e-823394e9cfea
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Campaign page and toast with no controls are displayed

* **Given** The campaign with formId a811367c-d158-4036-863e-823394e9cfea
* **And** Banner contains a title/text control and a continue button
* **And** Page 1 contains no control
* **And** Toast 1 contains no control
* **When** The Continue button from the banner is pressed
* **Then** Page 1 should be displayed with no controls
* **When** The Next button from Page 1 is pressed
* **Then** Toast 1 should be displayed without text
