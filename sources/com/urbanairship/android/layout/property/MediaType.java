package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum MediaType {
    IMAGE(C9127a0.f24709d),
    VIDEO(C9127a0.f24710e),
    YOUTUBE(C9127a0.f24711f);
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    MediaType(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static MediaType m147680b(@C0359n0 String str) throws JsonException {
        for (MediaType mediaType : values()) {
            if (mediaType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return mediaType;
            }
        }
        throw new JsonException("Unknown MediaType value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
