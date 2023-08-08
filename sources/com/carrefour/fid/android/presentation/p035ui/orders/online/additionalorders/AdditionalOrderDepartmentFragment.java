package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36739k0;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\bL\u0010MJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002J\u0016\u0010\u0013\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003*\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002J\u0018\u0010'\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020+H\u0016J\u001a\u00101\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016J\b\u00102\u001a\u00020\nH\u0016J\b\u00103\u001a\u00020\nH\u0016R\"\u0010;\u001a\u0002048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderDepartmentFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/k0;", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "b1", "Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "a1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/b$b;", "state", "Lkotlin/d2;", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/b$a;", "event", "k1", "initHeader", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "j1", "e1", "g1", "", "isLoading", "m1", "", "exception", "h1", "offer", "isFeatureMixingProducts", "o1", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "n1", "", "productPosition", "o0", "f1", "i1", "z", "Y", "J", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onDestroyView", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderDepartmentViewModel;", "g", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderDepartmentViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/b;", "v", "Landroidx/navigation/m;", "c1", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/b;", "arguments", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAdditionalOrderDepartmentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderDepartmentFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderDepartmentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n106#2,15:410\n42#3,3:425\n168#4,7:428\n183#4,6:435\n800#5,11:441\n1569#5,11:452\n1864#5,2:463\n1866#5:466\n1580#5:467\n1#6:465\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderDepartmentFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderDepartmentFragment\n*L\n78#1:410,15\n80#1:425,3\n103#1:428,7\n104#1:435,6\n198#1:441,11\n325#1:452,11\n325#1:463,2\n325#1:466\n325#1:467\n325#1:465\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment */
public final class AdditionalOrderDepartmentFragment extends C25185o<C36739k0> {
    @C12579k

    /* renamed from: x */
    public static final C24922a f61726x = new C24922a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f61727y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f61728z = "AdditionalOrderDepartmentFragment";
    @Inject

    /* renamed from: f */
    public C28796c f61729f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61730g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61731v = new C19766m(C11342l0.m43547d(C24982b.class), new AdditionalOrderDepartmentFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: w */
    public C37370b f61732w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment$a */
    public static final class C24922a {
        public /* synthetic */ C24922a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24922a() {
        }
    }

    public AdditionalOrderDepartmentFragment() {
        super(C249211.f61733a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24934xcbc1d231(new C24933xcbc1d230(this)));
        this.f61730g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AdditionalOrderDepartmentViewModel.class), new C24935xcbc1d232(b), new C24936xcbc1d233((C11289a) null, b), new C24937xcbc1d234(this, b));
    }

    /* renamed from: J */
    public final void mo72671J(OfferProductModel offerProductModel, int i) {
        mo72676d1().sendIntent(new C26847b.C26857c.C26861d(offerProductModel, (Integer) null, 2, (DefaultConstructorMarker) null));
        mo72676d1().mo77647J(mo72673a1().mo121689Q(), offerProductModel, offerProductModel.mo121519p0(), i);
    }

    /* renamed from: Y */
    public final void mo72672Y(OfferProductModel offerProductModel, int i) {
        if (!offerProductModel.mo121497A1()) {
            mo72676d1().sendIntent(new C26847b.C26857c.C26859b(offerProductModel));
            mo72676d1().mo77649P(offerProductModel, i);
            return;
        }
        mo72676d1().sendIntent(new C26847b.C26857c.C26862e(offerProductModel));
        mo72676d1().mo77651a0(offerProductModel, i);
    }

    /* renamed from: a1 */
    public final OfferDepartmentModel mo72673a1() {
        return mo72675c1().mo72776e().mo121907e();
    }

    /* renamed from: b1 */
    public final List<OfferProductModel> mo72674b1() {
        return mo72675c1().mo72776e().mo121909f();
    }

    /* renamed from: c1 */
    public final C24982b mo72675c1() {
        return (C24982b) this.f61731v.getValue();
    }

    /* renamed from: d1 */
    public final AdditionalOrderDepartmentViewModel mo72676d1() {
        return (AdditionalOrderDepartmentViewModel) this.f61730g.getValue();
    }

    /* renamed from: e1 */
    public final void mo72677e1(List<? extends OfferProductModel> list) {
        C37370b bVar = this.f61732w;
        if (bVar != null) {
            bVar.setList(mo72688n1(list));
        }
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36739k0) getBinding()).f91113g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAdditionalOrdersDepartmentError");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36739k0) getBinding()).f91113g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAdditionalOrdersDepartmentError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo72678f1(OfferProductModel offerProductModel) {
        mo72676d1().sendIntent(new C26847b.C26857c.C26863f(offerProductModel));
    }

    /* renamed from: g1 */
    public final void mo72679g1() {
        hideLoading();
        hideErrorView();
        C28500r.C28501a.m118419a(this, (Integer) null, (Integer) null, (Integer) null, (Integer) null, true, false, (C11289a) null, 111, (Object) null);
        showEmpty();
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f61729f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72681h1(java.lang.Throwable r28) {
        /*
            r27 = this;
            r14 = r27
            r2 = r28
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r14.mo72677e1(r0)
            goto L_0x0227
        L_0x0011:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x004a
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r2 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r2
            java.lang.String r3 = r2.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x004a:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x0077
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = r2
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r2 = r27.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r2)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x0077:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x00a4
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = r2
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(exception.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x00a4:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            r7 = 1
            if (r0 == 0) goto L_0x00ab
            r0 = r7
            goto L_0x00ad
        L_0x00ab:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x00ad:
            if (r0 == 0) goto L_0x00b1
            r0 = r7
            goto L_0x00b3
        L_0x00b1:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketSlotOutdatedThrowable
        L_0x00b3:
            if (r0 == 0) goto L_0x00d6
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.basket_error_closed_store)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x00d6:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            if (r0 == 0) goto L_0x00dc
            r0 = r7
            goto L_0x00de
        L_0x00dc:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketAdditionalOrderSlotError
        L_0x00de:
            if (r0 == 0) goto L_0x00e2
            r0 = r7
            goto L_0x00e4
        L_0x00e2:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketOrderIdNotFoundedError
        L_0x00e4:
            r8 = 0
            r9 = 0
            if (r0 == 0) goto L_0x0124
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Throwable r2 = r28.getCause()
            boolean r3 = r2 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x00f7
            r8 = r2
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r8
        L_0x00f7:
            if (r8 == 0) goto L_0x00fe
            int r2 = r8.mo83810a()
            goto L_0x00ff
        L_0x00fe:
            r2 = r9
        L_0x00ff:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r9] = r2
            r2 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r14.getString(r2, r0)
            java.lang.String r0 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x0124:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r0 == 0) goto L_0x0179
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r0 = java.util.Locale.getDefault()
            r3 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r3 = r14.getString(r3)
            java.lang.String r4 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.carrefour.fid.android.core.io.ShoppingListThrowable r2 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r2
            java.lang.Throwable r2 = r2.getCause()
            boolean r5 = r2 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r5 == 0) goto L_0x014b
            r8 = r2
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r8
        L_0x014b:
            if (r8 == 0) goto L_0x0152
            int r2 = r8.mo83810a()
            goto L_0x0153
        L_0x0152:
            r2 = r9
        L_0x0153:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r9] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r7)
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            java.lang.String r0 = "format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x0179:
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r0 == 0) goto L_0x017f
            r0 = r7
            goto L_0x0181
        L_0x017f:
            boolean r0 = r2 instanceof java.io.IOException
        L_0x0181:
            if (r0 == 0) goto L_0x01c2
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r28.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Throwable r1 = r28.getCause()
            if (r1 != 0) goto L_0x0195
            r17 = r2
            goto L_0x0197
        L_0x0195:
            r17 = r1
        L_0x0197:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0227
        L_0x01c2:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            if (r2 == 0) goto L_0x01cb
            java.lang.String r1 = r28.getMessage()
            goto L_0x01cc
        L_0x01cb:
            r1 = r8
        L_0x01cc:
            if (r1 != 0) goto L_0x01d0
            java.lang.String r1 = ""
        L_0x01d0:
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r28
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            r27.hideLoading()
            r27.hideEmpty()
            com.carrefour.fid.android.design.components.widgets.MessageComponent$a r1 = new com.carrefour.fid.android.design.components.widgets.MessageComponent$a
            android.content.Context r0 = r27.requireContext()
            r2 = 2131231271(0x7f080227, float:1.8078618E38)
            android.graphics.drawable.Drawable r16 = androidx.core.content.C17318d.m79726i(r0, r2)
            r0 = 2131951890(0x7f130112, float:1.9540207E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r2 = "getString(R.string.addit…kout_error_message_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r2 = 2131951889(0x7f130111, float:1.9540205E38)
            java.lang.String r18 = r14.getString(r2)
            r19 = 0
            r20 = 0
            r2 = 2131952813(0x7f1304ad, float:1.954208E38)
            java.lang.String r21 = r14.getString(r2)
            com.carrefour.fid.android.design.components.widgets.MessageComponent$Type r22 = com.carrefour.fid.android.design.components.widgets.MessageComponent.Type.ERROR
            r23 = 0
            r24 = 0
            r25 = 384(0x180, float:5.38E-43)
            r26 = 0
            r15 = r1
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r27
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118421c(r0, r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r14, r9, r7, r8)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment.mo72681h1(java.lang.Throwable):void");
    }

    /* renamed from: i1 */
    public final void mo72682i1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.BASKET_BUILDER, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentKt.m118835w(this, (String) null, new AdditionalOrderDepartmentFragment$handleOnMixingPressed$1(this), 1, (Object) null);
        mo72690o1(offerProductModel, false);
        mo72676d1().mo77656q(mo72673a1().mo121689Q());
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36739k0) getBinding()).f91108b.setContent(C8553b.m31049c(-1392134419, true, new AdditionalOrderDepartmentFragment$initHeader$1(this)));
    }

    /* renamed from: j1 */
    public final void mo72684j1(List<? extends OfferModel> list) {
        if (list.isEmpty()) {
            mo72679g1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        ((C36739k0) getBinding()).f91110d.setVisibility(0);
        C37370b bVar = this.f61732w;
        if (bVar != null) {
            bVar.setList(mo72688n1(list));
        }
        AdditionalOrderDepartmentViewModel d1 = mo72676d1();
        String Q = mo72673a1().mo121689Q();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        d1.mo77645E(Q, arrayList);
    }

    /* renamed from: k1 */
    public final void mo72685k1(C26847b.C26848a aVar) {
        if (aVar instanceof C26847b.C26848a.C26849a) {
            mo72681h1(((C26847b.C26848a.C26849a) aVar).mo77925d());
        } else if (aVar instanceof C26847b.C26848a.C26851c) {
            C26847b.C26848a.C26851c cVar = (C26847b.C26848a.C26851c) aVar;
            QuantityBackDropFragment.f62741v.mo74287a(cVar.mo77944h(), cVar.mo77943g(), BasketType.BASKET_V4_ADDITIONAL_ORDER).show(requireActivity().mo57175g0(), (String) null);
        } else if (aVar instanceof C26847b.C26848a.C26850b) {
            C26847b.C26848a.C26850b bVar = (C26847b.C26848a.C26850b) aVar;
            getNavigator().mo83838n(C19736g.m91827a(this), OfferProductModelKt.m159574W(bVar.mo77934f()), bVar.mo77932e());
        }
    }

    /* renamed from: l1 */
    public final void mo72686l1(C26847b.C26852b bVar) {
        if (bVar instanceof C26847b.C26852b.C26855c) {
            mo72687m1(((C26847b.C26852b.C26855c) bVar).isLoading());
        } else if (bVar instanceof C26847b.C26852b.C26856d) {
            List<OfferModel> h = ((C26847b.C26852b.C26856d) bVar).mo77956h();
            if (h == null) {
                h = CollectionsKt__CollectionsKt.m40441E();
            }
            mo72684j1(h);
        }
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36739k0) getBinding()).f91111e;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAdditionalOrderDepartmentPreview");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo72687m1(boolean z) {
        if (z) {
            ((C36739k0) getBinding()).f91110d.setVisibility(8);
            hideEmpty();
            hideErrorView();
            showLoading();
            return;
        }
        hideLoading();
    }

    /* renamed from: n1 */
    public final List<C37369a> mo72688n1(List<? extends OfferModel> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            OfferModel offerModel = (OfferModel) next;
            if (offerModel instanceof OfferProductModel) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                obj = C38510j.m159764b((OfferProductModel) offerModel, resources, new AdditionalOrderDepartmentFragment$toListable$1$1(this, offerModel, i), new AdditionalOrderDepartmentFragment$toListable$1$2(this, offerModel, i), new AdditionalOrderDepartmentFragment$toListable$1$3(this, offerModel, i), new AdditionalOrderDepartmentFragment$toListable$1$4(this, offerModel), new AdditionalOrderDepartmentFragment$toListable$1$5(this, offerModel), new AdditionalOrderDepartmentFragment$toListable$1$6(this, offerModel), new AdditionalOrderDepartmentFragment$toListable$1$7(this, offerModel), false, false, false, false, (C11289a) null, 7680, (Object) null);
            } else if (offerModel instanceof C37369a) {
                obj = (C37369a) offerModel;
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public final void mo72689o0(OfferProductModel offerProductModel, int i) {
        if (offerProductModel.mo121519p0() == 0) {
            mo72676d1().sendIntent(new C26847b.C26857c.C26858a(offerProductModel));
            mo72676d1().mo77650Z(offerProductModel, 1, i);
            return;
        }
        int p0 = offerProductModel.mo121519p0();
        FragmentExtensionKt.m58759j(this, new AdditionalOrderDepartmentFragment$handleAtcPressed$1(this));
        mo72676d1().mo77648N(offerProductModel, p0);
        mo72676d1().sendIntent(new C26847b.C26857c.C26865h(offerProductModel, offerProductModel.mo121519p0()));
    }

    /* renamed from: o1 */
    public final void mo72690o1(OfferProductModel offerProductModel, boolean z) {
        OfferListAdapter offerListAdapter;
        if (offerProductModel != null) {
            offerProductModel.mo121745l2(Boolean.valueOf(z));
            RecyclerView.Adapter adapter = ((C36739k0) getBinding()).f91110d.getAdapter();
            C11079d2 d2Var = null;
            if (adapter instanceof OfferListAdapter) {
                offerListAdapter = (OfferListAdapter) adapter;
            } else {
                offerListAdapter = null;
            }
            if (offerListAdapter != null) {
                offerListAdapter.mo74171x(offerProductModel);
                d2Var = C11079d2.f28267a;
            }
            if (d2Var == null) {
                C28935i.m119705e(C28935i.f70940a, "No adapter available", (Throwable) null, 0, 6, (Object) null);
            }
        }
    }

    public void onDestroyView() {
        RecyclerView recyclerView = ((C36739k0) getBinding()).f91110d;
        recyclerView.setAdapter((RecyclerView.Adapter) null);
        recyclerView.setLayoutManager((RecyclerView.C20076o) null);
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        mo72676d1().sendIntent(new C26847b.C26857c.C26864g(true));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        RecyclerView recyclerView = ((C36739k0) getBinding()).f91110d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAdditionalOrdersDepartmentPreview");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f61732w = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        AdditionalOrderDepartmentViewModel d1 = mo72676d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24928xc1544f1(this, d1, (C11045c) null, this), 3, (Object) null);
        AdditionalOrderDepartmentViewModel d12 = mo72676d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24923x2b1d94ba(this, d12, (C11045c) null, this), 3, (Object) null);
        AdditionalOrderDepartmentViewModel d13 = mo72676d1();
        String Q = mo72673a1().mo121689Q();
        d13.mo77646H("mes-produits", "recommande-pour-vous-" + Q, "mes-produits");
        mo72676d1().sendIntent(new C26847b.C26857c.C26860c(mo72674b1()));
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f61729f = cVar;
    }

    /* renamed from: z */
    public final void mo72692z(OfferProductModel offerProductModel) {
        mo72690o1(offerProductModel, false);
        mo72676d1().mo77652b(mo72673a1().mo121689Q());
    }
}
