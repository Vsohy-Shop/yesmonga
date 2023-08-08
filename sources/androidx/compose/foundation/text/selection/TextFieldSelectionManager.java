package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2763c0;
import androidx.compose.foundation.text.C2772g0;
import androidx.compose.foundation.text.C2846t;
import androidx.compose.foundation.text.C2851y;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.hapticfeedback.C15425a;
import androidx.compose.p004ui.hapticfeedback.C15426b;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.platform.C15912k0;
import androidx.compose.p004ui.platform.C15996x3;
import androidx.compose.p004ui.platform.TextToolbarStatus;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16317r0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n76#2:907\n102#2,2:908\n76#2:910\n102#2,2:911\n76#2:913\n102#2,2:914\n76#2:916\n102#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
public final class TextFieldSelectionManager {
    @C12580l

    /* renamed from: a */
    public final C2763c0 f7397a;
    @C12579k

    /* renamed from: b */
    public C16281c0 f7398b;
    @C12579k

    /* renamed from: c */
    public C11300l<? super TextFieldValue, C11079d2> f7399c;
    @C12580l

    /* renamed from: d */
    public TextFieldState f7400d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f7401e;
    @C12579k

    /* renamed from: f */
    public C16275a1 f7402f;
    @C12580l

    /* renamed from: g */
    public C15912k0 f7403g;
    @C12580l

    /* renamed from: h */
    public C15996x3 f7404h;
    @C12580l

    /* renamed from: i */
    public C15425a f7405i;
    @C12580l

    /* renamed from: j */
    public FocusRequester f7406j;
    @C12579k

    /* renamed from: k */
    public final C8700z0 f7407k;

    /* renamed from: l */
    public long f7408l;
    @C12580l

    /* renamed from: m */
    public Integer f7409m;

    /* renamed from: n */
    public long f7410n;
    @C12579k

    /* renamed from: o */
    public final C8700z0 f7411o;
    @C12579k

    /* renamed from: p */
    public final C8700z0 f7412p;
    @C12579k

    /* renamed from: q */
    public TextFieldValue f7413q;
    @C12579k

    /* renamed from: r */
    public final C2846t f7414r;
    @C12579k

    /* renamed from: s */
    public final C2826e f7415s;

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$a */
    public static final class C2810a implements C2846t {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f7416a;

        public C2810a(TextFieldSelectionManager textFieldSelectionManager) {
            this.f7416a = textFieldSelectionManager;
        }

        /* renamed from: a */
        public void mo9336a() {
            this.f7416a.mo9748T((Handle) null);
            this.f7416a.mo9747S((C15094f) null);
        }

        /* renamed from: b */
        public void mo9337b(long j) {
            this.f7416a.mo9748T(Handle.Cursor);
            TextFieldSelectionManager textFieldSelectionManager = this.f7416a;
            textFieldSelectionManager.mo9747S(C15094f.m64868d(C2834l.m13089a(textFieldSelectionManager.mo9730B(true))));
        }

        /* renamed from: c */
        public void mo9338c(long j) {
            TextFieldSelectionManager textFieldSelectionManager = this.f7416a;
            textFieldSelectionManager.f7408l = C2834l.m13089a(textFieldSelectionManager.mo9730B(true));
            TextFieldSelectionManager textFieldSelectionManager2 = this.f7416a;
            textFieldSelectionManager2.mo9747S(C15094f.m64868d(textFieldSelectionManager2.f7408l));
            this.f7416a.f7410n = C15094f.f37256b.mo42248e();
            this.f7416a.mo9748T(Handle.Cursor);
        }

        /* renamed from: d */
        public void mo9339d() {
            this.f7416a.mo9748T((Handle) null);
            this.f7416a.mo9747S((C15094f) null);
        }

        /* renamed from: e */
        public void mo9340e(long j) {
            C2851y g;
            C16260h0 i;
            TextFieldSelectionManager textFieldSelectionManager = this.f7416a;
            textFieldSelectionManager.f7410n = C15094f.m64886v(textFieldSelectionManager.f7410n, j);
            TextFieldState G = this.f7416a.mo9735G();
            if (G != null && (g = G.mo9443g()) != null && (i = g.mo9930i()) != null) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.f7416a;
                textFieldSelectionManager2.mo9747S(C15094f.m64868d(C15094f.m64886v(textFieldSelectionManager2.f7408l, textFieldSelectionManager2.f7410n)));
                C16281c0 E = textFieldSelectionManager2.mo9733E();
                C15094f w = textFieldSelectionManager2.mo9771w();
                Intrinsics.checkNotNull(w);
                int a = E.mo9513a(i.mo47070x(w.mo42242A()));
                long b = C16359o0.m73780b(a, a);
                if (!C16356n0.m73735g(b, textFieldSelectionManager2.mo9739K().mo47113h())) {
                    C15425a C = textFieldSelectionManager2.mo9731C();
                    if (C != null) {
                        C.mo43597a(C15426b.f38115b.mo43603b());
                    }
                    textFieldSelectionManager2.mo9734F().invoke(textFieldSelectionManager2.mo9763n(textFieldSelectionManager2.mo9739K().mo47111f(), b));
                }
            }
        }

        public void onCancel() {
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$b */
    public static final class C2811b implements C2846t {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f7417a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7418b;

        public C2811b(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
            this.f7417a = textFieldSelectionManager;
            this.f7418b = z;
        }

        /* renamed from: a */
        public void mo9336a() {
            TextToolbarStatus textToolbarStatus = null;
            this.f7417a.mo9748T((Handle) null);
            this.f7417a.mo9747S((C15094f) null);
            TextFieldState G = this.f7417a.mo9735G();
            if (G != null) {
                G.mo9433B(true);
            }
            C15996x3 H = this.f7417a.mo9736H();
            if (H != null) {
                textToolbarStatus = H.getStatus();
            }
            if (textToolbarStatus == TextToolbarStatus.Hidden) {
                this.f7417a.mo9759e0();
            }
        }

        /* renamed from: b */
        public void mo9337b(long j) {
            Handle handle;
            TextFieldSelectionManager textFieldSelectionManager = this.f7417a;
            if (this.f7418b) {
                handle = Handle.SelectionStart;
            } else {
                handle = Handle.SelectionEnd;
            }
            textFieldSelectionManager.mo9748T(handle);
            TextFieldSelectionManager textFieldSelectionManager2 = this.f7417a;
            textFieldSelectionManager2.mo9747S(C15094f.m64868d(C2834l.m13089a(textFieldSelectionManager2.mo9730B(this.f7418b))));
        }

        /* renamed from: c */
        public void mo9338c(long j) {
            Handle handle;
            TextFieldSelectionManager textFieldSelectionManager = this.f7417a;
            textFieldSelectionManager.f7408l = C2834l.m13089a(textFieldSelectionManager.mo9730B(this.f7418b));
            TextFieldSelectionManager textFieldSelectionManager2 = this.f7417a;
            textFieldSelectionManager2.mo9747S(C15094f.m64868d(textFieldSelectionManager2.f7408l));
            this.f7417a.f7410n = C15094f.f37256b.mo42248e();
            TextFieldSelectionManager textFieldSelectionManager3 = this.f7417a;
            if (this.f7418b) {
                handle = Handle.SelectionStart;
            } else {
                handle = Handle.SelectionEnd;
            }
            textFieldSelectionManager3.mo9748T(handle);
            TextFieldState G = this.f7417a.mo9735G();
            if (G != null) {
                G.mo9433B(false);
            }
        }

        /* renamed from: d */
        public void mo9339d() {
            this.f7417a.mo9748T((Handle) null);
            this.f7417a.mo9747S((C15094f) null);
        }

        /* renamed from: e */
        public void mo9340e(long j) {
            C2851y g;
            C16260h0 i;
            int i2;
            int i3;
            TextFieldSelectionManager textFieldSelectionManager = this.f7417a;
            textFieldSelectionManager.f7410n = C15094f.m64886v(textFieldSelectionManager.f7410n, j);
            TextFieldState G = this.f7417a.mo9735G();
            if (!(G == null || (g = G.mo9443g()) == null || (i = g.mo9930i()) == null)) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.f7417a;
                boolean z = this.f7418b;
                textFieldSelectionManager2.mo9747S(C15094f.m64868d(C15094f.m64886v(textFieldSelectionManager2.f7408l, textFieldSelectionManager2.f7410n)));
                if (z) {
                    C15094f w = textFieldSelectionManager2.mo9771w();
                    Intrinsics.checkNotNull(w);
                    i2 = i.mo47070x(w.mo42242A());
                } else {
                    i2 = textFieldSelectionManager2.mo9733E().mo9514b(C16356n0.m73742n(textFieldSelectionManager2.mo9739K().mo47113h()));
                }
                int i4 = i2;
                if (z) {
                    i3 = textFieldSelectionManager2.mo9733E().mo9514b(C16356n0.m73737i(textFieldSelectionManager2.mo9739K().mo47113h()));
                } else {
                    C15094f w2 = textFieldSelectionManager2.mo9771w();
                    Intrinsics.checkNotNull(w2);
                    i3 = i.mo47070x(w2.mo42242A());
                }
                textFieldSelectionManager2.mo9760f0(textFieldSelectionManager2.mo9739K(), i4, i3, z, SelectionAdjustment.f7343a.mo9596c());
            }
            TextFieldState G2 = this.f7417a.mo9735G();
            if (G2 != null) {
                G2.mo9433B(false);
            }
        }

        public void onCancel() {
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$c */
    public static final class C2812c implements C2826e {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f7419a;

        public C2812c(TextFieldSelectionManager textFieldSelectionManager) {
            this.f7419a = textFieldSelectionManager;
        }

        /* renamed from: a */
        public boolean mo9346a(long j) {
            boolean z;
            TextFieldState G;
            C2851y g;
            if (this.f7419a.mo9739K().mo47115i().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (G = this.f7419a.mo9735G()) == null || (g = G.mo9443g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f7419a;
            textFieldSelectionManager.mo9760f0(textFieldSelectionManager.mo9739K(), textFieldSelectionManager.mo9733E().mo9514b(C16356n0.m73742n(textFieldSelectionManager.mo9739K().mo47113h())), g.mo9929g(j, false), false, SelectionAdjustment.f7343a.mo9598e());
            return true;
        }

        /* renamed from: b */
        public boolean mo9347b(long j, @C12579k SelectionAdjustment selectionAdjustment) {
            C2851y g;
            Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
            FocusRequester A = this.f7419a.mo9729A();
            if (A != null) {
                A.mo42129h();
            }
            this.f7419a.f7408l = j;
            TextFieldState G = this.f7419a.mo9735G();
            if (G == null || (g = G.mo9443g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f7419a;
            C2851y yVar = g;
            textFieldSelectionManager.f7409m = Integer.valueOf(C2851y.m13148h(yVar, j, false, 2, (Object) null));
            int h = C2851y.m13148h(yVar, textFieldSelectionManager.f7408l, false, 2, (Object) null);
            textFieldSelectionManager.mo9760f0(textFieldSelectionManager.mo9739K(), h, h, false, selectionAdjustment);
            return true;
        }

        /* renamed from: c */
        public boolean mo9348c(long j, @C12579k SelectionAdjustment selectionAdjustment) {
            boolean z;
            TextFieldState G;
            C2851y g;
            Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
            if (this.f7419a.mo9739K().mo47115i().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (G = this.f7419a.mo9735G()) == null || (g = G.mo9443g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f7419a;
            int g2 = g.mo9929g(j, false);
            TextFieldValue K = textFieldSelectionManager.mo9739K();
            Integer b = textFieldSelectionManager.f7409m;
            Intrinsics.checkNotNull(b);
            textFieldSelectionManager.mo9760f0(K, b.intValue(), g2, false, selectionAdjustment);
            return true;
        }

        /* renamed from: d */
        public boolean mo9349d(long j) {
            C2851y g;
            TextFieldState G = this.f7419a.mo9735G();
            if (G == null || (g = G.mo9443g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.f7419a;
            TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
            textFieldSelectionManager2.mo9760f0(textFieldSelectionManager.mo9739K(), textFieldSelectionManager.mo9733E().mo9514b(C16356n0.m73742n(textFieldSelectionManager.mo9739K().mo47113h())), C2851y.m13148h(g, j, false, 2, (Object) null), false, SelectionAdjustment.f7343a.mo9598e());
            return true;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$d */
    public static final class C2813d implements C2846t {

        /* renamed from: a */
        public final /* synthetic */ TextFieldSelectionManager f7420a;

        public C2813d(TextFieldSelectionManager textFieldSelectionManager) {
            this.f7420a = textFieldSelectionManager;
        }

        /* renamed from: a */
        public void mo9336a() {
            TextToolbarStatus textToolbarStatus;
            this.f7420a.mo9748T((Handle) null);
            this.f7420a.mo9747S((C15094f) null);
            TextFieldState G = this.f7420a.mo9735G();
            if (G != null) {
                G.mo9433B(true);
            }
            C15996x3 H = this.f7420a.mo9736H();
            if (H != null) {
                textToolbarStatus = H.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Hidden) {
                this.f7420a.mo9759e0();
            }
            this.f7420a.f7409m = null;
        }

        /* renamed from: b */
        public void mo9337b(long j) {
        }

        /* renamed from: c */
        public void mo9338c(long j) {
            boolean z;
            C2851y g;
            TextFieldState G;
            C2851y g2;
            C2851y g3;
            if (this.f7420a.mo9773y() == null) {
                this.f7420a.mo9748T(Handle.SelectionEnd);
                this.f7420a.mo9742N();
                TextFieldState G2 = this.f7420a.mo9735G();
                boolean z2 = true;
                if (G2 == null || (g3 = G2.mo9443g()) == null || !g3.mo9931j(j)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || (G = this.f7420a.mo9735G()) == null || (g2 = G.mo9443g()) == null) {
                    if (this.f7420a.mo9739K().mo47115i().length() != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        this.f7420a.mo9767s();
                        TextFieldState G3 = this.f7420a.mo9735G();
                        if (!(G3 == null || (g = G3.mo9443g()) == null)) {
                            TextFieldSelectionManager textFieldSelectionManager = this.f7420a;
                            int h = C2851y.m13148h(g, j, false, 2, (Object) null);
                            textFieldSelectionManager.mo9760f0(textFieldSelectionManager.mo9739K(), h, h, false, SelectionAdjustment.f7343a.mo9600g());
                            textFieldSelectionManager.f7409m = Integer.valueOf(h);
                        }
                        this.f7420a.f7408l = j;
                        TextFieldSelectionManager textFieldSelectionManager2 = this.f7420a;
                        textFieldSelectionManager2.mo9747S(C15094f.m64868d(textFieldSelectionManager2.f7408l));
                        this.f7420a.f7410n = C15094f.f37256b.mo42248e();
                        return;
                    }
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager3 = this.f7420a;
                int a = textFieldSelectionManager3.mo9733E().mo9513a(C2851y.m13147e(g2, g2.mo9928f(C15094f.m64882r(j)), false, 2, (Object) null));
                C15425a C = textFieldSelectionManager3.mo9731C();
                if (C != null) {
                    C.mo43597a(C15426b.f38115b.mo43603b());
                }
                TextFieldValue a2 = textFieldSelectionManager3.mo9763n(textFieldSelectionManager3.mo9739K().mo47111f(), C16359o0.m73780b(a, a));
                textFieldSelectionManager3.mo9767s();
                textFieldSelectionManager3.mo9734F().invoke(a2);
            }
        }

        /* renamed from: d */
        public void mo9339d() {
        }

        /* renamed from: e */
        public void mo9340e(long j) {
            boolean z;
            C2851y g;
            int i;
            if (this.f7420a.mo9739K().mo47115i().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                TextFieldSelectionManager textFieldSelectionManager = this.f7420a;
                textFieldSelectionManager.f7410n = C15094f.m64886v(textFieldSelectionManager.f7410n, j);
                TextFieldState G = this.f7420a.mo9735G();
                if (!(G == null || (g = G.mo9443g()) == null)) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.f7420a;
                    textFieldSelectionManager2.mo9747S(C15094f.m64868d(C15094f.m64886v(textFieldSelectionManager2.f7408l, textFieldSelectionManager2.f7410n)));
                    Integer b = textFieldSelectionManager2.f7409m;
                    if (b != null) {
                        i = b.intValue();
                    } else {
                        i = g.mo9929g(textFieldSelectionManager2.f7408l, false);
                    }
                    int i2 = i;
                    C15094f w = textFieldSelectionManager2.mo9771w();
                    Intrinsics.checkNotNull(w);
                    textFieldSelectionManager2.mo9760f0(textFieldSelectionManager2.mo9739K(), i2, g.mo9929g(w.mo42242A(), false), false, SelectionAdjustment.f7343a.mo9600g());
                }
                TextFieldState G2 = this.f7420a.mo9735G();
                if (G2 != null) {
                    G2.mo9433B(false);
                }
            }
        }

        public void onCancel() {
        }
    }

    public TextFieldSelectionManager() {
        this((C2763c0) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public static /* synthetic */ void m12869m(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.mo9762l(z);
    }

    /* renamed from: r */
    public static /* synthetic */ void m12870r(TextFieldSelectionManager textFieldSelectionManager, C15094f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = null;
        }
        textFieldSelectionManager.mo9766q(fVar);
    }

    @C12580l
    /* renamed from: A */
    public final FocusRequester mo9729A() {
        return this.f7406j;
    }

    /* renamed from: B */
    public final long mo9730B(boolean z) {
        int i;
        C2851y yVar;
        long h = mo9739K().mo47113h();
        if (z) {
            i = C16356n0.m73742n(h);
        } else {
            i = C16356n0.m73737i(h);
        }
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null) {
            yVar = textFieldState.mo9443g();
        } else {
            yVar = null;
        }
        Intrinsics.checkNotNull(yVar);
        return C2845u.m13123b(yVar.mo9930i(), this.f7398b.mo9514b(i), z, C16356n0.m73741m(mo9739K().mo47113h()));
    }

    @C12580l
    /* renamed from: C */
    public final C15425a mo9731C() {
        return this.f7405i;
    }

    @C12579k
    /* renamed from: D */
    public final C2826e mo9732D() {
        return this.f7415s;
    }

    @C12579k
    /* renamed from: E */
    public final C16281c0 mo9733E() {
        return this.f7398b;
    }

    @C12579k
    /* renamed from: F */
    public final C11300l<TextFieldValue, C11079d2> mo9734F() {
        return this.f7399c;
    }

    @C12580l
    /* renamed from: G */
    public final TextFieldState mo9735G() {
        return this.f7400d;
    }

    @C12580l
    /* renamed from: H */
    public final C15996x3 mo9736H() {
        return this.f7404h;
    }

    @C12579k
    /* renamed from: I */
    public final C2846t mo9737I() {
        return this.f7414r;
    }

    @C12580l
    /* renamed from: J */
    public final C2763c0 mo9738J() {
        return this.f7397a;
    }

    @C12579k
    /* renamed from: K */
    public final TextFieldValue mo9739K() {
        return (TextFieldValue) this.f7401e.getValue();
    }

    @C12579k
    /* renamed from: L */
    public final C16275a1 mo9740L() {
        return this.f7402f;
    }

    @C12579k
    /* renamed from: M */
    public final C2846t mo9741M(boolean z) {
        return new C2811b(this, z);
    }

    /* renamed from: N */
    public final void mo9742N() {
        TextToolbarStatus textToolbarStatus;
        C15996x3 x3Var;
        C15996x3 x3Var2 = this.f7404h;
        if (x3Var2 != null) {
            textToolbarStatus = x3Var2.getStatus();
        } else {
            textToolbarStatus = null;
        }
        if (textToolbarStatus == TextToolbarStatus.Shown && (x3Var = this.f7404h) != null) {
            x3Var.mo45485c();
        }
    }

    /* renamed from: O */
    public final boolean mo9743O() {
        return !Intrinsics.areEqual((Object) this.f7413q.mo47115i(), (Object) mo9739K().mo47115i());
    }

    /* renamed from: P */
    public final void mo9744P() {
        C16156d a;
        C15912k0 k0Var = this.f7403g;
        if (k0Var != null && (a = k0Var.mo45722a()) != null) {
            C16156d n = C16317r0.m73533c(mo9739K(), mo9739K().mo47115i().length()).mo46688n(a).mo46688n(C16317r0.m73532b(mo9739K(), mo9739K().mo47115i().length()));
            int l = C16356n0.m73740l(mo9739K().mo47113h()) + a.length();
            this.f7399c.invoke(mo9763n(n, C16359o0.m73780b(l, l)));
            mo9751W(HandleState.None);
            C2763c0 c0Var = this.f7397a;
            if (c0Var != null) {
                c0Var.mo9502a();
            }
        }
    }

    /* renamed from: Q */
    public final void mo9745Q() {
        TextFieldValue n = mo9763n(mo9739K().mo47111f(), C16359o0.m73780b(0, mo9739K().mo47115i().length()));
        this.f7399c.invoke(n);
        this.f7413q = TextFieldValue.m73307d(this.f7413q, (C16156d) null, n.mo47113h(), (C16356n0) null, 5, (Object) null);
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null) {
            textFieldState.mo9433B(true);
        }
    }

    /* renamed from: R */
    public final void mo9746R(@C12580l C15912k0 k0Var) {
        this.f7403g = k0Var;
    }

    /* renamed from: S */
    public final void mo9747S(C15094f fVar) {
        this.f7412p.setValue(fVar);
    }

    /* renamed from: T */
    public final void mo9748T(Handle handle) {
        this.f7411o.setValue(handle);
    }

    /* renamed from: U */
    public final void mo9749U(boolean z) {
        this.f7407k.setValue(Boolean.valueOf(z));
    }

    /* renamed from: V */
    public final void mo9750V(@C12580l FocusRequester focusRequester) {
        this.f7406j = focusRequester;
    }

    /* renamed from: W */
    public final void mo9751W(HandleState handleState) {
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null) {
            textFieldState.mo9457u(handleState);
        }
    }

    /* renamed from: X */
    public final void mo9752X(@C12580l C15425a aVar) {
        this.f7405i = aVar;
    }

    /* renamed from: Y */
    public final void mo9753Y(@C12579k C16281c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.f7398b = c0Var;
    }

    /* renamed from: Z */
    public final void mo9754Z(@C12579k C11300l<? super TextFieldValue, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f7399c = lVar;
    }

    /* renamed from: a0 */
    public final void mo9755a0(@C12580l TextFieldState textFieldState) {
        this.f7400d = textFieldState;
    }

    /* renamed from: b0 */
    public final void mo9756b0(@C12580l C15996x3 x3Var) {
        this.f7404h = x3Var;
    }

    /* renamed from: c0 */
    public final void mo9757c0(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.f7401e.setValue(textFieldValue);
    }

    /* renamed from: d0 */
    public final void mo9758d0(@C12579k C16275a1 a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "<set-?>");
        this.f7402f = a1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9759e0() {
        /*
            r9 = this;
            androidx.compose.ui.text.input.a1 r0 = r9.f7402f
            boolean r0 = r0 instanceof androidx.compose.p004ui.text.input.C16288e0
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.mo9739K()
            long r1 = r1.mo47113h()
            boolean r1 = androidx.compose.p004ui.text.C16356n0.m73736h(r1)
            r2 = 0
            if (r1 != 0) goto L_0x001c
            if (r0 != 0) goto L_0x001c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r1.<init>(r9)
            r5 = r1
            goto L_0x001d
        L_0x001c:
            r5 = r2
        L_0x001d:
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.mo9739K()
            long r3 = r1.mo47113h()
            boolean r1 = androidx.compose.p004ui.text.C16356n0.m73736h(r3)
            if (r1 != 0) goto L_0x003a
            boolean r1 = r9.mo9774z()
            if (r1 == 0) goto L_0x003a
            if (r0 != 0) goto L_0x003a
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r0.<init>(r9)
            r7 = r0
            goto L_0x003b
        L_0x003a:
            r7 = r2
        L_0x003b:
            boolean r0 = r9.mo9774z()
            if (r0 == 0) goto L_0x0057
            androidx.compose.ui.platform.k0 r0 = r9.f7403g
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.mo45723b()
            r3 = 1
            if (r0 != r3) goto L_0x004e
            r1 = r3
        L_0x004e:
            if (r1 == 0) goto L_0x0057
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r0.<init>(r9)
            r6 = r0
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            androidx.compose.ui.text.input.TextFieldValue r0 = r9.mo9739K()
            long r0 = r0.mo47113h()
            int r0 = androidx.compose.p004ui.text.C16356n0.m73738j(r0)
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.mo9739K()
            java.lang.String r1 = r1.mo47115i()
            int r1 = r1.length()
            if (r0 == r1) goto L_0x0077
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r2.<init>(r9)
        L_0x0077:
            r8 = r2
            androidx.compose.ui.platform.x3 r3 = r9.f7404h
            if (r3 == 0) goto L_0x0083
            androidx.compose.ui.geometry.i r4 = r9.mo9770v()
            r3.mo45484a(r4, r5, r6, r7, r8)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.mo9759e0():void");
    }

    /* renamed from: f0 */
    public final void mo9760f0(TextFieldValue textFieldValue, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment) {
        C16260h0 h0Var;
        C2851y g;
        long b = C16359o0.m73780b(this.f7398b.mo9514b(C16356n0.m73742n(textFieldValue.mo47113h())), this.f7398b.mo9514b(C16356n0.m73737i(textFieldValue.mo47113h())));
        TextFieldState textFieldState = this.f7400d;
        C16356n0 n0Var = null;
        if (textFieldState == null || (g = textFieldState.mo9443g()) == null) {
            h0Var = null;
        } else {
            h0Var = g.mo9930i();
        }
        if (!C16356n0.m73736h(b)) {
            n0Var = C16356n0.m73730b(b);
        }
        long a = C2841q.m13116a(h0Var, i, i2, n0Var, z, selectionAdjustment);
        long b2 = C16359o0.m73780b(this.f7398b.mo9513a(C16356n0.m73742n(a)), this.f7398b.mo9513a(C16356n0.m73737i(a)));
        if (!C16356n0.m73735g(b2, textFieldValue.mo47113h())) {
            C15425a aVar = this.f7405i;
            if (aVar != null) {
                aVar.mo43597a(C15426b.f38115b.mo43603b());
            }
            this.f7399c.invoke(mo9763n(textFieldValue.mo47111f(), b2));
            TextFieldState textFieldState2 = this.f7400d;
            if (textFieldState2 != null) {
                textFieldState2.mo9435D(TextFieldSelectionManagerKt.m12939c(this, true));
            }
            TextFieldState textFieldState3 = this.f7400d;
            if (textFieldState3 != null) {
                textFieldState3.mo9434C(TextFieldSelectionManagerKt.m12939c(this, false));
            }
        }
    }

    /* renamed from: k */
    public final void mo9761k(long j) {
        C2851y g;
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null && (g = textFieldState.mo9443g()) != null) {
            int h = C2851y.m13148h(g, j, false, 2, (Object) null);
            if (!C16356n0.m73733e(mo9739K().mo47113h(), h)) {
                mo9760f0(mo9739K(), h, h, false, SelectionAdjustment.f7343a.mo9600g());
            }
        }
    }

    /* renamed from: l */
    public final void mo9762l(boolean z) {
        if (!C16356n0.m73736h(mo9739K().mo47113h())) {
            C15912k0 k0Var = this.f7403g;
            if (k0Var != null) {
                k0Var.mo45724c(C16317r0.m73531a(mo9739K()));
            }
            if (z) {
                int k = C16356n0.m73739k(mo9739K().mo47113h());
                this.f7399c.invoke(mo9763n(mo9739K().mo47111f(), C16359o0.m73780b(k, k)));
                mo9751W(HandleState.None);
            }
        }
    }

    /* renamed from: n */
    public final TextFieldValue mo9763n(C16156d dVar, long j) {
        return new TextFieldValue(dVar, j, (C16356n0) null, 4, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: o */
    public final C2846t mo9764o() {
        return new C2810a(this);
    }

    /* renamed from: p */
    public final void mo9765p() {
        if (!C16356n0.m73736h(mo9739K().mo47113h())) {
            C15912k0 k0Var = this.f7403g;
            if (k0Var != null) {
                k0Var.mo45724c(C16317r0.m73531a(mo9739K()));
            }
            C16156d n = C16317r0.m73533c(mo9739K(), mo9739K().mo47115i().length()).mo46688n(C16317r0.m73532b(mo9739K(), mo9739K().mo47115i().length()));
            int l = C16356n0.m73740l(mo9739K().mo47113h());
            this.f7399c.invoke(mo9763n(n, C16359o0.m73780b(l, l)));
            mo9751W(HandleState.None);
            C2763c0 c0Var = this.f7397a;
            if (c0Var != null) {
                c0Var.mo9502a();
            }
        }
    }

    /* renamed from: q */
    public final void mo9766q(@C12580l C15094f fVar) {
        HandleState handleState;
        boolean z;
        C2851y yVar;
        int i;
        if (!C16356n0.m73736h(mo9739K().mo47113h())) {
            TextFieldState textFieldState = this.f7400d;
            if (textFieldState != null) {
                yVar = textFieldState.mo9443g();
            } else {
                yVar = null;
            }
            C2851y yVar2 = yVar;
            if (fVar == null || yVar2 == null) {
                i = C16356n0.m73739k(mo9739K().mo47113h());
            } else {
                i = this.f7398b.mo9513a(C2851y.m13148h(yVar2, fVar.mo42242A(), false, 2, (Object) null));
            }
            this.f7399c.invoke(TextFieldValue.m73307d(mo9739K(), (C16156d) null, C16359o0.m73779a(i), (C16356n0) null, 5, (Object) null));
        }
        if (fVar != null) {
            if (mo9739K().mo47115i().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                handleState = HandleState.Cursor;
                mo9751W(handleState);
                mo9742N();
            }
        }
        handleState = HandleState.None;
        mo9751W(handleState);
        mo9742N();
    }

    /* renamed from: s */
    public final void mo9767s() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.f7400d;
        boolean z = false;
        if (textFieldState != null && !textFieldState.mo9440d()) {
            z = true;
        }
        if (z && (focusRequester = this.f7406j) != null) {
            focusRequester.mo42129h();
        }
        this.f7413q = mo9739K();
        TextFieldState textFieldState2 = this.f7400d;
        if (textFieldState2 != null) {
            textFieldState2.mo9433B(true);
        }
        mo9751W(HandleState.Selection);
    }

    /* renamed from: t */
    public final void mo9768t() {
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null) {
            textFieldState.mo9433B(false);
        }
        mo9751W(HandleState.None);
    }

    @C12580l
    /* renamed from: u */
    public final C15912k0 mo9769u() {
        return this.f7403g;
    }

    /* renamed from: v */
    public final C15098i mo9770v() {
        long j;
        long j2;
        float f;
        C15588o f2;
        float f3;
        C16260h0 i;
        C15098i e;
        C15588o f4;
        float f5;
        C16260h0 i2;
        C15098i e2;
        C15588o f6;
        C15588o f7;
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null) {
            if (!(!textFieldState.mo9456t())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int b = this.f7398b.mo9514b(C16356n0.m73742n(mo9739K().mo47113h()));
                int b2 = this.f7398b.mo9514b(C16356n0.m73737i(mo9739K().mo47113h()));
                TextFieldState textFieldState2 = this.f7400d;
                if (textFieldState2 == null || (f7 = textFieldState2.mo9442f()) == null) {
                    j = C15094f.f37256b.mo42248e();
                } else {
                    j = f7.mo44440z0(mo9730B(true));
                }
                TextFieldState textFieldState3 = this.f7400d;
                if (textFieldState3 == null || (f6 = textFieldState3.mo9442f()) == null) {
                    j2 = C15094f.f37256b.mo42248e();
                } else {
                    j2 = f6.mo44440z0(mo9730B(false));
                }
                TextFieldState textFieldState4 = this.f7400d;
                float f8 = 0.0f;
                if (textFieldState4 == null || (f4 = textFieldState4.mo9442f()) == null) {
                    f = 0.0f;
                } else {
                    C2851y g = textFieldState.mo9443g();
                    if (g == null || (i2 = g.mo9930i()) == null || (e2 = i2.mo47049e(b)) == null) {
                        f5 = 0.0f;
                    } else {
                        f5 = e2.mo42249B();
                    }
                    f = C15094f.m64882r(f4.mo44440z0(C15096g.m64898a(0.0f, f5)));
                }
                TextFieldState textFieldState5 = this.f7400d;
                if (!(textFieldState5 == null || (f2 = textFieldState5.mo9442f()) == null)) {
                    C2851y g2 = textFieldState.mo9443g();
                    if (g2 == null || (i = g2.mo9930i()) == null || (e = i.mo47049e(b2)) == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = e.mo42249B();
                    }
                    f8 = C15094f.m64882r(f2.mo44440z0(C15096g.m64898a(0.0f, f3)));
                }
                return new C15098i(Math.min(C15094f.m64880p(j), C15094f.m64880p(j2)), Math.min(f, f8), Math.max(C15094f.m64880p(j), C15094f.m64880p(j2)), Math.max(C15094f.m64882r(j), C15094f.m64882r(j2)) + (C16483g.m74435M((float) 25) * textFieldState.mo9454r().mo9566a().getDensity()));
            }
        }
        return C15098i.f37261e.mo42285a();
    }

    @C12580l
    /* renamed from: w */
    public final C15094f mo9771w() {
        return (C15094f) this.f7412p.getValue();
    }

    /* renamed from: x */
    public final long mo9772x(@C12579k C16479d dVar) {
        C2851y yVar;
        Intrinsics.checkNotNullParameter(dVar, "density");
        int b = this.f7398b.mo9514b(C16356n0.m73742n(mo9739K().mo47113h()));
        TextFieldState textFieldState = this.f7400d;
        if (textFieldState != null) {
            yVar = textFieldState.mo9443g();
        } else {
            yVar = null;
        }
        Intrinsics.checkNotNull(yVar);
        C16260h0 i = yVar.mo9930i();
        C15098i e = i.mo47049e(C11479u.m44334I(b, 0, i.mo47058l().mo47040n().length()));
        return C15096g.m64898a(e.mo42279t() + (dVar.mo7425g5(TextFieldCursorKt.m12376c()) / ((float) 2)), e.mo42271j());
    }

    @C12580l
    /* renamed from: y */
    public final Handle mo9773y() {
        return (Handle) this.f7411o.getValue();
    }

    /* renamed from: z */
    public final boolean mo9774z() {
        return ((Boolean) this.f7407k.getValue()).booleanValue();
    }

    public TextFieldSelectionManager(@C12580l C2763c0 c0Var) {
        this.f7397a = c0Var;
        this.f7398b = C2772g0.m12579b();
        this.f7399c = TextFieldSelectionManager$onValueChange$1.f7421f;
        this.f7401e = C8539f2.m30981g(new TextFieldValue((String) null, 0, (C16356n0) null, 7, (DefaultConstructorMarker) null), (C8410b2) null, 2, (Object) null);
        this.f7402f = C16275a1.f40457a.mo47161a();
        this.f7407k = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
        C15094f.C15095a aVar = C15094f.f37256b;
        this.f7408l = aVar.mo42248e();
        this.f7410n = aVar.mo42248e();
        this.f7411o = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7412p = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f7413q = new TextFieldValue((String) null, 0, (C16356n0) null, 7, (DefaultConstructorMarker) null);
        this.f7414r = new C2813d(this);
        this.f7415s = new C2812c(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager(C2763c0 c0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c0Var);
    }
}
