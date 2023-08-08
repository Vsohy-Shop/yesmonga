package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkg;
import com.google.mlkit.vision.text.C34079e;

@C40473a
/* renamed from: com.google.mlkit.vision.text.internal.a */
public final class C34084a {
    /* renamed from: a */
    public static zzkg m137031a(@C34079e.C34080a int i) {
        if (i == 1) {
            return zzkg.LATIN;
        }
        if (i == 2) {
            return zzkg.LATIN_AND_CHINESE;
        }
        if (i == 3) {
            return zzkg.LATIN_AND_DEVANAGARI;
        }
        if (i == 4) {
            return zzkg.LATIN_AND_JAPANESE;
        }
        if (i != 5) {
            return zzkg.TYPE_UNKNOWN;
        }
        return zzkg.LATIN_AND_KOREAN;
    }
}
