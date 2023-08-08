package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.LoyaltyAmountType;
import com.carrefour.fid.android.core.type.LoyaltyBalanceType;
import com.carrefour.fid.android.domain.models.PaymentSettingsModel;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel;
import com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g */
public final class C26944g {
    @C12579k

    /* renamed from: a */
    public static final C26944g f65622a = new C26944g();

    /* renamed from: b */
    public static final int f65623b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a */
    public interface C26945a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$a */
        public static final class C26946a implements C26945a {
            @C12579k

            /* renamed from: a */
            public static final C26946a f65624a = new C26946a();

            /* renamed from: b */
            public static final int f65625b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$b */
        public static final class C26947b implements C26945a {
            @C12579k

            /* renamed from: a */
            public static final C26947b f65626a = new C26947b();

            /* renamed from: b */
            public static final int f65627b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$c */
        public static final class C26948c implements C26945a {

            /* renamed from: b */
            public static final int f65628b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65629a;

            public C26948c(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65629a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26948c m114104c(C26948c cVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = cVar.f65629a;
                }
                return cVar.mo78284b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo78283a() {
                return this.f65629a;
            }

            @C12579k
            /* renamed from: b */
            public final C26948c mo78284b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26948c(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo78285d() {
                return this.f65629a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26948c) && Intrinsics.areEqual((Object) this.f65629a, (Object) ((C26948c) obj).f65629a);
            }

            public int hashCode() {
                return this.f65629a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65629a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$d */
        public static final class C26949d implements C26945a {

            /* renamed from: b */
            public static final int f65630b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65631a;

            public C26949d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "fidCardNumber");
                this.f65631a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26949d m114108c(C26949d dVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f65631a;
                }
                return dVar.mo78290b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78289a() {
                return this.f65631a;
            }

            @C12579k
            /* renamed from: b */
            public final C26949d mo78290b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "fidCardNumber");
                return new C26949d(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo78291d() {
                return this.f65631a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26949d) && Intrinsics.areEqual((Object) this.f65631a, (Object) ((C26949d) obj).f65631a);
            }

            public int hashCode() {
                return this.f65631a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65631a;
                return "FidCardBlocked(fidCardNumber=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$e */
        public static final class C26950e implements C26945a {
            @C12579k

            /* renamed from: a */
            public static final C26950e f65632a = new C26950e();

            /* renamed from: b */
            public static final int f65633b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$f */
        public static final class C26951f implements C26945a {

            /* renamed from: b */
            public static final int f65634b = 0;
            @C12579k

            /* renamed from: a */
            public final PaymentConfirmationModel f65635a;

            public C26951f(@C12579k PaymentConfirmationModel paymentConfirmationModel) {
                Intrinsics.checkNotNullParameter(paymentConfirmationModel, "paymentConfirmationModel");
                this.f65635a = paymentConfirmationModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26951f m114112c(C26951f fVar, PaymentConfirmationModel paymentConfirmationModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentConfirmationModel = fVar.f65635a;
                }
                return fVar.mo78296b(paymentConfirmationModel);
            }

            @C12579k
            /* renamed from: a */
            public final PaymentConfirmationModel mo78295a() {
                return this.f65635a;
            }

            @C12579k
            /* renamed from: b */
            public final C26951f mo78296b(@C12579k PaymentConfirmationModel paymentConfirmationModel) {
                Intrinsics.checkNotNullParameter(paymentConfirmationModel, "paymentConfirmationModel");
                return new C26951f(paymentConfirmationModel);
            }

            @C12579k
            /* renamed from: d */
            public final PaymentConfirmationModel mo78297d() {
                return this.f65635a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26951f) && Intrinsics.areEqual((Object) this.f65635a, (Object) ((C26951f) obj).f65635a);
            }

            public int hashCode() {
                return this.f65635a.hashCode();
            }

            @C12579k
            public String toString() {
                PaymentConfirmationModel paymentConfirmationModel = this.f65635a;
                return "PaymentConfirmation(paymentConfirmationModel=" + paymentConfirmationModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$g */
        public static final class C26952g implements C26945a {

            /* renamed from: b */
            public static final int f65636b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65637a;

            public C26952g(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "fidCardNumber");
                this.f65637a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26952g m114116c(C26952g gVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = gVar.f65637a;
                }
                return gVar.mo78302b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78301a() {
                return this.f65637a;
            }

            @C12579k
            /* renamed from: b */
            public final C26952g mo78302b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "fidCardNumber");
                return new C26952g(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo78303d() {
                return this.f65637a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26952g) && Intrinsics.areEqual((Object) this.f65637a, (Object) ((C26952g) obj).f65637a);
            }

            public int hashCode() {
                return this.f65637a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65637a;
                return "ResetFidCode(fidCardNumber=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$a$h */
        public static final class C26953h implements C26945a {
            @C12579k

            /* renamed from: a */
            public static final C26953h f65638a = new C26953h();

            /* renamed from: b */
            public static final int f65639b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b */
    public interface C26954b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$a */
        public static final class C26955a implements C26954b {

            /* renamed from: c */
            public static final int f65640c = 0;
            @C12579k

            /* renamed from: b */
            public final CheckoutStepTwoModel f65641b;

            public C26955a(@C12579k CheckoutStepTwoModel checkoutStepTwoModel) {
                Intrinsics.checkNotNullParameter(checkoutStepTwoModel, "checkoutStepTwoModel");
                this.f65641b = checkoutStepTwoModel;
            }

            /* renamed from: g */
            public static /* synthetic */ C26955a m114120g(C26955a aVar, CheckoutStepTwoModel checkoutStepTwoModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutStepTwoModel = aVar.f65641b;
                }
                return aVar.mo78309f(checkoutStepTwoModel);
            }

            @C12579k
            /* renamed from: e */
            public final CheckoutStepTwoModel mo78307e() {
                return this.f65641b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26955a) && Intrinsics.areEqual((Object) this.f65641b, (Object) ((C26955a) obj).f65641b);
            }

            @C12579k
            /* renamed from: f */
            public final C26955a mo78309f(@C12579k CheckoutStepTwoModel checkoutStepTwoModel) {
                Intrinsics.checkNotNullParameter(checkoutStepTwoModel, "checkoutStepTwoModel");
                return new C26955a(checkoutStepTwoModel);
            }

            @C12579k
            /* renamed from: h */
            public final CheckoutStepTwoModel mo78310h() {
                return this.f65641b;
            }

            public int hashCode() {
                return this.f65641b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                CheckoutStepTwoModel checkoutStepTwoModel = this.f65641b;
                return "CheckoutInfo(checkoutStepTwoModel=" + checkoutStepTwoModel + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$b */
        public static final class C26956b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m114124a(@C12579k C26954b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$c */
        public static final class C26957c implements C26954b {
            @C12579k

            /* renamed from: b */
            public static final C26957c f65642b = new C26957c();

            /* renamed from: c */
            public static final int f65643c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$d */
        public static final class C26958d implements C26954b {

            /* renamed from: c */
            public static final int f65644c = 0;

            /* renamed from: b */
            public final boolean f65645b;

            public C26958d() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26958d m114125g(C26958d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f65645b;
                }
                return dVar.mo78315f(z);
            }

            /* renamed from: e */
            public final boolean mo78313e() {
                return this.f65645b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26958d) && this.f65645b == ((C26958d) obj).f65645b;
            }

            @C12579k
            /* renamed from: f */
            public final C26958d mo78315f(boolean z) {
                return new C26958d(z);
            }

            public int hashCode() {
                boolean z = this.f65645b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f65645b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65645b;
                return "Loading(isLoading=" + z + ")";
            }

            public C26958d(boolean z) {
                this.f65645b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26958d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$e */
        public static final class C26959e implements C26954b {

            /* renamed from: c */
            public static final int f65646c = 8;
            @C12579k

            /* renamed from: b */
            public final LoyaltyModel f65647b;

            public C26959e(@C12579k LoyaltyModel loyaltyModel) {
                Intrinsics.checkNotNullParameter(loyaltyModel, "loyaltyModel");
                this.f65647b = loyaltyModel;
            }

            /* renamed from: g */
            public static /* synthetic */ C26959e m114128g(C26959e eVar, LoyaltyModel loyaltyModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    loyaltyModel = eVar.f65647b;
                }
                return eVar.mo78321f(loyaltyModel);
            }

            @C12579k
            /* renamed from: e */
            public final LoyaltyModel mo78319e() {
                return this.f65647b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26959e) && Intrinsics.areEqual((Object) this.f65647b, (Object) ((C26959e) obj).f65647b);
            }

            @C12579k
            /* renamed from: f */
            public final C26959e mo78321f(@C12579k LoyaltyModel loyaltyModel) {
                Intrinsics.checkNotNullParameter(loyaltyModel, "loyaltyModel");
                return new C26959e(loyaltyModel);
            }

            @C12579k
            /* renamed from: h */
            public final LoyaltyModel mo78322h() {
                return this.f65647b;
            }

            public int hashCode() {
                return this.f65647b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                LoyaltyModel loyaltyModel = this.f65647b;
                return "Loyalty(loyaltyModel=" + loyaltyModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$f */
        public static final class C26960f implements C26954b {

            /* renamed from: c */
            public static final int f65648c = 0;
            @C12579k

            /* renamed from: b */
            public final LoyaltyAmountType f65649b;

            public C26960f(@C12579k LoyaltyAmountType loyaltyAmountType) {
                Intrinsics.checkNotNullParameter(loyaltyAmountType, "type");
                this.f65649b = loyaltyAmountType;
            }

            /* renamed from: g */
            public static /* synthetic */ C26960f m114132g(C26960f fVar, LoyaltyAmountType loyaltyAmountType, int i, Object obj) {
                if ((i & 1) != 0) {
                    loyaltyAmountType = fVar.f65649b;
                }
                return fVar.mo78327f(loyaltyAmountType);
            }

            @C12579k
            /* renamed from: e */
            public final LoyaltyAmountType mo78325e() {
                return this.f65649b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26960f) && Intrinsics.areEqual((Object) this.f65649b, (Object) ((C26960f) obj).f65649b);
            }

            @C12579k
            /* renamed from: f */
            public final C26960f mo78327f(@C12579k LoyaltyAmountType loyaltyAmountType) {
                Intrinsics.checkNotNullParameter(loyaltyAmountType, "type");
                return new C26960f(loyaltyAmountType);
            }

            @C12579k
            /* renamed from: h */
            public final LoyaltyAmountType mo78328h() {
                return this.f65649b;
            }

            public int hashCode() {
                return this.f65649b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                LoyaltyAmountType loyaltyAmountType = this.f65649b;
                return "LoyaltyAmount(type=" + loyaltyAmountType + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$g */
        public static final class C26961g implements C26954b {

            /* renamed from: c */
            public static final int f65650c = 0;
            @C12579k

            /* renamed from: b */
            public final LoyaltyBalanceType f65651b;

            public C26961g(@C12579k LoyaltyBalanceType loyaltyBalanceType) {
                Intrinsics.checkNotNullParameter(loyaltyBalanceType, "type");
                this.f65651b = loyaltyBalanceType;
            }

            /* renamed from: g */
            public static /* synthetic */ C26961g m114136g(C26961g gVar, LoyaltyBalanceType loyaltyBalanceType, int i, Object obj) {
                if ((i & 1) != 0) {
                    loyaltyBalanceType = gVar.f65651b;
                }
                return gVar.mo78333f(loyaltyBalanceType);
            }

            @C12579k
            /* renamed from: e */
            public final LoyaltyBalanceType mo78331e() {
                return this.f65651b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26961g) && Intrinsics.areEqual((Object) this.f65651b, (Object) ((C26961g) obj).f65651b);
            }

            @C12579k
            /* renamed from: f */
            public final C26961g mo78333f(@C12579k LoyaltyBalanceType loyaltyBalanceType) {
                Intrinsics.checkNotNullParameter(loyaltyBalanceType, "type");
                return new C26961g(loyaltyBalanceType);
            }

            @C12579k
            /* renamed from: h */
            public final LoyaltyBalanceType mo78334h() {
                return this.f65651b;
            }

            public int hashCode() {
                return this.f65651b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                LoyaltyBalanceType loyaltyBalanceType = this.f65651b;
                return "LoyaltyBalance(type=" + loyaltyBalanceType + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$h */
        public static final class C26962h implements C26954b {

            /* renamed from: c */
            public static final int f65652c = 0;

            /* renamed from: b */
            public final boolean f65653b;

            public C26962h(boolean z) {
                this.f65653b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26962h m114140g(C26962h hVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = hVar.f65653b;
                }
                return hVar.mo78339f(z);
            }

            /* renamed from: e */
            public final boolean mo78337e() {
                return this.f65653b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26962h) && this.f65653b == ((C26962h) obj).f65653b;
            }

            @C12579k
            /* renamed from: f */
            public final C26962h mo78339f(boolean z) {
                return new C26962h(z);
            }

            /* renamed from: h */
            public final boolean mo78340h() {
                return this.f65653b;
            }

            public int hashCode() {
                boolean z = this.f65653b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65653b;
                return "LoyaltyNoteDisplay(state=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$b$i */
        public static final class C26963i implements C26954b {

            /* renamed from: c */
            public static final int f65654c = 0;

            /* renamed from: b */
            public final boolean f65655b;

            public C26963i() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26963i m114144g(C26963i iVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = iVar.f65655b;
                }
                return iVar.mo78345f(z);
            }

            /* renamed from: e */
            public final boolean mo78343e() {
                return this.f65655b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26963i) && this.f65655b == ((C26963i) obj).f65655b;
            }

            @C12579k
            /* renamed from: f */
            public final C26963i mo78345f(boolean z) {
                return new C26963i(z);
            }

            public int hashCode() {
                boolean z = this.f65655b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f65655b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26956b.m114124a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65655b;
                return "ValidateLoading(isLoading=" + z + ")";
            }

            public C26963i(boolean z) {
                this.f65655b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26963i(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$c */
    public interface C26964c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$c$a */
        public static final class C26965a implements C26964c {
            @C12579k

            /* renamed from: a */
            public static final C26965a f65656a = new C26965a();

            /* renamed from: b */
            public static final int f65657b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$c$b */
        public static final class C26966b implements C26964c {

            /* renamed from: b */
            public static final int f65658b = 0;

            /* renamed from: a */
            public final boolean f65659a;

            public C26966b() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26966b m114147c(C26966b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f65659a;
                }
                return bVar.mo78350b(z);
            }

            /* renamed from: a */
            public final boolean mo78349a() {
                return this.f65659a;
            }

            @C12579k
            /* renamed from: b */
            public final C26966b mo78350b(boolean z) {
                return new C26966b(z);
            }

            /* renamed from: d */
            public final boolean mo78351d() {
                return this.f65659a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26966b) && this.f65659a == ((C26966b) obj).f65659a;
            }

            public int hashCode() {
                boolean z = this.f65659a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65659a;
                return "GetBasket(withLoading=" + z + ")";
            }

            public C26966b(boolean z) {
                this.f65659a = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26966b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$c$c */
        public static final class C26967c implements C26964c {

            /* renamed from: b */
            public static final int f65660b = 0;
            @C12579k

            /* renamed from: a */
            public final CheckoutStepTwoModel f65661a;

            public C26967c(@C12579k CheckoutStepTwoModel checkoutStepTwoModel) {
                Intrinsics.checkNotNullParameter(checkoutStepTwoModel, "checkoutStepTwoModel");
                this.f65661a = checkoutStepTwoModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26967c m114151c(C26967c cVar, CheckoutStepTwoModel checkoutStepTwoModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    checkoutStepTwoModel = cVar.f65661a;
                }
                return cVar.mo78356b(checkoutStepTwoModel);
            }

            @C12579k
            /* renamed from: a */
            public final CheckoutStepTwoModel mo78355a() {
                return this.f65661a;
            }

            @C12579k
            /* renamed from: b */
            public final C26967c mo78356b(@C12579k CheckoutStepTwoModel checkoutStepTwoModel) {
                Intrinsics.checkNotNullParameter(checkoutStepTwoModel, "checkoutStepTwoModel");
                return new C26967c(checkoutStepTwoModel);
            }

            @C12579k
            /* renamed from: d */
            public final CheckoutStepTwoModel mo78357d() {
                return this.f65661a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26967c) && Intrinsics.areEqual((Object) this.f65661a, (Object) ((C26967c) obj).f65661a);
            }

            public int hashCode() {
                return this.f65661a.hashCode();
            }

            @C12579k
            public String toString() {
                CheckoutStepTwoModel checkoutStepTwoModel = this.f65661a;
                return "GetLoyaltyInfo(checkoutStepTwoModel=" + checkoutStepTwoModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$c$d */
        public static final class C26968d implements C26964c {

            /* renamed from: b */
            public static final int f65662b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65663a;

            public C26968d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
                this.f65663a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26968d m114155c(C26968d dVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f65663a;
                }
                return dVar.mo78362b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78361a() {
                return this.f65663a;
            }

            @C12579k
            /* renamed from: b */
            public final C26968d mo78362b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
                return new C26968d(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo78363d() {
                return this.f65663a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26968d) && Intrinsics.areEqual((Object) this.f65663a, (Object) ((C26968d) obj).f65663a);
            }

            public int hashCode() {
                return this.f65663a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65663a;
                return "ValidateLoyaltyAmount(loyaltyAmount=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.g$c$e */
        public static final class C26969e implements C26964c {

            /* renamed from: b */
            public static final int f65664b = 8;
            @C12579k

            /* renamed from: a */
            public final PaymentSettingsModel f65665a;

            public C26969e(@C12579k PaymentSettingsModel paymentSettingsModel) {
                Intrinsics.checkNotNullParameter(paymentSettingsModel, "paymentSettingsModel");
                this.f65665a = paymentSettingsModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26969e m114159c(C26969e eVar, PaymentSettingsModel paymentSettingsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentSettingsModel = eVar.f65665a;
                }
                return eVar.mo78368b(paymentSettingsModel);
            }

            @C12579k
            /* renamed from: a */
            public final PaymentSettingsModel mo78367a() {
                return this.f65665a;
            }

            @C12579k
            /* renamed from: b */
            public final C26969e mo78368b(@C12579k PaymentSettingsModel paymentSettingsModel) {
                Intrinsics.checkNotNullParameter(paymentSettingsModel, "paymentSettingsModel");
                return new C26969e(paymentSettingsModel);
            }

            @C12579k
            /* renamed from: d */
            public final PaymentSettingsModel mo78369d() {
                return this.f65665a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26969e) && Intrinsics.areEqual((Object) this.f65665a, (Object) ((C26969e) obj).f65665a);
            }

            public int hashCode() {
                return this.f65665a.hashCode();
            }

            @C12579k
            public String toString() {
                PaymentSettingsModel paymentSettingsModel = this.f65665a;
                return "ValidatePayment(paymentSettingsModel=" + paymentSettingsModel + ")";
            }
        }
    }
}
