package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10933e1;
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

@C11067d(mo22501c = "com.urbanairship.android.layout.model.CheckboxModel$onViewAttached$2", mo22502f = "CheckboxModel.kt", mo22503i = {}, mo22504l = {108}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class CheckboxModel$onViewAttached$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11944n<Boolean> $checkedChanges;
    int label;
    final /* synthetic */ CheckboxModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxModel$onViewAttached$2(C11944n<Boolean> nVar, CheckboxModel checkboxModel, C11045c<? super CheckboxModel$onViewAttached$2> cVar) {
        super(2, cVar);
        this.$checkedChanges = nVar;
        this.this$0 = checkboxModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckboxModel$onViewAttached$2(this.$checkedChanges, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11944n<Boolean> nVar = this.$checkedChanges;
            final CheckboxModel checkboxModel = this.this$0;
            C357411 r1 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object mo107064c(final boolean z, @C12579k C11045c<? super C11079d2> cVar) {
                    C35607n Q = checkboxModel.f88323t;
                    final CheckboxModel checkboxModel = checkboxModel;
                    Q.mo106668c(new C11300l<C35608o.C35609a, C35608o.C35609a>() {
                        @C12579k
                        /* renamed from: a */
                        public final C35608o.C35609a invoke(@C12579k C35608o.C35609a aVar) {
                            Set<T> set;
                            Intrinsics.checkNotNullParameter(aVar, "state");
                            if (z) {
                                set = C10933e1.m40912D(aVar.mo106680k(), checkboxModel.f88322s);
                            } else {
                                set = C10933e1.m40917y(aVar.mo106680k(), checkboxModel.f88322s);
                            }
                            return C35608o.C35609a.m146928g(aVar, (String) null, 0, 0, set, false, 23, (Object) null);
                        }
                    });
                    return C11079d2.f28267a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
                    return mo107064c(((Boolean) obj).booleanValue(), cVar);
                }
            };
            this.label = 1;
            if (nVar.collect(r1, this) == h) {
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
        return ((CheckboxModel$onViewAttached$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
