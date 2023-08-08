package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15251k3;
import androidx.compose.p004ui.graphics.C15253k4;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.runtime.C8585m0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.vector.p */
public final class C15382p extends C15381o {

    /* renamed from: E0 */
    public static final int f38046E0 = 0;

    /* renamed from: X */
    public final float f38047X;

    /* renamed from: Y */
    public final float f38048Y;

    /* renamed from: Z */
    public final float f38049Z;
    @C12579k

    /* renamed from: b */
    public final String f38050b;
    @C12579k

    /* renamed from: c */
    public final List<C15349f> f38051c;

    /* renamed from: d */
    public final int f38052d;
    @C12580l

    /* renamed from: e */
    public final C15421z1 f38053e;

    /* renamed from: f */
    public final float f38054f;
    @C12580l

    /* renamed from: g */
    public final C15421z1 f38055g;

    /* renamed from: v */
    public final float f38056v;

    /* renamed from: w */
    public final float f38057w;

    /* renamed from: x */
    public final int f38058x;

    /* renamed from: y */
    public final int f38059y;

    /* renamed from: z */
    public final float f38060z;

    public /* synthetic */ C15382p(String str, List list, int i, C15421z1 z1Var, float f, C15421z1 z1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, z1Var, f, z1Var2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    /* renamed from: H */
    public final int mo43554H() {
        return this.f38058x;
    }

    /* renamed from: M */
    public final int mo43555M() {
        return this.f38059y;
    }

    /* renamed from: Q */
    public final float mo43556Q() {
        return this.f38060z;
    }

    /* renamed from: W */
    public final float mo43557W() {
        return this.f38057w;
    }

    /* renamed from: X */
    public final float mo43558X() {
        return this.f38048Y;
    }

    @C12580l
    /* renamed from: e */
    public final C15421z1 mo43559e() {
        return this.f38053e;
    }

    /* renamed from: e0 */
    public final float mo43560e0() {
        return this.f38049Z;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || C15382p.class != obj.getClass()) {
            return false;
        }
        C15382p pVar = (C15382p) obj;
        if (!Intrinsics.areEqual((Object) this.f38050b, (Object) pVar.f38050b) || !Intrinsics.areEqual((Object) this.f38053e, (Object) pVar.f38053e)) {
            return false;
        }
        if (this.f38054f == pVar.f38054f) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !Intrinsics.areEqual((Object) this.f38055g, (Object) pVar.f38055g)) {
            return false;
        }
        if (this.f38056v == pVar.f38056v) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f38057w == pVar.f38057w) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || !C15244j4.m66129g(this.f38058x, pVar.f38058x) || !C15253k4.m66165g(this.f38059y, pVar.f38059y)) {
            return false;
        }
        if (this.f38060z == pVar.f38060z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f38047X == pVar.f38047X) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.f38048Y == pVar.f38048Y) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.f38049Z == pVar.f38049Z) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && C15251k3.m66153f(this.f38052d, pVar.f38052d) && Intrinsics.areEqual((Object) this.f38051c, (Object) pVar.f38051c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final float mo43562f0() {
        return this.f38047X;
    }

    /* renamed from: h */
    public final float mo43563h() {
        return this.f38054f;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f38050b.hashCode() * 31) + this.f38051c.hashCode()) * 31;
        C15421z1 z1Var = this.f38053e;
        int i2 = 0;
        if (z1Var != null) {
            i = z1Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + Float.hashCode(this.f38054f)) * 31;
        C15421z1 z1Var2 = this.f38055g;
        if (z1Var2 != null) {
            i2 = z1Var2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i2) * 31) + Float.hashCode(this.f38056v)) * 31) + Float.hashCode(this.f38057w)) * 31) + C15244j4.m66130h(this.f38058x)) * 31) + C15253k4.m66166h(this.f38059y)) * 31) + Float.hashCode(this.f38060z)) * 31) + Float.hashCode(this.f38047X)) * 31) + Float.hashCode(this.f38048Y)) * 31) + Float.hashCode(this.f38049Z)) * 31) + C15251k3.m66154g(this.f38052d);
    }

    @C12579k
    /* renamed from: i */
    public final String mo43565i() {
        return this.f38050b;
    }

    @C12579k
    /* renamed from: q */
    public final List<C15349f> mo43566q() {
        return this.f38051c;
    }

    /* renamed from: r */
    public final int mo43567r() {
        return this.f38052d;
    }

    @C12580l
    /* renamed from: w */
    public final C15421z1 mo43568w() {
        return this.f38055g;
    }

    /* renamed from: y */
    public final float mo43569y() {
        return this.f38056v;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15382p(java.lang.String r19, java.util.List r20, int r21, androidx.compose.p004ui.graphics.C15421z1 r22, float r23, androidx.compose.p004ui.graphics.C15421z1 r24, float r25, float r26, int r27, int r28, float r29, float r30, float r31, float r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r3 = r1
            goto L_0x000c
        L_0x000a:
            r3 = r19
        L_0x000c:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r6 = r2
            goto L_0x0015
        L_0x0013:
            r6 = r22
        L_0x0015:
            r1 = r0 & 16
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x001d
            r7 = r4
            goto L_0x001f
        L_0x001d:
            r7 = r23
        L_0x001f:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0025
            r8 = r2
            goto L_0x0027
        L_0x0025:
            r8 = r24
        L_0x0027:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002d
            r9 = r4
            goto L_0x002f
        L_0x002d:
            r9 = r25
        L_0x002f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0036
            r10 = r2
            goto L_0x0038
        L_0x0036:
            r10 = r26
        L_0x0038:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0042
            int r1 = androidx.compose.p004ui.graphics.vector.C15380n.m67239d()
            r11 = r1
            goto L_0x0044
        L_0x0042:
            r11 = r27
        L_0x0044:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004e
            int r1 = androidx.compose.p004ui.graphics.vector.C15380n.m67240e()
            r12 = r1
            goto L_0x0050
        L_0x004e:
            r12 = r28
        L_0x0050:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0058
            r1 = 1082130432(0x40800000, float:4.0)
            r13 = r1
            goto L_0x005a
        L_0x0058:
            r13 = r29
        L_0x005a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            r14 = r2
            goto L_0x0062
        L_0x0060:
            r14 = r30
        L_0x0062:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0068
            r15 = r4
            goto L_0x006a
        L_0x0068:
            r15 = r31
        L_0x006a:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0071
            r16 = r2
            goto L_0x0073
        L_0x0071:
            r16 = r32
        L_0x0073:
            r17 = 0
            r2 = r18
            r4 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.vector.C15382p.<init>(java.lang.String, java.util.List, int, androidx.compose.ui.graphics.z1, float, androidx.compose.ui.graphics.z1, float, float, int, int, float, float, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C15382p(String str, List<? extends C15349f> list, int i, C15421z1 z1Var, float f, C15421z1 z1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super((DefaultConstructorMarker) null);
        this.f38050b = str;
        this.f38051c = list;
        this.f38052d = i;
        this.f38053e = z1Var;
        this.f38054f = f;
        this.f38055g = z1Var2;
        this.f38056v = f2;
        this.f38057w = f3;
        this.f38058x = i2;
        this.f38059y = i3;
        this.f38060z = f4;
        this.f38047X = f5;
        this.f38048Y = f6;
        this.f38049Z = f7;
    }
}
