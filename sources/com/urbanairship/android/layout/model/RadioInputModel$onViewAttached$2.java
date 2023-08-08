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
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.RadioInputModel$onViewAttached$2", mo22502f = "RadioInputModel.kt", mo22503i = {}, mo22504l = {111}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class RadioInputModel$onViewAttached$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11944n<Boolean> $checkedChanges;
    int label;
    final /* synthetic */ RadioInputModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioInputModel$onViewAttached$2(C11944n<Boolean> nVar, RadioInputModel radioInputModel, C11045c<? super RadioInputModel$onViewAttached$2> cVar) {
        super(2, cVar);
        this.$checkedChanges = nVar;
        this.this$0 = radioInputModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new RadioInputModel$onViewAttached$2(this.$checkedChanges, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            RadioInputModel$onViewAttached$2$invokeSuspend$$inlined$filter$1 radioInputModel$onViewAttached$2$invokeSuspend$$inlined$filter$1 = new RadioInputModel$onViewAttached$2$invokeSuspend$$inlined$filter$1(this.$checkedChanges);
            final RadioInputModel radioInputModel = this.this$0;
            C357672 r5 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object mo107127c(boolean z, @C12579k C11045c<? super C11079d2> cVar) {
                    C35607n S = radioInputModel.f88365u;
                    final RadioInputModel radioInputModel = radioInputModel;
                    S.mo106668c(new C11300l<C35608o.C35613e, C35608o.C35613e>() {
                        @C12579k
                        /* renamed from: a */
                        public final C35608o.C35613e invoke(@C12579k C35608o.C35613e eVar) {
                            Intrinsics.checkNotNullParameter(eVar, "state");
                            return C35608o.C35613e.m146990f(eVar, (String) null, radioInputModel.f88363s, radioInputModel.f88364t, false, 9, (Object) null);
                        }
                    });
                    return C11079d2.f28267a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
                    return mo107127c(((Boolean) obj).booleanValue(), cVar);
                }
            };
            this.label = 1;
            if (radioInputModel$onViewAttached$2$invokeSuspend$$inlined$filter$1.collect(r5, this) == h) {
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
        return ((RadioInputModel$onViewAttached$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
