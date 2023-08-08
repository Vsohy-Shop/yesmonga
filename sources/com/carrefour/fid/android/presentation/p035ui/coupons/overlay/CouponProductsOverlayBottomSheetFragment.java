package com.carrefour.fid.android.presentation.p035ui.coupons.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36850v1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.C26314e;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10978t;
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
@C11076d0(mo22515d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0002J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0002J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\u0012\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\u001a\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8BX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8BX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8BX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006V"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/coupons/overlay/CouponProductsOverlayBottomSheetFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/v1;", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "state", "Lkotlin/d2;", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetViewModel$b;", "uiEvent", "h1", "", "", "gtinsList", "d1", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "p1", "i1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "productPosition", "o0", "J", "Y", "D", "o1", "", "withNoArticles", "l1", "", "exception", "g1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/e;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/e;", "Y0", "()Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/e;", "k1", "(Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/e;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetViewModel;", "v", "Lkotlin/z;", "f1", "()Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetViewModel;", "viewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "Landroid/widget/TextView;", "e1", "()Landroid/widget/TextView;", "titleTextView", "Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent;", "Z0", "()Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent;", "descriptionNotification", "c1", "notificationComponent", "Landroidx/recyclerview/widget/RecyclerView;", "a1", "()Landroidx/recyclerview/widget/RecyclerView;", "listProducts", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "b1", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingView", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponProductsOverlayBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponProductsOverlayBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/CouponProductsOverlayBottomSheetFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n106#2,15:346\n168#3,7:361\n183#3,6:368\n1#4:374\n800#5,11:375\n1559#5:386\n1590#5,4:387\n800#5,11:391\n800#5,11:402\n*S KotlinDebug\n*F\n+ 1 CouponProductsOverlayBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/CouponProductsOverlayBottomSheetFragment\n*L\n78#1:346,15\n95#1:361,7\n96#1:368,6\n147#1:375,11\n148#1:386\n148#1:387,4\n171#1:391,11\n174#1:402,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment */
public final class CouponProductsOverlayBottomSheetFragment extends C23955d<C36850v1> {
    @C12579k

    /* renamed from: x */
    public static final C23896a f60077x = new C23896a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f60078y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f60079z = "couponDetails";
    @Inject

    /* renamed from: f */
    public C28796c f60080f;
    @Inject

    /* renamed from: g */
    public C26314e f60081g;
    @C12579k

    /* renamed from: v */
    public final C11677z f60082v;
    @C12580l

    /* renamed from: w */
    public C37370b f60083w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment$a */
    public static final class C23896a {
        public /* synthetic */ C23896a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final CouponProductsOverlayBottomSheetFragment mo70025a(@C12580l CouponModel couponModel) {
            CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment = new CouponProductsOverlayBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CouponProductsOverlayBottomSheetFragment.f60079z, couponModel);
            couponProductsOverlayBottomSheetFragment.setArguments(bundle);
            return couponProductsOverlayBottomSheetFragment;
        }

        public C23896a() {
        }
    }

    public CouponProductsOverlayBottomSheetFragment() {
        super(C238941.f60084a, C238952.f60085a, false);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23908xcd451c66(new C23907xcd451c65(this)));
        this.f60082v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(OverlayProductsBottomSheetViewModel.class), new C23909xcd451c67(b), new C23910xcd451c68((C11289a) null, b), new C23911xcd451c69(this, b));
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m105739m1(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        couponProductsOverlayBottomSheetFragment.mo70018l1(z);
    }

    /* renamed from: n1 */
    public static final void m105740n1(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment, View view) {
        CouponModel couponModel;
        Intrinsics.checkNotNullParameter(couponProductsOverlayBottomSheetFragment, "this$0");
        Bundle arguments = couponProductsOverlayBottomSheetFragment.getArguments();
        List<String> list = null;
        if (arguments != null) {
            couponModel = (CouponModel) arguments.getParcelable(f60079z);
        } else {
            couponModel = null;
        }
        if (couponModel != null) {
            list = couponModel.mo121437y();
        }
        couponProductsOverlayBottomSheetFragment.mo70009d1(list);
    }

    /* renamed from: D */
    public final void mo70001D(OfferProductModel offerProductModel, int i) {
        mo70004Y0().mo76584g(offerProductModel, i);
        mo70011f1().sendIntent(new OverlayProductsBottomSheetViewModel.C26298c.C26304f(offerProductModel));
    }

    /* renamed from: J */
    public final void mo70002J(OfferProductModel offerProductModel, int i) {
        mo70004Y0().mo76581d(offerProductModel, offerProductModel.mo121519p0(), i);
        mo70011f1().sendIntent(new OverlayProductsBottomSheetViewModel.C26298c.C26302d(offerProductModel, 0));
    }

    /* renamed from: Y */
    public final void mo70003Y(OfferProductModel offerProductModel, int i) {
        if (!offerProductModel.mo121497A1()) {
            mo70011f1().sendIntent(new OverlayProductsBottomSheetViewModel.C26298c.C26300b(offerProductModel));
            mo70004Y0().mo76582e(offerProductModel, i);
            return;
        }
        mo70011f1().sendIntent(new OverlayProductsBottomSheetViewModel.C26298c.C26303e(offerProductModel));
        mo70004Y0().mo76583f(offerProductModel, i);
    }

    @C12579k
    /* renamed from: Y0 */
    public final C26314e mo70004Y0() {
        C26314e eVar = this.f60081g;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: Z0 */
    public final NotificationComponent mo70005Z0() {
        NotificationComponent notificationComponent = ((C36850v1) getBinding()).f91789b;
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "binding.overlayCouponDescriptionNotification");
        return notificationComponent;
    }

    /* renamed from: a1 */
    public final RecyclerView mo70006a1() {
        RecyclerView recyclerView = ((C36850v1) getBinding()).f91791d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.overlayProductsListRecyclerview");
        return recyclerView;
    }

    /* renamed from: b1 */
    public final ShimmerFrameLayout mo70007b1() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36850v1) getBinding()).f91793f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.overlayProductsShimmer");
        return shimmerFrameLayout;
    }

    /* renamed from: c1 */
    public final NotificationComponent mo70008c1() {
        NotificationComponent notificationComponent = ((C36850v1) getBinding()).f91792e;
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "binding.overlayProductsNotification");
        return notificationComponent;
    }

    /* renamed from: d1 */
    public final void mo70009d1(List<String> list) {
        mo70011f1().sendIntent(new OverlayProductsBottomSheetViewModel.C26298c.C26301c(list));
    }

    /* renamed from: e1 */
    public final TextView mo70010e1() {
        TextView textView = ((C36850v1) getBinding()).f91790c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.overlayCouponTitleTextview");
        return textView;
    }

    /* renamed from: f1 */
    public final OverlayProductsBottomSheetViewModel mo70011f1() {
        return (OverlayProductsBottomSheetViewModel) this.f60082v.getValue();
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r12v12, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70012g1(java.lang.Throwable r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            if (r0 == 0) goto L_0x0017
            r2 = 0
            r3 = 2130772018(0x7f010032, float:1.7147143E38)
            r4 = 2130772012(0x7f01002c, float:1.714713E38)
            r5 = 994(0x3e2, float:1.393E-42)
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r11
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58770u(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0160
        L_0x0017:
            boolean r0 = r12 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r0 == 0) goto L_0x0028
            com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment$handleError$1 r12 = new com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment$handleError$1
            r12.<init>(r11)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r11, r12)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r11)
            goto L_0x0160
        L_0x0028:
            boolean r0 = r12 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0053
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r12 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r12
            java.lang.String r3 = r12.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r12 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r11, r12, r0)
            goto L_0x0160
        L_0x0053:
            boolean r0 = r12 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x0071
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r12 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r12
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r12 = r12.mo108325a()
            android.content.Context r1 = r11.requireContext()
            java.lang.String r2 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r12 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r12, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r11, r0, r12)
            goto L_0x0160
        L_0x0071:
            boolean r0 = r12 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x008f
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            com.carrefour.fid.android.core.io.BasketThrowable r12 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r12
            com.carrefour.fid.android.core.type.BasketErrorType r12 = r12.mo108318a()
            int r12 = r12.mo108470q()
            java.lang.String r12 = r11.getString(r12)
            java.lang.String r1 = "getString(exception.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r11, r0, r12)
            goto L_0x0160
        L_0x008f:
            boolean r0 = r12 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00c6
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r12 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r12
            java.lang.Throwable r12 = r12.getCause()
            boolean r3 = r12 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x00a7
            r2 = r12
            com.carrefour.fid.android.shared.io.ResponseThrowable r2 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r2
        L_0x00a7:
            if (r2 == 0) goto L_0x00ae
            int r12 = r2.mo83810a()
            goto L_0x00af
        L_0x00ae:
            r12 = r4
        L_0x00af:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1[r4] = r12
            r12 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r12 = r11.getString(r12, r1)
            java.lang.String r1 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r11, r0, r12)
            goto L_0x0160
        L_0x00c6:
            boolean r0 = r12 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r0 == 0) goto L_0x010c
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r0 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r1 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r1 = java.util.Locale.getDefault()
            r5 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r5 = r11.getString(r5)
            java.lang.String r6 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.carrefour.fid.android.core.io.ShoppingListThrowable r12 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r12
            java.lang.Throwable r12 = r12.getCause()
            boolean r7 = r12 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r7 == 0) goto L_0x00ed
            r2 = r12
            com.carrefour.fid.android.shared.io.ResponseThrowable r2 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r2
        L_0x00ed:
            if (r2 == 0) goto L_0x00f4
            int r12 = r2.mo83810a()
            goto L_0x00f5
        L_0x00f4:
            r12 = r4
        L_0x00f5:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6[r4] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r6, r3)
            java.lang.String r12 = java.lang.String.format(r1, r5, r12)
            java.lang.String r1 = "format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r11, r0, r12)
            goto L_0x0160
        L_0x010c:
            boolean r0 = r12 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r0 == 0) goto L_0x013d
            com.carrefour.fid.android.shared.util.i r5 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r12
            com.carrefour.fid.android.shared.io.NetworkException r0 = (com.carrefour.fid.android.shared.p046io.NetworkException) r0
            java.lang.String r6 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r1)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L_0x0124
            r7 = r12
            goto L_0x0125
        L_0x0124:
            r7 = r0
        L_0x0125:
            r8 = 0
            r9 = 4
            r10 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r5, r6, r7, r8, r9, r10)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r12 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.carrefour.fid.android.shared.extension.C28765l.m119073a(r11, r12, r0)
            goto L_0x0160
        L_0x013d:
            boolean r0 = r12 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x0149
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r11.mo70021p1(r12)
            goto L_0x0160
        L_0x0149:
            if (r12 == 0) goto L_0x0160
            com.carrefour.fid.android.shared.util.i r5 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r12.getMessage()
            if (r0 != 0) goto L_0x0155
            java.lang.String r0 = ""
        L_0x0155:
            r6 = r0
            r8 = 0
            r9 = 4
            r10 = 0
            r7 = r12
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r5, r6, r7, r8, r9, r10)
            m105739m1(r11, r4, r3, r2)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment.mo70012g1(java.lang.Throwable):void");
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f60080f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo70014h1(OverlayProductsBottomSheetViewModel.C26296b bVar) {
        if (bVar instanceof OverlayProductsBottomSheetViewModel.C26296b.C26297a) {
            OverlayProductsBottomSheetViewModel.C26296b.C26297a aVar = (OverlayProductsBottomSheetViewModel.C26296b.C26297a) bVar;
            getNavigator().mo83838n(C19736g.m91827a(this), OfferProductModelKt.m159574W(aVar.mo76524f()), aVar.mo76522e());
        }
    }

    /* renamed from: i1 */
    public final void mo70015i1(List<? extends OfferModel> list) {
        if (list.isEmpty()) {
            mo70018l1(true);
            return;
        }
        mo70005Z0().setVisibility(0);
        mo70007b1().setVisibility(8);
        mo70006a1().setVisibility(0);
        mo70008c1().setVisibility(8);
        mo70021p1(list);
        C26314e Y0 = mo70004Y0();
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        Y0.mo76578a(arrayList);
        C26314e Y02 = mo70004Y0();
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (next2 instanceof OfferProductModel) {
                arrayList2.add(next2);
            }
        }
        Y02.mo76579b(arrayList2);
    }

    /* renamed from: j1 */
    public final void mo70016j1(C26636c cVar) {
        if (cVar.isLoading()) {
            mo70020o1();
        }
        List<OfferModel> m = cVar.mo77398m();
        if (m != null) {
            mo70015i1(m);
        }
        Throwable l = cVar.mo77397l();
        if (l != null) {
            mo70012g1(l);
        }
    }

    /* renamed from: k1 */
    public final void mo70017k1(@C12579k C26314e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f60081g = eVar;
    }

    /* renamed from: l1 */
    public final void mo70018l1(boolean z) {
        int i;
        String str;
        mo70005Z0().setVisibility(8);
        mo70007b1().setVisibility(8);
        mo70006a1().setVisibility(8);
        mo70008c1().setVisibility(0);
        Context requireContext = requireContext();
        if (z) {
            i = R.string.product_coupons_overlay_empty;
        } else {
            i = R.string.product_coupons_overlay_error;
        }
        String string = requireContext.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…erlay_error\n            )");
        if (!z) {
            str = requireContext().getString(R.string.product_mixing_error_retry_action);
        } else {
            str = null;
        }
        NotificationComponent.C37156a aVar = new NotificationComponent.C37156a(string, (String) null, str, false);
        NotificationComponent c1 = mo70008c1();
        c1.mo112945y(NotificationComponent.Variant.ERROR);
        c1.mo112943w(aVar);
        c1.setOnActionClickListener(new C23912a(this));
    }

    /* renamed from: o0 */
    public final void mo70019o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo70011f1().sendIntent(new OverlayProductsBottomSheetViewModel.C26298c.C26299a(offerProductModel));
            mo70004Y0().mo76580c(offerProductModel, 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new CouponProductsOverlayBottomSheetFragment$handleAtcPressed$1(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public final void mo70020o1() {
        mo70005Z0().setVisibility(8);
        mo70007b1().setVisibility(0);
        mo70006a1().setVisibility(8);
        mo70008c1().setVisibility(8);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        CouponModel couponModel;
        String str;
        List<String> y;
        String E;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        List<String> list = null;
        if (arguments != null) {
            couponModel = (CouponModel) arguments.getParcelable(f60079z);
        } else {
            couponModel = null;
        }
        TextView e1 = mo70010e1();
        String str2 = "";
        if (couponModel == null || (str = couponModel.mo121401Q()) == null) {
            str = str2;
        }
        e1.setText(str);
        OverlayProductsBottomSheetViewModel f1 = mo70011f1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C23902xd988f26(this, f1, (C11045c) null, this), 3, (Object) null);
        OverlayProductsBottomSheetViewModel f12 = mo70011f1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C23897x2ca0deef(this, f12, (C11045c) null, this), 3, (Object) null);
        if (!(couponModel == null || (E = couponModel.mo121389E()) == null)) {
            str2 = E;
        }
        boolean z = false;
        NotificationComponent.C37156a aVar = new NotificationComponent.C37156a(str2, (String) null, (String) null, false);
        RecyclerView a1 = mo70006a1();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f60083w = C37373c.m153544b(a1, requireContext, (C37390r) null, 2, (Object) null);
        NotificationComponent Z0 = mo70005Z0();
        Z0.mo112945y(NotificationComponent.Variant.INFO);
        Z0.mo112943w(aVar);
        if (!(couponModel == null || (y = couponModel.mo121437y()) == null || !y.isEmpty())) {
            z = true;
        }
        if (z) {
            mo70018l1(true);
            return;
        }
        if (couponModel != null) {
            list = couponModel.mo121437y();
        }
        mo70009d1(list);
    }

    /* renamed from: p1 */
    public final void mo70021p1(List<? extends OfferModel> list) {
        C37370b bVar = this.f60083w;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof OfferProductModel) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
            int i = 0;
            for (Object next2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferProductModel offerProductModel = (OfferProductModel) next2;
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                arrayList2.add(C38510j.m159764b(offerProductModel, resources, new CouponProductsOverlayBottomSheetFragment$updateProductList$1$1(this, offerProductModel, i), new CouponProductsOverlayBottomSheetFragment$updateProductList$1$2(this, offerProductModel, i), new CouponProductsOverlayBottomSheetFragment$updateProductList$1$3(this, offerProductModel, i), (C11289a) null, (C11289a) null, (C11289a) null, (C11289a) null, false, false, false, false, (C11289a) null, 7888, (Object) null));
                i = i2;
            }
            bVar.setList(arrayList2);
        }
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f60080f = cVar;
    }
}
