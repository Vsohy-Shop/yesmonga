# Jump Rules Many controls

- **Form Id**: 5947db02bc87d295616539f5
- **Environment**: Staging

## Abstract

Check that many controls with multiple jump rules behaves according to the acceptance criteria

* Page 1
    * Mood Control
    	- Selecting 1, 2, 3, 4 takes to Page 2
    	- Selecting 5 takes to Page 3
    * Slider
    	- Selecting 4 takes to Page 4
* Page 2
    * Paragraph (text = page2)
* Page 3
    * Paragraph (text = page3)
* Page 4
    * Paragraph (text = page4)

## Acceptance criteria

* Selecting 1, 2, 3 or 4 in Mood Control && no value in Slider takes to next Page (Page 2)
* Selecting 5 in Mood Control && no value in Slider takes to Page 3
* Selecting 1 in Mood Control && 4 in Slider takes to Page 4
* Selecting 5 in Mood Control && 4 in Slider takes to Page 3
