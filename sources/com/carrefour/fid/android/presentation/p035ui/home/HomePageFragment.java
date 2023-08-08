package com.carrefour.fid.android.presentation.p035ui.home;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.result.C0302g;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19259o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel;
import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import com.carrefour.fid.android.consent.presentation.p055ui.ConfigureConsentOptinsFragment;
import com.carrefour.fid.android.consent.presentation.p055ui.ConsentBackDropFragment;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.core.extension.ViewPagerKt;
import com.carrefour.fid.android.databinding.C36695f6;
import com.carrefour.fid.android.databinding.C36701g2;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.C37020p;
import com.carrefour.fid.android.design.components.compose.Service;
import com.carrefour.fid.android.design.components.extension.PullToRefreshLayoutKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.OrderStatusComponent;
import com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayout;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBooked;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.home.CriteoMiniBannerView;
import com.carrefour.fid.android.presentation.models.C38456d;
import com.carrefour.fid.android.presentation.models.C38492i;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.models.extension.C38481p;
import com.carrefour.fid.android.presentation.p035ui.home.C24142f;
import com.carrefour.fid.android.presentation.p035ui.home.C24158g;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.C24119a;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter.C24120a;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter.C24121b;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter.C24123c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.event.C26385a;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26484b;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26494e;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import com.carrefour.fid.android.shared.base.C28512v;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.constant.C28555j2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.AppBarLayoutKt;
import com.carrefour.fid.android.shared.extension.C28756g0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.C28863a;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.C28870e;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28944n;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J0\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002J \u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020\u0004H\u0002J\b\u0010/\u001a\u00020\u0004H\u0002J\u0018\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002J\u0019\u00106\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00109\u001a\u000208H\u0002J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\u0004H\u0002J\b\u0010=\u001a\u00020\u0004H\u0002J\u0010\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0002J\u0016\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\u0016\u0010G\u001a\u00020\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0AH\u0002J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH\u0002J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH\u0002J\u0018\u0010P\u001a\u00020\u00042\u0006\u0010O\u001a\u00020N2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010S\u001a\u00020\u00042\u0006\u0010R\u001a\u00020QH\u0002J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010U\u001a\u00020TH\u0002J\u0016\u0010Y\u001a\u00020\u00042\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0AH\u0002J\u0018\u0010]\u001a\u00020\u00042\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020WH\u0002J \u0010`\u001a\u00020\u00042\u0006\u0010[\u001a\u00020Z2\u0006\u0010_\u001a\u00020^2\u0006\u0010\\\u001a\u00020WH\u0002J\b\u0010a\u001a\u00020\u0004H\u0002J\u0010\u0010c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020bH\u0002J\u0010\u0010f\u001a\u00020\u00042\u0006\u0010e\u001a\u00020dH\u0002J\b\u0010g\u001a\u00020\u0004H\u0002J\b\u0010h\u001a\u00020\u0004H\u0002J\b\u0010i\u001a\u00020\u0004H\u0002J\b\u0010j\u001a\u00020\u0004H\u0002J\u0012\u0010m\u001a\u00020\u00042\b\b\u0002\u0010l\u001a\u00020kH\u0002J\b\u0010n\u001a\u00020\u0004H\u0002J\b\u0010o\u001a\u00020\u0004H\u0002J\b\u0010p\u001a\u00020\u0004H\u0002J\u0012\u0010s\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010qH\u0002J\u0012\u0010v\u001a\u00020\u00042\b\u0010u\u001a\u0004\u0018\u00010tH\u0002J\u001a\u0010z\u001a\u00020\u00042\u0006\u0010x\u001a\u00020w2\b\u0010y\u001a\u0004\u0018\u00010(H\u0016J\b\u0010{\u001a\u00020\u0004H\u0016J\b\u0010|\u001a\u00020\u0004H\u0016J\b\u0010}\u001a\u00020\u0004H\u0014J\u0019\u0010\u0001\u001a\u00020\u00042\u0006\u0010~\u001a\u00020 2\u0006\u0010\u001a\u00020(H\u0016R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R3\u0010¦\u0001\u001a\u00020d2\u0007\u0010\u0001\u001a\u00020d8B@BX\u0002¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R>\u0010«\u0001\u001a\u00030§\u00012\b\u0010\u0001\u001a\u00030§\u00018B@BX\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0006\b¨\u0001\u0010¡\u0001\u001a\u0006\b©\u0001\u0010£\u0001\"\u0006\bª\u0001\u0010¥\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020 0°\u00018\u0002X\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018BX\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006º\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/home/HomePageFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/g2;", "Landroidx/fragment/app/c0;", "Lkotlin/d2;", "b2", "U1", "B1", "F1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/g;", "loyaltyCardState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/f;", "loyaltyBalanceState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/c;", "couponsInfoState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/h;", "stickersInfoState", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/b;", "joBanner", "L1", "A1", "P1", "", "userIsConnected", "x1", "w1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c;", "state", "j2", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$b;", "event", "G1", "", "url", "g2", "gameUrl", "webViewTitle", "secureTokenValue", "f2", "u2", "Landroid/os/Bundle;", "bundle", "C1", "Y1", "Lkotlinx/coroutines/c2;", "k2", "X1", "s2", "Lcom/carrefour/fid/android/presentation/models/i;", "homeOrderModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailsHeaderModel;", "order", "p1", "isLoading", "y1", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "storeServiceType", "d2", "e2", "t2", "S1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c$c;", "basketState", "K1", "", "Lcom/carrefour/fid/android/cms/presentation/models/SlideFooterCellModel;", "listSlideModels", "z1", "Lcom/carrefour/fid/android/cms/presentation/models/SlideOfferCellModel;", "listSlideOfferModels", "Q1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c$g;", "orderState", "R1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c$h;", "servicesState", "T1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/state/d;", "gazStationsCampaignState", "H1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c$f;", "luckyCartProductsBannerState", "O1", "Lcom/carrefour/fid/android/presentation/viewmodels/home/mvi/a$c$e;", "luckyCartGameBannerState", "M1", "Lcom/carrefour/fid/android/presentation/models/d;", "banners", "D1", "Lcom/carrefour/fid/android/presentation/components/home/CriteoMiniBannerView;", "bannerView", "banner", "n1", "Landroid/graphics/Rect;", "scrollBounds", "o1", "p2", "Lcom/carrefour/fid/android/shared/extension/g0;", "m1", "", "ratio", "o2", "initListener", "W1", "c2", "V1", "", "customDuration", "v2", "Z1", "J1", "r2", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$InternalLinkModel;", "internalLinkType", "h2", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$ExternalLinkModel;", "externalLinkType", "i2", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "onResume", "onStop", "insetPolicy", "requestKey", "result", "p", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel;", "f", "Lkotlin/z;", "t1", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomePageViewModel;", "homePageViewModel", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "g", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "r1", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "l2", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "environment", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/ui/home/carousels/adapter/b;", "w", "s1", "()Lcom/carrefour/fid/android/presentation/ui/home/carousels/adapter/b;", "homeCmsSlidePagerAdapter", "x", "Ljava/lang/Float;", "lastToolbarStateUsed", "<set-?>", "y", "Landroidx/compose/runtime/z0;", "v1", "()F", "n2", "(F)V", "toolbarCollapseState", "Landroidx/compose/ui/unit/g;", "z", "u1", "m2", "statusBarHeight", "Lcom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment;", "X", "Lcom/carrefour/fid/android/consent/presentation/ui/ConsentBackDropFragment;", "consentBackDropFragment", "Landroidx/activity/result/g;", "Y", "Landroidx/activity/result/g;", "requestPermission", "Lcom/carrefour/fid/android/databinding/f6;", "q1", "()Lcom/carrefour/fid/android/databinding/f6;", "bindingHomeContent", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nHomePageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePageFragment.kt\ncom/carrefour/fid/android/presentation/ui/home/HomePageFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1284:1\n106#2,15:1285\n154#3:1300\n76#4:1301\n102#4,2:1302\n76#4:1304\n102#4,2:1305\n168#5,7:1307\n183#5,6:1314\n154#5,6:1320\n154#5,6:1326\n154#5,6:1332\n154#5,6:1338\n154#5,6:1355\n262#6,2:1344\n262#6,2:1346\n262#6,2:1348\n262#6,2:1351\n262#6,2:1353\n1#7:1350\n*S KotlinDebug\n*F\n+ 1 HomePageFragment.kt\ncom/carrefour/fid/android/presentation/ui/home/HomePageFragment\n*L\n157#1:1285,15\n172#1:1300\n171#1:1301\n171#1:1302,2\n172#1:1304\n172#1:1305,2\n194#1:1307,7\n196#1:1314,6\n199#1:1320,6\n242#1:1326,6\n260#1:1332,6\n328#1:1338,6\n1232#1:1355,6\n922#1:1344,2\n932#1:1346,2\n935#1:1348,2\n990#1:1351,2\n1008#1:1353,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment */
public final class HomePageFragment extends C24115a<C36701g2> implements C19221c0 {

    /* renamed from: Z */
    public static final int f60304Z = 8;
    @C12580l

    /* renamed from: X */
    public ConsentBackDropFragment f60305X;
    @C12579k

    /* renamed from: Y */
    public final C0302g<String> f60306Y = FragmentKt.m118833u(this, new HomePageFragment$requestPermission$1(this), new HomePageFragment$requestPermission$2(this));
    @C12579k

    /* renamed from: f */
    public final C11677z f60307f;
    @Inject

    /* renamed from: g */
    public AppEnvironment f60308g;
    @Inject

    /* renamed from: v */
    public C28796c f60309v;
    @C12579k

    /* renamed from: w */
    public final C11677z f60310w = C10864b0.m38748c(new HomePageFragment$homeCmsSlidePagerAdapter$2(this));
    @C12580l

    /* renamed from: x */
    public Float f60311x;
    @C12579k

    /* renamed from: y */
    public final C8700z0 f60312y = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: z */
    public final C8700z0 f60313z = C8539f2.m30981g(C16483g.m74451w(C16483g.m74435M((float) 30)), (C8410b2) null, 2, (Object) null);

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$a */
    public static final class C24056a implements C11908f<C26494e> {

        /* renamed from: a */
        public final /* synthetic */ HomePageFragment f60315a;

        public C24056a(HomePageFragment homePageFragment) {
            this.f60315a = homePageFragment;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C26494e eVar, @C12579k C11045c<? super C11079d2> cVar) {
            int i;
            ViewGroup.LayoutParams layoutParams = HomePageFragment.m106126U0(this.f60315a).f90877b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            int o = ViewKt.m119002o(this.f60315a.mo70421u1() - ((float) 48));
            if (eVar instanceof C26494e.C26495a) {
                if (((C26494e.C26495a) eVar).mo77052f()) {
                    i = ViewKt.m119002o(326.0f);
                } else {
                    i = ViewKt.m119002o(388.0f);
                }
            } else if (Intrinsics.areEqual((Object) eVar, (Object) C26494e.C26496b.f64765a)) {
                i = ViewKt.m119002o(388.0f);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams.height = i + o;
            HomePageFragment.m106126U0(this.f60315a).f90877b.setLayoutParams(layoutParams);
            return C11079d2.f28267a;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$b */
    public static final class C24057b implements C11908f<BasketSlotBooked> {

        /* renamed from: a */
        public final /* synthetic */ HomePageFragment f60316a;

        /* renamed from: b */
        public final /* synthetic */ C19456p0 f60317b;

        public C24057b(HomePageFragment homePageFragment, C19456p0 p0Var) {
            this.f60316a = homePageFragment;
            this.f60317b = p0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(BasketSlotBooked basketSlotBooked, @C12579k C11045c<? super C11079d2> cVar) {
            Date c;
            String str;
            if ((basketSlotBooked.mo119441g() instanceof BasketSlotBookedMessageType.Success) && (c = C38481p.m159660c(basketSlotBooked.mo119442h())) != null) {
                HomePageFragment homePageFragment = this.f60316a;
                C19456p0 p0Var = this.f60317b;
                if (homePageFragment.mo70419t1().mo76737H1().getValue().get(Service.Drive.f92319a) instanceof ActiveState.ActiveData) {
                    str = homePageFragment.getString(R.string.home_drive_store_slot_booked_title);
                } else {
                    str = homePageFragment.getString(R.string.home_delivery_store_slot_booked_title);
                }
                String str2 = str;
                Intrinsics.checkNotNullExpressionValue(str2, "if (homePageViewModel.se…                        }");
                String format = new SimpleDateFormat(C28932h.f70939z, Locale.FRANCE).format(c);
                HomePageViewModel W0 = homePageFragment.mo70419t1();
                Intrinsics.checkNotNullExpressionValue(format, "dateStart");
                W0.mo76781l2(new C37020p.C37021a(format, C38481p.m159662e(basketSlotBooked.mo119442h())));
                FragmentKt.m118811B(homePageFragment, NotificationComponent.Variant.SUCCESS, str2, homePageFragment.getString(R.string.home_store_slot_booked_message), (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2040, (Object) null);
                BasketSlotBooked basketSlotBooked2 = (BasketSlotBooked) p0Var.mo57654n("KEY_HOME_SLOT_BOOKED");
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$c */
    public static final class C24058c implements C11908f<C26385a> {

        /* renamed from: a */
        public final /* synthetic */ HomePageFragment f60318a;

        public C24058c(HomePageFragment homePageFragment) {
            this.f60318a = homePageFragment;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C26385a aVar, @C12579k C11045c<? super C11079d2> cVar) {
            C26385a aVar2 = aVar;
            if (Intrinsics.areEqual((Object) aVar2, (Object) C26385a.C26389d.f64533a)) {
                HomePageFragment homePageFragment = this.f60318a;
                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                String string = homePageFragment.getString(R.string.home_store_slot_expired_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.home_store_slot_expired_title)");
                FragmentKt.m118811B(homePageFragment, variant, string, this.f60318a.getString(R.string.home_store_slot_expired_message), (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2040, (Object) null);
            } else if (aVar2 instanceof C26385a.C26388c) {
                C26385a.C26388c cVar2 = (C26385a.C26388c) aVar2;
                FragmentKt.m118823k(this.f60318a, C24142f.C24153k.m106344u(C24142f.f60384a, true, cVar2.mo76858f(), cVar2.mo76856e(), (String) null, 8, (Object) null));
            } else if (aVar2 instanceof C26385a.C26387b) {
                C26385a.C26387b bVar = (C26385a.C26387b) aVar2;
                FragmentKt.m118823k(this.f60318a, C24142f.f60384a.mo70630t(true, (SlotArgsHome) null, bVar.mo76848e(), bVar.mo76850f()));
            } else if (Intrinsics.areEqual((Object) aVar2, (Object) C26385a.C26386a.f64525a)) {
                HomePageFragment homePageFragment2 = this.f60318a;
                NotificationComponent.Variant variant2 = NotificationComponent.Variant.INFO;
                String string2 = homePageFragment2.getString(R.string.lex_slot_snackbar_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.lex_slot_snackbar_title)");
                FragmentKt.m118811B(homePageFragment2, variant2, string2, this.f60318a.getString(R.string.lex_slot_snackbar_text), this.f60318a.getString(R.string.lex_slot_snackbar_ok_btn), (C11289a) null, true, true, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1936, (Object) null);
            }
            return C11079d2.f28267a;
        }
    }

    public HomePageFragment() {
        super(C240551.f60314a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new HomePageFragment$special$$inlined$viewModels$default$2(new HomePageFragment$special$$inlined$viewModels$default$1(this)));
        this.f60307f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(HomePageViewModel.class), new HomePageFragment$special$$inlined$viewModels$default$3(b), new HomePageFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new HomePageFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: E1 */
    public static final void m106119E1(C38456d dVar, C38456d dVar2, HomePageFragment homePageFragment, Rect rect, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(homePageFragment, "this$0");
        Intrinsics.checkNotNullParameter(rect, "$scrollBounds");
        Intrinsics.checkNotNullParameter(nestedScrollView, "<anonymous parameter 0>");
        if (dVar != null) {
            CriteoMiniBannerView criteoMiniBannerView = homePageFragment.mo70413q1().f90829h;
            Intrinsics.checkNotNullExpressionValue(criteoMiniBannerView, "bindingHomeContent.homeCriteoMiniBanner");
            homePageFragment.mo70409o1(criteoMiniBannerView, rect, dVar);
        }
        if (dVar2 != null) {
            CriteoMiniBannerView criteoMiniBannerView2 = homePageFragment.mo70413q1().f90830i;
            Intrinsics.checkNotNullExpressionValue(criteoMiniBannerView2, "bindingHomeContent.homeCriteoSecondMiniBanner");
            homePageFragment.mo70409o1(criteoMiniBannerView2, rect, dVar2);
        }
    }

    /* renamed from: I1 */
    public static final void m106120I1(C26501g gVar, HomePageFragment homePageFragment, View view) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(gVar, "$loyaltyCardState");
        Intrinsics.checkNotNullParameter(homePageFragment, "this$0");
        if (gVar instanceof C26501g.C26502a) {
            FragmentExtensionKt.m58770u(homePageFragment, false, R.anim.slide_in_up, R.anim.no_change, 126, (Bundle) null, 16, (Object) null);
        } else {
            C19232h activity = homePageFragment.getActivity();
            if (activity instanceof BottomNavActivity) {
                bottomNavActivity = (BottomNavActivity) activity;
            } else {
                bottomNavActivity = null;
            }
            if (bottomNavActivity != null) {
                bottomNavActivity.mo121096G2();
            }
        }
        homePageFragment.mo70419t1().sendIntent(C26406a.C26407a.C26432t.f64651a);
    }

    /* renamed from: N1 */
    public static final void m106121N1(HomePageFragment homePageFragment, C26406a.C26449c.C26463e eVar, View view) {
        Intrinsics.checkNotNullParameter(homePageFragment, "this$0");
        Intrinsics.checkNotNullParameter(eVar, "$luckyCartGameBannerState");
        C19736g.m91827a(homePageFragment).mo58142g0(C24142f.C24153k.m106337D(C24142f.f60384a, ((C26406a.C26449c.C26463e.C26464a) eVar).mo77000d(), homePageFragment.getString(R.string.luckycard_game_webview_title), (String) null, (String) null, false, false, 60, (Object) null));
    }

    /* renamed from: U0 */
    public static final /* synthetic */ C36701g2 m106126U0(HomePageFragment homePageFragment) {
        return (C36701g2) homePageFragment.getBinding();
    }

    /* renamed from: a2 */
    public static final C18436z4 m106133a2(HomePageFragment homePageFragment, View view, C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(homePageFragment, "this$0");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(z4Var, "windowInsets");
        C17616m0 f = z4Var.mo53136f(C18436z4.C18449m.m83510i());
        Intrinsics.checkNotNullExpressionValue(f, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        homePageFragment.mo70406m2(C16483g.m74435M((float) ViewKt.m119004q(f.f45996b)));
        homePageFragment.mo70419t1().mo76779k2(homePageFragment.mo70421u1());
        return C18436z4.f47103c;
    }

    /* renamed from: w2 */
    public static /* synthetic */ void m106146w2(HomePageFragment homePageFragment, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 150;
        }
        homePageFragment.mo70424v2(j);
    }

    /* renamed from: A1 */
    public final void mo70368A1() {
        ((C36701g2) getBinding()).f90879d.f90827f.setContent(C8553b.m31049c(716858105, true, new HomePageFragment$handleCatalogs$1(this)));
    }

    /* renamed from: B1 */
    public final void mo70369B1() {
        ((C36701g2) getBinding()).f90879d.f90837p.setContent(C8553b.m31049c(-1751490985, true, new HomePageFragment$handleCmsMiniHubBlocs$1(this)));
    }

    /* renamed from: C1 */
    public final void mo70370C1(Bundle bundle) {
        ConsentBackDropFragment consentBackDropFragment = this.f60305X;
        if (consentBackDropFragment != null) {
            consentBackDropFragment.dismiss();
        }
        if (bundle.containsKey(ConsentBackDropFragment.CONSENT_REDIRECT_TO_CONFIGURE_CONSENT_PAGE)) {
            requireActivity().mo57175g0().mo56861b(ConfigureConsentOptinsFragment.CONFIGURE_CONSENT_REQUEST_KEY, this, this);
            getNavigator().mo83848x(C19736g.m91827a(this));
        }
    }

    /* renamed from: D1 */
    public final void mo70371D1(List<C38456d> list) {
        C38456d dVar = (C38456d) CollectionsKt___CollectionsKt.m40479B2(list);
        C38456d dVar2 = (C38456d) CollectionsKt___CollectionsKt.m40559R2(list, 1);
        if (dVar != null) {
            CriteoMiniBannerView criteoMiniBannerView = mo70413q1().f90829h;
            Intrinsics.checkNotNullExpressionValue(criteoMiniBannerView, "bindingHomeContent.homeCriteoMiniBanner");
            mo70407n1(criteoMiniBannerView, dVar);
        }
        if (dVar2 != null) {
            CriteoMiniBannerView criteoMiniBannerView2 = mo70413q1().f90830i;
            Intrinsics.checkNotNullExpressionValue(criteoMiniBannerView2, "bindingHomeContent.homeCriteoSecondMiniBanner");
            mo70407n1(criteoMiniBannerView2, dVar2);
        }
        NestedScrollView nestedScrollView = mo70413q1().f90839r;
        Rect rect = new Rect();
        nestedScrollView.getHitRect(rect);
        nestedScrollView.setOnScrollChangeListener(new C24118c(dVar, dVar2, this, rect));
    }

    /* renamed from: F1 */
    public final void mo70372F1() {
        ((C36701g2) getBinding()).f90879d.f90828g.setContent(C8553b.m31049c(1537190678, true, new HomePageFragment$handleDepartments$1(this)));
    }

    /* renamed from: G1 */
    public final void mo70373G1(C26406a.C26439b bVar) {
        C26406a.C26439b bVar2 = bVar;
        if (bVar2 instanceof C26406a.C26439b.C26441b) {
            FragmentKt.m118823k(this, C24142f.f60384a.mo70622h(((C26406a.C26439b.C26441b) bVar2).mo76930d()));
        } else if (Intrinsics.areEqual((Object) bVar2, (Object) C26406a.C26439b.C26440a.f64666a)) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            if (!C28944n.m119738a(requireContext)) {
                FragmentKt.m118823k(this, C24142f.f60384a.mo70614B());
            }
        } else if (Intrinsics.areEqual((Object) bVar2, (Object) C26406a.C26439b.C26448i.f64684a)) {
            m106146w2(this, 0, 1, (Object) null);
        } else if (Intrinsics.areEqual((Object) bVar2, (Object) C26406a.C26439b.C26446g.f64680a)) {
            mo70420t2();
        } else if (Intrinsics.areEqual((Object) bVar2, (Object) C26406a.C26439b.C26447h.f64682a)) {
            mo70422u2();
        } else if (bVar2 instanceof C26406a.C26439b.C26442c) {
            C26406a.C26439b.C26442c cVar = (C26406a.C26439b.C26442c) bVar2;
            mo70395f2(cVar.mo76939f(), cVar.mo76941h(), cVar.mo76940g());
        } else if (Intrinsics.areEqual((Object) bVar2, (Object) C26406a.C26439b.C26445f.f64678a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_an_error_occurred);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_an_error_occurred)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, true, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2012, (Object) null);
        } else if (Intrinsics.areEqual((Object) bVar2, (Object) C26406a.C26439b.C26443d.f64674a)) {
            FragmentKt.m118823k(this, C24142f.C24153k.m106339f(C24142f.f60384a, false, 1, (Object) null));
        } else if (bVar2 instanceof C26406a.C26439b.C26444e) {
            mo70396g2(((C26406a.C26439b.C26444e) bVar2).mo76946d());
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.fragment.app.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70374H1(com.carrefour.fid.android.presentation.viewmodels.home.state.C26491d r4, com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.carrefour.fid.android.presentation.viewmodels.home.state.C26491d.C26492a
            r1 = 0
            java.lang.String r2 = "bindingHomeContent.servi…s.layoutGazStationContent"
            if (r0 == 0) goto L_0x003d
            com.carrefour.fid.android.databinding.f6 r0 = r3.mo70413q1()
            com.carrefour.fid.android.databinding.e6 r0 = r0.f90843v
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f90770d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r2 = 0
            r0.setVisibility(r2)
            androidx.fragment.app.h r0 = r3.getActivity()
            boolean r2 = r0 instanceof com.carrefour.fid.android.navigation.BottomNavActivity
            if (r2 == 0) goto L_0x0021
            r1 = r0
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = (com.carrefour.fid.android.navigation.BottomNavActivity) r1
        L_0x0021:
            if (r1 == 0) goto L_0x002c
            com.carrefour.fid.android.presentation.viewmodels.home.state.d$a r4 = (com.carrefour.fid.android.presentation.viewmodels.home.state.C26491d.C26492a) r4
            com.carrefour.fid.android.presentation.models.CurrentCampaignsModel r4 = r4.mo77043d()
            r1.mo121144w2(r4)
        L_0x002c:
            com.carrefour.fid.android.databinding.f6 r4 = r3.mo70413q1()
            com.carrefour.fid.android.databinding.e6 r4 = r4.f90843v
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f90770d
            com.carrefour.fid.android.presentation.ui.home.e r0 = new com.carrefour.fid.android.presentation.ui.home.e
            r0.<init>(r5, r3)
            r4.setOnClickListener(r0)
            goto L_0x0058
        L_0x003d:
            com.carrefour.fid.android.databinding.f6 r4 = r3.mo70413q1()
            com.carrefour.fid.android.databinding.e6 r4 = r4.f90843v
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f90770d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            r5 = 8
            r4.setVisibility(r5)
            com.carrefour.fid.android.databinding.f6 r4 = r3.mo70413q1()
            com.carrefour.fid.android.databinding.e6 r4 = r4.f90843v
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f90770d
            r4.setOnClickListener(r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.HomePageFragment.mo70374H1(com.carrefour.fid.android.presentation.viewmodels.home.state.d, com.carrefour.fid.android.presentation.viewmodels.home.state.g):void");
    }

    /* renamed from: J1 */
    public final void mo70375J1() {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24059x35c047ea(this, state, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: K1 */
    public final void mo70376K1(C26406a.C26449c.C26456c cVar) {
        if (cVar instanceof C26406a.C26449c.C26456c.C26459c) {
            mo70427y1(Boolean.TRUE);
        } else if (cVar instanceof C26406a.C26449c.C26456c.C26457a) {
            mo70427y1(Boolean.FALSE);
        } else if (cVar instanceof C26406a.C26449c.C26456c.C26458b) {
            mo70427y1(Boolean.FALSE);
        }
    }

    /* renamed from: L1 */
    public final void mo70377L1(C26501g gVar, C26497f fVar, C26487c cVar, C26505h hVar, C26484b bVar) {
        ((C36701g2) getBinding()).f90879d.f90836o.setContent(C8553b.m31049c(-221474866, true, new HomePageFragment$handleLoyalty$1(gVar, fVar, cVar, hVar, bVar, this)));
    }

    /* renamed from: M1 */
    public final void mo70378M1(C26406a.C26449c.C26463e eVar) {
        if (eVar instanceof C26406a.C26449c.C26463e.C26464a) {
            mo70413q1().f90834m.setVisibility(0);
            mo70413q1().f90834m.setImageDrawable(FragmentKt.m118820h(this, R.drawable.lucky_cart_game_banner, (Integer) null, 2, (Object) null));
            mo70413q1().f90834m.setOnClickListener(new C24131d(this, eVar));
        } else if (eVar instanceof C26406a.C26449c.C26463e.C26465b) {
            mo70413q1().f90834m.setVisibility(8);
        }
    }

    /* renamed from: O1 */
    public final void mo70379O1(C26406a.C26449c.C26466f fVar) {
        if (fVar instanceof C26406a.C26449c.C26466f.C26467a) {
            LuckyCartBannerModel d = ((C26406a.C26449c.C26466f.C26467a) fVar).mo77006d();
            mo70413q1().f90831j.mo121233w(d, new HomePageFragment$handleLuckyCartProductsBanner$1(this, d));
        }
    }

    /* renamed from: P1 */
    public final void mo70380P1() {
        ((C36701g2) getBinding()).f90879d.f90838q.setContent(C8553b.m31049c(1529354371, true, new HomePageFragment$handleMyProducts$1(this)));
    }

    /* renamed from: Q1 */
    public final void mo70381Q1(List<SlideOfferCellModel> list) {
        if (list.isEmpty()) {
            LinearLayout linearLayout = mo70413q1().f90835n.f90898b;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "bindingHomeContent.inclu…omePromoContent.homePromo");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = mo70413q1().f90835n.f90898b;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "bindingHomeContent.inclu…omePromoContent.homePromo");
        linearLayout2.setVisibility(0);
        RecyclerView recyclerView = mo70413q1().f90835n.f90899c;
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.mo59649t1(0);
        }
        recyclerView.mo59589n(new C24123c((int) recyclerView.getResources().getDimension(R.dimen.ds_sizing_s)));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(new C24120a(list, new HomePageFragment$handleOffersList$1$1(this, list)));
    }

    /* renamed from: R1 */
    public final void mo70382R1(C26406a.C26449c.C26469g gVar) {
        C11079d2 d2Var;
        if (!(gVar instanceof C26406a.C26449c.C26469g.C26471b)) {
            ((C36701g2) getBinding()).f90879d.f90840s.setVisibility(8);
        } else if (isAdded()) {
            C38492i d = ((C26406a.C26449c.C26469g.C26471b) gVar).mo77012d();
            OrdersOnlineDetailsHeaderModel o = d.mo122080o();
            if (o != null) {
                mo70411p1(d, o);
                d2Var = C11079d2.f28267a;
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                ((C36701g2) getBinding()).f90879d.f90840s.setVisibility(8);
            }
        }
    }

    /* renamed from: S1 */
    public final void mo70383S1() {
        ViewGroup.LayoutParams layoutParams = mo70413q1().f90832k.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C16977c f = ((CoordinatorLayout.C16981g) layoutParams).mo51111f();
        Intrinsics.checkNotNull(f, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior");
        ((AppBarLayout.ScrollingViewBehavior) f).mo88141W(ViewKt.m119002o(150.0f));
    }

    /* renamed from: T1 */
    public final void mo70384T1(C26406a.C26449c.C26472h hVar) {
        if (Intrinsics.areEqual((Object) hVar, (Object) C26406a.C26449c.C26472h.C26475c.f64737a)) {
            mo70383S1();
        }
    }

    /* renamed from: U1 */
    public final void mo70385U1() {
        ((C36701g2) getBinding()).f90879d.f90844w.setContent(C8553b.m31049c(-1654663561, true, new HomePageFragment$handleSetServices$1(this)));
    }

    /* renamed from: V1 */
    public final void mo70386V1() {
        ViewPager2 viewPager2 = mo70413q1().f90833l;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "initCmsViewPager$lambda$22");
        C11907e<Integer> f1 = C11909g.m47448f1(C11909g.m47391O0(ViewPagerKt.m148933e(viewPager2), C11768d1.m46781c()), new HomePageFragment$initCmsViewPager$1$1(viewPager2, (C11045c<? super HomePageFragment$initCmsViewPager$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11909g.m47412V0(f1, C19501x.m90847a(viewLifecycleOwner));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        ViewPagerKt.m148931c(viewPager2, C19501x.m90847a(viewLifecycleOwner2), 5000);
        viewPager2.setSaveEnabled(false);
    }

    /* renamed from: W1 */
    public final void mo70387W1() {
        PullToRefreshLayout pullToRefreshLayout = mo70413q1().f90832k;
        Intrinsics.checkNotNullExpressionValue(pullToRefreshLayout, "bindingHomeContent.homeSwipeRefresh");
        C11909g.m47412V0(C11909g.m47448f1(PullToRefreshLayoutKt.m152112c(pullToRefreshLayout), new HomePageFragment$initPullToRefreshListener$1(this, (C11045c<? super HomePageFragment$initPullToRefreshListener$1>) null)), C19501x.m90847a(this));
    }

    /* renamed from: X1 */
    public final void mo70388X1() {
        mo70419t1().sendIntent(C26406a.C26407a.C26410b.f64605a);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C13825a.m58791t(requireActivity, false, (Bundle) null, 3, (Object) null);
        FragmentExtensionKt.m58770u(this, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69230F, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: Y1 */
    public final void mo70389Y1() {
        requireActivity().mo57175g0().mo56861b(AdditionalOrderBottomSheetFragment.f61711x, this, this);
    }

    /* renamed from: Z1 */
    public final void mo70390Z1() {
        C18196h2.m82559a2(((C36701g2) getBinding()).f90877b, new C24117b(this));
    }

    /* renamed from: b2 */
    public final void mo70391b2() {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24061xd44c7254(this, state, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: c2 */
    public final void mo70392c2() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (C28944n.m119738a(requireContext)) {
            mo70419t1().sendIntent(C26406a.C26407a.C26408a.f64601a);
        }
    }

    /* renamed from: d2 */
    public final void mo70393d2(boolean z, StoreServiceType storeServiceType) {
        if (z) {
            getNavigator().mo83827c(C19736g.m91827a(this), storeServiceType);
        } else {
            FragmentExtensionKt.m58770u(this, false, R.anim.slide_in_up, R.anim.no_change, -1, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: e2 */
    public final void mo70394e2(boolean z) {
        if (z) {
            C19736g.m91827a(this).mo58128V(R.id.drive_graph);
        } else {
            FragmentExtensionKt.m58770u(this, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69235K, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: f2 */
    public final void mo70395f2(String str, String str2, String str3) {
        C19736g.m91827a(this).mo58130W(R.id.webview_graph, new C28870e(str, str2, C28555j2.f69460a, str3, true).mo84044n());
    }

    /* renamed from: g2 */
    public final void mo70396g2(String str) {
        C19736g.m91827a(this).mo58130W(R.id.catalog_webview_graph, new C28863a(str, (String) null, (String) null, 6, (DefaultConstructorMarker) null).mo84018j());
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f60309v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h2 */
    public final void mo70398h2(LinkModel.InternalLinkModel internalLinkModel) {
        String g;
        String f;
        if (!(internalLinkModel == null || (f = internalLinkModel.mo132473f()) == null)) {
            mo70419t1().sendIntent(new C26406a.C26407a.C26424l(f));
        }
        if (internalLinkModel != null && (g = internalLinkModel.mo132474g()) != null) {
            FragmentExtensionKt.m58767r(this, g);
        }
    }

    /* renamed from: i2 */
    public final void mo70399i2(LinkModel.ExternalLinkModel externalLinkModel) {
        String h;
        String f;
        if (!(externalLinkModel == null || (f = externalLinkModel.mo132457f()) == null)) {
            mo70419t1().sendIntent(new C26406a.C26407a.C26424l(f));
        }
        if (externalLinkModel != null && (h = externalLinkModel.mo132459h()) != null) {
            FragmentKt.m118829q(this, (String) null, (String) null, new HomePageFragment$openLinkInBrowser$2$1(this, h), 3, (Object) null);
        }
    }

    public final void initListener() {
        LinearLayoutCompat b = mo70413q1().f90823b.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "bindingHomeContent.accessibilityInformation.root");
        C11909g.m47412V0(C11909g.m47448f1(ViewKt.m118997j(b), new HomePageFragment$initListener$1(this, (C11045c<? super HomePageFragment$initListener$1>) null)), C19501x.m90847a(this));
    }

    public void insetPolicy() {
        C19232h activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "it.window");
            C28512v.m118431c(window);
            Window window2 = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "it.window");
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
            C28512v.m118433e(window2, applicationContext);
        }
    }

    /* renamed from: j2 */
    public final void mo70402j2(C26406a.C26449c cVar) {
        mo70376K1(cVar.mo76983x());
        mo70428z1(cVar.mo76984y());
        mo70381Q1(cVar.mo76985z());
        mo70384T1(cVar.mo76959J());
        mo70382R1(cVar.mo76958I());
        mo70379O1(cVar.mo76957H());
        mo70378M1(cVar.mo76956G());
        mo70371D1(cVar.mo76951B());
        mo70426x1(cVar.mo76961L() instanceof C26406a.C26449c.C26476i.C26477a);
        mo70425w1();
    }

    /* renamed from: k2 */
    public final C11723c2 mo70403k2() {
        return C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new HomePageFragment$scrollToTop$1(this, (C11045c<? super HomePageFragment$scrollToTop$1>) null), 3, (Object) null);
    }

    /* renamed from: l2 */
    public final void mo70404l2(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f60308g = appEnvironment;
    }

    /* renamed from: m1 */
    public final void mo70405m1(C28756g0 g0Var) {
        PullToRefreshLayout pullToRefreshLayout = mo70413q1().f90832k;
        pullToRefreshLayout.setCollapsedAppBar(!g0Var.mo83753l());
        pullToRefreshLayout.mo114043w(((float) 1) - g0Var.mo83750i());
        if (!Intrinsics.areEqual(this.f60311x, g0Var.mo83750i())) {
            this.f60311x = Float.valueOf(g0Var.mo83750i());
            mo70410o2(g0Var.mo83750i());
        }
        mo70408n2(g0Var.mo83750i());
        if (g0Var.mo83753l()) {
            m106146w2(this, 0, 1, (Object) null);
        }
    }

    /* renamed from: m2 */
    public final void mo70406m2(float f) {
        this.f60313z.setValue(C16483g.m74451w(f));
    }

    /* renamed from: n1 */
    public final void mo70407n1(CriteoMiniBannerView criteoMiniBannerView, C38456d dVar) {
        criteoMiniBannerView.mo121230c(dVar, new HomePageFragment$bindBanner$1(this));
    }

    /* renamed from: n2 */
    public final void mo70408n2(float f) {
        this.f60312y.setValue(Float.valueOf(f));
    }

    /* renamed from: o1 */
    public final void mo70409o1(CriteoMiniBannerView criteoMiniBannerView, Rect rect, C38456d dVar) {
        if (criteoMiniBannerView.mo121231e(rect) && !dVar.mo122033r()) {
            dVar.mo122034s(true);
            String p = dVar.mo122031p();
            if (p != null) {
                mo70419t1().sendIntent(new C26406a.C26407a.C26430r(p));
            }
        }
    }

    /* renamed from: o2 */
    public final void mo70410o2(float f) {
        ViewGroup.LayoutParams layoutParams = ((C36701g2) getBinding()).f90880e.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = ViewKt.m119002o((C11479u.m44444t(mo70421u1() - ((float) 32), 0.0f) + 166.0f) - (f * 40.0f));
        ((C36701g2) getBinding()).f90880e.setLayoutParams(layoutParams);
    }

    public void onResume() {
        super.onResume();
        m106146w2(this, 0, 1, (Object) null);
        FragmentExtensionKt.m58757h(this);
        mo70403k2();
        mo70389Y1();
        mo70410o2(0.0f);
        mo70419t1().sendIntent(C26406a.C26407a.C26417e0.f64619a);
    }

    public void onStop() {
        mo70413q1().f90833l.setAdapter((RecyclerView.Adapter) null);
        super.onStop();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        HomePageViewModel t1 = mo70419t1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new HomePageFragment$onViewCreated$$inlined$processState$1(this, t1, (C11045c) null, this), 3, (Object) null);
        HomePageViewModel t12 = mo70419t1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new HomePageFragment$onViewCreated$$inlined$processEvent$1(this, t12, (C11045c) null, this), 3, (Object) null);
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        C11723c2 unused3 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new C24063x1bfd8f04(this, state, (C11045c) null, this), 3, (Object) null);
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        C11723c2 unused4 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner4), (CoroutineContext) null, (CoroutineStart) null, new C24065x1bfd8f05(this, state, (C11045c) null, this), 3, (Object) null);
        C19499w viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        C11723c2 unused5 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner5), (CoroutineContext) null, (CoroutineStart) null, new C24067x1bfd8f06(this, state, (C11045c) null, this), 3, (Object) null);
        mo70385U1();
        mo70369B1();
        mo70372F1();
        mo70368A1();
        mo70380P1();
        mo70391b2();
        mo70390Z1();
        mo70375J1();
        mo70412p2();
        initListener();
        mo70387W1();
        mo70392c2();
        mo70386V1();
        mo70419t1().sendIntent(C26406a.C26407a.C26415d0.f64615a);
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner6, new C24158g.C24159a(new HomePageFragment$onViewCreated$6(this)));
        NestedScrollView nestedScrollView = mo70413q1().f90839r;
        nestedScrollView.setFocusableInTouchMode(true);
        nestedScrollView.setDescendantFocusability(131072);
        C22757a.m102929c(false);
        Toolbar toolbar = ((C36701g2) getBinding()).f90880e;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbarHome");
        C22757a.m102928b(toolbar);
        mo70415r2();
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
                mo70419t1().sendIntent(C26406a.C26407a.C26428p.f64643a);
                return;
            }
            FragmentKt.m118823k(this, C24142f.C24153k.m106345w(C24142f.f60384a, 0, 1, (Object) null));
        } else if (bundle2.getBoolean(ConfigureConsentOptinsFragment.CONFIGURE_CONSENT_SHOW_BACKDROP_RESULT_KEY, false)) {
            requireActivity().mo57175g0().mo56865c(ConfigureConsentOptinsFragment.CONFIGURE_CONSENT_REQUEST_KEY);
            mo70422u2();
        }
    }

    /* renamed from: p1 */
    public final void mo70411p1(C38492i iVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        OrderStatusComponent.AdditionOrderStatus additionOrderStatus;
        boolean z = false;
        ((C36701g2) getBinding()).f90879d.f90840s.setVisibility(0);
        ((C36701g2) getBinding()).f90879d.f90841t.setVisibility(8);
        String Z = ordersOnlineDetailsHeaderModel.mo73366Z();
        String m = iVar.mo122078m();
        if (Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.Clcv.f70280e) || Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.H1h3.f70286e) || Intrinsics.areEqual((Object) ordersOnlineDetailsHeaderModel.mo73378f(), (Object) OrderType.Lad.f70288e)) {
            z = true;
        }
        boolean z2 = z;
        OrderStatusComponent.OngoingOrderStatus i = C36306e.m148957i(ordersOnlineDetailsHeaderModel.mo73380g());
        boolean z3 = ordersOnlineDetailsHeaderModel.mo73380g() instanceof OrderStatus.Cancelled;
        if (ordersOnlineDetailsHeaderModel.mo73367a() != null) {
            additionOrderStatus = OrderStatusComponent.AdditionOrderStatus.COMPLETE;
        } else if (ordersOnlineDetailsHeaderModel.mo73369b()) {
            additionOrderStatus = OrderStatusComponent.AdditionOrderStatus.IS_ELIGIBLE;
        } else {
            additionOrderStatus = OrderStatusComponent.AdditionOrderStatus.NONE;
        }
        ((C36701g2) getBinding()).f90879d.f90840s.mo112975e(new OrderStatusComponent.C37158a(Z, m, z2, i, additionOrderStatus, z3));
        ((C36701g2) getBinding()).f90879d.f90840s.setOnItineraryClickListener(new HomePageFragment$displayOrderStatus$1(iVar, this));
        ((C36701g2) getBinding()).f90879d.f90840s.setOnItemClickListener(new HomePageFragment$displayOrderStatus$2(this));
        ((C36701g2) getBinding()).f90879d.f90840s.setOnWithdrawalClickListener(new HomePageFragment$displayOrderStatus$3(this, ordersOnlineDetailsHeaderModel));
        ((C36701g2) getBinding()).f90879d.f90840s.setOnAdditionalOrderClickListener(new HomePageFragment$displayOrderStatus$4(this, iVar));
    }

    /* renamed from: p2 */
    public final void mo70412p2() {
        AppBarLayout appBarLayout = ((C36701g2) getBinding()).f90877b;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "binding.appBarView");
        C11907e f1 = C11909g.m47448f1(C11909g.m47391O0(AppBarLayoutKt.m118736f(appBarLayout, (C11300l) null, 1, (Object) null), C11768d1.m46781c()), new HomePageFragment$setupToolbar$1(this));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11909g.m47412V0(f1, C19501x.m90847a(viewLifecycleOwner));
        ((C36701g2) getBinding()).f90881f.setContent(C8553b.m31049c(1324038013, true, new HomePageFragment$setupToolbar$2(this)));
    }

    /* renamed from: q1 */
    public final C36695f6 mo70413q1() {
        C36695f6 f6Var = ((C36701g2) getBinding()).f90879d;
        Intrinsics.checkNotNullExpressionValue(f6Var, "binding.layoutHomeContent");
        return f6Var;
    }

    @C12579k
    /* renamed from: r1 */
    public final AppEnvironment mo70414r1() {
        AppEnvironment appEnvironment = this.f60308g;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C28534f.f69167m0);
        return null;
    }

    /* renamed from: r2 */
    public final void mo70415r2() {
        ((C36701g2) getBinding()).f90879d.f90842u.setContent(C8553b.m31049c(264746712, true, new HomePageFragment$showPaymentInfo$1(this)));
    }

    /* renamed from: s1 */
    public final C24121b mo70416s1() {
        return (C24121b) this.f60310w.getValue();
    }

    /* renamed from: s2 */
    public final void mo70417s2() {
        String string = getString(R.string.scan_bar_dialog_title);
        String string2 = getString(R.string.scan_bar_dialog_message);
        Drawable h = FragmentKt.m118820h(this, R.drawable.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(R.string.general_refuse);
        String string4 = getString(R.string.ok_uppercase);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, HomePageFragment$showPermissionExplanationDialog$1.f60327f, string4, false, new HomePageFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f60309v = cVar;
    }

    /* renamed from: t1 */
    public final HomePageViewModel mo70419t1() {
        return (HomePageViewModel) this.f60307f.getValue();
    }

    /* renamed from: t2 */
    public final void mo70420t2() {
        NotificationComponent.Variant variant = NotificationComponent.Variant.INFO;
        String string = getString(R.string.notification_store_has_changed_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.notif…_store_has_changed_title)");
        FragmentKt.m118811B(this, variant, string, getString(R.string.notification_store_has_changed_text), getString(R.string.notification_store_has_changed_action), (C11289a) null, true, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2000, (Object) null);
    }

    /* renamed from: u1 */
    public final float mo70421u1() {
        return ((C16483g) this.f60313z.getValue()).mo47823t0();
    }

    /* renamed from: u2 */
    public final void mo70422u2() {
        boolean z;
        ConsentBackDropFragment consentBackDropFragment = this.f60305X;
        if (consentBackDropFragment != null) {
            if (consentBackDropFragment == null || consentBackDropFragment.isVisible()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        ConsentBackDropFragment newInstance$default = ConsentBackDropFragment.Companion.newInstance$default(ConsentBackDropFragment.Companion, 0, 0, 3, (Object) null);
        this.f60305X = newInstance$default;
        Intrinsics.checkNotNull(newInstance$default);
        newInstance$default.show(requireActivity().mo57175g0(), (String) null);
        ConsentBackDropFragment consentBackDropFragment2 = this.f60305X;
        Intrinsics.checkNotNull(consentBackDropFragment2);
        C19259o.m90350e(consentBackDropFragment2, ConsentBackDropFragment.CONSENT_REQUEST_KEY, new HomePageFragment$showUserConsent$1(this));
    }

    /* renamed from: v1 */
    public final float mo70423v1() {
        return ((Number) this.f60312y.getValue()).floatValue();
    }

    /* renamed from: v2 */
    public final void mo70424v2(long j) {
        mo70413q1().f90832k.mo114018r(j);
    }

    /* renamed from: w1 */
    public final void mo70425w1() {
        ((C36701g2) getBinding()).f90879d.f90825d.setContent(C8553b.m31049c(1706475946, true, new HomePageFragment$handleArsenalBottomBanner$1(this)));
    }

    /* renamed from: x1 */
    public final void mo70426x1(boolean z) {
        ((C36701g2) getBinding()).f90879d.f90826e.setContent(C8553b.m31049c(1710687386, true, new HomePageFragment$handleArsenalTopBanner$1(this, z)));
    }

    /* renamed from: y1 */
    public final void mo70427y1(Boolean bool) {
        mo70424v2(0);
        C36695f6 f6Var = ((C36701g2) getBinding()).f90879d;
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            f6Var.f90840s.setVisibility(8);
            f6Var.f90841t.setVisibility(0);
            return;
        }
        f6Var.f90841t.setVisibility(8);
    }

    /* renamed from: z1 */
    public final void mo70428z1(List<SlideFooterCellModel> list) {
        int i = 8;
        if (list.isEmpty()) {
            mo70413q1().f90845x.setVisibility(8);
            return;
        }
        mo70413q1().f90845x.setVisibility(0);
        mo70416s1().mo70501F(list);
        ViewPager2 viewPager2 = mo70413q1().f90833l;
        if (viewPager2.getAdapter() == null) {
            viewPager2.setAdapter(mo70416s1());
        } else {
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        viewPager2.setPageTransformer(new C24119a());
        TabLayout tabLayout = mo70413q1().f90846y;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "bindingHomeContent.tabFragmentHomeLoyalty");
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        if (z) {
            i = 0;
        }
        tabLayout.setVisibility(i);
        TabLayout tabLayout2 = mo70413q1().f90846y;
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "bindingHomeContent.tabFragmentHomeLoyalty");
        ViewPagerKt.m148935g(tabLayout2, mo70413q1().f90833l, list.size());
    }
}
