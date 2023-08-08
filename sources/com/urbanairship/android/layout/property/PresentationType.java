package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum PresentationType {
    BANNER("banner"),
    MODAL(InAppMessage.f24679Q0);
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    PresentationType(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static PresentationType m147683b(@C0359n0 String str) throws JsonException {
        for (PresentationType presentationType : values()) {
            if (presentationType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return presentationType;
            }
        }
        throw new JsonException("Unknown PresentationType value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
