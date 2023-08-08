package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"T", "Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$trySnapTo$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$trySnapTo$1(SwipeableV2State<T> swipeableV2State, T t) {
        super(0);
        this.this$0 = swipeableV2State;
        this.$targetValue = t;
    }

    public final void invoke() {
        this.this$0.mo12101M(this.$targetValue);
    }
}
