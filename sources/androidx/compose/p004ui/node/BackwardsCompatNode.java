package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8743c;
import androidx.compose.p004ui.draw.C8746f;
import androidx.compose.p004ui.draw.C8749h;
import androidx.compose.p004ui.focus.C15061e;
import androidx.compose.p004ui.focus.C15064g;
import androidx.compose.p004ui.focus.C15072m;
import androidx.compose.p004ui.focus.C15078r;
import androidx.compose.p004ui.focus.C15081u;
import androidx.compose.p004ui.focus.C15084w;
import androidx.compose.p004ui.focus.C15087z;
import androidx.compose.p004ui.focus.FocusProperties;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.input.pointer.C15469d0;
import androidx.compose.p004ui.input.pointer.C15491o;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import androidx.compose.p004ui.layout.C15549c0;
import androidx.compose.p004ui.layout.C15550c1;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15578k;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15586n0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15592p0;
import androidx.compose.p004ui.layout.C15599s0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.layout.C15617y;
import androidx.compose.p004ui.modifier.C15624a;
import androidx.compose.p004ui.modifier.C15626c;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15631g;
import androidx.compose.p004ui.modifier.C15632h;
import androidx.compose.p004ui.modifier.C15633i;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.C16036k;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.google.maps.android.data.geojson.C33834i;
import java.util.HashSet;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,471:1\n77#2:472\n73#2:474\n77#2:478\n71#2:480\n69#2:482\n81#2:484\n83#2:486\n75#2:490\n73#2:492\n81#2:494\n77#2:495\n196#3:473\n196#3:475\n196#3:479\n196#3:481\n196#3:483\n196#3:485\n196#3:487\n196#3:491\n196#3:493\n735#4,2:476\n728#4,2:488\n314#5:496\n78#5,17:497\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n120#1:472\n130#1:474\n141#1:478\n152#1:480\n160#1:482\n176#1:484\n201#1:486\n214#1:490\n219#1:492\n229#1:494\n265#1:495\n120#1:473\n130#1:475\n141#1:479\n152#1:481\n160#1:483\n176#1:485\n201#1:487\n214#1:491\n219#1:493\n134#1:476,2\n212#1:488,2\n265#1:496\n265#1:497,17\n*E\n"})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNode */
public final class BackwardsCompatNode extends C8767m.C8772d implements C15740w, C15725q, C15693i, C15703k1, C15689g1, C15632h, C15636k, C15683e1, C15738v, C15704l, C15064g, C15078r, C15084w, C15680d1, C8743c {
    @C12580l

    /* renamed from: E0 */
    public C15588o f38786E0;

    /* renamed from: X */
    public boolean f38787X = true;
    @C12580l

    /* renamed from: Y */
    public C15624a f38788Y;
    @C12579k

    /* renamed from: Z */
    public HashSet<C15626c<?>> f38789Z = new HashSet<>();
    @C12579k

    /* renamed from: z */
    public C8767m.C8770c f38790z;

    @C11363r0({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,471:1\n81#2:472\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n*L\n193#1:472\n*E\n"})
    /* renamed from: androidx.compose.ui.node.BackwardsCompatNode$a */
    public static final class C15640a implements C15675c1.C15677b {

        /* renamed from: a */
        public final /* synthetic */ BackwardsCompatNode f38791a;

        public C15640a(BackwardsCompatNode backwardsCompatNode) {
            this.f38791a = backwardsCompatNode;
        }

        /* renamed from: n */
        public void mo44572n() {
            if (this.f38791a.f38786E0 == null) {
                BackwardsCompatNode backwardsCompatNode = this.f38791a;
                backwardsCompatNode.mo44446p(C15681e.m70234o(backwardsCompatNode, C15739v0.m70597b(128)));
            }
        }
    }

    public BackwardsCompatNode(@C12579k C8767m.C8770c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "element");
        mo17246c0(C15741w0.m70616e(cVar));
        this.f38790z = cVar;
    }

    /* renamed from: A */
    public boolean mo44549A() {
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((C15469d0) cVar).mo43971C4().mo43981l0();
    }

    /* renamed from: C */
    public void mo17117C(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C8767m.C8770c cVar2 = this.f38790z;
        Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        C8749h hVar = (C8749h) cVar2;
        if (this.f38787X && (cVar2 instanceof C8746f)) {
            mo44566r0();
        }
        hVar.mo7212C(cVar);
    }

    /* renamed from: K */
    public void mo44550K(long j) {
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((C15578k) cVar).mo44422K(j);
    }

    @C12580l
    /* renamed from: N */
    public Object mo44447N(@C12579k C16479d dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((C15605u0) cVar).mo6431N(dVar, obj);
    }

    /* renamed from: O */
    public void mo44551O(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((C15586n0) cVar).mo8241O(oVar);
    }

    /* renamed from: S */
    public void mo17238S() {
        mo44560m0(true);
    }

    /* renamed from: T */
    public void mo17239T() {
        mo44565q0();
    }

    /* renamed from: W */
    public void mo42177W(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "focusState");
        C8767m.C8770c cVar = this.f38790z;
        if (cVar instanceof C15061e) {
            ((C15061e) cVar).mo7218W(zVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C12579k
    /* renamed from: Y */
    public C16035j mo44552Y() {
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((C16036k) cVar).mo46168Y();
    }

    /* renamed from: a */
    public <T> T mo44518a(@C12579k C15626c<T> cVar) {
        C15733t0 x0;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        this.f38789Z.add(cVar);
        int b = C15739v0.m70597b(32);
        if (mo17252q().mo17236Q()) {
            C8767m.C8772d M = mo17252q().mo17234M();
            LayoutNode p = C15681e.m70235p(this);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & b) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & b) != 0 && (M instanceof C15632h)) {
                            C15632h hVar = (C15632h) M;
                            if (hVar.mo44519o().mo44508a(cVar)) {
                                return hVar.mo44519o().mo44509b(cVar);
                            }
                        }
                        M = M.mo17234M();
                    }
                }
                p = p.mo44613C0();
                if (p == null || (x0 = p.mo44712x0()) == null) {
                    M = null;
                } else {
                    M = x0.mo45236r();
                }
            }
            return cVar.mo44514a().invoke();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public long mo17168b() {
        return C16502r.m74673f(C15681e.m70234o(this, C15739v0.m70597b(128)).mo44434a());
    }

    /* renamed from: c */
    public int mo17118c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C15603u) cVar).mo7060c(mVar, lVar, i);
    }

    /* renamed from: d */
    public int mo17119d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C15603u) cVar).mo7061d(mVar, lVar, i);
    }

    /* renamed from: e0 */
    public boolean mo44553e0() {
        return mo17236Q();
    }

    /* renamed from: f */
    public int mo17120f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C15603u) cVar).mo7062f(mVar, lVar, i);
    }

    @C12579k
    public C16479d getDensity() {
        return C15681e.m70235p(this).getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return C15681e.m70235p(this).getLayoutDirection();
    }

    /* renamed from: h */
    public int mo17121h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C15603u) cVar).mo7063h(mVar, lVar, i);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo17122i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C15603u) cVar).mo6430i(h0Var, e0Var, j);
    }

    /* renamed from: j */
    public long mo44554j() {
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        return ((C15578k) cVar).mo44423j();
    }

    /* renamed from: k */
    public void mo44555k(long j) {
        C8767m.C8770c cVar = this.f38790z;
        if (cVar instanceof C15599s0) {
            ((C15599s0) cVar).mo7337k(j);
        }
    }

    @C12579k
    /* renamed from: k0 */
    public final C8767m.C8770c mo44556k0() {
        return this.f38790z;
    }

    /* renamed from: l */
    public void mo44557l(@C12579k C15491o oVar, @C12579k PointerEventPass pointerEventPass, long j) {
        Intrinsics.checkNotNullParameter(oVar, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pass");
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C15469d0) cVar).mo43971C4().mo43979G1(oVar, pointerEventPass, j);
    }

    @C12579k
    /* renamed from: l0 */
    public final HashSet<C15626c<?>> mo44558l0() {
        return this.f38789Z;
    }

    /* renamed from: m */
    public void mo44559m(@C12579k C15617y yVar) {
        Intrinsics.checkNotNullParameter(yVar, C33834i.f82018j);
        C8767m.C8770c cVar = this.f38790z;
        if (cVar instanceof C15549c0) {
            ((C15549c0) cVar).mo44378e(yVar);
        }
    }

    /* renamed from: m0 */
    public final void mo44560m0(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (mo17236Q()) {
            C8767m.C8770c cVar = this.f38790z;
            boolean z8 = false;
            if ((C15739v0.m70597b(32) & mo17232I()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (cVar instanceof C15634j) {
                    mo44568t0((C15634j) cVar);
                }
                if (cVar instanceof C15627d) {
                    if (z) {
                        mo44567s0();
                    } else {
                        mo17250h0(new BackwardsCompatNode$initializeModifier$1(this));
                    }
                }
            }
            if ((C15739v0.m70597b(4) & mo17232I()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (cVar instanceof C8746f) {
                    this.f38787X = true;
                }
                if (!z) {
                    C15750z.m70683a(this);
                }
            }
            if ((C15739v0.m70597b(2) & mo17232I()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (C15681e.m70235p(this).mo44712x0().mo45236r().mo17236Q()) {
                    NodeCoordinator G = mo17230G();
                    Intrinsics.checkNotNull(G);
                    ((C15742x) G).mo45269N6(this);
                    G.mo44875o5();
                }
                if (!z) {
                    C15750z.m70683a(this);
                    C15681e.m70235p(this).mo44656T0();
                }
            }
            if (cVar instanceof C15550c1) {
                ((C15550c1) cVar).mo8350D2(this);
            }
            if ((C15739v0.m70597b(128) & mo17232I()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if ((cVar instanceof C15599s0) && C15681e.m70235p(this).mo44712x0().mo45236r().mo17236Q()) {
                    C15681e.m70235p(this).mo44656T0();
                }
                if (cVar instanceof C15592p0) {
                    this.f38786E0 = null;
                    if (C15681e.m70235p(this).mo44712x0().mo45236r().mo17236Q()) {
                        C15681e.m70236q(this).mo44994o(new C15640a(this));
                    }
                }
            }
            if ((C15739v0.m70597b(256) & mo17232I()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (cVar instanceof C15586n0) && C15681e.m70235p(this).mo44712x0().mo45236r().mo17236Q()) {
                C15681e.m70235p(this).mo44656T0();
            }
            if (cVar instanceof C15081u) {
                ((C15081u) cVar).mo42218m1().mo42128f().mo15463e(this);
            }
            if ((C15739v0.m70597b(16) & mo17232I()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (cVar instanceof C15469d0)) {
                ((C15469d0) cVar).mo43971C4().mo44032M1(mo17230G());
            }
            if ((C15739v0.m70597b(8) & mo17232I()) != 0) {
                z8 = true;
            }
            if (z8) {
                C15681e.m70236q(this).mo44962I();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: n */
    public boolean mo44561n() {
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((C15469d0) cVar).mo43971C4().mo43996j5();
    }

    /* renamed from: n0 */
    public final void mo44562n0() {
        this.f38787X = true;
        C15696j.m70310a(this);
    }

    @C12579k
    /* renamed from: o */
    public C15631g mo44519o() {
        C15624a aVar = this.f38788Y;
        return aVar != null ? aVar : C15633i.m69516a();
    }

    /* renamed from: o0 */
    public final void mo44563o0(@C12579k C8767m.C8770c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "value");
        if (mo17236Q()) {
            mo44565q0();
        }
        this.f38790z = cVar;
        mo17246c0(C15741w0.m70616e(cVar));
        if (mo17236Q()) {
            mo44560m0(false);
        }
    }

    /* renamed from: p */
    public void mo44446p(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f38786E0 = oVar;
        C8767m.C8770c cVar = this.f38790z;
        if (cVar instanceof C15592p0) {
            ((C15592p0) cVar).mo7338p(oVar);
        }
    }

    /* renamed from: p0 */
    public final void mo44564p0(@C12579k HashSet<C15626c<?>> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.f38789Z = hashSet;
    }

    /* renamed from: q0 */
    public final void mo44565q0() {
        boolean z;
        if (mo17236Q()) {
            C8767m.C8770c cVar = this.f38790z;
            boolean z2 = true;
            if ((C15739v0.m70597b(32) & mo17232I()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (cVar instanceof C15634j) {
                    C15681e.m70236q(this).getModifierLocalManager().mo44504e(this, ((C15634j) cVar).getKey());
                }
                if (cVar instanceof C15627d) {
                    ((C15627d) cVar).mo7151V3(BackwardsCompatNodeKt.f38792a);
                }
            }
            if ((C15739v0.m70597b(8) & mo17232I()) == 0) {
                z2 = false;
            }
            if (z2) {
                C15681e.m70236q(this).mo44962I();
            }
            if (cVar instanceof C15081u) {
                ((C15081u) cVar).mo42218m1().mo42128f().mo15495z0(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: r0 */
    public final void mo44566r0() {
        C8767m.C8770c cVar = this.f38790z;
        if (cVar instanceof C8746f) {
            C15681e.m70236q(this).getSnapshotObserver().mo44918i(this, BackwardsCompatNodeKt.f38793b, new BackwardsCompatNode$updateDrawCache$1(cVar, this));
        }
        this.f38787X = false;
    }

    /* renamed from: s */
    public void mo42215s(@C12579k FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        C8767m.C8770c cVar = this.f38790z;
        if (cVar instanceof C15072m) {
            new C15699k((C15072m) cVar).invoke(focusProperties);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: s0 */
    public final void mo44567s0() {
        if (mo17236Q()) {
            this.f38789Z.clear();
            C15681e.m70236q(this).getSnapshotObserver().mo44918i(this, BackwardsCompatNodeKt.f38794c, new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }

    /* renamed from: t0 */
    public final void mo44568t0(C15634j<?> jVar) {
        C15624a aVar = this.f38788Y;
        if (aVar == null || !aVar.mo44508a(jVar.getKey())) {
            this.f38788Y = new C15624a(jVar);
            if (C15681e.m70235p(this).mo44712x0().mo45236r().mo17236Q()) {
                C15681e.m70236q(this).getModifierLocalManager().mo44501b(this, jVar.getKey());
                return;
            }
            return;
        }
        aVar.mo44512e(jVar);
        C15681e.m70236q(this).getModifierLocalManager().mo44506g(this, jVar.getKey());
    }

    @C12579k
    public String toString() {
        return this.f38790z.toString();
    }

    /* renamed from: y */
    public void mo44570y() {
        C8767m.C8770c cVar = this.f38790z;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C15469d0) cVar).mo43971C4().mo43978D1();
    }

    /* renamed from: z */
    public void mo44571z() {
        this.f38787X = true;
        C15696j.m70310a(this);
    }
}
