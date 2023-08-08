package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeableV2State$targetValue$2 extends Lambda implements C11289a<T> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$targetValue$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    public final T invoke() {
        T b = this.this$0.mo12111o();
        if (b != null) {
            return b;
        }
        SwipeableV2State<T> swipeableV2State = this.this$0;
        Float v = swipeableV2State.mo12118v();
        if (v != null) {
            return swipeableV2State.mo12107k(v.floatValue(), swipeableV2State.mo12113q(), 0.0f);
        }
        return swipeableV2State.mo12113q();
    }
}
