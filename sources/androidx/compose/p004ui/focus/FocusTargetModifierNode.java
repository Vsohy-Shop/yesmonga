package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p004ui.layout.C15535b;
import androidx.compose.p004ui.modifier.C15632h;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.node.C15733t0;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.C15749y0;
import androidx.compose.p004ui.node.C15751z0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
@C11363r0({"SMAP\nFocusTargetModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,195:1\n89#2:196\n87#2:197\n87#2:208\n91#2:217\n87#2:218\n87#2:229\n47#3:198\n47#3:219\n78#4,9:199\n88#4,7:210\n78#4,9:220\n88#4,7:231\n196#5:209\n196#5:230\n*S KotlinDebug\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n*L\n88#1:196\n88#1:197\n91#1:208\n174#1:217\n174#1:218\n175#1:229\n88#1:198\n174#1:219\n88#1:199,9\n88#1:210,7\n174#1:220,9\n174#1:231,7\n91#1:209\n175#1:230\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode */
public final class FocusTargetModifierNode extends C8767m.C8772d implements C15749y0, C15632h {

    /* renamed from: Z */
    public static final int f37215Z = 8;

    /* renamed from: X */
    public boolean f37216X;
    @C12579k

    /* renamed from: Y */
    public FocusStateImpl f37217Y = FocusStateImpl.Inactive;

    /* renamed from: z */
    public boolean f37218z;

    @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0011"}, mo22516d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "t", "node", "u", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$FocusTargetModifierElement */
    public static final class FocusTargetModifierElement extends C15723p0<FocusTargetModifierNode> {
        @C12579k

        /* renamed from: c */
        public static final FocusTargetModifierElement f37219c = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        public boolean equals(@C12580l Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        /* renamed from: r */
        public void mo17101r(@C12579k C15983v0 v0Var) {
            Intrinsics.checkNotNullParameter(v0Var, "<this>");
            v0Var.mo45973d("focusTarget");
        }

        @C12579k
        /* renamed from: t */
        public FocusTargetModifierNode mo17098a() {
            return new FocusTargetModifierNode();
        }

        @C12579k
        /* renamed from: u */
        public FocusTargetModifierNode mo17102s(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
            Intrinsics.checkNotNullParameter(focusTargetModifierNode, "node");
            return focusTargetModifierNode;
        }
    }

    /* renamed from: U */
    public void mo17240U() {
        boolean z;
        C15087z r0 = mo42164r0();
        if (r0 == FocusStateImpl.Active || r0 == FocusStateImpl.Captured) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C15681e.m70236q(this).getFocusOwner().mo42083m(true);
        } else if (r0 == FocusStateImpl.ActiveParent) {
            mo42167u0();
            this.f37217Y = FocusStateImpl.Inactive;
        } else if (r0 == FocusStateImpl.Inactive) {
            mo42167u0();
        }
    }

    /* renamed from: n0 */
    public final void mo42159n0(int i, @C12579k C11300l<? super FocusRequester, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (!this.f37216X) {
            this.f37216X = true;
            try {
                FocusRequester invoke = mo42161p0().mo42103i().invoke(C15059d.m64706k(i));
                if (invoke != FocusRequester.f37201b.mo42132d()) {
                    lVar.invoke(invoke);
                }
            } finally {
                C11322b0.m43481d(1);
                this.f37216X = false;
                C11322b0.m43480c(1);
            }
        }
    }

    /* renamed from: o0 */
    public final void mo42160o0(int i, @C12579k C11300l<? super FocusRequester, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (!this.f37218z) {
            this.f37218z = true;
            try {
                FocusRequester invoke = mo42161p0().mo42097e().invoke(C15059d.m64706k(i));
                if (invoke != FocusRequester.f37201b.mo42132d()) {
                    lVar.invoke(invoke);
                }
            } finally {
                C11322b0.m43481d(1);
                this.f37218z = false;
                C11322b0.m43480c(1);
            }
        }
    }

    @C8761g
    @C12579k
    /* renamed from: p0 */
    public final FocusProperties mo42161p0() {
        C15733t0 x0;
        boolean z;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int b = C15739v0.m70597b(2048) | C15739v0.m70597b(1024);
        if (mo17252q().mo17236Q()) {
            C8767m.C8772d M = mo17252q().mo17234M();
            LayoutNode p = C15681e.m70235p(this);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & b) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & b) != 0) {
                            if ((C15739v0.m70597b(1024) & M.mo17232I()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                return focusPropertiesImpl;
                            }
                            if (M instanceof C15078r) {
                                ((C15078r) M).mo42215s(focusPropertiesImpl);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
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
            return focusPropertiesImpl;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @C12580l
    /* renamed from: q0 */
    public final C15535b mo42162q0() {
        return (C15535b) mo44518a(BeyondBoundsLayoutKt.m68890a());
    }

    /* renamed from: r */
    public void mo42163r() {
        C15087z r0 = mo42164r0();
        mo42166t0();
        if (!Intrinsics.areEqual((Object) r0, (Object) mo42164r0())) {
            C15066i.m64744b(this);
        }
    }

    @C12579k
    /* renamed from: r0 */
    public final C15087z mo42164r0() {
        return this.f37217Y;
    }

    @C12579k
    /* renamed from: s0 */
    public final FocusStateImpl mo42165s0() {
        return this.f37217Y;
    }

    /* renamed from: t0 */
    public final void mo42166t0() {
        boolean z;
        FocusProperties focusProperties;
        C15087z r0 = mo42164r0();
        if (r0 == FocusStateImpl.Active || r0 == FocusStateImpl.Captured) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C15751z0.m70687a(this, new FocusTargetModifierNode$invalidateFocus$1(objectRef, this));
            T t = objectRef.element;
            if (t == null) {
                Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t;
            }
            if (!focusProperties.mo42109o()) {
                C15681e.m70236q(this).getFocusOwner().mo42083m(true);
            }
        } else if (r0 != FocusStateImpl.ActiveParent) {
            FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;
        }
    }

    /* renamed from: u0 */
    public final void mo42167u0() {
        C15733t0 x0;
        boolean z;
        int b = C15739v0.m70597b(4096) | C15739v0.m70597b(1024);
        if (mo17252q().mo17236Q()) {
            C8767m.C8772d M = mo17252q().mo17234M();
            LayoutNode p = C15681e.m70235p(this);
            while (p != null) {
                if ((p.mo44712x0().mo45231m().mo17228E() & b) != 0) {
                    while (M != null) {
                        if ((M.mo17232I() & b) != 0) {
                            if ((C15739v0.m70597b(1024) & M.mo17232I()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                continue;
                            } else if (M instanceof C15064g) {
                                C15681e.m70236q(this).getFocusOwner().mo42073c((C15064g) M);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
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
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: v0 */
    public final void mo42168v0(@C12579k FocusStateImpl focusStateImpl) {
        Intrinsics.checkNotNullParameter(focusStateImpl, "<set-?>");
        this.f37217Y = focusStateImpl;
    }
}
