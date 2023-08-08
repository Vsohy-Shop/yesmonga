package kotlinx.coroutines;

import kotlin.coroutines.C11043a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.n0 */
public final class C12067n0 extends C11043a {
    @C12579k

    /* renamed from: c */
    public static final C12068a f29709c = new C12068a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public final String f29710b;

    /* renamed from: kotlinx.coroutines.n0$a */
    public static final class C12068a implements CoroutineContext.C11042b<C12067n0> {
        public /* synthetic */ C12068a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C12068a() {
        }
    }

    public C12067n0(@C12579k String str) {
        super(f29709c);
        this.f29710b = str;
    }

    /* renamed from: U */
    public static /* synthetic */ C12067n0 m48156U(C12067n0 n0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = n0Var.f29710b;
        }
        return n0Var.mo24523T(str);
    }

    @C12579k
    /* renamed from: O */
    public final String mo24522O() {
        return this.f29710b;
    }

    @C12579k
    /* renamed from: T */
    public final C12067n0 mo24523T(@C12579k String str) {
        return new C12067n0(str);
    }

    @C12579k
    /* renamed from: V */
    public final String mo24524V() {
        return this.f29710b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12067n0) && Intrinsics.areEqual((Object) this.f29710b, (Object) ((C12067n0) obj).f29710b);
    }

    public int hashCode() {
        return this.f29710b.hashCode();
    }

    @C12579k
    public String toString() {
        return "CoroutineName(" + this.f29710b + ')';
    }
}
