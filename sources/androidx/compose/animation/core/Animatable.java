package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n76#2:478\n102#2,2:479\n76#2:481\n102#2,2:482\n1#3:484\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n96#1:478\n96#1:479,2\n103#1:481\n103#1:482,2\n*E\n"})
public final class Animatable<T, V extends C1997o> {

    /* renamed from: o */
    public static final int f5276o = 8;
    @C12579k

    /* renamed from: a */
    public final C1945a1<T, V> f5277a;
    @C12580l

    /* renamed from: b */
    public final T f5278b;
    @C12579k

    /* renamed from: c */
    public final String f5279c;
    @C12579k

    /* renamed from: d */
    public final C1976i<T, V> f5280d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f5281e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f5282f;
    @C12580l

    /* renamed from: g */
    public T f5283g;
    @C12580l

    /* renamed from: h */
    public T f5284h;
    @C12579k

    /* renamed from: i */
    public final MutatorMutex f5285i;
    @C12579k

    /* renamed from: j */
    public final C2014v0<T> f5286j;
    @C12579k

    /* renamed from: k */
    public final V f5287k;
    @C12579k

    /* renamed from: l */
    public final V f5288l;
    @C12579k

    /* renamed from: m */
    public V f5289m;
    @C12579k

    /* renamed from: n */
    public V f5290n;

    public Animatable(T t, @C12579k C1945a1<T, V> a1Var, @C12580l T t2, @C12579k String str) {
        T t3 = t;
        C1945a1<T, V> a1Var2 = a1Var;
        String str2 = str;
        Intrinsics.checkNotNullParameter(a1Var2, "typeConverter");
        Intrinsics.checkNotNullParameter(str2, "label");
        this.f5277a = a1Var2;
        this.f5278b = t2;
        this.f5279c = str2;
        this.f5280d = new C1976i(a1Var2, t, (C1997o) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
        this.f5281e = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        this.f5282f = C8539f2.m30981g(t3, (C8410b2) null, 2, (Object) null);
        this.f5285i = new MutatorMutex();
        this.f5286j = new C2014v0(0.0f, 0.0f, t2, 3, (DefaultConstructorMarker) null);
        V l = mo6604l(t3, Float.NEGATIVE_INFINITY);
        this.f5287k = l;
        V l2 = mo6604l(t3, Float.POSITIVE_INFINITY);
        this.f5288l = l2;
        this.f5289m = l;
        this.f5290n = l2;
    }

    /* renamed from: E */
    public static /* synthetic */ void m7935E(Animatable animatable, T t, T t2, int i, Object obj) {
        if ((i & 1) != 0) {
            t = animatable.f5283g;
        }
        if ((i & 2) != 0) {
            t2 = animatable.f5284h;
        }
        animatable.mo6599D(t, t2);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m7941g(Animatable animatable, Object obj, C2013v vVar, C11300l lVar, C11045c cVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        return animatable.mo6600f(obj, vVar, lVar, cVar);
    }

    /* renamed from: i */
    public static /* synthetic */ Object m7942i(Animatable animatable, Object obj, C1968g gVar, Object obj2, C11300l lVar, C11045c cVar, int i, Object obj3) {
        if ((i & 2) != 0) {
            gVar = animatable.f5286j;
        }
        C1968g gVar2 = gVar;
        if ((i & 4) != 0) {
            obj2 = animatable.mo6614v();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            lVar = null;
        }
        return animatable.mo6601h(obj, gVar2, obj4, lVar, cVar);
    }

    /* renamed from: A */
    public final void mo6596A(T t) {
        this.f5282f.setValue(t);
    }

    @C12580l
    /* renamed from: B */
    public final Object mo6597B(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object e = MutatorMutex.m8048e(this.f5285i, (MutatePriority) null, new Animatable$snapTo$2(this, t, (C11045c<? super Animatable$snapTo$2>) null), cVar, 1, (Object) null);
        return e == C11063b.m42612h() ? e : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: C */
    public final Object mo6598C(@C12579k C11045c<? super C11079d2> cVar) {
        Object e = MutatorMutex.m8048e(this.f5285i, (MutatePriority) null, new Animatable$stop$2(this, (C11045c<? super Animatable$stop$2>) null), cVar, 1, (Object) null);
        return e == C11063b.m42612h() ? e : C11079d2.f28267a;
    }

    /* renamed from: D */
    public final void mo6599D(@C12580l T t, @C12580l T t2) {
        V v;
        V v2;
        boolean z;
        if (t == null || (v = (C1997o) this.f5277a.mo6792a().invoke(t)) == null) {
            v = this.f5287k;
        }
        if (t2 == null || (v2 = (C1997o) this.f5277a.mo6792a().invoke(t2)) == null) {
            v2 = this.f5288l;
        }
        int b = v.mo6867b();
        int i = 0;
        while (i < b) {
            if (v.mo6866a(i) <= v2.mo6866a(i)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i++;
            } else {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v + " is greater than upper bound " + v2 + " on index " + i).toString());
            }
        }
        this.f5289m = v;
        this.f5290n = v2;
        this.f5284h = t2;
        this.f5283g = t;
        if (!mo6616x()) {
            Object k = mo6603k(mo6613u());
            if (!Intrinsics.areEqual(k, mo6613u())) {
                this.f5280d.mo6854p(k);
            }
        }
    }

    @C12580l
    /* renamed from: f */
    public final Object mo6600f(T t, @C12579k C2013v<T> vVar, @C12580l C11300l<? super Animatable<T, V>, C11079d2> lVar, @C12579k C11045c<? super C1960e<T, V>> cVar) {
        return mo6617y(new C2011u(vVar, this.f5277a, mo6613u(), (C1997o) this.f5277a.mo6792a().invoke(t)), t, lVar, cVar);
    }

    @C12580l
    /* renamed from: h */
    public final Object mo6601h(T t, @C12579k C1968g<T> gVar, T t2, @C12580l C11300l<? super Animatable<T, V>, C11079d2> lVar, @C12579k C11045c<? super C1960e<T, V>> cVar) {
        return mo6617y(AnimationKt.m7992c(gVar, this.f5277a, mo6613u(), t, t2), t2, lVar, cVar);
    }

    @C12579k
    /* renamed from: j */
    public final C8578k2<T> mo6602j() {
        return this.f5280d;
    }

    /* renamed from: k */
    public final T mo6603k(T t) {
        if (Intrinsics.areEqual((Object) this.f5289m, (Object) this.f5287k) && Intrinsics.areEqual((Object) this.f5290n, (Object) this.f5288l)) {
            return t;
        }
        C1997o oVar = (C1997o) this.f5277a.mo6792a().invoke(t);
        int b = oVar.mo6867b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            if (oVar.mo6866a(i) < this.f5289m.mo6866a(i) || oVar.mo6866a(i) > this.f5290n.mo6866a(i)) {
                oVar.mo6870e(i, C11479u.m44331H(oVar.mo6866a(i), this.f5289m.mo6866a(i), this.f5290n.mo6866a(i)));
                z = true;
            }
        }
        if (z) {
            return this.f5277a.mo6793b().invoke(oVar);
        }
        return t;
    }

    /* renamed from: l */
    public final V mo6604l(T t, float f) {
        V v = (C1997o) this.f5277a.mo6792a().invoke(t);
        int b = v.mo6867b();
        for (int i = 0; i < b; i++) {
            v.mo6870e(i, f);
        }
        return v;
    }

    /* renamed from: m */
    public final void mo6605m() {
        C1976i<T, V> iVar = this.f5280d;
        iVar.mo6849k().mo6869d();
        iVar.mo6852n(Long.MIN_VALUE);
        mo6618z(false);
    }

    @C12579k
    /* renamed from: n */
    public final C2014v0<T> mo6606n() {
        return this.f5286j;
    }

    @C12579k
    /* renamed from: o */
    public final C1976i<T, V> mo6607o() {
        return this.f5280d;
    }

    @C12579k
    /* renamed from: p */
    public final String mo6608p() {
        return this.f5279c;
    }

    @C12580l
    /* renamed from: q */
    public final T mo6609q() {
        return this.f5283g;
    }

    /* renamed from: r */
    public final T mo6610r() {
        return this.f5282f.getValue();
    }

    @C12579k
    /* renamed from: s */
    public final C1945a1<T, V> mo6611s() {
        return this.f5277a;
    }

    @C12580l
    /* renamed from: t */
    public final T mo6612t() {
        return this.f5284h;
    }

    /* renamed from: u */
    public final T mo6613u() {
        return this.f5280d.getValue();
    }

    /* renamed from: v */
    public final T mo6614v() {
        return this.f5277a.mo6793b().invoke(mo6615w());
    }

    @C12579k
    /* renamed from: w */
    public final V mo6615w() {
        return this.f5280d.mo6849k();
    }

    /* renamed from: x */
    public final boolean mo6616x() {
        return ((Boolean) this.f5281e.getValue()).booleanValue();
    }

    /* renamed from: y */
    public final Object mo6617y(C1950c<T, V> cVar, T t, C11300l<? super Animatable<T, V>, C11079d2> lVar, C11045c<? super C1960e<T, V>> cVar2) {
        return MutatorMutex.m8048e(this.f5285i, (MutatePriority) null, new Animatable$runAnimation$2(this, t, cVar, this.f5280d.mo6846g(), lVar, (C11045c<? super Animatable$runAnimation$2>) null), cVar2, 1, (Object) null);
    }

    /* renamed from: z */
    public final void mo6618z(boolean z) {
        this.f5281e.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, C1945a1 a1Var, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, a1Var, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, C1945a1 a1Var, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, a1Var, (i & 4) != 0 ? null : obj2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(level = DeprecationLevel.f28051c, message = "Maintained for binary compatibility", replaceWith = @C11587t0(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, C1945a1 a1Var, Object obj2) {
        this(obj, a1Var, obj2, "Animatable");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
    }
}
