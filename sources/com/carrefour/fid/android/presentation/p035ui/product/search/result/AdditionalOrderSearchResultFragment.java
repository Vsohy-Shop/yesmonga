package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36759m0;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView;
import com.carrefour.fid.android.domain.models.product.SearchParam;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.ExitAdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.ExpiredAdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.list.C27180a;
import com.carrefour.fid.android.product.C27453b;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.p039ui.list.PlpDelegate;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.C28759i;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\bV\u0010WJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/result/AdditionalOrderSearchResultFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/m0;", "Landroidx/fragment/app/c0;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "requestKey", "result", "p", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyMessageLayout", "initHeader", "Y0", "", "totalCount", "filtersCount", "X0", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "f", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "delegate", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "g", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "source", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel;", "v", "Lkotlin/z;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderSearchViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/product/list/a;", "w", "Lcom/carrefour/fid/android/presentation/viewmodels/product/list/a;", "b1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/list/a;", "g1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/list/a;)V", "productListAnalyticsViewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "x", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/shared/util/j;", "y", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "z", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "a1", "()Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "f1", "(Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;)V", "plpProductAnalytics", "Lcom/carrefour/fid/android/presentation/ui/product/search/result/c;", "X", "Landroidx/navigation/m;", "Z0", "()Lcom/carrefour/fid/android/presentation/ui/product/search/result/c;", "args", "Lkotlin/Function0;", "Y", "Lkotlin/jvm/functions/a;", "scanAction", "Landroidx/activity/result/g;", "Z", "Landroidx/activity/result/g;", "requestCameraPermissionLauncher", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAdditionalOrderSearchResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderSearchResultFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/AdditionalOrderSearchResultFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,215:1\n106#2,15:216\n42#3,3:231\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderSearchResultFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/AdditionalOrderSearchResultFragment\n*L\n50#1:216,15\n64#1:231,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment */
public final class AdditionalOrderSearchResultFragment extends C25670g<C36759m0> implements C19221c0 {

    /* renamed from: E0 */
    public static final int f62864E0 = 8;
    @C12579k

    /* renamed from: X */
    public final C19766m f62865X = new C19766m(C11342l0.m43547d(C25663c.class), new AdditionalOrderSearchResultFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: Y */
    public final C11289a<C11079d2> f62866Y = new AdditionalOrderSearchResultFragment$scanAction$1(this);
    @C12579k

    /* renamed from: Z */
    public final C0302g<String> f62867Z;

    /* renamed from: f */
    public PlpDelegate f62868f;

    /* renamed from: g */
    public ProductListSource f62869g;
    @C12579k

    /* renamed from: v */
    public final C11677z f62870v;
    @Inject

    /* renamed from: w */
    public C27180a f62871w;
    @Inject

    /* renamed from: x */
    public C28796c f62872x;
    @Inject

    /* renamed from: y */
    public C28936j f62873y;
    @Inject

    /* renamed from: z */
    public PlpProductAnalytics f62874z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment$a */
    public static final class C25586a implements C0263a<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ AdditionalOrderSearchResultFragment f62876a;

        public C25586a(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment) {
            this.f62876a = additionalOrderSearchResultFragment;
        }

        /* renamed from: b */
        public final void mo790a(Boolean bool) {
            Intrinsics.checkNotNullExpressionValue(bool, "isGranted");
            if (bool.booleanValue()) {
                this.f62876a.f62866Y.invoke();
            }
        }
    }

    public AdditionalOrderSearchResultFragment() {
        super(C255851.f62875a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25588xba54c3c4(new C25587xba54c3c3(this)));
        this.f62870v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AdditionalOrderSearchViewModel.class), new C25589xba54c3c5(b), new C25590xba54c3c6((C11289a) null, b), new C25591xba54c3c7(this, b));
        C0302g<String> registerForActivityResult = registerForActivityResult(new C0268b.C0289l(), new C25586a(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f62867Z = registerForActivityResult;
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C36759m0 m110178T0(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment) {
        return (C36759m0) additionalOrderSearchResultFragment.getBinding();
    }

    /* renamed from: d1 */
    public static final void m110182d1(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment, View view) {
        Intrinsics.checkNotNullParameter(additionalOrderSearchResultFragment, "this$0");
        NavController a = C19736g.m91827a(additionalOrderSearchResultFragment);
        ProductListSource productListSource = additionalOrderSearchResultFragment.f62869g;
        if (productListSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        }
        a.mo58130W(R.id.product_facet_graph, new C27453b(productListSource).mo79796f());
    }

    /* renamed from: e1 */
    public static final void m110183e1(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment, View view) {
        Intrinsics.checkNotNullParameter(additionalOrderSearchResultFragment, "this$0");
        FragmentKt.m118823k(additionalOrderSearchResultFragment, C25665d.f62937a.mo74593b((OrderType) null, additionalOrderSearchResultFragment.mo74463Z0().mo74577g()));
    }

    /* renamed from: X0 */
    public final void mo74461X0(int i, int i2) {
        String str;
        Resources resources;
        TextView textView = ((C36759m0) getBinding()).f91245m;
        Context context = getContext();
        int i3 = 0;
        if (context == null || (resources = context.getResources()) == null) {
            str = null;
        } else {
            str = resources.getQuantityString(R.plurals.search_result, i, new Object[]{Integer.valueOf(i)});
        }
        textView.setText(str);
        TextView textView2 = ((C36759m0) getBinding()).f91244l;
        if (!C28759i.m119064a(Integer.valueOf(i2), 0)) {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        ((C36759m0) getBinding()).f91244l.setText(String.valueOf(i2));
    }

    /* renamed from: Y0 */
    public final void mo74462Y0() {
        CountDownTimerComponent countDownTimerComponent = ((C36759m0) getBinding()).f91246n;
        countDownTimerComponent.mo113325B(30, new AdditionalOrderSearchResultFragment$bindTimer$1$1(this));
        countDownTimerComponent.setOnCancelTimerClickListener(new AdditionalOrderSearchResultFragment$bindTimer$1$2(this));
    }

    /* renamed from: Z0 */
    public final C25663c mo74463Z0() {
        return (C25663c) this.f62865X.getValue();
    }

    @C12579k
    /* renamed from: a1 */
    public final PlpProductAnalytics mo74464a1() {
        PlpProductAnalytics plpProductAnalytics = this.f62874z;
        if (plpProductAnalytics != null) {
            return plpProductAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("plpProductAnalytics");
        return null;
    }

    @C12579k
    /* renamed from: b1 */
    public final C27180a mo74465b1() {
        C27180a aVar = this.f62871w;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productListAnalyticsViewModel");
        return null;
    }

    /* renamed from: c1 */
    public final AdditionalOrderSearchViewModel mo74466c1() {
        return (AdditionalOrderSearchViewModel) this.f62870v.getValue();
    }

    @C12579k
    public ViewStub emptyMessageLayout() {
        ViewStub viewStub = ((C36759m0) getBinding()).f91242j;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAdditionalOrderSearchEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36759m0) getBinding()).f91243k;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubListError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo74468f1(@C12579k PlpProductAnalytics plpProductAnalytics) {
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "<set-?>");
        this.f62874z = plpProductAnalytics;
    }

    /* renamed from: g1 */
    public final void mo74469g1(@C12579k C27180a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62871w = aVar;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f62873y;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f62872x;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initHeader() {
        ((C36759m0) getBinding()).f91235c.setContent(C8553b.m31049c(1086143061, true, new AdditionalOrderSearchResultFragment$initHeader$1(this)));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36759m0) getBinding()).f91241i;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerProductList");
        return shimmerFrameLayout;
    }

    public void onCreate(@C12580l Bundle bundle) {
        ProductListSource productListSource;
        super.onCreate(bundle);
        requireActivity().mo57175g0().mo56861b(AdditionalOrderFragment.f61744Y, this, this);
        this.f62869g = new ProductListSource.Search(SearchParam.m157478b(mo74463Z0().mo74576f()), (DefaultConstructorMarker) null);
        ProductListSource productListSource2 = this.f62869g;
        if (productListSource2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        } else {
            productListSource = productListSource2;
        }
        PlpDelegate plpDelegate = new PlpDelegate(this, productListSource, getNavigator(), mo74464a1(), new AdditionalOrderSearchResultFragment$onCreate$1(this), getFragmentUtil());
        this.f62868f = plpDelegate;
        plpDelegate.mo81517x();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
        PlpDelegate plpDelegate = this.f62868f;
        if (plpDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            plpDelegate = null;
        }
        InfiniteListRecyclerView infiniteListRecyclerView = ((C36759m0) getBinding()).f91240h;
        Intrinsics.checkNotNullExpressionValue(infiniteListRecyclerView, "binding.searchList");
        plpDelegate.mo81519z(infiniteListRecyclerView);
        mo74462Y0();
        initHeader();
        ((C36759m0) getBinding()).f91238f.setOnClickListener(new C25661a(this));
        ((C36759m0) getBinding()).f91237e.setOnClickListener(new C25662b(this));
        C19501x.m90847a(this).mo57478d(new AdditionalOrderSearchResultFragment$onViewCreated$3(this, (C11045c<? super AdditionalOrderSearchResultFragment$onViewCreated$3>) null));
    }

    /* renamed from: p */
    public void mo32757p(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "result");
        if (!Intrinsics.areEqual((Object) str, (Object) AdditionalOrderFragment.f61744Y)) {
            return;
        }
        if (bundle.getBoolean(ExitAdditionalOrderBottomSheetFragment.f61778v, false) || bundle.getBoolean(ExpiredAdditionalOrderBottomSheetFragment.f61783c, false)) {
            ((C36759m0) getBinding()).f91246n.mo113329x();
            FragmentKt.m118825m(this, mo74463Z0().mo74577g());
        }
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f62873y = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f62872x = cVar;
    }
}
