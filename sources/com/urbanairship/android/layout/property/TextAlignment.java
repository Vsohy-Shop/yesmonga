package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import androidx.core.view.C18306m0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum TextAlignment {
    START("start", C18306m0.f46960b),
    END("end", 8388613),
    CENTER(C9168d0.f24881F0, 17);
    
    private final int gravity;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    TextAlignment(@C0359n0 String str, int i) {
        this.value = str;
        this.gravity = i;
    }

    @C0359n0
    /* renamed from: b */
    public static TextAlignment m147716b(@C0359n0 String str) throws JsonException {
        for (TextAlignment textAlignment : values()) {
            if (textAlignment.value.equals(str.toLowerCase(Locale.ROOT))) {
                return textAlignment;
            }
        }
        throw new JsonException("Unknown Text Alignment value: " + str);
    }

    /* renamed from: g */
    public int mo107318g() {
        return this.gravity;
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
