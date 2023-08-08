package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"R", "", "it", "a", "(J)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2\n*L\n1#1,120:1\n*E\n"})
public final class MonotonicFrameClockKt$withFrameMillis$2 extends Lambda implements C11300l<Long, R> {
    final /* synthetic */ C11300l<Long, R> $onFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonotonicFrameClockKt$withFrameMillis$2(C11300l<? super Long, ? extends R> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    /* renamed from: a */
    public final R mo15144a(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo15144a(((Number) obj).longValue());
    }
}
