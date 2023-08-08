package com.carrefour.fid.android.domain.models.product.plp;

import com.carrefour.fid.android.domain.models.C38184v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.plp.b */
public final class C38114b implements C38184v {
    @C12579k

    /* renamed from: a */
    public final C38115c f96430a;

    /* renamed from: b */
    public final int f96431b;

    /* renamed from: c */
    public final boolean f96432c;

    /* renamed from: d */
    public final boolean f96433d;

    /* renamed from: e */
    public final boolean f96434e;

    /* renamed from: f */
    public final boolean f96435f;

    /* renamed from: g */
    public final boolean f96436g;

    public C38114b(@C12579k C38115c cVar, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(cVar, "plpProduct");
        this.f96430a = cVar;
        this.f96431b = i;
        this.f96432c = z;
        this.f96433d = z2;
        this.f96434e = z3;
        this.f96435f = z4;
        this.f96436g = z5;
    }

    /* renamed from: i */
    public static /* synthetic */ C38114b m157704i(C38114b bVar, C38115c cVar, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = bVar.f96430a;
        }
        if ((i2 & 2) != 0) {
            i = bVar.f96431b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = bVar.f96432c;
        }
        boolean z6 = z;
        if ((i2 & 8) != 0) {
            z2 = bVar.f96433d;
        }
        boolean z7 = z2;
        if ((i2 & 16) != 0) {
            z3 = bVar.f96434e;
        }
        boolean z8 = z3;
        if ((i2 & 32) != 0) {
            z4 = bVar.f96435f;
        }
        boolean z9 = z4;
        if ((i2 & 64) != 0) {
            z5 = bVar.f96436g;
        }
        return bVar.mo118840h(cVar, i3, z6, z7, z8, z9, z5);
    }

    @C12579k
    /* renamed from: a */
    public final C38115c mo118832a() {
        return this.f96430a;
    }

    /* renamed from: b */
    public final int mo118833b() {
        return this.f96431b;
    }

    /* renamed from: c */
    public final boolean mo118834c() {
        return this.f96432c;
    }

    /* renamed from: d */
    public final boolean mo118835d() {
        return this.f96433d;
    }

    /* renamed from: e */
    public final boolean mo118836e() {
        return this.f96434e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38114b)) {
            return false;
        }
        C38114b bVar = (C38114b) obj;
        return Intrinsics.areEqual((Object) this.f96430a, (Object) bVar.f96430a) && this.f96431b == bVar.f96431b && this.f96432c == bVar.f96432c && this.f96433d == bVar.f96433d && this.f96434e == bVar.f96434e && this.f96435f == bVar.f96435f && this.f96436g == bVar.f96436g;
    }

    /* renamed from: f */
    public final boolean mo118838f() {
        return this.f96435f;
    }

    /* renamed from: g */
    public final boolean mo118839g() {
        return this.f96436g;
    }

    @C12579k
    /* renamed from: h */
    public final C38114b mo118840h(@C12579k C38115c cVar, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(cVar, "plpProduct");
        return new C38114b(cVar, i, z, z2, z3, z4, z5);
    }

    public int hashCode() {
        int hashCode = ((this.f96430a.hashCode() * 31) + Integer.hashCode(this.f96431b)) * 31;
        boolean z = this.f96432c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96433d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f96434e;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f96435f;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f96436g;
        if (!z6) {
            z2 = z6;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: j */
    public final C38115c mo118842j() {
        return this.f96430a;
    }

    /* renamed from: k */
    public final int mo118843k() {
        return this.f96431b;
    }

    /* renamed from: l */
    public final boolean mo118844l() {
        return this.f96436g;
    }

    /* renamed from: m */
    public final boolean mo118845m() {
        return this.f96435f;
    }

    /* renamed from: n */
    public final boolean mo118846n() {
        return this.f96432c;
    }

    /* renamed from: o */
    public final boolean mo118847o() {
        return this.f96434e;
    }

    /* renamed from: p */
    public final boolean mo118848p() {
        return this.f96433d;
    }

    @C12579k
    public String toString() {
        C38115c cVar = this.f96430a;
        int i = this.f96431b;
        boolean z = this.f96432c;
        boolean z2 = this.f96433d;
        boolean z3 = this.f96434e;
        boolean z4 = this.f96435f;
        boolean z5 = this.f96436g;
        return "PlpItemData(plpProduct=" + cVar + ", quantity=" + i + ", isInShoppingList=" + z + ", isSyncingInShoppingList=" + z2 + ", isSyncingInBasket=" + z3 + ", isCriteoSponsored=" + z4 + ", showAntiInflationButton=" + z5 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38114b(com.carrefour.fid.android.domain.models.product.plp.C38115c r8, int r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r1
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.product.plp.C38114b.<init>(com.carrefour.fid.android.domain.models.product.plp.c, int, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
