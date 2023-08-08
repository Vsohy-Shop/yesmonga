package androidx.compose.animation.core;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bumptech.glide.load.engine.executor.C22218a;
import java.util.List;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n76#2:1165\n102#2,2:1166\n76#2:1168\n102#2,2:1169\n76#2:1171\n102#2,2:1172\n76#2:1174\n1855#3,2:1175\n1855#3,2:1177\n1855#3,2:1179\n1855#3,2:1181\n1855#3,2:1183\n1855#3,2:1192\n36#4:1185\n1057#5,6:1186\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n212#1:1156\n212#1:1157,2\n219#1:1159\n219#1:1160,2\n234#1:1162\n234#1:1163,2\n235#1:1165\n235#1:1166,2\n238#1:1168\n238#1:1169,2\n258#1:1171\n258#1:1172,2\n270#1:1174\n294#1:1175,2\n303#1:1177,2\n364#1:1179,2\n377#1:1181,2\n416#1:1183,2\n453#1:1192,2\n431#1:1185\n431#1:1186,6\n*E\n"})
public final class Transition<S> {

    /* renamed from: m */
    public static final int f5340m = 0;
    @C12579k

    /* renamed from: a */
    public final C1998o0<S> f5341a;
    @C12580l

    /* renamed from: b */
    public final String f5342b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f5343c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f5344d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f5345e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f5346f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f5347g;
    @C12579k

    /* renamed from: h */
    public final SnapshotStateList<Transition<S>.d<?, ?>> f5348h;
    @C12579k

    /* renamed from: i */
    public final SnapshotStateList<Transition<?>> f5349i;
    @C12579k

    /* renamed from: j */
    public final C8700z0 f5350j;

    /* renamed from: k */
    public long f5351k;
    @C12579k

    /* renamed from: l */
    public final C8578k2 f5352l;

    @C1987l0
    @C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n655#1:1156\n655#1:1157,2\n*E\n"})
    /* renamed from: androidx.compose.animation.core.Transition$a */
    public final class C1925a<T, V extends C1997o> {
        @C12579k

        /* renamed from: a */
        public final C1945a1<T, V> f5353a;
        @C12579k

        /* renamed from: b */
        public final String f5354b;
        @C12579k

        /* renamed from: c */
        public final C8700z0 f5355c = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

        /* renamed from: d */
        public final /* synthetic */ Transition<S> f5356d;

        /* renamed from: androidx.compose.animation.core.Transition$a$a */
        public final class C1926a<T, V extends C1997o> implements C8578k2<T> {
            @C12579k

            /* renamed from: a */
            public final Transition<S>.d<T, V> f5357a;
            @C12579k

            /* renamed from: b */
            public C11300l<? super C1927b<S>, ? extends C1956d0<T>> f5358b;
            @C12579k

            /* renamed from: c */
            public C11300l<? super S, ? extends T> f5359c;

            /* renamed from: d */
            public final /* synthetic */ Transition<S>.a<T, V> f5360d;

            public C1926a(@C12579k C1925a aVar, @C12579k Transition<S>.d<T, V> dVar, @C12579k C11300l<? super C1927b<S>, ? extends C1956d0<T>> lVar, C11300l<? super S, ? extends T> lVar2) {
                Intrinsics.checkNotNullParameter(dVar, C22218a.f57069g);
                Intrinsics.checkNotNullParameter(lVar, "transitionSpec");
                Intrinsics.checkNotNullParameter(lVar2, "targetValueByState");
                this.f5360d = aVar;
                this.f5357a = dVar;
                this.f5358b = lVar;
                this.f5359c = lVar2;
            }

            @C12579k
            /* renamed from: e */
            public final Transition<S>.d<T, V> mo6723e() {
                return this.f5357a;
            }

            @C12579k
            /* renamed from: g */
            public final C11300l<S, T> mo6724g() {
                return this.f5359c;
            }

            public T getValue() {
                mo6728l(this.f5360d.f5356d.mo6704m());
                return this.f5357a.getValue();
            }

            @C12579k
            /* renamed from: h */
            public final C11300l<C1927b<S>, C1956d0<T>> mo6725h() {
                return this.f5358b;
            }

            /* renamed from: i */
            public final void mo6726i(@C12579k C11300l<? super S, ? extends T> lVar) {
                Intrinsics.checkNotNullParameter(lVar, "<set-?>");
                this.f5359c = lVar;
            }

            /* renamed from: k */
            public final void mo6727k(@C12579k C11300l<? super C1927b<S>, ? extends C1956d0<T>> lVar) {
                Intrinsics.checkNotNullParameter(lVar, "<set-?>");
                this.f5358b = lVar;
            }

            /* renamed from: l */
            public final void mo6728l(@C12579k C1927b<S> bVar) {
                Intrinsics.checkNotNullParameter(bVar, "segment");
                Object invoke = this.f5359c.invoke(bVar.mo6409a());
                if (this.f5360d.f5356d.mo6711t()) {
                    this.f5357a.mo6732B(this.f5359c.invoke(bVar.mo6410c()), invoke, (C1956d0) this.f5358b.invoke(bVar));
                    return;
                }
                this.f5357a.mo6733C(invoke, (C1956d0) this.f5358b.invoke(bVar));
            }
        }

        public C1925a(@C12579k Transition transition, @C12579k C1945a1<T, V> a1Var, String str) {
            Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
            Intrinsics.checkNotNullParameter(str, "label");
            this.f5356d = transition;
            this.f5353a = a1Var;
            this.f5354b = str;
        }

        @C12579k
        /* renamed from: a */
        public final C8578k2<T> mo6717a(@C12579k C11300l<? super C1927b<S>, ? extends C1956d0<T>> lVar, @C12579k C11300l<? super S, ? extends T> lVar2) {
            Intrinsics.checkNotNullParameter(lVar, "transitionSpec");
            Intrinsics.checkNotNullParameter(lVar2, "targetValueByState");
            C1926a b = mo6718b();
            if (b == null) {
                Transition<S> transition = this.f5356d;
                b = new C1926a(this, new C1930d(transition, lVar2.invoke(transition.mo6700h()), C1980j.m8434i(this.f5353a, lVar2.invoke(this.f5356d.mo6700h())), this.f5353a, this.f5354b), lVar, lVar2);
                Transition<S> transition2 = this.f5356d;
                mo6721e(b);
                transition2.mo6696d(b.mo6723e());
            }
            Transition<S> transition3 = this.f5356d;
            b.mo6726i(lVar2);
            b.mo6727k(lVar);
            b.mo6728l(transition3.mo6704m());
            return b;
        }

        @C12580l
        /* renamed from: b */
        public final Transition<S>.a<T, V>.a<T, V> mo6718b() {
            return (C1926a) this.f5355c.getValue();
        }

        @C12579k
        /* renamed from: c */
        public final String mo6719c() {
            return this.f5354b;
        }

        @C12579k
        /* renamed from: d */
        public final C1945a1<T, V> mo6720d() {
            return this.f5353a;
        }

        /* renamed from: e */
        public final void mo6721e(@C12580l Transition<S>.a<T, V>.a<T, V> aVar) {
            this.f5355c.setValue(aVar);
        }

        /* renamed from: f */
        public final void mo6722f() {
            C1926a b = mo6718b();
            if (b != null) {
                Transition<S> transition = this.f5356d;
                b.mo6723e().mo6732B(b.mo6724g().invoke(transition.mo6704m().mo6410c()), b.mo6724g().invoke(transition.mo6704m().mo6409a()), (C1956d0) b.mo6725h().invoke(transition.mo6704m()));
            }
        }
    }

    /* renamed from: androidx.compose.animation.core.Transition$b */
    public interface C1927b<S> {

        /* renamed from: androidx.compose.animation.core.Transition$b$a */
        public static final class C1928a {
            @Deprecated
            /* renamed from: a */
            public static <S> boolean m8154a(@C12579k C1927b<S> bVar, S s, S s2) {
                return C1927b.super.mo6729d(s, s2);
            }
        }

        /* renamed from: a */
        S mo6409a();

        /* renamed from: c */
        S mo6410c();

        /* renamed from: d */
        boolean mo6729d(S s, S s2) {
            return Intrinsics.areEqual((Object) s, mo6410c()) && Intrinsics.areEqual((Object) s2, mo6409a());
        }
    }

    /* renamed from: androidx.compose.animation.core.Transition$c */
    public static final class C1929c<S> implements C1927b<S> {

        /* renamed from: a */
        public final S f5361a;

        /* renamed from: b */
        public final S f5362b;

        public C1929c(S s, S s2) {
            this.f5361a = s;
            this.f5362b = s2;
        }

        /* renamed from: a */
        public S mo6409a() {
            return this.f5362b;
        }

        /* renamed from: c */
        public S mo6410c() {
            return this.f5361a;
        }

        public boolean equals(@C12580l Object obj) {
            if (obj instanceof C1927b) {
                C1927b bVar = (C1927b) obj;
                if (!Intrinsics.areEqual(mo6410c(), bVar.mo6410c()) || !Intrinsics.areEqual(mo6409a(), bVar.mo6409a())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object c = mo6410c();
            int i = 0;
            int hashCode = (c != null ? c.hashCode() : 0) * 31;
            Object a = mo6409a();
            if (a != null) {
                i = a.hashCode();
            }
            return hashCode + i;
        }
    }

    @C8547h2
    @C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n76#2:1165\n102#2,2:1166\n76#2:1168\n102#2,2:1169\n76#2:1171\n102#2,2:1172\n76#2:1174\n102#2,2:1175\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n476#1:1156\n476#1:1157,2\n482#1:1159\n482#1:1160,2\n489#1:1162\n489#1:1163,2\n497#1:1165\n497#1:1166,2\n498#1:1168\n498#1:1169,2\n499#1:1171\n499#1:1172,2\n502#1:1174\n502#1:1175,2\n*E\n"})
    /* renamed from: androidx.compose.animation.core.Transition$d */
    public final class C1930d<T, V extends C1997o> implements C8578k2<T> {
        @C12579k

        /* renamed from: a */
        public final C1945a1<T, V> f5363a;
        @C12579k

        /* renamed from: b */
        public final String f5364b;
        @C12579k

        /* renamed from: c */
        public final C8700z0 f5365c;
        @C12579k

        /* renamed from: d */
        public final C8700z0 f5366d = C8539f2.m30981g(C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null), (C8410b2) null, 2, (Object) null);
        @C12579k

        /* renamed from: e */
        public final C8700z0 f5367e;
        @C12579k

        /* renamed from: f */
        public final C8700z0 f5368f;
        @C12579k

        /* renamed from: g */
        public final C8700z0 f5369g;
        @C12579k

        /* renamed from: v */
        public final C8700z0 f5370v;
        @C12579k

        /* renamed from: w */
        public final C8700z0 f5371w;
        @C12579k

        /* renamed from: x */
        public V f5372x;
        @C12579k

        /* renamed from: y */
        public final C1956d0<T> f5373y;

        /* renamed from: z */
        public final /* synthetic */ Transition<S> f5374z;

        public C1930d(Transition transition, @C12579k T t, @C12579k V v, @C12579k C1945a1<T, V> a1Var, String str) {
            Object obj;
            Intrinsics.checkNotNullParameter(v, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
            Intrinsics.checkNotNullParameter(str, "label");
            this.f5374z = transition;
            this.f5363a = a1Var;
            this.f5364b = str;
            this.f5365c = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
            this.f5367e = C8539f2.m30981g(new C2021y0(mo6735g(), a1Var, t, mo6740m(), v), (C8410b2) null, 2, (Object) null);
            this.f5368f = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
            this.f5369g = C8539f2.m30981g(0L, (C8410b2) null, 2, (Object) null);
            this.f5370v = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            this.f5371w = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
            this.f5372x = v;
            Float f = (Float) C2002p1.m8580i().get(a1Var);
            if (f != null) {
                float floatValue = f.floatValue();
                C1997o oVar = (C1997o) a1Var.mo6792a().invoke(t);
                int b = oVar.mo6867b();
                for (int i = 0; i < b; i++) {
                    oVar.mo6870e(i, floatValue);
                }
                obj = this.f5363a.mo6793b().invoke(oVar);
            } else {
                obj = null;
            }
            this.f5373y = C1972h.m8390o(0.0f, 0.0f, obj, 3, (Object) null);
        }

        /* renamed from: A */
        public static /* synthetic */ void m8157A(C1930d dVar, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            dVar.mo6753z(obj, z);
        }

        /* renamed from: B */
        public final void mo6732B(T t, T t2, @C12579k C1956d0<T> d0Var) {
            Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
            mo6751x(t2);
            mo6747t(d0Var);
            if (!Intrinsics.areEqual(mo6734e().mo7008j(), (Object) t) || !Intrinsics.areEqual(mo6734e().mo6800g(), (Object) t2)) {
                m8157A(this, t, false, 2, (Object) null);
            }
        }

        /* renamed from: C */
        public final void mo6733C(T t, @C12579k C1956d0<T> d0Var) {
            Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
            if (!Intrinsics.areEqual(mo6740m(), (Object) t) || mo6738k()) {
                mo6751x(t);
                mo6747t(d0Var);
                m8157A(this, (Object) null, !mo6742o(), 1, (Object) null);
                mo6748u(false);
                mo6750w(this.f5374z.mo6703k());
                mo6749v(false);
            }
        }

        @C12579k
        /* renamed from: e */
        public final C2021y0<T, V> mo6734e() {
            return (C2021y0) this.f5367e.getValue();
        }

        @C12579k
        /* renamed from: g */
        public final C1956d0<T> mo6735g() {
            return (C1956d0) this.f5366d.getValue();
        }

        public T getValue() {
            return this.f5371w.getValue();
        }

        /* renamed from: h */
        public final long mo6736h() {
            return mo6734e().mo6797d();
        }

        @C12579k
        /* renamed from: i */
        public final String mo6737i() {
            return this.f5364b;
        }

        /* renamed from: k */
        public final boolean mo6738k() {
            return ((Boolean) this.f5370v.getValue()).booleanValue();
        }

        /* renamed from: l */
        public final long mo6739l() {
            return ((Number) this.f5369g.getValue()).longValue();
        }

        /* renamed from: m */
        public final T mo6740m() {
            return this.f5365c.getValue();
        }

        @C12579k
        /* renamed from: n */
        public final C1945a1<T, V> mo6741n() {
            return this.f5363a;
        }

        /* renamed from: o */
        public final boolean mo6742o() {
            return ((Boolean) this.f5368f.getValue()).booleanValue();
        }

        /* renamed from: p */
        public final void mo6743p(long j, float f) {
            long j2;
            if (f > 0.0f) {
                float l = ((float) (j - mo6739l())) / f;
                if (!Float.isNaN(l)) {
                    j2 = (long) l;
                } else {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f + ",playTimeNanos: " + j + ", offsetTimeNanos: " + mo6739l()).toString());
                }
            } else {
                j2 = mo6734e().mo6797d();
            }
            mo6752y(mo6734e().mo6799f(j2));
            this.f5372x = mo6734e().mo6795b(j2);
            if (mo6734e().mo6796c(j2)) {
                mo6748u(true);
                mo6750w(0);
            }
        }

        /* renamed from: q */
        public final void mo6744q() {
            mo6749v(true);
        }

        /* renamed from: r */
        public final void mo6745r(long j) {
            mo6752y(mo6734e().mo6799f(j));
            this.f5372x = mo6734e().mo6795b(j);
        }

        /* renamed from: s */
        public final void mo6746s(C2021y0<T, V> y0Var) {
            this.f5367e.setValue(y0Var);
        }

        /* renamed from: t */
        public final void mo6747t(C1956d0<T> d0Var) {
            this.f5366d.setValue(d0Var);
        }

        /* renamed from: u */
        public final void mo6748u(boolean z) {
            this.f5368f.setValue(Boolean.valueOf(z));
        }

        /* renamed from: v */
        public final void mo6749v(boolean z) {
            this.f5370v.setValue(Boolean.valueOf(z));
        }

        /* renamed from: w */
        public final void mo6750w(long j) {
            this.f5369g.setValue(Long.valueOf(j));
        }

        /* renamed from: x */
        public final void mo6751x(T t) {
            this.f5365c.setValue(t);
        }

        /* renamed from: y */
        public void mo6752y(T t) {
            this.f5371w.setValue(t);
        }

        /* renamed from: z */
        public final void mo6753z(T t, boolean z) {
            C1956d0<T> d0Var;
            if (!z) {
                d0Var = mo6735g();
            } else if (mo6735g() instanceof C2014v0) {
                d0Var = mo6735g();
            } else {
                d0Var = this.f5373y;
            }
            mo6746s(new C2021y0(d0Var, this.f5363a, t, mo6740m(), this.f5372x));
            this.f5374z.mo6712v();
        }
    }

    @C11532s0
    public Transition(@C12579k C1998o0<S> o0Var, @C12580l String str) {
        Intrinsics.checkNotNullParameter(o0Var, "transitionState");
        this.f5341a = o0Var;
        this.f5342b = str;
        this.f5343c = C8539f2.m30981g(mo6700h(), (C8410b2) null, 2, (Object) null);
        this.f5344d = C8539f2.m30981g(new C1929c(mo6700h(), mo6700h()), (C8410b2) null, 2, (Object) null);
        this.f5345e = C8539f2.m30981g(0L, (C8410b2) null, 2, (Object) null);
        this.f5346f = C8539f2.m30981g(Long.MIN_VALUE, (C8410b2) null, 2, (Object) null);
        this.f5347g = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
        this.f5348h = C8415c2.m30237f();
        this.f5349i = C8415c2.m30237f();
        this.f5350j = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        this.f5352l = C8415c2.m30235d(new Transition$totalDurationNanos$2(this));
    }

    @C1987l0
    /* renamed from: l */
    public static /* synthetic */ void m8103l() {
    }

    @C1987l0
    /* renamed from: u */
    public static /* synthetic */ void m8104u() {
    }

    /* renamed from: A */
    public final void mo6684A(@C12579k Transition<S>.d<?, ?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, C22218a.f57069g);
        this.f5348h.remove((Object) dVar);
    }

    /* renamed from: B */
    public final boolean mo6685B(@C12579k Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        return this.f5349i.remove((Object) transition);
    }

    @C11314h(name = "seek")
    /* renamed from: C */
    public final void mo6686C(S s, S s2, long j) {
        mo6692I(Long.MIN_VALUE);
        this.f5341a.mo6948f(false);
        if (!mo6711t() || !Intrinsics.areEqual(mo6700h(), (Object) s) || !Intrinsics.areEqual(mo6706o(), (Object) s2)) {
            mo6687D(s);
            mo6693J(s2);
            mo6690G(true);
            mo6691H(new C1929c(s, s2));
        }
        for (Transition next : this.f5349i) {
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (next.mo6711t()) {
                next.mo6686C(next.mo6700h(), next.mo6706o(), j);
            }
        }
        for (Transition<S>.d<?, ?> r : this.f5348h) {
            r.mo6745r(j);
        }
        this.f5351k = j;
    }

    /* renamed from: D */
    public final void mo6687D(S s) {
        this.f5341a.mo6947e(s);
    }

    /* renamed from: E */
    public final void mo6688E(long j) {
        this.f5351k = j;
    }

    /* renamed from: F */
    public final void mo6689F(long j) {
        this.f5345e.setValue(Long.valueOf(j));
    }

    /* renamed from: G */
    public final void mo6690G(boolean z) {
        this.f5350j.setValue(Boolean.valueOf(z));
    }

    /* renamed from: H */
    public final void mo6691H(C1927b<S> bVar) {
        this.f5344d.setValue(bVar);
    }

    /* renamed from: I */
    public final void mo6692I(long j) {
        this.f5346f.setValue(Long.valueOf(j));
    }

    /* renamed from: J */
    public final void mo6693J(S s) {
        this.f5343c.setValue(s);
    }

    /* renamed from: K */
    public final void mo6694K(boolean z) {
        this.f5347g.setValue(Boolean.valueOf(z));
    }

    @C8540g
    /* renamed from: L */
    public final void mo6695L(S s, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(-583974681);
        if ((i & 14) == 0) {
            if (o.mo15006n0(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-583974681, i, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:399)");
            }
            if (!mo6711t() && !Intrinsics.areEqual(mo6706o(), (Object) s)) {
                mo6691H(new C1929c(mo6706o(), s));
                mo6687D(mo6706o());
                mo6693J(s);
                if (!mo6710s()) {
                    mo6694K(true);
                }
                for (Transition<S>.d<?, ?> q : this.f5348h) {
                    q.mo6744q();
                }
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new Transition$updateTarget$2(this, s, i));
        }
    }

    /* renamed from: d */
    public final boolean mo6696d(@C12579k Transition<S>.d<?, ?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, C22218a.f57069g);
        return this.f5348h.add(dVar);
    }

    /* renamed from: e */
    public final boolean mo6697e(@C12579k Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, C0508a.f1295O0);
        return this.f5349i.add(transition);
    }

    @C8540g
    /* renamed from: f */
    public final void mo6698f(S s, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(-1493585151);
        if ((i & 14) == 0) {
            if (o.mo15006n0(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:424)");
            }
            if (!mo6711t()) {
                mo6695L(s, o, (i2 & 14) | (i2 & 112));
                if (!Intrinsics.areEqual((Object) s, mo6700h()) || mo6710s() || mo6709r()) {
                    int i5 = (i2 >> 3) & 14;
                    o.mo14918M(1157296644);
                    boolean n0 = o.mo15006n0(this);
                    Object N = o.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new Transition$animateTo$1$1(this, (C11045c<? super Transition$animateTo$1$1>) null);
                        o.mo14893C(N);
                    }
                    o.mo15002m0();
                    EffectsKt.m29896h(this, (C11304p) N, o, i5 | 64);
                }
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new Transition$animateTo$2(this, s, i));
        }
    }

    @C12579k
    /* renamed from: g */
    public final List<Transition<S>.d<?, ?>> mo6699g() {
        return this.f5348h;
    }

    /* renamed from: h */
    public final S mo6700h() {
        return this.f5341a.mo6943a();
    }

    @C12580l
    /* renamed from: i */
    public final String mo6701i() {
        return this.f5342b;
    }

    /* renamed from: j */
    public final long mo6702j() {
        return this.f5351k;
    }

    /* renamed from: k */
    public final long mo6703k() {
        return ((Number) this.f5345e.getValue()).longValue();
    }

    @C12579k
    /* renamed from: m */
    public final C1927b<S> mo6704m() {
        return (C1927b) this.f5344d.getValue();
    }

    /* renamed from: n */
    public final long mo6705n() {
        return ((Number) this.f5346f.getValue()).longValue();
    }

    /* renamed from: o */
    public final S mo6706o() {
        return this.f5343c.getValue();
    }

    /* renamed from: p */
    public final long mo6707p() {
        return ((Number) this.f5352l.getValue()).longValue();
    }

    @C12579k
    /* renamed from: q */
    public final List<Transition<?>> mo6708q() {
        return this.f5349i;
    }

    /* renamed from: r */
    public final boolean mo6709r() {
        return ((Boolean) this.f5347g.getValue()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo6710s() {
        return mo6705n() != Long.MIN_VALUE;
    }

    /* renamed from: t */
    public final boolean mo6711t() {
        return ((Boolean) this.f5350j.getValue()).booleanValue();
    }

    /* renamed from: v */
    public final void mo6712v() {
        mo6694K(true);
        if (mo6711t()) {
            long j = 0;
            for (C1930d next : this.f5348h) {
                j = Math.max(j, next.mo6736h());
                next.mo6745r(this.f5351k);
            }
            mo6694K(false);
        }
    }

    /* renamed from: w */
    public final void mo6713w(long j, float f) {
        if (mo6705n() == Long.MIN_VALUE) {
            mo6715y(j);
        }
        mo6694K(false);
        mo6689F(j - mo6705n());
        boolean z = true;
        for (C1930d next : this.f5348h) {
            if (!next.mo6742o()) {
                next.mo6743p(mo6703k(), f);
            }
            if (!next.mo6742o()) {
                z = false;
            }
        }
        for (Transition next2 : this.f5349i) {
            if (!Intrinsics.areEqual(next2.mo6706o(), next2.mo6700h())) {
                next2.mo6713w(mo6703k(), f);
            }
            if (!Intrinsics.areEqual(next2.mo6706o(), next2.mo6700h())) {
                z = false;
            }
        }
        if (z) {
            mo6714x();
        }
    }

    /* renamed from: x */
    public final void mo6714x() {
        mo6692I(Long.MIN_VALUE);
        mo6687D(mo6706o());
        mo6689F(0);
        this.f5341a.mo6948f(false);
    }

    /* renamed from: y */
    public final void mo6715y(long j) {
        mo6692I(j);
        this.f5341a.mo6948f(true);
    }

    /* renamed from: z */
    public final void mo6716z(@C12579k Transition<S>.a<?, ?> aVar) {
        C1930d<?, ?> e;
        Intrinsics.checkNotNullParameter(aVar, "deferredAnimation");
        C1925a.C1926a<?, ?> b = aVar.mo6718b();
        if (b != null && (e = b.mo6723e()) != null) {
            mo6684A(e);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Transition(C1998o0 o0Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(o0Var, (i & 2) != 0 ? null : str);
    }

    public Transition(S s, @C12580l String str) {
        this(new C1998o0(s), str);
    }
}
