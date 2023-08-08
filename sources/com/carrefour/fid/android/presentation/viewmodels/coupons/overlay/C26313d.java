package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.models.Image;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.d */
public final class C26313d {
    @C12579k

    /* renamed from: a */
    public final C28892e<C11079d2> f64320a;
    @C12579k

    /* renamed from: b */
    public final CouponModel f64321b;

    public C26313d() {
        this((C28892e) null, (CouponModel) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C26313d m112345d(C26313d dVar, C28892e<C11079d2> eVar, CouponModel couponModel, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = dVar.f64320a;
        }
        if ((i & 2) != 0) {
            couponModel = dVar.f64321b;
        }
        return dVar.mo76572c(eVar, couponModel);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<C11079d2> mo76570a() {
        return this.f64320a;
    }

    @C12579k
    /* renamed from: b */
    public final CouponModel mo76571b() {
        return this.f64321b;
    }

    @C12579k
    /* renamed from: c */
    public final C26313d mo76572c(@C12579k C28892e<C11079d2> eVar, @C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(eVar, "couponDetailsStatus");
        Intrinsics.checkNotNullParameter(couponModel, "couponModel");
        return new C26313d(eVar, couponModel);
    }

    @C12579k
    /* renamed from: e */
    public final C28892e<C11079d2> mo76573e() {
        return this.f64320a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26313d)) {
            return false;
        }
        C26313d dVar = (C26313d) obj;
        return Intrinsics.areEqual((Object) this.f64320a, (Object) dVar.f64320a) && Intrinsics.areEqual((Object) this.f64321b, (Object) dVar.f64321b);
    }

    @C12579k
    /* renamed from: f */
    public final CouponModel mo76575f() {
        return this.f64321b;
    }

    public int hashCode() {
        return (this.f64320a.hashCode() * 31) + this.f64321b.hashCode();
    }

    @C12579k
    public String toString() {
        C28892e<C11079d2> eVar = this.f64320a;
        CouponModel couponModel = this.f64321b;
        return "OverlayCouponDetailsBottomState(couponDetailsStatus=" + eVar + ", couponModel=" + couponModel + ")";
    }

    public C26313d(@C12579k C28892e<C11079d2> eVar, @C12579k CouponModel couponModel) {
        Intrinsics.checkNotNullParameter(eVar, "couponDetailsStatus");
        Intrinsics.checkNotNullParameter(couponModel, "couponModel");
        this.f64320a = eVar;
        this.f64321b = couponModel;
    }

    public /* synthetic */ C26313d(C28892e eVar, CouponModel couponModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C26313d dVar;
        CouponModel couponModel2;
        C28892e eVar2 = (i & 1) != 0 ? C28892e.C28896d.f70785b : eVar;
        if ((i & 2) != 0) {
            couponModel2 = new CouponModel(0, (String) null, (String) null, (String) null, (CouponType) null, (String) null, (String) null, 0, (String) null, (List) null, (String) null, (Double) null, (DiscountType) null, (String) null, (CouponStatus) null, (Image) null, (List) null, (String) null, (Facility) null, (String) null, (CouponModel.State) null, (String) null, 4194303, (DefaultConstructorMarker) null);
            dVar = this;
        } else {
            dVar = this;
            couponModel2 = couponModel;
        }
        new C26313d(eVar2, couponModel2);
    }
}
