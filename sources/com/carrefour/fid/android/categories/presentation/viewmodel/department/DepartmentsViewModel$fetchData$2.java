package com.carrefour.fid.android.categories.presentation.viewmodel.department;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchData$2", mo22502f = "DepartmentsViewModel.kt", mo22503i = {0, 0}, mo22504l = {58}, mo22505m = "invokeSuspend", mo22506n = {"$this$update$iv", "prevValue$iv"}, mo22507s = {"L$0", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDepartmentsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentsViewModel.kt\ncom/carrefour/fid/android/categories/presentation/viewmodel/department/DepartmentsViewModel$fetchData$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,90:1\n230#2,5:91\n*S KotlinDebug\n*F\n+ 1 DepartmentsViewModel.kt\ncom/carrefour/fid/android/categories/presentation/viewmodel/department/DepartmentsViewModel$fetchData$2\n*L\n58#1:91,5\n*E\n"})
public final class DepartmentsViewModel$fetchData$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DepartmentsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentsViewModel$fetchData$2(DepartmentsViewModel departmentsViewModel, C11045c<? super DepartmentsViewModel$fetchData$2> cVar) {
        super(2, cVar);
        this.this$0 = departmentsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DepartmentsViewModel$fetchData$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r7.L$2
            java.lang.Object r3 = r7.L$1
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel r3 = (com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel) r3
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.C11940j) r4
            kotlin.C11661u0.m45747n(r8)
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L_0x0054
        L_0x001e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0026:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.j r8 = r8.f101547h
            com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel r1 = r7.this$0
            r4 = r8
            r3 = r1
            r8 = r7
        L_0x0034:
            java.lang.Object r1 = r4.getValue()
            r5 = r1
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r3.mo131205k0(r8)
            if (r5 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r6 = r0
            r0 = r8
            r8 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L_0x0054:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r2
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            boolean r8 = r5.mo24216e(r3, r8)
            if (r8 == 0) goto L_0x0068
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0068:
            r8 = r0
            r0 = r1
            r3 = r4
            r4 = r5
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel$fetchData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DepartmentsViewModel$fetchData$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
