package androidx.compose.p004ui.graphics.drawscope;

import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.C15231i3;
import org.jetbrains.annotations.C12579k;

@C15191g
/* renamed from: androidx.compose.ui.graphics.drawscope.i */
public interface C15193i {

    /* renamed from: androidx.compose.ui.graphics.drawscope.i$a */
    public static final class C15194a {
        @Deprecated
        /* renamed from: c */
        public static long m65822c(@C12579k C15193i iVar) {
            return C15193i.super.mo42707U();
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m65805f(C15193i iVar, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            iVar.mo42712e(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    /* renamed from: g */
    static /* synthetic */ void m65806g(C15193i iVar, C15231i3 i3Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C15229i2.f37536b.mo42798b();
            }
            iVar.mo42711d(i3Var, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: h */
    static /* synthetic */ void m65807h(C15193i iVar, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = C15104m.m65023t(iVar.mo42709b());
            }
            if ((i2 & 8) != 0) {
                f4 = C15104m.m65016m(iVar.mo42709b());
            }
            if ((i2 & 16) != 0) {
                i = C15229i2.f37536b.mo42798b();
            }
            iVar.mo42710c(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: l */
    static /* synthetic */ void m65809l(C15193i iVar, float f, float f2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = iVar.mo42707U();
            }
            iVar.mo42713j(f, f2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }

    /* renamed from: m */
    static /* synthetic */ void m65810m(C15193i iVar, float f, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = iVar.mo42707U();
            }
            iVar.mo42714k(f, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    /* renamed from: U */
    long mo42707U() {
        float f = (float) 2;
        return C15096g.m64898a(C15104m.m65023t(mo42709b()) / f, C15104m.m65016m(mo42709b()) / f);
    }

    /* renamed from: a */
    void mo42708a(@C12579k float[] fArr);

    /* renamed from: b */
    long mo42709b();

    /* renamed from: c */
    void mo42710c(float f, float f2, float f3, float f4, int i);

    /* renamed from: d */
    void mo42711d(@C12579k C15231i3 i3Var, int i);

    /* renamed from: e */
    void mo42712e(float f, float f2);

    /* renamed from: j */
    void mo42713j(float f, float f2, long j);

    /* renamed from: k */
    void mo42714k(float f, long j);

    /* renamed from: n */
    void mo42715n(float f, float f2, float f3, float f4);
}
