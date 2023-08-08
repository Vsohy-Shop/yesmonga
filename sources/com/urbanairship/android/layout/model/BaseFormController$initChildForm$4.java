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

@C11067d(mo22501c = "com.urbanairship.android.layout.model.BaseFormController$initChildForm$4", mo22502f = "BaseFormController.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Landroid/view/View;", "T", "", "isDisplayed", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseFormController$initChildForm$4 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ BaseFormController<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFormController$initChildForm$4(BaseFormController<T> baseFormController, C11045c<? super BaseFormController$initChildForm$4> cVar) {
        super(2, cVar);
        this.this$0 = baseFormController;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BaseFormController$initChildForm$4 baseFormController$initChildForm$4 = new BaseFormController$initChildForm$4(this.this$0, cVar);
        baseFormController$initChildForm$4.Z$0 = ((Boolean) obj).booleanValue();
        return baseFormController$initChildForm$4;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo106974g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseFormController$initChildForm$4) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo106974g(((Boolean) obj).booleanValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final boolean z = this.Z$0;
            C35607n M = this.this$0.f88260s;
            final BaseFormController<T> baseFormController = this.this$0;
            M.mo106668c(new C11300l<C35608o.C35610b, C35608o.C35610b>() {
                @C12579k
                /* renamed from: a */
                public final C35608o.C35610b invoke(@C12579k C35608o.C35610b bVar) {
                    Intrinsics.checkNotNullParameter(bVar, "state");
                    return bVar.mo106700n(baseFormController.mo106955Q(), Boolean.valueOf(z));
                }
            });
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
