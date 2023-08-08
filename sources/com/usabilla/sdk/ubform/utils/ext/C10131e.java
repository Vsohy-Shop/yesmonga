package com.usabilla.sdk.ubform.utils.ext;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.e */
public final class C10131e {
    @C12579k
    /* renamed from: a */
    public static final Bundle m38336a(@C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    @C12579k
    /* renamed from: b */
    public static final Map<String, String> m38337b(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            String string = bundle.getString(next);
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(next, "key");
                hashMap.put(next, string);
            }
        }
        return hashMap;
    }
}
