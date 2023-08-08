package com.carrefour.fid.android.presentation.p035ui.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.core.type.PaymentErrorType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.p */
public final class C23765p implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C23766a f59839d = new C23766a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f59840e = 0;
    @C12579k

    /* renamed from: a */
    public final PaymentErrorType f59841a;
    @C12580l

    /* renamed from: b */
    public final String f59842b;
    @C12580l

    /* renamed from: c */
    public final String f59843c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.p$a */
    public static final class C23766a {
        public /* synthetic */ C23766a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23765p mo69634a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23765p.class.getClassLoader());
            if (bundle.containsKey("errorType")) {
                Class<PaymentErrorType> cls = PaymentErrorType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    PaymentErrorType paymentErrorType = (PaymentErrorType) bundle.get("errorType");
                    if (paymentErrorType == null) {
                        throw new IllegalArgumentException("Argument \"errorType\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("errorCode")) {
                        String string = bundle.getString("errorCode");
                        if (bundle.containsKey("paymentMethod")) {
                            return new C23765p(paymentErrorType, string, bundle.getString("paymentMethod"));
                        }
                        throw new IllegalArgumentException("Required argument \"paymentMethod\" is missing and does not have an android:defaultValue");
                    } else {
                        throw new IllegalArgumentException("Required argument \"errorCode\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"errorType\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23765p mo69635b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("errorType")) {
                Class<PaymentErrorType> cls = PaymentErrorType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    PaymentErrorType paymentErrorType = (PaymentErrorType) p0Var.mo57648h("errorType");
                    if (paymentErrorType == null) {
                        throw new IllegalArgumentException("Argument \"errorType\" is marked as non-null but was passed a null value");
                    } else if (p0Var.mo57647f("errorCode")) {
                        String str = (String) p0Var.mo57648h("errorCode");
                        if (p0Var.mo57647f("paymentMethod")) {
                            return new C23765p(paymentErrorType, str, (String) p0Var.mo57648h("paymentMethod"));
                        }
                        throw new IllegalArgumentException("Required argument \"paymentMethod\" is missing and does not have an android:defaultValue");
                    } else {
                        throw new IllegalArgumentException("Required argument \"errorCode\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"errorType\" is missing and does not have an android:defaultValue");
            }
        }

        public C23766a() {
        }
    }

    public C23765p(@C12579k PaymentErrorType paymentErrorType, @C12580l String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(paymentErrorType, "errorType");
        this.f59841a = paymentErrorType;
        this.f59842b = str;
        this.f59843c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ C23765p m105382e(C23765p pVar, PaymentErrorType paymentErrorType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentErrorType = pVar.f59841a;
        }
        if ((i & 2) != 0) {
            str = pVar.f59842b;
        }
        if ((i & 4) != 0) {
            str2 = pVar.f59843c;
        }
        return pVar.mo69625d(paymentErrorType, str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C23765p m105383f(@C12579k C19456p0 p0Var) {
        return f59839d.mo69635b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23765p fromBundle(@C12579k Bundle bundle) {
        return f59839d.mo69634a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final PaymentErrorType mo69622a() {
        return this.f59841a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo69623b() {
        return this.f59842b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo69624c() {
        return this.f59843c;
    }

    @C12579k
    /* renamed from: d */
    public final C23765p mo69625d(@C12579k PaymentErrorType paymentErrorType, @C12580l String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(paymentErrorType, "errorType");
        return new C23765p(paymentErrorType, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23765p)) {
            return false;
        }
        C23765p pVar = (C23765p) obj;
        return this.f59841a == pVar.f59841a && Intrinsics.areEqual((Object) this.f59842b, (Object) pVar.f59842b) && Intrinsics.areEqual((Object) this.f59843c, (Object) pVar.f59843c);
    }

    @C12580l
    /* renamed from: g */
    public final String mo69627g() {
        return this.f59842b;
    }

    @C12579k
    /* renamed from: h */
    public final PaymentErrorType mo69628h() {
        return this.f59841a;
    }

    public int hashCode() {
        int hashCode = this.f59841a.hashCode() * 31;
        String str = this.f59842b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59843c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo69630i() {
        return this.f59843c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo69631j() {
        Bundle bundle = new Bundle();
        Class<PaymentErrorType> cls = PaymentErrorType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            PaymentErrorType paymentErrorType = this.f59841a;
            Intrinsics.checkNotNull(paymentErrorType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("errorType", (Parcelable) paymentErrorType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            PaymentErrorType paymentErrorType2 = this.f59841a;
            Intrinsics.checkNotNull(paymentErrorType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("errorType", paymentErrorType2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putString("errorCode", this.f59842b);
        bundle.putString("paymentMethod", this.f59843c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo69632k() {
        C19456p0 p0Var = new C19456p0();
        Class<PaymentErrorType> cls = PaymentErrorType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            PaymentErrorType paymentErrorType = this.f59841a;
            Intrinsics.checkNotNull(paymentErrorType, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("errorType", (Parcelable) paymentErrorType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            PaymentErrorType paymentErrorType2 = this.f59841a;
            Intrinsics.checkNotNull(paymentErrorType2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("errorType", paymentErrorType2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("errorCode", this.f59842b);
        p0Var.mo57656q("paymentMethod", this.f59843c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        PaymentErrorType paymentErrorType = this.f59841a;
        String str = this.f59842b;
        String str2 = this.f59843c;
        return "CheckoutPaymentErrorFragmentArgs(errorType=" + paymentErrorType + ", errorCode=" + str + ", paymentMethod=" + str2 + ")";
    }
}
