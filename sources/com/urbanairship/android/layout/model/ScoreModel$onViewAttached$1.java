package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.ScoreView;
import com.urbanairship.json.JsonValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
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

@C11067d(mo22501c = "com.urbanairship.android.layout.model.ScoreModel$onViewAttached$1", mo22502f = "ScoreModel.kt", mo22503i = {}, mo22504l = {124}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ScoreModel$onViewAttached$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ScoreView $view;
    int label;
    final /* synthetic */ ScoreModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScoreModel$onViewAttached$1(ScoreView scoreView, ScoreModel scoreModel, C11045c<? super ScoreModel$onViewAttached$1> cVar) {
        super(2, cVar);
        this.$view = scoreView;
        this.this$0 = scoreModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ScoreModel$onViewAttached$1(this.$view, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<Integer> h2 = ViewExtensionsKt.m148033h(this.$view);
            final ScoreModel scoreModel = this.this$0;
            C357731 r1 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object mo107143c(final int i, @C12579k C11045c<? super C11079d2> cVar) {
                    C35607n L = scoreModel.f88379t;
                    final ScoreModel scoreModel = scoreModel;
                    L.mo106668c(new C11300l<C35608o.C35610b, C35608o.C35610b>() {
                        @C12579k
                        /* renamed from: a */
                        public final C35608o.C35610b invoke(@C12579k C35608o.C35610b bVar) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(bVar, "state");
                            String N = scoreModel.mo107134N();
                            Integer valueOf = Integer.valueOf(i);
                            if (i > -1 || !scoreModel.mo107136P()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return bVar.mo106701o(new FormData.C35862g(N, valueOf, z, scoreModel.f88378s, JsonValue.m34963I(i)));
                        }
                    });
                    if (C35838i.m147765a(scoreModel.mo106998m())) {
                        scoreModel.mo107009x(EventHandler.Type.FORM_INPUT, C11064a.m42620f(i));
                    }
                    return C11079d2.f28267a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
                    return mo107143c(((Number) obj).intValue(), cVar);
                }
            };
            this.label = 1;
            if (h2.collect(r1, this) == h) {
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
        return ((ScoreModel$onViewAttached$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
