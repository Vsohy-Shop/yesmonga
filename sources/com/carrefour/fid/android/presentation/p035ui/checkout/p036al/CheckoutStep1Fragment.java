package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.C20208s;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.databinding.C36720i1;
import com.carrefour.fid.android.design.components.divider.C37091a;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.exceptions.RevokeTokenException;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketServiceType;
import com.carrefour.fid.android.domain.models.C37953b;
import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.C38489h;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23363h;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.RecommendedProductsAdapter;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import com.carrefour.fid.android.presentation.p035ui.product.list.C25450a;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26024a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.NestedScrollViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@C11076d0(mo22515d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0002bf\b\u0007\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0001B\b¢\u0006\u0005\b\u0010\u0001J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001c\u001a\u00020\bH\u0002J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002J$\u0010)\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'H\u0002J\u001e\u0010.\u001a\u00020\u001a2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020\u0015H\u0002J \u00100\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0015H\u0002J\u0010\u00101\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u00102\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u00104\u001a\u00020\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*H\u0002J\u0018\u00105\u001a\u00020\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*H\u0002J\u0010\u00108\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0002J\b\u00109\u001a\u00020\bH\u0002J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020:H\u0016J\b\u0010>\u001a\u00020=H\u0016J&\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016J\u001a\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016J\b\u0010I\u001a\u00020\bH\u0016J\b\u0010J\u001a\u00020\bH\u0014J\b\u0010K\u001a\u00020\bH\u0014J\u0018\u0010L\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010M\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010N\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010O\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010W\u001a\u00020P8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001b\u0010w\u001a\u00020r8BX\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010{\u001a\u00020x8BX\u0002¢\u0006\f\n\u0004\bN\u0010t\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020C8BX\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/i1;", "Lcom/carrefour/fid/android/presentation/ui/models/a$a;", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "productPosition", "Lkotlin/d2;", "f1", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/a$d;", "state", "w1", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/a$c;", "event", "v1", "numberOfBaskets", "m1", "s1", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basket", "", "showPreparationFees", "i1", "", "throwable", "", "g1", "h1", "loading", "r1", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/domain/models/slot/SlotExpress;", "slotExpress", "j1", "Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;", "basketSlot", "", "totalAmount", "", "facilityServiceId", "t1", "", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "isAntiInflationEnabled", "p1", "isForRecommendedProducts", "e1", "d1", "V", "mostRelevantProducts", "q1", "o1", "Lcom/carrefour/fid/android/presentation/models/h;", "deliveryThreshold", "l1", "k1", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onResume", "x1", "Y0", "o0", "J", "Y", "D", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "g", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "v", "Ljava/lang/String;", "basketTypeAnalytic", "w", "Ljava/util/List;", "currentOfferList", "com/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment$b", "x", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment$b;", "criteoTrackingCallback", "com/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment$basketCallback$1", "y", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment$basketCallback$1;", "basketCallback", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;", "z", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;", "y1", "(Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;)V", "checkoutStep1AnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep1MVIViewModel;", "X", "Lkotlin/z;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep1MVIViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/adapter/RecommendedProductsAdapter;", "b1", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/adapter/RecommendedProductsAdapter;", "mostRelevantProductsAdapter", "Z0", "()Landroid/os/Bundle;", "categoryListByGtinBundle", "<init>", "()V", "Z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep1Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep1Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,928:1\n48#2,9:929\n1603#3,9:938\n1855#3:947\n1856#3:949\n1612#3:950\n800#3,11:964\n1747#3,3:975\n800#3,11:978\n1549#3:989\n1620#3,3:990\n1#4:948\n168#5,7:951\n183#5,6:958\n*S KotlinDebug\n*F\n+ 1 CheckoutStep1Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment\n*L\n216#1:929,9\n149#1:938,9\n149#1:947\n149#1:949\n149#1:950\n724#1:964,11\n727#1:975,3\n731#1:978,11\n733#1:989\n733#1:990,3\n149#1:948\n360#1:951,7\n361#1:958,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment */
public final class CheckoutStep1Fragment extends C23440z<C36720i1> implements C24646a.C24647a {

    /* renamed from: E0 */
    public static final int f58976E0 = 8;
    @C12579k

    /* renamed from: F0 */
    public static final String f58977F0 = "CheckoutStep1Fragment";
    @C12579k

    /* renamed from: Z */
    public static final C23271a f58978Z = new C23271a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: X */
    public final C11677z f58979X;
    @C12579k

    /* renamed from: Y */
    public final C11677z f58980Y;
    @Inject

    /* renamed from: f */
    public C28796c f58981f;
    @C12580l

    /* renamed from: g */
    public C37370b f58982g;
    @C12579k

    /* renamed from: v */
    public String f58983v = new String();
    @C12579k

    /* renamed from: w */
    public List<? extends OfferModel> f58984w = CollectionsKt__CollectionsKt.m40441E();
    @C12579k

    /* renamed from: x */
    public final C23272b f58985x = new C23272b(this);
    @C12579k

    /* renamed from: y */
    public final CheckoutStep1Fragment$basketCallback$1 f58986y = new CheckoutStep1Fragment$basketCallback$1(this);
    @Inject

    /* renamed from: z */
    public C26007d f58987z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$a */
    public static final class C23271a {
        public /* synthetic */ C23271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23271a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$b */
    public static final class C23272b implements C25412b {

        /* renamed from: a */
        public final /* synthetic */ CheckoutStep1Fragment f58989a;

        public C23272b(CheckoutStep1Fragment checkoutStep1Fragment) {
            this.f58989a = checkoutStep1Fragment;
        }

        /* renamed from: a */
        public void mo68180a(@C12580l String str) {
            this.f58989a.mo68155c1().sendIntent(new C26024a.C26054e.C26071q(str));
        }

        /* renamed from: b */
        public void mo68181b(@C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain, @C12580l String str, @C12580l String str2) {
            C25412b.C25413a.m109696a(this, criteoFormatRenderingDomain, str, str2);
        }

        /* renamed from: c */
        public void mo68182c() {
            this.f58989a.mo68155c1().sendIntent(C26024a.C26054e.C26072r.f63703a);
        }
    }

    public CheckoutStep1Fragment() {
        super(C232701.f58988a);
        C11677z c = C10864b0.m38748c(new CheckoutStep1Fragment$special$$inlined$hiltNavGraphViewModels$1(this, R.id.basket_graph));
        this.f58979X = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CheckoutStep1MVIViewModel.class), new CheckoutStep1Fragment$special$$inlined$hiltNavGraphViewModels$2(c, (C11510n) null), new CheckoutStep1Fragment$special$$inlined$hiltNavGraphViewModels$3(this, c, (C11510n) null));
        this.f58980Y = C10864b0.m38748c(new CheckoutStep1Fragment$mostRelevantProductsAdapter$2(this));
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36720i1 m103965Q0(CheckoutStep1Fragment checkoutStep1Fragment) {
        return (C36720i1) checkoutStep1Fragment.getBinding();
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m103973n1(CheckoutStep1Fragment checkoutStep1Fragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        checkoutStep1Fragment.mo68166m1(i);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m103974u1(CheckoutStep1Fragment checkoutStep1Fragment, BasketSlot basketSlot, float f, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        checkoutStep1Fragment.mo68174t1(basketSlot, f, str);
    }

    /* renamed from: D */
    public void mo68147D(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        mo68153a1().mo75507y(offerProductModel, i);
    }

    /* renamed from: J */
    public void mo68148J(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        mo68155c1().sendIntent(new C26024a.C26054e.C26065k(offerProductModel, (Integer) null, 2, (DefaultConstructorMarker) null));
        mo68153a1().mo75498p(offerProductModel, offerProductModel.mo121519p0(), i);
        mo68155c1().sendIntent(new C26024a.C26054e.C26070p(offerProductModel, -offerProductModel.mo121519p0()));
    }

    /* renamed from: V */
    public final void mo68149V(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentExtensionKt.m58759j(this, new CheckoutStep1Fragment$handleMixingPressed$1(this));
    }

    /* renamed from: Y */
    public void mo68150Y(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        if (!offerProductModel.mo121497A1()) {
            mo68153a1().mo75501s(offerProductModel, i);
            mo68155c1().sendIntent(new C26024a.C26054e.C26056b(offerProductModel));
            return;
        }
        mo68153a1().mo75502t(offerProductModel, i);
        mo68155c1().sendIntent(new C26024a.C26054e.C26066l(offerProductModel));
    }

    /* renamed from: Y0 */
    public void mo68151Y0() {
        BottomNavActivity bottomNavActivity;
        mo68153a1().mo75500r(this.f58983v);
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

    /* renamed from: Z0 */
    public final Bundle mo68152Z0() {
        OfferProductModel offerProductModel;
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (OfferModel offerModel : this.f58984w) {
            if (offerModel instanceof OfferProductModel) {
                offerProductModel = (OfferProductModel) offerModel;
            } else {
                offerProductModel = null;
            }
            if (offerProductModel != null) {
                arrayList.add(offerProductModel);
            }
        }
        bundle.putSerializable(C38212b.f96795c, OfferProductModelKt.m159581c(arrayList));
        return bundle;
    }

    @C12579k
    /* renamed from: a1 */
    public final C26007d mo68153a1() {
        C26007d dVar = this.f58987z;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkoutStep1AnalyticsViewModel");
        return null;
    }

    /* renamed from: b1 */
    public final RecommendedProductsAdapter mo68154b1() {
        return (RecommendedProductsAdapter) this.f58980Y.getValue();
    }

    /* renamed from: c1 */
    public final CheckoutStep1MVIViewModel mo68155c1() {
        return (CheckoutStep1MVIViewModel) this.f58979X.getValue();
    }

    /* renamed from: d1 */
    public final void mo68156d1(OfferProductModel offerProductModel) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        FragmentKt.m118816d(this, OfferProductModelKt.m159590l(offerProductModel, resources));
    }

    /* renamed from: e1 */
    public final void mo68157e1(OfferProductModel offerProductModel, int i, boolean z) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo68155c1().sendIntent(new C26024a.C26054e.C26055a(offerProductModel));
            if (z) {
                mo68153a1().mo75491i(offerProductModel, 1, i);
                mo68155c1().sendIntent(new C26024a.C26054e.C26070p(offerProductModel, 1));
                return;
            }
            mo68153a1().mo75492j(offerProductModel, 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new CheckoutStep1Fragment$handleAtcPressed$1(this, offerProductModel, p0, z, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    public /* bridge */ /* synthetic */ C11079d2 emptyFunction() {
        mo68151Y0();
        return C11079d2.f28267a;
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36720i1) getBinding()).f91005l;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentBasketEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36720i1) getBinding()).f91006m;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubFragmentBasketError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo68158f1(OfferProductModel offerProductModel, int i) {
        mo68157e1(offerProductModel, i, true);
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r7v17, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo68159g1(java.lang.Throwable r29) {
        /*
            r28 = this;
            r15 = r28
            r6 = r29
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceDeliveryThrowable
            java.lang.String r1 = "getString(R.string.fec_b…heck_delivery_area_error)"
            r2 = 2131952750(0x7f13046e, float:1.9541952E38)
            java.lang.String r3 = "getString(R.string.general_information)"
            r4 = 2131952800(0x7f1304a0, float:1.9542053E38)
            r5 = 2131953236(0x7f130654, float:1.9542937E38)
            if (r0 == 0) goto L_0x004d
            java.lang.String r4 = r15.getString(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            java.lang.String r2 = r15.getString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r3 = 0
            r6 = 0
            java.lang.String r5 = r15.getString(r5)
            r7 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$1 r8 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$1
            r8.<init>(r15)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4012(0xfac, float:5.622E-42)
            r16 = 0
            r0 = r28
            r1 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            com.carrefour.fid.android.shared.extension.FragmentKt.m118838z(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x004d:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketValidationWithoutBookThrowable
            if (r0 == 0) goto L_0x0055
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x0055:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketSlotDetailThrowable
            if (r0 == 0) goto L_0x0082
            r0 = 2131952141(0x7f13020d, float:1.9540716E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.checkout_fetch_slot_error)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r0 = r28.mo68153a1()
            r0.mo75499q(r2)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x0082:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketSlotBookThrowable
            r7 = 0
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L_0x0116
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 400(0x190, float:5.6E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r8] = r1
            r1 = 404(0x194, float:5.66E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r9] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r6
            com.carrefour.fid.android.core.io.BasketSlotBookThrowable r1 = (com.carrefour.fid.android.core.p057io.BasketSlotBookThrowable) r1
            java.lang.Throwable r1 = r1.getCause()
            boolean r2 = r1 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r2 == 0) goto L_0x00b0
            com.carrefour.fid.android.shared.io.ResponseThrowable r1 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r1
            goto L_0x00b1
        L_0x00b0:
            r1 = r7
        L_0x00b1:
            if (r1 == 0) goto L_0x00bb
            int r1 = r1.mo83810a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x00bb:
            boolean r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40558R1(r0, r7)
            if (r0 == 0) goto L_0x00ed
            com.carrefour.fid.android.core.type.BasketErrorType r0 = com.carrefour.fid.android.core.type.BasketErrorType.SlotBadRequestDuringBook
            int r0 = r0.mo108470q()
            java.lang.String r2 = r15.getString(r0)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r0 = r28.mo68153a1()
            java.lang.String r1 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r0.mo75499q(r2)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x00ed:
            r0 = 2131952091(0x7f1301db, float:1.9540615E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.checkout_associate_failed)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r0 = r28.mo68153a1()
            r0.mo75499q(r2)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x0116:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketMinAmountNotReachedThrowable
            if (r0 == 0) goto L_0x014f
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r2 = r6
            com.carrefour.fid.android.core.io.BasketMinAmountNotReachedThrowable r2 = (com.carrefour.fid.android.core.p057io.BasketMinAmountNotReachedThrowable) r2
            double r2 = r2.mo108316a()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.C28782t.m119105b(r2)
            r0[r8] = r2
            r2 = 2131951960(0x7f130158, float:1.954035E38)
            java.lang.String r2 = r15.getString(r2, r0)
            java.lang.String r0 = "getString(\n             …Euros()\n                )"
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x014f:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketValidationForAddressThrowable
            if (r0 == 0) goto L_0x01a5
            java.lang.String r1 = r15.getString(r4)
            r0 = r6
            com.carrefour.fid.android.core.io.BasketValidationForAddressThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketValidationForAddressThrowable) r0
            boolean r0 = r0.mo108322d()
            if (r0 == 0) goto L_0x0164
            r0 = 2131953514(0x7f13076a, float:1.9543501E38)
            goto L_0x0167
        L_0x0164:
            r0 = 2131953513(0x7f130769, float:1.95435E38)
        L_0x0167:
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r5 = r15.getString(r5)
            r0 = 2131952781(0x7f13048d, float:1.9542014E38)
            java.lang.String r4 = r15.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r0 = "getString(\n             …      }\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$3 r7 = com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1Fragment$handleBasketError$3.f59000f
            r8 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$4 r9 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$4
            r9.<init>(r15, r6)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 4000(0xfa0, float:5.605E-42)
            r17 = 0
            r0 = r28
            r3 = r4
            r4 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r16
            r14 = r17
            com.carrefour.fid.android.shared.extension.FragmentKt.m118838z(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x01a5:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x01d3
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = r6
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r15.getString(r0)
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x01d3:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            if (r0 == 0) goto L_0x0217
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r2 = r6
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r2 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r2
            java.lang.Throwable r2 = r2.getCause()
            boolean r3 = r2 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x01e9
            r7 = r2
            com.carrefour.fid.android.shared.io.ResponseThrowable r7 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r7
        L_0x01e9:
            if (r7 == 0) goto L_0x01f0
            int r2 = r7.mo83810a()
            goto L_0x01f1
        L_0x01f0:
            r2 = r8
        L_0x01f1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            r2 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r15.getString(r2, r0)
            java.lang.String r0 = "getString(\n             …de ?: 0\n                )"
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x0217:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0243
            com.carrefour.fid.android.shared.util.i r16 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r6
            com.carrefour.fid.android.core.io.ShoppingListThrowable r0 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r0
            java.lang.String r1 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L_0x0232
            r18 = r6
            goto L_0x0234
        L_0x0232:
            r18 = r0
        L_0x0234:
            r19 = 0
            r20 = 4
            r21 = 0
            r17 = r1
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r16, r17, r18, r19, r20, r21)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x0243:
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x0249
            r0 = r9
            goto L_0x024b
        L_0x0249:
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
        L_0x024b:
            if (r0 == 0) goto L_0x024f
            r0 = r9
            goto L_0x0255
        L_0x024f:
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r0 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)
        L_0x0255:
            r10 = 8
            if (r0 == 0) goto L_0x0284
            androidx.viewbinding.b r0 = r28.getBinding()
            com.carrefour.fid.android.databinding.i1 r0 = (com.carrefour.fid.android.databinding.C36720i1) r0
            androidx.constraintlayout.widget.Group r0 = r0.f91000g
            r0.setVisibility(r10)
            r28.hideErrorView()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 111(0x6f, float:1.56E-43)
            r9 = 0
            r0 = r28
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118419a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r28.showEmpty()
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r0 = r28.mo68153a1()
            r0.mo75490h()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x0284:
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.p046io.RecommendedProductsThrowable
            if (r0 == 0) goto L_0x028a
            r0 = r9
            goto L_0x028c
        L_0x028a:
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.p046io.RemoteConfigFeatureUnavailableThrowable
        L_0x028c:
            if (r0 == 0) goto L_0x02a1
            androidx.viewbinding.b r0 = r28.getBinding()
            com.carrefour.fid.android.databinding.i1 r0 = (com.carrefour.fid.android.databinding.C36720i1) r0
            com.carrefour.fid.android.databinding.t8 r0 = r0.f91007n
            android.widget.LinearLayout r0 = r0.getRoot()
            r0.setVisibility(r10)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x02a1:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x02cf
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = r6
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r2 = r28.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r2)
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x02cf:
            boolean r0 = r6 instanceof com.carrefour.fid.android.shared.p046io.BasketCheckDeliveryThrowable
            if (r0 == 0) goto L_0x030a
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            java.lang.String r2 = r15.getString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r4 = 0
            r6 = 0
            java.lang.String r5 = r15.getString(r5)
            r7 = 0
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$5 r8 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleBasketError$5
            r8.<init>(r15)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4012(0xfac, float:5.622E-42)
            r16 = 0
            r0 = r28
            r1 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            com.carrefour.fid.android.shared.extension.FragmentKt.m118838z(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x030a:
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable
            if (r0 == 0) goto L_0x0310
            r0 = r9
            goto L_0x0312
        L_0x0310:
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable
        L_0x0312:
            if (r0 == 0) goto L_0x033c
            androidx.fragment.app.h r0 = r28.getActivity()
            if (r0 == 0) goto L_0x0329
            r1 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r2 = "getString(\n             …d_store\n                )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.carrefour.fid.android.shared.extension.ActivityKt.m118689B(r0, r9, r1)
        L_0x0329:
            r28.mo68151Y0()
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r0 = r28.mo68155c1()
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$n r1 = com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26024a.C26054e.C26068n.f63694a
            r0.sendIntent(r1)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r28)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x03f7
        L_0x033c:
            boolean r0 = r6 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            if (r0 == 0) goto L_0x037b
            com.carrefour.fid.android.shared.util.i r16 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r6
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r0
            java.lang.String r0 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r17 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r16, r17, r18, r19, r20, r21)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.fec_b…_category_limit_excecced)"
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
            r0 = r28
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x03f7
        L_0x037b:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            if (r6 == 0) goto L_0x0384
            java.lang.String r1 = r29.getMessage()
            goto L_0x0385
        L_0x0384:
            r1 = r7
        L_0x0385:
            java.lang.String r11 = ""
            if (r1 != 0) goto L_0x038a
            r1 = r11
        L_0x038a:
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r29
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            androidx.viewbinding.b r0 = r28.getBinding()
            com.carrefour.fid.android.databinding.i1 r0 = (com.carrefour.fid.android.databinding.C36720i1) r0
            androidx.constraintlayout.widget.Group r0 = r0.f91000g
            r0.setVisibility(r10)
            r28.hideEmpty()
            com.carrefour.fid.android.design.components.widgets.MessageComponent$a r1 = new com.carrefour.fid.android.design.components.widgets.MessageComponent$a
            android.content.Context r0 = r28.requireContext()
            r2 = 2131231396(0x7f0802a4, float:1.8078872E38)
            android.graphics.drawable.Drawable r17 = androidx.core.content.C17318d.m79726i(r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            if (r6 == 0) goto L_0x03b6
            java.lang.String r2 = r29.getMessage()
            goto L_0x03b7
        L_0x03b6:
            r2 = r7
        L_0x03b7:
            if (r2 != 0) goto L_0x03ba
            goto L_0x03bb
        L_0x03ba:
            r11 = r2
        L_0x03bb:
            r0[r8] = r11
            r2 = 2131951975(0x7f130167, float:1.954038E38)
            java.lang.String r0 = r15.getString(r2, r0)
            java.lang.String r2 = "getString(R.string.baske…wable?.message.orEmpty())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r19 = 0
            r2 = 2131952813(0x7f1304ad, float:1.954208E38)
            java.lang.String r20 = r15.getString(r2)
            r21 = 0
            r22 = 0
            com.carrefour.fid.android.design.components.widgets.MessageComponent$Type r23 = com.carrefour.fid.android.design.components.widgets.MessageComponent.Type.ERROR
            r24 = 0
            r25 = 0
            r26 = 384(0x180, float:5.38E-43)
            r27 = 0
            r16 = r1
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r28
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118421c(r0, r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r15, r8, r9, r7)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x03f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1Fragment.mo68159g1(java.lang.Throwable):java.lang.Object");
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f58981f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo68161h1() {
        if (((C36720i1) getBinding()).f91004k.getVisibility() == 8) {
            ((C36720i1) getBinding()).f91000g.setVisibility(8);
            hideEmpty();
            hideErrorView();
            showLoading();
        }
    }

    /* renamed from: i1 */
    public final void mo68162i1(BasketDomain basketDomain, boolean z) {
        com.carrefour.fid.android.core.type.BasketType basketType;
        boolean z2;
        BasketServiceType I;
        C26007d a1 = mo68153a1();
        BasketService basketService = null;
        if (basketDomain != null) {
            basketType = basketDomain.mo115499w();
        } else {
            basketType = null;
        }
        if (!(basketDomain == null || (I = basketDomain.mo115466I()) == null)) {
            basketService = I.mo115633d();
        }
        if (basketDomain != null) {
            z2 = basketDomain.mo115470M();
        } else {
            z2 = false;
        }
        this.f58983v = a1.mo75483a(basketType, basketService, z2);
        if (basketDomain != null) {
            BasketAmounts b = C37953b.m155980b(basketDomain.mo115498v());
            BasketPromotionCode c = C37953b.m155981c(basketDomain.mo115462E());
            int D = basketDomain.mo115461D();
            BasketReturnableBags H = basketDomain.mo115465H();
            if (b != null) {
                mo68153a1().mo75484b((float) b.mo116868D());
                ((C36720i1) getBinding()).f91003j.setContent(C8553b.m31049c(206347926, true, new CheckoutStep1Fragment$handleBasketResult$1(b, c, H, D, z)));
            }
        }
    }

    /* renamed from: j1 */
    public final void mo68163j1(SlotExpress slotExpress) {
        FragmentKt.m118823k(this, C23363h.C23366c.m104253b(C23363h.f59156a, BasketSlotBookedMessageType.NoneBecauseOfExpressPickup.f96700a, slotExpress, (Slot) null, mo68152Z0(), 4, (Object) null));
    }

    /* renamed from: k1 */
    public final void mo68164k1() {
        Rect rect = new Rect();
        ((C36720i1) getBinding()).f90996c.getHitRect(rect);
        RecyclerView recyclerView = ((C36720i1) getBinding()).f91007n.f91716b;
        RecommendedProductsAdapter b1 = mo68154b1();
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        b1.mo68359o(recyclerView, rect);
    }

    /* renamed from: l1 */
    public final void mo68165l1(C38489h hVar) {
        mo68153a1().mo75494l(hVar);
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36720i1) getBinding()).f91004k;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFragmentBasket");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo68166m1(int i) {
        ((C36720i1) getBinding()).f90997d.setContent(C8553b.m31049c(-414400833, true, new CheckoutStep1Fragment$handleHeader$1(i, this)));
    }

    /* renamed from: o0 */
    public void mo68167o0(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        mo68157e1(offerProductModel, i, false);
    }

    /* renamed from: o1 */
    public final void mo68168o1(List<? extends OfferProductModel> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C36720i1) getBinding()).f91007n.f91716b.setVisibility(8);
            return;
        }
        mo68153a1().mo75487e(list);
        ((C36720i1) getBinding()).f91007n.f91716b.setVisibility(0);
        if (mo68154b1().getList().isEmpty()) {
            mo68153a1().mo75497o(list);
        }
        mo68154b1().mo68361q(list);
        mo68164k1();
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ComposeView composeView = ((C36720i1) getBinding()).f90995b;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(-374781269, true, new CheckoutStep1Fragment$onCreateView$1$1(this)));
        return onCreateView;
    }

    public void onResume() {
        super.onResume();
        mo68155c1().sendIntent(C26024a.C26054e.C26073s.f63705a);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        m103973n1(this, 0, 1, (Object) null);
        FragmentKt.m118815c(this, new CheckoutStep1Fragment$onViewCreated$1(this));
        RecyclerView recyclerView = ((C36720i1) getBinding()).f91001h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listFragmentBasket");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "requireContext().theme");
        CheckoutStep1Fragment$basketCallback$1 checkoutStep1Fragment$basketCallback$1 = this.f58986y;
        C23272b bVar = this.f58985x;
        CheckoutStep1Fragment$onViewCreated$appViewBinder$1 checkoutStep1Fragment$onViewCreated$appViewBinder$1 = CheckoutStep1Fragment$onViewCreated$appViewBinder$1.f59001f;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C25450a aVar = new C25450a(recyclerView, resources, theme, this, checkoutStep1Fragment$basketCallback$1, bVar, checkoutStep1Fragment$onViewCreated$appViewBinder$1, C19501x.m90847a(viewLifecycleOwner));
        RecyclerView recyclerView2 = ((C36720i1) getBinding()).f91001h;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.listFragmentBasket");
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        Resources.Theme theme2 = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme2, "requireContext().theme");
        C23436w wVar = new C23436w(recyclerView2, resources2, theme2, this.f58986y, aVar);
        RecyclerView recyclerView3 = ((C36720i1) getBinding()).f91001h;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "binding.listFragmentBasket");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f58982g = C37373c.m153543a(recyclerView3, requireContext, wVar);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        Drawable i = C17318d.m79726i(requireContext(), R.drawable.background_divider);
        if (i != null) {
            C37091a aVar2 = new C37091a(requireContext2, 0, false, i, (C37091a.C37093b) null, 16, (DefaultConstructorMarker) null);
            RecyclerView recyclerView4 = ((C36720i1) getBinding()).f91007n.f91716b;
            new C20208s().mo60274b(recyclerView4);
            recyclerView4.setAdapter(mo68154b1());
            recyclerView4.mo59589n(aVar2);
            if (bundle == null) {
                C19234h0 u = getChildFragmentManager().mo56909u();
                u.mo57202D(R.id.coordinator_fragment_basket, CheckoutStep1FooterFragment.f58962w.mo68130a(), CheckoutStep1FooterFragment.f58964y);
                u.mo57052q();
            }
            mo68172s1();
            CheckoutStep1MVIViewModel c1 = mo68155c1();
            C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep1Fragment$onViewCreated$$inlined$processState$1(this, c1, (C11045c) null, this), 3, (Object) null);
            CheckoutStep1MVIViewModel c12 = mo68155c1();
            C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
            C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep1Fragment$onViewCreated$$inlined$processEvent$1(this, c12, (C11045c) null, this), 3, (Object) null);
            mo68155c1().sendIntent(C26024a.C26054e.C26063i.f63683a);
            return;
        }
        throw new IllegalStateException("Can't instantiate divider Drawable!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo68169p1(java.util.List<? extends com.carrefour.fid.android.presentation.models.OfferModel> r26, boolean r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r26.isEmpty()
            if (r2 == 0) goto L_0x0015
            com.carrefour.fid.android.shared.io.EmptyListThrowable r1 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r1.<init>()
            java.lang.Object r1 = r0.mo68159g1(r1)
            goto L_0x0179
        L_0x0015:
            r25.hideLoading()
            r25.hideEmpty()
            r25.hideErrorView()
            r0.f58984w = r1
            com.carrefour.fid.android.design.components.widgets.productcard.list.b r2 = r0.f58982g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            java.util.List r2 = r2.getList()
            if (r2 == 0) goto L_0x0034
            boolean r2 = r2.isEmpty()
            if (r2 != r3) goto L_0x0034
            r2 = r3
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x0096
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r2 = r25.mo68153a1()
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r5.iterator()
        L_0x0047:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0059
            java.lang.Object r8 = r7.next()
            boolean r9 = r8 instanceof com.carrefour.fid.android.presentation.models.OfferMixingModel
            if (r9 == 0) goto L_0x0047
            r6.add(r8)
            goto L_0x0047
        L_0x0059:
            int r6 = r6.size()
            r2.mo75496n(r6)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r2 = r25.mo68153a1()
            java.lang.String r6 = r0.f58983v
            r2.mo75488f(r1, r6)
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0078
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0078
        L_0x0076:
            r2 = r4
            goto L_0x008d
        L_0x0078:
            java.util.Iterator r2 = r5.iterator()
        L_0x007c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0076
            java.lang.Object r5 = r2.next()
            com.carrefour.fid.android.presentation.models.OfferModel r5 = (com.carrefour.fid.android.presentation.models.OfferModel) r5
            boolean r5 = r5 instanceof com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel
            if (r5 == 0) goto L_0x007c
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x0096
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.d r2 = r25.mo68153a1()
            r2.mo75506x()
        L_0x0096:
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a2:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b4
            java.lang.Object r6 = r2.next()
            boolean r7 = r6 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r7 == 0) goto L_0x00a2
            r5.add(r6)
            goto L_0x00a2
        L_0x00b4:
            com.carrefour.fid.android.design.components.widgets.productcard.list.b r2 = r0.f58982g
            if (r2 != 0) goto L_0x00ba
            goto L_0x0162
        L_0x00ba:
            java.util.Collection r1 = (java.util.Collection) r1
            com.carrefour.fid.android.presentation.models.OfferClearModel r6 = new com.carrefour.fid.android.presentation.models.OfferClearModel
            r6.<init>()
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40723z4(r1, r6)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.C10978t.m41495Y(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x00d6:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x015f
            java.lang.Object r7 = r1.next()
            com.carrefour.fid.android.presentation.models.OfferModel r7 = (com.carrefour.fid.android.presentation.models.OfferModel) r7
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r8 == 0) goto L_0x0132
            r9 = r7
            com.carrefour.fid.android.presentation.models.OfferProductModel r9 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r9
            android.content.res.Resources r10 = r25.getResources()
            java.lang.String r8 = "resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r8)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$1 r11 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$1
            r11.<init>(r0, r7, r5)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$2 r12 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$2
            r12.<init>(r0, r7, r5)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$3 r13 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$3
            r13.<init>(r0, r7, r5)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$4 r14 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$4
            r14.<init>(r0, r7, r5)
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$5 r15 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$5
            r15.<init>(r0, r7)
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 1
            r20 = 1
            boolean r8 = r9.mo121743k1()
            if (r8 == 0) goto L_0x0120
            if (r27 == 0) goto L_0x0120
            r21 = r3
            goto L_0x0122
        L_0x0120:
            r21 = r4
        L_0x0122:
            com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$6 r8 = new com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$6
            r8.<init>(r7, r0)
            r23 = 192(0xc0, float:2.69E-43)
            r24 = 0
            r22 = r8
            com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a r7 = com.carrefour.fid.android.presentation.models.mapper.C38510j.m159764b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0138
        L_0x0132:
            boolean r8 = r7 instanceof com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a
            if (r8 == 0) goto L_0x013c
            com.carrefour.fid.android.design.components.widgets.productcard.list.a r7 = (com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a) r7
        L_0x0138:
            r6.add(r7)
            goto L_0x00d6
        L_0x013c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r2 = r7.getClass()
            kotlin.reflect.d r2 = kotlin.jvm.internal.C11342l0.m43547d(r2)
            java.lang.String r2 = r2.mo22848s()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown model type: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x015f:
            r2.setList(r6)
        L_0x0162:
            androidx.viewbinding.b r1 = r25.getBinding()
            com.carrefour.fid.android.databinding.i1 r1 = (com.carrefour.fid.android.databinding.C36720i1) r1
            androidx.constraintlayout.widget.Group r2 = r1.f91000g
            java.lang.String r1 = "binding.groupFragmentBasket"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            com.carrefour.fid.android.design.components.extension.ViewKt.m152123e(r2, r3, r4, r5, r6, r7)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x0179:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1Fragment.mo68169p1(java.util.List, boolean):java.lang.Object");
    }

    /* renamed from: q1 */
    public final void mo68170q1(List<? extends OfferProductModel> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C36720i1) getBinding()).f91007n.getRoot().setVisibility(8);
            return;
        }
        ((C36720i1) getBinding()).f91007n.getRoot().setVisibility(0);
        mo68168o1(list);
    }

    /* renamed from: r1 */
    public final void mo68171r1(Boolean bool) {
        if (!Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ((C36720i1) getBinding()).f91002i.setVisibility(8);
        } else {
            ((C36720i1) getBinding()).f91002i.setVisibility(0);
        }
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo68177x1();
        return C11079d2.f28267a;
    }

    /* renamed from: s1 */
    public final void mo68172s1() {
        RecyclerView recyclerView = ((C36720i1) getBinding()).f91007n.f91716b;
        NestedScrollView nestedScrollView = ((C36720i1) getBinding()).f90996c;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "binding.basketContainer");
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        NestedScrollViewKt.m118859d(nestedScrollView, recyclerView, new CheckoutStep1Fragment$initScrollListener$1$1(this, recyclerView));
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58981f = cVar;
    }

    /* renamed from: t1 */
    public final void mo68174t1(BasketSlot basketSlot, float f, String str) {
        mo68153a1().mo75485c(f);
        FragmentKt.m118823k(this, C23363h.f59156a.mo68453c(basketSlot, str, mo68152Z0()));
    }

    /* renamed from: v1 */
    public final void mo68175v1(C26024a.C26040c cVar) {
        C26024a.C26040c cVar2 = cVar;
        if (cVar2 instanceof C26024a.C26040c.C26043c) {
            C26024a.C26040c.C26043c cVar3 = (C26024a.C26040c.C26043c) cVar2;
            if (cVar3.mo75590d().getCause() instanceof RevokeTokenException) {
                mo68159g1(new EmptyListThrowable());
            } else {
                mo68159g1(cVar3.mo75590d());
            }
        } else if (Intrinsics.areEqual((Object) cVar2, (Object) C26024a.C26040c.C26044d.f63645a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.INFO;
            String string = getString(R.string.market_place);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.market_place)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (cVar2 instanceof C26024a.C26040c.C26047g) {
            mo68163j1(((C26024a.C26040c.C26047g) cVar2).mo75606d());
        } else if (cVar2 instanceof C26024a.C26040c.C26046f) {
            C26024a.C26040c.C26046f fVar = (C26024a.C26040c.C26046f) cVar2;
            mo68174t1(fVar.mo75599f(), fVar.mo75601h(), fVar.mo75600g());
        } else if (cVar2 instanceof C26024a.C26040c.C26041a) {
            mo68156d1(((C26024a.C26040c.C26041a) cVar2).mo75578d());
        } else if (cVar2 instanceof C26024a.C26040c.C26042b) {
            ((C36720i1) getBinding()).f90996c.mo53233Y(0, (int) (((C36720i1) getBinding()).f91001h.getY() + ((C36720i1) getBinding()).f91001h.getChildAt(((C26024a.C26040c.C26042b) cVar2).mo75584d()).getY()));
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(R.string.checkout_basket_contain_alcohol_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.check…_contain_alcohol_message)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            mo68153a1().mo75505w(false);
        }
    }

    /* renamed from: w1 */
    public final void mo68176w1(C26024a.C26048d dVar) {
        if (dVar instanceof C26024a.C26048d.C26052d) {
            C26024a.C26048d.C26052d dVar2 = (C26024a.C26048d.C26052d) dVar;
            mo68169p1(dVar2.mo75625i(), dVar2.mo75626j());
        } else if (dVar instanceof C26024a.C26048d.C26049a) {
            C26024a.C26048d.C26049a aVar = (C26024a.C26048d.C26049a) dVar;
            mo68162i1(aVar.mo75616j(), aVar.mo75618l());
        } else if (dVar instanceof C26024a.C26030b.C26033c) {
            mo68165l1(((C26024a.C26030b.C26033c) dVar).mo75543h());
        } else if (dVar instanceof C26024a.C26030b.C26039i) {
            mo68171r1(Boolean.valueOf(((C26024a.C26030b.C26039i) dVar).isLoading()));
        } else if (dVar instanceof C26024a.C26030b.C26036f) {
            mo68170q1(((C26024a.C26030b.C26036f) dVar).mo75555h());
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C26024a.C26030b.C26034d.f63627b)) {
            mo68159g1(new EmptyListThrowable());
        } else if (dVar instanceof C26024a.C26030b.C26035e) {
            C26024a.C26030b.C26035e eVar = (C26024a.C26030b.C26035e) dVar;
            if (eVar.mo75549h().getCause() instanceof RevokeTokenException) {
                mo68159g1(new EmptyListThrowable());
            } else {
                mo68159g1(eVar.mo75549h());
            }
        } else if (dVar instanceof C26024a.C26030b.C26031a) {
            mo68161h1();
        } else if (dVar instanceof C26024a.C26030b.C26037g) {
            mo68166m1(((C26024a.C26030b.C26037g) dVar).mo75561h());
        }
    }

    /* renamed from: x1 */
    public void mo68177x1() {
        mo68155c1().sendIntent(C26024a.C26054e.C26073s.f63705a);
    }

    /* renamed from: y1 */
    public final void mo68178y1(@C12579k C26007d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f58987z = dVar;
    }
}
