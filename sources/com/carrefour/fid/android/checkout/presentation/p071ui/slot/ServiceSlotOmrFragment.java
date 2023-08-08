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
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.navigation.C19766m;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.checkout.databinding.C39843c;
import com.carrefour.fid.android.checkout.domain.extension.C39854b;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBooked;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.collections.C10978t;
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
@C11076d0(mo22515d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001aB\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\"\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J$\u0010\u001f\u001a\u00020\u00032\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001d\u0018\u00010\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0002J\u0016\u0010$\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002J$\u0010'\u001a\u00020\u00032\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\tH\u0002J\u0012\u0010/\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010-H\u0002J\u0012\u00100\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010-H\u0002J\u0019\u00102\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b2\u00103J&\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\b\u0010?\u001a\u00020>H\u0016J\b\u0010A\u001a\u00020@H\u0016R\u001b\u0010G\u001a\u00020B8BX\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006b"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotOmrFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/checkout/databinding/c;", "Lkotlin/d2;", "p1", "initHeader", "initListeners", "", "isProductThresholdExceeded", "", "startHourAvailable", "isYieldEligible", "o1", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$c;", "state", "q1", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/mvi/a$b;", "event", "m1", "a1", "isEnabled", "r1", "", "dateId", "d1", "Lcom/carrefour/fid/android/domain/models/slot/Slot;", "slot", "l1", "", "", "slotMap", "i1", "Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;", "partOfDay", "j1", "partOfDayList", "b1", "slotList", "selectedSlot", "f1", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "k1", "orderId", "s1", "", "throwable", "c1", "e1", "isLoading", "h1", "(Ljava/lang/Boolean;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/ViewStub;", "errorMessageLayout", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotOmrViewModel;", "f", "Lkotlin/z;", "Z0", "()Lcom/carrefour/fid/android/checkout/presentation/viewmodels/slot/ServiceSlotOmrViewModel;", "viewModel", "Lcom/carrefour/fid/android/checkout/presentation/ui/slot/i;", "g", "Landroidx/navigation/m;", "Y0", "()Lcom/carrefour/fid/android/checkout/presentation/ui/slot/i;", "slotFragmentArgs", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/shared/util/j;", "w", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "x", "a", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceSlotOmrFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotOmrFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotOmrFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,383:1\n56#2,10:384\n42#3,3:394\n183#4,6:397\n168#4,7:403\n1#5:410\n1549#6:411\n1620#6,3:412\n1549#6:415\n1620#6,3:416\n1549#6:419\n1620#6,3:420\n*S KotlinDebug\n*F\n+ 1 ServiceSlotOmrFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/slot/ServiceSlotOmrFragment\n*L\n70#1:384,10\n71#1:394,3\n100#1:397,6\n101#1:403,7\n255#1:411\n255#1:412,3\n274#1:415\n274#1:416,3\n283#1:419\n283#1:420,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment */
public final class ServiceSlotOmrFragment extends C39921b<C39843c> {
    @C12579k

    /* renamed from: X */
    public static final String f101748X = "KEY_HOME_SLOT_BOOKED";
    @C12579k

    /* renamed from: x */
    public static final C39899a f101749x = new C39899a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f101750y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f101751z = "KEY_BASKET_SLOT_BOOKED";
    @C12579k

    /* renamed from: f */
    public final C11677z f101752f;
    @C12579k

    /* renamed from: g */
    public final C19766m f101753g = new C19766m(C11342l0.m43547d(C39931i.class), new ServiceSlotOmrFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: v */
    public C28796c f101754v;
    @Inject

    /* renamed from: w */
    public C28936j f101755w;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment$a */
    public static final class C39899a {
        public /* synthetic */ C39899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39899a() {
        }
    }

    public ServiceSlotOmrFragment() {
        super(C398981.f101756a);
        ServiceSlotOmrFragment$special$$inlined$viewModels$default$1 serviceSlotOmrFragment$special$$inlined$viewModels$default$1 = new ServiceSlotOmrFragment$special$$inlined$viewModels$default$1(this);
        this.f101752f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(ServiceSlotOmrViewModel.class), new ServiceSlotOmrFragment$special$$inlined$viewModels$default$2(serviceSlotOmrFragment$special$$inlined$viewModels$default$1), new ServiceSlotOmrFragment$special$$inlined$viewModels$default$3(serviceSlotOmrFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C39843c m162605R0(ServiceSlotOmrFragment serviceSlotOmrFragment) {
        return (C39843c) serviceSlotOmrFragment.getBinding();
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m162612g1(ServiceSlotOmrFragment serviceSlotOmrFragment, List list, Slot slot, int i, Object obj) {
        if ((i & 2) != 0) {
            slot = null;
        }
        serviceSlotOmrFragment.mo131552f1(list, slot);
    }

    /* renamed from: n1 */
    public static final void m162613n1(ServiceSlotOmrFragment serviceSlotOmrFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceSlotOmrFragment, "this$0");
        serviceSlotOmrFragment.mo131566r1(false);
        serviceSlotOmrFragment.mo131547a1();
    }

    /* renamed from: Y0 */
    public final C39931i mo131545Y0() {
        return (C39931i) this.f101753g.getValue();
    }

    /* renamed from: Z0 */
    public final ServiceSlotOmrViewModel mo131546Z0() {
        return (ServiceSlotOmrViewModel) this.f101752f.getValue();
    }

    /* renamed from: a1 */
    public final void mo131547a1() {
        boolean z;
        String o = mo131545Y0().mo131664o();
        if (o == null || o.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo131546Z0().mo131725M0(mo131545Y0().mo131662m());
            return;
        }
        String string = getString(C39805b.C39823r.general_modify);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_modify)");
        String string2 = getString(C39805b.C39823r.product_details_change_slot_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(com.carrefour.…ails_change_slot_message)");
        FragmentKt.m118838z(this, string, string2, getString(C39805b.C39823r.yes), new ServiceSlotOmrFragment$handleConfirmationClick$1(this, o), getString(C39805b.C39823r.f101567no), false, new ServiceSlotOmrFragment$handleConfirmationClick$2(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: b1 */
    public final void mo131548b1(List<? extends SlotPartOfDay> list) {
        Iterable<SlotPartOfDay> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (SlotPartOfDay b : iterable) {
            arrayList.add(C39854b.m162475b(b));
        }
        ((C39843c) getBinding()).f101631g.mo113160F(arrayList);
    }

    /* renamed from: c1 */
    public final void mo131549c1(Throwable th) {
        if (th instanceof ServiceSlotOmrViewModel.BookSlotError) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C39805b.C39823r.general_error_parameters_server_not_responding_01);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_01)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            return;
        }
        mo131551e1(th);
    }

    /* renamed from: d1 */
    public final void mo131550d1(int i) {
        ((C39843c) getBinding()).f101630f.mo113155e(i);
    }

    /* renamed from: e1 */
    public final void mo131551e1(Throwable th) {
        int i;
        String str;
        ((C39843c) getBinding()).f101626b.setVisibility(8);
        ((C39843c) getBinding()).f101632h.setVisibility(8);
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
        C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i2, string, (String) null, str, (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new ServiceSlotOmrFragment$handleSlotError$1(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        C28500r.C28501a.m118423e(this, false, 1, (Object) null);
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C39843c) getBinding()).f101635k;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubServiceSlotError");
        return viewStub;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131552f1(java.util.List<com.carrefour.fid.android.domain.models.slot.Slot> r22, com.carrefour.fid.android.domain.models.slot.Slot r23) {
        /*
            r21 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.FRANCE
            r0.<init>(r1, r2)
            r1 = 0
            r2 = 0
            if (r22 == 0) goto L_0x00c3
            r3 = r22
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0020:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r3.next()
            com.carrefour.fid.android.domain.models.slot.Slot r5 = (com.carrefour.fid.android.domain.models.slot.Slot) r5
            java.lang.String r6 = r5.mo119504p()
            int r6 = r6.length()
            r7 = 1
            if (r6 <= 0) goto L_0x0039
            r6 = r7
            goto L_0x003a
        L_0x0039:
            r6 = r1
        L_0x003a:
            if (r6 == 0) goto L_0x0045
            java.lang.String r6 = r5.mo119504p()
            java.util.Date r6 = r0.parse(r6)
            goto L_0x004a
        L_0x0045:
            java.util.Date r6 = new java.util.Date
            r6.<init>()
        L_0x004a:
            r9 = r6
            java.lang.String r6 = r5.mo119505q()
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r7 = r1
        L_0x0057:
            if (r7 == 0) goto L_0x0062
            java.lang.String r6 = r5.mo119505q()
            java.util.Date r6 = r0.parse(r6)
            goto L_0x0067
        L_0x0062:
            java.util.Date r6 = new java.util.Date
            r6.<init>()
        L_0x0067:
            r10 = r6
            java.lang.String r11 = new java.lang.String
            r11.<init>()
            java.lang.Double r12 = r5.mo119512w()
            java.lang.Double r6 = r5.mo119512w()
            if (r6 == 0) goto L_0x007d
            java.lang.String r6 = com.carrefour.fid.android.shared.extension.C28782t.m119105b(r6)
            r13 = r6
            goto L_0x007e
        L_0x007d:
            r13 = r2
        L_0x007e:
            boolean r14 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158338k(r5)
            boolean r16 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158339l(r5)
            boolean r15 = com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158335h(r5)
            boolean r17 = r5.mo119515y()
            if (r23 == 0) goto L_0x0095
            java.lang.String r6 = r23.mo119508t()
            goto L_0x0096
        L_0x0095:
            r6 = r2
        L_0x0096:
            java.lang.String r7 = r5.mo119508t()
            boolean r19 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            com.carrefour.fid.android.checkout.presentation.ui.slot.i r6 = r21.mo131545Y0()
            com.carrefour.fid.android.domain.models.basket.BasketSlot r6 = r6.mo131660k()
            if (r6 == 0) goto L_0x00ad
            java.lang.String r6 = r6.mo116999j()
            goto L_0x00ae
        L_0x00ad:
            r6 = r2
        L_0x00ae:
            java.lang.String r5 = r5.mo119508t()
            boolean r20 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent$b r5 = new com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent$b
            r18 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r5)
            goto L_0x0020
        L_0x00c3:
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00c7:
            androidx.viewbinding.b r0 = r21.getBinding()
            com.carrefour.fid.android.checkout.databinding.c r0 = (com.carrefour.fid.android.checkout.databinding.C39843c) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f101629e
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = r0.getAdapter()
            boolean r5 = r3 instanceof com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter.C39913a
            if (r5 == 0) goto L_0x00da
            r2 = r3
            com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.a r2 = (com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter.C39913a) r2
        L_0x00da:
            if (r2 == 0) goto L_0x00df
            r2.mo131585k(r4)
        L_0x00df:
            r0.setVisibility(r1)
            r21.hideErrorView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.ServiceSlotOmrFragment.mo131552f1(java.util.List, com.carrefour.fid.android.domain.models.slot.Slot):void");
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f101755w;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f101754v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo131555h1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            showLoading();
            ((C39843c) getBinding()).f101632h.setVisibility(8);
            return;
        }
        hideLoading();
        ((C39843c) getBinding()).f101632h.setVisibility(0);
    }

    /* renamed from: i1 */
    public final void mo131556i1(Map<String, ? extends List<Slot>> map) {
        boolean z;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo131551e1(new EmptyListThrowable());
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE);
        Iterable<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            Date parse = simpleDateFormat.parse((String) entry.getKey());
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            arrayList.add(new ServiceSlotDateComponent.C37173b(parse, !((Collection) entry.getValue()).isEmpty()));
        }
        ((C39843c) getBinding()).f101630f.mo113154d(arrayList);
        ((C39843c) getBinding()).f101626b.setVisibility(0);
        ((C39843c) getBinding()).f101632h.setVisibility(0);
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C39843c) getBinding()).f101633i.setContent(C8553b.m31049c(-1266142663, true, new ServiceSlotOmrFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C39843c) getBinding()).f101631g.setOnOptionChangedListener(new ServiceSlotOmrFragment$initListeners$1(this));
        ((C39843c) getBinding()).f101626b.setOnClickListener(new C39930h(this));
    }

    /* renamed from: j1 */
    public final void mo131559j1(SlotPartOfDay slotPartOfDay) {
        ((C39843c) getBinding()).f101631g.mo113162H(C39854b.m162475b(slotPartOfDay));
    }

    /* renamed from: k1 */
    public final void mo131560k1(Slot slot, Basket basket) {
        C19456p0 i;
        if (mo131545Y0().mo131666q()) {
            NavController a = C19736g.m91827a(this);
            getNavigator().mo83843s(C19736g.m91827a(this), true);
            NavBackStackEntry G = a.mo58099G();
            if (G != null && (i = G.mo58069i()) != null) {
                i.mo57656q("KEY_HOME_SLOT_BOOKED", new BasketSlotBooked(slot, basket, BasketSlotBookedMessageType.Success.f96702a));
                return;
            }
            return;
        }
        getNavigator().mo83830f(C19736g.m91827a(this), false, BasketSlotBookedMessageType.Success.f96702a, slot, mo131545Y0().mo131661l());
    }

    /* renamed from: l1 */
    public final void mo131561l1(Slot slot) {
        mo131566r1(slot != null);
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C39843c) getBinding()).f101627c;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.loadingLayout");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo131562m1(C39964a.C39970b bVar) {
        mo131555h1(Boolean.FALSE);
        if (bVar instanceof C39964a.C39970b.C39972b) {
            mo131549c1(((C39964a.C39970b.C39972b) bVar).mo131813d());
        } else if (bVar instanceof C39964a.C39970b.C39971a) {
            C39964a.C39970b.C39971a aVar = (C39964a.C39970b.C39971a) bVar;
            mo131560k1(aVar.mo131808f(), aVar.mo131806e());
        } else if (bVar instanceof C39964a.C39970b.C39973c) {
            mo131567s1(((C39964a.C39970b.C39973c) bVar).mo131819d());
        } else if (bVar instanceof C39964a.C39970b.C39974d) {
            C39964a.C39970b.C39974d dVar = (C39964a.C39970b.C39974d) bVar;
            mo131563o1(dVar.mo131829g(), dVar.mo131828f(), dVar.mo131830h());
        }
    }

    /* renamed from: o1 */
    public final void mo131563o1(boolean z, String str, boolean z2) {
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
        C19501x.m90847a(viewLifecycleOwner).mo57476b(new ServiceSlotOmrFragment$initSlotAdapter$1(this, z, format, z2, (C11045c<? super ServiceSlotOmrFragment$initSlotAdapter$1>) null));
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ComposeView composeView = ((C39843c) getBinding()).f101628d;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(-629494976, true, new ServiceSlotOmrFragment$onCreateView$1$1(this)));
        return onCreateView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo131564p1();
        initListeners();
        ServiceSlotOmrViewModel Z0 = mo131546Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = C19501x.m90847a(viewLifecycleOwner);
        String str = null;
        C11723c2 unused = C12038j.m48061f(a, (CoroutineContext) null, (CoroutineStart) null, new ServiceSlotOmrFragment$onViewCreated$$inlined$processEvent$1(this, Z0, (C11045c) null, this), 3, (Object) null);
        ServiceSlotOmrViewModel Z02 = mo131546Z0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ServiceSlotOmrFragment$onViewCreated$$inlined$processState$1(this, Z02, (C11045c) null, this), 3, (Object) null);
        ServiceSlotOmrViewModel Z03 = mo131546Z0();
        String m = mo131545Y0().mo131662m();
        boolean q = mo131545Y0().mo131666q();
        BasketSlot k = mo131545Y0().mo131660k();
        if (k != null) {
            str = k.mo116999j();
        }
        String str2 = str;
        BasketSlot k2 = mo131545Y0().mo131660k();
        if (k2 != null) {
            z = k2.mo117001l();
        } else {
            z = false;
        }
        Z03.sendIntent(new C39964a.C39977d.C39978a(m, (SlotArgsHome) null, false, q, str2, z));
    }

    /* renamed from: p1 */
    public final void mo131564p1() {
        initHeader();
        ((C39843c) getBinding()).f101630f.mo113153c(new ServiceSlotOmrFragment$initView$1(this));
    }

    /* renamed from: q1 */
    public final void mo131565q1(C39964a.C39975c cVar) {
        mo131555h1(Boolean.valueOf(cVar.isLoading()));
        Map<String, List<Slot>> r = cVar.mo131847r();
        if (r != null) {
            mo131556i1(r);
        }
        SlotPartOfDay s = cVar.mo131848s();
        if (s != null) {
            mo131559j1(s);
        }
        if (cVar.mo131849t() != null) {
            mo131552f1(cVar.mo131849t(), cVar.mo131845p());
        }
        if (cVar.mo131845p() != null) {
            mo131561l1(cVar.mo131845p());
        }
        Integer q = cVar.mo131846q();
        if (q != null) {
            mo131550d1(q.intValue());
        }
        List<SlotPartOfDay> o = cVar.mo131844o();
        if (o != null) {
            mo131548b1(o);
        }
    }

    /* renamed from: r1 */
    public final void mo131566r1(boolean z) {
        ((C39843c) getBinding()).f101626b.setEnabled(z);
    }

    /* renamed from: s1 */
    public final void mo131567s1(String str) {
        if (mo131545Y0().mo131665p() != null) {
            getNavigator().mo83839o(C19736g.m91827a(this), str);
        }
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f101755w = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f101754v = cVar;
    }
}
