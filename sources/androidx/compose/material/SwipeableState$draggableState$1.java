package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "it", "Lkotlin/d2;", "a", "(F)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableState$draggableState$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    /* renamed from: a */
    public final void mo10530a(float f) {
        float f2;
        float floatValue = ((Number) this.this$0.f7881g.getValue()).floatValue() + f;
        float H = C11479u.m44331H(floatValue, this.this$0.mo10517u(), this.this$0.mo10516t());
        float f3 = floatValue - H;
        C3033c1 z = this.this$0.mo10521z();
        if (z != null) {
            f2 = z.mo10727a(f3);
        } else {
            f2 = 0.0f;
        }
        this.this$0.f7879e.setValue(Float.valueOf(H + f2));
        this.this$0.f7880f.setValue(Float.valueOf(f3));
        this.this$0.f7881g.setValue(Float.valueOf(floatValue));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10530a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
