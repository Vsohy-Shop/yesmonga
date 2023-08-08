package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.view.C18124b2;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public abstract class ConstraintLayoutBaseScope {

    /* renamed from: e */
    public static final int f41128e = 8;
    @C12579k

    /* renamed from: a */
    public final List<C11300l<C16611l0, C11079d2>> f41129a = new ArrayList();

    /* renamed from: b */
    public int f41130b;

    /* renamed from: c */
    public final int f41131c = 1000;

    /* renamed from: d */
    public int f41132d = 1000;

    @C8547h2
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$a */
    public static final class C16566a {
        @C12579k

        /* renamed from: a */
        public final Object f41133a;

        public C16566a(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "id");
            this.f41133a = obj;
        }

        /* renamed from: c */
        public static /* synthetic */ C16566a m75162c(C16566a aVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = aVar.f41133a;
            }
            return aVar.mo48281b(obj);
        }

        @C12579k
        /* renamed from: a */
        public final Object mo48280a() {
            return this.f41133a;
        }

        @C12579k
        /* renamed from: b */
        public final C16566a mo48281b(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "id");
            return new C16566a(obj);
        }

        @C12579k
        /* renamed from: d */
        public final Object mo48282d() {
            return this.f41133a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16566a) && Intrinsics.areEqual(this.f41133a, ((C16566a) obj).f41133a);
        }

        public int hashCode() {
            return this.f41133a.hashCode();
        }

        @C12579k
        public String toString() {
            return "BaselineAnchor(id=" + this.f41133a + ')';
        }
    }

    @C8547h2
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$b */
    public static final class C16567b {
        @C12579k

        /* renamed from: a */
        public final Object f41134a;

        /* renamed from: b */
        public final int f41135b;

        public C16567b(@C12579k Object obj, int i) {
            Intrinsics.checkNotNullParameter(obj, "id");
            this.f41134a = obj;
            this.f41135b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C16567b m75166d(C16567b bVar, Object obj, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = bVar.f41134a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f41135b;
            }
            return bVar.mo48288c(obj, i);
        }

        @C12579k
        /* renamed from: a */
        public final Object mo48286a() {
            return this.f41134a;
        }

        /* renamed from: b */
        public final int mo48287b() {
            return this.f41135b;
        }

        @C12579k
        /* renamed from: c */
        public final C16567b mo48288c(@C12579k Object obj, int i) {
            Intrinsics.checkNotNullParameter(obj, "id");
            return new C16567b(obj, i);
        }

        @C12579k
        /* renamed from: e */
        public final Object mo48289e() {
            return this.f41134a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16567b)) {
                return false;
            }
            C16567b bVar = (C16567b) obj;
            return Intrinsics.areEqual(this.f41134a, bVar.f41134a) && this.f41135b == bVar.f41135b;
        }

        /* renamed from: f */
        public final int mo48291f() {
            return this.f41135b;
        }

        public int hashCode() {
            return (this.f41134a.hashCode() * 31) + Integer.hashCode(this.f41135b);
        }

        @C12579k
        public String toString() {
            return "HorizontalAnchor(id=" + this.f41134a + ", index=" + this.f41135b + ')';
        }
    }

    @C8547h2
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$c */
    public static final class C16568c {
        @C12579k

        /* renamed from: a */
        public final Object f41136a;

        /* renamed from: b */
        public final int f41137b;

        public C16568c(@C12579k Object obj, int i) {
            Intrinsics.checkNotNullParameter(obj, "id");
            this.f41136a = obj;
            this.f41137b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C16568c m75172d(C16568c cVar, Object obj, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = cVar.f41136a;
            }
            if ((i2 & 2) != 0) {
                i = cVar.f41137b;
            }
            return cVar.mo48296c(obj, i);
        }

        @C12579k
        /* renamed from: a */
        public final Object mo48294a() {
            return this.f41136a;
        }

        /* renamed from: b */
        public final int mo48295b() {
            return this.f41137b;
        }

        @C12579k
        /* renamed from: c */
        public final C16568c mo48296c(@C12579k Object obj, int i) {
            Intrinsics.checkNotNullParameter(obj, "id");
            return new C16568c(obj, i);
        }

        @C12579k
        /* renamed from: e */
        public final Object mo48297e() {
            return this.f41136a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16568c)) {
                return false;
            }
            C16568c cVar = (C16568c) obj;
            return Intrinsics.areEqual(this.f41136a, cVar.f41136a) && this.f41137b == cVar.f41137b;
        }

        /* renamed from: f */
        public final int mo48299f() {
            return this.f41137b;
        }

        public int hashCode() {
            return (this.f41136a.hashCode() * 31) + Integer.hashCode(this.f41137b);
        }

        @C12579k
        public String toString() {
            return "VerticalAnchor(id=" + this.f41136a + ", index=" + this.f41137b + ')';
        }
    }

    /* renamed from: B */
    public static /* synthetic */ C16568c m75124B(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = C16483g.m74435M((float) 0);
            }
            return constraintLayoutBaseScope.mo48251A(eVarArr, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs");
    }

    /* renamed from: D */
    public static /* synthetic */ C16567b m75125D(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = C16483g.m74435M((float) 0);
            }
            return constraintLayoutBaseScope.mo48252C(eVarArr, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
    }

    /* renamed from: F */
    public static /* synthetic */ C16621p0 m75126F(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, C16586c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cVar = C16586c.f41212c.mo48459d();
            }
            return constraintLayoutBaseScope.mo48253E(eVarArr, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVerticalChain");
    }

    @C11532s0
    /* renamed from: H */
    public static /* synthetic */ void m75127H() {
    }

    /* renamed from: e */
    public static /* synthetic */ C16568c m75128e(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = C16483g.m74435M((float) 0);
            }
            return constraintLayoutBaseScope.mo48262d(eVarArr, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs");
    }

    /* renamed from: g */
    public static /* synthetic */ C16568c m75129g(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = C16483g.m74435M((float) 0);
            }
            return constraintLayoutBaseScope.mo48263f(eVarArr, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs");
    }

    /* renamed from: i */
    public static /* synthetic */ C16567b m75130i(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = C16483g.m74435M((float) 0);
            }
            return constraintLayoutBaseScope.mo48264h(eVarArr, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
    }

    /* renamed from: k */
    public static /* synthetic */ C16568c m75131k(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = C16483g.m74435M((float) 0);
            }
            return constraintLayoutBaseScope.mo48265j(eVarArr, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs");
    }

    /* renamed from: z */
    public static /* synthetic */ C16583a0 m75132z(ConstraintLayoutBaseScope constraintLayoutBaseScope, C16591e[] eVarArr, C16586c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cVar = C16586c.f41212c.mo48459d();
            }
            return constraintLayoutBaseScope.mo48279y(eVarArr, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHorizontalChain");
    }

    @C12579k
    /* renamed from: A */
    public final C16568c mo48251A(@C12579k C16591e[] eVarArr, float f) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createStartBarrier$1(x, f, eVarArr));
        mo48258L(10);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: C */
    public final C16567b mo48252C(@C12579k C16591e[] eVarArr, float f) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createTopBarrier$1(x, f, eVarArr));
        mo48258L(12);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(C16483g.m74442h0(f));
        return new C16567b(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: E */
    public final C16621p0 mo48253E(@C12579k C16591e[] eVarArr, @C12579k C16586c cVar) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        Intrinsics.checkNotNullParameter(cVar, "chainStyle");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createVerticalChain$1(x, eVarArr, cVar));
        mo48258L(17);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(cVar.hashCode());
        return new C16621p0(Integer.valueOf(x));
    }

    /* renamed from: G */
    public final int mo48254G() {
        return this.f41130b;
    }

    @C12579k
    /* renamed from: I */
    public final List<C11300l<C16611l0, C11079d2>> mo48255I() {
        return this.f41129a;
    }

    /* renamed from: J */
    public void mo48256J() {
        this.f41129a.clear();
        this.f41132d = this.f41131c;
        this.f41130b = 0;
    }

    /* renamed from: K */
    public final void mo48257K(int i) {
        this.f41130b = i;
    }

    /* renamed from: L */
    public final void mo48258L(int i) {
        this.f41130b = ((this.f41130b * C18124b2.f46732k) + i) % 1000000007;
    }

    /* renamed from: a */
    public final void mo48259a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        for (C11300l invoke : this.f41129a) {
            invoke.invoke(l0Var);
        }
    }

    @C12579k
    /* renamed from: b */
    public final C16585b0 mo48260b(@C12579k C16583a0 a0Var, @C12579k C11300l<? super C16585b0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(a0Var, "ref");
        Intrinsics.checkNotNullParameter(lVar, "constrainBlock");
        C16585b0 b0Var = new C16585b0(a0Var.mo48446g());
        lVar.invoke(b0Var);
        mo48255I().addAll(b0Var.mo48454g());
        return b0Var;
    }

    @C12579k
    /* renamed from: c */
    public final C16623q0 mo48261c(@C12579k C16621p0 p0Var, @C12579k C11300l<? super C16623q0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(p0Var, "ref");
        Intrinsics.checkNotNullParameter(lVar, "constrainBlock");
        C16623q0 q0Var = new C16623q0(p0Var.mo48565c());
        lVar.invoke(q0Var);
        mo48255I().addAll(q0Var.mo48573d());
        return q0Var;
    }

    @C12579k
    /* renamed from: d */
    public final C16568c mo48262d(@C12579k C16591e[] eVarArr, float f) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createAbsoluteLeftBarrier$1(x, f, eVarArr));
        mo48258L(11);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: f */
    public final C16568c mo48263f(@C12579k C16591e[] eVarArr, float f) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createAbsoluteRightBarrier$1(x, f, eVarArr));
        mo48258L(14);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: h */
    public final C16567b mo48264h(@C12579k C16591e[] eVarArr, float f) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createBottomBarrier$1(x, f, eVarArr));
        mo48258L(15);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(C16483g.m74442h0(f));
        return new C16567b(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: j */
    public final C16568c mo48265j(@C12579k C16591e[] eVarArr, float f) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createEndBarrier$1(x, f, eVarArr));
        mo48258L(13);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: l */
    public final C16568c mo48266l(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromAbsoluteLeft$2(x, f));
        mo48258L(4);
        mo48258L(Float.hashCode(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: m */
    public final C16568c mo48267m(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromAbsoluteLeft$1(x, f));
        mo48258L(2);
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: n */
    public final C16568c mo48268n(float f) {
        return mo48266l(1.0f - f);
    }

    @C12579k
    /* renamed from: o */
    public final C16568c mo48269o(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromAbsoluteRight$1(x, f));
        mo48258L(6);
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: p */
    public final C16567b mo48270p(float f) {
        return mo48276v(1.0f - f);
    }

    @C12579k
    /* renamed from: q */
    public final C16567b mo48271q(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromBottom$1(x, f));
        mo48258L(9);
        mo48258L(C16483g.m74442h0(f));
        return new C16567b(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: r */
    public final C16568c mo48272r(float f) {
        return mo48274t(1.0f - f);
    }

    @C12579k
    /* renamed from: s */
    public final C16568c mo48273s(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromEnd$1(x, f));
        mo48258L(5);
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: t */
    public final C16568c mo48274t(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromStart$2(x, f));
        mo48258L(3);
        mo48258L(Float.hashCode(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: u */
    public final C16568c mo48275u(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromStart$1(x, f));
        mo48258L(1);
        mo48258L(C16483g.m74442h0(f));
        return new C16568c(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: v */
    public final C16567b mo48276v(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromTop$2(x, f));
        mo48258L(8);
        mo48258L(Float.hashCode(f));
        return new C16567b(Integer.valueOf(x), 0);
    }

    @C12579k
    /* renamed from: w */
    public final C16567b mo48277w(float f) {
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createGuidelineFromTop$1(x, f));
        mo48258L(7);
        mo48258L(C16483g.m74442h0(f));
        return new C16567b(Integer.valueOf(x), 0);
    }

    /* renamed from: x */
    public final int mo48278x() {
        int i = this.f41132d;
        this.f41132d = i + 1;
        return i;
    }

    @C12579k
    /* renamed from: y */
    public final C16583a0 mo48279y(@C12579k C16591e[] eVarArr, @C12579k C16586c cVar) {
        Intrinsics.checkNotNullParameter(eVarArr, "elements");
        Intrinsics.checkNotNullParameter(cVar, "chainStyle");
        int x = mo48278x();
        this.f41129a.add(new ConstraintLayoutBaseScope$createHorizontalChain$1(x, eVarArr, cVar));
        mo48258L(16);
        for (C16591e hashCode : eVarArr) {
            mo48258L(hashCode.hashCode());
        }
        mo48258L(cVar.hashCode());
        return new C16583a0(Integer.valueOf(x));
    }
}
