package androidx.compose.foundation.gestures;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "a", "(J)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class UpdatableAnimationState$animateToZero$4 extends Lambda implements C11300l<Long, C11079d2> {
    final /* synthetic */ C11300l<Float, C11079d2> $beforeFrame;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$4(UpdatableAnimationState updatableAnimationState, C11300l<? super Float, C11079d2> lVar) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$beforeFrame = lVar;
    }

    /* renamed from: a */
    public final void mo7532a(long j) {
        float i = this.this$0.mo7526i();
        this.this$0.mo7527j(0.0f);
        this.$beforeFrame.invoke(Float.valueOf(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7532a(((Number) obj).longValue());
        return C11079d2.f28267a;
    }
}
