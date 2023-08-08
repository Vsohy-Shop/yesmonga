package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.util.C35919k;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.PagerView;
import com.urbanairship.json.JsonValue;
import java.util.Map;
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
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.PagerModel$onViewAttached$2", mo22502f = "PagerModel.kt", mo22503i = {}, mo22504l = {100}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class PagerModel$onViewAttached$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ PagerView $view;
    int label;
    final /* synthetic */ PagerModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerModel$onViewAttached$2(PagerView pagerView, PagerModel pagerModel, C11045c<? super PagerModel$onViewAttached$2> cVar) {
        super(2, cVar);
        this.$view = pagerView;
        this.this$0 = pagerModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PagerModel$onViewAttached$2(this.$view, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<C35919k> g = ViewExtensionsKt.m148032g(this.$view);
            final PagerModel pagerModel = this.this$0;
            C357541 r1 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object emit(@C12579k C35919k kVar, @C12579k C11045c<? super C11079d2> cVar) {
                    final int a = kVar.mo107574a();
                    boolean b = kVar.mo107575b();
                    pagerModel.f88344q.mo106668c(new C11300l<C35608o.C35612d, C35608o.C35612d>() {
                        @C12579k
                        /* renamed from: a */
                        public final C35608o.C35612d invoke(@C12579k C35608o.C35612d dVar) {
                            Intrinsics.checkNotNullParameter(dVar, "state");
                            return dVar.mo106729i(a);
                        }
                    });
                    if (!b) {
                        PagerModel pagerModel = pagerModel;
                        pagerModel.mo107100T((C35608o.C35612d) pagerModel.f88344q.mo106666a().getValue());
                    }
                    Map<String, JsonValue> a2 = pagerModel.mo107093M().get(a).mo107102a();
                    if (a2 != null) {
                        BaseModel.m147326G(pagerModel, a2, (C35868d) null, 2, (Object) null);
                    }
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (g.collect(r1, this) == h) {
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
        return ((PagerModel$onViewAttached$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
