package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.node.C15697j0;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import java.util.Set;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,120:1\n179#2:121\n157#2:124\n179#2:126\n157#2:129\n86#3:122\n79#3:123\n86#3:125\n86#3:127\n79#3:128\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n63#1:121\n64#1:124\n69#1:126\n75#1:129\n63#1:122\n63#1:123\n68#1:125\n71#1:127\n68#1:128\n*E\n"})
/* renamed from: androidx.compose.ui.layout.z */
public final class C15619z implements C15617y {
    @C12579k

    /* renamed from: a */
    public final C15697j0 f38757a;

    public C15619z(@C12579k C15697j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "lookaheadDelegate");
        this.f38757a = j0Var;
    }

    /* renamed from: A */
    public int mo44429A(@C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        return mo44496b().mo44325A(aVar);
    }

    /* renamed from: K */
    public long mo44430K(@C12579k C15588o oVar, long j) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        return mo44496b().mo44430K(oVar, j);
    }

    @C12580l
    /* renamed from: N */
    public C15588o mo44431N() {
        return mo44496b().mo44431N();
    }

    /* renamed from: T */
    public long mo44432T(long j) {
        return mo44496b().mo44432T(j);
    }

    /* renamed from: W */
    public void mo44433W(@C12579k C15588o oVar, @C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        mo44496b().mo44433W(oVar, fArr);
    }

    /* renamed from: a */
    public long mo44434a() {
        return mo44496b().mo44434a();
    }

    @C12579k
    /* renamed from: b */
    public final NodeCoordinator mo44496b() {
        return this.f38757a.mo45033c2();
    }

    /* renamed from: b0 */
    public long mo44435b0(long j) {
        return mo44496b().mo44435b0(j);
    }

    @C12579k
    /* renamed from: c */
    public final C15697j0 mo44497c() {
        return this.f38757a;
    }

    /* renamed from: j */
    public long mo44495j(@C12579k C15617y yVar, long j) {
        Intrinsics.checkNotNullParameter(yVar, "sourceCoordinates");
        C15697j0 j0Var = ((C15619z) yVar).f38757a;
        C15697j0 j4 = mo44496b().mo44829E3(j0Var.mo45033c2()).mo44868j4();
        if (j4 != null) {
            long D2 = j0Var.mo45028D2(j4);
            long a = C16496n.m74593a(C11409d.m43851L0(C15094f.m64880p(j)), C11409d.m43851L0(C15094f.m64882r(j)));
            long a2 = C16496n.m74593a(C16494m.m74581m(D2) + C16494m.m74581m(a), C16494m.m74583o(D2) + C16494m.m74583o(a));
            long D22 = this.f38757a.mo45028D2(j4);
            long a3 = C16496n.m74593a(C16494m.m74581m(a2) - C16494m.m74581m(D22), C16494m.m74583o(a2) - C16494m.m74583o(D22));
            return C15096g.m64898a((float) C16494m.m74581m(a3), (float) C16494m.m74583o(a3));
        }
        C15697j0 a4 = C15533a0.m69048b(j0Var);
        long D23 = j0Var.mo45028D2(a4);
        long g1 = a4.mo44865g1();
        long a5 = C16496n.m74593a(C16494m.m74581m(D23) + C16494m.m74581m(g1), C16494m.m74583o(D23) + C16494m.m74583o(g1));
        long a6 = C16496n.m74593a(C11409d.m43851L0(C15094f.m64880p(j)), C11409d.m43851L0(C15094f.m64882r(j)));
        long a7 = C16496n.m74593a(C16494m.m74581m(a5) + C16494m.m74581m(a6), C16494m.m74583o(a5) + C16494m.m74583o(a6));
        C15697j0 j0Var2 = this.f38757a;
        long D24 = j0Var2.mo45028D2(C15533a0.m69048b(j0Var2));
        long g12 = C15533a0.m69048b(j0Var2).mo44865g1();
        long a8 = C16496n.m74593a(C16494m.m74581m(D24) + C16494m.m74581m(g12), C16494m.m74583o(D24) + C16494m.m74583o(g12));
        long a9 = C16496n.m74593a(C16494m.m74581m(a7) - C16494m.m74581m(a8), C16494m.m74583o(a7) - C16494m.m74583o(a8));
        NodeCoordinator z4 = C15533a0.m69048b(this.f38757a).mo45033c2().mo44894z4();
        Intrinsics.checkNotNull(z4);
        NodeCoordinator z42 = a4.mo45033c2().mo44894z4();
        Intrinsics.checkNotNull(z42);
        return z4.mo44430K(z42, C15096g.m64898a((float) C16494m.m74581m(a9), (float) C16494m.m74583o(a9)));
    }

    /* renamed from: k */
    public boolean mo44436k() {
        return mo44496b().mo44436k();
    }

    @C12579k
    /* renamed from: n0 */
    public C15098i mo44437n0(@C12579k C15588o oVar, boolean z) {
        Intrinsics.checkNotNullParameter(oVar, "sourceCoordinates");
        return mo44496b().mo44437n0(oVar, z);
    }

    @C12580l
    /* renamed from: w0 */
    public C15588o mo44438w0() {
        return mo44496b().mo44438w0();
    }

    @C12579k
    /* renamed from: x0 */
    public Set<C15531a> mo44439x0() {
        return mo44496b().mo44439x0();
    }

    /* renamed from: z0 */
    public long mo44440z0(long j) {
        return mo44496b().mo44440z0(j);
    }
}
