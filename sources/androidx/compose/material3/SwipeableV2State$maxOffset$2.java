package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"T", "", "a", "()Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$maxOffset$2 extends Lambda implements C11289a<Float> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$maxOffset$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        Float b = SwipeableV2Kt.m26467h(this.this$0.mo12109m());
        return Float.valueOf(b != null ? b.floatValue() : Float.POSITIVE_INFINITY);
    }
}
