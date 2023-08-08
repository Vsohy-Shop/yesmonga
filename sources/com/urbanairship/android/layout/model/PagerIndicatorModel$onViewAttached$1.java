package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.model.PagerIndicatorModel;
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

@C11067d(mo22501c = "com.urbanairship.android.layout.model.PagerIndicatorModel$onViewAttached$1", mo22502f = "PagerIndicatorModel.kt", mo22503i = {}, mo22504l = {73}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class PagerIndicatorModel$onViewAttached$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ PagerIndicatorModel this$0;

    /* renamed from: com.urbanairship.android.layout.model.PagerIndicatorModel$onViewAttached$1$a */
    public static final class C35749a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ PagerIndicatorModel f88341a;

        public C35749a(PagerIndicatorModel pagerIndicatorModel) {
            this.f88341a = pagerIndicatorModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C35608o.C35612d dVar, @C12579k C11045c<? super C11079d2> cVar) {
            PagerIndicatorModel.C35748a N = this.f88341a.mo107000o();
            if (N != null) {
                N.mo107090c(dVar.mo106736p().size(), dVar.mo106735o());
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerIndicatorModel$onViewAttached$1(PagerIndicatorModel pagerIndicatorModel, C11045c<? super PagerIndicatorModel$onViewAttached$1> cVar) {
        super(2, cVar);
        this.this$0 = pagerIndicatorModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PagerIndicatorModel$onViewAttached$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11952u<C35608o.C35612d> a;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C35607n<C35608o.C35612d> d = this.this$0.mo106999n().mo106661d();
            if (d == null || (a = d.mo106666a()) == null) {
                return C11079d2.f28267a;
            }
            C35749a aVar = new C35749a(this.this$0);
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
        return ((PagerIndicatorModel$onViewAttached$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
