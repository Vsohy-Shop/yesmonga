package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum VerticalPosition {
    f88541a(C9156c.f24820X, 48),
    BOTTOM(C9156c.f24821Y, 80),
    CENTER(C9168d0.f24881F0, 16);
    
    private final int gravity;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    VerticalPosition(@C0359n0 String str, int i) {
        this.value = str;
        this.gravity = i;
    }

    @C0359n0
    /* renamed from: b */
    public static VerticalPosition m147720b(@C0359n0 String str) throws JsonException {
        for (VerticalPosition verticalPosition : values()) {
            if (verticalPosition.value.equals(str.toLowerCase(Locale.ROOT))) {
                return verticalPosition;
            }
        }
        throw new JsonException("Unknown VerticalPosition value: " + str);
    }

    /* renamed from: g */
    public int mo107322g() {
        return this.gravity;
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
