package androidx.compose.material3;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material3.q0 */
public final class C8267q0<T> {

    /* renamed from: a */
    public final T f20421a;
    @C12579k

    /* renamed from: b */
    public final C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> f20422b;

    public C8267q0(T t, @C12579k C11305q<? super C11304p<? super C8592o, ? super Integer, C11079d2>, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, C0508a.f1295O0);
        this.f20421a = t;
        this.f20422b = qVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C8267q0 m27473d(C8267q0 q0Var, T t, C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            t = q0Var.f20421a;
        }
        if ((i & 2) != 0) {
            qVar = q0Var.f20422b;
        }
        return q0Var.mo12927c(t, qVar);
    }

    /* renamed from: a */
    public final T mo12925a() {
        return this.f20421a;
    }

    @C12579k
    /* renamed from: b */
    public final C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> mo12926b() {
        return this.f20422b;
    }

    @C12579k
    /* renamed from: c */
    public final C8267q0<T> mo12927c(T t, @C12579k C11305q<? super C11304p<? super C8592o, ? super Integer, C11079d2>, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, C0508a.f1295O0);
        return new C8267q0<>(t, qVar);
    }

    /* renamed from: e */
    public final T mo12928e() {
        return this.f20421a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8267q0)) {
            return false;
        }
        C8267q0 q0Var = (C8267q0) obj;
        return Intrinsics.areEqual((Object) this.f20421a, (Object) q0Var.f20421a) && Intrinsics.areEqual((Object) this.f20422b, (Object) q0Var.f20422b);
    }

    @C12579k
    /* renamed from: f */
    public final C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> mo12930f() {
        return this.f20422b;
    }

    public int hashCode() {
        T t = this.f20421a;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.f20422b.hashCode();
    }

    @C12579k
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f20421a + ", transition=" + this.f20422b + ')';
    }
}
