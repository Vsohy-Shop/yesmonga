package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.model.ScoreModel;
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

@C11067d(mo22501c = "com.urbanairship.android.layout.model.ScoreModel$onViewAttached$3", mo22502f = "ScoreModel.kt", mo22503i = {}, mo22504l = {152}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ScoreModel$onViewAttached$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ScoreModel this$0;

    /* renamed from: com.urbanairship.android.layout.model.ScoreModel$onViewAttached$3$a */
    public static final class C35776a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ ScoreModel f88382a;

        public C35776a(ScoreModel scoreModel) {
            this.f88382a = scoreModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C35608o.C35610b bVar, @C12579k C11045c<? super C11079d2> cVar) {
            ScoreModel.C35772a aVar = (ScoreModel.C35772a) this.f88382a.mo107000o();
            if (aVar != null) {
                aVar.setEnabled(bVar.mo106712y());
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScoreModel$onViewAttached$3(ScoreModel scoreModel, C11045c<? super ScoreModel$onViewAttached$3> cVar) {
        super(2, cVar);
        this.this$0 = scoreModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ScoreModel$onViewAttached$3(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11952u a = this.this$0.f88379t.mo106666a();
            C35776a aVar = new C35776a(this.this$0);
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
        return ((ScoreModel$onViewAttached$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
