package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35608o;
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
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.BaseModel$createView$5", mo22502f = "BaseModel.kt", mo22503i = {}, mo22504l = {94}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@"}, mo22516d2 = {"Landroid/view/View;", "T", "Lcom/urbanairship/android/layout/model/BaseModel$a;", "L", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseModel$createView$5 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ BaseModel<T, L> this$0;

    /* renamed from: com.urbanairship.android.layout.model.BaseModel$createView$5$a */
    public static final class C35728a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ BaseModel<T, L> f88294a;

        public C35728a(BaseModel<T, L> baseModel) {
            this.f88294a = baseModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C35608o.C35610b bVar, @C12579k C11045c<? super C11079d2> cVar) {
            this.f88294a.mo107007v(bVar);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseModel$createView$5(BaseModel<T, L> baseModel, C11045c<? super BaseModel$createView$5> cVar) {
        super(2, cVar);
        this.this$0 = baseModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseModel$createView$5(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11952u<C35608o.C35610b> a = this.this$0.mo106999n().mo106659b().mo106666a();
            C35728a aVar = new C35728a(this.this$0);
            this.label = 1;
            if (a.collect(aVar, this) == h) {
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
        return ((BaseModel$createView$5) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
