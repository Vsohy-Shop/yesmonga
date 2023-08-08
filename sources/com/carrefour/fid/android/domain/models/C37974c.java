package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.c */
public final class C37974c {

    /* renamed from: d */
    public static final int f95544d = 8;
    @C12580l

    /* renamed from: a */
    public final List<C38015d> f95545a;
    @C12580l

    /* renamed from: b */
    public final List<C38015d> f95546b;
    @C12580l

    /* renamed from: c */
    public final List<C38015d> f95547c;

    public C37974c() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C37974c m156175e(C37974c cVar, List<C38015d> list, List<C38015d> list2, List<C38015d> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.f95545a;
        }
        if ((i & 2) != 0) {
            list2 = cVar.f95546b;
        }
        if ((i & 4) != 0) {
            list3 = cVar.f95547c;
        }
        return cVar.mo117037d(list, list2, list3);
    }

    @C12580l
    /* renamed from: a */
    public final List<C38015d> mo117034a() {
        return this.f95545a;
    }

    @C12580l
    /* renamed from: b */
    public final List<C38015d> mo117035b() {
        return this.f95546b;
    }

    @C12580l
    /* renamed from: c */
    public final List<C38015d> mo117036c() {
        return this.f95547c;
    }

    @C12579k
    /* renamed from: d */
    public final C37974c mo117037d(@C12580l List<C38015d> list, @C12580l List<C38015d> list2, @C12580l List<C38015d> list3) {
        return new C37974c(list, list2, list3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37974c)) {
            return false;
        }
        C37974c cVar = (C37974c) obj;
        return Intrinsics.areEqual((Object) this.f95545a, (Object) cVar.f95545a) && Intrinsics.areEqual((Object) this.f95546b, (Object) cVar.f95546b) && Intrinsics.areEqual((Object) this.f95547c, (Object) cVar.f95547c);
    }

    @C12580l
    /* renamed from: f */
    public final List<C38015d> mo117039f() {
        return this.f95547c;
    }

    @C12580l
    /* renamed from: g */
    public final List<C38015d> mo117040g() {
        return this.f95546b;
    }

    @C12580l
    /* renamed from: h */
    public final List<C38015d> mo117041h() {
        return this.f95545a;
    }

    public int hashCode() {
        List<C38015d> list = this.f95545a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C38015d> list2 = this.f95546b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<C38015d> list3 = this.f95547c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<C38015d> list = this.f95545a;
        List<C38015d> list2 = this.f95546b;
        List<C38015d> list3 = this.f95547c;
        return "CouponContentDomain(onlineCoupons=" + list + ", inStoreCoupons=" + list2 + ", burnedCoupons=" + list3 + ")";
    }

    public C37974c(@C12580l List<C38015d> list, @C12580l List<C38015d> list2, @C12580l List<C38015d> list3) {
        this.f95545a = list;
        this.f95546b = list2;
        this.f95547c = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37974c(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
