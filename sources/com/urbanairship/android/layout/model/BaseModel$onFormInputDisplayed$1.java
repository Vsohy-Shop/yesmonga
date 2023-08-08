package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.BaseModel$onFormInputDisplayed$1", mo22502f = "BaseModel.kt", mo22503i = {}, mo22504l = {116, 124}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@"}, mo22516d2 = {"Landroid/view/View;", "T", "Lcom/urbanairship/android/layout/model/BaseModel$a;", "L", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseModel$onFormInputDisplayed$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<Boolean, C11045c<? super C11079d2>, Object> $block;
    int label;
    final /* synthetic */ BaseModel<T, L> this$0;

    /* renamed from: com.urbanairship.android.layout.model.BaseModel$onFormInputDisplayed$1$a */
    public static final class C35729a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f88296a;

        /* renamed from: b */
        public final /* synthetic */ BaseModel<T, L> f88297b;

        /* renamed from: c */
        public final /* synthetic */ C11304p<Boolean, C11045c<? super C11079d2>, Object> f88298c;

        public C35729a(Ref.BooleanRef booleanRef, BaseModel<T, L> baseModel, C11304p<? super Boolean, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
            this.f88296a = booleanRef;
            this.f88297b = baseModel;
            this.f88298c = pVar;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C35608o.C35612d dVar, @C12579k C11045c<? super C11079d2> cVar) {
            Ref.BooleanRef booleanRef = this.f88296a;
            boolean z = booleanRef.element;
            booleanRef.element = Intrinsics.areEqual((Object) dVar.mo106736p().get(dVar.mo106735o()), (Object) this.f88297b.mo107002q().mo107231d());
            boolean z2 = this.f88296a.element;
            if (z == z2) {
                return C11079d2.f28267a;
            }
            Object invoke = this.f88298c.invoke(C11064a.m42615a(z2), cVar);
            if (invoke == C11063b.m42612h()) {
                return invoke;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseModel$onFormInputDisplayed$1(BaseModel<T, L> baseModel, C11304p<? super Boolean, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super BaseModel$onFormInputDisplayed$1> cVar) {
        super(2, cVar);
        this.this$0 = baseModel;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseModel$onFormInputDisplayed$1(this.this$0, this.$block, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11952u<C35608o.C35612d> a;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            C35607n<C35608o.C35612d> d = this.this$0.mo106999n().mo106661d();
            if (d == null || (a = d.mo106666a()) == null) {
                C11304p<Boolean, C11045c<? super C11079d2>, Object> pVar = this.$block;
                Boolean a2 = C11064a.m42615a(true);
                this.label = 2;
                if (pVar.invoke(a2, this) == h) {
                    return h;
                }
                return C11079d2.f28267a;
            }
            C35729a aVar = new C35729a(booleanRef, this.this$0, this.$block);
            this.label = 1;
            if (a.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new KotlinNothingValueException();
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseModel$onFormInputDisplayed$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
