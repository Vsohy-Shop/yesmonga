package com.carrefour.fid.android.analytics.data.analytics;

import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13794f;
import com.google.android.datatransport.cct.C40045d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.f */
public final class C13788f implements C13813h {
    @C12579k

    /* renamed from: a */
    public final List<FirebaseEventKey> f33558a;
    @C12579k

    /* renamed from: b */
    public final String f33559b;
    @C12579k

    /* renamed from: c */
    public final String f33560c;
    @C12579k

    /* renamed from: d */
    public final C13794f f33561d;

    public C13788f(@C12579k List<? extends FirebaseEventKey> list, @C12579k String str, @C12579k String str2, @C12579k C13794f fVar) {
        Intrinsics.checkNotNullParameter(list, "events");
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenClass");
        Intrinsics.checkNotNullParameter(fVar, C40045d.f102104u);
        this.f33558a = list;
        this.f33559b = str;
        this.f33560c = str2;
        this.f33561d = fVar;
    }

    @C12579k
    /* renamed from: a */
    public final List<FirebaseEventKey> mo32717a() {
        return this.f33558a;
    }

    @C12579k
    /* renamed from: b */
    public final C13794f mo32718b() {
        return this.f33561d;
    }

    @C12579k
    /* renamed from: c */
    public final String mo32719c() {
        return this.f33560c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo32720d() {
        return this.f33559b;
    }
}
