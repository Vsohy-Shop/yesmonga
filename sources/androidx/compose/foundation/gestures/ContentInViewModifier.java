package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.foundation.relocation.C2673e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15592p0;
import androidx.compose.p004ui.layout.C15599s0;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.collection.C8423g;
import com.google.maps.android.data.geojson.C33834i;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
public final class ContentInViewModifier implements C2673e, C15599s0, C15592p0 {
    @C12579k

    /* renamed from: X */
    public final C8767m f5827X = BringIntoViewResponderKt.m12029b(FocusedBoundsKt.m8946c(this, new ContentInViewModifier$modifier$1(this)), this);
    @C12579k

    /* renamed from: a */
    public final C12074o0 f5828a;
    @C12579k

    /* renamed from: b */
    public final Orientation f5829b;
    @C12579k

    /* renamed from: c */
    public final C2203n f5830c;

    /* renamed from: d */
    public final boolean f5831d;
    @C12579k

    /* renamed from: e */
    public final BringIntoViewRequestPriorityQueue f5832e = new BringIntoViewRequestPriorityQueue();
    @C12580l

    /* renamed from: f */
    public C15588o f5833f;
    @C12580l

    /* renamed from: g */
    public C15588o f5834g;
    @C12580l

    /* renamed from: v */
    public C15098i f5835v;

    /* renamed from: w */
    public boolean f5836w;

    /* renamed from: x */
    public long f5837x = C16500q.f40900b.mo47897a();

    /* renamed from: y */
    public boolean f5838y;
    @C12579k

    /* renamed from: z */
    public final UpdatableAnimationState f5839z = new UpdatableAnimationState();

    @C11363r0({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$a */
    public static final class C2129a {
        @C12579k

        /* renamed from: a */
        public final C11289a<C15098i> f5840a;
        @C12579k

        /* renamed from: b */
        public final C12072o<C11079d2> f5841b;

        public C2129a(@C12579k C11289a<C15098i> aVar, @C12579k C12072o<? super C11079d2> oVar) {
            Intrinsics.checkNotNullParameter(aVar, "currentBounds");
            Intrinsics.checkNotNullParameter(oVar, "continuation");
            this.f5840a = aVar;
            this.f5841b = oVar;
        }

        @C12579k
        /* renamed from: a */
        public final C12072o<C11079d2> mo7342a() {
            return this.f5841b;
        }

        @C12579k
        /* renamed from: b */
        public final C11289a<C15098i> mo7343b() {
            return this.f5840a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r0 == null) goto L_0x0050;
         */
        @org.jetbrains.annotations.C12579k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.o<kotlin.d2> r0 = r4.f5841b
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                kotlinx.coroutines.n0$a r1 = kotlinx.coroutines.C12067n0.f29709c
                kotlin.coroutines.CoroutineContext$a r0 = r0.mo7444b(r1)
                kotlinx.coroutines.n0 r0 = (kotlinx.coroutines.C12067n0) r0
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.mo24524V()
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.C11600b.m45172a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L_0x0050
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L_0x0052
            L_0x0050:
                java.lang.String r0 = "("
            L_0x0052:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                kotlin.jvm.functions.a<androidx.compose.ui.geometry.i> r0 = r4.f5840a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.o<kotlin.d2> r0 = r4.f5841b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.C2129a.toString():java.lang.String");
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$b */
    public /* synthetic */ class C2130b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.C2130b.<clinit>():void");
        }
    }

    public ContentInViewModifier(@C12579k C12074o0 o0Var, @C12579k Orientation orientation, @C12579k C2203n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nVar, "scrollState");
        this.f5828a = o0Var;
        this.f5829b = orientation;
        this.f5830c = nVar;
        this.f5831d = z;
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m9176H(ContentInViewModifier contentInViewModifier, C15098i iVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewModifier.f5837x;
        }
        return contentInViewModifier.mo7331G(iVar, j);
    }

    /* renamed from: B */
    public final C15098i mo7327B(C15098i iVar, long j) {
        return iVar.mo42261S(C15094f.m64890z(mo7334L(iVar, j)));
    }

    /* renamed from: D */
    public final C15098i mo7328D() {
        C8423g a = this.f5832e.f5826a;
        int h0 = a.mo15469h0();
        C15098i iVar = null;
        if (h0 > 0) {
            int i = h0 - 1;
            Object[] d0 = a.mo15462d0();
            do {
                C15098i invoke = ((C2129a) d0[i]).mo7343b().invoke();
                if (invoke != null) {
                    if (mo7341z(invoke.mo42284z(), C16502r.m74673f(this.f5837x)) > 0) {
                        return iVar;
                    }
                    iVar = invoke;
                }
                i--;
            } while (i >= 0);
        }
        return iVar;
    }

    /* renamed from: E */
    public final C15098i mo7329E() {
        C15588o oVar;
        C15588o oVar2 = this.f5833f;
        if (oVar2 != null) {
            if (!oVar2.mo44436k()) {
                oVar2 = null;
            }
            if (!(oVar2 == null || (oVar = this.f5834g) == null)) {
                if (!oVar.mo44436k()) {
                    oVar = null;
                }
                if (oVar != null) {
                    return oVar2.mo44437n0(oVar, false);
                }
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: F */
    public final C8767m mo7330F() {
        return this.f5827X;
    }

    /* renamed from: G */
    public final boolean mo7331G(C15098i iVar, long j) {
        return C15094f.m64876l(mo7334L(iVar, j), C15094f.f37256b.mo42248e());
    }

    /* renamed from: I */
    public final void mo7332I() {
        if (!this.f5838y) {
            C11723c2 unused = C12038j.m48061f(this.f5828a, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new ContentInViewModifier$launchAnimation$1(this, (C11045c<? super ContentInViewModifier$launchAnimation$1>) null), 1, (Object) null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: J */
    public final float mo7333J(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    /* renamed from: L */
    public final long mo7334L(C15098i iVar, long j) {
        long f = C16502r.m74673f(j);
        int i = C2130b.$EnumSwitchMapping$0[this.f5829b.ordinal()];
        if (i == 1) {
            return C15096g.m64898a(0.0f, mo7333J(iVar.mo42249B(), iVar.mo42271j(), C15104m.m65016m(f)));
        }
        if (i == 2) {
            return C15096g.m64898a(mo7333J(iVar.mo42279t(), iVar.mo42283x(), C15104m.m65023t(f)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: a */
    public C15098i mo7335a(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "localRect");
        if (!C16500q.m74657h(this.f5837x, C16500q.f40900b.mo47897a())) {
            return mo7327B(iVar, this.f5837x);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @C12580l
    /* renamed from: b */
    public Object mo7336b(@C12579k C11289a<C15098i> aVar, @C12579k C11045c<? super C11079d2> cVar) {
        C15098i invoke = aVar.invoke();
        boolean z = false;
        if (invoke != null && !m9176H(this, invoke, 0, 1, (Object) null)) {
            z = true;
        }
        if (!z) {
            return C11079d2.f28267a;
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        if (this.f5832e.mo7320c(new C2129a(aVar, pVar)) && !this.f5838y) {
            mo7332I();
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: k */
    public void mo7337k(long j) {
        C15098i E;
        long j2 = this.f5837x;
        this.f5837x = j;
        if (mo7340y(j, j2) < 0 && (E = mo7329E()) != null) {
            C15098i iVar = this.f5835v;
            if (iVar == null) {
                iVar = E;
            }
            if (!this.f5838y && !this.f5836w && mo7331G(iVar, j2) && !mo7331G(E, j)) {
                this.f5836w = true;
                mo7332I();
            }
            this.f5835v = E;
        }
    }

    /* renamed from: p */
    public void mo7338p(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, C33834i.f82018j);
        this.f5833f = oVar;
    }

    /* renamed from: x */
    public final float mo7339x() {
        if (C16500q.m74657h(this.f5837x, C16500q.f40900b.mo47897a())) {
            return 0.0f;
        }
        C15098i D = mo7328D();
        if (D == null) {
            if (this.f5836w) {
                D = mo7329E();
            } else {
                D = null;
            }
            if (D == null) {
                return 0.0f;
            }
        }
        long f = C16502r.m74673f(this.f5837x);
        int i = C2130b.$EnumSwitchMapping$0[this.f5829b.ordinal()];
        if (i == 1) {
            return mo7333J(D.mo42249B(), D.mo42271j(), C15104m.m65016m(f));
        }
        if (i == 2) {
            return mo7333J(D.mo42279t(), D.mo42283x(), C15104m.m65023t(f));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: y */
    public final int mo7340y(long j, long j2) {
        int i = C2130b.$EnumSwitchMapping$0[this.f5829b.ordinal()];
        if (i == 1) {
            return Intrinsics.compare(C16500q.m74659j(j), C16500q.m74659j(j2));
        }
        if (i == 2) {
            return Intrinsics.compare(C16500q.m74662m(j), C16500q.m74662m(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: z */
    public final int mo7341z(long j, long j2) {
        int i = C2130b.$EnumSwitchMapping$0[this.f5829b.ordinal()];
        if (i == 1) {
            return Float.compare(C15104m.m65016m(j), C15104m.m65016m(j2));
        }
        if (i == 2) {
            return Float.compare(C15104m.m65023t(j), C15104m.m65023t(j2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
