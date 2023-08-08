# Accessibility RadioButton

- **Form Id**: 5a291ba057612032f91f9ccd
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Accessibility of RadioButton

* **Given** The radio button has two options
* **When** All options are unselected
* **Then** The accessibility value of each option is "unselected"


* **When** `<action>`
* **And** The accessibility label of the component is "choose your spirit animal, choose from 2 options, one option possible"
* **Then** `<Option 1 value> & <Option 2 value>`


|Action             |Option 1 value  |Option 2 value |
|-------------------|----------------|---------------|
|tap option 1 		|selected	 	 |unselected 	 |
|tap option 2 		|unselected	 	 |selected	 	 |
