package kotlinx.coroutines.sync;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends FunctionReferenceImpl implements C11304p<Long, C12142c, C12142c> {

    /* renamed from: a */
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 f29923a = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    public SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @C12579k
    /* renamed from: d */
    public final C12142c mo24770d(long j, @C12580l C12142c cVar) {
        return SemaphoreKt.m48638j(j, cVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo24770d(((Number) obj).longValue(), (C12142c) obj2);
    }
}
