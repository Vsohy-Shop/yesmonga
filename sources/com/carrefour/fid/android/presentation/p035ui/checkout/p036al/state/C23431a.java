package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.state;

import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17239t;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.state.a */
public final class C23431a {

    /* renamed from: j */
    public static final int f59261j = 8;
    @C12579k

    /* renamed from: a */
    public final C28892e<BasketAmounts> f59262a;
    @C12579k

    /* renamed from: b */
    public final C28892e<BasketPromotionCode> f59263b;
    @C12579k

    /* renamed from: c */
    public final C28892e<BasketReturnableBags> f59264c;

    /* renamed from: d */
    public final int f59265d;

    /* renamed from: e */
    public final int f59266e;

    /* renamed from: f */
    public final boolean f59267f;
    @C12580l

    /* renamed from: g */
    public final BasketDomain f59268g;
    @C12580l

    /* renamed from: h */
    public final C38162k f59269h;

    /* renamed from: i */
    public final boolean f59270i;

    public C23431a() {
        this((C28892e) null, (C28892e) null, (C28892e) null, 0, 0, false, (BasketDomain) null, (C38162k) null, false, C17239t.f45525u, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static /* synthetic */ C23431a m104455k(C23431a aVar, C28892e eVar, C28892e eVar2, C28892e eVar3, int i, int i2, boolean z, BasketDomain basketDomain, C38162k kVar, boolean z2, int i3, Object obj) {
        C23431a aVar2 = aVar;
        int i4 = i3;
        return aVar.mo68626j((i4 & 1) != 0 ? aVar2.f59262a : eVar, (i4 & 2) != 0 ? aVar2.f59263b : eVar2, (i4 & 4) != 0 ? aVar2.f59264c : eVar3, (i4 & 8) != 0 ? aVar2.f59265d : i, (i4 & 16) != 0 ? aVar2.f59266e : i2, (i4 & 32) != 0 ? aVar2.f59267f : z, (i4 & 64) != 0 ? aVar2.f59268g : basketDomain, (i4 & 128) != 0 ? aVar2.f59269h : kVar, (i4 & 256) != 0 ? aVar2.f59270i : z2);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<BasketAmounts> mo68615a() {
        return this.f59262a;
    }

    @C12579k
    /* renamed from: b */
    public final C28892e<BasketPromotionCode> mo68616b() {
        return this.f59263b;
    }

    @C12579k
    /* renamed from: c */
    public final C28892e<BasketReturnableBags> mo68617c() {
        return this.f59264c;
    }

    /* renamed from: d */
    public final int mo68618d() {
        return this.f59265d;
    }

    /* renamed from: e */
    public final int mo68619e() {
        return this.f59266e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23431a)) {
            return false;
        }
        C23431a aVar = (C23431a) obj;
        return Intrinsics.areEqual((Object) this.f59262a, (Object) aVar.f59262a) && Intrinsics.areEqual((Object) this.f59263b, (Object) aVar.f59263b) && Intrinsics.areEqual((Object) this.f59264c, (Object) aVar.f59264c) && this.f59265d == aVar.f59265d && this.f59266e == aVar.f59266e && this.f59267f == aVar.f59267f && Intrinsics.areEqual((Object) this.f59268g, (Object) aVar.f59268g) && Intrinsics.areEqual((Object) this.f59269h, (Object) aVar.f59269h) && this.f59270i == aVar.f59270i;
    }

    /* renamed from: f */
    public final boolean mo68621f() {
        return this.f59267f;
    }

    @C12580l
    /* renamed from: g */
    public final BasketDomain mo68622g() {
        return this.f59268g;
    }

    @C12580l
    /* renamed from: h */
    public final C38162k mo68623h() {
        return this.f59269h;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f59262a.hashCode() * 31) + this.f59263b.hashCode()) * 31) + this.f59264c.hashCode()) * 31) + Integer.hashCode(this.f59265d)) * 31) + Integer.hashCode(this.f59266e)) * 31;
        boolean z = this.f59267f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        BasketDomain basketDomain = this.f59268g;
        int i2 = 0;
        int hashCode2 = (i + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
        C38162k kVar = this.f59269h;
        if (kVar != null) {
            i2 = kVar.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.f59270i;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo68625i() {
        return this.f59270i;
    }

    @C12579k
    /* renamed from: j */
    public final C23431a mo68626j(@C12579k C28892e<BasketAmounts> eVar, @C12579k C28892e<BasketPromotionCode> eVar2, @C12579k C28892e<BasketReturnableBags> eVar3, int i, int i2, boolean z, @C12580l BasketDomain basketDomain, @C12580l C38162k kVar, boolean z2) {
        Intrinsics.checkNotNullParameter(eVar, "basketAmounts");
        Intrinsics.checkNotNullParameter(eVar2, "promoCode");
        Intrinsics.checkNotNullParameter(eVar3, "returnableBags");
        return new C23431a(eVar, eVar2, eVar3, i, i2, z, basketDomain, kVar, z2);
    }

    @C12579k
    /* renamed from: l */
    public final C28892e<BasketAmounts> mo68627l() {
        return this.f59262a;
    }

    @C12580l
    /* renamed from: m */
    public final BasketDomain mo68628m() {
        return this.f59268g;
    }

    /* renamed from: n */
    public final int mo68629n() {
        return this.f59265d;
    }

    @C12579k
    /* renamed from: o */
    public final C28892e<BasketPromotionCode> mo68630o() {
        return this.f59263b;
    }

    @C12579k
    /* renamed from: p */
    public final C28892e<BasketReturnableBags> mo68631p() {
        return this.f59264c;
    }

    @C12580l
    /* renamed from: q */
    public final C38162k mo68632q() {
        return this.f59269h;
    }

    /* renamed from: r */
    public final boolean mo68633r() {
        return this.f59267f;
    }

    /* renamed from: s */
    public final int mo68634s() {
        return this.f59266e;
    }

    /* renamed from: t */
    public final boolean mo68635t() {
        return this.f59270i;
    }

    @C12579k
    public String toString() {
        C28892e<BasketAmounts> eVar = this.f59262a;
        C28892e<BasketPromotionCode> eVar2 = this.f59263b;
        C28892e<BasketReturnableBags> eVar3 = this.f59264c;
        int i = this.f59265d;
        int i2 = this.f59266e;
        boolean z = this.f59267f;
        BasketDomain basketDomain = this.f59268g;
        C38162k kVar = this.f59269h;
        boolean z2 = this.f59270i;
        return "CheckoutStep1FooterUiState(basketAmounts=" + eVar + ", promoCode=" + eVar2 + ", returnableBags=" + eVar3 + ", nbItems=" + i + ", stampsCount=" + i2 + ", showPreparationFees=" + z + ", basketDomain=" + basketDomain + ", serviceSelection=" + kVar + ", isLoading=" + z2 + ")";
    }

    public C23431a(@C12579k C28892e<BasketAmounts> eVar, @C12579k C28892e<BasketPromotionCode> eVar2, @C12579k C28892e<BasketReturnableBags> eVar3, int i, int i2, boolean z, @C12580l BasketDomain basketDomain, @C12580l C38162k kVar, boolean z2) {
        Intrinsics.checkNotNullParameter(eVar, "basketAmounts");
        Intrinsics.checkNotNullParameter(eVar2, "promoCode");
        Intrinsics.checkNotNullParameter(eVar3, "returnableBags");
        this.f59262a = eVar;
        this.f59263b = eVar2;
        this.f59264c = eVar3;
        this.f59265d = i;
        this.f59266e = i2;
        this.f59267f = z;
        this.f59268g = basketDomain;
        this.f59269h = kVar;
        this.f59270i = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C23431a(com.carrefour.fid.android.shared.type.C28892e r12, com.carrefour.fid.android.shared.type.C28892e r13, com.carrefour.fid.android.shared.type.C28892e r14, int r15, int r16, boolean r17, com.carrefour.fid.android.domain.models.BasketDomain r18, com.carrefour.fid.android.domain.models.service.models.C38162k r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            com.carrefour.fid.android.shared.type.e$d r2 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            com.carrefour.fid.android.shared.type.e$d r3 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x001a
        L_0x0019:
            r3 = r14
        L_0x001a:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x0021
            r4 = r5
            goto L_0x0022
        L_0x0021:
            r4 = r15
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r5
            goto L_0x002a
        L_0x0028:
            r6 = r16
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r5
            goto L_0x0032
        L_0x0030:
            r7 = r17
        L_0x0032:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x0039
            r8 = r9
            goto L_0x003b
        L_0x0039:
            r8 = r18
        L_0x003b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r9 = r19
        L_0x0042:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r5 = r20
        L_0x0049:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r4
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.state.C23431a.<init>(com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.shared.type.e, int, int, boolean, com.carrefour.fid.android.domain.models.BasketDomain, com.carrefour.fid.android.domain.models.service.models.k, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
