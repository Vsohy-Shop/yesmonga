package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"R", "T", "Landroidx/compose/animation/core/o;", "V", "", "it", "a", "(J)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements C11300l<Long, R> {
    final /* synthetic */ C11300l<Long, R> $onFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$callWithFrameNanos$2(C11300l<? super Long, ? extends R> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    /* renamed from: a */
    public final R mo6683a(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / 1));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6683a(((Number) obj).longValue());
    }
}
