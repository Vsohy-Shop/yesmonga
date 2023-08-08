package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.util.a0 */
public class C40964a0 {
    @C40473a
    @Deprecated
    /* renamed from: a */
    public static void m166574a(@C0359n0 Context context, @C0359n0 SharedPreferences.Editor editor, @C0359n0 String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
