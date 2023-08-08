package com.carrefour.fid.android.domain.models.product;

import com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.c */
public final class C38104c {
    @C12579k

    /* renamed from: a */
    public final List<C38105d> f96345a;
    @C12579k

    /* renamed from: b */
    public final List<C38111e> f96346b;

    public C38104c(@C12579k List<C38105d> list, @C12579k List<C38111e> list2) {
        Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(list2, "sorts");
        this.f96345a = list;
        this.f96346b = list2;
    }

    /* renamed from: d */
    public static /* synthetic */ C38104c m157530d(C38104c cVar, List<C38105d> list, List<C38111e> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.f96345a;
        }
        if ((i & 2) != 0) {
            list2 = cVar.f96346b;
        }
        return cVar.mo118661c(list, list2);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38105d> mo118659a() {
        return this.f96345a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38111e> mo118660b() {
        return this.f96346b;
    }

    @C12579k
    /* renamed from: c */
    public final C38104c mo118661c(@C12579k List<C38105d> list, @C12579k List<C38111e> list2) {
        Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
        Intrinsics.checkNotNullParameter(list2, "sorts");
        return new C38104c(list, list2);
    }

    @C12579k
    /* renamed from: e */
    public final List<C38105d> mo118662e() {
        return this.f96345a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38104c)) {
            return false;
        }
        C38104c cVar = (C38104c) obj;
        return Intrinsics.areEqual((Object) this.f96345a, (Object) cVar.f96345a) && Intrinsics.areEqual((Object) this.f96346b, (Object) cVar.f96346b);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38111e> mo118664f() {
        return this.f96346b;
    }

    public int hashCode() {
        return (this.f96345a.hashCode() * 31) + this.f96346b.hashCode();
    }

    @C12579k
    public String toString() {
        List<C38105d> list = this.f96345a;
        List<C38111e> list2 = this.f96346b;
        return "FacetSelection(filters=" + list + ", sorts=" + list2 + ")";
    }
}
