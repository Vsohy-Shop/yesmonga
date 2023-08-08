package com.urbanairship.android.layout.model;

import com.urbanairship.C36059m;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35869e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.BaseFormController$initParentForm$2", mo22502f = "BaseFormController.kt", mo22503i = {}, mo22504l = {160}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo22516d2 = {"Landroid/view/View;", "T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseFormController$initParentForm$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseFormController<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFormController$initParentForm$2(BaseFormController<T> baseFormController, C11045c<? super BaseFormController$initParentForm$2> cVar) {
        super(2, cVar);
        this.this$0 = baseFormController;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BaseFormController$initParentForm$2 baseFormController$initParentForm$2 = new BaseFormController$initParentForm$2(this.this$0, cVar);
        baseFormController$initParentForm$2.L$0 = obj;
        return baseFormController$initParentForm$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C12074o0 o0Var = (C12074o0) this.L$0;
            C11952u a = this.this$0.f88259r.mo106666a();
            final BaseFormController<T> baseFormController = this.this$0;
            C357231 r3 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object emit(@C12579k C35608o.C35610b bVar, @C12579k C11045c<? super C11079d2> cVar) {
                    if (bVar.mo106711x()) {
                        return C11079d2.f28267a;
                    }
                    if (!bVar.mo106705s().isEmpty()) {
                        C35867c C = bVar.mo106685C();
                        baseFormController.mo106986E(new ReportingEvent.C35619e(C), C35603k.m146913i(baseFormController.mo106999n(), C, (C35869e) null, (String) null, 6, (Object) null));
                        baseFormController.f88259r.mo106668c(C357241.f88276f);
                        C12079p0.m48264e(o0Var, "Successfully reported form display.", (Throwable) null, 2, (Object) null);
                    } else {
                        C36059m.m148419o("Skipped form display reporting! No inputs are currently displayed.", new Object[0]);
                    }
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (a.collect(r3, this) == h) {
                return h;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C11661u0.m45747n(obj);
        }
        throw new KotlinNothingValueException();
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseFormController$initParentForm$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
