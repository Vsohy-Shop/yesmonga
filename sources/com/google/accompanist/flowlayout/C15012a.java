package com.google.accompanist.flowlayout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.accompanist.flowlayout.a */
public final class C15012a {

    /* renamed from: a */
    public final int f37122a;

    /* renamed from: b */
    public final int f37123b;

    /* renamed from: c */
    public final int f37124c;

    /* renamed from: d */
    public final int f37125d;

    public /* synthetic */ C15012a(long j, LayoutOrientation layoutOrientation, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, layoutOrientation);
    }

    /* renamed from: f */
    public static /* synthetic */ C15012a m64344f(C15012a aVar, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aVar.f37122a;
        }
        if ((i5 & 2) != 0) {
            i2 = aVar.f37123b;
        }
        if ((i5 & 4) != 0) {
            i3 = aVar.f37124c;
        }
        if ((i5 & 8) != 0) {
            i4 = aVar.f37125d;
        }
        return aVar.mo41968e(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final int mo41964a() {
        return this.f37122a;
    }

    /* renamed from: b */
    public final int mo41965b() {
        return this.f37123b;
    }

    /* renamed from: c */
    public final int mo41966c() {
        return this.f37124c;
    }

    /* renamed from: d */
    public final int mo41967d() {
        return this.f37125d;
    }

    @C12579k
    /* renamed from: e */
    public final C15012a mo41968e(int i, int i2, int i3, int i4) {
        return new C15012a(i, i2, i3, i4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15012a)) {
            return false;
        }
        C15012a aVar = (C15012a) obj;
        return this.f37122a == aVar.f37122a && this.f37123b == aVar.f37123b && this.f37124c == aVar.f37124c && this.f37125d == aVar.f37125d;
    }

    /* renamed from: g */
    public final int mo41970g() {
        return this.f37125d;
    }

    /* renamed from: h */
    public final int mo41971h() {
        return this.f37124c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f37122a) * 31) + Integer.hashCode(this.f37123b)) * 31) + Integer.hashCode(this.f37124c)) * 31) + Integer.hashCode(this.f37125d);
    }

    /* renamed from: i */
    public final int mo41973i() {
        return this.f37123b;
    }

    /* renamed from: j */
    public final int mo41974j() {
        return this.f37122a;
    }

    @C12579k
    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f37122a + ", mainAxisMax=" + this.f37123b + ", crossAxisMin=" + this.f37124c + ", crossAxisMax=" + this.f37125d + ')';
    }

    public C15012a(int i, int i2, int i3, int i4) {
        this.f37122a = i;
        this.f37123b = i2;
        this.f37124c = i3;
        this.f37125d = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15012a(long r5, com.google.accompanist.flowlayout.LayoutOrientation r7) {
        /*
            r4 = this;
            com.google.accompanist.flowlayout.LayoutOrientation r0 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r7 != r0) goto L_0x0009
            int r1 = androidx.compose.p004ui.unit.C16476b.m74364r(r5)
            goto L_0x000d
        L_0x0009:
            int r1 = androidx.compose.p004ui.unit.C16476b.m74363q(r5)
        L_0x000d:
            if (r7 != r0) goto L_0x0014
            int r2 = androidx.compose.p004ui.unit.C16476b.m74362p(r5)
            goto L_0x0018
        L_0x0014:
            int r2 = androidx.compose.p004ui.unit.C16476b.m74361o(r5)
        L_0x0018:
            if (r7 != r0) goto L_0x001f
            int r3 = androidx.compose.p004ui.unit.C16476b.m74363q(r5)
            goto L_0x0023
        L_0x001f:
            int r3 = androidx.compose.p004ui.unit.C16476b.m74364r(r5)
        L_0x0023:
            if (r7 != r0) goto L_0x002a
            int r5 = androidx.compose.p004ui.unit.C16476b.m74361o(r5)
            goto L_0x002e
        L_0x002a:
            int r5 = androidx.compose.p004ui.unit.C16476b.m74362p(r5)
        L_0x002e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.C15012a.<init>(long, com.google.accompanist.flowlayout.LayoutOrientation):void");
    }
}
