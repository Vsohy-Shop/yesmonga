package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.models.catalog.C37976a;
import com.carrefour.fid.android.domain.models.catalog.C37979d;
import com.carrefour.fid.android.domain.models.catalog.C37986e;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27121d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$handleCatalogClick$1", mo22502f = "PhysicalStoreViewModel.kt", mo22503i = {}, mo22504l = {78, 81, 84}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PhysicalStoreViewModel$handleCatalogClick$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PhysicalStoreViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreViewModel$handleCatalogClick$1(PhysicalStoreViewModel physicalStoreViewModel, C11045c<? super PhysicalStoreViewModel$handleCatalogClick$1> cVar) {
        super(2, cVar);
        this.this$0 = physicalStoreViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PhysicalStoreViewModel$handleCatalogClick$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37610b h0 = this.this$0.f65916l;
            this.label = 1;
            obj2 = h0.m172965invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2 || i == 3) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PhysicalStoreViewModel physicalStoreViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            C37976a aVar = (C37976a) obj2;
            if (aVar instanceof C37979d) {
                C11744g p0 = physicalStoreViewModel.f65917m;
                C27121d.C27125d dVar = C27121d.C27125d.f65967a;
                this.L$0 = obj2;
                this.label = 2;
                if (p0.mo23757h0(dVar, this) == h) {
                    return h;
                }
            } else if (aVar instanceof C37986e) {
                C11744g p02 = physicalStoreViewModel.f65917m;
                C27121d.C27124c cVar = new C27121d.C27124c(((C37986e) aVar).mo117204d());
                this.L$0 = obj2;
                this.label = 3;
                if (p02.mo23757h0(cVar, this) == h) {
                    return h;
                }
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreViewModel$handleCatalogClick$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
