# Visibility Control

- **Form Id**: 5947edeebc87d20b75652923
- **Environment**: Staging

## Abstract

Check that various controls with multiple visibility rules behave according to the acceptance criteria

* Page 1
    * Mood Control
        - 5 shows the Slider
    * Slider
        - 5 shows Paragraph
    * Paragraph (text = I am shown)
* Page 2
    * Paragraph (text = page2)
* Page 3
    * Paragraph (text = page3)
* Page 4
    * Paragraph (text = page4)

## Acceptance criteria

* Selecting 1, 2, 3 or 4 (nothing happens - Slider and Paragraph are not visible)
* Selecting 5 in Mood Control displays Slider
* Selecting 5 in Slider displays Paragraph
* Selecting 1 (2, 3 or 4) in Mood Control hides Slider and Paragraph
* Selecting 5 in Mood Control displays only Slider and not the Paragraph
