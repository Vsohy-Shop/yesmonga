package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.runtime.C8585m0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.z2 */
public final class C15423z2 extends C15127c4 {
    @C12579k

    /* renamed from: e */
    public final List<C15240j2> f38110e;
    @C12580l

    /* renamed from: f */
    public final List<Float> f38111f;

    /* renamed from: g */
    public final long f38112g;

    /* renamed from: h */
    public final long f38113h;

    /* renamed from: i */
    public final int f38114i;

    public /* synthetic */ C15423z2(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo43002b() {
        /*
            r6 = this;
            long r0 = r6.f38112g
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64880p(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0016
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L_0x0044
            long r4 = r6.f38113h
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64880p(r4)
            boolean r4 = java.lang.Float.isInfinite(r0)
            if (r4 != 0) goto L_0x002f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x002f
            r0 = r2
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 == 0) goto L_0x0044
            long r4 = r6.f38112g
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64880p(r4)
            long r4 = r6.f38113h
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64880p(r4)
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            long r4 = r6.f38112g
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64882r(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L_0x0059
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r4 == 0) goto L_0x0083
            long r4 = r6.f38113h
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64882r(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L_0x006f
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            if (r2 == 0) goto L_0x0083
            long r1 = r6.f38112g
            float r1 = androidx.compose.p004ui.geometry.C15094f.m64882r(r1)
            long r2 = r6.f38113h
            float r2 = androidx.compose.p004ui.geometry.C15094f.m64882r(r2)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
        L_0x0083:
            long r0 = androidx.compose.p004ui.geometry.C15106n.m65033a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.C15423z2.mo43002b():long");
    }

    @C12579k
    /* renamed from: c */
    public Shader mo42412c(long j) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        boolean z3;
        float f3;
        float f4;
        boolean z4 = true;
        if (C15094f.m64880p(this.f38112g) == Float.POSITIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = C15104m.m65023t(j);
        } else {
            f = C15094f.m64880p(this.f38112g);
        }
        if (C15094f.m64882r(this.f38112g) == Float.POSITIVE_INFINITY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = C15104m.m65016m(j);
        } else {
            f2 = C15094f.m64882r(this.f38112g);
        }
        if (C15094f.m64880p(this.f38113h) == Float.POSITIVE_INFINITY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f3 = C15104m.m65023t(j);
        } else {
            f3 = C15094f.m64880p(this.f38113h);
        }
        if (C15094f.m64882r(this.f38113h) != Float.POSITIVE_INFINITY) {
            z4 = false;
        }
        if (z4) {
            f4 = C15104m.m65016m(j);
        } else {
            f4 = C15094f.m64882r(this.f38113h);
        }
        return C15178d4.m65581c(C15096g.m64898a(f, f2), C15096g.m64898a(f3, f4), this.f38110e, this.f38111f, this.f38114i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15423z2)) {
            return false;
        }
        C15423z2 z2Var = (C15423z2) obj;
        if (Intrinsics.areEqual((Object) this.f38110e, (Object) z2Var.f38110e) && Intrinsics.areEqual((Object) this.f38111f, (Object) z2Var.f38111f) && C15094f.m64876l(this.f38112g, z2Var.f38112g) && C15094f.m64876l(this.f38113h, z2Var.f38113h) && C15268m4.m66277h(this.f38114i, z2Var.f38114i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f38110e.hashCode() * 31;
        List<Float> list = this.f38111f;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + C15094f.m64883s(this.f38112g)) * 31) + C15094f.m64883s(this.f38113h)) * 31) + C15268m4.m66278i(this.f38114i);
    }

    @C12579k
    public String toString() {
        String str;
        String str2 = "";
        if (C15096g.m64899b(this.f38112g)) {
            str = "start=" + C15094f.m64889y(this.f38112g) + ", ";
        } else {
            str = str2;
        }
        if (C15096g.m64899b(this.f38113h)) {
            str2 = "end=" + C15094f.m64889y(this.f38113h) + ", ";
        }
        return "LinearGradient(colors=" + this.f38110e + ", stops=" + this.f38111f + ", " + str + str2 + "tileMode=" + C15268m4.m66279j(this.f38114i) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15423z2(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? C15268m4.f37596b.mo42908a() : i, (DefaultConstructorMarker) null);
    }

    public C15423z2(List<C15240j2> list, List<Float> list2, long j, long j2, int i) {
        this.f38110e = list;
        this.f38111f = list2;
        this.f38112g = j;
        this.f38113h = j2;
        this.f38114i = i;
    }
}
