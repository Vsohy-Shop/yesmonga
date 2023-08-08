package com.carrefour.fid.android.shared.navigation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.navigation.c */
public interface C28796c {

    /* renamed from: com.carrefour.fid.android.shared.navigation.c$a */
    public static final class C28797a {
        /* renamed from: a */
        public static /* synthetic */ void m119187a(C28796c cVar, NavController navController, boolean z, boolean z2, Address address, Address address2, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                boolean z3 = z;
                if ((i & 4) != 0) {
                    z2 = false;
                }
                boolean z4 = z2;
                if ((i & 32) != 0) {
                    str = null;
                }
                cVar.mo83849y(navController, z3, z4, address, address2, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToAccountUserBillingAddressScreen");
        }

        /* renamed from: b */
        public static /* synthetic */ void m119188b(C28796c cVar, NavController navController, boolean z, boolean z2, Address address, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                boolean z3 = z;
                if ((i & 4) != 0) {
                    z2 = false;
                }
                boolean z4 = z2;
                if ((i & 16) != 0) {
                    str = null;
                }
                cVar.mo83840p(navController, z3, z4, address, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToAccountUserDeliveryAddressScreen");
        }

        /* renamed from: c */
        public static /* synthetic */ void m119189c(C28796c cVar, NavController navController, boolean z, BasketSlotBookedMessageType basketSlotBookedMessageType, Slot slot, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                cVar.mo83830f(navController, z, basketSlotBookedMessageType, slot, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToCheckout");
        }

        /* renamed from: d */
        public static /* synthetic */ void m119190d(C28796c cVar, NavController navController, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                cVar.mo83829e(navController, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToDriveSelection");
        }

        /* renamed from: e */
        public static /* synthetic */ void m119191e(C28796c cVar, NavController navController, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                cVar.mo83843s(navController, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToHome");
        }

        /* renamed from: f */
        public static /* synthetic */ void m119192f(C28796c cVar, NavController navController, OfferIdentifier offerIdentifier, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                cVar.mo83838n(navController, offerIdentifier, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToProductDetails");
        }
    }

    /* renamed from: a */
    boolean mo83825a(@C12579k NavController navController);

    /* renamed from: b */
    void mo83826b(@C12579k Fragment fragment);

    /* renamed from: c */
    void mo83827c(@C12579k NavController navController, @C12579k StoreServiceType storeServiceType);

    /* renamed from: d */
    void mo83828d(@C12579k NavController navController);

    /* renamed from: e */
    void mo83829e(@C12579k NavController navController, boolean z);

    /* renamed from: f */
    void mo83830f(@C12579k NavController navController, boolean z, @C12579k BasketSlotBookedMessageType basketSlotBookedMessageType, @C12579k Slot slot, @C12580l Bundle bundle);

    /* renamed from: g */
    void mo83831g(@C12579k NavController navController, boolean z);

    /* renamed from: h */
    void mo83832h(@C12579k NavController navController, @C12579k Address address, @C12579k String str, boolean z, boolean z2);

    /* renamed from: i */
    void mo83833i(@C12579k NavController navController);

    /* renamed from: j */
    void mo83834j(@C12579k NavController navController);

    /* renamed from: k */
    void mo83835k(@C12579k NavController navController, @C12579k String str);

    /* renamed from: l */
    void mo83836l(@C12579k NavController navController);

    /* renamed from: m */
    void mo83837m(@C12579k Fragment fragment, @C12579k String str);

    /* renamed from: n */
    void mo83838n(@C12579k NavController navController, @C12579k OfferIdentifier offerIdentifier, boolean z);

    /* renamed from: o */
    void mo83839o(@C12579k NavController navController, @C12579k String str);

    /* renamed from: p */
    void mo83840p(@C12579k NavController navController, boolean z, boolean z2, @C12579k Address address, @C12580l String str);

    /* renamed from: q */
    void mo83841q(@C12579k Fragment fragment);

    /* renamed from: r */
    void mo83842r(@C12579k NavController navController, @C12579k String str);

    /* renamed from: s */
    void mo83843s(@C12579k NavController navController, boolean z);

    /* renamed from: t */
    void mo83844t(@C12579k Fragment fragment);

    /* renamed from: u */
    void mo83845u(@C12579k NavController navController, boolean z);

    /* renamed from: v */
    void mo83846v(@C12579k NavController navController, int i);

    /* renamed from: w */
    void mo83847w(@C12579k NavController navController, @C12579k String str);

    /* renamed from: x */
    void mo83848x(@C12579k NavController navController);

    /* renamed from: y */
    void mo83849y(@C12579k NavController navController, boolean z, boolean z2, @C12579k Address address, @C12579k Address address2, @C12580l String str);
}
