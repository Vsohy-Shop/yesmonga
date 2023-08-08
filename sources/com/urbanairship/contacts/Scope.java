package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Locale;

public enum Scope implements C9333e {
    APP(FirebaseMessaging.f80405r),
    WEB("web"),
    EMAIL("email"),
    SMS("sms");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    Scope(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static Scope m33817b(@C0359n0 JsonValue jsonValue) throws JsonException {
        String B = jsonValue.mo18750B();
        for (Scope scope : values()) {
            if (scope.value.equalsIgnoreCase(B)) {
                return scope;
            }
        }
        throw new JsonException("Invalid scope: " + jsonValue);
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
