package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.a */
public final class C37643a {

    /* renamed from: e */
    public static final int f94465e = 8;
    @C12579k

    /* renamed from: a */
    public final List<CouponModel> f94466a;
    @C12579k

    /* renamed from: b */
    public final List<CouponModel> f94467b;
    @C12579k

    /* renamed from: c */
    public final List<CouponModel> f94468c;
    @C12579k

    /* renamed from: d */
    public final List<CouponsFilter> f94469d;

    public C37643a() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C37643a m154327f(C37643a aVar, List<CouponModel> list, List<CouponModel> list2, List<CouponModel> list3, List<CouponsFilter> list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f94466a;
        }
        if ((i & 2) != 0) {
            list2 = aVar.f94467b;
        }
        if ((i & 4) != 0) {
            list3 = aVar.f94468c;
        }
        if ((i & 8) != 0) {
            list4 = aVar.f94469d;
        }
        return aVar.mo114613e(list, list2, list3, list4);
    }

    @C12579k
    /* renamed from: a */
    public final List<CouponModel> mo114609a() {
        return this.f94466a;
    }

    @C12579k
    /* renamed from: b */
    public final List<CouponModel> mo114610b() {
        return this.f94467b;
    }

    @C12579k
    /* renamed from: c */
    public final List<CouponModel> mo114611c() {
        return this.f94468c;
    }

    @C12579k
    /* renamed from: d */
    public final List<CouponsFilter> mo114612d() {
        return this.f94469d;
    }

    @C12579k
    /* renamed from: e */
    public final C37643a mo114613e(@C12579k List<CouponModel> list, @C12579k List<CouponModel> list2, @C12579k List<CouponModel> list3, @C12579k List<CouponsFilter> list4) {
        Intrinsics.checkNotNullParameter(list, "onlineCoupons");
        Intrinsics.checkNotNullParameter(list2, "inStoreCoupons");
        Intrinsics.checkNotNullParameter(list3, "burnedCoupons");
        Intrinsics.checkNotNullParameter(list4, "couponFilters");
        return new C37643a(list, list2, list3, list4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37643a)) {
            return false;
        }
        C37643a aVar = (C37643a) obj;
        return Intrinsics.areEqual((Object) this.f94466a, (Object) aVar.f94466a) && Intrinsics.areEqual((Object) this.f94467b, (Object) aVar.f94467b) && Intrinsics.areEqual((Object) this.f94468c, (Object) aVar.f94468c) && Intrinsics.areEqual((Object) this.f94469d, (Object) aVar.f94469d);
    }

    @C12579k
    /* renamed from: g */
    public final List<CouponModel> mo114615g() {
        return this.f94468c;
    }

    @C12579k
    /* renamed from: h */
    public final List<CouponsFilter> mo114616h() {
        return this.f94469d;
    }

    public int hashCode() {
        return (((((this.f94466a.hashCode() * 31) + this.f94467b.hashCode()) * 31) + this.f94468c.hashCode()) * 31) + this.f94469d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<CouponModel> mo114618i() {
        return this.f94467b;
    }

    @C12579k
    /* renamed from: j */
    public final List<CouponModel> mo114619j() {
        return this.f94466a;
    }

    @C12579k
    public String toString() {
        List<CouponModel> list = this.f94466a;
        List<CouponModel> list2 = this.f94467b;
        List<CouponModel> list3 = this.f94468c;
        List<CouponsFilter> list4 = this.f94469d;
        return "CouponContent(onlineCoupons=" + list + ", inStoreCoupons=" + list2 + ", burnedCoupons=" + list3 + ", couponFilters=" + list4 + ")";
    }

    public C37643a(@C12579k List<CouponModel> list, @C12579k List<CouponModel> list2, @C12579k List<CouponModel> list3, @C12579k List<CouponsFilter> list4) {
        Intrinsics.checkNotNullParameter(list, "onlineCoupons");
        Intrinsics.checkNotNullParameter(list2, "inStoreCoupons");
        Intrinsics.checkNotNullParameter(list3, "burnedCoupons");
        Intrinsics.checkNotNullParameter(list4, "couponFilters");
        this.f94466a = list;
        this.f94467b = list2;
        this.f94468c = list3;
        this.f94469d = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37643a(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list4);
    }
}
