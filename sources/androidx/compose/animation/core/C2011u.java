package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.u */
public final class C2011u<T, V extends C1997o> implements C1950c<T, V> {

    /* renamed from: j */
    public static final int f5621j = 0;
    @C12579k

    /* renamed from: a */
    public final C1963e1<V> f5622a;
    @C12579k

    /* renamed from: b */
    public final C1945a1<T, V> f5623b;

    /* renamed from: c */
    public final T f5624c;
    @C12579k

    /* renamed from: d */
    public final V f5625d;
    @C12579k

    /* renamed from: e */
    public final V f5626e;
    @C12579k

    /* renamed from: f */
    public final V f5627f;

    /* renamed from: g */
    public final T f5628g;

    /* renamed from: h */
    public final long f5629h;

    /* renamed from: i */
    public final boolean f5630i;

    public C2011u(@C12579k C1963e1<V> e1Var, @C12579k C1945a1<T, V> a1Var, T t, @C12579k V v) {
        Intrinsics.checkNotNullParameter(e1Var, "animationSpec");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        Intrinsics.checkNotNullParameter(v, "initialVelocityVector");
        this.f5622a = e1Var;
        this.f5623b = a1Var;
        this.f5624c = t;
        V v2 = (C1997o) mo6798e().mo6792a().invoke(t);
        this.f5625d = v2;
        this.f5626e = C2000p.m8569e(v);
        this.f5628g = mo6798e().mo6793b().invoke(e1Var.mo6820d(v2, v));
        this.f5629h = e1Var.mo6819c(v2, v);
        V e = C2000p.m8569e(e1Var.mo6818b(mo6797d(), v2, v));
        this.f5627f = e;
        int b = e.mo6867b();
        for (int i = 0; i < b; i++) {
            V v3 = this.f5627f;
            v3.mo6870e(i, C11479u.m44331H(v3.mo6866a(i), -this.f5622a.mo6817a(), this.f5622a.mo6817a()));
        }
    }

    /* renamed from: a */
    public boolean mo6794a() {
        return this.f5630i;
    }

    @C12579k
    /* renamed from: b */
    public V mo6795b(long j) {
        if (!mo6796c(j)) {
            return this.f5622a.mo6818b(j, this.f5625d, this.f5626e);
        }
        return this.f5627f;
    }

    /* renamed from: d */
    public long mo6797d() {
        return this.f5629h;
    }

    @C12579k
    /* renamed from: e */
    public C1945a1<T, V> mo6798e() {
        return this.f5623b;
    }

    /* renamed from: f */
    public T mo6799f(long j) {
        if (!mo6796c(j)) {
            return mo6798e().mo6793b().invoke(this.f5622a.mo6821e(j, this.f5625d, this.f5626e));
        }
        return mo6800g();
    }

    /* renamed from: g */
    public T mo6800g() {
        return this.f5628g;
    }

    /* renamed from: i */
    public final T mo6988i() {
        return this.f5624c;
    }

    @C12579k
    /* renamed from: j */
    public final V mo6989j() {
        return this.f5626e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2011u(@C12579k C2013v<T> vVar, @C12579k C1945a1<T, V> a1Var, T t, @C12579k V v) {
        this(vVar.mo6990a(a1Var), a1Var, t, v);
        Intrinsics.checkNotNullParameter(vVar, "animationSpec");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
        Intrinsics.checkNotNullParameter(v, "initialVelocityVector");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2011u(@C12579k C2013v<T> vVar, @C12579k C1945a1<T, V> a1Var, T t, T t2) {
        this(vVar.mo6990a(a1Var), a1Var, t, (C1997o) a1Var.mo6792a().invoke(t2));
        Intrinsics.checkNotNullParameter(vVar, "animationSpec");
        Intrinsics.checkNotNullParameter(a1Var, "typeConverter");
    }
}
