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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.m */
public final class C24622m implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C24623a f61193d = new C24623a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f61194e = 0;
    @C12579k

    /* renamed from: a */
    public final String f61195a;
    @C12579k

    /* renamed from: b */
    public final OtpOrigination f61196b;
    @C12580l

    /* renamed from: c */
    public final String f61197c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.m$a */
    public static final class C24623a {
        public /* synthetic */ C24623a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24622m mo71979a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24622m.class.getClassLoader());
            if (bundle.containsKey(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                String string = bundle.getString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                if (string != null) {
                    if (bundle.containsKey("validationOtpCode")) {
                        str = bundle.getString("validationOtpCode");
                    } else {
                        str = null;
                    }
                    if (bundle.containsKey("origination")) {
                        Class<OtpOrigination> cls = OtpOrigination.class;
                        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                            OtpOrigination otpOrigination = (OtpOrigination) bundle.get("origination");
                            if (otpOrigination != null) {
                                return new C24622m(string, otpOrigination, str);
                            }
                            throw new IllegalArgumentException("Argument \"origination\" is marked as non-null but was passed a null value.");
                        }
                        String name = cls.getName();
                        throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    throw new IllegalArgumentException("Required argument \"origination\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"loyaltyCardNumber\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"loyaltyCardNumber\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24622m mo71980b(@C12579k C19456p0 p0Var) {
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                String str2 = (String) p0Var.mo57648h(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                if (str2 != null) {
                    if (p0Var.mo57647f("validationOtpCode")) {
                        str = (String) p0Var.mo57648h("validationOtpCode");
                    } else {
                        str = null;
                    }
                    if (p0Var.mo57647f("origination")) {
                        Class<OtpOrigination> cls = OtpOrigination.class;
                        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                            OtpOrigination otpOrigination = (OtpOrigination) p0Var.mo57648h("origination");
                            if (otpOrigination != null) {
                                return new C24622m(str2, otpOrigination, str);
                            }
                            throw new IllegalArgumentException("Argument \"origination\" is marked as non-null but was passed a null value");
                        }
                        String name = cls.getName();
                        throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    throw new IllegalArgumentException("Required argument \"origination\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"loyaltyCardNumber\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"loyaltyCardNumber\" is missing and does not have an android:defaultValue");
        }

        public C24623a() {
        }
    }

    public C24622m(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        Intrinsics.checkNotNullParameter(otpOrigination, "origination");
        this.f61195a = str;
        this.f61196b = otpOrigination;
        this.f61197c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ C24622m m107622e(C24622m mVar, String str, OtpOrigination otpOrigination, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.f61195a;
        }
        if ((i & 2) != 0) {
            otpOrigination = mVar.f61196b;
        }
        if ((i & 4) != 0) {
            str2 = mVar.f61197c;
        }
        return mVar.mo71970d(str, otpOrigination, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C24622m m107623f(@C12579k C19456p0 p0Var) {
        return f61193d.mo71980b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24622m fromBundle(@C12579k Bundle bundle) {
        return f61193d.mo71979a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo71967a() {
        return this.f61195a;
    }

    @C12579k
    /* renamed from: b */
    public final OtpOrigination mo71968b() {
        return this.f61196b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo71969c() {
        return this.f61197c;
    }

    @C12579k
    /* renamed from: d */
    public final C24622m mo71970d(@C12579k String str, @C12579k OtpOrigination otpOrigination, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        Intrinsics.checkNotNullParameter(otpOrigination, "origination");
        return new C24622m(str, otpOrigination, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24622m)) {
            return false;
        }
        C24622m mVar = (C24622m) obj;
        return Intrinsics.areEqual((Object) this.f61195a, (Object) mVar.f61195a) && Intrinsics.areEqual((Object) this.f61196b, (Object) mVar.f61196b) && Intrinsics.areEqual((Object) this.f61197c, (Object) mVar.f61197c);
    }

    @C12579k
    /* renamed from: g */
    public final String mo71972g() {
        return this.f61195a;
    }

    @C12579k
    /* renamed from: h */
    public final OtpOrigination mo71973h() {
        return this.f61196b;
    }

    public int hashCode() {
        int hashCode = ((this.f61195a.hashCode() * 31) + this.f61196b.hashCode()) * 31;
        String str = this.f61197c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @C12580l
    /* renamed from: i */
    public final String mo71975i() {
        return this.f61197c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo71976j() {
        Bundle bundle = new Bundle();
        bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61195a);
        bundle.putString("validationOtpCode", this.f61197c);
        Class<OtpOrigination> cls = OtpOrigination.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination = this.f61196b;
            Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("origination", otpOrigination);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination2 = this.f61196b;
            Intrinsics.checkNotNull(otpOrigination2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("origination", (Serializable) otpOrigination2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo71977k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f61195a);
        p0Var.mo57656q("validationOtpCode", this.f61197c);
        Class<OtpOrigination> cls = OtpOrigination.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination = this.f61196b;
            Intrinsics.checkNotNull(otpOrigination, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("origination", otpOrigination);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            OtpOrigination otpOrigination2 = this.f61196b;
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
        String str = this.f61195a;
        OtpOrigination otpOrigination = this.f61196b;
        String str2 = this.f61197c;
        return "SecretCodeFragmentArgs(loyaltyCardNumber=" + str + ", origination=" + otpOrigination + ", validationOtpCode=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24622m(String str, OtpOrigination otpOrigination, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, otpOrigination, (i & 4) != 0 ? null : str2);
    }
}
