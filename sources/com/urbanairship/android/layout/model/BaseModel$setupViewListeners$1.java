package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
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

@C11067d(mo22501c = "com.urbanairship.android.layout.model.BaseModel$setupViewListeners$1", mo22502f = "BaseModel.kt", mo22503i = {}, mo22504l = {133}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@"}, mo22516d2 = {"Landroid/view/View;", "T", "Lcom/urbanairship/android/layout/model/BaseModel$a;", "L", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseModel$setupViewListeners$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ T $view;
    int label;
    final /* synthetic */ BaseModel<T, L> this$0;

    /* renamed from: com.urbanairship.android.layout.model.BaseModel$setupViewListeners$1$a */
    public static final class C35730a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ BaseModel<T, L> f88299a;

        public C35730a(BaseModel<T, L> baseModel) {
            this.f88299a = baseModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C11079d2 d2Var, @C12579k C11045c<? super C11079d2> cVar) {
            BaseModel.m147332y(this.f88299a, EventHandler.Type.TAP, (Object) null, 2, (Object) null);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseModel$setupViewListeners$1(T t, BaseModel<T, L> baseModel, C11045c<? super BaseModel$setupViewListeners$1> cVar) {
        super(2, cVar);
        this.$view = t;
        this.this$0 = baseModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseModel$setupViewListeners$1(this.$view, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e e = ViewExtensionsKt.m148030e(this.$view, 0, 1, (Object) null);
            C35730a aVar = new C35730a(this.this$0);
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
        return ((BaseModel$setupViewListeners$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
