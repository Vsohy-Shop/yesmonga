package androidx.compose.p004ui;

import androidx.compose.p004ui.node.C15678d;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.ModifierNodeOwnerScope;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.ui.m */
public interface C8767m {
    @C12579k

    /* renamed from: j */
    public static final C8768a f23478j = C8768a.f23479a;

    /* renamed from: androidx.compose.ui.m$a */
    public static final class C8768a implements C8767m {

        /* renamed from: a */
        public static final /* synthetic */ C8768a f23479a = new C8768a();

        /* renamed from: A */
        public boolean mo17001A(@C12579k C11300l<? super C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return true;
        }

        /* renamed from: T */
        public boolean mo17002T(@C12579k C11300l<? super C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return false;
        }

        /* renamed from: Z */
        public <R> R mo17003Z(R r, @C12579k C11304p<? super C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return r;
        }

        @C12579k
        /* renamed from: k3 */
        public C8767m mo17224k3(@C12579k C8767m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "other");
            return mVar;
        }

        @C12579k
        public String toString() {
            return "Modifier";
        }

        /* renamed from: w */
        public <R> R mo17009w(R r, @C12579k C11304p<? super R, ? super C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return r;
        }
    }

    /* renamed from: androidx.compose.ui.m$b */
    public static final class C8769b {
        @Deprecated
        @C12579k
        /* renamed from: a */
        public static C8767m m32598a(@C12579k C8767m mVar, @C12579k C8767m mVar2) {
            Intrinsics.checkNotNullParameter(mVar2, "other");
            return C8767m.super.mo17224k3(mVar2);
        }
    }

    /* renamed from: androidx.compose.ui.m$c */
    public interface C8770c extends C8767m {

        /* renamed from: androidx.compose.ui.m$c$a */
        public static final class C8771a {
            @Deprecated
            /* renamed from: a */
            public static boolean m32608a(@C12579k C8770c cVar, @C12579k C11300l<? super C8770c, Boolean> lVar) {
                Intrinsics.checkNotNullParameter(lVar, "predicate");
                return C8770c.super.mo17001A(lVar);
            }

            @Deprecated
            /* renamed from: b */
            public static boolean m32609b(@C12579k C8770c cVar, @C12579k C11300l<? super C8770c, Boolean> lVar) {
                Intrinsics.checkNotNullParameter(lVar, "predicate");
                return C8770c.super.mo17002T(lVar);
            }

            @Deprecated
            /* renamed from: c */
            public static <R> R m32610c(@C12579k C8770c cVar, R r, @C12579k C11304p<? super R, ? super C8770c, ? extends R> pVar) {
                Intrinsics.checkNotNullParameter(pVar, "operation");
                return C8770c.super.mo17009w(r, pVar);
            }

            @Deprecated
            /* renamed from: d */
            public static <R> R m32611d(@C12579k C8770c cVar, R r, @C12579k C11304p<? super C8770c, ? super R, ? extends R> pVar) {
                Intrinsics.checkNotNullParameter(pVar, "operation");
                return C8770c.super.mo17003Z(r, pVar);
            }

            @Deprecated
            @C12579k
            /* renamed from: e */
            public static C8767m m32612e(@C12579k C8770c cVar, @C12579k C8767m mVar) {
                Intrinsics.checkNotNullParameter(mVar, "other");
                return C8767m.super.mo17224k3(mVar);
            }
        }

        /* renamed from: A */
        boolean mo17001A(@C12579k C11300l<? super C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }

        /* renamed from: T */
        boolean mo17002T(@C12579k C11300l<? super C8770c, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }

        /* renamed from: Z */
        <R> R mo17003Z(R r, @C12579k C11304p<? super C8770c, ? super R, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return pVar.invoke(this, r);
        }

        /* renamed from: w */
        <R> R mo17009w(R r, @C12579k C11304p<? super R, ? super C8770c, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return pVar.invoke(r, this);
        }
    }

    @C8761g
    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.m$d */
    public static abstract class C8772d implements C15678d {

        /* renamed from: y */
        public static final int f23480y = 8;
        @C12579k

        /* renamed from: a */
        public C8772d f23481a = this;

        /* renamed from: b */
        public int f23482b;

        /* renamed from: c */
        public int f23483c;
        @C12580l

        /* renamed from: d */
        public C8772d f23484d;
        @C12580l

        /* renamed from: e */
        public C8772d f23485e;
        @C12580l

        /* renamed from: f */
        public ModifierNodeOwnerScope f23486f;
        @C12580l

        /* renamed from: g */
        public NodeCoordinator f23487g;

        /* renamed from: v */
        public boolean f23488v;

        /* renamed from: w */
        public boolean f23489w;

        /* renamed from: x */
        public boolean f23490x;

        /* renamed from: J */
        public static /* synthetic */ void m32613J() {
        }

        /* renamed from: B */
        public void mo17226B() {
            boolean z;
            if (!this.f23490x) {
                if (this.f23487g != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f23490x = true;
                    mo17238S();
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: D */
        public void mo17227D() {
            boolean z;
            if (this.f23490x) {
                if (this.f23487g != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    mo17239T();
                    this.f23490x = false;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: E */
        public final int mo17228E() {
            return this.f23483c;
        }

        @C12580l
        /* renamed from: F */
        public final C8772d mo17229F() {
            return this.f23485e;
        }

        @C12580l
        /* renamed from: G */
        public final NodeCoordinator mo17230G() {
            return this.f23487g;
        }

        /* renamed from: H */
        public final boolean mo17231H() {
            return this.f23488v;
        }

        /* renamed from: I */
        public final int mo17232I() {
            return this.f23482b;
        }

        @C12580l
        /* renamed from: L */
        public final ModifierNodeOwnerScope mo17233L() {
            return this.f23486f;
        }

        @C12580l
        /* renamed from: M */
        public final C8772d mo17234M() {
            return this.f23484d;
        }

        /* renamed from: P */
        public final boolean mo17235P() {
            return this.f23489w;
        }

        /* renamed from: Q */
        public final boolean mo17236Q() {
            return this.f23490x;
        }

        /* renamed from: R */
        public final boolean mo17237R(int i) {
            return (i & mo17232I()) != 0;
        }

        /* renamed from: S */
        public void mo17238S() {
        }

        /* renamed from: T */
        public void mo17239T() {
        }

        /* renamed from: U */
        public void mo17240U() {
        }

        /* renamed from: V */
        public void mo17241V() {
            if (this.f23490x) {
                mo17240U();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: X */
        public final void mo17242X(int i) {
            this.f23483c = i;
        }

        /* renamed from: Z */
        public final void mo17243Z(@C12579k C8772d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "owner");
            this.f23481a = dVar;
        }

        /* renamed from: a0 */
        public final void mo17244a0(@C12580l C8772d dVar) {
            this.f23485e = dVar;
        }

        /* renamed from: b0 */
        public final void mo17245b0(boolean z) {
            this.f23488v = z;
        }

        /* renamed from: c0 */
        public final void mo17246c0(int i) {
            this.f23482b = i;
        }

        /* renamed from: d0 */
        public final void mo17247d0(@C12580l ModifierNodeOwnerScope modifierNodeOwnerScope) {
            this.f23486f = modifierNodeOwnerScope;
        }

        /* renamed from: f0 */
        public final void mo17248f0(@C12580l C8772d dVar) {
            this.f23484d = dVar;
        }

        /* renamed from: g0 */
        public final void mo17249g0(boolean z) {
            this.f23489w = z;
        }

        /* renamed from: h0 */
        public final void mo17250h0(@C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(aVar, "effect");
            C15681e.m70236q(this).mo44960G(aVar);
        }

        /* renamed from: i0 */
        public void mo17251i0(@C12580l NodeCoordinator nodeCoordinator) {
            this.f23487g = nodeCoordinator;
        }

        @C12579k
        /* renamed from: q */
        public final C8772d mo17252q() {
            return this.f23481a;
        }
    }

    /* renamed from: A */
    boolean mo17001A(@C12579k C11300l<? super C8770c, Boolean> lVar);

    /* renamed from: T */
    boolean mo17002T(@C12579k C11300l<? super C8770c, Boolean> lVar);

    /* renamed from: Z */
    <R> R mo17003Z(R r, @C12579k C11304p<? super C8770c, ? super R, ? extends R> pVar);

    @C12579k
    /* renamed from: k3 */
    C8767m mo17224k3(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "other");
        if (mVar == f23478j) {
            return this;
        }
        return new CombinedModifier(this, mVar);
    }

    /* renamed from: w */
    <R> R mo17009w(R r, @C12579k C11304p<? super R, ? super C8770c, ? extends R> pVar);
}
