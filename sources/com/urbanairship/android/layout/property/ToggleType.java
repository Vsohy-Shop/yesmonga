package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum ToggleType {
    SWITCH("switch"),
    CHECKBOX("checkbox");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    ToggleType(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static ToggleType m147719b(@C0359n0 String str) throws JsonException {
        for (ToggleType toggleType : values()) {
            if (toggleType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return toggleType;
            }
        }
        throw new JsonException("Unknown ToggleType value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
