package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.layout.C15565g1;
import androidx.compose.p004ui.layout.SubcomposeLayoutState;
import androidx.compose.p004ui.node.C15682e0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.C15969s4;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8598p;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.snapshots.C8646f;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,774:1\n707#1:796\n707#1:810\n707#1:826\n707#1:831\n361#2,7:775\n361#2,7:782\n361#2,7:817\n480#3,4:789\n485#3:802\n480#3,4:803\n485#3:816\n122#4,3:793\n126#4:801\n122#4,3:807\n126#4:815\n1114#5,4:797\n1114#5,4:811\n1114#5,4:827\n1114#5,4:832\n1114#5,4:836\n1114#5,2:840\n1116#5,2:844\n215#6,2:824\n1855#7,2:842\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n437#1:796\n502#1:810\n695#1:826\n701#1:831\n398#1:775,7\n424#1:782,7\n630#1:817,7\n436#1:789,4\n436#1:802\n489#1:803,4\n489#1:816\n436#1:793,3\n436#1:801\n489#1:807,3\n489#1:815\n437#1:797,4\n502#1:811,4\n695#1:827,4\n701#1:832,4\n707#1:836,4\n710#1:840,2\n710#1:844,2\n686#1:824,2\n711#1:842,2\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState */
public final class LayoutNodeSubcompositionsState {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f38626a;
    @C12580l

    /* renamed from: b */
    public C8602q f38627b;
    @C12579k

    /* renamed from: c */
    public C15565g1 f38628c;

    /* renamed from: d */
    public int f38629d;
    @C12579k

    /* renamed from: e */
    public final Map<LayoutNode, C15517a> f38630e = new LinkedHashMap();
    @C12579k

    /* renamed from: f */
    public final Map<Object, LayoutNode> f38631f = new LinkedHashMap();
    @C12579k

    /* renamed from: g */
    public final C15518b f38632g = new C15518b();
    @C12579k

    /* renamed from: h */
    public final Map<Object, LayoutNode> f38633h = new LinkedHashMap();
    @C12579k

    /* renamed from: i */
    public final C15565g1.C15566a f38634i = new C15565g1.C15566a((Set) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: j */
    public int f38635j;

    /* renamed from: k */
    public int f38636k;
    @C12579k

    /* renamed from: l */
    public final String f38637l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$b */
    public final class C15518b implements C15562f1 {
        @C12579k

        /* renamed from: a */
        public LayoutDirection f38643a = LayoutDirection.Rtl;

        /* renamed from: b */
        public float f38644b;

        /* renamed from: c */
        public float f38645c;

        public C15518b() {
        }

        /* renamed from: R4 */
        public float mo7419R4() {
            return this.f38645c;
        }

        /* renamed from: c */
        public void mo44293c(float f) {
            this.f38644b = f;
        }

        /* renamed from: d */
        public void mo44294d(float f) {
            this.f38645c = f;
        }

        /* renamed from: f */
        public void mo44295f(@C12579k LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.f38643a = layoutDirection;
        }

        public float getDensity() {
            return this.f38644b;
        }

        @C12579k
        public LayoutDirection getLayoutDirection() {
            return this.f38643a;
        }

        @C12579k
        /* renamed from: k0 */
        public List<C15557e0> mo44296k0(@C12580l Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "content");
            return LayoutNodeSubcompositionsState.this.mo44282z(obj, pVar);
        }
    }

    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$c */
    public static final class C15519c extends LayoutNode.C15646d {

        /* renamed from: b */
        public final /* synthetic */ LayoutNodeSubcompositionsState f38647b;

        /* renamed from: c */
        public final /* synthetic */ C11304p<C15562f1, C16476b, C15564g0> f38648c;

        /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$c$a */
        public static final class C15520a implements C15564g0 {

            /* renamed from: a */
            public final /* synthetic */ C15564g0 f38649a;

            /* renamed from: b */
            public final /* synthetic */ LayoutNodeSubcompositionsState f38650b;

            /* renamed from: c */
            public final /* synthetic */ int f38651c;

            public C15520a(C15564g0 g0Var, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i) {
                this.f38649a = g0Var;
                this.f38650b = layoutNodeSubcompositionsState;
                this.f38651c = i;
            }

            public int getHeight() {
                return this.f38649a.getHeight();
            }

            public int getWidth() {
                return this.f38649a.getWidth();
            }

            @C12579k
            /* renamed from: w */
            public Map<C15531a, Integer> mo8593w() {
                return this.f38649a.mo8593w();
            }

            /* renamed from: x */
            public void mo8594x() {
                this.f38650b.f38629d = this.f38651c;
                this.f38649a.mo8594x();
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f38650b;
                layoutNodeSubcompositionsState.mo44271n(layoutNodeSubcompositionsState.f38629d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15519c(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0> pVar, String str) {
            super(str);
            this.f38647b = layoutNodeSubcompositionsState;
            this.f38648c = pVar;
        }

        @C12579k
        /* renamed from: a */
        public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
            Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
            Intrinsics.checkNotNullParameter(list, "measurables");
            this.f38647b.f38632g.mo44295f(h0Var.getLayoutDirection());
            this.f38647b.f38632g.mo44293c(h0Var.getDensity());
            this.f38647b.f38632g.mo44294d(h0Var.mo7419R4());
            this.f38647b.f38629d = 0;
            return new C15520a(this.f38648c.invoke(this.f38647b.f38632g, C16476b.m74348b(j)), this.f38647b, this.f38647b.f38629d);
        }
    }

    @C11363r0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,774:1\n1114#2,4:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n*L\n677#1:775,4\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$d */
    public static final class C15521d implements SubcomposeLayoutState.C15528a {

        /* renamed from: a */
        public final /* synthetic */ LayoutNodeSubcompositionsState f38652a;

        /* renamed from: b */
        public final /* synthetic */ Object f38653b;

        public C15521d(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Object obj) {
            this.f38652a = layoutNodeSubcompositionsState;
            this.f38653b = obj;
        }

        /* renamed from: a */
        public int mo44297a() {
            List<LayoutNode> Z;
            LayoutNode layoutNode = (LayoutNode) this.f38652a.f38633h.get(this.f38653b);
            if (layoutNode == null || (Z = layoutNode.mo44667Z()) == null) {
                return 0;
            }
            return Z.size();
        }

        /* renamed from: b */
        public void mo44298b(int i, long j) {
            LayoutNode layoutNode = (LayoutNode) this.f38652a.f38633h.get(this.f38653b);
            if (layoutNode != null && layoutNode.mo44455k()) {
                int size = layoutNode.mo44667Z().size();
                if (i < 0 || i >= size) {
                    throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
                } else if (!layoutNode.mo44456p()) {
                    LayoutNode e = this.f38652a.f38626a;
                    e.f38862y = true;
                    C15682e0.m70247b(layoutNode).mo44999w(layoutNode.mo44667Z().get(i), j);
                    e.f38862y = false;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }

        /* renamed from: g */
        public void mo44299g() {
            boolean z;
            this.f38652a.mo44277t();
            LayoutNode layoutNode = (LayoutNode) this.f38652a.f38633h.remove(this.f38653b);
            if (layoutNode != null) {
                boolean z2 = false;
                if (this.f38652a.f38636k > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int indexOf = this.f38652a.f38626a.mo44671b0().indexOf(layoutNode);
                    if (indexOf >= this.f38652a.f38626a.mo44671b0().size() - this.f38652a.f38636k) {
                        z2 = true;
                    }
                    if (z2) {
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f38652a;
                        layoutNodeSubcompositionsState.f38635j = layoutNodeSubcompositionsState.f38635j + 1;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.f38652a;
                        layoutNodeSubcompositionsState2.f38636k = layoutNodeSubcompositionsState2.f38636k - 1;
                        int size = (this.f38652a.f38626a.mo44671b0().size() - this.f38652a.f38636k) - this.f38652a.f38635j;
                        this.f38652a.mo44278u(indexOf, size, 1);
                        this.f38652a.mo44271n(size);
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public LayoutNodeSubcompositionsState(@C12579k LayoutNode layoutNode, @C12579k C15565g1 g1Var) {
        Intrinsics.checkNotNullParameter(layoutNode, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(g1Var, "slotReusePolicy");
        this.f38626a = layoutNode;
        this.f38628c = g1Var;
    }

    /* renamed from: v */
    public static /* synthetic */ void m68930v(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.mo44278u(i, i2, i3);
    }

    /* renamed from: A */
    public final void mo44264A(LayoutNode layoutNode, C15517a aVar) {
        C8646f p;
        C8646f a = C8646f.f23196e.mo16621a();
        try {
            p = a.mo16617p();
            LayoutNode layoutNode2 = this.f38626a;
            layoutNode2.f38862y = true;
            C11304p<C8592o, Integer, C11079d2> c = aVar.mo44285c();
            C8598p b = aVar.mo44284b();
            C8602q qVar = this.f38627b;
            if (qVar != null) {
                aVar.mo44289g(mo44266C(b, layoutNode, qVar, C8553b.m31049c(-34810602, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(aVar, c))));
                layoutNode2.f38862y = false;
                C11079d2 d2Var = C11079d2.f28267a;
                a.mo16619w(p);
                a.mo16415d();
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } catch (Throwable th) {
            a.mo16415d();
            throw th;
        }
    }

    /* renamed from: B */
    public final void mo44265B(LayoutNode layoutNode, Object obj, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        boolean z;
        Map<LayoutNode, C15517a> map = this.f38630e;
        C15517a aVar = map.get(layoutNode);
        if (aVar == null) {
            aVar = new C15517a(obj, ComposableSingletons$SubcomposeLayoutKt.f38614a.mo44247a(), (C8598p) null, 4, (DefaultConstructorMarker) null);
            map.put(layoutNode, aVar);
        }
        C15517a aVar2 = aVar;
        C8598p b = aVar2.mo44284b();
        if (b != null) {
            z = b.mo16287u();
        } else {
            z = true;
        }
        if (aVar2.mo44285c() != pVar || z || aVar2.mo44286d()) {
            aVar2.mo44290h(pVar);
            mo44264A(layoutNode, aVar2);
            aVar2.mo44291i(false);
        }
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: C */
    public final C8598p mo44266C(C8598p pVar, LayoutNode layoutNode, C8602q qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2) {
        if (pVar == null || pVar.mo16285h()) {
            pVar = C15969s4.m71740a(layoutNode, qVar);
        }
        pVar.mo16286j(pVar2);
        return pVar;
    }

    /* renamed from: D */
    public final LayoutNode mo44267D(Object obj) {
        int i;
        if (this.f38635j == 0) {
            return null;
        }
        int size = this.f38626a.mo44671b0().size() - this.f38636k;
        int i2 = size - this.f38635j;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(mo44274q(i4), obj)) {
                i = i4;
                break;
            } else {
                i4--;
            }
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                C15517a aVar = this.f38630e.get(this.f38626a.mo44671b0().get(i3));
                Intrinsics.checkNotNull(aVar);
                C15517a aVar2 = aVar;
                if (this.f38628c.mo8739b(obj, aVar2.mo44287e())) {
                    aVar2.mo44292j(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            mo44278u(i4, i2, 1);
        }
        this.f38635j--;
        LayoutNode layoutNode = this.f38626a.mo44671b0().get(i2);
        C15517a aVar3 = this.f38630e.get(layoutNode);
        Intrinsics.checkNotNull(aVar3);
        C15517a aVar4 = aVar3;
        aVar4.mo44288f(true);
        aVar4.mo44291i(true);
        C8646f.f23196e.mo16631l();
        return layoutNode;
    }

    @C12579k
    /* renamed from: k */
    public final C15560f0 mo44268k(@C12579k C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        return new C15519c(this, pVar, this.f38637l);
    }

    /* renamed from: l */
    public final LayoutNode mo44269l(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, (DefaultConstructorMarker) null);
        LayoutNode layoutNode2 = this.f38626a;
        layoutNode2.f38862y = true;
        this.f38626a.mo44641O0(i, layoutNode);
        layoutNode2.f38862y = false;
        return layoutNode;
    }

    /* renamed from: m */
    public final void mo44270m() {
        LayoutNode layoutNode = this.f38626a;
        layoutNode.f38862y = true;
        for (C15517a b : this.f38630e.values()) {
            C8598p b2 = b.mo44284b();
            if (b2 != null) {
                b2.mo16284g();
            }
        }
        this.f38626a.mo44703s1();
        layoutNode.f38862y = false;
        this.f38630e.clear();
        this.f38631f.clear();
        this.f38636k = 0;
        this.f38635j = 0;
        this.f38633h.clear();
        mo44277t();
    }

    /* renamed from: n */
    public final void mo44271n(int i) {
        C8646f p;
        boolean z = false;
        this.f38635j = 0;
        int size = (this.f38626a.mo44671b0().size() - this.f38636k) - 1;
        if (i <= size) {
            this.f38634i.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.f38634i.add(mo44274q(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.f38628c.mo8738a(this.f38634i);
            C8646f a = C8646f.f23196e.mo16621a();
            try {
                p = a.mo16617p();
                boolean z2 = false;
                while (size >= i) {
                    LayoutNode layoutNode = this.f38626a.mo44671b0().get(size);
                    C15517a aVar = this.f38630e.get(layoutNode);
                    Intrinsics.checkNotNull(aVar);
                    C15517a aVar2 = aVar;
                    Object e = aVar2.mo44287e();
                    if (this.f38634i.contains(e)) {
                        layoutNode.mo44639N1(LayoutNode.UsageByParent.NotUsed);
                        this.f38635j++;
                        if (aVar2.mo44283a()) {
                            aVar2.mo44288f(false);
                            z2 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.f38626a;
                        layoutNode2.f38862y = true;
                        this.f38630e.remove(layoutNode);
                        C8598p b = aVar2.mo44284b();
                        if (b != null) {
                            b.mo16284g();
                        }
                        this.f38626a.mo44705t1(size, 1);
                        layoutNode2.f38862y = false;
                    }
                    this.f38631f.remove(e);
                    size--;
                }
                C11079d2 d2Var = C11079d2.f28267a;
                a.mo16619w(p);
                a.mo16415d();
                z = z2;
            } catch (Throwable th) {
                a.mo16415d();
                throw th;
            }
        }
        if (z) {
            C8646f.f23196e.mo16631l();
        }
        mo44277t();
    }

    /* renamed from: o */
    public final void mo44272o() {
        for (Map.Entry<LayoutNode, C15517a> value : this.f38630e.entrySet()) {
            ((C15517a) value.getValue()).mo44291i(true);
        }
        if (!this.f38626a.mo44704t0()) {
            LayoutNode.m69647C1(this.f38626a, false, 1, (Object) null);
        }
    }

    @C12580l
    /* renamed from: p */
    public final C8602q mo44273p() {
        return this.f38627b;
    }

    /* renamed from: q */
    public final Object mo44274q(int i) {
        C15517a aVar = this.f38630e.get(this.f38626a.mo44671b0().get(i));
        Intrinsics.checkNotNull(aVar);
        return aVar.mo44287e();
    }

    @C12579k
    /* renamed from: r */
    public final C15565g1 mo44275r() {
        return this.f38628c;
    }

    /* renamed from: s */
    public final void mo44276s(C11289a<C11079d2> aVar) {
        LayoutNode layoutNode = this.f38626a;
        layoutNode.f38862y = true;
        aVar.invoke();
        layoutNode.f38862y = false;
    }

    /* renamed from: t */
    public final void mo44277t() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f38630e.size() == this.f38626a.mo44671b0().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((this.f38626a.mo44671b0().size() - this.f38635j) - this.f38636k >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f38633h.size() != this.f38636k) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f38636k + ". Map size " + this.f38633h.size()).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f38626a.mo44671b0().size() + ". Reusable children " + this.f38635j + ". Precomposed children " + this.f38636k).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f38630e.size() + ") and the children count on the SubcomposeLayout (" + this.f38626a.mo44671b0().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* renamed from: u */
    public final void mo44278u(int i, int i2, int i3) {
        LayoutNode layoutNode = this.f38626a;
        layoutNode.f38862y = true;
        this.f38626a.mo44686j1(i, i2, i3);
        layoutNode.f38862y = false;
    }

    @C12579k
    /* renamed from: w */
    public final SubcomposeLayoutState.C15528a mo44279w(@C12580l Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        mo44277t();
        if (!this.f38631f.containsKey(obj)) {
            Map<Object, LayoutNode> map = this.f38633h;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = mo44267D(obj);
                if (layoutNode != null) {
                    mo44278u(this.f38626a.mo44671b0().indexOf(layoutNode), this.f38626a.mo44671b0().size(), 1);
                    this.f38636k++;
                } else {
                    layoutNode = mo44269l(this.f38626a.mo44671b0().size());
                    this.f38636k++;
                }
                map.put(obj, layoutNode);
            }
            mo44265B(layoutNode, obj, pVar);
        }
        return new C15521d(this, obj);
    }

    /* renamed from: x */
    public final void mo44280x(@C12580l C8602q qVar) {
        this.f38627b = qVar;
    }

    /* renamed from: y */
    public final void mo44281y(@C12579k C15565g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "value");
        if (this.f38628c != g1Var) {
            this.f38628c = g1Var;
            mo44271n(0);
        }
    }

    @C12579k
    /* renamed from: z */
    public final List<C15557e0> mo44282z(@C12580l Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(pVar, "content");
        mo44277t();
        LayoutNode.LayoutState m0 = this.f38626a.mo44691m0();
        boolean z3 = false;
        if (m0 == LayoutNode.LayoutState.Measuring || m0 == LayoutNode.LayoutState.LayingOut) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Map<Object, LayoutNode> map = this.f38631f;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = this.f38633h.remove(obj);
                if (layoutNode != null) {
                    int i = this.f38636k;
                    if (i > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        this.f38636k = i - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    layoutNode = mo44267D(obj);
                    if (layoutNode == null) {
                        layoutNode = mo44269l(this.f38629d);
                    }
                }
                map.put(obj, layoutNode);
            }
            LayoutNode layoutNode2 = layoutNode;
            int indexOf = this.f38626a.mo44671b0().indexOf(layoutNode2);
            int i2 = this.f38629d;
            if (indexOf >= i2) {
                z3 = true;
            }
            if (z3) {
                if (i2 != indexOf) {
                    m68930v(this, indexOf, i2, 0, 4, (Object) null);
                }
                this.f38629d++;
                mo44265B(layoutNode2, obj, pVar);
                return layoutNode2.mo44665Y();
            }
            throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    @C11363r0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,774:1\n76#2:775\n102#2,2:776\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n*L\n730#1:775\n730#1:776,2\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$a */
    public static final class C15517a {
        @C12580l

        /* renamed from: a */
        public Object f38638a;
        @C12579k

        /* renamed from: b */
        public C11304p<? super C8592o, ? super Integer, C11079d2> f38639b;
        @C12580l

        /* renamed from: c */
        public C8598p f38640c;

        /* renamed from: d */
        public boolean f38641d;
        @C12579k

        /* renamed from: e */
        public final C8700z0 f38642e;

        public C15517a(@C12580l Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8598p pVar2) {
            Intrinsics.checkNotNullParameter(pVar, "content");
            this.f38638a = obj;
            this.f38639b = pVar;
            this.f38640c = pVar2;
            this.f38642e = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
        }

        /* renamed from: a */
        public final boolean mo44283a() {
            return ((Boolean) this.f38642e.getValue()).booleanValue();
        }

        @C12580l
        /* renamed from: b */
        public final C8598p mo44284b() {
            return this.f38640c;
        }

        @C12579k
        /* renamed from: c */
        public final C11304p<C8592o, Integer, C11079d2> mo44285c() {
            return this.f38639b;
        }

        /* renamed from: d */
        public final boolean mo44286d() {
            return this.f38641d;
        }

        @C12580l
        /* renamed from: e */
        public final Object mo44287e() {
            return this.f38638a;
        }

        /* renamed from: f */
        public final void mo44288f(boolean z) {
            this.f38642e.setValue(Boolean.valueOf(z));
        }

        /* renamed from: g */
        public final void mo44289g(@C12580l C8598p pVar) {
            this.f38640c = pVar;
        }

        /* renamed from: h */
        public final void mo44290h(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "<set-?>");
            this.f38639b = pVar;
        }

        /* renamed from: i */
        public final void mo44291i(boolean z) {
            this.f38641d = z;
        }

        /* renamed from: j */
        public final void mo44292j(@C12580l Object obj) {
            this.f38638a = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15517a(Object obj, C11304p pVar, C8598p pVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, pVar, (i & 4) != 0 ? null : pVar2);
        }
    }
}
