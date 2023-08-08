package com.carrefour.fid.android.domain.models.product;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.d */
public final class C38105d {
    @C12579k

    /* renamed from: a */
    public final String f96347a;
    @C12579k

    /* renamed from: b */
    public final List<C38112f> f96348b;

    public /* synthetic */ C38105d(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    /* renamed from: d */
    public static /* synthetic */ C38105d m157536d(C38105d dVar, String str, List<C38112f> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f96347a;
        }
        if ((i & 2) != 0) {
            list = dVar.f96348b;
        }
        return dVar.mo118669c(str, list);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118667a() {
        return this.f96347a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38112f> mo118668b() {
        return this.f96348b;
    }

    @C12579k
    /* renamed from: c */
    public final C38105d mo118669c(@C12579k String str, @C12579k List<C38112f> list) {
        Intrinsics.checkNotNullParameter(str, "filter");
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.C32532b.f78927O);
        return new C38105d(str, list, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public final String mo118670e() {
        return this.f96347a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38105d)) {
            return false;
        }
        C38105d dVar = (C38105d) obj;
        return C38102a.m157523d(this.f96347a, dVar.f96347a) && Intrinsics.areEqual((Object) this.f96348b, (Object) dVar.f96348b);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38112f> mo118672f() {
        return this.f96348b;
    }

    public int hashCode() {
        return (C38102a.m157524f(this.f96347a) * 31) + this.f96348b.hashCode();
    }

    @C12579k
    public String toString() {
        String g = C38102a.m157525g(this.f96347a);
        List<C38112f> list = this.f96348b;
        return "FilterSelection(filter=" + g + ", term=" + list + ")";
    }

    public C38105d(String str, List<C38112f> list) {
        Intrinsics.checkNotNullParameter(str, "filter");
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.C32532b.f78927O);
        this.f96347a = str;
        this.f96348b = list;
    }
}
