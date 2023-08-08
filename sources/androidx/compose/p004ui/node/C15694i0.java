package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15575i1;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.node.i0 */
public abstract class C15694i0 extends C15611w0 implements C15710m0 {

    /* renamed from: f */
    public boolean f39003f;

    /* renamed from: g */
    public boolean f39004g;

    /* renamed from: A */
    public final int mo44325A(@C12579k C15531a aVar) {
        int U0;
        int i;
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        if (!mo44860c1() || (U0 = mo45020U0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (aVar instanceof C15575i1) {
            i = C16494m.m74581m(mo44467E0());
        } else {
            i = C16494m.m74583o(mo44467E0());
        }
        return U0 + i;
    }

    @C12579k
    /* renamed from: H5 */
    public abstract LayoutNode mo44836H5();

    /* renamed from: U0 */
    public abstract int mo45020U0(@C12579k C15531a aVar);

    @C12579k
    /* renamed from: W0 */
    public abstract C15665a mo44852W0();

    @C12580l
    /* renamed from: Z0 */
    public abstract C15694i0 mo44856Z0();

    @C12579k
    /* renamed from: b1 */
    public abstract C15588o mo44858b1();

    /* renamed from: c1 */
    public abstract boolean mo44860c1();

    @C12579k
    /* renamed from: e1 */
    public abstract C15564g0 mo44862e1();

    @C12580l
    /* renamed from: f1 */
    public abstract C15694i0 mo44863f1();

    /* renamed from: g1 */
    public abstract long mo44865g1();

    /* renamed from: j1 */
    public final void mo45021j1(@C12579k NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AlignmentLines w;
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        NodeCoordinator v4 = nodeCoordinator.mo44887v4();
        if (v4 != null) {
            layoutNode = v4.mo44836H5();
        } else {
            layoutNode = null;
        }
        if (!Intrinsics.areEqual((Object) layoutNode, (Object) nodeCoordinator.mo44836H5())) {
            nodeCoordinator.mo44852W0().mo44789w().mo44538q();
            return;
        }
        C15665a i = nodeCoordinator.mo44852W0().mo44779i();
        if (i != null && (w = i.mo44789w()) != null) {
            w.mo44538q();
        }
    }

    /* renamed from: k1 */
    public final boolean mo45022k1() {
        return this.f39004g;
    }

    /* renamed from: m1 */
    public final boolean mo45023m1() {
        return this.f39003f;
    }

    /* renamed from: q1 */
    public abstract void mo44878q1();

    /* renamed from: r1 */
    public final void mo45024r1(boolean z) {
        this.f39004g = z;
    }

    /* renamed from: u1 */
    public final void mo45025u1(boolean z) {
        this.f39003f = z;
    }
}
