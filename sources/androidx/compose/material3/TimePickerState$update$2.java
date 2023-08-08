package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1983k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.TimePickerState$update$2", mo22502f = "TimePicker.kt", mo22503i = {}, mo22504l = {571, 573}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TimePickerState$update$2 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $fromTap;
    final /* synthetic */ float $value;
    int label;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerState$update$2(TimePickerState timePickerState, float f, boolean z, C11045c<? super TimePickerState$update$2> cVar) {
        super(1, cVar);
        this.this$0 = timePickerState;
        this.$value = f;
        this.$fromTap = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new TimePickerState$update$2(this.this$0, this.$value, this.$fromTap, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (C8241l2.m27284f(this.this$0.mo12351l(), C8241l2.f20286b.mo12784a())) {
                TimePickerState timePickerState = this.this$0;
                timePickerState.mo12334A(((float) (timePickerState.mo12340G(this.$value) % 12)) * 0.5235988f);
            } else if (this.$fromTap) {
                TimePickerState timePickerState2 = this.this$0;
                timePickerState2.mo12337D(((float) (timePickerState2.mo12341H(this.$value) - (this.this$0.mo12341H(this.$value) % 5))) * 0.10471976f);
            } else {
                TimePickerState timePickerState3 = this.this$0;
                timePickerState3.mo12337D(((float) timePickerState3.mo12341H(this.$value)) * 0.10471976f);
            }
            if (this.$fromTap) {
                Animatable<Float, C1983k> f = this.this$0.mo12345f();
                Float e = C11064a.m42619e(this.this$0.mo12350k());
                this.label = 1;
                if (f.mo6597B(e, this) == h) {
                    return h;
                }
            } else {
                Animatable<Float, C1983k> f2 = this.this$0.mo12345f();
                Float e2 = C11064a.m42619e(this.this$0.mo12361v(this.$value));
                this.label = 2;
                if (f2.mo6597B(e2, this) == h) {
                    return h;
                }
            }
        } else if (i == 1 || i == 2) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((TimePickerState$update$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
