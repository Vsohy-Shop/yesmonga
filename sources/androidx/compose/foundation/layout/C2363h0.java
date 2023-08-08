package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16478c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.h0 */
public final class C2363h0 {

    /* renamed from: a */
    public final int f6273a;

    /* renamed from: b */
    public final int f6274b;

    /* renamed from: c */
    public final int f6275c;

    /* renamed from: d */
    public final int f6276d;

    public /* synthetic */ C2363h0(long j, LayoutOrientation layoutOrientation, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, layoutOrientation);
    }

    /* renamed from: f */
    public static /* synthetic */ C2363h0 m10414f(C2363h0 h0Var, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = h0Var.f6273a;
        }
        if ((i5 & 2) != 0) {
            i2 = h0Var.f6274b;
        }
        if ((i5 & 4) != 0) {
            i3 = h0Var.f6275c;
        }
        if ((i5 & 8) != 0) {
            i4 = h0Var.f6276d;
        }
        return h0Var.mo8073e(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final int mo8069a() {
        return this.f6273a;
    }

    /* renamed from: b */
    public final int mo8070b() {
        return this.f6274b;
    }

    /* renamed from: c */
    public final int mo8071c() {
        return this.f6275c;
    }

    /* renamed from: d */
    public final int mo8072d() {
        return this.f6276d;
    }

    @C12579k
    /* renamed from: e */
    public final C2363h0 mo8073e(int i, int i2, int i3, int i4) {
        return new C2363h0(i, i2, i3, i4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2363h0)) {
            return false;
        }
        C2363h0 h0Var = (C2363h0) obj;
        return this.f6273a == h0Var.f6273a && this.f6274b == h0Var.f6274b && this.f6275c == h0Var.f6275c && this.f6276d == h0Var.f6276d;
    }

    /* renamed from: g */
    public final int mo8075g() {
        return this.f6276d;
    }

    /* renamed from: h */
    public final int mo8076h() {
        return this.f6275c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f6273a) * 31) + Integer.hashCode(this.f6274b)) * 31) + Integer.hashCode(this.f6275c)) * 31) + Integer.hashCode(this.f6276d);
    }

    /* renamed from: i */
    public final int mo8078i() {
        return this.f6274b;
    }

    /* renamed from: j */
    public final int mo8079j() {
        return this.f6273a;
    }

    /* renamed from: k */
    public final int mo8080k(@C12579k LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return this.f6276d;
        }
        return this.f6274b;
    }

    /* renamed from: l */
    public final int mo8081l(@C12579k LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return this.f6274b;
        }
        return this.f6276d;
    }

    @C12579k
    /* renamed from: m */
    public final C2363h0 mo8082m() {
        int i;
        int i2 = this.f6273a;
        int i3 = this.f6274b;
        int i4 = this.f6276d;
        if (i4 != Integer.MAX_VALUE) {
            i = i4;
        } else {
            i = this.f6275c;
        }
        return new C2363h0(i2, i3, i, i4);
    }

    /* renamed from: n */
    public final long mo8083n(@C12579k LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return C16478c.m74376a(this.f6273a, this.f6274b, this.f6275c, this.f6276d);
        }
        return C16478c.m74376a(this.f6275c, this.f6276d, this.f6273a, this.f6274b);
    }

    @C12579k
    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f6273a + ", mainAxisMax=" + this.f6274b + ", crossAxisMin=" + this.f6275c + ", crossAxisMax=" + this.f6276d + ')';
    }

    public C2363h0(int i, int i2, int i3, int i4) {
        this.f6273a = i;
        this.f6274b = i2;
        this.f6275c = i3;
        this.f6276d = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2363h0(long r5, androidx.compose.foundation.layout.LayoutOrientation r7) {
        /*
            r4 = this;
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C2363h0.<init>(long, androidx.compose.foundation.layout.LayoutOrientation):void");
    }
}
