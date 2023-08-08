package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum FormInputType {
    EMAIL("email", 33),
    NUMBER("number", 2),
    TEXT("text", 49153),
    TEXT_MULTILINE("text_multiline", 180225);
    
    private final int typeMask;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    FormInputType(@C0359n0 String str, int i) {
        this.value = str;
        this.typeMask = i;
    }

    @C0359n0
    /* renamed from: b */
    public static FormInputType m147660b(@C0359n0 String str) throws JsonException {
        for (FormInputType formInputType : values()) {
            if (formInputType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return formInputType;
            }
        }
        throw new JsonException("Unknown Form Input Type value: " + str);
    }

    /* renamed from: g */
    public int mo107272g() {
        return this.typeMask;
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
