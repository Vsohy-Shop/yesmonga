# Banner With Paragraph Max 5 Lines

## Acceptance criteria

**Scenario**: Campaign banner with long paragraph should only display its first 5 lines and then scroll

* **Given** The campaign with formId 42a6a62e-5df4-4331-8dcd-b0784b3829b9
* **And** Banner contains a long paragraph and a continue button
* **When** Campaign form is displayed
* **Then** Paragraph only displays its first 5 lines and the rest is reached via scrolling
