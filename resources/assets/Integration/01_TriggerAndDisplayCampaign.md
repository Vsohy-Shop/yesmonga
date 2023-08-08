# Integration test - display a campaign

- **App ID**: d5af199e-9b6e-4397-838e-6e26691e80c3
- **Campaign ID**: 642a611b-3df0-4f81-ba1f-64cf900424ea
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Trigger and display a targeted campaign

**Given** that a campaign is targeted with the event 'purchaseComplete' 
**And** the campaign has the status 'active'
**And** repetition of the event is set to '2'
**And** '100%' of the users are targeted
**And** the device language targeting is set to 'Dutch'
**And** the custom variable targeting is set to |frequent flyer status|sky elite|
**When** the user triggers the event 'purchaseComplete' twice
**And** the other targeting options are met
**Then** the campaign is displayed to the user
