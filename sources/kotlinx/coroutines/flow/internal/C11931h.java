package kotlinx.coroutines.flow.internal;

import kotlin.C11532s0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.flow.internal.h */
public final class C11931h {
    @C11532s0
    /* renamed from: a */
    public static final int m47596a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    /* renamed from: b */
    public static final void m47597b(@C12579k AbortFlowException abortFlowException, @C12579k C11908f<?> fVar) {
        if (abortFlowException.f29469a != fVar) {
            throw abortFlowException;
        }
    }
}
