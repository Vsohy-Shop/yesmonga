package androidx.compose.runtime;

import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.runtime.u */
public abstract class C8682u<T> {

    /* renamed from: b */
    public static final int f23245b = 0;
    @C12579k

    /* renamed from: a */
    public final C8683u0<T> f23246a;

    public /* synthetic */ C8682u(C11289a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m31899b() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m31900d() {
    }

    @C11314h(name = "getCurrent")
    @C8540g
    @C8582l1
    /* renamed from: a */
    public final T mo16768a(@C12580l C8592o oVar, int i) {
        return oVar.mo15032w(this);
    }

    @C12579k
    /* renamed from: c */
    public final C8683u0<T> mo16769c() {
        return this.f23246a;
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public abstract C8578k2<T> mo16121e(T t, @C12580l C8592o oVar, int i);

    public C8682u(C11289a<? extends T> aVar) {
        this.f23246a = new C8683u0<>(aVar);
    }
}
