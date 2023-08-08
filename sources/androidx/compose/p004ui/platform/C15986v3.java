package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15101k;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15266m3;
import androidx.compose.p004ui.graphics.C15318t0;
import com.google.maps.android.data.kml.C33866p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.v3 */
public final class C15986v3 {
    /* renamed from: a */
    public static final boolean m71782a(C15101k kVar) {
        if (C15088a.m64833m(kVar.mo42305t()) + C15088a.m64833m(kVar.mo42307u()) > kVar.mo42308v() || C15088a.m64833m(kVar.mo42299n()) + C15088a.m64833m(kVar.mo42300o()) > kVar.mo42308v() || C15088a.m64835o(kVar.mo42305t()) + C15088a.m64835o(kVar.mo42299n()) > kVar.mo42301p() || C15088a.m64835o(kVar.mo42307u()) + C15088a.m64835o(kVar.mo42300o()) > kVar.mo42301p()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m71783b(@C12579k C15174d3 d3Var, float f, float f2, @C12580l C15231i3 i3Var, @C12580l C15231i3 i3Var2) {
        Intrinsics.checkNotNullParameter(d3Var, C33866p.f82159k);
        if (d3Var instanceof C15174d3.C15176b) {
            return m71786e(((C15174d3.C15176b) d3Var).mo42649b(), f, f2);
        }
        if (d3Var instanceof C15174d3.C15177c) {
            return m71787f((C15174d3.C15177c) d3Var, f, f2, i3Var, i3Var2);
        }
        if (d3Var instanceof C15174d3.C15175a) {
            return m71785d(((C15174d3.C15175a) d3Var).mo42646b(), f, f2, i3Var, i3Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m71784c(C15174d3 d3Var, float f, float f2, C15231i3 i3Var, C15231i3 i3Var2, int i, Object obj) {
        if ((i & 8) != 0) {
            i3Var = null;
        }
        if ((i & 16) != 0) {
            i3Var2 = null;
        }
        return m71783b(d3Var, f, f2, i3Var, i3Var2);
    }

    /* renamed from: d */
    public static final boolean m71785d(C15231i3 i3Var, float f, float f2, C15231i3 i3Var2, C15231i3 i3Var3) {
        C15098i iVar = new C15098i(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (i3Var2 == null) {
            i3Var2 = C15318t0.m66550a();
        }
        i3Var2.mo42814o(iVar);
        if (i3Var3 == null) {
            i3Var3 = C15318t0.m66550a();
        }
        i3Var3.mo42819s(i3Var, i3Var2, C15266m3.f37589b.mo42900b());
        boolean isEmpty = i3Var3.isEmpty();
        i3Var3.reset();
        i3Var2.reset();
        return !isEmpty;
    }

    /* renamed from: e */
    public static final boolean m71786e(C15098i iVar, float f, float f2) {
        return iVar.mo42279t() <= f && f < iVar.mo42283x() && iVar.mo42249B() <= f2 && f2 < iVar.mo42271j();
    }

    /* renamed from: f */
    public static final boolean m71787f(C15174d3.C15177c cVar, float f, float f2, C15231i3 i3Var, C15231i3 i3Var2) {
        C15231i3 i3Var3;
        float f3 = f;
        float f4 = f2;
        C15231i3 i3Var4 = i3Var2;
        C15101k b = cVar.mo42652b();
        if (f3 < b.mo42302q() || f3 >= b.mo42303r() || f4 < b.mo42304s() || f4 >= b.mo42298m()) {
            return false;
        }
        if (!m71782a(b)) {
            if (i3Var4 == null) {
                i3Var3 = C15318t0.m66550a();
            } else {
                i3Var3 = i3Var4;
            }
            i3Var3.mo42817r(b);
            return m71785d(i3Var3, f, f2, i3Var, i3Var4);
        }
        float m = C15088a.m64833m(b.mo42305t()) + b.mo42302q();
        float o = C15088a.m64835o(b.mo42305t()) + b.mo42304s();
        float r = b.mo42303r() - C15088a.m64833m(b.mo42307u());
        float o2 = C15088a.m64835o(b.mo42307u()) + b.mo42304s();
        float r2 = b.mo42303r() - C15088a.m64833m(b.mo42300o());
        float m2 = b.mo42298m() - C15088a.m64835o(b.mo42300o());
        float m3 = b.mo42298m() - C15088a.m64835o(b.mo42299n());
        float m4 = C15088a.m64833m(b.mo42299n()) + b.mo42302q();
        if (f3 < m && f4 < o) {
            return m71788g(f, f2, b.mo42305t(), m, o);
        } else if (f3 < m4 && f4 > m3) {
            return m71788g(f, f2, b.mo42299n(), m4, m3);
        } else if (f3 > r && f4 < o2) {
            return m71788g(f, f2, b.mo42307u(), r, o2);
        } else if (f3 <= r2 || f4 <= m2) {
            return true;
        } else {
            return m71788g(f, f2, b.mo42300o(), r2, m2);
        }
    }

    /* renamed from: g */
    public static final boolean m71788g(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m = C15088a.m64833m(j);
        float o = C15088a.m64835o(j);
        if (((f5 * f5) / (m * m)) + ((f6 * f6) / (o * o)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
