package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2782o;
import androidx.compose.foundation.text.C2783p;
import androidx.compose.foundation.text.selection.C2820a;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n73#1,8:433\n73#1,8:441\n73#1,8:449\n73#1,8:457\n73#1,8:465\n73#1,8:473\n73#1,8:481\n73#1,8:489\n73#1,8:497\n73#1,8:505\n73#1,8:513\n73#1,8:521\n73#1,6:529\n80#1:536\n73#1,8:537\n73#1,8:545\n73#1,8:553\n74#1,7:561\n74#1,7:568\n73#1,8:575\n73#1,8:583\n73#1,8:591\n73#1,8:599\n74#1,7:607\n1#2:535\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:433,8\n95#1:441,8\n99#1:449,8\n107#1:457,8\n118#1:465,8\n134#1:473,8\n158#1:481,8\n163#1:489,8\n168#1:497,8\n172#1:505,8\n176#1:513,8\n184#1:521,8\n194#1:529,6\n194#1:536\n200#1:537,8\n204#1:545,8\n208#1:553,8\n212#1:561,7\n216#1:568,7\n222#1:575,8\n228#1:583,8\n232#1:591,8\n240#1:599,8\n249#1:607,7\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.a */
public abstract class C2820a<T extends C2820a<T>> {
    @C12579k

    /* renamed from: h */
    public static final C2821a f7427h = new C2821a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final int f7428i = -1;
    @C12579k

    /* renamed from: a */
    public final C16156d f7429a;

    /* renamed from: b */
    public final long f7430b;
    @C12580l

    /* renamed from: c */
    public final C16260h0 f7431c;
    @C12579k

    /* renamed from: d */
    public final C16281c0 f7432d;
    @C12579k

    /* renamed from: e */
    public final C2843s f7433e;

    /* renamed from: f */
    public long f7434f;
    @C12579k

    /* renamed from: g */
    public C16156d f7435g;

    /* renamed from: androidx.compose.foundation.text.selection.a$a */
    public static final class C2821a {
        public /* synthetic */ C2821a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C2821a() {
        }
    }

    public /* synthetic */ C2820a(C16156d dVar, long j, C16260h0 h0Var, C16281c0 c0Var, C2843s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j, h0Var, c0Var, sVar);
    }

    /* renamed from: b */
    public static /* synthetic */ C2820a m12962b(C2820a aVar, Object obj, boolean z, C11300l lVar, int i, Object obj2) {
        if (obj2 == null) {
            boolean z2 = true;
            if ((i & 1) != 0) {
                z = true;
            }
            Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
            if (z) {
                aVar.mo9789C().mo9904b();
            }
            if (aVar.mo9790D().length() <= 0) {
                z2 = false;
            }
            if (z2) {
                lVar.invoke(obj);
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
            return (C2820a) obj;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    /* renamed from: k */
    public static /* synthetic */ int m12963k(C2820a aVar, C16260h0 h0Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = aVar.mo9823f0();
            }
            return aVar.mo9828j(h0Var, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    /* renamed from: n */
    public static /* synthetic */ int m12964n(C2820a aVar, C16260h0 h0Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = aVar.mo9825g0();
            }
            return aVar.mo9830m(h0Var, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    /* renamed from: r */
    public static /* synthetic */ int m12965r(C2820a aVar, C16260h0 h0Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = aVar.mo9821e0();
            }
            return aVar.mo9833q(h0Var, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    /* renamed from: z */
    public static /* synthetic */ int m12966z(C2820a aVar, C16260h0 h0Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = aVar.mo9821e0();
            }
            return aVar.mo9840y(h0Var, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    @C12580l
    /* renamed from: A */
    public final Integer mo9787A() {
        C16260h0 h0Var = this.f7431c;
        if (h0Var != null) {
            return Integer.valueOf(m12966z(this, h0Var, 0, 1, (Object) null));
        }
        return null;
    }

    /* renamed from: B */
    public final long mo9788B() {
        return this.f7434f;
    }

    @C12579k
    /* renamed from: C */
    public final C2843s mo9789C() {
        return this.f7433e;
    }

    @C12579k
    /* renamed from: D */
    public final String mo9790D() {
        return this.f7435g.mo46683j();
    }

    /* renamed from: E */
    public final boolean mo9791E() {
        ResolvedTextDirection resolvedTextDirection;
        C16260h0 h0Var = this.f7431c;
        if (h0Var != null) {
            resolvedTextDirection = h0Var.mo47071y(mo9821e0());
        } else {
            resolvedTextDirection = null;
        }
        if (resolvedTextDirection != ResolvedTextDirection.Rtl) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final int mo9792F(C16260h0 h0Var, int i) {
        int e0 = mo9821e0();
        if (this.f7433e.mo9903a() == null) {
            this.f7433e.mo9905c(Float.valueOf(h0Var.mo47049e(e0).mo42279t()));
        }
        int q = h0Var.mo47062q(e0) + i;
        if (q < 0) {
            return 0;
        }
        if (q >= h0Var.mo47060n()) {
            return mo9790D().length();
        }
        float m = h0Var.mo47059m(q) - ((float) 1);
        Float a = this.f7433e.mo9903a();
        Intrinsics.checkNotNull(a);
        float floatValue = a.floatValue();
        if ((mo9791E() && floatValue >= h0Var.mo47065t(q)) || (!mo9791E() && floatValue <= h0Var.mo47064s(q))) {
            return h0Var.mo47061o(q, true);
        }
        return this.f7432d.mo9513a(h0Var.mo47070x(C15096g.m64898a(a.floatValue(), m)));
    }

    @C12579k
    /* renamed from: G */
    public final T mo9793G() {
        boolean z;
        C16260h0 h0Var;
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (h0Var = this.f7431c) != null) {
            mo9815b0(mo9792F(h0Var, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: H */
    public final T mo9794H() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo9791E()) {
                mo9799M();
            } else {
                mo9796J();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: I */
    public final T mo9795I() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo9791E()) {
                mo9801O();
            } else {
                mo9798L();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: J */
    public final T mo9796J() {
        boolean z;
        int o;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (o = mo9831o()) != -1) {
            mo9815b0(o);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: K */
    public final T mo9797K() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo9815b0(mo9837v());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: L */
    public final T mo9798L() {
        boolean z;
        Integer p;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (p = mo9832p()) != null) {
            mo9815b0(p.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: M */
    public final T mo9799M() {
        boolean z;
        int x;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (x = mo9839x()) != -1) {
            mo9815b0(x);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: N */
    public final T mo9800N() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo9815b0(mo9838w());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: O */
    public final T mo9801O() {
        boolean z;
        Integer A;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (A = mo9787A()) != null) {
            mo9815b0(A.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: P */
    public final T mo9802P() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo9791E()) {
                mo9796J();
            } else {
                mo9799M();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: Q */
    public final T mo9803Q() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo9791E()) {
                mo9798L();
            } else {
                mo9801O();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: R */
    public final T mo9804R() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo9815b0(mo9790D().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: S */
    public final T mo9805S() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo9815b0(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: T */
    public final T mo9806T() {
        boolean z;
        Integer i;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i = mo9827i()) != null) {
            mo9815b0(i.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: U */
    public final T mo9807U() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo9791E()) {
                mo9809W();
            } else {
                mo9806T();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: V */
    public final T mo9808V() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (mo9791E()) {
                mo9806T();
            } else {
                mo9809W();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: W */
    public final T mo9809W() {
        boolean z;
        Integer l;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (l = mo9829l()) != null) {
            mo9815b0(l.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: X */
    public final T mo9810X() {
        boolean z;
        C16260h0 h0Var;
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (h0Var = this.f7431c) != null) {
            mo9815b0(mo9792F(h0Var, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: Y */
    public final T mo9811Y() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo9817c0(0, mo9790D().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: Z */
    public final T mo9812Z() {
        boolean z;
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f7434f = C16359o0.m73780b(C16356n0.m73742n(this.f7430b), C16356n0.m73737i(this.f7434f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: a */
    public final <U> T mo9813a(U u, boolean z, @C12579k C11300l<? super U, C11079d2> lVar) {
        boolean z2;
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (z) {
            mo9789C().mo9904b();
        }
        if (mo9790D().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            lVar.invoke(u);
        }
        Intrinsics.checkNotNull(u, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (C2820a) u;
    }

    /* renamed from: a0 */
    public final void mo9814a0(@C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f7435g = dVar;
    }

    /* renamed from: b0 */
    public final void mo9815b0(int i) {
        mo9817c0(i, i);
    }

    /* renamed from: c */
    public final int mo9816c(int i) {
        return C11479u.m44313B(i, mo9790D().length() - 1);
    }

    /* renamed from: c0 */
    public final void mo9817c0(int i, int i2) {
        this.f7434f = C16359o0.m73780b(i, i2);
    }

    @C12579k
    /* renamed from: d */
    public final T mo9818d(@C12579k C11300l<? super T, C11079d2> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, "or");
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C16356n0.m73736h(this.f7434f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                lVar.invoke(this);
            } else if (mo9791E()) {
                mo9815b0(C16356n0.m73740l(this.f7434f));
            } else {
                mo9815b0(C16356n0.m73739k(this.f7434f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: d0 */
    public final void mo9819d0(long j) {
        this.f7434f = j;
    }

    @C12579k
    /* renamed from: e */
    public final T mo9820e(@C12579k C11300l<? super T, C11079d2> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, "or");
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C16356n0.m73736h(this.f7434f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                lVar.invoke(this);
            } else if (mo9791E()) {
                mo9815b0(C16356n0.m73739k(this.f7434f));
            } else {
                mo9815b0(C16356n0.m73740l(this.f7434f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: e0 */
    public final int mo9821e0() {
        return this.f7432d.mo9514b(C16356n0.m73737i(this.f7434f));
    }

    @C12579k
    /* renamed from: f */
    public final T mo9822f() {
        boolean z;
        mo9789C().mo9904b();
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo9815b0(C16356n0.m73737i(this.f7434f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: f0 */
    public final int mo9823f0() {
        return this.f7432d.mo9514b(C16356n0.m73739k(this.f7434f));
    }

    @C12579k
    /* renamed from: g */
    public final C16156d mo9824g() {
        return this.f7435g;
    }

    /* renamed from: g0 */
    public final int mo9825g0() {
        return this.f7432d.mo9514b(C16356n0.m73740l(this.f7434f));
    }

    @C12580l
    /* renamed from: h */
    public final C16260h0 mo9826h() {
        return this.f7431c;
    }

    @C12580l
    /* renamed from: i */
    public final Integer mo9827i() {
        C16260h0 h0Var = this.f7431c;
        if (h0Var != null) {
            return Integer.valueOf(m12963k(this, h0Var, 0, 1, (Object) null));
        }
        return null;
    }

    /* renamed from: j */
    public final int mo9828j(C16260h0 h0Var, int i) {
        return this.f7432d.mo9513a(h0Var.mo47061o(h0Var.mo47062q(i), true));
    }

    @C12580l
    /* renamed from: l */
    public final Integer mo9829l() {
        C16260h0 h0Var = this.f7431c;
        if (h0Var != null) {
            return Integer.valueOf(m12964n(this, h0Var, 0, 1, (Object) null));
        }
        return null;
    }

    /* renamed from: m */
    public final int mo9830m(C16260h0 h0Var, int i) {
        return this.f7432d.mo9513a(h0Var.mo47067u(h0Var.mo47062q(i)));
    }

    /* renamed from: o */
    public final int mo9831o() {
        return C2783p.m12638a(this.f7435g.mo46683j(), C16356n0.m73737i(this.f7434f));
    }

    @C12580l
    /* renamed from: p */
    public final Integer mo9832p() {
        C16260h0 h0Var = this.f7431c;
        if (h0Var != null) {
            return Integer.valueOf(m12965r(this, h0Var, 0, 1, (Object) null));
        }
        return null;
    }

    /* renamed from: q */
    public final int mo9833q(C16260h0 h0Var, int i) {
        while (i < this.f7429a.length()) {
            long C = h0Var.mo47044C(mo9816c(i));
            if (C16356n0.m73737i(C) > i) {
                return this.f7432d.mo9513a(C16356n0.m73737i(C));
            }
            i++;
        }
        return this.f7429a.length();
    }

    @C12579k
    /* renamed from: s */
    public final C16281c0 mo9834s() {
        return this.f7432d;
    }

    /* renamed from: t */
    public final long mo9835t() {
        return this.f7430b;
    }

    @C12579k
    /* renamed from: u */
    public final C16156d mo9836u() {
        return this.f7429a;
    }

    /* renamed from: v */
    public final int mo9837v() {
        return C2782o.m12635a(mo9790D(), C16356n0.m73739k(this.f7434f));
    }

    /* renamed from: w */
    public final int mo9838w() {
        return C2782o.m12636b(mo9790D(), C16356n0.m73740l(this.f7434f));
    }

    /* renamed from: x */
    public final int mo9839x() {
        return C2783p.m12639b(this.f7435g.mo46683j(), C16356n0.m73737i(this.f7434f));
    }

    /* renamed from: y */
    public final int mo9840y(C16260h0 h0Var, int i) {
        while (i > 0) {
            long C = h0Var.mo47044C(mo9816c(i));
            if (C16356n0.m73742n(C) < i) {
                return this.f7432d.mo9513a(C16356n0.m73742n(C));
            }
            i--;
        }
        return 0;
    }

    public C2820a(C16156d dVar, long j, C16260h0 h0Var, C16281c0 c0Var, C2843s sVar) {
        this.f7429a = dVar;
        this.f7430b = j;
        this.f7431c = h0Var;
        this.f7432d = c0Var;
        this.f7433e = sVar;
        this.f7434f = j;
        this.f7435g = dVar;
    }
}
