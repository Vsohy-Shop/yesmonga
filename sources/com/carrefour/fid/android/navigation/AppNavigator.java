package com.carrefour.fid.android.navigation;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19758j0;
import androidx.navigation.C19765l0;
import androidx.navigation.NavController;
import com.carrefour.fid.android.C14062p0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.account.presentation.p018ui.address.C13461f;
import com.carrefour.fid.android.account.presentation.p018ui.address.C13469k;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23369k;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23877e;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.C24691j;
import com.carrefour.fid.android.presentation.p035ui.product.search.C25576m;
import com.carrefour.fid.android.product.C27457d;
import com.carrefour.fid.android.product.C27607e;
import com.carrefour.fid.android.product.presentation.p039ui.details.C27808i;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27889k;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionFragmentArgs;
import com.carrefour.fid.android.service.presentation.p044ui.selection.ServiceSelectionBackDropFragment;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.navigation.C28796c;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class AppNavigator implements C28796c {

    /* renamed from: a */
    public static final int f97021a = 0;

    /* renamed from: a */
    public boolean mo83825a(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        return navController.mo58158t0(R.id.accountMenuFragment, false);
    }

    /* renamed from: b */
    public void mo83826b(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        new ServiceSelectionBackDropFragment().show(fragment.requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: c */
    public void mo83827c(@C12579k NavController navController, @C12579k StoreServiceType storeServiceType) {
        DeliveryType deliveryType;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(storeServiceType, "storeServiceType");
        if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Clcv.INSTANCE)) {
            deliveryType = DeliveryType.Clcv;
        } else if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.H1h3.INSTANCE)) {
            deliveryType = DeliveryType.H1h3;
        } else if (Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Drive.INSTANCE)) {
            throw new RuntimeException("Not a delivery service");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        navController.mo58130W(R.id.delivery_graph, new DeliveryServiceSelectionFragmentArgs(deliveryType).toBundle());
    }

    /* renamed from: d */
    public void mo83828d(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        try {
            Result.C10852a aVar = Result.f28060a;
            Result.m38702b(Boolean.valueOf(navController.mo58158t0(R.id.deliveryServiceSelectionFragment, false)));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: e */
    public void mo83829e(@C12579k NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (z) {
            try {
                Result.C10852a aVar = Result.f28060a;
                Result.m38702b(Boolean.valueOf(navController.mo58158t0(R.id.homePageFragment, false)));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                Result.m38702b(C11661u0.m45734a(th));
            }
        }
        navController.mo58128V(R.id.drive_graph);
    }

    /* renamed from: f */
    public void mo83830f(@C12579k NavController navController, boolean z, @C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12579k Slot slot, @C12580l Bundle bundle) {
        Object obj;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(basketSlotBookedMessageType, "basketSlotBookedMessageType");
        Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
        Bundle l = new C23369k(basketSlotBookedMessageType, (SlotExpress) null, slot, bundle, 2, (DefaultConstructorMarker) null).mo68466l();
        try {
            Result.C10852a aVar = Result.f28060a;
            if (z) {
                obj = Boolean.valueOf(navController.mo58158t0(R.id.serviceSlotFragment, false));
            } else {
                navController.mo58130W(R.id.checkout_graph, l);
                obj = C11079d2.f28267a;
            }
            Result.m38702b(obj);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: g */
    public void mo83831g(@C12579k NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        navController.mo58130W(R.id.coupons_graph, new C23877e(z).mo69928f());
    }

    /* renamed from: h */
    public void mo83832h(@C12579k NavController navController, @C12579k Address address, @C12579k String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(str, "telephone");
        navController.mo58130W(R.id.account_verify_address_graph, new C13469k(address, str, z, z2).mo31957l());
    }

    /* renamed from: i */
    public void mo83833i(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        navController.mo58132X(R.id.home_graph, (Bundle) null, C19765l0.m91906a(AppNavigator$navigateToHomeScreen$1.f97022f));
    }

    /* renamed from: j */
    public void mo83834j(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        navController.mo58158t0(R.id.ordersOnlineDetailsFragment, false);
    }

    /* renamed from: k */
    public void mo83835k(@C12579k NavController navController, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(str, "query");
        navController.mo58130W(R.id.product_list_query_graph, new C27457d(str, (String) null, 2, (DefaultConstructorMarker) null).mo79820h());
    }

    /* renamed from: l */
    public void mo83836l(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        try {
            Result.C10852a aVar = Result.f28060a;
            Result.m38702b(Boolean.valueOf(navController.mo58158t0(R.id.nonFoodCheckoutStep2Fragment, false)));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: m */
    public void mo83837m(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, C19758j0.f50575e);
        FragmentExtensionKt.m58767r(fragment, str);
    }

    /* renamed from: n */
    public void mo83838n(@C12579k NavController navController, @C12579k OfferIdentifier offerIdentifier, boolean z) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
        if (z) {
            navController.mo58130W(R.id.product_non_food_graph, new C27889k(offerIdentifier, 0, (String) null, 6, (DefaultConstructorMarker) null).mo81043j());
        } else {
            navController.mo58130W(R.id.product_graph, new C27808i(offerIdentifier, 0, (String) null, 6, (DefaultConstructorMarker) null).mo80767j());
        }
    }

    /* renamed from: o */
    public void mo83839o(@C12579k NavController navController, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(str, "orderId");
        try {
            Result.C10852a aVar = Result.f28060a;
            navController.mo58130W(R.id.ordersSuccessHandleFragment, new C24691j(str).mo72167f());
            Result.m38702b(C11079d2.f28267a);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: p */
    public void mo83840p(@C12579k NavController navController, boolean z, boolean z2, @C12579k Address address, @C12580l String str) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(address, "filledDeliveryAddress");
        navController.mo58130W(R.id.account_user_address_graph, new C13461f(AddressCategory.DELIVERY, address, (Address) null, str, z2, z, 4, (DefaultConstructorMarker) null).mo31925p());
    }

    /* renamed from: q */
    public void mo83841q(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C19232h requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
        C13825a.m58795x(requireActivity, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69230F, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: r */
    public void mo83842r(@C12579k NavController navController, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(str, "searchText");
        navController.mo58130W(R.id.product_list_search_graph, new C27607e(str).mo80218f());
    }

    /* renamed from: s */
    public void mo83843s(@C12579k NavController navController, boolean z) {
        Object obj;
        Intrinsics.checkNotNullParameter(navController, "navController");
        try {
            Result.C10852a aVar = Result.f28060a;
            if (z) {
                obj = Boolean.valueOf(navController.mo58158t0(R.id.homePageFragment, false));
            } else {
                navController.mo58128V(R.id.homePageFragment);
                obj = C11079d2.f28267a;
            }
            Result.m38702b(obj);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: t */
    public void mo83844t(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C19232h requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
        C13825a.m58774c(requireActivity);
    }

    /* renamed from: u */
    public void mo83845u(@C12579k NavController navController, boolean z) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        navController.mo58130W(R.id.product_search_graph, new C25576m((Bundle) null, z, 1, (DefaultConstructorMarker) null).mo74442h());
    }

    /* renamed from: v */
    public void mo83846v(@C12579k NavController navController, int i) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        navController.mo58130W(R.id.store_locator_graph, new C14062p0(i, false, 2, (DefaultConstructorMarker) null).mo34321h());
    }

    /* renamed from: w */
    public void mo83847w(@C12579k NavController navController, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(str, "orderId");
        try {
            Result.C10852a aVar = Result.f28060a;
            navController.mo58132X(R.id.ordersSuccessHandleFragment, new C24691j(str).mo72167f(), C19765l0.m91906a(AppNavigator$navigateToOrdersSuccessFromOrder$1$1.f97023f));
            Result.m38702b(C11079d2.f28267a);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            Result.m38702b(C11661u0.m45734a(th));
        }
    }

    /* renamed from: x */
    public void mo83848x(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        navController.mo58128V(R.id.consent_optins_graph);
    }

    /* renamed from: y */
    public void mo83849y(@C12579k NavController navController, boolean z, boolean z2, @C12579k Address address, @C12579k Address address2, @C12580l String str) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(address, "filledDeliveryAddress");
        Intrinsics.checkNotNullParameter(address2, "filledBillingAddress");
        navController.mo58130W(R.id.account_user_address_graph, new C13461f(AddressCategory.BILLING, address, address2, str, z2, z).mo31925p());
    }
}
