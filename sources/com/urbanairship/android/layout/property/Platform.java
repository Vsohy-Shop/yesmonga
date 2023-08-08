package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum Platform {
    ANDROID("android"),
    IOS("ios"),
    WEB("web");
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    Platform(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static Platform m147682b(@C0359n0 String str) throws JsonException {
        for (Platform platform : values()) {
            if (platform.value.equals(str.toLowerCase(Locale.ROOT))) {
                return platform;
            }
        }
        throw new JsonException("Unknown Platform value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
