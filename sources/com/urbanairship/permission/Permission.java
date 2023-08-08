package com.urbanairship.permission;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Locale;

public enum Permission implements C9333e {
    DISPLAY_NOTIFICATIONS("display_notifications"),
    LOCATION("location");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    Permission(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static Permission m35418b(@C0359n0 JsonValue jsonValue) throws JsonException {
        String B = jsonValue.mo18750B();
        for (Permission permission : values()) {
            if (permission.value.equalsIgnoreCase(B)) {
                return permission;
            }
        }
        throw new JsonException("Invalid permission: " + jsonValue);
    }

    @C0359n0
    /* renamed from: g */
    public String mo19115g() {
        return this.value;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return JsonValue.m34975U(this.value);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
