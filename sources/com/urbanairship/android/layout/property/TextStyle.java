package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum TextStyle {
    BOLD(C9168d0.f24882G0),
    ITALIC(C9168d0.f24884I0),
    UNDERLINE("underlined");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    TextStyle(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static TextStyle m147718b(@C0359n0 String str) throws JsonException {
        for (TextStyle textStyle : values()) {
            if (textStyle.value.equals(str.toLowerCase(Locale.ROOT))) {
                return textStyle;
            }
        }
        throw new JsonException("Unknown Text Style value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
