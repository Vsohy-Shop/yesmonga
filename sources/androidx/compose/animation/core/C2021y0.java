package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.y0 */
public final class C2021y0<T, V extends C1997o> implements C1950c<T, V> {

    /* renamed from: j */
    public static final int f5643j = 0;
    @C12579k

    /* renamed from: a */
    public final C1953c1<V> f5644a;
    @C12579k

    /* renamed from: b */
    public final C1945a1<T, V> f5645b;

    /* renamed from: c */
    public final T f5646c;

    /* renamed from: d */
    public final T f5647d;
    @C12579k

    /* renamed from: e */
    public final V f5648e;
    @C12579k

    /* renamed from: f */
    public final V f5649f;
    @C12579k

    /* renamed from: g */
    public final V f5650g;

    /* renamed from: h */
    public final long f5651h;
    @C12579k

    /* renamed from: i */
    public final V f5652i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003b, code lost:
        r7 = androidx.compose.animation.core.C2000p.m8569e(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2021y0(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1953c1<V> r3, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1945a1<T, V> r4, T r5, T r6, @org.jetbrains.annotations.C12580l V r7) {
        /*
            r2 = this;
            java.lang.String r0 = "animationSpec"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.<init>()
            r2.f5644a = r3
            r2.f5645b = r4
            r2.f5646c = r5
            r2.f5647d = r6
            androidx.compose.animation.core.a1 r4 = r2.mo6798e()
            kotlin.jvm.functions.l r4 = r4.mo6792a()
            java.lang.Object r4 = r4.invoke(r5)
            androidx.compose.animation.core.o r4 = (androidx.compose.animation.core.C1997o) r4
            r2.f5648e = r4
            androidx.compose.animation.core.a1 r6 = r2.mo6798e()
            kotlin.jvm.functions.l r6 = r6.mo6792a()
            java.lang.Object r0 = r2.mo6800g()
            java.lang.Object r6 = r6.invoke(r0)
            androidx.compose.animation.core.o r6 = (androidx.compose.animation.core.C1997o) r6
            r2.f5649f = r6
            if (r7 == 0) goto L_0x0041
            androidx.compose.animation.core.o r7 = androidx.compose.animation.core.C2000p.m8569e(r7)
            if (r7 != 0) goto L_0x0053
        L_0x0041:
            androidx.compose.animation.core.a1 r7 = r2.mo6798e()
            kotlin.jvm.functions.l r7 = r7.mo6792a()
            java.lang.Object r5 = r7.invoke(r5)
            androidx.compose.animation.core.o r5 = (androidx.compose.animation.core.C1997o) r5
            androidx.compose.animation.core.o r7 = androidx.compose.animation.core.C2000p.m8571g(r5)
        L_0x0053:
            r2.f5650g = r7
            long r0 = r3.mo6802b(r4, r6, r7)
            r2.f5651h = r0
            androidx.compose.animation.core.o r3 = r3.mo6803f(r4, r6, r7)
            r2.f5652i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C2021y0.<init>(androidx.compose.animation.core.c1, androidx.compose.animation.core.a1, java.lang.Object, java.lang.Object, androidx.compose.animation.core.o):void");
    }

    /* renamed from: a */
    public boolean mo6794a() {
        return this.f5644a.mo6801a();
    }

    @C12579k
    /* renamed from: b */
    public V mo6795b(long j) {
        if (mo6796c(j)) {
            return this.f5652i;
        }
        return this.f5644a.mo6804j(j, this.f5648e, this.f5649f, this.f5650g);
    }

    /* renamed from: d */
    public long mo6797d() {
        return this.f5651h;
    }

    @C12579k
    /* renamed from: e */
    public C1945a1<T, V> mo6798e() {
        return this.f5645b;
    }

    /* renamed from: f */
    public T mo6799f(long j) {
        if (mo6796c(j)) {
            return mo6800g();
        }
        V m = this.f5644a.mo6805m(j, this.f5648e, this.f5649f, this.f5650g);
        int b = m.mo6867b();
        int i = 0;
        while (i < b) {
            if (!Float.isNaN(m.mo6866a(i))) {
                i++;
            } else {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + m + ". Animation: " + this + ", playTimeNanos: " + j).toString());
            }
        }
        return mo6798e().mo6793b().invoke(m);
    }

    /* renamed from: g */
    public T mo6800g() {
        return this.f5647d;
    }

    @C12579k
    /* renamed from: i */
    public final C1953c1<V> mo7007i() {
        return this.f5644a;
    }

    /* renamed from: j */
    public final T mo7008j() {
        return this.f5646c;
    }

    @C12579k
    public String toString() {
        return "TargetBasedAnimation: " + this.f5646c + " -> " + mo6800g() + ",initial velocity: " + this.f5650g + ", duration: " + AnimationKt.m7994e(this) + " ms,animationSpec: " + this.f5644a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2021y0(C1953c1 c1Var, C1945a1 a1Var, Object obj, Object obj2, C1997o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, a1Var, obj, obj2, (i & 16) != 0 ? null : oVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2021y0(C1968g gVar, C1945a1 a1Var, Object obj, Object obj2, C1997o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, a1Var, obj, obj2, (i & 16) != 0 ? null : oVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2021y0(@C12579k C1968g<T> gVar, @C12579k C1945a1<T, V> a1Var, T t, T t2, @C12580l V v) {
        this(gVar.mo6806a(a1Var), a1Var, t, t2, v);
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
    }
}
