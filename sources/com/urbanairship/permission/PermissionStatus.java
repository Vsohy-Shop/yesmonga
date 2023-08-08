package com.urbanairship.permission;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Locale;

public enum PermissionStatus implements C9333e {
    GRANTED("granted"),
    DENIED("denied"),
    NOT_DETERMINED("not_determined");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    PermissionStatus(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static PermissionStatus m35421b(@C0359n0 JsonValue jsonValue) throws JsonException {
        String B = jsonValue.mo18750B();
        for (PermissionStatus permissionStatus : values()) {
            if (permissionStatus.value.equalsIgnoreCase(B)) {
                return permissionStatus;
            }
        }
        throw new JsonException("Invalid permission status: " + jsonValue);
    }

    @C0359n0
    /* renamed from: g */
    public String mo19117g() {
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
