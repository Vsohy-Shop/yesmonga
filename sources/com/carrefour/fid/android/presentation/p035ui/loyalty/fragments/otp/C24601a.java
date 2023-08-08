package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.a */
public final class C24601a implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24602a f61149c = new C24602a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f61150d = 0;
    @C12579k

    /* renamed from: a */
    public final String f61151a;
    @C12579k

    /* renamed from: b */
    public final OtpOrigination f61152b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.a$a */
    public static final class C24602a {
        public /* synthetic */ C24602a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24601a mo71915a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24601a.class.getClassLoader());
            if (bundle.containsKey(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                String string = bundle.getString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"loyaltyCardNumber\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("origination")) {
                    Class<OtpOrigination> cls = OtpOrigination.class;
                    if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                        OtpOrigination otpOrigination = (OtpOrigination) bundle.get("origination");
                        if (otpOrigination != null) {
                            return new C24601a(string, otpOrigination);
                        }
                        throw new IllegalArgumentException("Argument \"origination\" is marked as non-null but was passed a null value.");
                    }
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                } else {
                    throw new IllegalArgumentException("Required argument \"origination\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"loyaltyCardNumber\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24601a mo71916b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                String str = (String) p0Var.mo57648h(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"loyaltyCardNumber\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("origination")) {
                    Class<OtpOrigination> cls = OtpOrigination.class;
                    if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                        OtpOrigination otpOrigination = (OtpOrigination) p0Var.mo57648h("origination");
                        if (otpOrigination != null) {
                            return new C24601a(str, otpOrigination);
                        }
                        throw new IllegalArgumentException("Argument \"origination\" is marked as non-null but was passed a null value");
                    }
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                } else {
                    throw new IllegalArgumentException("Required argument \"origination\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"loyaltyCardNumber\" is missing and does not have an android:defaultValue");
            }
        }

        public C24602a() {
        }
    }

    public C24601a(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        Intrinsics.checkNotNullParameter(otpOrigination, "origination");
        this.f61151a = str;
        this.f61152b = otpOrigination;
    }

    /* renamed from: d */
    public static /* synthetic */ C24601a m107565d(C24601a aVar, String str, OtpOrigination otpOrigination, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f61151a;
        }
        if ((i & 2) != 0) {
            otpOrigination = aVar.f61152b;
        }
        return aVar.mo71907c(str, otpOrigination);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24601a m107566e(@C12579k C19456p0 p0Var) {
        return f61149c.mo71916b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24601a fromBundle(@C12579k Bundle bundle) {
        return f61149c.mo71915a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo71905a() {
        return this.f61151a;
    }

    @C12579k
    /* renamed from: b */
    public final OtpOrigination mo71906b() {
        return this.f61152b;
    }

    @C12579k
    /* renamed from: c */
    public final C24601a mo71907c(@C12579k String str, @C12579k OtpOrigination otpOrigination) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        Intrinsics.checkNotNullParameter(otpOrigination, "origination");
        return new C24601a(str, otpOrigination);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24601a)) {
            return false;
        }
        C24601a aVar = (C24601a) obj;
        return Intrinsics.areEqual((Object) this.f61151a, (Object) aVar.f61151a) && Intrinsics.areEqual((Object) this.f61152b, (Object) aVar.f61152b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo71909f() {
        return this.f61151a;
    }

    @C12579k
    /* renamed from: g */
    public final OtpOrigination mo71910g() {
        return this.f61152b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo71911h() {
        Bundle bundle = new Bundle();
        bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61151a);
        Class<OtpOrigination> cls = OtpOrigination.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination = this.f61152b;
            Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("origination", otpOrigination);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination2 = this.f61152b;
            Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("origination", (Serializable) otpOrigination2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    public int hashCode() {
        return (this.f61151a.hashCode() * 31) + this.f61152b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo71913i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61151a);
        Class<OtpOrigination> cls = OtpOrigination.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination = this.f61152b;
            Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("origination", otpOrigination);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination2 = this.f61152b;
            Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("origination", (Serializable) otpOrigination2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f61151a;
        OtpOrigination otpOrigination = this.f61152b;
        return "BlockedCardFragmentArgs(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ")";
    }
}
