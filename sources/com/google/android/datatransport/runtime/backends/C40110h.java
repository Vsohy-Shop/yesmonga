package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.runtime.backends.h */
public abstract class C40110h {

    /* renamed from: a */
    public static final String f102330a = "cct";

    /* renamed from: a */
    public static C40110h m163307a(Context context, C40309a aVar, C40309a aVar2) {
        return new C40104c(context, aVar, aVar2, "cct");
    }

    /* renamed from: b */
    public static C40110h m163308b(Context context, C40309a aVar, C40309a aVar2, String str) {
        return new C40104c(context, aVar, aVar2, str);
    }

    /* renamed from: c */
    public abstract Context mo132708c();

    @C0359n0
    /* renamed from: d */
    public abstract String mo132709d();

    /* renamed from: e */
    public abstract C40309a mo132710e();

    /* renamed from: f */
    public abstract C40309a mo132712f();
}
