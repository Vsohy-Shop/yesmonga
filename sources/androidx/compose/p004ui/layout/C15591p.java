package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.comparisons.C11016h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.p */
public final class C15591p {
    @C12579k
    /* renamed from: a */
    public static final C15098i m69299a(@C12579k C15588o oVar) {
        C15098i C;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        C15588o w0 = oVar.mo44438w0();
        if (w0 == null || (C = C15588o.m69281C(w0, oVar, false, 2, (Object) null)) == null) {
            return new C15098i(0.0f, 0.0f, (float) C16500q.m74662m(oVar.mo44434a()), (float) C16500q.m74659j(oVar.mo44434a()));
        }
        return C;
    }

    @C12579k
    /* renamed from: b */
    public static final C15098i m69300b(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return C15588o.m69281C(m69302d(oVar), oVar, false, 2, (Object) null);
    }

    @C12579k
    /* renamed from: c */
    public static final C15098i m69301c(@C12579k C15588o oVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        C15588o d = m69302d(oVar);
        C15098i b = m69300b(oVar);
        float m = (float) C16500q.m74662m(d.mo44434a());
        float j = (float) C16500q.m74659j(d.mo44434a());
        float H = C11479u.m44331H(b.mo42279t(), 0.0f, m);
        float H2 = C11479u.m44331H(b.mo42249B(), 0.0f, j);
        float H3 = C11479u.m44331H(b.mo42283x(), 0.0f, m);
        float H4 = C11479u.m44331H(b.mo42271j(), 0.0f, j);
        if (H == H3) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (H2 == H4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long b0 = d.mo44435b0(C15096g.m64898a(H, H2));
                long b02 = d.mo44435b0(C15096g.m64898a(H3, H2));
                long b03 = d.mo44435b0(C15096g.m64898a(H3, H4));
                long b04 = d.mo44435b0(C15096g.m64898a(H, H4));
                return new C15098i(C11016h.m42468l0(C15094f.m64880p(b0), C15094f.m64880p(b02), C15094f.m64880p(b04), C15094f.m64880p(b03)), C11016h.m42468l0(C15094f.m64882r(b0), C15094f.m64882r(b02), C15094f.m64882r(b04), C15094f.m64882r(b03)), C11016h.m42447Q(C15094f.m64880p(b0), C15094f.m64880p(b02), C15094f.m64880p(b04), C15094f.m64880p(b03)), C11016h.m42447Q(C15094f.m64882r(b0), C15094f.m64882r(b02), C15094f.m64882r(b04), C15094f.m64882r(b03)));
            }
        }
        return C15098i.f37261e.mo42285a();
    }

    @C12579k
    /* renamed from: d */
    public static final C15588o m69302d(@C12579k C15588o oVar) {
        C15588o oVar2;
        NodeCoordinator nodeCoordinator;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        C15588o w0 = oVar.mo44438w0();
        while (true) {
            C15588o oVar3 = w0;
            oVar2 = oVar;
            oVar = oVar3;
            if (oVar == null) {
                break;
            }
            w0 = oVar.mo44438w0();
        }
        if (oVar2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) oVar2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return oVar2;
        }
        NodeCoordinator z4 = nodeCoordinator.mo44894z4();
        while (true) {
            NodeCoordinator nodeCoordinator2 = z4;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            z4 = nodeCoordinator.mo44894z4();
        }
    }

    /* renamed from: e */
    public static final long m69303e(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        C15588o w0 = oVar.mo44438w0();
        if (w0 != null) {
            return w0.mo44430K(oVar, C15094f.f37256b.mo42248e());
        }
        return C15094f.f37256b.mo42248e();
    }

    /* renamed from: f */
    public static final long m69304f(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return oVar.mo44440z0(C15094f.f37256b.mo42248e());
    }

    /* renamed from: g */
    public static final long m69305g(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return oVar.mo44435b0(C15094f.f37256b.mo42248e());
    }
}
