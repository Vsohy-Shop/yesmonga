package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.PaymentErrorType;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.b */
public final class C23345b {
    @C12579k

    /* renamed from: a */
    public static final C23348c f59104a = new C23348c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59105b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.b$b */
    public static final class C23347b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final PaymentErrorType f59110a;
        @C12580l

        /* renamed from: b */
        public final String f59111b;
        @C12580l

        /* renamed from: c */
        public final String f59112c;

        /* renamed from: d */
        public final int f59113d = R.id.action_checkoutFragment_to_checkoutPaymentErrorFragment;

        public C23347b(@C12579k PaymentErrorType paymentErrorType, @C12580l String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(paymentErrorType, "errorType");
            this.f59110a = paymentErrorType;
            this.f59111b = str;
            this.f59112c = str2;
        }

        /* renamed from: e */
        public static /* synthetic */ C23347b m104194e(C23347b bVar, PaymentErrorType paymentErrorType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentErrorType = bVar.f59110a;
            }
            if ((i & 2) != 0) {
                str = bVar.f59111b;
            }
            if ((i & 4) != 0) {
                str2 = bVar.f59112c;
            }
            return bVar.mo68380d(paymentErrorType, str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final PaymentErrorType mo68377a() {
            return this.f59110a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo68378b() {
            return this.f59111b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo68379c() {
            return this.f59112c;
        }

        @C12579k
        /* renamed from: d */
        public final C23347b mo68380d(@C12579k PaymentErrorType paymentErrorType, @C12580l String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(paymentErrorType, "errorType");
            return new C23347b(paymentErrorType, str, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23347b)) {
                return false;
            }
            C23347b bVar = (C23347b) obj;
            return this.f59110a == bVar.f59110a && Intrinsics.areEqual((Object) this.f59111b, (Object) bVar.f59111b) && Intrinsics.areEqual((Object) this.f59112c, (Object) bVar.f59112c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo68382f() {
            return this.f59111b;
        }

        @C12579k
        /* renamed from: g */
        public final PaymentErrorType mo68383g() {
            return this.f59110a;
        }

        public int getActionId() {
            return this.f59113d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<PaymentErrorType> cls = PaymentErrorType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                PaymentErrorType paymentErrorType = this.f59110a;
                Intrinsics.checkNotNull(paymentErrorType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("errorType", (Parcelable) paymentErrorType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                PaymentErrorType paymentErrorType2 = this.f59110a;
                Intrinsics.checkNotNull(paymentErrorType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("errorType", paymentErrorType2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("errorCode", this.f59111b);
            bundle.putString("paymentMethod", this.f59112c);
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo68384h() {
            return this.f59112c;
        }

        public int hashCode() {
            int hashCode = this.f59110a.hashCode() * 31;
            String str = this.f59111b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f59112c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            PaymentErrorType paymentErrorType = this.f59110a;
            String str = this.f59111b;
            String str2 = this.f59112c;
            return "ActionCheckoutFragmentToCheckoutPaymentErrorFragment(errorType=" + paymentErrorType + ", errorCode=" + str + ", paymentMethod=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.b$c */
    public static final class C23348c {
        public /* synthetic */ C23348c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m104202b(C23348c cVar, String str, Bundle bundle, Bundle bundle2, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                bundle2 = null;
            }
            return cVar.mo68387a(str, bundle, bundle2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo68387a(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23346a(str, bundle, bundle2);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo68388c(@C12579k PaymentErrorType paymentErrorType, @C12580l String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(paymentErrorType, "errorType");
            return new C23347b(paymentErrorType, str, str2);
        }

        public C23348c() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.b$a */
    public static final class C23346a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59106a;
        @C12580l

        /* renamed from: b */
        public final Bundle f59107b;
        @C12580l

        /* renamed from: c */
        public final Bundle f59108c;

        /* renamed from: d */
        public final int f59109d;

        public C23346a(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f59106a = str;
            this.f59107b = bundle;
            this.f59108c = bundle2;
            this.f59109d = R.id.action_checkoutFragment_to_checkoutConfirmationFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C23346a m104186e(C23346a aVar, String str, Bundle bundle, Bundle bundle2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f59106a;
            }
            if ((i & 2) != 0) {
                bundle = aVar.f59107b;
            }
            if ((i & 4) != 0) {
                bundle2 = aVar.f59108c;
            }
            return aVar.mo68370d(str, bundle, bundle2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo68367a() {
            return this.f59106a;
        }

        @C12580l
        /* renamed from: b */
        public final Bundle mo68368b() {
            return this.f59107b;
        }

        @C12580l
        /* renamed from: c */
        public final Bundle mo68369c() {
            return this.f59108c;
        }

        @C12579k
        /* renamed from: d */
        public final C23346a mo68370d(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23346a(str, bundle, bundle2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23346a)) {
                return false;
            }
            C23346a aVar = (C23346a) obj;
            return Intrinsics.areEqual((Object) this.f59106a, (Object) aVar.f59106a) && Intrinsics.areEqual((Object) this.f59107b, (Object) aVar.f59107b) && Intrinsics.areEqual((Object) this.f59108c, (Object) aVar.f59108c);
        }

        @C12580l
        /* renamed from: f */
        public final Bundle mo68372f() {
            return this.f59108c;
        }

        @C12580l
        /* renamed from: g */
        public final Bundle mo68373g() {
            return this.f59107b;
        }

        public int getActionId() {
            return this.f59109d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<Bundle> cls2 = Bundle.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable(CheckoutConfirmationFragment.f59773I0, this.f59107b);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f59107b);
            }
            bundle.putString(C26190a.f64037a, this.f59106a);
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable(C38212b.f96795c, this.f59108c);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59108c);
            }
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final String mo68374h() {
            return this.f59106a;
        }

        public int hashCode() {
            int hashCode = this.f59106a.hashCode() * 31;
            Bundle bundle = this.f59107b;
            int i = 0;
            int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            Bundle bundle2 = this.f59108c;
            if (bundle2 != null) {
                i = bundle2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f59106a;
            Bundle bundle = this.f59107b;
            Bundle bundle2 = this.f59108c;
            return "ActionCheckoutFragmentToCheckoutConfirmationFragment(subBasketId=" + str + ", orderConfirmation=" + bundle + ", categoryListByGtin=" + bundle2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23346a(String str, Bundle bundle, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : bundle2);
        }
    }
}
