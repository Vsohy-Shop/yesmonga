package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.property.C35831d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.ButtonModel$handleSubmit$submitEvent$1", mo22502f = "ButtonModel.kt", mo22503i = {}, mo22504l = {119}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001H@"}, mo22516d2 = {"Landroid/view/View;", "Lcom/urbanairship/android/layout/widget/n;", "T", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ButtonModel$handleSubmit$submitEvent$1 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ButtonModel<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonModel$handleSubmit$submitEvent$1(ButtonModel<T> buttonModel, C11045c<? super ButtonModel$handleSubmit$submitEvent$1> cVar) {
        super(1, cVar);
        this.this$0 = buttonModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new ButtonModel$handleSubmit$submitEvent$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (C35831d.m147742b(this.this$0.f88303q)) {
                ButtonModel<T> buttonModel = this.this$0;
                boolean a = C35831d.m147741a(buttonModel.f88303q);
                this.label = 1;
                if (buttonModel.mo107035V(a, this) == h) {
                    return h;
                }
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (C35831d.m147745e(this.this$0.f88303q)) {
            this.this$0.mo107036W();
        }
        if (C35831d.m147746f(this.this$0.f88303q)) {
            this.this$0.mo107037X();
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((ButtonModel$handleSubmit$submitEvent$1) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
