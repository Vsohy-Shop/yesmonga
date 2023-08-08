package com.carrefour.fid.android.categories.presentation.viewmodel.department;

import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37700d;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010!R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\u0002\u0004\n\u0002\b\u0019¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/categories/presentation/viewmodel/department/DepartmentsViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "h0", "i0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "k0", "Lcom/carrefour/fid/android/domain/interactors/category/a;", "a", "Lcom/carrefour/fid/android/domain/interactors/category/a;", "getCategoriesUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "b", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/loyalty/d;", "c", "Lcom/carrefour/fid/android/domain/interactors/loyalty/d;", "hasCardFidUseCase", "Lkotlinx/coroutines/c2;", "d", "Lkotlinx/coroutines/c2;", "fetchDepartmentsJob", "e", "isCouponDisplayedJob", "f", "hasFidCardJob", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "g", "Lkotlinx/coroutines/flow/j;", "_departmentListState", "h", "_isCouponDisplayed", "i", "_hasFidCard", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/categories/presentation/viewmodel/department/a;", "j", "Lkotlinx/coroutines/flow/u;", "j0", "()Lkotlinx/coroutines/flow/u;", "state", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/category/a;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/loyalty/d;)V", "categories_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDepartmentsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentsViewModel.kt\ncom/carrefour/fid/android/categories/presentation/viewmodel/department/DepartmentsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,90:1\n230#2,5:91\n230#2,5:96\n230#2,5:101\n*S KotlinDebug\n*F\n+ 1 DepartmentsViewModel.kt\ncom/carrefour/fid/android/categories/presentation/viewmodel/department/DepartmentsViewModel\n*L\n67#1:91,5\n71#1:96,5\n74#1:101,5\n*E\n"})
public final class DepartmentsViewModel extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final C37619a f101540a;
    @C12579k

    /* renamed from: b */
    public final C37823k f101541b;
    @C12579k

    /* renamed from: c */
    public final C37700d f101542c;
    @C12580l

    /* renamed from: d */
    public C11723c2 f101543d;
    @C12580l

    /* renamed from: e */
    public C11723c2 f101544e;
    @C12580l

    /* renamed from: f */
    public C11723c2 f101545f;
    @C12579k

    /* renamed from: g */
    public final C11940j<C28892e<List<ProductCategory>>> f101546g;
    @C12579k

    /* renamed from: h */
    public final C11940j<Boolean> f101547h;
    @C12579k

    /* renamed from: i */
    public final C11940j<Boolean> f101548i;
    @C12579k

    /* renamed from: j */
    public final C11952u<C39797a> f101549j;

    @Inject
    public DepartmentsViewModel(@C12579k C37619a aVar, @C12579k C37823k kVar, @C12579k C37700d dVar) {
        Intrinsics.checkNotNullParameter(aVar, "getCategoriesUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(dVar, "hasCardFidUseCase");
        this.f101540a = aVar;
        this.f101541b = kVar;
        this.f101542c = dVar;
        C11940j<C28892e<List<ProductCategory>>> a = C11953v.m47628a(C28892e.C28896d.f70785b);
        this.f101546g = a;
        Boolean bool = Boolean.FALSE;
        C11940j<Boolean> a2 = C11953v.m47628a(bool);
        this.f101547h = a2;
        C11940j<Boolean> a3 = C11953v.m47628a(bool);
        this.f101548i = a3;
        this.f101549j = C11909g.m47392O1(C11909g.m47360E(a, a2, a3, new DepartmentsViewModel$state$1((C11045c<? super DepartmentsViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C39797a((C28892e) null, false, false, 7, (DefaultConstructorMarker) null));
    }

    /* renamed from: h0 */
    public final void mo131202h0() {
        C11723c2 c2Var = this.f101543d;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        C11723c2 c2Var2 = this.f101544e;
        if (c2Var2 != null) {
            C11723c2.C11724a.m46184b(c2Var2, (CancellationException) null, 1, (Object) null);
        }
        C11723c2 c2Var3 = this.f101545f;
        if (c2Var3 != null) {
            C11723c2.C11724a.m46184b(c2Var3, (CancellationException) null, 1, (Object) null);
        }
        this.f101543d = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DepartmentsViewModel$fetchData$1(this, (C11045c<? super DepartmentsViewModel$fetchData$1>) null), 3, (Object) null);
        this.f101544e = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DepartmentsViewModel$fetchData$2(this, (C11045c<? super DepartmentsViewModel$fetchData$2>) null), 3, (Object) null);
        this.f101545f = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DepartmentsViewModel$fetchData$3(this, (C11045c<? super DepartmentsViewModel$fetchData$3>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131203i0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchDepartments$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchDepartments$1 r0 = (com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchDepartments$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchDepartments$1 r0 = new com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchDepartments$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel r0 = (com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005d
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>>> r6 = r5.f101546g
        L_0x0040:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.carrefour.fid.android.shared.type.e r4 = (com.carrefour.fid.android.shared.type.C28892e) r4
            com.carrefour.fid.android.shared.type.e$b r4 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r2 = r6.mo24216e(r2, r4)
            if (r2 == 0) goto L_0x0040
            com.carrefour.fid.android.domain.interactors.category.a r6 = r5.f101540a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r0 = r5
        L_0x005d:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r6)
            if (r2 != 0) goto L_0x007a
            java.util.List r6 = (java.util.List) r6
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>>> r1 = r0.f101546g
        L_0x0067:
            java.lang.Object r0 = r1.getValue()
            r2 = r0
            com.carrefour.fid.android.shared.type.e r2 = (com.carrefour.fid.android.shared.type.C28892e) r2
            com.carrefour.fid.android.shared.type.e$c r2 = new com.carrefour.fid.android.shared.type.e$c
            r2.<init>(r6)
            boolean r0 = r1.mo24216e(r0, r2)
            if (r0 == 0) goto L_0x0067
            goto L_0x008e
        L_0x007a:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>>> r4 = r0.f101546g
        L_0x007c:
            java.lang.Object r6 = r4.getValue()
            r0 = r6
            com.carrefour.fid.android.shared.type.e r0 = (com.carrefour.fid.android.shared.type.C28892e) r0
            com.carrefour.fid.android.shared.type.e$a r0 = new com.carrefour.fid.android.shared.type.e$a
            r0.<init>(r2)
            boolean r6 = r4.mo24216e(r6, r0)
            if (r6 == 0) goto L_0x007c
        L_0x008e:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel.mo131203i0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: j0 */
    public final C11952u<C39797a> mo131204j0() {
        return this.f101549j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131205k0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$isExpressDeliverySelected$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$isExpressDeliverySelected$1 r0 = (com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$isExpressDeliverySelected$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$isExpressDeliverySelected$1 r0 = new com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$isExpressDeliverySelected$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f101541b
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r5 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 == 0) goto L_0x0055
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r5.mo119354f()
        L_0x0055:
            if (r1 == 0) goto L_0x0060
            com.carrefour.fid.android.shared.util.ServiceUtil r5 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r5 = r5.mo84134p(r1)
            if (r5 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel.mo131205k0(kotlin.coroutines.c):java.lang.Object");
    }
}
