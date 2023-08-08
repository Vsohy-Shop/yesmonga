package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.core.view.C18306m0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum HorizontalPosition {
    START("start", C18306m0.f46960b),
    END("end", 8388613),
    CENTER(C9168d0.f24881F0, 1);
    
    private final int gravity;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    HorizontalPosition(@C0359n0 String str, int i) {
        this.value = str;
        this.gravity = i;
    }

    @C0359n0
    /* renamed from: b */
    public static HorizontalPosition m147662b(@C0359n0 String str) throws JsonException {
        for (HorizontalPosition horizontalPosition : values()) {
            if (horizontalPosition.value.equals(str.toLowerCase(Locale.ROOT))) {
                return horizontalPosition;
            }
        }
        throw new JsonException("Unknown HorizontalPosition value: " + str);
    }

    /* renamed from: g */
    public int mo107274g() {
        return this.gravity;
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
