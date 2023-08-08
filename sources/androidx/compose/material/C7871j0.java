package androidx.compose.material;

import androidx.appcompat.graphics.drawable.C0508a;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material.j0 */
public final class C7871j0<T> {

    /* renamed from: a */
    public final T f18855a;
    @C12579k

    /* renamed from: b */
    public final C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> f18856b;

    public C7871j0(T t, @C12579k C11305q<? super C11304p<? super C8592o, ? super Integer, C11079d2>, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, C0508a.f1295O0);
        this.f18855a = t;
        this.f18856b = qVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C7871j0 m25016d(C7871j0 j0Var, T t, C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            t = j0Var.f18855a;
        }
        if ((i & 2) != 0) {
            qVar = j0Var.f18856b;
        }
        return j0Var.mo10843c(t, qVar);
    }

    /* renamed from: a */
    public final T mo10841a() {
        return this.f18855a;
    }

    @C12579k
    /* renamed from: b */
    public final C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> mo10842b() {
        return this.f18856b;
    }

    @C12579k
    /* renamed from: c */
    public final C7871j0<T> mo10843c(T t, @C12579k C11305q<? super C11304p<? super C8592o, ? super Integer, C11079d2>, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, C0508a.f1295O0);
        return new C7871j0<>(t, qVar);
    }

    /* renamed from: e */
    public final T mo10844e() {
        return this.f18855a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7871j0)) {
            return false;
        }
        C7871j0 j0Var = (C7871j0) obj;
        return Intrinsics.areEqual((Object) this.f18855a, (Object) j0Var.f18855a) && Intrinsics.areEqual((Object) this.f18856b, (Object) j0Var.f18856b);
    }

    @C12579k
    /* renamed from: f */
    public final C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> mo10846f() {
        return this.f18856b;
    }

    public int hashCode() {
        T t = this.f18855a;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.f18856b.hashCode();
    }

    @C12579k
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f18855a + ", transition=" + this.f18856b + ')';
    }
}
