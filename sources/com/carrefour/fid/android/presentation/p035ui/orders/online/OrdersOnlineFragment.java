package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.p057io.OrderHistoryIsUnavailableFromConfigThrowable;
import com.carrefour.fid.android.databinding.C36861w2;
import com.carrefour.fid.android.design.components.extension.PullToRefreshLayoutKt;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView;
import com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayout;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.orders.C24680g;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24879h;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C27004i;
import com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\t*\u0001H\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u0007¢\u0006\u0004\bL\u0010MJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0014J\b\u0010\u001f\u001a\u00020\u0004H\u0014J\b\u0010!\u001a\u00020 H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020$H\u0016R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/w2;", "Landroidx/fragment/app/c0;", "Lkotlin/d2;", "g1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$b;", "state", "i1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$c;", "event", "f1", "initListeners", "", "throwable", "c1", "", "isLoading", "d1", "(Ljava/lang/Boolean;)V", "e1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel$c$b;", "b1", "a1", "h1", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "j1", "V0", "", "tabTitleId", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onDestroyView", "", "requestKey", "result", "p", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "W0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "k1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/i;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/i;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/i;", "l1", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/i;)V", "orderOnlineListAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel;", "v", "Lkotlin/z;", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineListViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/adapter/h;", "w", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/adapter/h;", "ordersOnlineAdapter", "com/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineFragment$adapterCallback$1", "x", "Lcom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineFragment$adapterCallback$1;", "adapterCallback", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n106#2,15:342\n168#3,7:357\n183#3,6:364\n1#4:370\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineFragment\n*L\n61#1:342,15\n166#1:357,7\n167#1:364,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineFragment */
public final class OrdersOnlineFragment extends C25190c<C36861w2> implements C19221c0 {
    @C12579k

    /* renamed from: X */
    public static final String f61575X = "OrdersOnlineFragment";
    @C12579k

    /* renamed from: Y */
    public static final String f61576Y = "KEY_LIST_POSITION";
    @C12579k

    /* renamed from: y */
    public static final C24835a f61577y = new C24835a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f61578z = 8;
    @Inject

    /* renamed from: f */
    public AppEnvironment f61579f;
    @Inject

    /* renamed from: g */
    public C27004i f61580g;
    @C12579k

    /* renamed from: v */
    public final C11677z f61581v;
    @C12579k

    /* renamed from: w */
    public final C11677z f61582w = C10864b0.m38748c(new OrdersOnlineFragment$ordersOnlineAdapter$2(this));
    @C12579k

    /* renamed from: x */
    public final OrdersOnlineFragment$adapterCallback$1 f61583x = new OrdersOnlineFragment$adapterCallback$1(this);

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineFragment$a */
    public static final class C24835a {
        public /* synthetic */ C24835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24835a() {
        }
    }

    public OrdersOnlineFragment() {
        super(C248341.f61584a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new OrdersOnlineFragment$special$$inlined$viewModels$default$2(new OrdersOnlineFragment$special$$inlined$viewModels$default$1(this)));
        this.f61581v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(OrderOnlineListViewModel.class), new OrdersOnlineFragment$special$$inlined$viewModels$default$3(b), new OrdersOnlineFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new OrdersOnlineFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: V0 */
    public void mo72545V0() {
        BottomNavActivity bottomNavActivity;
        mo72547X0().mo78421d();
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121118U1();
        }
    }

    @C12579k
    /* renamed from: W0 */
    public final AppEnvironment mo72546W0() {
        AppEnvironment appEnvironment = this.f61579f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    @C12579k
    /* renamed from: X0 */
    public final C27004i mo72547X0() {
        C27004i iVar = this.f61580g;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderOnlineListAnalyticsViewModel");
        return null;
    }

    /* renamed from: Y0 */
    public final C24879h mo72548Y0() {
        return (C24879h) this.f61582w.getValue();
    }

    /* renamed from: Z0 */
    public final OrderOnlineListViewModel mo72549Z0() {
        return (OrderOnlineListViewModel) this.f61581v.getValue();
    }

    /* renamed from: a1 */
    public final void mo72550a1() {
        OrdersFragment ordersFragment = (OrdersFragment) FragmentKt.m148916b(this, OrdersFragment.class);
        if (ordersFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(ordersFragment, C24680g.C24685e.m107782i(C24680g.f61288a, 0, 1, (Object) null));
        }
    }

    /* renamed from: b1 */
    public final void mo72551b1(OrderOnlineListViewModel.C26711c.C26713b bVar) {
        if (bVar.mo77631f()) {
            FragmentExtensionKt.m58751b(this, bVar.mo77629e());
        } else {
            mo72550a1();
        }
    }

    /* renamed from: c1 */
    public final void mo72552c1(Throwable th) {
        ((C36861w2) getBinding()).f91842d.setVisibility(8);
        hideLoading();
        if (th instanceof OrderHistoryIsUnavailableFromConfigThrowable) {
            C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(R.string.order_txt_order_unavalable_title), Integer.valueOf(R.string.order_txt_order_unavalable_message), (Integer) null, false, false, (C11289a) null, 121, (Object) null);
            showEmpty();
            mo72547X0().mo78425h();
        } else if (th instanceof EmptyListThrowable) {
            C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(R.string.order_txt_order_empty_title), Integer.valueOf(R.string.order_txt_order_empty_message), Integer.valueOf(R.string.order_btn_empty), true, false, (C11289a) null, 97, (Object) null);
            showEmpty();
            mo72547X0().mo78425h();
        } else if (th != null) {
            ((C36861w2) getBinding()).f91842d.setVisibility(8);
            Drawable i = C17318d.m79726i(requireContext(), R.drawable.ic_order_error);
            String string = getString(R.string.order_txt_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.order_txt_error_title)");
            C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, (String) null, getString(R.string.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
            C28500r.C28501a.m118423e(this, false, 1, (Object) null);
        }
    }

    /* renamed from: d1 */
    public final void mo72553d1(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            hideLoading();
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            hideEmpty();
            hideErrorView();
            ((C36861w2) getBinding()).f91842d.setVisibility(8);
            ((C36861w2) getBinding()).f91840b.mo114018r(0);
            showLoading();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e1 */
    public final void mo72554e1(OrderOnlineListViewModel.C26709b bVar) {
        boolean z;
        BottomNavActivity bottomNavActivity;
        Bundle L1;
        Parcelable parcelable;
        RecyclerView.C20076o layoutManager;
        Collection l = bVar.mo77617l();
        if (l == null || l.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo72552c1(new EmptyListThrowable());
            return;
        }
        hideEmpty();
        InfiniteListRecyclerView infiniteListRecyclerView = ((C36861w2) getBinding()).f91842d;
        infiniteListRecyclerView.setHasMoreItems(bVar.mo77616k());
        mo72548Y0().mo72630t(bVar.mo77617l());
        infiniteListRecyclerView.mo113402W1(bVar.mo77616k());
        Intrinsics.checkNotNullExpressionValue(infiniteListRecyclerView, "handleResult$lambda$5");
        ViewKt.m152123e(infiniteListRecyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (L1 = bottomNavActivity.mo121105L1()) != null && (parcelable = L1.getParcelable("KEY_LIST_POSITION")) != null && (layoutManager = infiniteListRecyclerView.getLayoutManager()) != null) {
            layoutManager.mo59429v1(parcelable);
        }
    }

    public /* bridge */ /* synthetic */ C11079d2 emptyFunction() {
        mo72545V0();
        return C11079d2.f28267a;
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36861w2) getBinding()).f91845g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentOrdersOnlineEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36861w2) getBinding()).f91846h;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentOrdersOnlineError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo72555f1(OrderOnlineListViewModel.C26711c cVar) {
        if (cVar instanceof OrderOnlineListViewModel.C26711c.C26712a) {
            mo72552c1(((OrderOnlineListViewModel.C26711c.C26712a) cVar).mo77622d());
        } else if (cVar instanceof OrderOnlineListViewModel.C26711c.C26713b) {
            mo72551b1((OrderOnlineListViewModel.C26711c.C26713b) cVar);
        }
    }

    /* renamed from: g1 */
    public final void mo72556g1() {
        mo72549Z0().sendIntent(OrderOnlineListViewModel.C26714d.C26716b.f65196a);
    }

    /* renamed from: h1 */
    public final void mo72557h1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        Parcelable parcelable = null;
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            Bundle bundle = new Bundle();
            RecyclerView.C20076o layoutManager = ((C36861w2) getBinding()).f91842d.getLayoutManager();
            if (layoutManager != null) {
                parcelable = layoutManager.mo59432w1();
            }
            bundle.putParcelable("KEY_LIST_POSITION", parcelable);
            bottomNavActivity.mo121090D2(bundle);
        }
    }

    /* renamed from: i1 */
    public final void mo72558i1(OrderOnlineListViewModel.C26709b bVar) {
        mo72553d1(Boolean.valueOf(bVar.isLoading()));
        if (bVar.mo77617l() != null) {
            mo72554e1(bVar);
        }
    }

    public final void initListeners() {
        PullToRefreshLayout pullToRefreshLayout = ((C36861w2) getBinding()).f91840b;
        Intrinsics.checkNotNullExpressionValue(pullToRefreshLayout, "binding.orderOnlineSwipeRefresh");
        C11909g.m47412V0(C11909g.m47448f1(PullToRefreshLayoutKt.m152112c(pullToRefreshLayout), new OrdersOnlineFragment$initListeners$1(this, (C11045c<? super OrdersOnlineFragment$initListeners$1>) null)), C19501x.m90847a(this));
    }

    /* renamed from: j1 */
    public void mo72560j1() {
        mo72556g1();
        mo72547X0().mo78418a();
    }

    /* renamed from: k1 */
    public final void mo72561k1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f61579f = appEnvironment;
    }

    /* renamed from: l1 */
    public final void mo72562l1(@C12579k C27004i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f61580g = iVar;
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36861w2) getBinding()).f91844f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFragmentOrdersOnlineList");
        return shimmerFrameLayout;
    }

    public void onDestroyView() {
        mo72557h1();
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        requireActivity().mo57175g0().mo56861b(AdditionalOrderBottomSheetFragment.f61711x, this, this);
        mo72547X0().mo78424g();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C36861w2) getBinding()).f91840b.mo114043w(1.0f);
        InfiniteListRecyclerView infiniteListRecyclerView = ((C36861w2) getBinding()).f91842d;
        infiniteListRecyclerView.mo113401V1(mo72548Y0());
        infiniteListRecyclerView.setLoadMoreCallback(new OrdersOnlineFragment$onViewCreated$2$1(this));
        initListeners();
        OrderOnlineListViewModel Z0 = mo72549Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new OrdersOnlineFragment$onViewCreated$$inlined$processState$1(this, Z0, (C11045c) null, this), 3, (Object) null);
        OrderOnlineListViewModel Z02 = mo72549Z0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new OrdersOnlineFragment$onViewCreated$$inlined$processEvent$1(this, Z02, (C11045c) null, this), 3, (Object) null);
        mo72556g1();
    }

    /* renamed from: p */
    public void mo32757p(@C12579k String str, @C12579k Bundle bundle) {
        Bundle bundle2 = bundle;
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle2, "result");
        if (bundle2.getBoolean(AdditionalOrderBottomSheetFragment.f61712y, false)) {
            requireActivity().mo57175g0().mo56865c(AdditionalOrderBottomSheetFragment.f61711x);
            if (bundle2.getBoolean(AdditionalOrderBottomSheetFragment.f61713z, false)) {
                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                String string = getString(R.string.additional_order_not_eligible);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.additional_order_not_eligible)");
                com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                mo72556g1();
                return;
            }
            mo72550a1();
            return;
        }
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo72560j1();
        return C11079d2.f28267a;
    }

    public int tabTitleId() {
        return R.string.order_tab_title;
    }
}
