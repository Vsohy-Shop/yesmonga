package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.d */
public final class C11986d {
    @C12580l

    /* renamed from: a */
    public static final Method f29584a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f29584a = method;
    }

    /* renamed from: a */
    public static /* synthetic */ void m47798a() {
    }

    @C12579k
    /* renamed from: b */
    public static final <E> Set<E> m47799b(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    /* renamed from: c */
    public static final boolean m47800c(@C12579k Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null || (method = f29584a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static final <T> T m47801d(@C12579k ReentrantLock reentrantLock, @C12579k C11289a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            reentrantLock.unlock();
            C11322b0.m43480c(1);
        }
    }
}
