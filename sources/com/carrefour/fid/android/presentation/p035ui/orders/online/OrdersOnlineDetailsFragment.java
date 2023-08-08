package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.core.p057io.CancelOrderOnlineThrowable;
import com.carrefour.fid.android.core.p057io.UpdateOrderOnlineThrowable;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36871x2;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.interactors.service.C37815d;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.decoration.C38367a;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.orders.online.C25204i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25237e;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C26996d;
import com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C10164b
@C11076d0(mo22515d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\t*\u0001[\b\u0007\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001bB\u0007¢\u0006\u0004\b_\u0010`J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0014J\u001a\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\bN\u0010:\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0002¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\bW\u0010:\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006c"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/x2;", "Landroidx/fragment/app/c0;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$b;", "state", "Lkotlin/d2;", "o1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$a;", "event", "k1", "b1", "", "throwable", "h1", "", "isLoading", "i1", "", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/e;", "result", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/mvi/a$a$c;", "g1", "X0", "m1", "Landroid/view/ViewStub;", "errorMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "p1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "requestKey", "p", "onResume", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "Y0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "q1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/d;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/d;", "d1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/d;", "t1", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/d;)V", "orderOnlineDetailAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineDetailViewModel;", "v", "Lkotlin/z;", "f1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/OrderOnlineDetailViewModel;", "viewModel", "Lcom/carrefour/fid/android/domain/interactors/service/d;", "w", "Lcom/carrefour/fid/android/domain/interactors/service/d;", "Z0", "()Lcom/carrefour/fid/android/domain/interactors/service/d;", "r1", "(Lcom/carrefour/fid/android/domain/interactors/service/d;)V", "fetchStoreServicesPictosUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "x", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "a1", "()Lcom/carrefour/fid/android/domain/interactors/service/e;", "s1", "(Lcom/carrefour/fid/android/domain/interactors/service/e;)V", "getStoreByAnabelUseCase", "y", "c1", "()Ljava/lang/String;", "orderId", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "z", "e1", "()Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "orderType", "X", "l1", "()Z", "isStatusAtLeastBilled", "com/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineDetailsFragment$adapterCallback$1", "Y", "Lcom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineDetailsFragment$adapterCallback$1;", "adapterCallback", "<init>", "()V", "Z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineDetailsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,465:1\n106#2,15:466\n168#3,7:481\n183#3,6:488\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/OrdersOnlineDetailsFragment\n*L\n77#1:466,15\n274#1:481,7\n275#1:488,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment */
public final class OrdersOnlineDetailsFragment extends C25189b<C36871x2> implements C19221c0 {

    /* renamed from: E0 */
    public static final int f61549E0 = 8;
    @C12579k

    /* renamed from: F0 */
    public static final String f61550F0 = "OrdersOnlineDetailsFragment";
    @C12579k

    /* renamed from: Z */
    public static final C24817a f61551Z = new C24817a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: X */
    public final C11677z f61552X = C10864b0.m38748c(new OrdersOnlineDetailsFragment$isStatusAtLeastBilled$2(this));
    @C12579k

    /* renamed from: Y */
    public final OrdersOnlineDetailsFragment$adapterCallback$1 f61553Y = new OrdersOnlineDetailsFragment$adapterCallback$1(this);
    @Inject

    /* renamed from: f */
    public AppEnvironment f61554f;
    @Inject

    /* renamed from: g */
    public C26996d f61555g;
    @C12579k

    /* renamed from: v */
    public final C11677z f61556v;
    @Inject

    /* renamed from: w */
    public C37815d f61557w;
    @Inject

    /* renamed from: x */
    public C37816e f61558x;
    @C12579k

    /* renamed from: y */
    public final C11677z f61559y = C10864b0.m38748c(new OrdersOnlineDetailsFragment$orderId$2(this));
    @C12579k

    /* renamed from: z */
    public final C11677z f61560z = C10864b0.m38748c(new OrdersOnlineDetailsFragment$orderType$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment$a */
    public static final class C24817a {
        public /* synthetic */ C24817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24817a() {
        }
    }

    public OrdersOnlineDetailsFragment() {
        super(C248161.f61561a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24829x8d9afbe2(new C24828x8d9afbe1(this)));
        this.f61556v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(OrderOnlineDetailViewModel.class), new C24830x8d9afbe3(b), new C24831x8d9afbe4((C11289a) null, b), new C24832x8d9afbe5(this, b));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C36871x2 m108138R0(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
        return (C36871x2) ordersOnlineDetailsFragment.getBinding();
    }

    /* renamed from: n1 */
    public static final void m108144n1(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(ordersOnlineDetailsFragment, "this$0");
        ordersOnlineDetailsFragment.mo72515m1();
    }

    /* renamed from: X0 */
    public final void mo72500X0() {
        FragmentKt.m118823k(this, C25204i.f62079a.mo73266d(mo72505c1()));
        mo72506d1().mo78405h(mo72507e1());
        mo72504b1();
    }

    @C12579k
    /* renamed from: Y0 */
    public final AppEnvironment mo72501Y0() {
        AppEnvironment appEnvironment = this.f61554f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    @C12579k
    /* renamed from: Z0 */
    public final C37815d mo72502Z0() {
        C37815d dVar = this.f61557w;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fetchStoreServicesPictosUseCase");
        return null;
    }

    @C12579k
    /* renamed from: a1 */
    public final C37816e mo72503a1() {
        C37816e eVar = this.f61558x;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getStoreByAnabelUseCase");
        return null;
    }

    /* renamed from: b1 */
    public final void mo72504b1() {
        OrderOnlineDetailViewModel f1 = mo72508f1();
        String c1 = mo72505c1();
        String string = getString(R.string.order_txt_download_bill);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.order_txt_download_bill)");
        String string2 = getString(R.string.order_txt_cancel_order);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.order_txt_cancel_order)");
        String string3 = getString(R.string.order_ask_refund);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.order_ask_refund)");
        f1.sendIntent(new C27012a.C27021c.C27023b(c1, string, string2, string3));
    }

    /* renamed from: c1 */
    public final String mo72505c1() {
        return (String) this.f61559y.getValue();
    }

    @C12579k
    /* renamed from: d1 */
    public final C26996d mo72506d1() {
        C26996d dVar = this.f61555g;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderOnlineDetailAnalyticsViewModel");
        return null;
    }

    /* renamed from: e1 */
    public final OrderType mo72507e1() {
        return (OrderType) this.f61560z.getValue();
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36871x2) getBinding()).f91902g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentOrdersOnlineDetailsError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final OrderOnlineDetailViewModel mo72508f1() {
        return (OrderOnlineDetailViewModel) this.f61556v.getValue();
    }

    /* renamed from: g1 */
    public final void mo72509g1(C27012a.C27013a.C27016c cVar) {
        if (cVar.mo78441f()) {
            FragmentExtensionKt.m58751b(this, cVar.mo78439e());
        } else {
            FragmentKt.m118823k(this, C25204i.C25208d.m108938g(C25204i.f62079a, 0, 1, (Object) null));
        }
    }

    /* renamed from: h1 */
    public final void mo72510h1(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof RequireSignInThrowable) {
            FragmentExtensionKt.m58770u(this, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69230F, (Bundle) null, 16, (Object) null);
        } else if (th2 instanceof CancelOrderOnlineThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.cancel_order_default_error_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.cance…er_default_error_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            ((C36871x2) getBinding()).f91898c.setVisibility(0);
            ((C36871x2) getBinding()).f91897b.setVisibility(0);
        } else if (th2 instanceof UpdateOrderOnlineThrowable) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(R.string.update_order_default_error_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.updat…er_default_error_message)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            ((C36871x2) getBinding()).f91898c.setVisibility(0);
            ((C36871x2) getBinding()).f91897b.setVisibility(0);
        } else if (th2 != null) {
            ((C36871x2) getBinding()).f91898c.setVisibility(8);
            ((C36871x2) getBinding()).f91897b.setVisibility(8);
            Drawable i = C17318d.m79726i(requireContext(), R.drawable.ic_order_error);
            String string3 = getString(R.string.error_make_new_order);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.error_make_new_order)");
            C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string3, (String) null, getString(R.string.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
            C28500r.C28501a.m118423e(this, false, 1, (Object) null);
            hideLoading();
            mo72506d1().mo78401d();
        }
    }

    /* renamed from: i1 */
    public final void mo72511i1(boolean z) {
        if (!z) {
            hideLoading();
        } else if (z) {
            ((C36871x2) getBinding()).f91898c.setVisibility(8);
            ((C36871x2) getBinding()).f91897b.setVisibility(8);
            hideEmpty();
            hideErrorView();
            showLoading();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: j1 */
    public final void mo72512j1(List<? extends C25237e> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        boolean z3 = false;
        boolean z4 = true;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RecyclerView recyclerView = ((C36871x2) getBinding()).f91898c;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsAdapter");
            ((C24881i) adapter).mo72633m(list);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "handleResult$lambda$5");
            ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
            Object w2 = CollectionsKt___CollectionsKt.m40706w2(list);
            Intrinsics.checkNotNull(w2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel");
            OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel = (OrdersOnlineDetailsHeaderModel) w2;
            if (!Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.R2h.f70292e) && !Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.DriveExpressPickup.f70284e) && (!Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.Drive.f70282e) || !ordersOnlineDetailsHeaderModel.mo73388j0())) {
                OrderStatus g = ordersOnlineDetailsHeaderModel.mo73380g();
                if (g instanceof OrderStatus.Closed) {
                    z2 = true;
                } else {
                    z2 = g instanceof OrderStatus.Delivered;
                }
                if (!z2) {
                    z4 = g instanceof OrderStatus.ReadyToPick;
                }
                if (z4) {
                    z3 = DateTime.m51195N2(ordersOnlineDetailsHeaderModel.mo73372d()).mo27726S2(30).mo28754o0();
                }
            }
            if (z3) {
                Button button = ((C36871x2) getBinding()).f91897b;
                Intrinsics.checkNotNullExpressionValue(button, "binding.buttonFragmentOrdersDetailsOrderAgain");
                ViewKt.m152123e(button, (Integer) null, false, (C11289a) null, 7, (Object) null);
            }
        }
    }

    /* renamed from: k1 */
    public final void mo72513k1(C27012a.C27013a aVar) {
        if (aVar instanceof C27012a.C27013a.C27014a) {
            mo72510h1(((C27012a.C27013a.C27014a) aVar).mo78432d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27012a.C27013a.C27015b.f65701a)) {
            mo72500X0();
        } else if (aVar instanceof C27012a.C27013a.C27016c) {
            mo72509g1((C27012a.C27013a.C27016c) aVar);
        }
    }

    /* renamed from: l1 */
    public final boolean mo72514l1() {
        return ((Boolean) this.f61552X.getValue()).booleanValue();
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        if (mo72514l1()) {
            ShimmerFrameLayout shimmerFrameLayout = ((C36871x2) getBinding()).f91900e;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "{\n            binding.sh…neDetailsBilled\n        }");
            return shimmerFrameLayout;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = ((C36871x2) getBinding()).f91901f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "{\n            binding.sh…etailsValidated\n        }");
        return shimmerFrameLayout2;
    }

    /* renamed from: m1 */
    public final void mo72515m1() {
        mo72506d1().mo78412o();
        FragmentKt.m118823k(this, C25204i.f62079a.mo73264a(mo72505c1(), AccountListType.Order.f89772d));
    }

    /* renamed from: o1 */
    public final void mo72516o1(C27012a.C27017b bVar) {
        if (bVar instanceof C27012a.C27017b.C27019b) {
            mo72511i1(true);
        } else if (bVar instanceof C27012a.C27017b.C27020c) {
            mo72511i1(false);
            mo72512j1(((C27012a.C27017b.C27020c) bVar).mo78449i());
        }
    }

    public void onResume() {
        super.onResume();
        requireActivity().mo57175g0().mo56861b(AdditionalOrderBottomSheetFragment.f61711x, this, this);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72506d1().mo78400c();
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView M1 = bottomNavActivity.mo121107M1();
            String string = bottomNavActivity.getString(R.string.nhp_label_order);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.nhp_label_order)");
            ToolBarDefaultView.m158942o0(M1, string, bottomNavActivity.getString(R.string.order_txt_order_number, new Object[]{mo72505c1()}), 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
        RecyclerView recyclerView = ((C36871x2) getBinding()).f91898c;
        recyclerView.setAdapter(new C24881i(this.f61553Y, (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.mo59589n(new C38367a(1, true, 0, 4, (DefaultConstructorMarker) null));
        ((C36871x2) getBinding()).f91897b.setOnClickListener(new C25201g(this));
        OrderOnlineDetailViewModel f1 = mo72508f1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24823xcdee6ea2(this, f1, (C11045c) null, this), 3, (Object) null);
        OrderOnlineDetailViewModel f12 = mo72508f1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24818xecf6be6b(this, f12, (C11045c) null, this), 3, (Object) null);
        mo72504b1();
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
                FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                mo72504b1();
                return;
            }
            FragmentKt.m118823k(this, C25204i.C25208d.m108938g(C25204i.f62079a, 0, 1, (Object) null));
        }
    }

    /* renamed from: p1 */
    public void mo72517p1() {
        mo72506d1().mo78399b();
        mo72504b1();
    }

    /* renamed from: q1 */
    public final void mo72518q1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f61554f = appEnvironment;
    }

    /* renamed from: r1 */
    public final void mo72519r1(@C12579k C37815d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f61557w = dVar;
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo72517p1();
        return C11079d2.f28267a;
    }

    /* renamed from: s1 */
    public final void mo72520s1(@C12579k C37816e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f61558x = eVar;
    }

    /* renamed from: t1 */
    public final void mo72521t1(@C12579k C26996d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f61555g = dVar;
    }
}
