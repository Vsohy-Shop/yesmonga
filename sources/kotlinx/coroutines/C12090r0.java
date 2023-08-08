package kotlinx.coroutines;

import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.internal.C12000k;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* renamed from: kotlinx.coroutines.r0 */
public final class C12090r0 {
    @C12579k
    /* renamed from: a */
    public static final String m48300a(@C12579k Object obj) {
        return obj.getClass().getSimpleName();
    }

    @C12579k
    /* renamed from: b */
    public static final String m48301b(@C12579k Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @C12579k
    /* renamed from: c */
    public static final String m48302c(@C12579k C11045c<?> cVar) {
        Object obj;
        if (cVar instanceof C12000k) {
            return cVar.toString();
        }
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(cVar + '@' + m48301b(cVar));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        Throwable e = Result.m38705e(obj);
        String str = obj;
        if (e != null) {
            str = cVar.getClass().getName() + '@' + m48301b(cVar);
        }
        return (String) str;
    }
}
