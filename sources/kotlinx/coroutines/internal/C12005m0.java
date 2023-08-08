package kotlinx.coroutines.internal;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12003l0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11288f
/* renamed from: kotlinx.coroutines.internal.m0 */
public final class C12005m0<S extends C12003l0<S>> {
    @C12580l

    /* renamed from: a */
    public final Object f29610a;

    public /* synthetic */ C12005m0(Object obj) {
        this.f29610a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C12005m0 m47887a(Object obj) {
        return new C12005m0(obj);
    }

    @C12579k
    /* renamed from: b */
    public static <S extends C12003l0<S>> Object m47888b(@C12580l Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m47889c(Object obj, Object obj2) {
        return (obj2 instanceof C12005m0) && Intrinsics.areEqual(obj, ((C12005m0) obj2).mo24393j());
    }

    /* renamed from: d */
    public static final boolean m47890d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m47891e() {
    }

    @C12579k
    /* renamed from: f */
    public static final S m47892f(Object obj) {
        if (obj != C11988e.f29587b) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C12003l0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: g */
    public static int m47893g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m47894h(Object obj) {
        return obj == C11988e.f29587b;
    }

    /* renamed from: i */
    public static String m47895i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m47889c(this.f29610a, obj);
    }

    public int hashCode() {
        return m47893g(this.f29610a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo24393j() {
        return this.f29610a;
    }

    public String toString() {
        return m47895i(this.f29610a);
    }
}
