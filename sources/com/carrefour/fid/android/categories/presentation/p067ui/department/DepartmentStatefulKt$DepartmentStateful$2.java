package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.content.Context;
import androidx.compose.runtime.C8578k2;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.categories.databinding.C39738a;
import com.carrefour.fid.android.categories.presentation.viewmodel.department.C39797a;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.type.C28892e;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDepartmentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt$DepartmentStateful$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,340:1\n262#2,2:341\n262#2,2:343\n262#2,2:345\n262#2,2:347\n262#2,2:349\n262#2,2:351\n*S KotlinDebug\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt$DepartmentStateful$2\n*L\n105#1:341,2\n106#1:343,2\n118#1:345,2\n119#1:347,2\n123#1:349,2\n124#1:351,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentStateful$2 */
public final class DepartmentStatefulKt$DepartmentStateful$2 extends Lambda implements C11300l<C39738a, C11079d2> {
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ Context $context;
    final /* synthetic */ C37269i $couponItem;
    final /* synthetic */ Ref.BooleanRef $isErrorViewInitialized;
    final /* synthetic */ C37269i $promoItem;
    final /* synthetic */ C8578k2<C39797a> $stateFlow;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentStateful$2(C8578k2<C39797a> k2Var, Context context, C37269i iVar, C37269i iVar2, C11300l<? super C39769a, C11079d2> lVar, Ref.BooleanRef booleanRef) {
        super(1);
        this.$stateFlow = k2Var;
        this.$context = context;
        this.$promoItem = iVar;
        this.$couponItem = iVar2;
        this.$actioner = lVar;
        this.$isErrorViewInitialized = booleanRef;
    }

    /* renamed from: a */
    public final void mo131120a(@C12579k C39738a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "binding");
        C39797a value = this.$stateFlow.getValue();
        C28892e<List<ProductCategory>> f = value.mo131215f();
        if (f instanceof C28892e.C28895c) {
            ShimmerFrameLayout shimmerFrameLayout = aVar.f101388d;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.departmentLoadingView");
            shimmerFrameLayout.setVisibility(8);
            ConstraintLayout b = aVar.f101386b.getRoot();
            Intrinsics.checkNotNullExpressionValue(b, "binding.departmentErrorView.root");
            b.setVisibility(8);
            DepartmentStatefulKt.m162277s(aVar, this.$context, (List) ((C28892e.C28895c) value.mo131215f()).mo84088d(), value.mo131217h(), value.mo131216g(), this.$promoItem, this.$couponItem, this.$actioner);
            return;
        }
        if (Intrinsics.areEqual((Object) f, (Object) C28892e.C28894b.f70781b)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) f, (Object) C28892e.C28896d.f70785b);
        }
        if (z) {
            ShimmerFrameLayout shimmerFrameLayout2 = aVar.f101388d;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.departmentLoadingView");
            shimmerFrameLayout2.setVisibility(0);
            ConstraintLayout b2 = aVar.f101386b.getRoot();
            Intrinsics.checkNotNullExpressionValue(b2, "binding.departmentErrorView.root");
            b2.setVisibility(8);
        } else if (f instanceof C28892e.C28893a) {
            ShimmerFrameLayout shimmerFrameLayout3 = aVar.f101388d;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "binding.departmentLoadingView");
            shimmerFrameLayout3.setVisibility(8);
            ConstraintLayout b3 = aVar.f101386b.getRoot();
            Intrinsics.checkNotNullExpressionValue(b3, "binding.departmentErrorView.root");
            b3.setVisibility(0);
            if (this.$isErrorViewInitialized.element) {
                DepartmentStatefulKt.m162273o(aVar, this.$context, this.$actioner);
                this.$isErrorViewInitialized.element = true;
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo131120a((C39738a) obj);
        return C11079d2.f28267a;
    }
}
