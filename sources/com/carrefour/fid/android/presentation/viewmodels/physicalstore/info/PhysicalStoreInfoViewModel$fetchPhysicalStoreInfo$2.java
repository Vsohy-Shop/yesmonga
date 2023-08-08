package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2", mo22502f = "PhysicalStoreInfoViewModel.kt", mo22503i = {0}, mo22504l = {57}, mo22505m = "invokeSuspend", mo22506n = {"$this$launch"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPhysicalStoreInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,169:1\n230#2,5:170\n230#2,5:175\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2\n*L\n66#1:170,5\n83#1:175,5\n*E\n"})
public final class PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PhysicalStoreInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2(PhysicalStoreInfoViewModel physicalStoreInfoViewModel, C11045c<? super PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2> cVar) {
        super(2, cVar);
        this.this$0 = physicalStoreInfoViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2 physicalStoreInfoViewModel$fetchPhysicalStoreInfo$2 = new PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2(this.this$0, cVar);
        physicalStoreInfoViewModel$fetchPhysicalStoreInfo$2.L$0 = obj;
        return physicalStoreInfoViewModel$fetchPhysicalStoreInfo$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        C12074o0 o0Var;
        Object obj3;
        C27145c value;
        C27145c value2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var2 = (C12074o0) this.L$0;
            C37832c f0 = this.this$0.f65988a;
            this.L$0 = o0Var2;
            this.label = 1;
            Object r2 = f0.m172965invokeIoAF18A(this);
            if (r2 == h) {
                return h;
            }
            o0Var = o0Var2;
            obj2 = r2;
        } else if (i == 1) {
            o0Var = (C12074o0) this.L$0;
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            try {
                Result.C10852a aVar = Result.f28060a;
                C38163l lVar = (C38163l) obj2;
                if (lVar != null) {
                    C11940j<C27145c> k0 = physicalStoreInfoViewModel.mo78889k0();
                    do {
                        value2 = k0.getValue();
                    } while (!k0.mo24216e(value2, C27145c.m114705f(value2, new C27164j.C27167c(lVar), (C27152g) null, (C27160i) null, (C27156h) null, 14, (Object) null)));
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2$1$2(physicalStoreInfoViewModel, lVar, (C11045c<? super PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2$1$2>) null), 3, (Object) null);
                    C11723c2 unused2 = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2$1$3(physicalStoreInfoViewModel, lVar, (C11045c<? super PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2$1$3>) null), 3, (Object) null);
                    obj3 = Result.m38702b(C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2$1$4(physicalStoreInfoViewModel, lVar, (C11045c<? super PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2$1$4>) null), 3, (Object) null));
                } else {
                    throw new Exception();
                }
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj3 = Result.m38702b(C11661u0.m45734a(th));
            }
        } else {
            obj3 = Result.m38702b(obj2);
        }
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel2 = this.this$0;
        if (Result.m38705e(obj3) != null) {
            C11940j<C27145c> k02 = physicalStoreInfoViewModel2.mo78889k0();
            do {
                value = k02.getValue();
            } while (!k02.mo24216e(value, C27145c.m114705f(value, C27164j.C27165a.f66039a, (C27152g) null, (C27160i) null, (C27156h) null, 14, (Object) null)));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
