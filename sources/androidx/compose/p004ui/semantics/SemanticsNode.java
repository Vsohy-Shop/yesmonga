package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.layout.C15601t;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15698j1;
import androidx.compose.p004ui.node.C15703k1;
import androidx.compose.p004ui.node.C15706l1;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,436:1\n1#2:437\n33#3,6:438\n33#3,6:444\n33#3,6:450\n73#4:456\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n188#1:438,6\n211#1:444,6\n309#1:450,6\n331#1:456\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsNode */
public final class SemanticsNode {

    /* renamed from: h */
    public static final int f39710h = 8;
    @C12579k

    /* renamed from: a */
    public final C15703k1 f39711a;

    /* renamed from: b */
    public final boolean f39712b;
    @C12579k

    /* renamed from: c */
    public final LayoutNode f39713c;

    /* renamed from: d */
    public boolean f39714d;
    @C12580l

    /* renamed from: e */
    public SemanticsNode f39715e;
    @C12579k

    /* renamed from: f */
    public final C16035j f39716f;

    /* renamed from: g */
    public final int f39717g;

    /* renamed from: androidx.compose.ui.semantics.SemanticsNode$a */
    public static final class C16021a extends C8767m.C8772d implements C15703k1 {
        @C12579k

        /* renamed from: z */
        public final C16035j f39718z;

        public C16021a(C11300l<? super C16044q, C11079d2> lVar) {
            C16035j jVar = new C16035j();
            jVar.mo46156X(false);
            jVar.mo46155W(false);
            lVar.invoke(jVar);
            this.f39718z = jVar;
        }

        @C12579k
        /* renamed from: Y */
        public C16035j mo44552Y() {
            return this.f39718z;
        }
    }

    public SemanticsNode(@C12579k C15703k1 k1Var, boolean z, @C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(k1Var, "outerSemanticsNode");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39711a = k1Var;
        this.f39712b = z;
        this.f39713c = layoutNode;
        this.f39716f = C15706l1.m70387a(k1Var);
        this.f39717g = layoutNode.mo44457q();
    }

    /* renamed from: F */
    public static /* synthetic */ List m71871F(SemanticsNode semanticsNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.mo46013E(z);
    }

    /* renamed from: e */
    public static /* synthetic */ List m71872e(SemanticsNode semanticsNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.mo46017d(list);
    }

    /* renamed from: A */
    public final boolean mo46009A() {
        return mo46029q() == null;
    }

    /* renamed from: B */
    public final boolean mo46010B() {
        NodeCoordinator c = mo46016c();
        if (c != null) {
            return c.mo44861c5();
        }
        return false;
    }

    /* renamed from: C */
    public final void mo46011C(C16035j jVar) {
        if (!this.f39716f.mo46152H()) {
            List F = m71871F(this, false, 1, (Object) null);
            int size = F.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) F.get(i);
                if (!semanticsNode.mo46038z()) {
                    jVar.mo46154Q(semanticsNode.f39716f);
                    semanticsNode.mo46011C(jVar);
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo46012D(boolean z) {
        this.f39714d = z;
    }

    @C12579k
    /* renamed from: E */
    public final List<SemanticsNode> mo46013E(boolean z) {
        if (this.f39714d) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        List g = C16040m.m72165g(this.f39713c, (List) null, 1, (Object) null);
        int size = g.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SemanticsNode((C15703k1) g.get(i), this.f39712b, (LayoutNode) null, 4, (DefaultConstructorMarker) null));
        }
        if (z) {
            mo46014a(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo46014a(List<SemanticsNode> list) {
        String str;
        C16031g b = C16040m.m72170l(this);
        if (b != null && this.f39716f.mo46153M() && (!list.isEmpty())) {
            list.add(mo46015b(b, new SemanticsNode$emitFakeNodes$fakeNode$1(b)));
        }
        C16035j jVar = this.f39716f;
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (jVar.mo46161i(semanticsProperties.mo46048c()) && (!list.isEmpty()) && this.f39716f.mo46153M()) {
            List list2 = (List) SemanticsConfigurationKt.m71865a(this.f39716f, semanticsProperties.mo46048c());
            if (list2 != null) {
                str = (String) CollectionsKt___CollectionsKt.m40479B2(list2);
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, mo46015b((C16031g) null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: b */
    public final SemanticsNode mo46015b(C16031g gVar, C11300l<? super C16044q, C11079d2> lVar) {
        int i;
        C16021a aVar = new C16021a(lVar);
        if (gVar != null) {
            i = C16040m.m72171m(this);
        } else {
            i = C16040m.m72162d(this);
        }
        SemanticsNode semanticsNode = new SemanticsNode(aVar, false, new LayoutNode(true, i));
        semanticsNode.f39714d = true;
        semanticsNode.f39715e = this;
        return semanticsNode;
    }

    @C12580l
    /* renamed from: c */
    public final NodeCoordinator mo46016c() {
        C15703k1 k1Var = null;
        if (this.f39714d) {
            SemanticsNode q = mo46029q();
            if (q != null) {
                return q.mo46016c();
            }
            return null;
        }
        C15703k1 h = C16040m.m72166h(this.f39713c);
        if (this.f39716f.mo46153M()) {
            k1Var = h;
        }
        if (k1Var == null) {
            k1Var = this.f39711a;
        }
        return C15681e.m70234o(k1Var, C15739v0.m70597b(8));
    }

    /* renamed from: d */
    public final List<SemanticsNode> mo46017d(List<SemanticsNode> list) {
        List F = m71871F(this, false, 1, (Object) null);
        int size = F.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) F.get(i);
            if (semanticsNode.mo46038z()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.f39716f.mo46152H()) {
                semanticsNode.mo46017d(list);
            }
        }
        return list;
    }

    /* renamed from: f */
    public final int mo46018f(@C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        NodeCoordinator c = mo46016c();
        if (c != null) {
            return c.mo44325A(aVar);
        }
        return Integer.MIN_VALUE;
    }

    @C12579k
    /* renamed from: g */
    public final C15098i mo46019g() {
        C15098i b;
        NodeCoordinator c = mo46016c();
        if (c != null) {
            if (!c.mo44436k()) {
                c = null;
            }
            if (!(c == null || (b = C15591p.m69300b(c)) == null)) {
                return b;
            }
        }
        return C15098i.f37261e.mo42285a();
    }

    @C12579k
    /* renamed from: h */
    public final C15098i mo46020h() {
        C15098i c;
        NodeCoordinator c2 = mo46016c();
        if (c2 != null) {
            if (!c2.mo44436k()) {
                c2 = null;
            }
            if (!(c2 == null || (c = C15591p.m69301c(c2)) == null)) {
                return c;
            }
        }
        return C15098i.f37261e.mo42285a();
    }

    @C12579k
    /* renamed from: i */
    public final List<SemanticsNode> mo46021i() {
        return mo46022j(!this.f39712b, false);
    }

    /* renamed from: j */
    public final List<SemanticsNode> mo46022j(boolean z, boolean z2) {
        if (!z && this.f39716f.mo46152H()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        if (mo46038z()) {
            return m71872e(this, (List) null, 1, (Object) null);
        }
        return mo46013E(z2);
    }

    @C12579k
    /* renamed from: k */
    public final C16035j mo46023k() {
        if (!mo46038z()) {
            return this.f39716f;
        }
        C16035j q = this.f39716f.mo46163q();
        mo46011C(q);
        return q;
    }

    /* renamed from: l */
    public final int mo46024l() {
        return this.f39717g;
    }

    @C12579k
    /* renamed from: m */
    public final C15601t mo46025m() {
        return this.f39713c;
    }

    @C12579k
    /* renamed from: n */
    public final LayoutNode mo46026n() {
        return this.f39713c;
    }

    /* renamed from: o */
    public final boolean mo46027o() {
        return this.f39712b;
    }

    @C12579k
    /* renamed from: p */
    public final C15703k1 mo46028p() {
        return this.f39711a;
    }

    @C12580l
    /* renamed from: q */
    public final SemanticsNode mo46029q() {
        LayoutNode layoutNode;
        C15703k1 k1Var;
        SemanticsNode semanticsNode = this.f39715e;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.f39712b) {
            layoutNode = C16040m.m72163e(this.f39713c, SemanticsNode$parent$1.f39719f);
        } else {
            layoutNode = null;
        }
        if (layoutNode == null) {
            layoutNode = C16040m.m72163e(this.f39713c, SemanticsNode$parent$2.f39720f);
        }
        if (layoutNode != null) {
            k1Var = C16040m.m72168j(layoutNode);
        } else {
            k1Var = null;
        }
        if (k1Var == null) {
            return null;
        }
        return new SemanticsNode(k1Var, this.f39712b, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: r */
    public final long mo46030r() {
        NodeCoordinator c = mo46016c();
        if (c != null) {
            if (!c.mo44436k()) {
                c = null;
            }
            if (c != null) {
                return C15591p.m69304f(c);
            }
        }
        return C15094f.f37256b.mo42248e();
    }

    /* renamed from: s */
    public final long mo46031s() {
        NodeCoordinator c = mo46016c();
        if (c != null) {
            if (!c.mo44436k()) {
                c = null;
            }
            if (c != null) {
                return C15591p.m69305g(c);
            }
        }
        return C15094f.f37256b.mo42248e();
    }

    @C12579k
    /* renamed from: t */
    public final List<SemanticsNode> mo46032t() {
        return mo46022j(false, true);
    }

    @C12580l
    /* renamed from: u */
    public final C15698j1 mo46033u() {
        C15675c1 B0 = this.f39713c.mo44611B0();
        if (B0 != null) {
            return B0.getRootForTest();
        }
        return null;
    }

    /* renamed from: v */
    public final long mo46034v() {
        NodeCoordinator c = mo46016c();
        return c != null ? c.mo44434a() : C16500q.f40900b.mo47897a();
    }

    @C12579k
    /* renamed from: w */
    public final C15098i mo46035w() {
        C15703k1 k1Var;
        if (this.f39716f.mo46153M()) {
            k1Var = C16040m.m72166h(this.f39713c);
            if (k1Var == null) {
                k1Var = this.f39711a;
            }
        } else {
            k1Var = this.f39711a;
        }
        return C15706l1.m70391e(k1Var);
    }

    @C12579k
    /* renamed from: x */
    public final C16035j mo46036x() {
        return this.f39716f;
    }

    /* renamed from: y */
    public final boolean mo46037y() {
        return this.f39714d;
    }

    /* renamed from: z */
    public final boolean mo46038z() {
        return this.f39712b && this.f39716f.mo46153M();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsNode(C15703k1 k1Var, boolean z, LayoutNode layoutNode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k1Var, z, (i & 4) != 0 ? C15681e.m70235p(k1Var) : layoutNode);
    }
}
