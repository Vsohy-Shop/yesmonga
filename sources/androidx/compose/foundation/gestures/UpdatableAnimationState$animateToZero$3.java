package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1983k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "frameTime", "Lkotlin/d2;", "a", "(J)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class UpdatableAnimationState$animateToZero$3 extends Lambda implements C11300l<Long, C11079d2> {
    final /* synthetic */ C11300l<Float, C11079d2> $beforeFrame;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$3(UpdatableAnimationState updatableAnimationState, float f, C11300l<? super Float, C11079d2> lVar) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = lVar;
    }

    /* renamed from: a */
    public final void mo7531a(long j) {
        boolean z;
        long j2;
        if (this.this$0.f5917a == Long.MIN_VALUE) {
            this.this$0.f5917a = j;
        }
        C1983k kVar = new C1983k(this.this$0.mo7526i());
        if (this.$durationScale == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 = UpdatableAnimationState.f5913e.mo7528a().mo6802b(new C1983k(this.this$0.mo7526i()), UpdatableAnimationState.f5913e.mo7529b(), this.this$0.f5918b);
        } else {
            j2 = C11409d.m43855N0(((float) (j - this.this$0.f5917a)) / this.$durationScale);
        }
        long j3 = j2;
        C1983k kVar2 = kVar;
        float f = UpdatableAnimationState.f5913e.mo7528a().mo6805m(j3, kVar2, UpdatableAnimationState.f5913e.mo7529b(), this.this$0.f5918b).mo6872f();
        this.this$0.f5918b = UpdatableAnimationState.f5913e.mo7528a().mo6804j(j3, kVar2, UpdatableAnimationState.f5913e.mo7529b(), this.this$0.f5918b);
        this.this$0.f5917a = j;
        this.this$0.mo7527j(f);
        this.$beforeFrame.invoke(Float.valueOf(this.this$0.mo7526i() - f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7531a(((Number) obj).longValue());
        return C11079d2.f28267a;
    }
}
