package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.z0 */
public final class C12035z0 {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final CoroutineContext f29663a;
    @C12579k

    /* renamed from: b */
    public final Object[] f29664b;
    @C12579k

    /* renamed from: c */
    public final C11726c3<Object>[] f29665c;

    /* renamed from: d */
    public int f29666d;

    public C12035z0(@C12579k CoroutineContext coroutineContext, int i) {
        this.f29663a = coroutineContext;
        this.f29664b = new Object[i];
        this.f29665c = new C11726c3[i];
    }

    /* renamed from: a */
    public final void mo24467a(@C12579k C11726c3<?> c3Var, @C12580l Object obj) {
        Object[] objArr = this.f29664b;
        int i = this.f29666d;
        objArr[i] = obj;
        C11726c3<Object>[] c3VarArr = this.f29665c;
        this.f29666d = i + 1;
        Intrinsics.checkNotNull(c3Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        c3VarArr[i] = c3Var;
    }

    /* renamed from: b */
    public final void mo24468b(@C12579k CoroutineContext coroutineContext) {
        int length = this.f29665c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C11726c3<Object> c3Var = this.f29665c[length];
                Intrinsics.checkNotNull(c3Var);
                c3Var.mo15332F(coroutineContext, this.f29664b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
