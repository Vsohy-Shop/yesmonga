package com.carrefour.fid.android.domain.models.additionalorder;

import com.carrefour.fid.android.domain.models.order.C38078a;
import com.carrefour.fid.android.domain.models.service.models.C38153f;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.additionalorder.a */
public final class C37952a {
    @C12579k

    /* renamed from: a */
    public final String f95455a;
    @C12579k

    /* renamed from: b */
    public final String f95456b;
    @C12579k

    /* renamed from: c */
    public final String f95457c;
    @C12579k

    /* renamed from: d */
    public final String f95458d;

    public /* synthetic */ C37952a(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    /* renamed from: f */
    public static /* synthetic */ C37952a m155969f(C37952a aVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f95455a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f95456b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f95457c;
        }
        if ((i & 8) != 0) {
            str4 = aVar.f95458d;
        }
        return aVar.mo116798e(str, str2, str3, str4);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116794a() {
        return this.f95455a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116795b() {
        return this.f95456b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo116796c() {
        return this.f95457c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo116797d() {
        return this.f95458d;
    }

    @C12579k
    /* renamed from: e */
    public final C37952a mo116798e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str3, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str4, "metiRef");
        return new C37952a(str, str2, str3, str4, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37952a)) {
            return false;
        }
        C37952a aVar = (C37952a) obj;
        return C38078a.m157203d(this.f95455a, aVar.f95455a) && FacilityServiceId.m157962f(this.f95456b, aVar.f95456b) && SlotId.m158312f(this.f95457c, aVar.f95457c) && C38153f.m158112e(this.f95458d, aVar.f95458d);
    }

    @C12579k
    /* renamed from: g */
    public final String mo116800g() {
        return this.f95456b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo116801h() {
        return this.f95458d;
    }

    public int hashCode() {
        return (((((C38078a.m157204f(this.f95455a) * 31) + FacilityServiceId.m157963h(this.f95456b)) * 31) + SlotId.m158313h(this.f95457c)) * 31) + C38153f.m158113g(this.f95458d);
    }

    @C12579k
    /* renamed from: i */
    public final String mo116803i() {
        return this.f95455a;
    }

    @C12579k
    /* renamed from: j */
    public final String mo116804j() {
        return this.f95457c;
    }

    @C12579k
    public String toString() {
        String g = C38078a.m157205g(this.f95455a);
        String i = FacilityServiceId.m157964i(this.f95456b);
        String i2 = SlotId.m158314i(this.f95457c);
        String h = C38153f.m158114h(this.f95458d);
        return "AdditionalOrderContext(orderId=" + g + ", facilityServiceId=" + i + ", slotId=" + i2 + ", metiRef=" + h + ")";
    }

    public C37952a(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str3, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str4, "metiRef");
        this.f95455a = str;
        this.f95456b = str2;
        this.f95457c = str3;
        this.f95458d = str4;
    }
}
