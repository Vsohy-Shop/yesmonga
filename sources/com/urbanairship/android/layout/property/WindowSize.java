package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum WindowSize {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    WindowSize(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static WindowSize m147726b(@C0359n0 String str) throws JsonException {
        for (WindowSize windowSize : values()) {
            if (windowSize.value.equals(str.toLowerCase(Locale.ROOT))) {
                return windowSize;
            }
        }
        throw new JsonException("Unknown WindowSize value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
