package androidx.compose.p004ui.focus;

import android.view.KeyEvent;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.input.key.C15442g;
import androidx.compose.p004ui.input.rotary.C15513b;
import androidx.compose.p004ui.input.rotary.C15515d;
import androidx.compose.p004ui.node.C15678d;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,275:1\n224#1:279\n225#1:281\n226#1,3:288\n229#1:297\n224#1:301\n225#1:303\n226#1,3:310\n229#1:319\n93#2:276\n93#2:278\n95#2:298\n95#2:300\n87#2,7:333\n87#2:348\n324#3:277\n320#3:280\n324#3:299\n320#3:302\n320#3:320\n262#3,7:341\n270#3,3:350\n51#4,6:282\n33#4,6:291\n51#4,6:304\n33#4,6:313\n51#4,6:321\n33#4,6:327\n47#5:340\n196#6:349\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n177#1:279\n177#1:281\n177#1:288,3\n177#1:297\n194#1:301\n194#1:303\n194#1:310,3\n194#1:319\n175#1:276\n178#1:278\n192#1:298\n195#1:300\n242#1:333,7\n243#1:348\n175#1:277\n177#1:280\n192#1:299\n194#1:302\n224#1:320\n242#1:341,7\n242#1:350,3\n177#1:282,6\n177#1:291,6\n194#1:304,6\n194#1:313,6\n225#1:321,6\n228#1:327,6\n242#1:340\n243#1:349\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl */
public final class FocusOwnerImpl implements C15076p {
    @C12579k

    /* renamed from: a */
    public FocusTargetModifierNode f37179a = new FocusTargetModifierNode();
    @C12579k

    /* renamed from: b */
    public final FocusInvalidationManager f37180b;
    @C12579k

    /* renamed from: c */
    public final C8767m f37181c;

    /* renamed from: d */
    public LayoutDirection f37182d;

    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$a */
    public /* synthetic */ class C15046a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p004ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.FocusOwnerImpl.C15046a.<clinit>():void");
        }
    }

    public FocusOwnerImpl(@C12579k C11300l<? super C11289a<C11079d2>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onRequestApplyChangesListener");
        this.f37180b = new FocusInvalidationManager(lVar);
        this.f37181c = new FocusOwnerImpl$modifier$1(this);
    }

    /* renamed from: o */
    public static /* synthetic */ void m64490o() {
    }

    /* renamed from: q */
    public static /* synthetic */ void m64491q() {
    }

    @C8761g
    /* renamed from: t */
    private final /* synthetic */ <T extends C15678d> void m64492t(T t, int i, C11300l<? super T, C11079d2> lVar, C11300l<? super T, C11079d2> lVar2) {
        int i2;
        List<C8767m.C8772d> c = C15681e.m70222c(t, i);
        if (!(c instanceof List)) {
            c = null;
        }
        if (c != null && c.size() - 1 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                lVar.invoke(c.get(i2));
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        lVar.invoke(t);
        lVar2.invoke(t);
        if (c != null) {
            int size = c.size();
            for (int i4 = 0; i4 < size; i4++) {
                lVar2.invoke(c.get(i4));
            }
        }
    }

    /* renamed from: a */
    public void mo42071a(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f37182d = layoutDirection;
    }

    @C12579k
    /* renamed from: b */
    public C8767m mo42072b() {
        return this.f37181c;
    }

    /* renamed from: c */
    public void mo42073c(@C12579k C15064g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "node");
        this.f37180b.mo42067d(gVar);
    }

    /* renamed from: d */
    public void mo42074d() {
        if (this.f37179a.mo42165s0() == FocusStateImpl.Inactive) {
            this.f37179a.mo42168v0(FocusStateImpl.Active);
        }
    }

    /* renamed from: e */
    public void mo42075e(boolean z, boolean z2) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl s0 = this.f37179a.mo42165s0();
        if (FocusTransactionsKt.m64639d(this.f37179a, z, z2)) {
            FocusTargetModifierNode focusTargetModifierNode = this.f37179a;
            int i = C15046a.$EnumSwitchMapping$0[s0.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else if (i == 4) {
                focusStateImpl = FocusStateImpl.Inactive;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            focusTargetModifierNode.mo42168v0(focusStateImpl);
        }
    }

    /* renamed from: f */
    public void mo42076f(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "node");
        this.f37180b.mo42069f(focusTargetModifierNode);
    }

    /* renamed from: g */
    public boolean mo42077g(int i) {
        FocusTargetModifierNode b = C15054a0.m64682b(this.f37179a);
        if (b == null) {
            return false;
        }
        FocusRequester a = C15054a0.m64681a(b, i, getLayoutDirection());
        FocusRequester.C15047a aVar = FocusRequester.f37201b;
        if (Intrinsics.areEqual((Object) a, (Object) aVar.mo42131b())) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) a, (Object) aVar.mo42132d())) {
            return a.mo42126d(FocusOwnerImpl$moveFocus$1.f37184f);
        }
        if (C15054a0.m64685e(this.f37179a, i, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(b)) || mo42088u(i)) {
            return true;
        }
        return false;
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.f37182d;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    /* renamed from: i */
    public boolean mo42079i(@C12579k C15515d dVar) {
        C15513b bVar;
        int i;
        Intrinsics.checkNotNullParameter(dVar, "event");
        FocusTargetModifierNode b = C15054a0.m64682b(this.f37179a);
        List<C8767m.C8772d> list = null;
        if (b != null) {
            C8767m.C8772d m = C15681e.m70232m(b, C15739v0.m70597b(16384));
            if (!(m instanceof C15513b)) {
                m = null;
            }
            bVar = (C15513b) m;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            List<C8767m.C8772d> c = C15681e.m70222c(bVar, C15739v0.m70597b(16384));
            if (c instanceof List) {
                list = c;
            }
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = i - 1;
                    if (((C15513b) list.get(i)).mo44232g(dVar)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    i = i2;
                }
            }
            if (bVar.mo44232g(dVar) || bVar.mo44233w(dVar)) {
                return true;
            }
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((C15513b) list.get(i3)).mo44233w(dVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo42080j(@C12579k C15078r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "node");
        this.f37180b.mo42068e(rVar);
    }

    @C12580l
    /* renamed from: k */
    public C15098i mo42081k() {
        FocusTargetModifierNode b = C15054a0.m64682b(this.f37179a);
        if (b != null) {
            return C15054a0.m64684d(b);
        }
        return null;
    }

    /* renamed from: l */
    public void mo42082l() {
        FocusTransactionsKt.m64639d(this.f37179a, true, true);
    }

    /* renamed from: m */
    public void mo42083m(boolean z) {
        mo42075e(z, true);
    }

    /* renamed from: n */
    public boolean mo42084n(@C12579k KeyEvent keyEvent) {
        int i;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetModifierNode b = C15054a0.m64682b(this.f37179a);
        if (b != null) {
            C15442g r = mo42086r(b);
            List<C8767m.C8772d> list = null;
            if (r == null) {
                C8767m.C8772d m = C15681e.m70232m(b, C15739v0.m70597b(8192));
                if (!(m instanceof C15442g)) {
                    m = null;
                }
                r = (C15442g) m;
            }
            if (r != null) {
                List<C8767m.C8772d> c = C15681e.m70222c(r, C15739v0.m70597b(8192));
                if (c instanceof List) {
                    list = c;
                }
                if (list != null && list.size() - 1 >= 0) {
                    while (true) {
                        int i2 = i - 1;
                        if (((C15442g) list.get(i)).mo43936t(keyEvent)) {
                            return true;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (r.mo43936t(keyEvent) || r.mo43937v(keyEvent)) {
                    return true;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((C15442g) list.get(i3)).mo43937v(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    @C12579k
    /* renamed from: p */
    public final FocusTargetModifierNode mo42085p() {
        return this.f37179a;
    }

    /* renamed from: r */
    public final C15442g mo42086r(C15678d dVar) {
        boolean z;
        int b = C15739v0.m70597b(1024) | C15739v0.m70597b(8192);
        if (dVar.mo17252q().mo17236Q()) {
            C8767m.C8772d q = dVar.mo17252q();
            C15442g gVar = null;
            if ((q.mo17228E() & b) != 0) {
                for (C8767m.C8772d F = q.mo17229F(); F != null; F = F.mo17229F()) {
                    if ((F.mo17232I() & b) != 0) {
                        if ((C15739v0.m70597b(1024) & F.mo17232I()) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return gVar;
                        }
                        if (F instanceof C15442g) {
                            gVar = F;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
            }
            return gVar;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: s */
    public final void mo42087s(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<set-?>");
        this.f37179a = focusTargetModifierNode;
    }

    /* renamed from: u */
    public final boolean mo42088u(int i) {
        boolean z;
        if (this.f37179a.mo42164r0().mo42158r() && !this.f37179a.mo42164r0().mo42156g()) {
            C15059d.C15060a aVar = C15059d.f37228b;
            if (C15059d.m64709n(i, aVar.mo42189i())) {
                z = true;
            } else {
                z = C15059d.m64709n(i, aVar.mo42191l());
            }
            if (z) {
                mo42083m(false);
                if (!this.f37179a.mo42164r0().mo42156g()) {
                    return false;
                }
                return mo42077g(i);
            }
        }
        return false;
    }
}
