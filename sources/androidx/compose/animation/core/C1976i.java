package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n76#2:344\n102#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
/* renamed from: androidx.compose.animation.core.i */
public final class C1976i<T, V extends C1997o> implements C8578k2<T> {

    /* renamed from: g */
    public static final int f5498g = 0;
    @C12579k

    /* renamed from: a */
    public final C1945a1<T, V> f5499a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f5500b;
    @C12579k

    /* renamed from: c */
    public V f5501c;

    /* renamed from: d */
    public long f5502d;

    /* renamed from: e */
    public long f5503e;

    /* renamed from: f */
    public boolean f5504f;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r5 = androidx.compose.animation.core.C2000p.m8569e(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1976i(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1945a1<T, V> r3, T r4, @org.jetbrains.annotations.C12580l V r5, long r6, long r8, boolean r10) {
        /*
            r2 = this;
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r2.f5499a = r3
            r0 = 0
            r1 = 2
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r4, r0, r1, r0)
            r2.f5500b = r0
            if (r5 == 0) goto L_0x001a
            androidx.compose.animation.core.o r5 = androidx.compose.animation.core.C2000p.m8569e(r5)
            if (r5 != 0) goto L_0x001e
        L_0x001a:
            androidx.compose.animation.core.o r5 = androidx.compose.animation.core.C1980j.m8434i(r3, r4)
        L_0x001e:
            r2.f5501c = r5
            r2.f5502d = r6
            r2.f5503e = r8
            r2.f5504f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C1976i.<init>(androidx.compose.animation.core.a1, java.lang.Object, androidx.compose.animation.core.o, long, long, boolean):void");
    }

    /* renamed from: e */
    public final long mo6845e() {
        return this.f5503e;
    }

    /* renamed from: g */
    public final long mo6846g() {
        return this.f5502d;
    }

    public T getValue() {
        return this.f5500b.getValue();
    }

    @C12579k
    /* renamed from: h */
    public final C1945a1<T, V> mo6847h() {
        return this.f5499a;
    }

    /* renamed from: i */
    public final T mo6848i() {
        return this.f5499a.mo6793b().invoke(this.f5501c);
    }

    @C12579k
    /* renamed from: k */
    public final V mo6849k() {
        return this.f5501c;
    }

    /* renamed from: l */
    public final boolean mo6850l() {
        return this.f5504f;
    }

    /* renamed from: m */
    public final void mo6851m(long j) {
        this.f5503e = j;
    }

    /* renamed from: n */
    public final void mo6852n(long j) {
        this.f5502d = j;
    }

    /* renamed from: o */
    public final void mo6853o(boolean z) {
        this.f5504f = z;
    }

    /* renamed from: p */
    public void mo6854p(T t) {
        this.f5500b.setValue(t);
    }

    /* renamed from: q */
    public final void mo6855q(@C12579k V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.f5501c = v;
    }

    @C12579k
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + mo6848i() + ", isRunning=" + this.f5504f + ", lastFrameTimeNanos=" + this.f5502d + ", finishedTimeNanos=" + this.f5503e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1976i(C1945a1 a1Var, Object obj, C1997o oVar, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(a1Var, obj, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
