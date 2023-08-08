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
/* renamed from: androidx.compose.ui.graphics.l4 */
public final class C15261l4 extends C15127c4 {

    /* renamed from: e */
    public final long f37580e;
    @C12579k

    /* renamed from: f */
    public final List<C15240j2> f37581f;
    @C12580l

    /* renamed from: g */
    public final List<Float> f37582g;

    public /* synthetic */ C15261l4(long j, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    @C12579k
    /* renamed from: c */
    public Shader mo42412c(long j) {
        long j2;
        boolean z;
        float f;
        float f2;
        if (C15096g.m64903f(this.f37580e)) {
            j2 = C15106n.m65034b(j);
        } else {
            boolean z2 = true;
            if (C15094f.m64880p(this.f37580e) == Float.POSITIVE_INFINITY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = C15104m.m65023t(j);
            } else {
                f = C15094f.m64880p(this.f37580e);
            }
            if (C15094f.m64882r(this.f37580e) != Float.POSITIVE_INFINITY) {
                z2 = false;
            }
            if (z2) {
                f2 = C15104m.m65016m(j);
            } else {
                f2 = C15094f.m64882r(this.f37580e);
            }
            j2 = C15096g.m64898a(f, f2);
        }
        return C15178d4.m65585g(j2, this.f37581f, this.f37582g);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15261l4)) {
            return false;
        }
        C15261l4 l4Var = (C15261l4) obj;
        if (C15094f.m64876l(this.f37580e, l4Var.f37580e) && Intrinsics.areEqual((Object) this.f37581f, (Object) l4Var.f37581f) && Intrinsics.areEqual((Object) this.f37582g, (Object) l4Var.f37582g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int s = ((C15094f.m64883s(this.f37580e) * 31) + this.f37581f.hashCode()) * 31;
        List<Float> list = this.f37582g;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return s + i;
    }

    @C12579k
    public String toString() {
        String str;
        if (C15096g.m64901d(this.f37580e)) {
            str = "center=" + C15094f.m64889y(this.f37580e) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f37581f + ", stops=" + this.f37582g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15261l4(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, (DefaultConstructorMarker) null);
    }

    public C15261l4(long j, List<C15240j2> list, List<Float> list2) {
        this.f37580e = j;
        this.f37581f = list;
        this.f37582g = list2;
    }
}
