package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum Orientation {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    Orientation(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static Orientation m147681b(@C0359n0 String str) throws JsonException {
        for (Orientation orientation : values()) {
            if (orientation.value.equals(str.toLowerCase(Locale.ROOT))) {
                return orientation;
            }
        }
        throw new JsonException("Unknown Orientation value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
