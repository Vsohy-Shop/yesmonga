package androidx.compose.animation.core;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.load.engine.executor.C22218a;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1182#2:365\n1161#2,2:366\n76#3:368\n102#3,2:369\n76#3:371\n102#3,2:372\n25#4:374\n1057#5,6:375\n460#6,11:381\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374\n173#1:375,6\n217#1:381,11\n*E\n"})
public final class InfiniteTransition {

    /* renamed from: f */
    public static final int f5305f = 8;
    @C12579k

    /* renamed from: a */
    public final String f5306a;
    @C12579k

    /* renamed from: b */
    public final C8423g<C1918a<?, ?>> f5307b = new C8423g<>(new C1918a[16], 0);
    @C12579k

    /* renamed from: c */
    public final C8700z0 f5308c = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    /* renamed from: d */
    public long f5309d = Long.MIN_VALUE;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f5310e = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);

    @C11363r0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n76#2:365\n102#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$a */
    public final class C1918a<T, V extends C1997o> implements C8578k2<T> {

        /* renamed from: a */
        public T f5311a;

        /* renamed from: b */
        public T f5312b;
        @C12579k

        /* renamed from: c */
        public final C1945a1<T, V> f5313c;
        @C12579k

        /* renamed from: d */
        public final String f5314d;
        @C12579k

        /* renamed from: e */
        public final C8700z0 f5315e;
        @C12579k

        /* renamed from: f */
        public C1968g<T> f5316f;
        @C12579k

        /* renamed from: g */
        public C2021y0<T, V> f5317g;

        /* renamed from: v */
        public boolean f5318v;

        /* renamed from: w */
        public boolean f5319w;

        /* renamed from: x */
        public long f5320x;

        /* renamed from: y */
        public final /* synthetic */ InfiniteTransition f5321y;

        public C1918a(InfiniteTransition infiniteTransition, T t, @C12579k T t2, @C12579k C1945a1<T, V> a1Var, @C12579k C1968g<T> gVar, String str) {
            Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            Intrinsics.checkNotNullParameter(str, "label");
            this.f5321y = infiniteTransition;
            this.f5311a = t;
            this.f5312b = t2;
            this.f5313c = a1Var;
            this.f5314d = str;
            this.f5315e = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
            this.f5316f = gVar;
            this.f5317g = new C2021y0((C1968g) this.f5316f, (C1945a1) a1Var, (Object) this.f5311a, (Object) this.f5312b, (C1997o) null, 16, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final C2021y0<T, V> mo6640e() {
            return this.f5317g;
        }

        @C12579k
        /* renamed from: g */
        public final C1968g<T> mo6641g() {
            return this.f5316f;
        }

        public T getValue() {
            return this.f5315e.getValue();
        }

        /* renamed from: h */
        public final T mo6643h() {
            return this.f5311a;
        }

        @C12579k
        /* renamed from: i */
        public final String mo6644i() {
            return this.f5314d;
        }

        /* renamed from: k */
        public final T mo6645k() {
            return this.f5312b;
        }

        @C12579k
        /* renamed from: l */
        public final C1945a1<T, V> mo6646l() {
            return this.f5313c;
        }

        /* renamed from: m */
        public final boolean mo6647m() {
            return this.f5318v;
        }

        /* renamed from: n */
        public final void mo6648n(long j) {
            this.f5321y.mo6638n(false);
            if (this.f5319w) {
                this.f5319w = false;
                this.f5320x = j;
            }
            long j2 = j - this.f5320x;
            mo6654t(this.f5317g.mo6799f(j2));
            this.f5318v = this.f5317g.mo6796c(j2);
        }

        /* renamed from: o */
        public final void mo6649o() {
            this.f5319w = true;
        }

        /* renamed from: p */
        public final void mo6650p(@C12579k C2021y0<T, V> y0Var) {
            Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
            this.f5317g = y0Var;
        }

        /* renamed from: q */
        public final void mo6651q(boolean z) {
            this.f5318v = z;
        }

        /* renamed from: r */
        public final void mo6652r(T t) {
            this.f5311a = t;
        }

        /* renamed from: s */
        public final void mo6653s(T t) {
            this.f5312b = t;
        }

        /* renamed from: t */
        public void mo6654t(T t) {
            this.f5315e.setValue(t);
        }

        /* renamed from: u */
        public final void mo6655u() {
            mo6654t(this.f5317g.mo6800g());
            this.f5319w = true;
        }

        /* renamed from: v */
        public final void mo6656v(T t, T t2, @C12579k C1968g<T> gVar) {
            Intrinsics.checkNotNullParameter(gVar, "animationSpec");
            this.f5311a = t;
            this.f5312b = t2;
            this.f5316f = gVar;
            this.f5317g = new C2021y0((C1968g) gVar, (C1945a1) this.f5313c, (Object) t, (Object) t2, (C1997o) null, 16, (DefaultConstructorMarker) null);
            this.f5321y.mo6638n(true);
            this.f5318v = false;
            this.f5319w = true;
        }
    }

    public InfiniteTransition(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "label");
        this.f5306a = str;
    }

    /* renamed from: f */
    public final void mo6630f(@C12579k C1918a<?, ?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C22218a.f57069g);
        this.f5307b.mo15463e(aVar);
        mo6638n(true);
    }

    @C12579k
    /* renamed from: g */
    public final List<C1918a<?, ?>> mo6631g() {
        return this.f5307b.mo15485s();
    }

    @C12579k
    /* renamed from: h */
    public final String mo6632h() {
        return this.f5306a;
    }

    /* renamed from: i */
    public final boolean mo6633i() {
        return ((Boolean) this.f5308c.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo6634j() {
        return ((Boolean) this.f5310e.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final void mo6635k(long j) {
        boolean z;
        C8423g<C1918a<?, ?>> gVar = this.f5307b;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            z = true;
            int i = 0;
            do {
                C1918a aVar = (C1918a) d0[i];
                if (!aVar.mo6647m()) {
                    aVar.mo6648n(j);
                }
                if (!aVar.mo6647m()) {
                    z = false;
                }
                i++;
            } while (i < h0);
        } else {
            z = true;
        }
        mo6639o(!z);
    }

    /* renamed from: l */
    public final void mo6636l(@C12579k C1918a<?, ?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C22218a.f57069g);
        this.f5307b.mo15495z0(aVar);
    }

    @C8540g
    /* renamed from: m */
    public final void mo6637m(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-318043801);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-318043801, i, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        if (mo6634j() || mo6633i()) {
            EffectsKt.m29896h(this, new InfiniteTransition$run$1(z0Var, this, (C11045c<? super InfiniteTransition$run$1>) null), o, 72);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new InfiniteTransition$run$2(this, i));
        }
    }

    /* renamed from: n */
    public final void mo6638n(boolean z) {
        this.f5308c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: o */
    public final void mo6639o(boolean z) {
        this.f5310e.setValue(Boolean.valueOf(z));
    }
}
