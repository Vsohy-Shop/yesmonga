package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.json.JsonException;
import java.util.Locale;

public enum BannerPosition {
    f88431a(C9156c.f24820X),
    BOTTOM(C9156c.f24821Y);
    
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    BannerPosition(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static BannerPosition m147626b(@C0359n0 String str) throws JsonException {
        for (BannerPosition bannerPosition : values()) {
            if (bannerPosition.value.equals(str.toLowerCase(Locale.ROOT))) {
                return bannerPosition;
            }
        }
        throw new JsonException("Unknown BannerPosition value: " + str);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
