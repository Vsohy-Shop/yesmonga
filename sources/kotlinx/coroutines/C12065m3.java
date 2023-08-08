package kotlinx.coroutines;

import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.internal.C12001k0;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,314:1\n1#2:315\n107#3,13:316\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:316,13\n*E\n"})
/* renamed from: kotlinx.coroutines.m3 */
public final class C12065m3<T> extends C12001k0<T> {
    @C12579k

    /* renamed from: e */
    public final ThreadLocal<Pair<CoroutineContext, Object>> f29708e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12065m3(@org.jetbrains.annotations.C12579k kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.n3 r0 = kotlinx.coroutines.C12071n3.f29711a
            kotlin.coroutines.CoroutineContext$a r1 = r3.mo7444b(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r3.mo7443Q(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f29708e = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            kotlin.coroutines.d$b r0 = kotlin.coroutines.C11047d.f28247u0
            kotlin.coroutines.CoroutineContext$a r4 = r4.mo7444b(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.m47768c(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.m47766a(r3, r4)
            r2.mo24521T1(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12065m3.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.c):void");
    }

    /* renamed from: N1 */
    public void mo23692N1(@C12580l Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = this.f29708e.get();
            if (pair != null) {
                ThreadContextKt.m47766a((CoroutineContext) pair.mo21846a(), pair.mo21847b());
            }
            this.f29708e.remove();
        }
        Object a = C11966h0.m47674a(obj, this.f29603d);
        C11045c<T> cVar = this.f29603d;
        CoroutineContext context = cVar.getContext();
        C12065m3<?> m3Var = null;
        Object c = ThreadContextKt.m47768c(context, m3Var);
        if (c != ThreadContextKt.f29563a) {
            m3Var = CoroutineContextKt.m45903g(cVar, context, c);
        }
        try {
            this.f29603d.resumeWith(a);
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            if (m3Var == null || m3Var.mo24520S1()) {
                ThreadContextKt.m47766a(context, c);
            }
        }
    }

    /* renamed from: S1 */
    public final boolean mo24520S1() {
        boolean z;
        if (!this.threadLocalIsSet || this.f29708e.get() != null) {
            z = false;
        } else {
            z = true;
        }
        this.f29708e.remove();
        return !z;
    }

    /* renamed from: T1 */
    public final void mo24521T1(@C12579k CoroutineContext coroutineContext, @C12580l Object obj) {
        this.threadLocalIsSet = true;
        this.f29708e.set(C11078d1.m42659a(coroutineContext, obj));
    }
}
