package com.carrefour.fid.android.presentation.viewmodels.coupons;

import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.presentation.models.FilterResult;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.d */
public final class C26221d {
    @C12579k

    /* renamed from: a */
    public final C28892e<C37643a> f64150a;

    /* renamed from: b */
    public final boolean f64151b;
    @C12580l

    /* renamed from: c */
    public final FilterResult f64152c;

    public C26221d() {
        this((C28892e) null, false, (FilterResult) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C26221d m112095e(C26221d dVar, C28892e<C37643a> eVar, boolean z, FilterResult filterResult, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = dVar.f64150a;
        }
        if ((i & 2) != 0) {
            z = dVar.f64151b;
        }
        if ((i & 4) != 0) {
            filterResult = dVar.f64152c;
        }
        return dVar.mo76281d(eVar, z, filterResult);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<C37643a> mo76278a() {
        return this.f64150a;
    }

    /* renamed from: b */
    public final boolean mo76279b() {
        return this.f64151b;
    }

    @C12580l
    /* renamed from: c */
    public final FilterResult mo76280c() {
        return this.f64152c;
    }

    @C12579k
    /* renamed from: d */
    public final C26221d mo76281d(@C12579k C28892e<C37643a> eVar, boolean z, @C12580l FilterResult filterResult) {
        Intrinsics.checkNotNullParameter(eVar, "couponContent");
        return new C26221d(eVar, z, filterResult);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26221d)) {
            return false;
        }
        C26221d dVar = (C26221d) obj;
        return Intrinsics.areEqual((Object) this.f64150a, (Object) dVar.f64150a) && this.f64151b == dVar.f64151b && Intrinsics.areEqual((Object) this.f64152c, (Object) dVar.f64152c);
    }

    @C12579k
    /* renamed from: f */
    public final C28892e<C37643a> mo76283f() {
        return this.f64150a;
    }

    @C12580l
    /* renamed from: g */
    public final FilterResult mo76284g() {
        return this.f64152c;
    }

    /* renamed from: h */
    public final boolean mo76285h() {
        return this.f64151b;
    }

    public int hashCode() {
        int hashCode = this.f64150a.hashCode() * 31;
        boolean z = this.f64151b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        FilterResult filterResult = this.f64152c;
        return i + (filterResult == null ? 0 : filterResult.hashCode());
    }

    @C12579k
    public String toString() {
        C28892e<C37643a> eVar = this.f64150a;
        boolean z = this.f64151b;
        FilterResult filterResult = this.f64152c;
        return "CouponsListState(couponContent=" + eVar + ", isOnlineOnly=" + z + ", filterChanged=" + filterResult + ")";
    }

    public C26221d(@C12579k C28892e<C37643a> eVar, boolean z, @C12580l FilterResult filterResult) {
        Intrinsics.checkNotNullParameter(eVar, "couponContent");
        this.f64150a = eVar;
        this.f64151b = z;
        this.f64152c = filterResult;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26221d(C28892e eVar, boolean z, FilterResult filterResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : filterResult);
    }
}
