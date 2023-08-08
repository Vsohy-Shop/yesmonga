package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n76#2:344\n102#2,2:345\n76#2:347\n102#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
/* renamed from: androidx.compose.animation.core.f */
public final class C1964f<T, V extends C1997o> {

    /* renamed from: j */
    public static final int f5478j = 8;
    @C12579k

    /* renamed from: a */
    public final C1945a1<T, V> f5479a;

    /* renamed from: b */
    public final T f5480b;

    /* renamed from: c */
    public final long f5481c;
    @C12579k

    /* renamed from: d */
    public final C11289a<C11079d2> f5482d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f5483e;
    @C12579k

    /* renamed from: f */
    public V f5484f;

    /* renamed from: g */
    public long f5485g;

    /* renamed from: h */
    public long f5486h = Long.MIN_VALUE;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f5487i;

    public C1964f(T t, @C12579k C1945a1<T, V> a1Var, @C12579k V v, long j, T t2, long j2, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        Intrinsics.checkNotNullParameter(v, "initialVelocityVector");
        Intrinsics.checkNotNullParameter(aVar, "onCancel");
        this.f5479a = a1Var;
        this.f5480b = t2;
        this.f5481c = j2;
        this.f5482d = aVar;
        this.f5483e = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
        this.f5484f = C2000p.m8569e(v);
        this.f5485g = j;
        this.f5487i = C8539f2.m30981g(Boolean.valueOf(z), (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public final void mo6822a() {
        mo6834m(false);
        this.f5482d.invoke();
    }

    /* renamed from: b */
    public final long mo6823b() {
        return this.f5486h;
    }

    /* renamed from: c */
    public final long mo6824c() {
        return this.f5485g;
    }

    /* renamed from: d */
    public final long mo6825d() {
        return this.f5481c;
    }

    /* renamed from: e */
    public final T mo6826e() {
        return this.f5480b;
    }

    @C12579k
    /* renamed from: f */
    public final C1945a1<T, V> mo6827f() {
        return this.f5479a;
    }

    /* renamed from: g */
    public final T mo6828g() {
        return this.f5483e.getValue();
    }

    /* renamed from: h */
    public final T mo6829h() {
        return this.f5479a.mo6793b().invoke(this.f5484f);
    }

    @C12579k
    /* renamed from: i */
    public final V mo6830i() {
        return this.f5484f;
    }

    /* renamed from: j */
    public final boolean mo6831j() {
        return ((Boolean) this.f5487i.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final void mo6832k(long j) {
        this.f5486h = j;
    }

    /* renamed from: l */
    public final void mo6833l(long j) {
        this.f5485g = j;
    }

    /* renamed from: m */
    public final void mo6834m(boolean z) {
        this.f5487i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: n */
    public final void mo6835n(T t) {
        this.f5483e.setValue(t);
    }

    /* renamed from: o */
    public final void mo6836o(@C12579k V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.f5484f = v;
    }

    @C12579k
    /* renamed from: p */
    public final C1976i<T, V> mo6837p() {
        return new C1976i(this.f5479a, mo6828g(), this.f5484f, this.f5485g, this.f5486h, mo6831j());
    }
}
