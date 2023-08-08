package com.carrefour.fid.android.analytics.data.analytics;

import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13794f;
import com.google.android.datatransport.cct.C40045d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.g */
public final class C13812g implements C13813h {
    @C12579k

    /* renamed from: a */
    public final FirebaseEventKey f33678a;
    @C12579k

    /* renamed from: b */
    public final String f33679b;
    @C12579k

    /* renamed from: c */
    public final String f33680c;
    @C12579k

    /* renamed from: d */
    public final C13794f f33681d;

    public C13812g(@C12579k FirebaseEventKey firebaseEventKey, @C12579k String str, @C12579k String str2, @C12579k C13794f fVar) {
        Intrinsics.checkNotNullParameter(firebaseEventKey, "event");
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenClass");
        Intrinsics.checkNotNullParameter(fVar, C40045d.f102104u);
        this.f33678a = firebaseEventKey;
        this.f33679b = str;
        this.f33680c = str2;
        this.f33681d = fVar;
    }

    @C12579k
    /* renamed from: a */
    public final FirebaseEventKey mo32727a() {
        return this.f33678a;
    }

    @C12579k
    /* renamed from: b */
    public final C13794f mo32728b() {
        return this.f33681d;
    }

    @C12579k
    /* renamed from: c */
    public final String mo32729c() {
        return this.f33680c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo32730d() {
        return this.f33679b;
    }
}
