# Jump Rules One control

- **Form Id**: 5947b6e5bc87d2f84f6538fb
- **Environment**: Staging

## Abstract

Check that one control with multiple jump rules behaves according to the acceptance criteria

* Page 1
    * Mood Control
        - 1 takes to Page 2
        - 2, 5 takes to the next page
        - 3 takes to Page 3
        - 4 takes to Page 4
* Page 2
    * Paragraph (text = page2)
* Page 3
    * Paragraph (text = page3)
* Page 4
    * Paragraph (text = page4)

## Acceptance criteria

* Selecting 1 in Mood Control takes to Page 2
* Selecting 3 in Mood Control takes to Page 3
* Selecting 4 in Mood Control takes to Page 4
* Selecting 2 or 5 in Mood Control goes to the next Page
