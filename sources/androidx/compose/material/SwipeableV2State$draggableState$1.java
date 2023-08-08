package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "it", "Lkotlin/d2;", "a", "(F)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$draggableState$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$draggableState$1(SwipeableV2State<T> swipeableV2State) {
        super(1);
        this.this$0 = swipeableV2State;
    }

    /* renamed from: a */
    public final void mo10581a(float f) {
        SwipeableV2State<T> swipeableV2State = this.this$0;
        Float t = swipeableV2State.mo10568t();
        swipeableV2State.mo10551H(Float.valueOf(C11479u.m44331H((t != null ? t.floatValue() : 0.0f) + f, this.this$0.mo10567s(), this.this$0.mo10566r())));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10581a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
