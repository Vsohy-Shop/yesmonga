package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.BaseFormController$initChildForm$2", mo22502f = "BaseFormController.kt", mo22503i = {}, mo22504l = {98}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo22516d2 = {"Landroid/view/View;", "T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseFormController$initChildForm$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ BaseFormController<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFormController$initChildForm$2(BaseFormController<T> baseFormController, C11045c<? super BaseFormController$initChildForm$2> cVar) {
        super(2, cVar);
        this.this$0 = baseFormController;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseFormController$initChildForm$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11952u a = this.this$0.f88259r.mo106666a();
            final BaseFormController<T> baseFormController = this.this$0;
            C357161 r1 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object emit(@C12579k final C35608o.C35610b bVar, @C12579k C11045c<? super C11079d2> cVar) {
                    C35607n M = baseFormController.f88260s;
                    final BaseFormController<T> baseFormController = baseFormController;
                    M.mo106668c(new C11300l<C35608o.C35610b, C35608o.C35610b>() {
                        @C12579k
                        /* renamed from: a */
                        public final C35608o.C35610b invoke(@C12579k C35608o.C35610b bVar) {
                            Intrinsics.checkNotNullParameter(bVar, "parentState");
                            return bVar.mo106701o(baseFormController.mo106954P(bVar));
                        }
                    });
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (a.collect(r1, this) == h) {
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
        return ((BaseFormController$initChildForm$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
