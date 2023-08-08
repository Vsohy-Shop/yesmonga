package com.carrefour.fid.android.analytics.data.analytics;

import com.google.firebase.crashlytics.C32648f;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.c */
public final class C13785c implements C13813h {
    @C12579k

    /* renamed from: a */
    public final Map<String, String> f33549a;

    /* renamed from: b */
    public final boolean f33550b;

    public C13785c(@C12579k Map<String, String> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, C32648f.f79206e);
        this.f33549a = map;
        this.f33550b = z;
    }

    /* renamed from: a */
    public final boolean mo32714a() {
        return this.f33550b;
    }

    @C12579k
    /* renamed from: b */
    public final Map<String, String> mo32715b() {
        return this.f33549a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13785c(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? false : z);
    }
}
