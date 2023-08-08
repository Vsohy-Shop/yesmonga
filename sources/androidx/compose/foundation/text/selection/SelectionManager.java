package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.text.C2846t;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C2830i;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15056b;
import androidx.compose.p004ui.focus.C15083v;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.hapticfeedback.C15425a;
import androidx.compose.p004ui.hapticfeedback.C15426b;
import androidx.compose.p004ui.input.key.C15441f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p004ui.platform.C15912k0;
import androidx.compose.p004ui.platform.C15996x3;
import androidx.compose.p004ui.platform.TextToolbarStatus;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,914:1\n76#2:915\n102#2,2:916\n76#2:918\n102#2,2:919\n76#2:921\n102#2,2:922\n76#2:924\n102#2,2:925\n76#2:927\n102#2,2:928\n76#2:930\n102#2,2:931\n76#2:933\n102#2,2:934\n1#3:936\n59#4,3:937\n62#4,2:944\n64#4:947\n59#4,3:948\n62#4,2:955\n64#4:958\n33#5,4:940\n38#5:946\n33#5,4:951\n38#5:957\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n112#1:915\n112#1:916,2\n161#1:918\n161#1:919,2\n168#1:921\n168#1:922,2\n177#1:924\n177#1:925,2\n186#1:927\n186#1:928,2\n193#1:930\n193#1:931,2\n200#1:933\n200#1:934,2\n368#1:937,3\n368#1:944,2\n368#1:947\n752#1:948,3\n752#1:955,2\n752#1:958\n368#1:940,4\n368#1:946\n752#1:951,4\n752#1:957\n*E\n"})
public final class SelectionManager {
    @C12579k

    /* renamed from: a */
    public final SelectionRegistrarImpl f7359a;
    @C12579k

    /* renamed from: b */
    public final C8700z0<C2830i> f7360b = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    /* renamed from: c */
    public boolean f7361c = true;
    @C12579k

    /* renamed from: d */
    public C11300l<? super C2830i, C11079d2> f7362d = SelectionManager$onSelectionChange$1.f7378f;
    @C12580l

    /* renamed from: e */
    public C15425a f7363e;
    @C12580l

    /* renamed from: f */
    public C15912k0 f7364f;
    @C12580l

    /* renamed from: g */
    public C15996x3 f7365g;
    @C12579k

    /* renamed from: h */
    public FocusRequester f7366h = new FocusRequester();
    @C12579k

    /* renamed from: i */
    public final C8700z0 f7367i = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
    @C12580l

    /* renamed from: j */
    public C15094f f7368j;
    @C12580l

    /* renamed from: k */
    public C15588o f7369k;
    @C12579k

    /* renamed from: l */
    public final C8700z0 f7370l;
    @C12579k

    /* renamed from: m */
    public final C8700z0 f7371m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f7372n;
    @C12579k

    /* renamed from: o */
    public final C8700z0 f7373o;
    @C12579k

    /* renamed from: p */
    public final C8700z0 f7374p;
    @C12579k

    /* renamed from: q */
    public final C8700z0 f7375q;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$a */
    public static final class C2805a implements C2846t {

        /* renamed from: a */
        public final /* synthetic */ SelectionManager f7376a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7377b;

        public C2805a(SelectionManager selectionManager, boolean z) {
            this.f7376a = selectionManager;
            this.f7377b = z;
        }

        /* renamed from: a */
        public void mo9336a() {
            this.f7376a.mo9655f0();
            this.f7376a.mo9645V((Handle) null);
            this.f7376a.mo9642S((C15094f) null);
        }

        /* renamed from: b */
        public void mo9337b(long j) {
            C2830i.C2831a aVar;
            C15588o e;
            Handle handle;
            C2830i F = this.f7376a.mo9629F();
            if (F != null) {
                if (this.f7377b) {
                    aVar = F.mo9872h();
                } else {
                    aVar = F.mo9870f();
                }
                C2829h q = this.f7376a.mo9665q(aVar);
                if (q != null && (e = q.mo9858e()) != null) {
                    long a = C2834l.m13089a(q.mo9859f(F, this.f7377b));
                    SelectionManager selectionManager = this.f7376a;
                    selectionManager.mo9642S(C15094f.m64868d(selectionManager.mo9638O().mo44430K(e, a)));
                    SelectionManager selectionManager2 = this.f7376a;
                    if (this.f7377b) {
                        handle = Handle.SelectionStart;
                    } else {
                        handle = Handle.SelectionEnd;
                    }
                    selectionManager2.mo9645V(handle);
                }
            }
        }

        /* renamed from: c */
        public void mo9338c(long j) {
            long j2;
            this.f7376a.mo9635L();
            C2830i F = this.f7376a.mo9629F();
            Intrinsics.checkNotNull(F);
            C2829h hVar = this.f7376a.f7359a.mo9717s().get(Long.valueOf(F.mo9872h().mo9884h()));
            C2829h hVar2 = this.f7376a.f7359a.mo9717s().get(Long.valueOf(F.mo9870f().mo9884h()));
            C15588o oVar = null;
            if (this.f7377b) {
                if (hVar != null) {
                    oVar = hVar.mo9858e();
                }
                Intrinsics.checkNotNull(oVar);
            } else {
                if (hVar2 != null) {
                    oVar = hVar2.mo9858e();
                }
                Intrinsics.checkNotNull(oVar);
            }
            if (this.f7377b) {
                Intrinsics.checkNotNull(hVar);
                j2 = hVar.mo9859f(F, true);
            } else {
                Intrinsics.checkNotNull(hVar2);
                j2 = hVar2.mo9859f(F, false);
            }
            long a = C2834l.m13089a(j2);
            SelectionManager selectionManager = this.f7376a;
            selectionManager.mo9643T(selectionManager.mo9638O().mo44430K(oVar, a));
            this.f7376a.mo9644U(C15094f.f37256b.mo42248e());
        }

        /* renamed from: d */
        public void mo9339d() {
            this.f7376a.mo9645V((Handle) null);
            this.f7376a.mo9642S((C15094f) null);
        }

        /* renamed from: e */
        public void mo9340e(long j) {
            SelectionManager selectionManager = this.f7376a;
            selectionManager.mo9644U(C15094f.m64886v(selectionManager.mo9671w(), j));
            long v = C15094f.m64886v(this.f7376a.mo9670v(), this.f7376a.mo9671w());
            if (this.f7376a.mo9659j0(C15094f.m64868d(v), C15094f.m64868d(this.f7376a.mo9670v()), this.f7377b, SelectionAdjustment.f7343a.mo9597d())) {
                this.f7376a.mo9643T(v);
                this.f7376a.mo9644U(C15094f.f37256b.mo42248e());
            }
        }

        public void onCancel() {
            this.f7376a.mo9655f0();
            this.f7376a.mo9645V((Handle) null);
            this.f7376a.mo9642S((C15094f) null);
        }
    }

    public SelectionManager(@C12579k SelectionRegistrarImpl selectionRegistrarImpl) {
        Intrinsics.checkNotNullParameter(selectionRegistrarImpl, "selectionRegistrar");
        this.f7359a = selectionRegistrarImpl;
        C15094f.C15095a aVar = C15094f.f37256b;
        this.f7370l = C8539f2.m30981g(C15094f.m64868d(aVar.mo42248e()), (C8410b2) null, 2, (Object) null);
        this.f7371m = C8539f2.m30981g(C15094f.m64868d(aVar.mo42248e()), (C8410b2) null, 2, (Object) null);
        this.f7372n = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7373o = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7374p = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7375q = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        selectionRegistrarImpl.mo9721w(new C11300l<Long, C11079d2>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            /* renamed from: a */
            public final void mo9675a(long j) {
                boolean z;
                C2830i.C2831a f;
                C2830i.C2831a h;
                C2830i F = this.this$0.mo9629F();
                boolean z2 = true;
                if (F == null || (h = F.mo9872h()) == null || j != h.mo9884h()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C2830i F2 = this.this$0.mo9629F();
                    if (F2 == null || (f = F2.mo9870f()) == null || j != f.mo9884h()) {
                        z2 = false;
                    }
                    if (!z2) {
                        return;
                    }
                }
                this.this$0.mo9657h0();
                this.this$0.mo9660k0();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9675a(((Number) obj).longValue());
                return C11079d2.f28267a;
            }
        });
        selectionRegistrarImpl.mo9696B(new C11305q<C15588o, C15094f, SelectionAdjustment, C11079d2>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            /* renamed from: a */
            public final void mo9676a(@C12579k C15588o oVar, long j, @C12579k SelectionAdjustment selectionAdjustment) {
                Intrinsics.checkNotNullParameter(oVar, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionAdjustment, "selectionMode");
                C15094f a = this.this$0.mo9662n(oVar, j);
                if (a != null) {
                    this.this$0.mo9656g0(a.mo42242A(), false, selectionAdjustment);
                    this.this$0.mo9674z().mo42129h();
                    this.this$0.mo9635L();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo9676a((C15588o) obj, ((C15094f) obj2).mo42242A(), (SelectionAdjustment) obj3);
                return C11079d2.f28267a;
            }
        });
        selectionRegistrarImpl.mo9695A(new C11300l<Long, C11079d2>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            /* renamed from: a */
            public final void mo9677a(long j) {
                SelectionManager selectionManager = this.this$0;
                Pair<C2830i, Map<Long, C2830i>> P = selectionManager.mo9639P(j, selectionManager.mo9629F());
                C2830i a = P.mo21846a();
                Map b = P.mo21847b();
                if (!Intrinsics.areEqual((Object) a, (Object) this.this$0.mo9629F())) {
                    this.this$0.f7359a.mo9698D(b);
                    this.this$0.mo9627D().invoke(a);
                }
                this.this$0.mo9674z().mo42129h();
                this.this$0.mo9635L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9677a(((Number) obj).longValue());
                return C11079d2.f28267a;
            }
        });
        selectionRegistrarImpl.mo9723y(new C11307s<C15588o, C15094f, C15094f, Boolean, SelectionAdjustment, Boolean>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            @C12579k
            /* renamed from: a */
            public final Boolean mo9678a(@C12579k C15588o oVar, long j, long j2, boolean z, @C12579k SelectionAdjustment selectionAdjustment) {
                Intrinsics.checkNotNullParameter(oVar, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionAdjustment, "selectionMode");
                return Boolean.valueOf(this.this$0.mo9659j0(this.this$0.mo9662n(oVar, j), this.this$0.mo9662n(oVar, j2), z, selectionAdjustment));
            }

            /* renamed from: v5 */
            public /* bridge */ /* synthetic */ Object mo7709v5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return mo9678a((C15588o) obj, ((C15094f) obj2).mo42242A(), ((C15094f) obj3).mo42242A(), ((Boolean) obj4).booleanValue(), (SelectionAdjustment) obj5);
            }
        });
        selectionRegistrarImpl.mo9724z(new C11289a<C11079d2>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.mo9655f0();
                this.this$0.mo9645V((Handle) null);
                this.this$0.mo9642S((C15094f) null);
            }
        });
        selectionRegistrarImpl.mo9722x(new C11300l<Long, C11079d2>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            /* renamed from: a */
            public final void mo9679a(long j) {
                if (this.this$0.f7359a.mo9702c().containsKey(Long.valueOf(j))) {
                    this.this$0.mo9637N();
                    this.this$0.mo9651b0((C2830i) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9679a(((Number) obj).longValue());
                return C11079d2.f28267a;
            }
        });
        selectionRegistrarImpl.mo9720v(new C11300l<Long, C11079d2>(this) {
            final /* synthetic */ SelectionManager this$0;

            {
                this.this$0 = r1;
            }

            /* renamed from: a */
            public final void mo9680a(long j) {
                boolean z;
                C2830i.C2831a f;
                C2830i.C2831a h;
                C2830i F = this.this$0.mo9629F();
                boolean z2 = true;
                if (F == null || (h = F.mo9872h()) == null || j != h.mo9884h()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C2830i F2 = this.this$0.mo9629F();
                    if (F2 == null || (f = F2.mo9870f()) == null || j != f.mo9884h()) {
                        z2 = false;
                    }
                    if (!z2) {
                        return;
                    }
                }
                this.this$0.mo9652c0((C15094f) null);
                this.this$0.mo9646W((C15094f) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9680a(((Number) obj).longValue());
                return C11079d2.f28267a;
            }
        });
    }

    @C12580l
    /* renamed from: A */
    public final C15425a mo9624A() {
        return this.f7363e;
    }

    /* renamed from: B */
    public final boolean mo9625B() {
        return ((Boolean) this.f7367i.getValue()).booleanValue();
    }

    @C12579k
    /* renamed from: C */
    public final C8767m mo9626C() {
        C8767m mVar = C8767m.f23478j;
        C8767m a = C15441f.m68286a(FocusableKt.m8920c(C15056b.m64690a(C15083v.m64810a(OnGloballyPositionedModifierKt.m68999a(mo9636M(mVar, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.f7366h), new SelectionManager$modifier$3(this)), false, (C2243g) null, 3, (Object) null), new SelectionManager$modifier$4(this));
        if (mo9630G()) {
            mVar = SelectionManager_androidKt.m12805b(mVar, this);
        }
        return a.mo17224k3(mVar);
    }

    @C12579k
    /* renamed from: D */
    public final C11300l<C2830i, C11079d2> mo9627D() {
        return this.f7362d;
    }

    @C12580l
    /* renamed from: E */
    public final C16156d mo9628E() {
        C16156d n;
        List<C2829h> E = this.f7359a.mo9699E(mo9638O());
        C2830i F = mo9629F();
        C16156d dVar = null;
        if (F == null) {
            return null;
        }
        int size = E.size();
        for (int i = 0; i < size; i++) {
            C2829h hVar = E.get(i);
            if (hVar.mo9861h() == F.mo9872h().mo9884h() || hVar.mo9861h() == F.mo9870f().mo9884h() || dVar != null) {
                C16156d d = C2835m.m13096d(hVar, F);
                if (!(dVar == null || (n = dVar.mo46688n(d)) == null)) {
                    d = n;
                }
                if ((hVar.mo9861h() == F.mo9870f().mo9884h() && !F.mo9871g()) || (hVar.mo9861h() == F.mo9872h().mo9884h() && F.mo9871g())) {
                    return d;
                }
                dVar = d;
            }
        }
        return dVar;
    }

    @C12580l
    /* renamed from: F */
    public final C2830i mo9629F() {
        return this.f7360b.getValue();
    }

    /* renamed from: G */
    public final boolean mo9630G() {
        return mo9672x() != null;
    }

    @C12580l
    /* renamed from: H */
    public final C15094f mo9631H() {
        return (C15094f) this.f7372n.getValue();
    }

    @C12580l
    /* renamed from: I */
    public final C15996x3 mo9632I() {
        return this.f7365g;
    }

    /* renamed from: J */
    public final boolean mo9633J() {
        return this.f7361c;
    }

    @C12579k
    /* renamed from: K */
    public final C2846t mo9634K(boolean z) {
        return new C2805a(this, z);
    }

    /* renamed from: L */
    public final void mo9635L() {
        TextToolbarStatus textToolbarStatus;
        C15996x3 x3Var;
        if (mo9625B()) {
            C15996x3 x3Var2 = this.f7365g;
            if (x3Var2 != null) {
                textToolbarStatus = x3Var2.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown && (x3Var = this.f7365g) != null) {
                x3Var.mo45485c();
            }
        }
    }

    /* renamed from: M */
    public final C8767m mo9636M(C8767m mVar, C11289a<C11079d2> aVar) {
        return mo9625B() ? SuspendingPointerInputFilterKt.m68437c(mVar, C11079d2.f28267a, new SelectionManager$onClearSelectionRequested$1(this, aVar, (C11045c<? super SelectionManager$onClearSelectionRequested$1>) null)) : mVar;
    }

    /* renamed from: N */
    public final void mo9637N() {
        this.f7359a.mo9698D(C10977s0.m41492z());
        mo9635L();
        if (mo9629F() != null) {
            this.f7362d.invoke(null);
            C15425a aVar = this.f7363e;
            if (aVar != null) {
                aVar.mo43597a(C15426b.f38115b.mo43603b());
            }
        }
    }

    @C12579k
    /* renamed from: O */
    public final C15588o mo9638O() {
        boolean z;
        C15588o oVar = this.f7369k;
        if (oVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (oVar.mo44436k()) {
            return oVar;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @C12579k
    /* renamed from: P */
    public final Pair<C2830i, Map<Long, C2830i>> mo9639P(long j, @C12580l C2830i iVar) {
        C15425a aVar;
        C2830i iVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C2829h> E = this.f7359a.mo9699E(mo9638O());
        int size = E.size();
        C2830i iVar3 = null;
        for (int i = 0; i < size; i++) {
            C2829h hVar = E.get(i);
            if (hVar.mo9861h() == j) {
                iVar2 = hVar.mo9862i();
            } else {
                iVar2 = null;
            }
            if (iVar2 != null) {
                linkedHashMap.put(Long.valueOf(hVar.mo9861h()), iVar2);
            }
            iVar3 = C2835m.m13097e(iVar3, iVar2);
        }
        if (!Intrinsics.areEqual((Object) iVar3, (Object) iVar) && (aVar = this.f7363e) != null) {
            aVar.mo43597a(C15426b.f38115b.mo43603b());
        }
        return new Pair<>(iVar3, linkedHashMap);
    }

    /* renamed from: Q */
    public final void mo9640Q(@C12580l C15912k0 k0Var) {
        this.f7364f = k0Var;
    }

    /* renamed from: R */
    public final void mo9641R(@C12580l C15588o oVar) {
        C15094f fVar;
        this.f7369k = oVar;
        if (mo9625B() && mo9629F() != null) {
            if (oVar != null) {
                fVar = C15094f.m64868d(C15591p.m69305g(oVar));
            } else {
                fVar = null;
            }
            if (!Intrinsics.areEqual((Object) this.f7368j, (Object) fVar)) {
                this.f7368j = fVar;
                mo9657h0();
                mo9660k0();
            }
        }
    }

    /* renamed from: S */
    public final void mo9642S(C15094f fVar) {
        this.f7375q.setValue(fVar);
    }

    /* renamed from: T */
    public final void mo9643T(long j) {
        this.f7370l.setValue(C15094f.m64868d(j));
    }

    /* renamed from: U */
    public final void mo9644U(long j) {
        this.f7371m.setValue(C15094f.m64868d(j));
    }

    /* renamed from: V */
    public final void mo9645V(Handle handle) {
        this.f7374p.setValue(handle);
    }

    /* renamed from: W */
    public final void mo9646W(C15094f fVar) {
        this.f7373o.setValue(fVar);
    }

    /* renamed from: X */
    public final void mo9647X(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f7366h = focusRequester;
    }

    /* renamed from: Y */
    public final void mo9648Y(@C12580l C15425a aVar) {
        this.f7363e = aVar;
    }

    /* renamed from: Z */
    public final void mo9649Z(boolean z) {
        this.f7367i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a0 */
    public final void mo9650a0(@C12579k C11300l<? super C2830i, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f7362d = lVar;
    }

    /* renamed from: b0 */
    public final void mo9651b0(@C12580l C2830i iVar) {
        this.f7360b.setValue(iVar);
        if (iVar != null) {
            mo9657h0();
        }
    }

    /* renamed from: c0 */
    public final void mo9652c0(C15094f fVar) {
        this.f7372n.setValue(fVar);
    }

    /* renamed from: d0 */
    public final void mo9653d0(@C12580l C15996x3 x3Var) {
        this.f7365g = x3Var;
    }

    /* renamed from: e0 */
    public final void mo9654e0(boolean z) {
        this.f7361c = z;
    }

    /* renamed from: f0 */
    public final void mo9655f0() {
        C15996x3 x3Var;
        if (mo9625B() && mo9629F() != null && (x3Var = this.f7365g) != null) {
            C15996x3.m71804b(x3Var, mo9668t(), new SelectionManager$showSelectionToolbar$1$1(this), (C11289a) null, (C11289a) null, (C11289a) null, 28, (Object) null);
        }
    }

    /* renamed from: g0 */
    public final void mo9656g0(long j, boolean z, SelectionAdjustment selectionAdjustment) {
        mo9658i0(j, j, (C15094f) null, z, selectionAdjustment);
    }

    /* renamed from: h0 */
    public final void mo9657h0() {
        C2829h hVar;
        C2829h hVar2;
        C15588o oVar;
        C15588o oVar2;
        boolean z;
        C2830i.C2831a f;
        C2830i.C2831a h;
        C2830i F = mo9629F();
        C15588o oVar3 = this.f7369k;
        C15094f fVar = null;
        if (F == null || (h = F.mo9872h()) == null) {
            hVar = null;
        } else {
            hVar = mo9665q(h);
        }
        if (F == null || (f = F.mo9870f()) == null) {
            hVar2 = null;
        } else {
            hVar2 = mo9665q(f);
        }
        if (hVar != null) {
            oVar = hVar.mo9858e();
        } else {
            oVar = null;
        }
        if (hVar2 != null) {
            oVar2 = hVar2.mo9858e();
        } else {
            oVar2 = null;
        }
        if (F == null || oVar3 == null || !oVar3.mo44436k() || oVar == null || oVar2 == null) {
            mo9652c0((C15094f) null);
            mo9646W((C15094f) null);
            return;
        }
        boolean z2 = true;
        long K = oVar3.mo44430K(oVar, hVar.mo9859f(F, true));
        long K2 = oVar3.mo44430K(oVar2, hVar2.mo9859f(F, false));
        C15098i f2 = C2835m.m13098f(oVar3);
        C15094f d = C15094f.m64868d(K);
        d.mo42242A();
        if (C2835m.m13095c(f2, K) || mo9672x() == Handle.SelectionStart) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            d = null;
        }
        mo9652c0(d);
        C15094f d2 = C15094f.m64868d(K2);
        d2.mo42242A();
        if (!C2835m.m13095c(f2, K2) && mo9672x() != Handle.SelectionEnd) {
            z2 = false;
        }
        if (z2) {
            fVar = d2;
        }
        mo9646W(fVar);
    }

    /* renamed from: i0 */
    public final boolean mo9658i0(long j, long j2, @C12580l C15094f fVar, boolean z, @C12579k SelectionAdjustment selectionAdjustment) {
        Handle handle;
        C15094f fVar2;
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        if (z) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        mo9645V(handle);
        if (z) {
            fVar2 = C15094f.m64868d(j);
        } else {
            fVar2 = C15094f.m64868d(j2);
        }
        mo9642S(fVar2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C2829h> E = this.f7359a.mo9699E(mo9638O());
        int size = E.size();
        C2830i iVar = null;
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            C2829h hVar = E.get(i);
            int i2 = i;
            C2830i iVar2 = iVar;
            Pair<C2830i, Boolean> k = hVar.mo9864k(j, j2, fVar, z, mo9638O(), selectionAdjustment, this.f7359a.mo9702c().get(Long.valueOf(hVar.mo9861h())));
            C2830i a = k.mo21846a();
            boolean booleanValue = k.mo21847b().booleanValue();
            if (z2 || booleanValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (a != null) {
                linkedHashMap.put(Long.valueOf(hVar.mo9861h()), a);
            }
            iVar = C2835m.m13097e(iVar2, a);
            i = i2 + 1;
        }
        C2830i iVar3 = iVar;
        if (!Intrinsics.areEqual((Object) iVar3, (Object) mo9629F())) {
            C15425a aVar = this.f7363e;
            if (aVar != null) {
                aVar.mo43597a(C15426b.f38115b.mo43603b());
            }
            this.f7359a.mo9698D(linkedHashMap);
            this.f7362d.invoke(iVar3);
        }
        return z2;
    }

    /* renamed from: j0 */
    public final boolean mo9659j0(@C12580l C15094f fVar, @C12580l C15094f fVar2, boolean z, @C12579k SelectionAdjustment selectionAdjustment) {
        C2830i F;
        long j;
        C15094f fVar3;
        long j2;
        Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
        if (fVar == null || (F = mo9629F()) == null) {
            return false;
        }
        if (z) {
            j = F.mo9870f().mo9884h();
        } else {
            j = F.mo9872h().mo9884h();
        }
        C2829h hVar = this.f7359a.mo9717s().get(Long.valueOf(j));
        if (hVar == null) {
            fVar3 = null;
        } else {
            C15588o e = hVar.mo9858e();
            Intrinsics.checkNotNull(e);
            fVar3 = mo9662n(e, C2834l.m13089a(hVar.mo9859f(F, !z)));
        }
        if (fVar3 == null) {
            return false;
        }
        long A = fVar3.mo42242A();
        if (z) {
            j2 = fVar.mo42242A();
        } else {
            j2 = A;
        }
        if (!z) {
            A = fVar.mo42242A();
        }
        return mo9658i0(j2, A, fVar2, z, selectionAdjustment);
    }

    /* renamed from: k0 */
    public final void mo9660k0() {
        TextToolbarStatus textToolbarStatus;
        if (mo9625B()) {
            C15996x3 x3Var = this.f7365g;
            if (x3Var != null) {
                textToolbarStatus = x3Var.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown) {
                mo9655f0();
            }
        }
    }

    /* renamed from: m */
    public final void mo9661m(long j) {
        boolean z;
        C2830i F = mo9629F();
        if (F != null) {
            z = C16356n0.m73736h(F.mo9875j());
        } else {
            z = true;
        }
        if (z) {
            mo9656g0(j, true, SelectionAdjustment.f7343a.mo9600g());
        }
    }

    /* renamed from: n */
    public final C15094f mo9662n(C15588o oVar, long j) {
        C15588o oVar2 = this.f7369k;
        if (oVar2 == null || !oVar2.mo44436k()) {
            return null;
        }
        return C15094f.m64868d(mo9638O().mo44430K(oVar, j));
    }

    /* renamed from: o */
    public final void mo9663o() {
        C15912k0 k0Var;
        C16156d E = mo9628E();
        if (E != null && (k0Var = this.f7364f) != null) {
            k0Var.mo45724c(E);
        }
    }

    /* renamed from: p */
    public final Object mo9664p(C15472e0 e0Var, C11300l<? super C15094f, C11079d2> lVar, C11045c<? super C11079d2> cVar) {
        Object d = ForEachGestureKt.m9336d(e0Var, new SelectionManager$detectNonConsumingTap$2(lVar, (C11045c<? super SelectionManager$detectNonConsumingTap$2>) null), cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: q */
    public final C2829h mo9665q(@C12579k C2830i.C2831a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "anchor");
        return this.f7359a.mo9717s().get(Long.valueOf(aVar.mo9884h()));
    }

    @C12580l
    /* renamed from: r */
    public final C15912k0 mo9666r() {
        return this.f7364f;
    }

    @C12580l
    /* renamed from: s */
    public final C15588o mo9667s() {
        return this.f7369k;
    }

    /* renamed from: t */
    public final C15098i mo9668t() {
        C15588o e;
        C15588o e2;
        C2830i F = mo9629F();
        if (F == null) {
            return C15098i.f37261e.mo42285a();
        }
        C2829h q = mo9665q(F.mo9872h());
        C2829h q2 = mo9665q(F.mo9870f());
        if (q == null || (e = q.mo9858e()) == null) {
            return C15098i.f37261e.mo42285a();
        }
        if (q2 == null || (e2 = q2.mo9858e()) == null) {
            return C15098i.f37261e.mo42285a();
        }
        C15588o oVar = this.f7369k;
        if (oVar == null || !oVar.mo44436k()) {
            return C15098i.f37261e.mo42285a();
        }
        long K = oVar.mo44430K(e, q.mo9859f(F, true));
        long K2 = oVar.mo44430K(e2, q2.mo9859f(F, false));
        long z0 = oVar.mo44440z0(K);
        long z02 = oVar.mo44440z0(K2);
        float min = Math.min(C15094f.m64880p(z0), C15094f.m64880p(z02));
        float max = Math.max(C15094f.m64880p(z0), C15094f.m64880p(z02));
        long K3 = oVar.mo44430K(e, C15096g.m64898a(0.0f, q.mo9857c(F.mo9872h().mo9883g()).mo42249B()));
        long K4 = oVar.mo44430K(e2, C15096g.m64898a(0.0f, q2.mo9857c(F.mo9870f().mo9883g()).mo42249B()));
        return new C15098i(min, Math.min(C15094f.m64882r(oVar.mo44440z0(K3)), C15094f.m64882r(oVar.mo44440z0(K4))), max, Math.max(C15094f.m64882r(z0), C15094f.m64882r(z02)) + ((float) (((double) C2834l.m13090b()) * 4.0d)));
    }

    @C12580l
    /* renamed from: u */
    public final C15094f mo9669u() {
        return (C15094f) this.f7375q.getValue();
    }

    /* renamed from: v */
    public final long mo9670v() {
        return ((C15094f) this.f7370l.getValue()).mo42242A();
    }

    /* renamed from: w */
    public final long mo9671w() {
        return ((C15094f) this.f7371m.getValue()).mo42242A();
    }

    @C12580l
    /* renamed from: x */
    public final Handle mo9672x() {
        return (Handle) this.f7374p.getValue();
    }

    @C12580l
    /* renamed from: y */
    public final C15094f mo9673y() {
        return (C15094f) this.f7373o.getValue();
    }

    @C12579k
    /* renamed from: z */
    public final FocusRequester mo9674z() {
        return this.f7366h;
    }
}
