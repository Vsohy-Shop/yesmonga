package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.checkout.databinding.C39842b;
import com.carrefour.fid.android.checkout.domain.extension.C39854b;
import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter.C39913a;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBooked;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import com.carrefour.fid.android.domain.models.slot.extension.SlotKt;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.C11677z;
import kotlin.Result;
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
import p009io.github.aakira.napier.C10848c;

@C10164b
@C11076d0(mo22515d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001jB\u0007¢\u0006\u0004\bg\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J$\u0010 \u001a\u00020\u00032\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001e\u0018\u00010\u001dH\u0002J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0002J\u0016\u0010%\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u001eH\u0002J$\u0010(\u001a\u00020\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0002J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\nH\u0002J\u0012\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.H\u0002J\u0012\u00101\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.H\u0002J\u0019\u00103\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b3\u00104J&\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109H\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020AH\u0016R\u001b\u0010H\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010N\u001a\u00020I8BX\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006k"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/checkout/databinding/b;", "Lkotlin/d2;", "a1", "r1", "initHeader", "initListeners", "", "isProductThresholdExceeded", "", "startHourAvailable", "isYieldEligible", "q1", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$c;", "state", "s1", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$b;", "event", "o1", "c1", "isEnabled", "u1", "", "dateId", "f1", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "slot", "n1", "", "", "slotMap", "k1", "Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;", "partOfDay", "l1", "partOfDayList", "d1", "slotList", "selectedSlot", "h1", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "m1", "orderId", "v1", "", "throwable", "e1", "g1", "isLoading", "j1", "(Ljava/lang/Boolean;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/ViewStub;", "errorMessageLayout", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel;", "f", "Lkotlin/z;", "b1", "()Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotViewModel;", "viewModel", "Lcom/carrefour/fid/android/checkout/presentation/ui/slot/d;", "g", "Landroidx/navigation/m;", "Z0", "()Lcom/carrefour/fid/android/checkout/presentation/ui/slot/d;", "slotFragmentArgs", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/shared/util/j;", "w", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "x", "Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "Y0", "()Lcom/carrefour/fid/android/checkout/presentation/analytics/a;", "t1", "(Lcom/carrefour/fid/android/checkout/presentation/analytics/a;)V", "analytics", "<init>", "()V", "y", "a", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceSlotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,435:1\n56#2,10:436\n42#3,3:446\n183#4,6:449\n168#4,7:455\n1#5:462\n1549#6:463\n1620#6,3:464\n1549#6:467\n1620#6,3:468\n1549#6:471\n1620#6,3:472\n*S KotlinDebug\n*F\n+ 1 ServiceSlotFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotFragment\n*L\n72#1:436,10\n73#1:446,3\n124#1:449,6\n125#1:455,7\n281#1:463\n281#1:464,3\n300#1:467\n300#1:468,3\n309#1:471\n309#1:472,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment */
public final class ServiceSlotFragment extends C39912a<C39842b> {
    @C12579k

    /* renamed from: X */
    public static final String f101730X = "KEY_BASKET_SLOT_BOOKED";
    @C12579k

    /* renamed from: Y */
    public static final String f101731Y = "KEY_HOME_SLOT_BOOKED";
    @C12579k

    /* renamed from: y */
    public static final C39885a f101732y = new C39885a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f101733z = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f101734f;
    @C12579k

    /* renamed from: g */
    public final C19766m f101735g = new C19766m(C11342l0.m43547d(C39923d.class), new ServiceSlotFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: v */
    public C28796c f101736v;
    @Inject

    /* renamed from: w */
    public C28936j f101737w;
    @Inject

    /* renamed from: x */
    public C39866a f101738x;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$a */
    public static final class C39885a {
        public /* synthetic */ C39885a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39885a() {
        }
    }

    public ServiceSlotFragment() {
        super(C398841.f101739a);
        ServiceSlotFragment$special$$inlined$viewModels$default$1 serviceSlotFragment$special$$inlined$viewModels$default$1 = new ServiceSlotFragment$special$$inlined$viewModels$default$1(this);
        this.f101734f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(ServiceSlotViewModel.class), new ServiceSlotFragment$special$$inlined$viewModels$default$2(serviceSlotFragment$special$$inlined$viewModels$default$1), new ServiceSlotFragment$special$$inlined$viewModels$default$3(serviceSlotFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C39842b m162567R0(ServiceSlotFragment serviceSlotFragment) {
        return (C39842b) serviceSlotFragment.getBinding();
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m162574i1(ServiceSlotFragment serviceSlotFragment, List list, Slot slot, int i, Object obj) {
        if ((i & 2) != 0) {
            slot = null;
        }
        serviceSlotFragment.mo131516h1(list, slot);
    }

    /* renamed from: p1 */
    public static final void m162575p1(ServiceSlotFragment serviceSlotFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceSlotFragment, "this$0");
        serviceSlotFragment.mo131531u1(false);
        serviceSlotFragment.mo131509c1();
    }

    @C12579k
    /* renamed from: Y0 */
    public final C39866a mo131505Y0() {
        C39866a aVar = this.f101738x;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    /* renamed from: Z0 */
    public final C39923d mo131506Z0() {
        return (C39923d) this.f101735g.getValue();
    }

    /* renamed from: a1 */
    public final void mo131507a1() {
        String str;
        boolean z;
        ServiceSlotViewModel b1 = mo131508b1();
        String n = mo131506Z0().mo131618n();
        SlotArgsHome o = mo131506Z0().mo131619o();
        boolean r = mo131506Z0().mo131622r();
        boolean s = mo131506Z0().mo131623s();
        BasketSlot l = mo131506Z0().mo131616l();
        if (l != null) {
            str = l.mo116999j();
        } else {
            str = null;
        }
        String str2 = str;
        BasketSlot l2 = mo131506Z0().mo131616l();
        if (l2 != null) {
            z = l2.mo117001l();
        } else {
            z = false;
        }
        b1.sendIntent(new C39964a.C39977d.C39978a(n, o, r, s, str2, z));
    }

    /* renamed from: b1 */
    public final ServiceSlotViewModel mo131508b1() {
        return (ServiceSlotViewModel) this.f101734f.getValue();
    }

    /* renamed from: c1 */
    public final void mo131509c1() {
        boolean z;
        String p = mo131506Z0().mo131620p();
        if (p == null || p.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo131508b1().mo131756W0();
            return;
        }
        String string = getString(C39805b.C39823r.general_modify);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_modify)");
        String string2 = getString(C39805b.C39823r.product_details_change_slot_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(com.carrefour.…ails_change_slot_message)");
        FragmentKt.m118838z(this, string, string2, getString(C39805b.C39823r.yes), new ServiceSlotFragment$handleConfirmationClick$1(this, p), getString(C39805b.C39823r.f101567no), false, new ServiceSlotFragment$handleConfirmationClick$2(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: d1 */
    public final void mo131510d1(List<? extends SlotPartOfDay> list) {
        Iterable<SlotPartOfDay> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (SlotPartOfDay b : iterable) {
            arrayList.add(C39854b.m162475b(b));
        }
        ((C39842b) getBinding()).f101619g.mo113160F(arrayList);
    }

    /* renamed from: e1 */
    public final void mo131511e1(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof ServiceSlotViewModel.BookSlotError) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C39805b.C39823r.general_error_parameters_server_not_responding_01);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_01)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 instanceof ServiceSlotViewModel.SlotUnavailableError) {
            String R = C28932h.f70914a.mo84227R(((ServiceSlotViewModel.SlotUnavailableError) th2).mo131758a().mo119504p());
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(C39805b.C39823r.slot_unavailable);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.slot_unavailable)");
            String format = String.format(string2, Arrays.copyOf(new Object[]{R}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
            FragmentKt.m118811B(this, variant2, format, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            mo131507a1();
        } else if (th2 instanceof ServiceSlotViewModel.MissingProductError) {
            NotificationComponent.Variant variant3 = NotificationComponent.Variant.INFO;
            String string3 = getString(C39805b.C39823r.basket_changed_snackbar_title);
            String string4 = getString(C39805b.C39823r.basket_changed_snackbar);
            String string5 = getString(C39805b.C39823r.understood);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.basket_changed_snackbar_title)");
            FragmentKt.m118811B(this, variant3, string3, string4, string5, new ServiceSlotFragment$handleError$1(this), true, true, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1920, (Object) null);
        } else {
            mo131513g1(th);
        }
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C39842b) getBinding()).f101623k;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubServiceSlotError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo131512f1(int i) {
        ((C39842b) getBinding()).f101618f.mo113155e(i);
    }

    /* renamed from: g1 */
    public final void mo131513g1(Throwable th) {
        int i;
        String str;
        ((C39842b) getBinding()).f101614b.setVisibility(8);
        ((C39842b) getBinding()).f101620h.setVisibility(8);
        boolean z = th instanceof EmptyListThrowable;
        if (z) {
            i = C39805b.C39823r.service_slot_empty;
        } else {
            i = C39805b.C39823r.general_error_parameters_server_not_responding_01;
        }
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(if (throwable …server_not_responding_01)");
        Drawable i2 = C17318d.m79726i(requireContext(), C39805b.C39813h.ds_il_catalog_without_result);
        if (z) {
            str = null;
        } else {
            str = getString(C39805b.C39823r.general_try_again);
        }
        C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i2, string, (String) null, str, (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new ServiceSlotFragment$handleSlotError$1(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        C28500r.C28501a.m118423e(this, false, 1, (Object) null);
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f101737w;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f101736v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo131516h1(List<Slot> list, Slot slot) {
        List list2;
        C39913a aVar;
        boolean z;
        Date date;
        Date date2;
        String str;
        String str2;
        String str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.FRANCE);
        if (list != null) {
            Iterable<Slot> iterable = list;
            list2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Slot slot2 : iterable) {
                boolean z2 = true;
                if (slot2.mo119504p().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    date = simpleDateFormat.parse(slot2.mo119504p());
                } else {
                    date = new Date();
                }
                Date date3 = date;
                if (slot2.mo119505q().length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    date2 = simpleDateFormat.parse(slot2.mo119505q());
                } else {
                    date2 = new Date();
                }
                Date date4 = date2;
                String str4 = new String();
                Double w = slot2.mo119512w();
                Double w2 = slot2.mo119512w();
                if (w2 != null) {
                    str = C28782t.m119105b(w2);
                } else {
                    str = null;
                }
                boolean k = SlotKt.m158338k(slot2);
                boolean h = SlotKt.m158335h(slot2);
                boolean l = SlotKt.m158339l(slot2);
                boolean y = slot2.mo119515y();
                if (slot != null) {
                    str2 = slot.mo119508t();
                } else {
                    str2 = null;
                }
                boolean areEqual = Intrinsics.areEqual((Object) str2, (Object) slot2.mo119508t());
                BasketSlot l2 = mo131506Z0().mo131616l();
                if (l2 != null) {
                    str3 = l2.mo116999j();
                } else {
                    str3 = null;
                }
                ServiceSlotComponent.C37171b bVar = r6;
                ServiceSlotComponent.C37171b bVar2 = new ServiceSlotComponent.C37171b(date3, date4, str4, w, str, k, h, l, y, false, areEqual, Intrinsics.areEqual((Object) str3, (Object) slot2.mo119508t()));
                list2.add(bVar);
            }
        } else {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        RecyclerView recyclerView = ((C39842b) getBinding()).f101617e;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof C39913a) {
            aVar = (C39913a) adapter;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo131585k(list2);
        }
        recyclerView.setVisibility(0);
        hideErrorView();
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C39842b) getBinding()).f101621i.setContent(C8553b.m31049c(515825155, true, new ServiceSlotFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C39842b) getBinding()).f101619g.setOnOptionChangedListener(new ServiceSlotFragment$initListeners$1(this));
        ((C39842b) getBinding()).f101614b.setOnClickListener(new C39922c(this));
    }

    /* renamed from: j1 */
    public final void mo131519j1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            showLoading();
            ((C39842b) getBinding()).f101620h.setVisibility(8);
            return;
        }
        hideLoading();
        ((C39842b) getBinding()).f101620h.setVisibility(0);
    }

    /* renamed from: k1 */
    public final void mo131520k1(Map<String, ? extends List<Slot>> map) {
        boolean z;
        Object obj;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo131513g1(new EmptyListThrowable());
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE);
        Iterable<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            boolean z2 = !((Collection) entry.getValue()).isEmpty();
            try {
                Result.C10852a aVar = Result.f28060a;
                Date parse = simpleDateFormat.parse((String) entry.getKey());
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
                obj = Result.m38702b(parse);
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            if (Result.m38705e(obj) != null) {
                obj = new Date();
            }
            arrayList.add(new ServiceSlotDateComponent.C37173b((Date) obj, z2));
        }
        ((C39842b) getBinding()).f101618f.mo113154d(arrayList);
        ((C39842b) getBinding()).f101614b.setVisibility(0);
        ((C39842b) getBinding()).f101620h.setVisibility(0);
    }

    /* renamed from: l1 */
    public final void mo131521l1(SlotPartOfDay slotPartOfDay) {
        ((C39842b) getBinding()).f101619g.mo113162H(C39854b.m162475b(slotPartOfDay));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C39842b) getBinding()).f101615c;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.loadingLayout");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo131522m1(Slot slot, Basket basket) {
        C19456p0 i;
        C19456p0 i2;
        boolean r = mo131506Z0().mo131622r();
        boolean s = mo131506Z0().mo131623s();
        if (r) {
            NavController a = C19736g.m91827a(this);
            NavBackStackEntry O = a.mo58115O();
            if (!(O == null || (i2 = O.mo58069i()) == null)) {
                i2.mo57656q("KEY_BASKET_SLOT_BOOKED", new BasketSlotBooked(slot, basket, BasketSlotBookedMessageType.Success.f96702a));
            }
            a.mo58156s0();
        } else if (s) {
            NavController a2 = C19736g.m91827a(this);
            NavBackStackEntry O2 = a2.mo58115O();
            if (!(O2 == null || (i = O2.mo58069i()) == null)) {
                i.mo57656q("KEY_HOME_SLOT_BOOKED", new BasketSlotBooked(slot, basket, BasketSlotBookedMessageType.Success.f96702a));
            }
            a2.mo58156s0();
        } else {
            getNavigator().mo83830f(C19736g.m91827a(this), false, BasketSlotBookedMessageType.Success.f96702a, slot, mo131506Z0().mo131617m());
        }
    }

    /* renamed from: n1 */
    public final void mo131523n1(Slot slot) {
        mo131531u1(slot != null);
    }

    /* renamed from: o1 */
    public final void mo131524o1(C39964a.C39970b bVar) {
        mo131519j1(Boolean.FALSE);
        if (bVar instanceof C39964a.C39970b.C39972b) {
            mo131511e1(((C39964a.C39970b.C39972b) bVar).mo131813d());
        } else if (bVar instanceof C39964a.C39970b.C39971a) {
            C39964a.C39970b.C39971a aVar = (C39964a.C39970b.C39971a) bVar;
            mo131522m1(aVar.mo131808f(), aVar.mo131806e());
        } else if (bVar instanceof C39964a.C39970b.C39973c) {
            mo131532v1(((C39964a.C39970b.C39973c) bVar).mo131819d());
        } else if (bVar instanceof C39964a.C39970b.C39974d) {
            C39964a.C39970b.C39974d dVar = (C39964a.C39970b.C39974d) bVar;
            mo131525q1(dVar.mo131829g(), dVar.mo131828f(), dVar.mo131830h());
        }
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ComposeView composeView = ((C39842b) getBinding()).f101616d;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(-433690550, true, new ServiceSlotFragment$onCreateView$1$1(this)));
        return onCreateView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo131526r1();
        initListeners();
        initHeader();
        ServiceSlotViewModel b1 = mo131508b1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ServiceSlotFragment$onViewCreated$$inlined$processEvent$1(this, b1, (C11045c) null, this), 3, (Object) null);
        ServiceSlotViewModel b12 = mo131508b1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ServiceSlotFragment$onViewCreated$$inlined$processState$1(this, b12, (C11045c) null, this), 3, (Object) null);
        mo131507a1();
    }

    /* renamed from: q1 */
    public final void mo131525q1(boolean z, String str, boolean z2) {
        boolean z3;
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH'h'mm", Locale.FRANCE);
        if (str == null || str.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            date = simpleDateFormat.parse(str);
        } else {
            date = new Date();
        }
        String format = simpleDateFormat2.format(date);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C19501x.m90847a(viewLifecycleOwner).mo57476b(new ServiceSlotFragment$initSlotAdapter$1(this, z, format, z2, (C11045c<? super ServiceSlotFragment$initSlotAdapter$1>) null));
    }

    /* renamed from: r1 */
    public final void mo131526r1() {
        ((C39842b) getBinding()).f101618f.mo113153c(new ServiceSlotFragment$initView$1(this));
    }

    /* renamed from: s1 */
    public final void mo131527s1(C39964a.C39975c cVar) {
        mo131519j1(Boolean.valueOf(cVar.isLoading()));
        Map<String, List<Slot>> r = cVar.mo131847r();
        if (r != null) {
            mo131520k1(r);
        }
        SlotPartOfDay s = cVar.mo131848s();
        if (s != null) {
            mo131521l1(s);
        }
        if (cVar.mo131849t() != null) {
            mo131516h1(cVar.mo131849t(), cVar.mo131845p());
        }
        if (cVar.mo131845p() != null) {
            mo131523n1(cVar.mo131845p());
        }
        Integer q = cVar.mo131846q();
        if (q != null) {
            mo131512f1(q.intValue());
        }
        List<SlotPartOfDay> o = cVar.mo131844o();
        if (o != null) {
            mo131510d1(o);
        }
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f101737w = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f101736v = cVar;
    }

    /* renamed from: t1 */
    public final void mo131530t1(@C12579k C39866a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f101738x = aVar;
    }

    /* renamed from: u1 */
    public final void mo131531u1(boolean z) {
        ((C39842b) getBinding()).f101614b.setEnabled(z);
    }

    /* renamed from: v1 */
    public final void mo131532v1(String str) {
        if (mo131506Z0().mo131621q() != null) {
            getNavigator().mo83847w(C19736g.m91827a(this), str);
        }
    }
}
