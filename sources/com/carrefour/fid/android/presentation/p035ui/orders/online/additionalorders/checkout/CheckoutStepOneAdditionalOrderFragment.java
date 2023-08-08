package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36800q1;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.C37953b;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel;
import com.carrefour.fid.android.presentation.models.OfferClearModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23436w;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.BasketAdditionalOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import com.carrefour.fid.android.presentation.p035ui.product.list.C25450a;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26916f;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.C10978t;
import kotlin.collections.C10998z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007*\u0001J\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u0006H\u0002J\b\u0010%\u001a\u00020\u0006H\u0002J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0002J\u001a\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020\u0006H\u0014J\b\u0010/\u001a\u00020\u0006H\u0014J\b\u00100\u001a\u00020,H\u0016J\b\u00102\u001a\u000201H\u0016J\u0018\u00106\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020&H\u0016J\u0018\u00107\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020&H\u0016J\u0018\u00108\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020&H\u0016J\u0018\u00109\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020&H\u0016R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/q1;", "Lcom/carrefour/fid/android/presentation/ui/models/a$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/f$b;", "state", "Lkotlin/d2;", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/f$a;", "event", "k1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/f$a$d;", "h1", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basket", "", "showPreparationFees", "e1", "Landroid/os/Bundle;", "savedInstanceState", "X0", "", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "g1", "f1", "isLoading", "d1", "", "throwable", "b1", "", "message", "r1", "isVisible", "c1", "p1", "i1", "", "countProductInList", "n1", "Landroid/view/View;", "view", "onViewCreated", "Landroid/view/ViewStub;", "errorMessageLayout", "m1", "Y0", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "productPosition", "o0", "J", "Y", "D", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "f", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderViewModel;", "g", "Lkotlin/z;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/t;", "v", "Landroidx/navigation/m;", "Z0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/t;", "navArg", "com/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderFragment$basketCallback$1", "w", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderFragment$basketCallback$1;", "basketCallback", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStepOneAdditionalOrderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepOneAdditionalOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,487:1\n48#2,9:488\n42#3,3:497\n168#4,7:500\n183#4,6:507\n1747#5,3:513\n1559#5:516\n1590#5,4:517\n*S KotlinDebug\n*F\n+ 1 CheckoutStepOneAdditionalOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderFragment\n*L\n83#1:488,9\n86#1:497,3\n135#1:500,7\n136#1:507,6\n324#1:513,3\n333#1:516\n333#1:517,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment */
public final class CheckoutStepOneAdditionalOrderFragment extends C25148p0<C36800q1> implements C24646a.C24647a {

    /* renamed from: x */
    public static final int f61850x = 8;
    @C12580l

    /* renamed from: f */
    public C37370b f61851f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61852g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61853v = new C19766m(C11342l0.m43547d(C25155t.class), new C25053x75295f9c(this));
    @C12579k

    /* renamed from: w */
    public final CheckoutStepOneAdditionalOrderFragment$basketCallback$1 f61854w = new CheckoutStepOneAdditionalOrderFragment$basketCallback$1(this);

    public CheckoutStepOneAdditionalOrderFragment() {
        super(C250391.f61855a);
        C11677z c = C10864b0.m38748c(new C25050x808a0161(this, R.id.checkout_additional_order_graph));
        this.f61852g = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CheckoutStepOneAdditionalOrderViewModel.class), new C25051x808a0162(c, (C11510n) null), new C25052x808a0163(this, c, (C11510n) null));
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C36800q1 m108568T0(CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment) {
        return (C36800q1) checkoutStepOneAdditionalOrderFragment.getBinding();
    }

    /* renamed from: j1 */
    public static final void m108572j1(CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment) {
        Intrinsics.checkNotNullParameter(checkoutStepOneAdditionalOrderFragment, "this$0");
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(checkoutStepOneAdditionalOrderFragment, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72756g1(true);
        }
    }

    /* renamed from: o1 */
    public static final void m108573o1(int i, CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment, View view, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(checkoutStepOneAdditionalOrderFragment, "this$0");
        if (i <= 3 || i3 < i5) {
            checkoutStepOneAdditionalOrderFragment.mo72893p1();
        } else if (i3 > i5) {
            checkoutStepOneAdditionalOrderFragment.mo72888i1();
        }
    }

    /* renamed from: q1 */
    public static final void m108574q1(CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment) {
        Intrinsics.checkNotNullParameter(checkoutStepOneAdditionalOrderFragment, "this$0");
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(checkoutStepOneAdditionalOrderFragment, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72756g1(false);
        }
    }

    /* renamed from: D */
    public void mo68147D(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
    }

    /* renamed from: J */
    public void mo68148J(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        mo72880a1().sendIntent(new C26916f.C26932c.C26939g(offerProductModel, (Integer) null, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: X0 */
    public final void mo72877X0(Bundle bundle) {
        RecyclerView recyclerView = ((C36800q1) getBinding()).f91523d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listFragmentBasket");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "requireContext().theme");
        CheckoutStepOneAdditionalOrderFragment$basketCallback$1 checkoutStepOneAdditionalOrderFragment$basketCallback$1 = this.f61854w;
        C25056x4dffa850 checkoutStepOneAdditionalOrderFragment$bindUiView$appViewBinder$1 = C25056x4dffa850.f61866f;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C25450a aVar = new C25450a(recyclerView, resources, theme, this, checkoutStepOneAdditionalOrderFragment$basketCallback$1, (C25412b) null, checkoutStepOneAdditionalOrderFragment$bindUiView$appViewBinder$1, C19501x.m90847a(viewLifecycleOwner));
        RecyclerView recyclerView2 = ((C36800q1) getBinding()).f91523d;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.listFragmentBasket");
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        Resources.Theme theme2 = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme2, "requireContext().theme");
        C23436w wVar = new C23436w(recyclerView2, resources2, theme2, this.f61854w, aVar);
        RecyclerView recyclerView3 = ((C36800q1) getBinding()).f91523d;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "binding.listFragmentBasket");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f61851f = C37373c.m153543a(recyclerView3, requireContext, wVar);
        if (bundle == null) {
            C19234h0 u = getChildFragmentManager().mo56909u();
            u.mo57202D(R.id.coordinator_fragment_basket, CheckoutStepOneBottomSheetFragment.f61867v.mo72914a(), CheckoutStepOneBottomSheetFragment.f61869x);
            u.mo57052q();
        }
        C19501x.m90847a(this).mo57478d(new CheckoutStepOneAdditionalOrderFragment$bindUiView$2(this, (C11045c<? super CheckoutStepOneAdditionalOrderFragment$bindUiView$2>) null));
    }

    /* renamed from: Y */
    public void mo68150Y(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        if (!offerProductModel.mo121497A1()) {
            mo72880a1().sendIntent(new C26916f.C26932c.C26934b(offerProductModel));
        } else {
            mo72880a1().sendIntent(new C26916f.C26932c.C26940h(offerProductModel));
        }
    }

    /* renamed from: Y0 */
    public void mo72878Y0() {
        C19232h activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: Z0 */
    public final C25155t mo72879Z0() {
        return (C25155t) this.f61853v.getValue();
    }

    /* renamed from: a1 */
    public final CheckoutStepOneAdditionalOrderViewModel mo72880a1() {
        return (CheckoutStepOneAdditionalOrderViewModel) this.f61852g.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72881b1(java.lang.Throwable r28) {
        /*
            r27 = this;
            r14 = r27
            r6 = r28
            r7 = 0
            r14.mo72883d1(r7)
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketNotFound
            if (r0 == 0) goto L_0x0011
            r27.mo72885f1()
            goto L_0x01a8
        L_0x0011:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0038
            com.carrefour.fid.android.shared.util.i r8 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r9 = r28.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r1)
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r8, r9, r10, r11, r12, r13)
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r14.mo72894r1(r0)
            goto L_0x01a8
        L_0x0038:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x0065
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = r6
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(throwable.error.resourceId)"
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
            goto L_0x01a8
        L_0x0065:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r8 = 1
            if (r0 == 0) goto L_0x006c
            r0 = r8
            goto L_0x006e
        L_0x006c:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketAdditionalOrderSlotError
        L_0x006e:
            if (r0 == 0) goto L_0x0072
            r0 = r8
            goto L_0x0074
        L_0x0072:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketOrderIdNotFoundedError
        L_0x0074:
            r9 = 0
            if (r0 == 0) goto L_0x00a3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Throwable r1 = r28.getCause()
            boolean r2 = r1 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r2 == 0) goto L_0x0084
            r9 = r1
            com.carrefour.fid.android.shared.io.ResponseThrowable r9 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r9
        L_0x0084:
            if (r9 == 0) goto L_0x008b
            int r1 = r9.mo83810a()
            goto L_0x008c
        L_0x008b:
            r1 = r7
        L_0x008c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r7] = r1
            r1 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r0 = r14.getString(r1, r0)
            java.lang.String r1 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r14.mo72894r1(r0)
            goto L_0x01a8
        L_0x00a3:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r0 == 0) goto L_0x00c8
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r28.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Throwable r1 = r28.getCause()
            if (r1 != 0) goto L_0x00b9
            r17 = r6
            goto L_0x00bb
        L_0x00b9:
            r17 = r1
        L_0x00bb:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            goto L_0x01a8
        L_0x00c8:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x00e5
            r0 = r6
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r1 = r27.requireContext()
            java.lang.String r2 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r1)
            r14.mo72894r1(r0)
            goto L_0x01a8
        L_0x00e5:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            if (r0 == 0) goto L_0x00eb
            r0 = r8
            goto L_0x00ed
        L_0x00eb:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x00ed:
            if (r0 == 0) goto L_0x00f1
            r0 = r8
            goto L_0x00f3
        L_0x00f1:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketSlotOutdatedThrowable
        L_0x00f3:
            if (r0 == 0) goto L_0x0106
            r0 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "getString(R.string.basket_error_closed_store)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r14.mo72894r1(r0)
            goto L_0x01a8
        L_0x0106:
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r0 == 0) goto L_0x010c
            r0 = r8
            goto L_0x010e
        L_0x010c:
            boolean r0 = r6 instanceof java.io.IOException
        L_0x010e:
            if (r0 == 0) goto L_0x013f
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r28.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Throwable r1 = r28.getCause()
            if (r1 != 0) goto L_0x0122
            r17 = r6
            goto L_0x0124
        L_0x0122:
            r17 = r1
        L_0x0124:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r14.mo72894r1(r0)
            goto L_0x01a8
        L_0x013f:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r28.getMessage()
            java.lang.String r10 = ""
            if (r1 != 0) goto L_0x014a
            r1 = r10
        L_0x014a:
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r28
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            r27.hideEmpty()
            r14.mo72882c1(r7)
            com.carrefour.fid.android.design.components.widgets.MessageComponent$a r1 = new com.carrefour.fid.android.design.components.widgets.MessageComponent$a
            android.content.Context r0 = r27.requireContext()
            r2 = 2131231396(0x7f0802a4, float:1.8078872E38)
            android.graphics.drawable.Drawable r16 = androidx.core.content.C17318d.m79726i(r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = r28.getMessage()
            if (r2 != 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r10 = r2
        L_0x016f:
            r0[r7] = r10
            r2 = 2131951975(0x7f130167, float:1.954038E38)
            java.lang.String r0 = r14.getString(r2, r0)
            java.lang.String r2 = "getString(R.string.baske…owable.message.orEmpty())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r18 = 0
            r2 = 2131952813(0x7f1304ad, float:1.954208E38)
            java.lang.String r19 = r14.getString(r2)
            r20 = 0
            r21 = 0
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
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r14, r7, r8, r9)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment.mo72881b1(java.lang.Throwable):void");
    }

    /* renamed from: c1 */
    public final void mo72882c1(boolean z) {
        if (z) {
            RecyclerView recyclerView = ((C36800q1) getBinding()).f91523d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listFragmentBasket");
            ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
            CoordinatorLayout coordinatorLayout = ((C36800q1) getBinding()).f91521b;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.coordinatorFragmentBasket");
            ViewKt.m152123e(coordinatorLayout, (Integer) null, false, (C11289a) null, 7, (Object) null);
            return;
        }
        RecyclerView recyclerView2 = ((C36800q1) getBinding()).f91523d;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.listFragmentBasket");
        ViewKt.m152126h(recyclerView2, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
        CoordinatorLayout coordinatorLayout2 = ((C36800q1) getBinding()).f91521b;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "binding.coordinatorFragmentBasket");
        ViewKt.m152126h(coordinatorLayout2, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
    }

    /* renamed from: d1 */
    public final void mo72883d1(boolean z) {
        if (z) {
            hideEmpty();
            hideErrorView();
            showLoading();
            mo72882c1(false);
            return;
        }
        hideLoading();
    }

    /* renamed from: e1 */
    public final void mo72884e1(BasketDomain basketDomain, boolean z) {
        Integer num;
        BasketAmounts b = C37953b.m155980b(basketDomain.mo115498v());
        BasketPromotionCode c = C37953b.m155981c(basketDomain.mo115462E());
        BasketReturnableBags H = basketDomain.mo115465H();
        List<BasketOfferDomain> B = basketDomain.mo115459B();
        if (B != null) {
            num = Integer.valueOf(B.size());
        } else {
            num = null;
        }
        Integer num2 = num;
        if (b != null && num2 != null) {
            ((C36800q1) getBinding()).f91524e.setContent(C8553b.m31049c(902673406, true, new CheckoutStepOneAdditionalOrderFragment$handleBasketResult$1(b, c, H, num2, z)));
        }
    }

    public /* bridge */ /* synthetic */ C11079d2 emptyFunction() {
        mo72878Y0();
        return C11079d2.f28267a;
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36800q1) getBinding()).f91526g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentBasketEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36800q1) getBinding()).f91527h;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentBasketError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo72885f1() {
        hideErrorView();
        C28500r.C28501a.m118419a(this, (Integer) null, (Integer) null, (Integer) null, (Integer) null, true, false, (C11289a) null, 111, (Object) null);
        showEmpty();
        mo72882c1(false);
    }

    /* renamed from: g1 */
    public final void mo72886g1(List<? extends OfferModel> list) {
        boolean z;
        Object obj;
        boolean z2;
        List<C37369a> list2;
        if (list.isEmpty()) {
            mo72885f1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        C37370b bVar = this.f61851f;
        int i = 0;
        if (bVar == null || (list2 = bVar.getList()) == null || !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((OfferModel) it.next()) instanceof OfferBasketContainAlcoholModel) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                mo72880a1().mo77845w();
            }
        }
        Iterable z4 = CollectionsKt___CollectionsKt.m40723z4(list, new OfferClearModel());
        mo72892n1(C10998z.m42387a1(z4, OfferProductModel.class).size());
        C37370b bVar2 = this.f61851f;
        if (bVar2 != null) {
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(z4, 10));
            for (Object next : z4) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferModel offerModel = (OfferModel) next;
                if (offerModel instanceof OfferProductModel) {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    obj = C38510j.m159764b((OfferProductModel) offerModel, resources, new CheckoutStepOneAdditionalOrderFragment$handleOfferListResult$2$1(this, offerModel, i), new CheckoutStepOneAdditionalOrderFragment$handleOfferListResult$2$2(this, offerModel, i), new CheckoutStepOneAdditionalOrderFragment$handleOfferListResult$2$3(this, offerModel, i), new CheckoutStepOneAdditionalOrderFragment$handleOfferListResult$2$4(this, offerModel, i), (C11289a) null, (C11289a) null, (C11289a) null, true, true, true, false, (C11289a) null, 6336, (Object) null);
                } else if (offerModel instanceof C37369a) {
                    obj = (C37369a) offerModel;
                } else {
                    throw new IllegalStateException("Unknown model type: " + C11342l0.m43547d(offerModel.getClass()).mo22848s());
                }
                arrayList.add(obj);
                i = i2;
            }
            bVar2.setList(arrayList);
        }
        mo72882c1(true);
    }

    /* renamed from: h1 */
    public final void mo72887h1(C26916f.C26917a.C26921d dVar) {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118835w(this, (String) null, new C25058xcd7f69a0(this), 1, (Object) null);
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, dVar.mo78184h(), dVar.mo78183g(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: i1 */
    public final void mo72888i1() {
        C36800q1 q1Var = (C36800q1) getBinding();
        q1Var.f91522c.setGuidelineEnd(0);
        CoordinatorLayout coordinatorLayout = q1Var.f91521b;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "coordinatorFragmentBasket");
        ViewKt.m152131m(coordinatorLayout, new C25151r(this));
    }

    /* renamed from: k1 */
    public final void mo72889k1(C26916f.C26917a aVar) {
        C26916f.C26917a aVar2 = aVar;
        if (aVar2 instanceof C26916f.C26917a.C26920c) {
            mo72881b1(((C26916f.C26917a.C26920c) aVar2).mo78173d());
        } else if (aVar2 instanceof C26916f.C26917a.C26921d) {
            mo72887h1((C26916f.C26917a.C26921d) aVar2);
        } else if (aVar2 instanceof C26916f.C26917a.C26919b) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(this, C25157u.f61993a.mo73114a(((C26916f.C26917a.C26919b) aVar2).mo78167d()));
        } else if (aVar2 instanceof C26916f.C26917a.C26918a) {
            ((C36800q1) getBinding()).f91523d.mo59503O1(((C26916f.C26917a.C26918a) aVar2).mo78161d());
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.checkout_basket_contain_alcohol_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…_contain_alcohol_message)");
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            mo72880a1().mo77843u(false);
        }
    }

    /* renamed from: l1 */
    public final void mo72890l1(C26916f.C26922b bVar) {
        if (bVar instanceof C26916f.C26922b.C26931i) {
            mo72886g1(((C26916f.C26922b.C26931i) bVar).mo78222h());
        } else if (bVar instanceof C26916f.C26922b.C26929g) {
            mo72883d1(((C26916f.C26922b.C26929g) bVar).isLoading());
        } else if (bVar instanceof C26916f.C26922b.C26925c) {
            mo72885f1();
        } else if (bVar instanceof C26916f.C26922b.C26923a) {
            C26916f.C26922b.C26923a aVar = (C26916f.C26922b.C26923a) bVar;
            mo72884e1(aVar.mo78192i(), aVar.mo78193j());
        }
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36800q1) getBinding()).f91525f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFragmentBasket");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public void mo72891m1() {
        mo72880a1().sendIntent(new C26916f.C26932c.C26941i(false, 1, (DefaultConstructorMarker) null));
    }

    /* renamed from: n1 */
    public final void mo72892n1(int i) {
        ((C36800q1) getBinding()).f91523d.setOnScrollChangeListener(new C25153s(i, this));
    }

    /* renamed from: o0 */
    public void mo68167o0(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo72880a1().sendIntent(new C26916f.C26932c.C26933a(offerProductModel));
            mo72880a1().mo77650Z(offerProductModel, 1, i);
            return;
        }
        com.carrefour.fid.android.shared.extension.FragmentKt.m118835w(this, (String) null, new CheckoutStepOneAdditionalOrderFragment$handleAtcPressed$1(this, offerProductModel, p0), 1, (Object) null);
        mo72880a1().sendIntent(new C26916f.C26932c.C26942j(offerProductModel, offerProductModel.mo121519p0()));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72877X0(bundle);
        CheckoutStepOneAdditionalOrderViewModel a1 = mo72880a1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25045x9634c28b(this, a1, (C11045c) null, this), 3, (Object) null);
        CheckoutStepOneAdditionalOrderViewModel a12 = mo72880a1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25040xb53d1254(this, a12, (C11045c) null, this), 3, (Object) null);
        CheckoutStepOneAdditionalOrderViewModel a13 = mo72880a1();
        a13.sendIntent(new C26916f.C26932c.C26938f(mo72879Z0().mo73100e()));
        a13.sendIntent(new C26916f.C26932c.C26941i(false, 1, (DefaultConstructorMarker) null));
        a13.sendScreenView();
        a13.mo77841l();
    }

    /* renamed from: p1 */
    public final void mo72893p1() {
        C36800q1 q1Var = (C36800q1) getBinding();
        q1Var.f91522c.setGuidelineEnd(C28746b0.m119031b(76));
        CoordinatorLayout coordinatorLayout = q1Var.f91521b;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "coordinatorFragmentBasket");
        ViewKt.m152132n(coordinatorLayout, new C25149q(this));
    }

    /* renamed from: r1 */
    public final void mo72894r1(String str) {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, NotificationComponent.Variant.ERROR, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        RecyclerView.Adapter adapter = ((C36800q1) getBinding()).f91523d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo72891m1();
        return C11079d2.f28267a;
    }
}
