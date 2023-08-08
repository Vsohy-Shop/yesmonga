package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.d0 */
public final class C11767d0 {
    @C12580l
    @C11287e

    /* renamed from: a */
    public final Object f29184a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final C11300l<Throwable, C11079d2> f29185b;

    public C11767d0(@C12580l Object obj, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        this.f29184a = obj;
        this.f29185b = lVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C11767d0 m46775d(C11767d0 d0Var, Object obj, C11300l<Throwable, C11079d2> lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = d0Var.f29184a;
        }
        if ((i & 2) != 0) {
            lVar = d0Var.f29185b;
        }
        return d0Var.mo23951c(obj, lVar);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo23949a() {
        return this.f29184a;
    }

    @C12579k
    /* renamed from: b */
    public final C11300l<Throwable, C11079d2> mo23950b() {
        return this.f29185b;
    }

    @C12579k
    /* renamed from: c */
    public final C11767d0 mo23951c(@C12580l Object obj, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        return new C11767d0(obj, lVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11767d0)) {
            return false;
        }
        C11767d0 d0Var = (C11767d0) obj;
        return Intrinsics.areEqual(this.f29184a, d0Var.f29184a) && Intrinsics.areEqual((Object) this.f29185b, (Object) d0Var.f29185b);
    }

    public int hashCode() {
        Object obj = this.f29184a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f29185b.hashCode();
    }

    @C12579k
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f29184a + ", onCancellation=" + this.f29185b + ')';
    }
}
