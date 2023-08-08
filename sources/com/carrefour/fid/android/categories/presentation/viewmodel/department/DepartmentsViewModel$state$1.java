package com.carrefour.fid.android.categories.presentation.viewmodel.department;

import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11306r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$state$1", mo22502f = "DepartmentsViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/e;", "", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "departmentListState", "", "isCouponDisplayed", "hasFidCard", "Lcom/carrefour/fid/android/categories/presentation/viewmodel/department/a;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DepartmentsViewModel$state$1 extends SuspendLambda implements C11306r<C28892e<? extends List<? extends ProductCategory>>, Boolean, Boolean, C11045c<? super C39797a>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public DepartmentsViewModel$state$1(C11045c<? super DepartmentsViewModel$state$1> cVar) {
        super(4, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo131209g(@C12579k C28892e<? extends List<ProductCategory>> eVar, boolean z, boolean z2, @C12580l C11045c<? super C39797a> cVar) {
        DepartmentsViewModel$state$1 departmentsViewModel$state$1 = new DepartmentsViewModel$state$1(cVar);
        departmentsViewModel$state$1.L$0 = eVar;
        departmentsViewModel$state$1.Z$0 = z;
        departmentsViewModel$state$1.Z$1 = z2;
        return departmentsViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return mo131209g((C28892e) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (C11045c) obj4);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return new C39797a((C28892e) this.L$0, this.Z$0, this.Z$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
