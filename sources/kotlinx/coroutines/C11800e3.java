package kotlinx.coroutines;

import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.internal.C12026w0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* renamed from: kotlinx.coroutines.e3 */
public final class C11800e3 {
    @C12579k

    /* renamed from: a */
    public static final C11800e3 f29268a = new C11800e3();
    @C12579k

    /* renamed from: b */
    public static final ThreadLocal<C12047k1> f29269b = C12026w0.m47994b(new C12009o0("ThreadLocalEventLoop"));

    @C12580l
    /* renamed from: a */
    public final C12047k1 mo24075a() {
        return f29269b.get();
    }

    @C12579k
    /* renamed from: b */
    public final C12047k1 mo24076b() {
        ThreadLocal<C12047k1> threadLocal = f29269b;
        C12047k1 k1Var = threadLocal.get();
        if (k1Var != null) {
            return k1Var;
        }
        C12047k1 a = C12069n1.m48160a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo24077c() {
        f29269b.set((Object) null);
    }

    /* renamed from: d */
    public final void mo24078d(@C12579k C12047k1 k1Var) {
        f29269b.set(k1Var);
    }
}
