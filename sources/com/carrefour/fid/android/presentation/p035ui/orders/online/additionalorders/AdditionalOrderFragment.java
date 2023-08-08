package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.databinding.C36689f0;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListTitle;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38512k;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26875d;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001VB\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002J\u001a\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020\u0004H\u0014J\u0018\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020)H\u0016J\b\u00106\u001a\u00020\u0004H\u0016R\"\u0010>\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010J\u001a\u00020E8BX\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020$0O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006W"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/f0;", "Landroidx/fragment/app/c0;", "Lkotlin/d2;", "m1", "initHeader", "b1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/d$b;", "state", "q1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/d$a;", "event", "p1", "", "isLoading", "l1", "j1", "o1", "isBasketContainsAtLeastOneProduct", "f1", "", "Lcom/carrefour/fid/android/presentation/models/RecommendedProductsByDepartmentModel;", "departments", "h1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "e1", "g1", "n1", "z", "department", "i1", "", "throwable", "k1", "", "message", "s1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/ViewStub;", "emptyLayout", "errorMessageLayout", "r1", "requestKey", "result", "p", "onDestroy", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/e;", "g", "Landroidx/navigation/m;", "c1", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/e;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderViewModel;", "v", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderViewModel;", "viewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "Landroidx/activity/result/g;", "x", "Landroidx/activity/result/g;", "requestCameraPermissionLauncher", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAdditionalOrderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,523:1\n42#2,3:524\n106#3,15:527\n168#4,7:542\n183#4,6:549\n75#5,2:555\n262#6,2:557\n1360#7:559\n1446#7,2:560\n1549#7:562\n1620#7,3:563\n1448#7,3:566\n1#8:569\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderFragment\n*L\n101#1:524,3\n103#1:527,15\n122#1:542,7\n123#1:549,6\n255#1:555,2\n344#1:557,2\n357#1:559\n357#1:560,2\n365#1:562\n365#1:563,3\n357#1:566,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderFragment */
public final class AdditionalOrderFragment extends C25186p<C36689f0> implements C19221c0 {
    @C12579k

    /* renamed from: E0 */
    public static final String f61742E0 = "KEY_LIST_POSITION";
    @C12580l

    /* renamed from: X */
    public static final String f61743X = C11342l0.m43547d(AdditionalOrderFragment.class).mo22848s();
    @C12579k

    /* renamed from: Y */
    public static final String f61744Y = "onDismissAdditionalOrderAfterExitOrExpired";

    /* renamed from: Z */
    public static final int f61745Z = 5;
    @C12579k

    /* renamed from: y */
    public static final C24941a f61746y = new C24941a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f61747z = 8;
    @Inject

    /* renamed from: f */
    public C28796c f61748f;
    @C12579k

    /* renamed from: g */
    public final C19766m f61749g = new C19766m(C11342l0.m43547d(C25166e.class), new AdditionalOrderFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f61750v;
    @C12580l

    /* renamed from: w */
    public C37370b f61751w;
    @C12579k

    /* renamed from: x */
    public final C0302g<String> f61752x;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderFragment$a */
    public static final class C24941a {
        public /* synthetic */ C24941a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final String mo72730a() {
            return AdditionalOrderFragment.f61743X;
        }

        public C24941a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderFragment$b */
    public static final class C24942b implements C0263a<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ AdditionalOrderFragment f61754a;

        public C24942b(AdditionalOrderFragment additionalOrderFragment) {
            this.f61754a = additionalOrderFragment;
        }

        /* renamed from: b */
        public final void mo790a(Boolean bool) {
            Intrinsics.checkNotNullExpressionValue(bool, "isGranted");
            if (bool.booleanValue()) {
                this.f61754a.mo72709d1().sendIntent(C26875d.C26892c.C26901i.f65545a);
            }
        }
    }

    public AdditionalOrderFragment() {
        super(C249401.f61753a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new AdditionalOrderFragment$special$$inlined$viewModels$default$2(new AdditionalOrderFragment$special$$inlined$viewModels$default$1(this)));
        this.f61750v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AdditionalOrderViewModel.class), new AdditionalOrderFragment$special$$inlined$viewModels$default$3(b), new AdditionalOrderFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new AdditionalOrderFragment$special$$inlined$viewModels$default$5(this, b));
        C0302g<String> registerForActivityResult = registerForActivityResult(new C0268b.C0289l(), new C24942b(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f61752x = registerForActivityResult;
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36689f0 m108380Q0(AdditionalOrderFragment additionalOrderFragment) {
        return (C36689f0) additionalOrderFragment.getBinding();
    }

    /* renamed from: b1 */
    public final void mo72707b1() {
        C36689f0 f0Var = (C36689f0) getBinding();
        RecyclerView recyclerView = f0Var.f90784e;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "listAdditionalOrder");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f61751w = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        CountDownTimerComponent countDownTimerComponent = f0Var.f90788i;
        countDownTimerComponent.mo113325B(30, new AdditionalOrderFragment$bindUiView$1$1$1(this, countDownTimerComponent));
        countDownTimerComponent.setOnCancelTimerClickListener(new AdditionalOrderFragment$bindUiView$1$1$2(this));
        MaterialButton materialButton = f0Var.f90783d;
        Intrinsics.checkNotNullExpressionValue(materialButton, "buttonShowBasketAdditionalOrder");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(materialButton), new AdditionalOrderFragment$bindUiView$1$2(this, (C11045c<? super AdditionalOrderFragment$bindUiView$1$2>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24943xade3237c((C11045c) null));
    }

    /* renamed from: c1 */
    public final C25166e mo72708c1() {
        return (C25166e) this.f61749g.getValue();
    }

    /* renamed from: d1 */
    public final AdditionalOrderViewModel mo72709d1() {
        return (AdditionalOrderViewModel) this.f61750v.getValue();
    }

    /* renamed from: e1 */
    public final void mo72710e1(OfferProductModel offerProductModel) {
        if (offerProductModel.mo121519p0() == 0) {
            mo72709d1().sendIntent(new C26875d.C26892c.C26893a(offerProductModel));
            mo72709d1().mo77650Z(offerProductModel, 1, 0);
            return;
        }
        FragmentExtensionKt.m58759j(this, new AdditionalOrderFragment$handleAtcPressed$1(this, offerProductModel, offerProductModel.mo121519p0()));
        mo72709d1().sendIntent(new C26875d.C26892c.C26905m(offerProductModel, offerProductModel.mo121519p0()));
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36689f0) getBinding()).f90786g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAdditionalOrderEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36689f0) getBinding()).f90787h;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubListError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo72711f1(boolean z) {
        int i;
        FrameLayout frameLayout = ((C36689f0) getBinding()).f90789j;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.viewShowBasketAdditionalOrder");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    /* renamed from: g1 */
    public final void mo72712g1(OfferProductModel offerProductModel) {
        mo72709d1().sendIntent(new C26875d.C26892c.C26903k(offerProductModel));
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f61748f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo72714h1(List<RecommendedProductsByDepartmentModel> list) {
        BottomNavActivity bottomNavActivity;
        Bundle L1;
        Parcelable parcelable;
        RecyclerView.C20076o layoutManager;
        if (list.isEmpty()) {
            mo72717j1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        C37370b bVar = this.f61751w;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel : list) {
                List i = C10976s.m41417i();
                String Q = recommendedProductsByDepartmentModel.mo121907e().mo121689Q();
                int size = recommendedProductsByDepartmentModel.mo121909f().size();
                i.add(new ProductCardListTitle.C37368a(Q + C36306e.f89637a + size + ")"));
                Iterable<OfferProductModel> E5 = CollectionsKt___CollectionsKt.m40497E5(recommendedProductsByDepartmentModel.mo121909f(), 5);
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(E5, 10));
                for (OfferProductModel offerProductModel : E5) {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    arrayList2.add(C38512k.m159777a(offerProductModel, resources, new AdditionalOrderFragment$handleDepartmentList$1$1$1$1(this, offerProductModel), AdditionalOrderFragment$handleDepartmentList$1$1$1$2.f61763f, new AdditionalOrderFragment$handleDepartmentList$1$1$1$3(this, offerProductModel), new AdditionalOrderFragment$handleDepartmentList$1$1$1$4(this, offerProductModel), new AdditionalOrderFragment$handleDepartmentList$1$1$1$5(this, offerProductModel)));
                }
                i.addAll(arrayList2);
                if (recommendedProductsByDepartmentModel.mo121909f().size() > 5) {
                    StandardPickerComponent.C37293b.C37294a aVar = StandardPickerComponent.C37293b.C37294a.f93558f;
                    String Q2 = recommendedProductsByDepartmentModel.mo121907e().mo121689Q();
                    if (Q2 == null) {
                        Q2 = "";
                    }
                    String string = getString(R.string.basket_builder_see_all_products);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.baske…builder_see_all_products)");
                    i.add(new StandardPickerComponent.C37292a(aVar, R.drawable.ds_ic_departement, (Integer) null, Q2, string, (String) null, 0, (String) null, false, false, false, (Integer) null, new AdditionalOrderFragment$handleDepartmentList$1$1$2(this, recommendedProductsByDepartmentModel), 4068, (DefaultConstructorMarker) null));
                }
                C10994x.m42360n0(arrayList, C10976s.m41409a(i));
            }
            bVar.setList(arrayList);
        }
        mo72709d1().sendIntent(C26875d.C26892c.C26896d.f65535a);
        RecyclerView recyclerView = ((C36689f0) getBinding()).f90784e;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "handleDepartmentList$lambda$9");
        com.carrefour.fid.android.design.components.extension.ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (L1 = bottomNavActivity.mo121105L1()) != null && (parcelable = L1.getParcelable("KEY_LIST_POSITION")) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.mo59429v1(parcelable);
        }
    }

    /* renamed from: i1 */
    public final void mo72715i1(RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
        FragmentKt.m118823k(this, C25168f.f62004a.mo73149a(recommendedProductsByDepartmentModel));
    }

    public final void initHeader() {
        ((C36689f0) getBinding()).f90781b.setContent(C8553b.m31049c(1963687185, true, new AdditionalOrderFragment$initHeader$1(this)));
    }

    /* renamed from: j1 */
    public final void mo72717j1() {
        hideLoading();
        hideErrorView();
        mo72722o1();
        C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(R.string.additional_order_checkout_empty_message_title), Integer.valueOf(R.string.additional_order_checkout_empty_message_description), (Integer) null, false, true, (C11289a) null, 73, (Object) null);
        showEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72718k1(java.lang.Throwable r24) {
        /*
            r23 = this;
            r7 = r23
            r0 = r24
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r1 == 0) goto L_0x000d
            r23.mo72717j1()
            goto L_0x0150
        L_0x000d:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            if (r1 == 0) goto L_0x0036
            com.carrefour.fid.android.shared.util.i r8 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r0
            java.lang.String r9 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r2)
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r8, r9, r10, r11, r12, r13)
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r7.mo72726s1(r0)
            goto L_0x0150
        L_0x0036:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r1 == 0) goto L_0x0052
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r1 = r23.requireContext()
            java.lang.String r2 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r1)
            r7.mo72726s1(r0)
            goto L_0x0150
        L_0x0052:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r1 == 0) goto L_0x006e
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(throwable.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r7.mo72726s1(r0)
            goto L_0x0150
        L_0x006e:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            r8 = 1
            if (r1 == 0) goto L_0x0075
            r1 = r8
            goto L_0x0077
        L_0x0075:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x0077:
            if (r1 == 0) goto L_0x007b
            r1 = r8
            goto L_0x007d
        L_0x007b:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketSlotOutdatedThrowable
        L_0x007d:
            if (r1 == 0) goto L_0x0090
            r0 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.basket_error_closed_store)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r7.mo72726s1(r0)
            goto L_0x0150
        L_0x0090:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            if (r1 == 0) goto L_0x0096
            r1 = r8
            goto L_0x0098
        L_0x0096:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketAdditionalOrderSlotError
        L_0x0098:
            if (r1 == 0) goto L_0x009c
            r1 = r8
            goto L_0x009e
        L_0x009c:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketOrderIdNotFoundedError
        L_0x009e:
            r9 = 0
            r10 = 0
            if (r1 == 0) goto L_0x00ce
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Throwable r0 = r24.getCause()
            boolean r2 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r2 == 0) goto L_0x00af
            r9 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r9 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r9
        L_0x00af:
            if (r9 == 0) goto L_0x00b6
            int r0 = r9.mo83810a()
            goto L_0x00b7
        L_0x00b6:
            r0 = r10
        L_0x00b7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            r0 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r0 = r7.getString(r0, r1)
            java.lang.String r1 = "getString(\n             …de ?: 0\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r7.mo72726s1(r0)
            goto L_0x0150
        L_0x00ce:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r1 == 0) goto L_0x00d4
            r1 = r8
            goto L_0x00d6
        L_0x00d4:
            boolean r1 = r0 instanceof java.io.IOException
        L_0x00d6:
            if (r1 == 0) goto L_0x0101
            com.carrefour.fid.android.shared.util.i r11 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r12 = r24.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r2)
            java.lang.Throwable r1 = r24.getCause()
            if (r1 != 0) goto L_0x00e9
            r13 = r0
            goto L_0x00ea
        L_0x00e9:
            r13 = r1
        L_0x00ea:
            r14 = 0
            r15 = 4
            r16 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r11, r12, r13, r14, r15, r16)
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r7.mo72726s1(r0)
            goto L_0x0150
        L_0x0101:
            r23.hideEmpty()
            r23.hideLoading()
            r23.mo72722o1()
            com.carrefour.fid.android.design.components.widgets.MessageComponent$a r1 = new com.carrefour.fid.android.design.components.widgets.MessageComponent$a
            android.content.Context r0 = r23.requireContext()
            r2 = 2131231271(0x7f080227, float:1.8078618E38)
            android.graphics.drawable.Drawable r12 = androidx.core.content.C17318d.m79726i(r0, r2)
            r0 = 2131951890(0x7f130112, float:1.9540207E38)
            java.lang.String r13 = r7.getString(r0)
            java.lang.String r0 = "getString(R.string.addit…kout_error_message_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            r0 = 2131951889(0x7f130111, float:1.9540205E38)
            java.lang.String r14 = r7.getString(r0)
            r15 = 0
            r16 = 0
            r0 = 2131952813(0x7f1304ad, float:1.954208E38)
            java.lang.String r17 = r7.getString(r0)
            com.carrefour.fid.android.design.components.widgets.MessageComponent$Type r18 = com.carrefour.fid.android.design.components.widgets.MessageComponent.Type.ERROR
            r19 = 0
            r20 = 0
            r21 = 384(0x180, float:5.38E-43)
            r22 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r23
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118421c(r0, r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r7, r10, r8, r9)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderFragment.mo72718k1(java.lang.Throwable):void");
    }

    /* renamed from: l1 */
    public final void mo72719l1(boolean z) {
        if (z) {
            mo72722o1();
            hideEmpty();
            hideErrorView();
            showLoading();
            return;
        }
        hideLoading();
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36689f0) getBinding()).f90785f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAdditionalOrder");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo72720m1() {
        mo72709d1().mo77673G();
        FragmentExtensionKt.m58753d(this);
    }

    /* renamed from: n1 */
    public final void mo72721n1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentKt.m118835w(this, (String) null, new AdditionalOrderFragment$handleOnMixingPressed$1(this), 1, (Object) null);
        mo72709d1().sendIntent(new C26875d.C26892c.C26894b(offerProductModel));
    }

    /* renamed from: o1 */
    public final void mo72722o1() {
        ((C36689f0) getBinding()).f90784e.setVisibility(8);
        mo72711f1(false);
    }

    public void onDestroy() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            RecyclerView recyclerView = ((C36689f0) getBinding()).f90784e;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAdditionalOrder");
            bottomNavActivity.mo121090D2(saveRecyclerViewState("KEY_LIST_POSITION", recyclerView));
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C19501x.m90847a(viewLifecycleOwner).mo57477c(new AdditionalOrderFragment$onResume$1(this, (C11045c<? super AdditionalOrderFragment$onResume$1>) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new AdditionalOrderFragment$onViewCreated$1(this));
        FragmentExtensionKt.m58757h(this);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118697g(requireActivity);
        initHeader();
        mo72707b1();
        AdditionalOrderViewModel d1 = mo72709d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new AdditionalOrderFragment$onViewCreated$$inlined$processState$1(this, d1, (C11045c) null, this), 3, (Object) null);
        AdditionalOrderViewModel d12 = mo72709d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new AdditionalOrderFragment$onViewCreated$$inlined$processEvent$1(this, d12, (C11045c) null, this), 3, (Object) null);
        requireActivity().mo57175g0().mo56861b(f61744Y, this, this);
        mo72709d1().sendScreenView();
    }

    /* renamed from: p */
    public void mo32757p(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "result");
        if (bundle.getBoolean(ExitAdditionalOrderBottomSheetFragment.f61778v, false) || bundle.getBoolean(ExpiredAdditionalOrderBottomSheetFragment.f61783c, false)) {
            requireActivity().mo57175g0().mo56865c(f61744Y);
            if (bundle.containsKey(ExitAdditionalOrderBottomSheetFragment.f61778v)) {
                mo72709d1().mo77674K();
            }
            mo72709d1().sendIntent(new C26875d.C26892c.C26904l(BasketType.BASKET_V4_DRIVE));
            ((C36689f0) getBinding()).f90788i.mo113329x();
            FragmentKt.m118825m(this, mo72708c1().mo73121e());
        }
    }

    /* renamed from: p1 */
    public final void mo72723p1(C26875d.C26876a aVar) {
        if (aVar instanceof C26875d.C26876a.C26877a) {
            mo72718k1(((C26875d.C26876a.C26877a) aVar).mo78039d());
        } else if (aVar instanceof C26875d.C26876a.C26884h) {
            C26875d.C26876a.C26884h hVar = (C26875d.C26876a.C26884h) aVar;
            QuantityBackDropFragment.f62741v.mo74287a(hVar.mo78070h(), hVar.mo78069g(), BasketType.BASKET_V4_ADDITIONAL_ORDER).show(requireActivity().mo57175g0(), (String) null);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26875d.C26876a.C26882f.f65509a)) {
            FragmentExtensionKt.m58754e(this);
        } else if (aVar instanceof C26875d.C26876a.C26879c) {
            FragmentKt.m118823k(this, C25168f.f62004a.mo73152d(((C26875d.C26876a.C26879c) aVar).mo78045d(), mo72708c1().mo73121e()));
        } else if (aVar instanceof C26875d.C26876a.C26881e) {
            FragmentKt.m118823k(this, C25168f.f62004a.mo73151c());
        } else if (aVar instanceof C26875d.C26876a.C26878b) {
            FragmentKt.m118823k(this, C25168f.f62004a.mo73150b(mo72708c1().mo73121e()));
        } else if (aVar instanceof C26875d.C26876a.C26883g) {
            mo72715i1(((C26875d.C26876a.C26883g) aVar).mo78059d());
        } else if (aVar instanceof C26875d.C26876a.C26880d) {
            C26875d.C26876a.C26880d dVar = (C26875d.C26876a.C26880d) aVar;
            getNavigator().mo83838n(C19736g.m91827a(this), OfferProductModelKt.m159574W(dVar.mo78054f()), dVar.mo78052e());
        }
    }

    /* renamed from: q1 */
    public final void mo72724q1(C26875d.C26885b bVar) {
        if (bVar instanceof C26875d.C26885b.C26890e) {
            mo72719l1(((C26875d.C26885b.C26890e) bVar).isLoading());
        } else if (bVar instanceof C26875d.C26885b.C26891f) {
            List<RecommendedProductsByDepartmentModel> j = ((C26875d.C26885b.C26891f) bVar).mo78091j();
            if (j == null) {
                mo72722o1();
            } else if (!j.isEmpty()) {
                mo72714h1(j);
            } else {
                mo72717j1();
            }
        } else if (bVar instanceof C26875d.C26885b.C26888c) {
            mo72717j1();
        } else if (bVar instanceof C26875d.C26885b.C26886a) {
            mo72711f1(((C26875d.C26885b.C26886a) bVar).mo78076h());
        }
    }

    /* renamed from: r1 */
    public void mo72725r1() {
        mo72709d1().sendIntent(new C26875d.C26892c.C26897e(true));
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo72725r1();
        return C11079d2.f28267a;
    }

    /* renamed from: s1 */
    public final void mo72726s1(String str) {
        FragmentKt.m118811B(this, NotificationComponent.Variant.ERROR, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        RecyclerView.Adapter adapter = ((C36689f0) getBinding()).f90784e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f61748f = cVar;
    }

    /* renamed from: z */
    public final void mo72728z(OfferProductModel offerProductModel) {
        mo72709d1().sendIntent(new C26875d.C26892c.C26894b(offerProductModel));
    }
}
