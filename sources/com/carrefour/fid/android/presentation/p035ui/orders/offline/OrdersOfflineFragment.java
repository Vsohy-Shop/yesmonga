package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.p057io.OrderHistoryIsUnavailableFromConfigThrowable;
import com.carrefour.fid.android.core.p057io.OrderHistoryIsUnavailableFromFidelityThrowable;
import com.carrefour.fid.android.databinding.C36734j5;
import com.carrefour.fid.android.databinding.C36831t2;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView;
import com.carrefour.fid.android.loyalty.core.p061io.EmptyLoyaltyCardsThrowable;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.loyalty.core.type.CardTypeKt;
import com.carrefour.fid.android.presentation.p035ui.orders.C24680g;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter.C24742d;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26689f;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.zxing.client.android.C34651e;
import dagger.hilt.android.C10164b;
import java.util.Collection;
import java.util.List;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001<\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010!\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\bH\u0002R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/t2;", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Lkotlin/d2;", "i1", "", "tabTitleId", "onResume", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel$b;", "state", "h1", "", "throwable", "Z0", "", "isLoading", "a1", "(Ljava/lang/Boolean;)V", "e1", "d1", "", "", "cardsList", "f1", "cardNumber", "V0", "b1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/f;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/f;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/f;", "j1", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/f;)V", "orderOfflineListAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel;", "g", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineListViewModel;", "orderOfflineListViewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/adapter/d;", "v", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/orders/offline/adapter/d;", "ordersOfflineAdapter", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/adapter/d$a;", "w", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/adapter/d$a;", "adapterCallBack", "com/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineFragment$c", "x", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineFragment$c;", "listener", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n106#2,15:241\n168#3,7:256\n1#4:263\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineFragment\n*L\n47#1:241,15\n113#1:256,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineFragment */
public final class OrdersOfflineFragment extends C24766c<C36831t2> {
    @C12579k

    /* renamed from: X */
    public static final String f61370X = "OrdersOfflineFragment";
    @C12579k

    /* renamed from: y */
    public static final C24728a f61371y = new C24728a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f61372z = 8;
    @Inject

    /* renamed from: f */
    public C26689f f61373f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61374g;
    @C12579k

    /* renamed from: v */
    public final C11677z f61375v = C10864b0.m38748c(new OrdersOfflineFragment$ordersOfflineAdapter$2(this));
    @C12579k

    /* renamed from: w */
    public final C24742d.C24743a f61376w = new C24729b(this);
    @C12579k

    /* renamed from: x */
    public final C24730c f61377x = new C24730c();

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineFragment$a */
    public static final class C24728a {
        public /* synthetic */ C24728a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24728a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineFragment$b */
    public static final class C24729b implements C24742d.C24743a {

        /* renamed from: a */
        public final /* synthetic */ OrdersOfflineFragment f61379a;

        public C24729b(OrdersOfflineFragment ordersOfflineFragment) {
            this.f61379a = ordersOfflineFragment;
        }

        /* renamed from: a */
        public final void mo72250a(@C12579k OrderDetailParam orderDetailParam) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
            OrdersFragment ordersFragment = (OrdersFragment) FragmentKt.m148916b(this.f61379a, OrdersFragment.class);
            if (ordersFragment != null) {
                com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(ordersFragment, C24680g.f61288a.mo72134c(orderDetailParam));
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineFragment$c */
    public static final class C24730c implements RecyclerView.C20084s {
        /* renamed from: a */
        public void mo60002a(@C12579k RecyclerView recyclerView, @C12579k MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "rv");
            Intrinsics.checkNotNullParameter(motionEvent, C34651e.f83829d);
        }

        /* renamed from: c */
        public boolean mo60003c(@C12579k RecyclerView recyclerView, @C12579k MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "rv");
            Intrinsics.checkNotNullParameter(motionEvent, C34651e.f83829d);
            if (motionEvent.getAction() != 2) {
                return false;
            }
            recyclerView.getParent().requestDisallowInterceptTouchEvent(!recyclerView.canScrollVertically(1));
            return false;
        }

        /* renamed from: e */
        public void mo60004e(boolean z) {
        }
    }

    public OrdersOfflineFragment() {
        super(C247271.f61378a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new OrdersOfflineFragment$special$$inlined$viewModels$default$2(new OrdersOfflineFragment$special$$inlined$viewModels$default$1(this)));
        this.f61374g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(OrderOfflineListViewModel.class), new OrdersOfflineFragment$special$$inlined$viewModels$default$3(b), new OrdersOfflineFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new OrdersOfflineFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: c1 */
    public static final void m107886c1(OrdersOfflineFragment ordersOfflineFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(ordersOfflineFragment, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "result");
        String string = bundle.getString(OrderLoyaltyCardsBottomSheetDialogFragment.f61345w);
        if (string != null) {
            ordersOfflineFragment.mo72236V0(string);
            ordersOfflineFragment.mo72238X0().sendIntent(new OrderOfflineListViewModel.C26675c.C26679d(string));
        }
    }

    /* renamed from: g1 */
    public static final void m107887g1(List list, OrdersOfflineFragment ordersOfflineFragment, View view) {
        Intrinsics.checkNotNullParameter(list, "$cardsList");
        Intrinsics.checkNotNullParameter(ordersOfflineFragment, "this$0");
        OrderLoyaltyCardsBottomSheetDialogFragment a = OrderLoyaltyCardsBottomSheetDialogFragment.f61342f.mo72207a(list);
        FragmentManager childFragmentManager = ordersOfflineFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        FragmentExtensionKt.m58762m(a, childFragmentManager);
    }

    /* renamed from: V0 */
    public final void mo72236V0(String str) {
        boolean z;
        int i;
        int i2;
        if (CardTypeKt.getLoyaltyCardType(str) == CardType.PASS) {
            z = true;
        } else {
            z = false;
        }
        C36734j5 j5Var = ((C36831t2) getBinding()).f91666b;
        j5Var.f91073d.setText(str);
        ImageView imageView = j5Var.f91072c;
        if (z) {
            i = R.drawable.ds_gr_horizontal_black_pass_card;
        } else {
            i = R.drawable.ic_carte_fidelite;
        }
        imageView.setImageResource(i);
        TextView textView = j5Var.f91074e;
        if (z) {
            i2 = R.string.order_detail_command_pass_card_fidelity;
        } else {
            i2 = R.string.order_detail_command_card_fidelity;
        }
        textView.setText(i2);
    }

    @C12579k
    /* renamed from: W0 */
    public final C26689f mo72237W0() {
        C26689f fVar = this.f61373f;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderOfflineListAnalyticsViewModel");
        return null;
    }

    /* renamed from: X0 */
    public final OrderOfflineListViewModel mo72238X0() {
        return (OrderOfflineListViewModel) this.f61374g.getValue();
    }

    /* renamed from: Y0 */
    public final C24742d mo72239Y0() {
        return (C24742d) this.f61375v.getValue();
    }

    /* renamed from: Z0 */
    public final void mo72240Z0(Throwable th) {
        boolean z;
        boolean z2;
        Throwable th2 = th;
        ((C36831t2) getBinding()).f91666b.getRoot().setEnabled(true);
        if (th2 instanceof OrderHistoryIsUnavailableFromConfigThrowable) {
            ((C36831t2) getBinding()).f91668d.setVisibility(8);
            C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(R.string.order_txt_order_unavalable_title), Integer.valueOf(R.string.order_txt_order_unavalable_message), (Integer) null, false, false, (C11289a) null, 121, (Object) null);
            showEmpty();
            mo72237W0().mo77561b();
            return;
        }
        if (th2 instanceof OrderHistoryIsUnavailableFromFidelityThrowable) {
            z = true;
        } else {
            z = th2 instanceof EmptyLoyaltyCardsThrowable;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = th2 instanceof EmptyListThrowable;
        }
        if (z2) {
            ((C36831t2) getBinding()).f91668d.setVisibility(8);
            C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(R.string.offline_order_txt_order_empty_title), Integer.valueOf(R.string.offline_order_txt_order_empty_message), (Integer) null, false, false, (C11289a) null, 121, (Object) null);
            showEmpty();
            mo72237W0().mo77561b();
        } else if (th2 != null) {
            ((C36831t2) getBinding()).f91668d.setVisibility(8);
            Drawable i = C17318d.m79726i(requireContext(), R.drawable.ic_order_error);
            String string = getString(R.string.order_txt_error_offline_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.order…rror_offline_description)");
            C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, (String) null, getString(R.string.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
            C28500r.C28501a.m118423e(this, false, 1, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final void mo72241a1(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            hideLoading();
            ((C36831t2) getBinding()).f91666b.getRoot().setEnabled(true);
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ((C36831t2) getBinding()).f91668d.setVisibility(8);
            ((C36831t2) getBinding()).f91666b.getRoot().setEnabled(false);
            hideErrorView();
            hideEmpty();
            showLoading();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b1 */
    public final void mo72242b1() {
        getChildFragmentManager().mo56861b(OrderLoyaltyCardsBottomSheetDialogFragment.f61344v, this, new C24776i(this));
    }

    /* renamed from: d1 */
    public final void mo72243d1(OrderOfflineListViewModel.C26673b bVar) {
        String r;
        List<String> p = bVar.mo77541p();
        if (p != null && p.size() > 1 && (r = bVar.mo77543r()) != null) {
            mo72245f1(p);
            mo72236V0(r);
        }
    }

    /* renamed from: e1 */
    public final void mo72244e1(OrderOfflineListViewModel.C26673b bVar) {
        boolean z;
        Collection q = bVar.mo77542q();
        if (q == null || q.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo72240Z0(new EmptyListThrowable());
            return;
        }
        InfiniteListRecyclerView infiniteListRecyclerView = ((C36831t2) getBinding()).f91668d;
        infiniteListRecyclerView.setHasMoreItems(bVar.mo77540o());
        mo72239Y0().mo72269o(bVar.mo77542q());
        infiniteListRecyclerView.mo113402W1(bVar.mo77540o());
        Intrinsics.checkNotNullExpressionValue(infiniteListRecyclerView, "handleResult$lambda$5");
        ViewKt.m152123e(infiniteListRecyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36831t2) getBinding()).f91670f;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentOrdersOfflineEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36831t2) getBinding()).f91671g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentOrdersOfflineError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo72245f1(List<String> list) {
        ((C36831t2) getBinding()).f91666b.f91071b.setVisibility(0);
        ConstraintLayout b = ((C36831t2) getBinding()).f91666b.getRoot();
        b.setVisibility(0);
        b.setBackgroundResource(R.drawable.bg_white_card_ripple);
        b.setOnClickListener(new C24777j(list, this));
    }

    /* renamed from: h1 */
    public final void mo72246h1(OrderOfflineListViewModel.C26673b bVar) {
        mo72241a1(Boolean.valueOf(bVar.isLoading()));
        Throwable n = bVar.mo77539n();
        if (n != null) {
            mo72240Z0(n);
        }
        if (bVar.mo77542q() != null) {
            mo72244e1(bVar);
        }
        if (bVar.mo77541p() != null) {
            mo72243d1(bVar);
        }
    }

    /* renamed from: i1 */
    public void mo72247i1() {
        mo72238X0().sendIntent(OrderOfflineListViewModel.C26675c.C26678c.f65129a);
    }

    /* renamed from: j1 */
    public final void mo72248j1(@C12579k C26689f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f61373f = fVar;
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36831t2) getBinding()).f91669e;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFragmentOrdersOfflineList");
        return shimmerFrameLayout;
    }

    public void onResume() {
        super.onResume();
        mo72237W0().mo77560a();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72242b1();
        InfiniteListRecyclerView infiniteListRecyclerView = ((C36831t2) getBinding()).f91668d;
        infiniteListRecyclerView.mo113401V1(mo72239Y0());
        infiniteListRecyclerView.setLoadMoreCallback(new OrdersOfflineFragment$onViewCreated$1$1(this));
        infiniteListRecyclerView.mo59610q(this.f61377x);
        OrderOfflineListViewModel X0 = mo72238X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24731xf58e6eb2(this, X0, (C11045c) null, this), 3, (Object) null);
        mo72238X0().sendIntent(OrderOfflineListViewModel.C26675c.C26676a.f65125a);
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo72247i1();
        return C11079d2.f28267a;
    }

    public int tabTitleId() {
        return R.string.order_tab_title_receipt;
    }
}
