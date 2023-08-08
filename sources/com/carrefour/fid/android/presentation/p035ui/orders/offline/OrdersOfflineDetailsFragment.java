package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36308g;
import com.carrefour.fid.android.databinding.C36841u2;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter.C24744e;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24798d;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26681a;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import p009io.github.aakira.napier.C10848c;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\bM\u0010NJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0019\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\"\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002J\b\u0010$\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u0003H\u0014J\u001a\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010L\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b I*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010H0H0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006Q"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/u2;", "Lkotlin/d2;", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$b;", "state", "m1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$c;", "event", "d1", "", "filePath", "h1", "f1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel$c$c;", "g1", "X0", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt;", "downloadReceipt", "k1", "downloadUrl", "l1", "", "throwable", "b1", "c1", "", "isLoading", "e1", "(Ljava/lang/Boolean;)V", "", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/d;", "result", "i1", "Landroid/view/ViewStub;", "errorMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "n1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/a;", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/a;", "o1", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/a;)V", "orderOfflineDetailAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel;", "g", "Lkotlin/z;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/offline/OrderOfflineDetailViewModel;", "orderOfflineDetailViewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/e;", "v", "Landroidx/navigation/m;", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/orders/offline/e;", "arguments", "w", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt;", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/adapter/e$a;", "x", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/adapter/e$a;", "adapterCallback", "Landroidx/activity/result/g;", "", "kotlin.jvm.PlatformType", "y", "Landroidx/activity/result/g;", "permissionLauncher", "<init>", "()V", "z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineDetailsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n106#2,15:264\n42#3,3:279\n168#4,7:282\n183#4,6:289\n1#5:295\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineDetailsFragment\n*L\n52#1:264,15\n54#1:279,3\n105#1:282,7\n106#1:289,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineDetailsFragment */
public final class OrdersOfflineDetailsFragment extends C24765b<C36841u2> {

    /* renamed from: X */
    public static final int f61349X = 8;
    @C12579k

    /* renamed from: Y */
    public static final String f61350Y = "OrdersOfflineDetailsFragment";
    @C12579k

    /* renamed from: z */
    public static final C24709a f61351z = new C24709a((DefaultConstructorMarker) null);
    @Inject

    /* renamed from: f */
    public C26681a f61352f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61353g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61354v = new C19766m(C11342l0.m43547d(C24768e.class), new OrdersOfflineDetailsFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: w */
    public DownloadReceipt f61355w = DownloadReceipt.BillReceipt.f61487b;
    @C12579k

    /* renamed from: x */
    public final C24744e.C24745a f61356x = new C24710b(this);
    @C12579k

    /* renamed from: y */
    public final C0302g<String[]> f61357y;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineDetailsFragment$a */
    public static final class C24709a {
        public /* synthetic */ C24709a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24709a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineDetailsFragment$b */
    public static final class C24710b implements C24744e.C24745a {

        /* renamed from: a */
        public final /* synthetic */ OrdersOfflineDetailsFragment f61359a;

        public C24710b(OrdersOfflineDetailsFragment ordersOfflineDetailsFragment) {
            this.f61359a = ordersOfflineDetailsFragment;
        }

        /* renamed from: a */
        public final void mo72228a(@C12579k DownloadReceipt downloadReceipt) {
            Intrinsics.checkNotNullParameter(downloadReceipt, "receipt");
            this.f61359a.f61355w = downloadReceipt;
            if (downloadReceipt instanceof DownloadReceipt.BillReceipt) {
                this.f61359a.mo72212a1().sendIntent(OrderOfflineDetailViewModel.C26661d.C26662a.f65088a);
            } else {
                this.f61359a.mo72209X0();
            }
        }
    }

    @C11363r0({"SMAP\nOrdersOfflineDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineDetailsFragment$permissionLauncher$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1726#2,3:264\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineDetailsFragment$permissionLauncher$1\n*L\n70#1:264,3\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineDetailsFragment$c */
    public static final class C24711c implements C0263a<Map<String, Boolean>> {

        /* renamed from: a */
        public final /* synthetic */ OrdersOfflineDetailsFragment f61360a;

        public C24711c(OrdersOfflineDetailsFragment ordersOfflineDetailsFragment) {
            this.f61360a = ordersOfflineDetailsFragment;
        }

        /* renamed from: b */
        public final void mo790a(Map<String, Boolean> map) {
            Iterable values = map.values();
            boolean z = true;
            if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                Iterator it = values.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                OrdersOfflineDetailsFragment ordersOfflineDetailsFragment = this.f61360a;
                ordersOfflineDetailsFragment.mo72222k1(ordersOfflineDetailsFragment.f61355w);
            }
        }
    }

    public OrdersOfflineDetailsFragment() {
        super(C247081.f61358a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24723x7fba123c(new C24722x7fba123b(this)));
        this.f61353g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(OrderOfflineDetailViewModel.class), new C24724x7fba123d(b), new C24725x7fba123e((C11289a) null, b), new C24726x7fba123f(this, b));
        C0302g<String[]> registerForActivityResult = registerForActivityResult(new C0268b.C0287k(), new C24711c(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f61357y = registerForActivityResult;
    }

    /* renamed from: X0 */
    public final void mo72209X0() {
        Context context = getContext();
        boolean z = false;
        if (context != null && C36308g.m148960b(context)) {
            z = true;
        }
        if (z) {
            mo72222k1(this.f61355w);
        } else {
            this.f61357y.mo960b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    /* renamed from: Y0 */
    public final C24768e mo72210Y0() {
        return (C24768e) this.f61354v.getValue();
    }

    @C12579k
    /* renamed from: Z0 */
    public final C26681a mo72211Z0() {
        C26681a aVar = this.f61352f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderOfflineDetailAnalyticsViewModel");
        return null;
    }

    /* renamed from: a1 */
    public final OrderOfflineDetailViewModel mo72212a1() {
        return (OrderOfflineDetailViewModel) this.f61353g.getValue();
    }

    /* renamed from: b1 */
    public final void mo72213b1(Throwable th) {
        int i;
        if (th instanceof NetWorkResponseThrowable) {
            i = R.string.error_no_internet_connexion;
        } else {
            i = R.string.update_order_default_error_message;
        }
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n            w…e\n            }\n        )");
        FragmentKt.m118811B(this, NotificationComponent.Variant.ERROR, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: c1 */
    public final void mo72214c1(Throwable th) {
        if (th != null) {
            Drawable i = C17318d.m79726i(requireContext(), R.drawable.ic_order_error);
            String string = getString(R.string.order_txt_error_offline_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.order…rror_offline_description)");
            C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, (String) null, getString(R.string.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
            C28500r.C28501a.m118423e(this, false, 1, (Object) null);
            ((C36841u2) getBinding()).f91738c.setVisibility(8);
        }
    }

    /* renamed from: d1 */
    public final void mo72215d1(OrderOfflineDetailViewModel.C26655c cVar) {
        if (cVar instanceof OrderOfflineDetailViewModel.C26655c.C26657b) {
            mo72214c1(((OrderOfflineDetailViewModel.C26655c.C26657b) cVar).mo77455d());
        } else if (cVar instanceof OrderOfflineDetailViewModel.C26655c.C26656a) {
            mo72213b1(((OrderOfflineDetailViewModel.C26655c.C26656a) cVar).mo77449d());
        } else if (cVar instanceof OrderOfflineDetailViewModel.C26655c.C26658c) {
            mo72218g1((OrderOfflineDetailViewModel.C26655c.C26658c) cVar);
        } else if (cVar instanceof OrderOfflineDetailViewModel.C26655c.C26660e) {
            mo72219h1(((OrderOfflineDetailViewModel.C26655c.C26660e) cVar).mo77475d());
        } else if (cVar instanceof OrderOfflineDetailViewModel.C26655c.C26659d) {
            mo72217f1(((OrderOfflineDetailViewModel.C26655c.C26659d) cVar).mo77469d());
        }
    }

    /* renamed from: e1 */
    public final void mo72216e1(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            hideLoading();
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            hideEmpty();
            hideErrorView();
            showLoading();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36841u2) getBinding()).f91740e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentOrdersOfflineDetailsError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo72217f1(String str) {
        mo72211Z0().mo77554b();
        NotificationComponent.Variant variant = NotificationComponent.Variant.SUCCESS;
        String string = getString(R.string.offline_order_download_bank_receipt_success_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.offli…_receipt_success_message)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        FragmentKt.m118823k(this, C24771f.f61456a.mo72320a(mo72210Y0().mo72302e(), str, DownloadReceipt.BankReceipt.f61485b));
    }

    /* renamed from: g1 */
    public final void mo72218g1(OrderOfflineDetailViewModel.C26655c.C26658c cVar) {
        if (cVar.mo77464f()) {
            mo72209X0();
            return;
        }
        String e = cVar.mo77462e();
        if (e != null) {
            mo72223l1(e);
        }
    }

    /* renamed from: h1 */
    public final void mo72219h1(String str) {
        mo72211Z0().mo77555c();
        NotificationComponent.Variant variant = NotificationComponent.Variant.SUCCESS;
        String string = getString(R.string.offline_order_download_bill_success_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.offli…oad_bill_success_message)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        FragmentKt.m118823k(this, C24771f.f61456a.mo72320a(mo72210Y0().mo72302e(), str, DownloadReceipt.BillReceipt.f61487b));
    }

    /* renamed from: i1 */
    public final void mo72220i1(List<? extends C24798d> list) {
        boolean z;
        C24744e eVar;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RecyclerView recyclerView = ((C36841u2) getBinding()).f91738c;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof C24744e) {
                eVar = (C24744e) adapter;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                eVar.mo72270k(list);
            }
            Intrinsics.checkNotNullExpressionValue(recyclerView, "handleResult$lambda$6");
            ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    /* renamed from: j1 */
    public final void mo72221j1() {
        mo72212a1().sendIntent(new OrderOfflineDetailViewModel.C26661d.C26665d(mo72210Y0().mo72302e()));
    }

    /* renamed from: k1 */
    public final void mo72222k1(DownloadReceipt downloadReceipt) {
        if (downloadReceipt instanceof DownloadReceipt.BillReceipt) {
            mo72212a1().sendIntent(new OrderOfflineDetailViewModel.C26661d.C26664c(mo72210Y0().mo72302e()));
        } else {
            mo72212a1().sendIntent(new OrderOfflineDetailViewModel.C26661d.C26663b(mo72210Y0().mo72302e()));
        }
    }

    /* renamed from: l1 */
    public final void mo72223l1(String str) {
        String string = getString(R.string.general_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        String string2 = getString(R.string.order_detail_command_dialog_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.order…l_command_dialog_message)");
        FragmentKt.m118838z(this, string, string2, getString(R.string.general_see), new OrdersOfflineDetailsFragment$redirectToDownloadUrl$1(this, str), getString(R.string.general_cancel), false, OrdersOfflineDetailsFragment$redirectToDownloadUrl$2.f61369f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36841u2) getBinding()).f91739d;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFragmentOrdersOfflineDetails");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo72224m1(OrderOfflineDetailViewModel.C26653b bVar) {
        mo72216e1(Boolean.valueOf(bVar.isLoading()));
        if (bVar.mo77444j() != null) {
            mo72220i1(bVar.mo77444j());
        }
    }

    /* renamed from: n1 */
    public void mo72225n1() {
        mo72221j1();
    }

    /* renamed from: o1 */
    public final void mo72226o1(@C12579k C26681a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61352f = aVar;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            String string = bottomNavActivity.getString(R.string.order_details_subtitle, new Object[]{StringKt.m118939s(mo72210Y0().mo72302e().mo72369i())});
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …flineDate()\n            )");
            ToolBarDefaultView M1 = bottomNavActivity.mo121107M1();
            String string2 = bottomNavActivity.getString(R.string.order_details_bill_receipt_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.order…tails_bill_receipt_title)");
            ToolBarDefaultView.m158942o0(M1, string2, string, 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
        RecyclerView recyclerView = ((C36841u2) getBinding()).f91738c;
        recyclerView.setAdapter(new C24744e(this.f61356x, (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        OrderOfflineDetailViewModel a1 = mo72212a1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24717x548757ce(this, a1, (C11045c) null, this), 3, (Object) null);
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24712x738fa797(this, a1, (C11045c) null, this), 3, (Object) null);
        mo72221j1();
        mo72211Z0().mo77553a();
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo72225n1();
        return C11079d2.f28267a;
    }
}
