package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum ScoreType {
    NUMBER_RANGE("number_range");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    ScoreType(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static ScoreType m147684b(@C0359n0 String str) throws JsonException {
        for (ScoreType scoreType : values()) {
            if (scoreType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return scoreType;
            }
        }
        throw new JsonException("Unknown ScoreType value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
