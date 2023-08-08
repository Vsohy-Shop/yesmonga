package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState */
public final class SubcomposeLayoutState {

    /* renamed from: f */
    public static final int f38676f = 8;
    @C12579k

    /* renamed from: a */
    public final C15565g1 f38677a;
    @C12580l

    /* renamed from: b */
    public LayoutNodeSubcompositionsState f38678b;
    @C12579k

    /* renamed from: c */
    public final C11304p<LayoutNode, SubcomposeLayoutState, C11079d2> f38679c;
    @C12579k

    /* renamed from: d */
    public final C11304p<LayoutNode, C8602q, C11079d2> f38680d;
    @C12579k

    /* renamed from: e */
    public final C11304p<LayoutNode, C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0>, C11079d2> f38681e;

    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$a */
    public interface C15528a {
        /* renamed from: a */
        int mo44297a() {
            return 0;
        }

        /* renamed from: b */
        void mo44298b(int i, long j) {
        }

        /* renamed from: g */
        void mo44299g();
    }

    public SubcomposeLayoutState(@C12579k C15565g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "slotReusePolicy");
        this.f38677a = g1Var;
        this.f38679c = new SubcomposeLayoutState$setRoot$1(this);
        this.f38680d = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.f38681e = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* renamed from: d */
    public final void mo44343d() {
        mo44348i().mo44270m();
    }

    /* renamed from: e */
    public final void mo44344e() {
        mo44348i().mo44272o();
    }

    @C12579k
    /* renamed from: f */
    public final C11304p<LayoutNode, C8602q, C11079d2> mo44345f() {
        return this.f38680d;
    }

    @C12579k
    /* renamed from: g */
    public final C11304p<LayoutNode, C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0>, C11079d2> mo44346g() {
        return this.f38681e;
    }

    @C12579k
    /* renamed from: h */
    public final C11304p<LayoutNode, SubcomposeLayoutState, C11079d2> mo44347h() {
        return this.f38679c;
    }

    /* renamed from: i */
    public final LayoutNodeSubcompositionsState mo44348i() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f38678b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    @C12579k
    /* renamed from: j */
    public final C15528a mo44349j(@C12580l Object obj, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        return mo44348i().mo44279w(obj, pVar);
    }

    public SubcomposeLayoutState() {
        this((C15565g1) C15584m0.f38735a);
    }

    @C11395k(message = "This constructor is deprecated", replaceWith = @C11587t0(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.m69023c(i));
    }
}
