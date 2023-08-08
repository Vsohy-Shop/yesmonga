package kotlinx.coroutines.internal;

import kotlin.C11079d2;
import kotlin.C11414o;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12051l0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"})
public final class OnUndeliveredElementKt {
    @C12579k
    /* renamed from: a */
    public static final <E> C11300l<Throwable, C11079d2> m47762a(@C12579k C11300l<? super E, C11079d2> lVar, E e, @C12579k CoroutineContext coroutineContext) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> void m47763b(@C12579k C11300l<? super E, C11079d2> lVar, E e, @C12579k CoroutineContext coroutineContext) {
        UndeliveredElementException c = m47764c(lVar, e, (UndeliveredElementException) null);
        if (c != null) {
            C12051l0.m48104b(coroutineContext, c);
        }
    }

    @C12580l
    /* renamed from: c */
    public static final <E> UndeliveredElementException m47764c(@C12579k C11300l<? super E, C11079d2> lVar, E e, @C12580l UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            C11414o.m43942a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m47765d(C11300l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return m47764c(lVar, obj, undeliveredElementException);
    }
}
