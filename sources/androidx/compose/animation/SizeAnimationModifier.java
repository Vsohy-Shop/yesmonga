package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,162:1\n76#2:163\n102#2,2:164\n56#3,4:166\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n*L\n102#1:163\n102#1:164,2\n113#1:166,4\n*E\n"})
public final class SizeAnimationModifier extends C2037m {
    @C12579k

    /* renamed from: a */
    public final C1968g<C16500q> f5255a;
    @C12579k

    /* renamed from: b */
    public final C12074o0 f5256b;
    @C12580l

    /* renamed from: c */
    public C11304p<? super C16500q, ? super C16500q, C11079d2> f5257c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f5258d = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.animation.SizeAnimationModifier$a */
    public static final class C1910a {

        /* renamed from: c */
        public static final int f5259c = 8;
        @C12579k

        /* renamed from: a */
        public final Animatable<C16500q, C1986l> f5260a;

        /* renamed from: b */
        public long f5261b;

        public /* synthetic */ C1910a(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        /* renamed from: d */
        public static /* synthetic */ C1910a m7902d(C1910a aVar, Animatable<C16500q, C1986l> animatable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = aVar.f5260a;
            }
            if ((i & 2) != 0) {
                j = aVar.f5261b;
            }
            return aVar.mo6566c(animatable, j);
        }

        @C12579k
        /* renamed from: a */
        public final Animatable<C16500q, C1986l> mo6564a() {
            return this.f5260a;
        }

        /* renamed from: b */
        public final long mo6565b() {
            return this.f5261b;
        }

        @C12579k
        /* renamed from: c */
        public final C1910a mo6566c(@C12579k Animatable<C16500q, C1986l> animatable, long j) {
            Intrinsics.checkNotNullParameter(animatable, "anim");
            return new C1910a(animatable, j, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final Animatable<C16500q, C1986l> mo6567e() {
            return this.f5260a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1910a)) {
                return false;
            }
            C1910a aVar = (C1910a) obj;
            return Intrinsics.areEqual((Object) this.f5260a, (Object) aVar.f5260a) && C16500q.m74657h(this.f5261b, aVar.f5261b);
        }

        /* renamed from: f */
        public final long mo6569f() {
            return this.f5261b;
        }

        /* renamed from: g */
        public final void mo6570g(long j) {
            this.f5261b = j;
        }

        public int hashCode() {
            return (this.f5260a.hashCode() * 31) + C16500q.m74663n(this.f5261b);
        }

        @C12579k
        public String toString() {
            return "AnimData(anim=" + this.f5260a + ", startSize=" + C16500q.m74665p(this.f5261b) + ')';
        }

        public C1910a(Animatable<C16500q, C1986l> animatable, long j) {
            this.f5260a = animatable;
            this.f5261b = j;
        }
    }

    public SizeAnimationModifier(@C12579k C1968g<C16500q> gVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(gVar, "animSpec");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f5255a = gVar;
        this.f5256b = o0Var;
    }

    /* renamed from: a */
    public final long mo6557a(long j) {
        long j2 = j;
        C1910a b = mo6558b();
        if (b == null) {
            b = new C1910a(new Animatable(C16500q.m74651b(j), VectorConvertersKt.m8223h(C16500q.f40900b), C16500q.m74651b(C16502r.m74668a(1, 1)), (String) null, 8, (DefaultConstructorMarker) null), j2, (DefaultConstructorMarker) null);
        } else if (!C16500q.m74657h(j2, b.mo6567e().mo6610r().mo47895q())) {
            b.mo6570g(b.mo6567e().mo6613u().mo47895q());
            C11723c2 unused = C12038j.m48061f(this.f5256b, (CoroutineContext) null, (CoroutineStart) null, new SizeAnimationModifier$animateTo$data$1$1(b, j, this, (C11045c<? super SizeAnimationModifier$animateTo$data$1$1>) null), 3, (Object) null);
        }
        mo6562m(b);
        return b.mo6567e().mo6613u().mo47895q();
    }

    @C12580l
    /* renamed from: b */
    public final C1910a mo6558b() {
        return (C1910a) this.f5258d.getValue();
    }

    @C12579k
    /* renamed from: e */
    public final C1968g<C16500q> mo6559e() {
        return this.f5255a;
    }

    @C12580l
    /* renamed from: g */
    public final C11304p<C16500q, C16500q, C11079d2> mo6560g() {
        return this.f5257c;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        long a = mo6557a(C16502r.m74668a(t0.mo44471K0(), t0.mo44468G0()));
        return C15568h0.m69206r2(h0Var, C16500q.m74662m(a), C16500q.m74659j(a), (Map) null, new SizeAnimationModifier$measure$1(t0), 4, (Object) null);
    }

    @C12579k
    /* renamed from: l */
    public final C12074o0 mo6561l() {
        return this.f5256b;
    }

    /* renamed from: m */
    public final void mo6562m(@C12580l C1910a aVar) {
        this.f5258d.setValue(aVar);
    }

    /* renamed from: n */
    public final void mo6563n(@C12580l C11304p<? super C16500q, ? super C16500q, C11079d2> pVar) {
        this.f5257c = pVar;
    }
}
