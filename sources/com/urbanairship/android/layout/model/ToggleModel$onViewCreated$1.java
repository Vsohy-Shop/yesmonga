package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.ToggleModel$onViewCreated$1", mo22502f = "ToggleModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "isDisplayed", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ToggleModel$onViewCreated$1 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ToggleModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleModel$onViewCreated$1(ToggleModel toggleModel, C11045c<? super ToggleModel$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = toggleModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ToggleModel$onViewCreated$1 toggleModel$onViewCreated$1 = new ToggleModel$onViewCreated$1(this.this$0, cVar);
        toggleModel$onViewCreated$1.Z$0 = ((Boolean) obj).booleanValue();
        return toggleModel$onViewCreated$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo107181g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ToggleModel$onViewCreated$1) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo107181g(((Boolean) obj).booleanValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final boolean z = this.Z$0;
            C35607n S = this.this$0.f88397w;
            final ToggleModel toggleModel = this.this$0;
            S.mo106668c(new C11300l<C35608o.C35610b, C35608o.C35610b>() {
                @C12579k
                /* renamed from: a */
                public final C35608o.C35610b invoke(@C12579k C35608o.C35610b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "state");
                    return bVar.mo106700n(toggleModel.mo107170U(), Boolean.valueOf(z));
                }
            });
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
