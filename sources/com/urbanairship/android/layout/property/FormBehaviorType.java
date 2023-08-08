package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum FormBehaviorType {
    SUBMIT_EVENT("submit_event");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    FormBehaviorType(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static FormBehaviorType m147659b(@C0359n0 String str) throws JsonException {
        for (FormBehaviorType formBehaviorType : values()) {
            if (formBehaviorType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return formBehaviorType;
            }
        }
        throw new JsonException("Unknown Form Behavior Type value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
