package kotlinx.coroutines.internal;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.C12177y1;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.internal.p0 */
public final class C12011p0 {
    @C12177y1
    /* renamed from: a */
    public static /* synthetic */ void m47929a() {
    }

    @C12177y1
    /* renamed from: b */
    public static final <T> T m47930b(@C12579k Object obj, @C12579k C11289a<? extends T> aVar) {
        T invoke;
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        return invoke;
    }
}
