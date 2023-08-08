# Accessibility Checkbox

- **Form Id**: 5a291adc9931e31e5e622aca
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Accessibility of Checkbox

* **Given** The checkbox has three options
* **When** All options are unselected
* **Then** The accessibility value of each option is "unselected"


* **When** `<action>`
* **And** The accessibility label of the component is "choose an animal from the checkbox component, choose from 3 options, multiple options possible"
* **Then** `<Option 1 value> & <Option 2 value> & <Option 3 value>`



|Action             |Option 1 value  |Option 2 value |Option 3 value |
|-------------------|----------------|---------------|---------------|
|tap option 1 		|selected	 	 |unselected 	 |unselected 	 |
|tap option 3 		|selected	 	 |unselected 	 |selected 	 	 |
|tap option 1 		|unselected	 	 |unselected 	 |selected 	 	 |
