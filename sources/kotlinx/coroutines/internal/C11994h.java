package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.jvm.internal.C11363r0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.C12044k0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.h */
public final class C11994h {
    @C12579k

    /* renamed from: a */
    public static final Collection<C12044k0> f29596a;

    static {
        Class<C12044k0> cls = C12044k0.class;
        f29596a = SequencesKt___SequencesKt.m44731c3(SequencesKt__SequencesKt.m44588e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m47839a(@C12579k C12044k0 k0Var) {
        if (!f29596a.contains(k0Var)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader".toString());
        }
    }

    @C12579k
    /* renamed from: b */
    public static final Collection<C12044k0> m47840b() {
        return f29596a;
    }

    /* renamed from: c */
    public static final void m47841c(@C12579k Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
