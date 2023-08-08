package androidx.compose.p004ui.graphics;

import android.graphics.Shader;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.runtime.C8585m0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.r3 */
public final class C15309r3 extends C15127c4 {
    @C12579k

    /* renamed from: e */
    public final List<C15240j2> f37694e;
    @C12580l

    /* renamed from: f */
    public final List<Float> f37695f;

    /* renamed from: g */
    public final long f37696g;

    /* renamed from: h */
    public final float f37697h;

    /* renamed from: i */
    public final int f37698i;

    public /* synthetic */ C15309r3(List list, List list2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }

    /* renamed from: b */
    public long mo43002b() {
        float f = this.f37697h;
        if (!(!Float.isInfinite(f) && !Float.isNaN(f))) {
            return C15104m.f37280b.mo42316a();
        }
        float f2 = this.f37697h;
        float f3 = (float) 2;
        return C15106n.m65033a(f2 * f3, f2 * f3);
    }

    @C12579k
    /* renamed from: c */
    public Shader mo42412c(long j) {
        float f;
        float f2;
        float f3;
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (C15096g.m64903f(this.f37696g)) {
            long b = C15106n.m65034b(j);
            f2 = C15094f.m64880p(b);
            f = C15094f.m64882r(b);
        } else {
            if (C15094f.m64880p(this.f37696g) == Float.POSITIVE_INFINITY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f2 = C15104m.m65023t(j);
            } else {
                f2 = C15094f.m64880p(this.f37696g);
            }
            if (C15094f.m64882r(this.f37696g) == Float.POSITIVE_INFINITY) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = C15104m.m65016m(j);
            } else {
                f = C15094f.m64882r(this.f37696g);
            }
        }
        List<C15240j2> list = this.f37694e;
        List<Float> list2 = this.f37695f;
        long a = C15096g.m64898a(f2, f);
        float f4 = this.f37697h;
        if (f4 != Float.POSITIVE_INFINITY) {
            z3 = false;
        }
        if (z3) {
            f3 = C15104m.m65020q(j) / ((float) 2);
        } else {
            f3 = f4;
        }
        return C15178d4.m65583e(a, f3, list, list2, this.f37698i);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15309r3)) {
            return false;
        }
        C15309r3 r3Var = (C15309r3) obj;
        if (!Intrinsics.areEqual((Object) this.f37694e, (Object) r3Var.f37694e) || !Intrinsics.areEqual((Object) this.f37695f, (Object) r3Var.f37695f) || !C15094f.m64876l(this.f37696g, r3Var.f37696g)) {
            return false;
        }
        if (this.f37697h == r3Var.f37697h) {
            z = true;
        } else {
            z = false;
        }
        if (z && C15268m4.m66277h(this.f37698i, r3Var.f37698i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f37694e.hashCode() * 31;
        List<Float> list = this.f37695f;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + C15094f.m64883s(this.f37696g)) * 31) + Float.hashCode(this.f37697h)) * 31) + C15268m4.m66278i(this.f37698i);
    }

    @C12579k
    public String toString() {
        String str;
        boolean z;
        String str2 = "";
        if (C15096g.m64901d(this.f37696g)) {
            str = "center=" + C15094f.m64889y(this.f37696g) + ", ";
        } else {
            str = str2;
        }
        float f = this.f37697h;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "radius=" + this.f37697h + ", ";
        }
        return "RadialGradient(colors=" + this.f37694e + ", stops=" + this.f37695f + ", " + str + str2 + "tileMode=" + C15268m4.m66279j(this.f37698i) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15309r3(List list, List list2, long j, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? C15268m4.f37596b.mo42908a() : i, (DefaultConstructorMarker) null);
    }

    public C15309r3(List<C15240j2> list, List<Float> list2, long j, float f, int i) {
        this.f37694e = list;
        this.f37695f = list2;
        this.f37696g = j;
        this.f37697h = f;
        this.f37698i = i;
    }
}
