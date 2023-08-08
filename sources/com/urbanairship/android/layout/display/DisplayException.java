package com.urbanairship.android.layout.display;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DisplayException extends Exception {
    public DisplayException(String str) {
        super(str);
    }
}
