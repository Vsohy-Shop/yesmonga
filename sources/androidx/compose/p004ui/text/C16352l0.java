package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15100j;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.text.style.TextForegroundStyle;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.l0 */
public final class C16352l0 {
    @C12579k

    /* renamed from: a */
    public static final C16352l0 f40587a = new C16352l0();

    /* renamed from: b */
    public static final int f40588b = 0;

    /* renamed from: a */
    public final void mo47424a(@C12579k C15118b2 b2Var, @C12579k C16260h0 h0Var) {
        boolean z;
        long j;
        float f;
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        if (!h0Var.mo47055i() || C16449r.m74263g(h0Var.mo47058l().mo47034h(), C16449r.f40760b.mo47728e())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C15098i c = C15100j.m64956c(C15094f.f37256b.mo42248e(), C15106n.m65033a((float) C16500q.m74662m(h0Var.mo47043B()), (float) C16500q.m74659j(h0Var.mo47043B())));
            b2Var.mo42422E();
            C15118b2.m65182B(b2Var, c, 0, 2, (Object) null);
        }
        C16151c0 J = h0Var.mo47058l().mo47039m().mo47482J();
        C16434j B = J.mo46592B();
        if (B == null) {
            B = C16434j.f40726b.mo47682d();
        }
        C16434j jVar = B;
        C15205e4 A = J.mo46591A();
        if (A == null) {
            A = C15205e4.f37522d.mo42746a();
        }
        C15205e4 e4Var = A;
        C15192h p = J.mo46612p();
        if (p == null) {
            p = C15197l.f37504a;
        }
        C15192h hVar = p;
        try {
            C15421z1 m = J.mo46610m();
            if (m != null) {
                if (J.mo46593C() != TextForegroundStyle.C16409b.f40665b) {
                    f = J.mo46593C().getAlpha();
                } else {
                    f = 1.0f;
                }
                C16349k.m73637M(h0Var.mo47069w(), b2Var, m, f, e4Var, jVar, hVar, 0, 64, (Object) null);
            } else {
                if (J.mo46593C() != TextForegroundStyle.C16409b.f40665b) {
                    j = J.mo46593C().mo47577a();
                } else {
                    j = C15240j2.f37547b.mo42841a();
                }
                C16349k.m73635I(h0Var.mo47069w(), b2Var, j, e4Var, jVar, hVar, 0, 32, (Object) null);
            }
        } finally {
            if (z) {
                b2Var.mo42443q();
            }
        }
    }
}
