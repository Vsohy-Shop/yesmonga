package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.json.JsonValue;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.ButtonModel$onViewAttached$1", mo22502f = "ButtonModel.kt", mo22503i = {}, mo22504l = {67}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00020\u0003H@"}, mo22516d2 = {"Landroid/view/View;", "Lcom/urbanairship/android/layout/widget/n;", "T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ButtonModel$onViewAttached$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ T $view;
    int label;
    final /* synthetic */ ButtonModel<T> this$0;

    /* renamed from: com.urbanairship.android.layout.model.ButtonModel$onViewAttached$1$a */
    public static final class C35733a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ ButtonModel<T> f88310a;

        public C35733a(ButtonModel<T> buttonModel) {
            this.f88310a = buttonModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C11079d2 d2Var, @C12579k C11045c<? super C11079d2> cVar) {
            boolean z;
            C35868d i = C35603k.m146913i(this.f88310a.mo106999n(), (C35867c) null, (C35869e) null, this.f88310a.mo107032S(), 3, (Object) null);
            ButtonModel<T> buttonModel = this.f88310a;
            buttonModel.mo106986E(new ReportingEvent.C35615a(buttonModel.mo107032S()), i);
            Map<String, JsonValue> Q = this.f88310a.mo107030Q();
            if (Q == null || Q.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ButtonModel<T> buttonModel2 = this.f88310a;
                buttonModel2.mo106987F(buttonModel2.mo107030Q(), i);
            }
            if (C35838i.m147766b(this.f88310a.mo106998m())) {
                BaseModel.m147332y(this.f88310a, EventHandler.Type.TAP, (Object) null, 2, (Object) null);
            }
            Object K = this.f88310a.mo107029P(cVar);
            if (K == C11063b.m42612h()) {
                return K;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonModel$onViewAttached$1(T t, ButtonModel<T> buttonModel, C11045c<? super ButtonModel$onViewAttached$1> cVar) {
        super(2, cVar);
        this.$view = t;
        this.this$0 = buttonModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ButtonModel$onViewAttached$1(this.$view, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<C11079d2> e = ((C36026n) this.$view).mo107595e();
            C35733a aVar = new C35733a(this.this$0);
            this.label = 1;
            if (e.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ButtonModel$onViewAttached$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
