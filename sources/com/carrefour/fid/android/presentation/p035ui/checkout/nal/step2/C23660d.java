package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d */
public final class C23660d {
    @C12579k

    /* renamed from: a */
    public static final C23666f f59701a = new C23666f((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59702b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d$a */
    public static final class C23661a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59703a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f59704b;

        /* renamed from: c */
        public final int f59705c = R.id.action_nonFoodCheckoutStep2Fragment_to_blockedCardFromNonFoodStep2;

        public C23661a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f59703a = str;
            this.f59704b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C23661a m105080d(C23661a aVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f59703a;
            }
            if ((i & 2) != 0) {
                otpOrigination = aVar.f59704b;
            }
            return aVar.mo69360c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo69358a() {
            return this.f59703a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo69359b() {
            return this.f59704b;
        }

        @C12579k
        /* renamed from: c */
        public final C23661a mo69360c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23661a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo69361e() {
            return this.f59703a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23661a)) {
                return false;
            }
            C23661a aVar = (C23661a) obj;
            return Intrinsics.areEqual((Object) this.f59703a, (Object) aVar.f59703a) && Intrinsics.areEqual((Object) this.f59704b, (Object) aVar.f59704b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo69363f() {
            return this.f59704b;
        }

        public int getActionId() {
            return this.f59705c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f59703a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f59704b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f59704b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f59703a.hashCode() * 31) + this.f59704b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f59703a;
            OtpOrigination otpOrigination = this.f59704b;
            return "ActionNonFoodCheckoutStep2FragmentToBlockedCardFromNonFoodStep2(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d$b */
    public static final class C23662b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59706a;
        @C12579k

        /* renamed from: b */
        public final OtpOrigination f59707b;

        /* renamed from: c */
        public final int f59708c = R.id.action_nonFoodCheckoutStep2Fragment_to_channelsFidFragment2;

        public C23662b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            this.f59706a = str;
            this.f59707b = otpOrigination;
        }

        /* renamed from: d */
        public static /* synthetic */ C23662b m105086d(C23662b bVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f59706a;
            }
            if ((i & 2) != 0) {
                otpOrigination = bVar.f59707b;
            }
            return bVar.mo69368c(str, otpOrigination);
        }

        @C12579k
        /* renamed from: a */
        public final String mo69366a() {
            return this.f59706a;
        }

        @C12579k
        /* renamed from: b */
        public final OtpOrigination mo69367b() {
            return this.f59707b;
        }

        @C12579k
        /* renamed from: c */
        public final C23662b mo69368c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23662b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: e */
        public final String mo69369e() {
            return this.f59706a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23662b)) {
                return false;
            }
            C23662b bVar = (C23662b) obj;
            return Intrinsics.areEqual((Object) this.f59706a, (Object) bVar.f59706a) && Intrinsics.areEqual((Object) this.f59707b, (Object) bVar.f59707b);
        }

        @C12579k
        /* renamed from: f */
        public final OtpOrigination mo69371f() {
            return this.f59707b;
        }

        public int getActionId() {
            return this.f59708c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f59706a);
            Class<OtpOrigination> cls = OtpOrigination.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination = this.f59707b;
                Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("origination", otpOrigination);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OtpOrigination otpOrigination2 = this.f59707b;
                Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("origination", (Serializable) otpOrigination2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f59706a.hashCode() * 31) + this.f59707b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f59706a;
            OtpOrigination otpOrigination = this.f59707b;
            return "ActionNonFoodCheckoutStep2FragmentToChannelsFidFragment2(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d$c */
    public static final class C23663c implements C19693b0 {

        /* renamed from: a */
        public final float f59709a;

        /* renamed from: b */
        public final int f59710b;

        public C23663c() {
            this(0.0f, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C23663c m105092c(C23663c cVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = cVar.f59709a;
            }
            return cVar.mo69375b(f);
        }

        /* renamed from: a */
        public final float mo69374a() {
            return this.f59709a;
        }

        @C12579k
        /* renamed from: b */
        public final C23663c mo69375b(float f) {
            return new C23663c(f);
        }

        /* renamed from: d */
        public final float mo69376d() {
            return this.f59709a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23663c) && Float.compare(this.f59709a, ((C23663c) obj).f59709a) == 0;
        }

        public int getActionId() {
            return this.f59710b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putFloat("external_pickup_price", this.f59709a);
            return bundle;
        }

        public int hashCode() {
            return Float.hashCode(this.f59709a);
        }

        @C12579k
        public String toString() {
            float f = this.f59709a;
            return "ActionNonFoodCheckoutStep2FragmentToPickupPointsMapFragment(externalPickupPrice=" + f + ")";
        }

        public C23663c(float f) {
            this.f59709a = f;
            this.f59710b = R.id.action_nonFoodCheckoutStep2Fragment_to_pickupPointsMapFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23663c(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d$f */
    public static final class C23666f {
        public /* synthetic */ C23666f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m105114d(C23666f fVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            return fVar.mo69404c(f);
        }

        /* renamed from: f */
        public static /* synthetic */ C19693b0 m105115f(C23666f fVar, String str, Bundle bundle, Bundle bundle2, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                bundle2 = null;
            }
            return fVar.mo69405e(str, bundle, bundle2);
        }

        /* renamed from: i */
        public static /* synthetic */ C19693b0 m105116i(C23666f fVar, String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                slotExpress = null;
            }
            if ((i & 8) != 0) {
                bundle2 = null;
            }
            return fVar.mo69407h(str, bundle, slotExpress, bundle2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo69402a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23661a(str, otpOrigination);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo69403b(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
            Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            Intrinsics.checkNotNullParameter(otpOrigination, "origination");
            return new C23662b(str, otpOrigination);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo69404c(float f) {
            return new C23663c(f);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo69405e(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23664d(str, bundle, bundle2);
        }

        @C12579k
        /* renamed from: g */
        public final C19693b0 mo69406g() {
            return new C19690a(R.id.action_nonFoodCheckoutStep2_to_checkoutStep3CgvFragment);
        }

        @C12579k
        /* renamed from: h */
        public final C19693b0 mo69407h(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23665e(str, bundle, slotExpress, bundle2);
        }

        public C23666f() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d$d */
    public static final class C23664d implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59711a;
        @C12580l

        /* renamed from: b */
        public final Bundle f59712b;
        @C12580l

        /* renamed from: c */
        public final Bundle f59713c;

        /* renamed from: d */
        public final int f59714d;

        public C23664d(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f59711a = str;
            this.f59712b = bundle;
            this.f59713c = bundle2;
            this.f59714d = R.id.action_nonFoodCheckoutStep2_to_checkoutConfirmationFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C23664d m105096e(C23664d dVar, String str, Bundle bundle, Bundle bundle2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f59711a;
            }
            if ((i & 2) != 0) {
                bundle = dVar.f59712b;
            }
            if ((i & 4) != 0) {
                bundle2 = dVar.f59713c;
            }
            return dVar.mo69383d(str, bundle, bundle2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo69380a() {
            return this.f59711a;
        }

        @C12580l
        /* renamed from: b */
        public final Bundle mo69381b() {
            return this.f59712b;
        }

        @C12580l
        /* renamed from: c */
        public final Bundle mo69382c() {
            return this.f59713c;
        }

        @C12579k
        /* renamed from: d */
        public final C23664d mo69383d(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23664d(str, bundle, bundle2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23664d)) {
                return false;
            }
            C23664d dVar = (C23664d) obj;
            return Intrinsics.areEqual((Object) this.f59711a, (Object) dVar.f59711a) && Intrinsics.areEqual((Object) this.f59712b, (Object) dVar.f59712b) && Intrinsics.areEqual((Object) this.f59713c, (Object) dVar.f59713c);
        }

        @C12580l
        /* renamed from: f */
        public final Bundle mo69385f() {
            return this.f59713c;
        }

        @C12580l
        /* renamed from: g */
        public final Bundle mo69386g() {
            return this.f59712b;
        }

        public int getActionId() {
            return this.f59714d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<Bundle> cls2 = Bundle.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable(CheckoutConfirmationFragment.f59773I0, this.f59712b);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f59712b);
            }
            bundle.putString(C26190a.f64037a, this.f59711a);
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable(C38212b.f96795c, this.f59713c);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59713c);
            }
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final String mo69387h() {
            return this.f59711a;
        }

        public int hashCode() {
            int hashCode = this.f59711a.hashCode() * 31;
            Bundle bundle = this.f59712b;
            int i = 0;
            int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            Bundle bundle2 = this.f59713c;
            if (bundle2 != null) {
                i = bundle2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f59711a;
            Bundle bundle = this.f59712b;
            Bundle bundle2 = this.f59713c;
            return "ActionNonFoodCheckoutStep2ToCheckoutConfirmationFragment(subBasketId=" + str + ", orderConfirmation=" + bundle + ", categoryListByGtin=" + bundle2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23664d(String str, Bundle bundle, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : bundle2);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.d$e */
    public static final class C23665e implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59715a;
        @C12580l

        /* renamed from: b */
        public final Bundle f59716b;
        @C12580l

        /* renamed from: c */
        public final SlotExpress f59717c;
        @C12580l

        /* renamed from: d */
        public final Bundle f59718d;

        /* renamed from: e */
        public final int f59719e;

        public C23665e(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f59715a = str;
            this.f59716b = bundle;
            this.f59717c = slotExpress;
            this.f59718d = bundle2;
            this.f59719e = R.id.action_nonFoodCheckoutStep2_to_checkoutStep4Fragment;
        }

        /* renamed from: f */
        public static /* synthetic */ C23665e m105104f(C23665e eVar, String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f59715a;
            }
            if ((i & 2) != 0) {
                bundle = eVar.f59716b;
            }
            if ((i & 4) != 0) {
                slotExpress = eVar.f59717c;
            }
            if ((i & 8) != 0) {
                bundle2 = eVar.f59718d;
            }
            return eVar.mo69394e(str, bundle, slotExpress, bundle2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo69390a() {
            return this.f59715a;
        }

        @C12580l
        /* renamed from: b */
        public final Bundle mo69391b() {
            return this.f59716b;
        }

        @C12580l
        /* renamed from: c */
        public final SlotExpress mo69392c() {
            return this.f59717c;
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo69393d() {
            return this.f59718d;
        }

        @C12579k
        /* renamed from: e */
        public final C23665e mo69394e(@C12579k String str, @C12580l Bundle bundle, @C12580l SlotExpress slotExpress, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23665e(str, bundle, slotExpress, bundle2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23665e)) {
                return false;
            }
            C23665e eVar = (C23665e) obj;
            return Intrinsics.areEqual((Object) this.f59715a, (Object) eVar.f59715a) && Intrinsics.areEqual((Object) this.f59716b, (Object) eVar.f59716b) && Intrinsics.areEqual((Object) this.f59717c, (Object) eVar.f59717c) && Intrinsics.areEqual((Object) this.f59718d, (Object) eVar.f59718d);
        }

        @C12580l
        /* renamed from: g */
        public final Bundle mo69396g() {
            return this.f59716b;
        }

        public int getActionId() {
            return this.f59719e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<Bundle> cls2 = Bundle.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable("arguments_payment_confirmation", this.f59716b);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable("arguments_payment_confirmation", (Serializable) this.f59716b);
            }
            Class<SlotExpress> cls4 = SlotExpress.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable("basket_slot_express", this.f59717c);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable("basket_slot_express", (Serializable) this.f59717c);
            }
            bundle.putString(C26190a.f64037a, this.f59715a);
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable(C38212b.f96795c, this.f59718d);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59718d);
            }
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final SlotExpress mo69397h() {
            return this.f59717c;
        }

        public int hashCode() {
            int hashCode = this.f59715a.hashCode() * 31;
            Bundle bundle = this.f59716b;
            int i = 0;
            int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            SlotExpress slotExpress = this.f59717c;
            int hashCode3 = (hashCode2 + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
            Bundle bundle2 = this.f59718d;
            if (bundle2 != null) {
                i = bundle2.hashCode();
            }
            return hashCode3 + i;
        }

        @C12580l
        /* renamed from: i */
        public final Bundle mo69399i() {
            return this.f59718d;
        }

        @C12579k
        /* renamed from: j */
        public final String mo69400j() {
            return this.f59715a;
        }

        @C12579k
        public String toString() {
            String str = this.f59715a;
            Bundle bundle = this.f59716b;
            SlotExpress slotExpress = this.f59717c;
            Bundle bundle2 = this.f59718d;
            return "ActionNonFoodCheckoutStep2ToCheckoutStep4Fragment(subBasketId=" + str + ", argumentsPaymentConfirmation=" + bundle + ", basketSlotExpress=" + slotExpress + ", categoryListByGtin=" + bundle2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23665e(String str, Bundle bundle, SlotExpress slotExpress, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : slotExpress, (i & 8) != 0 ? null : bundle2);
        }
    }
}
