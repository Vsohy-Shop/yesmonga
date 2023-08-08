# Integration test - Prevent displaying a campaign more than once

- **Campaign ID**: f22fed8d-b787-4f4e-8890-9238963f0d0e
- **Environment**: Staging

## Acceptance criteria

**Scenario**: Prevent displaying the same campaign to the same user (device) more than once

**Given** that a campaign is targeted with the event 'once' 
**And** the campaign has the status 'active'
**And** '100%' of the users are targeted
**When** the user triggers the event 'once' once
**And** the other targeting options are met
**And** the campaign is displayed to the user
**And** the user dismisses the campaign
**When** the user triggers the event 'once' a second time
**Then** the campaign is not displayed to the user again

