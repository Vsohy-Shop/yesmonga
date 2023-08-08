package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum Direction {
    VERTICAL("vertical"),
    HORIZONTAL("horizontal");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    Direction(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static Direction m147646b(@C0359n0 String str) throws JsonException {
        for (Direction direction : values()) {
            if (direction.value.equals(str.toLowerCase(Locale.ROOT))) {
                return direction;
            }
        }
        throw new JsonException("Unknown Direction value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
