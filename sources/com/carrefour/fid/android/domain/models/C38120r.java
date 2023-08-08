package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.urbanairship.util.C9647e0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.r */
public final class C38120r {

    /* renamed from: F */
    public static final int f96468F = 8;
    @C12579k

    /* renamed from: A */
    public final List<InvoicesInfoDomain> f96469A;
    @C12579k

    /* renamed from: B */
    public final List<C38079p> f96470B;

    /* renamed from: C */
    public final boolean f96471C;

    /* renamed from: D */
    public final boolean f96472D;
    @C12579k

    /* renamed from: E */
    public final String f96473E;

    /* renamed from: a */
    public final boolean f96474a;
    @C12580l

    /* renamed from: b */
    public final Long f96475b;
    @C12580l

    /* renamed from: c */
    public final C38120r f96476c;
    @C12579k

    /* renamed from: d */
    public final String f96477d;
    @C12580l

    /* renamed from: e */
    public OrderType f96478e;
    @C12580l

    /* renamed from: f */
    public OrderStatus f96479f;

    /* renamed from: g */
    public double f96480g;
    @C12580l

    /* renamed from: h */
    public Double f96481h;
    @C12579k

    /* renamed from: i */
    public String f96482i;
    @C12579k

    /* renamed from: j */
    public String f96483j;
    @C12579k

    /* renamed from: k */
    public final String f96484k;
    @C12579k

    /* renamed from: l */
    public final String f96485l;
    @C12579k

    /* renamed from: m */
    public String f96486m;
    @C12579k

    /* renamed from: n */
    public String f96487n;
    @C12579k

    /* renamed from: o */
    public C38119q f96488o;
    @C12579k

    /* renamed from: p */
    public final String f96489p;
    @C12579k

    /* renamed from: q */
    public final String f96490q;
    @C12579k

    /* renamed from: r */
    public final String f96491r;
    @C12579k

    /* renamed from: s */
    public final String f96492s;
    @C12579k

    /* renamed from: t */
    public String f96493t;
    @C12579k

    /* renamed from: u */
    public String f96494u;
    @C12579k

    /* renamed from: v */
    public String f96495v;

    /* renamed from: w */
    public boolean f96496w;
    @C12579k

    /* renamed from: x */
    public final List<C38121s> f96497x;
    @C12579k

    /* renamed from: y */
    public final String f96498y;
    @C12579k

    /* renamed from: z */
    public final String f96499z;

    public C38120r() {
        this(false, (Long) null, (C38120r) null, (String) null, (OrderType) null, (OrderStatus) null, 0.0d, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C38119q) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, (String) null, (String) null, (List) null, (List) null, false, false, (String) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* renamed from: G */
    public static /* synthetic */ C38120r m157790G(C38120r rVar, boolean z, Long l, C38120r rVar2, String str, OrderType orderType, OrderStatus orderStatus, double d, Double d2, String str2, String str3, String str4, String str5, String str6, String str7, C38119q qVar, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z2, List list, String str15, String str16, List list2, List list3, boolean z3, boolean z4, String str17, int i, Object obj) {
        C38120r rVar3 = rVar;
        int i2 = i;
        return rVar.mo118935F((i2 & 1) != 0 ? rVar3.f96474a : z, (i2 & 2) != 0 ? rVar3.f96475b : l, (i2 & 4) != 0 ? rVar3.f96476c : rVar2, (i2 & 8) != 0 ? rVar3.f96477d : str, (i2 & 16) != 0 ? rVar3.f96478e : orderType, (i2 & 32) != 0 ? rVar3.f96479f : orderStatus, (i2 & 64) != 0 ? rVar3.f96480g : d, (i2 & 128) != 0 ? rVar3.f96481h : d2, (i2 & 256) != 0 ? rVar3.f96482i : str2, (i2 & 512) != 0 ? rVar3.f96483j : str3, (i2 & 1024) != 0 ? rVar3.f96484k : str4, (i2 & 2048) != 0 ? rVar3.f96485l : str5, (i2 & 4096) != 0 ? rVar3.f96486m : str6, (i2 & 8192) != 0 ? rVar3.f96487n : str7, (i2 & 16384) != 0 ? rVar3.f96488o : qVar, (i2 & 32768) != 0 ? rVar3.f96489p : str8, (i2 & 65536) != 0 ? rVar3.f96490q : str9, (i2 & 131072) != 0 ? rVar3.f96491r : str10, (i2 & 262144) != 0 ? rVar3.f96492s : str11, (i2 & 524288) != 0 ? rVar3.f96493t : str12, (i2 & 1048576) != 0 ? rVar3.f96494u : str13, (i2 & 2097152) != 0 ? rVar3.f96495v : str14, (i2 & 4194304) != 0 ? rVar3.f96496w : z2, (i2 & 8388608) != 0 ? rVar3.f96497x : list, (i2 & 16777216) != 0 ? rVar3.f96498y : str15, (i2 & C9647e0.f26435a) != 0 ? rVar3.f96499z : str16, (i2 & C8698y1.f23302n) != 0 ? rVar3.f96469A : list2, (i2 & C8698y1.f23301m) != 0 ? rVar3.f96470B : list3, (i2 & 268435456) != 0 ? rVar3.f96471C : z3, (i2 & 536870912) != 0 ? rVar3.f96472D : z4, (i2 & 1073741824) != 0 ? rVar3.f96473E : str17);
    }

    @C12580l
    /* renamed from: A */
    public final OrderType mo118930A() {
        return this.f96478e;
    }

    @C12580l
    /* renamed from: B */
    public final OrderStatus mo118931B() {
        return this.f96479f;
    }

    /* renamed from: C */
    public final double mo118932C() {
        return this.f96480g;
    }

    @C12580l
    /* renamed from: D */
    public final Double mo118933D() {
        return this.f96481h;
    }

    @C12579k
    /* renamed from: E */
    public final String mo118934E() {
        return this.f96482i;
    }

    @C12579k
    /* renamed from: F */
    public final C38120r mo118935F(boolean z, @C12580l Long l, @C12580l C38120r rVar, @C12579k String str, @C12580l OrderType orderType, @C12580l OrderStatus orderStatus, double d, @C12580l Double d2, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k C38119q qVar, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, boolean z2, @C12579k List<C38121s> list, @C12579k String str15, @C12579k String str16, @C12579k List<InvoicesInfoDomain> list2, @C12579k List<C38079p> list3, boolean z3, boolean z4, @C12579k String str17) {
        boolean z5 = z;
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(str2, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(str3, "lastUpdateDateTime");
        Intrinsics.checkNotNullParameter(str4, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str5, "metiRef");
        Intrinsics.checkNotNullParameter(str6, "storeName");
        Intrinsics.checkNotNullParameter(str7, "address");
        Intrinsics.checkNotNullParameter(qVar, "deliveryAddress");
        Intrinsics.checkNotNullParameter(str8, "slotBeginDate");
        Intrinsics.checkNotNullParameter(str9, "slotEndDate");
        Intrinsics.checkNotNullParameter(str10, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str11, "pickingEligibility");
        Intrinsics.checkNotNullParameter(str12, "downloadUrl");
        Intrinsics.checkNotNullParameter(str13, "refundUrl");
        Intrinsics.checkNotNullParameter(str14, "cancelUrl");
        Intrinsics.checkNotNullParameter(list, "orderProductList");
        Intrinsics.checkNotNullParameter(str15, "orderPaymentDate");
        Intrinsics.checkNotNullParameter(str16, "invoiceUrl");
        Intrinsics.checkNotNullParameter(list2, "invoicesInfo");
        Intrinsics.checkNotNullParameter(list3, "allowanceChargeList");
        Intrinsics.checkNotNullParameter(str17, "trackingUrl");
        return new C38120r(z, l, rVar, str, orderType, orderStatus, d, d2, str2, str3, str4, str5, str6, str7, qVar, str8, str9, str10, str11, str12, str13, str14, z2, list, str15, str16, list2, list3, z3, z4, str17);
    }

    @C12580l
    /* renamed from: H */
    public final C38120r mo118936H() {
        return this.f96476c;
    }

    /* renamed from: I */
    public final boolean mo118937I() {
        return this.f96474a;
    }

    @C12580l
    /* renamed from: J */
    public final Long mo118938J() {
        return this.f96475b;
    }

    @C12579k
    /* renamed from: K */
    public final String mo118939K() {
        return this.f96487n;
    }

    @C12579k
    /* renamed from: L */
    public final List<C38079p> mo118940L() {
        return this.f96470B;
    }

    @C12579k
    /* renamed from: M */
    public final String mo118941M() {
        return this.f96495v;
    }

    @C12579k
    /* renamed from: N */
    public final C38119q mo118942N() {
        return this.f96488o;
    }

    @C12579k
    /* renamed from: O */
    public final String mo118943O() {
        return this.f96493t;
    }

    @C12579k
    /* renamed from: P */
    public final String mo118944P() {
        return this.f96484k;
    }

    @C12579k
    /* renamed from: Q */
    public final String mo118945Q() {
        return this.f96499z;
    }

    @C12579k
    /* renamed from: R */
    public final List<InvoicesInfoDomain> mo118946R() {
        return this.f96469A;
    }

    @C12579k
    /* renamed from: S */
    public final String mo118947S() {
        return this.f96483j;
    }

    @C12579k
    /* renamed from: T */
    public final String mo118948T() {
        return this.f96485l;
    }

    /* renamed from: U */
    public final double mo118949U() {
        return this.f96480g;
    }

    @C12579k
    /* renamed from: V */
    public final String mo118950V() {
        return this.f96482i;
    }

    @C12579k
    /* renamed from: W */
    public final String mo118951W() {
        return this.f96477d;
    }

    @C12579k
    /* renamed from: X */
    public final String mo118952X() {
        return this.f96498y;
    }

    @C12580l
    /* renamed from: Y */
    public final Double mo118953Y() {
        return this.f96481h;
    }

    @C12579k
    /* renamed from: Z */
    public final List<C38121s> mo118954Z() {
        return this.f96497x;
    }

    /* renamed from: a */
    public final boolean mo118955a() {
        return this.f96474a;
    }

    @C12580l
    /* renamed from: a0 */
    public final OrderStatus mo118956a0() {
        return this.f96479f;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118957b() {
        return this.f96483j;
    }

    @C12580l
    /* renamed from: b0 */
    public final OrderType mo118958b0() {
        return this.f96478e;
    }

    @C12579k
    /* renamed from: c */
    public final String mo118959c() {
        return this.f96484k;
    }

    @C12579k
    /* renamed from: c0 */
    public final String mo118960c0() {
        return this.f96492s;
    }

    @C12579k
    /* renamed from: d */
    public final String mo118961d() {
        return this.f96485l;
    }

    @C12579k
    /* renamed from: d0 */
    public final String mo118962d0() {
        return this.f96494u;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118963e() {
        return this.f96486m;
    }

    @C12579k
    /* renamed from: e0 */
    public final String mo118964e0() {
        return this.f96489p;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38120r)) {
            return false;
        }
        C38120r rVar = (C38120r) obj;
        return this.f96474a == rVar.f96474a && Intrinsics.areEqual((Object) this.f96475b, (Object) rVar.f96475b) && Intrinsics.areEqual((Object) this.f96476c, (Object) rVar.f96476c) && Intrinsics.areEqual((Object) this.f96477d, (Object) rVar.f96477d) && Intrinsics.areEqual((Object) this.f96478e, (Object) rVar.f96478e) && Intrinsics.areEqual((Object) this.f96479f, (Object) rVar.f96479f) && Double.compare(this.f96480g, rVar.f96480g) == 0 && Intrinsics.areEqual((Object) this.f96481h, (Object) rVar.f96481h) && Intrinsics.areEqual((Object) this.f96482i, (Object) rVar.f96482i) && Intrinsics.areEqual((Object) this.f96483j, (Object) rVar.f96483j) && Intrinsics.areEqual((Object) this.f96484k, (Object) rVar.f96484k) && Intrinsics.areEqual((Object) this.f96485l, (Object) rVar.f96485l) && Intrinsics.areEqual((Object) this.f96486m, (Object) rVar.f96486m) && Intrinsics.areEqual((Object) this.f96487n, (Object) rVar.f96487n) && Intrinsics.areEqual((Object) this.f96488o, (Object) rVar.f96488o) && Intrinsics.areEqual((Object) this.f96489p, (Object) rVar.f96489p) && Intrinsics.areEqual((Object) this.f96490q, (Object) rVar.f96490q) && Intrinsics.areEqual((Object) this.f96491r, (Object) rVar.f96491r) && Intrinsics.areEqual((Object) this.f96492s, (Object) rVar.f96492s) && Intrinsics.areEqual((Object) this.f96493t, (Object) rVar.f96493t) && Intrinsics.areEqual((Object) this.f96494u, (Object) rVar.f96494u) && Intrinsics.areEqual((Object) this.f96495v, (Object) rVar.f96495v) && this.f96496w == rVar.f96496w && Intrinsics.areEqual((Object) this.f96497x, (Object) rVar.f96497x) && Intrinsics.areEqual((Object) this.f96498y, (Object) rVar.f96498y) && Intrinsics.areEqual((Object) this.f96499z, (Object) rVar.f96499z) && Intrinsics.areEqual((Object) this.f96469A, (Object) rVar.f96469A) && Intrinsics.areEqual((Object) this.f96470B, (Object) rVar.f96470B) && this.f96471C == rVar.f96471C && this.f96472D == rVar.f96472D && Intrinsics.areEqual((Object) this.f96473E, (Object) rVar.f96473E);
    }

    @C12579k
    /* renamed from: f */
    public final String mo118966f() {
        return this.f96487n;
    }

    @C12579k
    /* renamed from: f0 */
    public final String mo118967f0() {
        return this.f96490q;
    }

    @C12579k
    /* renamed from: g */
    public final C38119q mo118968g() {
        return this.f96488o;
    }

    @C12579k
    /* renamed from: g0 */
    public final String mo118969g0() {
        return this.f96491r;
    }

    @C12579k
    /* renamed from: h */
    public final String mo118970h() {
        return this.f96489p;
    }

    @C12579k
    /* renamed from: h0 */
    public final String mo118971h0() {
        return this.f96486m;
    }

    public int hashCode() {
        boolean z = this.f96474a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Long l = this.f96475b;
        int i2 = 0;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        C38120r rVar = this.f96476c;
        int hashCode2 = (((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f96477d.hashCode()) * 31;
        OrderType orderType = this.f96478e;
        int hashCode3 = (hashCode2 + (orderType == null ? 0 : orderType.hashCode())) * 31;
        OrderStatus orderStatus = this.f96479f;
        int hashCode4 = (((hashCode3 + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31) + Double.hashCode(this.f96480g)) * 31;
        Double d = this.f96481h;
        if (d != null) {
            i2 = d.hashCode();
        }
        int hashCode5 = (((((((((((((((((((((((((((((hashCode4 + i2) * 31) + this.f96482i.hashCode()) * 31) + this.f96483j.hashCode()) * 31) + this.f96484k.hashCode()) * 31) + this.f96485l.hashCode()) * 31) + this.f96486m.hashCode()) * 31) + this.f96487n.hashCode()) * 31) + this.f96488o.hashCode()) * 31) + this.f96489p.hashCode()) * 31) + this.f96490q.hashCode()) * 31) + this.f96491r.hashCode()) * 31) + this.f96492s.hashCode()) * 31) + this.f96493t.hashCode()) * 31) + this.f96494u.hashCode()) * 31) + this.f96495v.hashCode()) * 31;
        boolean z3 = this.f96496w;
        if (z3) {
            z3 = true;
        }
        int hashCode6 = (((((((((((hashCode5 + (z3 ? 1 : 0)) * 31) + this.f96497x.hashCode()) * 31) + this.f96498y.hashCode()) * 31) + this.f96499z.hashCode()) * 31) + this.f96469A.hashCode()) * 31) + this.f96470B.hashCode()) * 31;
        boolean z4 = this.f96471C;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f96472D;
        if (!z5) {
            z2 = z5;
        }
        return ((i3 + (z2 ? 1 : 0)) * 31) + this.f96473E.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo118973i() {
        return this.f96490q;
    }

    @C12579k
    /* renamed from: i0 */
    public final String mo118974i0() {
        return this.f96473E;
    }

    @C12579k
    /* renamed from: j */
    public final String mo118975j() {
        return this.f96491r;
    }

    /* renamed from: j0 */
    public final boolean mo118976j0() {
        return this.f96472D;
    }

    @C12579k
    /* renamed from: k */
    public final String mo118977k() {
        return this.f96492s;
    }

    /* renamed from: k0 */
    public final boolean mo118978k0() {
        return this.f96471C;
    }

    @C12580l
    /* renamed from: l */
    public final Long mo118979l() {
        return this.f96475b;
    }

    /* renamed from: l0 */
    public final boolean mo118980l0() {
        return this.f96496w;
    }

    @C12579k
    /* renamed from: m */
    public final String mo118981m() {
        return this.f96493t;
    }

    /* renamed from: m0 */
    public final void mo118982m0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96487n = str;
    }

    @C12579k
    /* renamed from: n */
    public final String mo118983n() {
        return this.f96494u;
    }

    /* renamed from: n0 */
    public final void mo118984n0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96495v = str;
    }

    @C12579k
    /* renamed from: o */
    public final String mo118985o() {
        return this.f96495v;
    }

    /* renamed from: o0 */
    public final void mo118986o0(@C12579k C38119q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.f96488o = qVar;
    }

    /* renamed from: p */
    public final boolean mo118987p() {
        return this.f96496w;
    }

    /* renamed from: p0 */
    public final void mo118988p0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96493t = str;
    }

    @C12579k
    /* renamed from: q */
    public final List<C38121s> mo118989q() {
        return this.f96497x;
    }

    /* renamed from: q0 */
    public final void mo118990q0(boolean z) {
        this.f96496w = z;
    }

    @C12579k
    /* renamed from: r */
    public final String mo118991r() {
        return this.f96498y;
    }

    /* renamed from: r0 */
    public final void mo118992r0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96483j = str;
    }

    @C12579k
    /* renamed from: s */
    public final String mo118993s() {
        return this.f96499z;
    }

    /* renamed from: s0 */
    public final void mo118994s0(double d) {
        this.f96480g = d;
    }

    @C12579k
    /* renamed from: t */
    public final List<InvoicesInfoDomain> mo118995t() {
        return this.f96469A;
    }

    /* renamed from: t0 */
    public final void mo118996t0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96482i = str;
    }

    @C12579k
    public String toString() {
        boolean z = this.f96474a;
        Long l = this.f96475b;
        C38120r rVar = this.f96476c;
        String str = this.f96477d;
        OrderType orderType = this.f96478e;
        OrderStatus orderStatus = this.f96479f;
        double d = this.f96480g;
        Double d2 = this.f96481h;
        String str2 = this.f96482i;
        String str3 = this.f96483j;
        String str4 = this.f96484k;
        String str5 = this.f96485l;
        String str6 = this.f96486m;
        String str7 = this.f96487n;
        C38119q qVar = this.f96488o;
        String str8 = this.f96489p;
        String str9 = this.f96490q;
        String str10 = this.f96491r;
        String str11 = this.f96492s;
        String str12 = this.f96493t;
        String str13 = this.f96494u;
        String str14 = this.f96495v;
        boolean z2 = this.f96496w;
        List<C38121s> list = this.f96497x;
        String str15 = this.f96498y;
        String str16 = this.f96499z;
        List<InvoicesInfoDomain> list2 = this.f96469A;
        List<C38079p> list3 = this.f96470B;
        boolean z3 = this.f96471C;
        boolean z4 = this.f96472D;
        String str17 = this.f96473E;
        return "OrdersOnlineDetailsDomain(additionalOrderEligible=" + z + ", additionalOrderId=" + l + ", additionalOrder=" + rVar + ", orderId=" + str + ", orderType=" + orderType + ", orderStatus=" + orderStatus + ", orderAmount=" + d + ", orderPreparedAmount=" + d2 + ", orderCreationDateTime=" + str2 + ", lastUpdateDateTime=" + str3 + ", facilityServiceId=" + str4 + ", metiRef=" + str5 + ", storeName=" + str6 + ", address=" + str7 + ", deliveryAddress=" + qVar + ", slotBeginDate=" + str8 + ", slotEndDate=" + str9 + ", slotId=" + str10 + ", pickingEligibility=" + str11 + ", downloadUrl=" + str12 + ", refundUrl=" + str13 + ", cancelUrl=" + str14 + ", isInstorePayment=" + z2 + ", orderProductList=" + list + ", orderPaymentDate=" + str15 + ", invoiceUrl=" + str16 + ", invoicesInfo=" + list2 + ", allowanceChargeList=" + list3 + ", isChangeDeliveryAvailable=" + z3 + ", isCancelOrderAvailable=" + z4 + ", trackingUrl=" + str17 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final List<C38079p> mo118998u() {
        return this.f96470B;
    }

    /* renamed from: u0 */
    public final void mo118999u0(@C12580l Double d) {
        this.f96481h = d;
    }

    /* renamed from: v */
    public final boolean mo119000v() {
        return this.f96471C;
    }

    /* renamed from: v0 */
    public final void mo119001v0(@C12580l OrderStatus orderStatus) {
        this.f96479f = orderStatus;
    }

    @C12580l
    /* renamed from: w */
    public final C38120r mo119002w() {
        return this.f96476c;
    }

    /* renamed from: w0 */
    public final void mo119003w0(@C12580l OrderType orderType) {
        this.f96478e = orderType;
    }

    /* renamed from: x */
    public final boolean mo119004x() {
        return this.f96472D;
    }

    /* renamed from: x0 */
    public final void mo119005x0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96494u = str;
    }

    @C12579k
    /* renamed from: y */
    public final String mo119006y() {
        return this.f96473E;
    }

    /* renamed from: y0 */
    public final void mo119007y0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f96486m = str;
    }

    @C12579k
    /* renamed from: z */
    public final String mo119008z() {
        return this.f96477d;
    }

    public C38120r(boolean z, @C12580l Long l, @C12580l C38120r rVar, @C12579k String str, @C12580l OrderType orderType, @C12580l OrderStatus orderStatus, double d, @C12580l Double d2, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k C38119q qVar, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13, @C12579k String str14, boolean z2, @C12579k List<C38121s> list, @C12579k String str15, @C12579k String str16, @C12579k List<InvoicesInfoDomain> list2, @C12579k List<C38079p> list3, boolean z3, boolean z4, @C12579k String str17) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        C38119q qVar2 = qVar;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        List<C38121s> list4 = list;
        Intrinsics.checkNotNullParameter(str18, "orderId");
        Intrinsics.checkNotNullParameter(str19, "orderCreationDateTime");
        Intrinsics.checkNotNullParameter(str20, "lastUpdateDateTime");
        Intrinsics.checkNotNullParameter(str21, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(str22, "metiRef");
        Intrinsics.checkNotNullParameter(str23, "storeName");
        Intrinsics.checkNotNullParameter(str24, "address");
        Intrinsics.checkNotNullParameter(qVar2, "deliveryAddress");
        Intrinsics.checkNotNullParameter(str25, "slotBeginDate");
        Intrinsics.checkNotNullParameter(str26, "slotEndDate");
        Intrinsics.checkNotNullParameter(str27, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str28, "pickingEligibility");
        Intrinsics.checkNotNullParameter(str29, "downloadUrl");
        Intrinsics.checkNotNullParameter(str13, "refundUrl");
        Intrinsics.checkNotNullParameter(str14, "cancelUrl");
        Intrinsics.checkNotNullParameter(list, "orderProductList");
        Intrinsics.checkNotNullParameter(str15, "orderPaymentDate");
        Intrinsics.checkNotNullParameter(str16, "invoiceUrl");
        Intrinsics.checkNotNullParameter(list2, "invoicesInfo");
        Intrinsics.checkNotNullParameter(list3, "allowanceChargeList");
        Intrinsics.checkNotNullParameter(str17, "trackingUrl");
        this.f96474a = z;
        this.f96475b = l;
        this.f96476c = rVar;
        this.f96477d = str18;
        this.f96478e = orderType;
        this.f96479f = orderStatus;
        this.f96480g = d;
        this.f96481h = d2;
        this.f96482i = str19;
        this.f96483j = str20;
        this.f96484k = str21;
        this.f96485l = str22;
        this.f96486m = str23;
        this.f96487n = str24;
        this.f96488o = qVar2;
        this.f96489p = str25;
        this.f96490q = str26;
        this.f96491r = str27;
        this.f96492s = str28;
        this.f96493t = str29;
        this.f96494u = str13;
        this.f96495v = str14;
        this.f96496w = z2;
        this.f96497x = list;
        this.f96498y = str15;
        this.f96499z = str16;
        this.f96469A = list2;
        this.f96470B = list3;
        this.f96471C = z3;
        this.f96472D = z4;
        this.f96473E = str17;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38120r(boolean r34, java.lang.Long r35, com.carrefour.fid.android.domain.models.C38120r r36, java.lang.String r37, com.carrefour.fid.android.shared.domain.models.order.OrderType r38, com.carrefour.fid.android.core.constants.OrderStatus r39, double r40, java.lang.Double r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, com.carrefour.fid.android.domain.models.C38119q r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, boolean r57, java.util.List r58, java.lang.String r59, java.lang.String r60, java.util.List r61, java.util.List r62, boolean r63, boolean r64, java.lang.String r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
            r33 = this;
            r0 = r66
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r34
        L_0x000a:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r3 = r4
            goto L_0x0013
        L_0x0011:
            r3 = r35
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = r4
            goto L_0x001b
        L_0x0019:
            r5 = r36
        L_0x001b:
            r6 = r0 & 8
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0023
            r6 = r7
            goto L_0x0025
        L_0x0023:
            r6 = r37
        L_0x0025:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002b
            r8 = r4
            goto L_0x002d
        L_0x002b:
            r8 = r38
        L_0x002d:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0033
            r9 = r4
            goto L_0x0035
        L_0x0033:
            r9 = r39
        L_0x0035:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003c
            r10 = 0
            goto L_0x003e
        L_0x003c:
            r10 = r40
        L_0x003e:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r4 = r42
        L_0x0045:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004b
            r12 = r7
            goto L_0x004d
        L_0x004b:
            r12 = r43
        L_0x004d:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0053
            r13 = r7
            goto L_0x0055
        L_0x0053:
            r13 = r44
        L_0x0055:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005b
            r14 = r7
            goto L_0x005d
        L_0x005b:
            r14 = r45
        L_0x005d:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0067
            java.lang.String r15 = new java.lang.String
            r15.<init>()
            goto L_0x0069
        L_0x0067:
            r15 = r46
        L_0x0069:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x006f
            r2 = r7
            goto L_0x0071
        L_0x006f:
            r2 = r47
        L_0x0071:
            r34 = r7
            r7 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x007a
            r7 = r34
            goto L_0x007c
        L_0x007a:
            r7 = r48
        L_0x007c:
            r16 = r7
            r7 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x00a6
            com.carrefour.fid.android.domain.models.q r7 = new com.carrefour.fid.android.domain.models.q
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 31
            r23 = 0
            r35 = r7
            r36 = r17
            r37 = r18
            r38 = r19
            r39 = r20
            r40 = r21
            r41 = r22
            r42 = r23
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)
            goto L_0x00a8
        L_0x00a6:
            r7 = r49
        L_0x00a8:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00b2
            r17 = r34
            goto L_0x00b4
        L_0x00b2:
            r17 = r50
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00bd
            r18 = r34
            goto L_0x00bf
        L_0x00bd:
            r18 = r51
        L_0x00bf:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00c8
            r19 = r34
            goto L_0x00ca
        L_0x00c8:
            r19 = r52
        L_0x00ca:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00d3
            r20 = r34
            goto L_0x00d5
        L_0x00d3:
            r20 = r53
        L_0x00d5:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00de
            r21 = r34
            goto L_0x00e0
        L_0x00de:
            r21 = r54
        L_0x00e0:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00e9
            r22 = r34
            goto L_0x00eb
        L_0x00e9:
            r22 = r55
        L_0x00eb:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00f4
            r23 = r34
            goto L_0x00f6
        L_0x00f4:
            r23 = r56
        L_0x00f6:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00ff
            r24 = 0
            goto L_0x0101
        L_0x00ff:
            r24 = r57
        L_0x0101:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x010c
            java.util.List r25 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x010e
        L_0x010c:
            r25 = r58
        L_0x010e:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x011a
            java.lang.String r26 = new java.lang.String
            r26.<init>()
            goto L_0x011c
        L_0x011a:
            r26 = r59
        L_0x011c:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x0125
            r27 = r34
            goto L_0x0127
        L_0x0125:
            r27 = r60
        L_0x0127:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0132
            java.util.List r28 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0134
        L_0x0132:
            r28 = r61
        L_0x0134:
            r29 = 134217728(0x8000000, float:3.85186E-34)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x013f
            java.util.List r29 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0141
        L_0x013f:
            r29 = r62
        L_0x0141:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x014a
            r30 = 0
            goto L_0x014c
        L_0x014a:
            r30 = r63
        L_0x014c:
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0155
            r31 = 0
            goto L_0x0157
        L_0x0155:
            r31 = r64
        L_0x0157:
            r32 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r32
            if (r0 == 0) goto L_0x0160
            r0 = r34
            goto L_0x0162
        L_0x0160:
            r0 = r65
        L_0x0162:
            r34 = r33
            r35 = r1
            r36 = r3
            r37 = r5
            r38 = r6
            r39 = r8
            r40 = r9
            r41 = r10
            r43 = r4
            r44 = r12
            r45 = r13
            r46 = r14
            r47 = r15
            r48 = r2
            r49 = r16
            r50 = r7
            r51 = r17
            r52 = r18
            r53 = r19
            r54 = r20
            r55 = r21
            r56 = r22
            r57 = r23
            r58 = r24
            r59 = r25
            r60 = r26
            r61 = r27
            r62 = r28
            r63 = r29
            r64 = r30
            r65 = r31
            r66 = r0
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.C38120r.<init>(boolean, java.lang.Long, com.carrefour.fid.android.domain.models.r, java.lang.String, com.carrefour.fid.android.shared.domain.models.order.OrderType, com.carrefour.fid.android.core.constants.OrderStatus, double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.q, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
