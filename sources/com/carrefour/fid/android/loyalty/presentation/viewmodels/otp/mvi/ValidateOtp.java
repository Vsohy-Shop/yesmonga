package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi;

import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp;", "", "()V", "UIState", "UiEvent", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ValidateOtp {
    @C12579k
    public static final ValidateOtp INSTANCE = new ValidateOtp();

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "component2", "isLoading", "isErrorDigitCode", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "<init>", "(ZZ)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        private final boolean isErrorDigitCode;
        private final boolean isLoading;

        public UIState() {
            this(false, false, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uIState.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = uIState.isErrorDigitCode;
            }
            return uIState.copy(z, z2);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final boolean component2() {
            return this.isErrorDigitCode;
        }

        @C12579k
        public final UIState copy(boolean z, boolean z2) {
            return new UIState(z, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) obj;
            return this.isLoading == uIState.isLoading && this.isErrorDigitCode == uIState.isErrorDigitCode;
        }

        public int hashCode() {
            boolean z = this.isLoading;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.isErrorDigitCode;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public final boolean isErrorDigitCode() {
            return this.isErrorDigitCode;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.isLoading;
            boolean z2 = this.isErrorDigitCode;
            return "UIState(isLoading=" + z + ", isErrorDigitCode=" + z2 + ")";
        }

        public UIState(boolean z, boolean z2) {
            this.isLoading = z;
            this.isErrorDigitCode = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "ErrorValidateOtp", "NavigateToCreateSecretCode", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent$ErrorValidateOtp;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent$NavigateToCreateSecretCode;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent$ErrorValidateOtp;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ErrorValidateOtp implements UiEvent {
            @C12579k
            private final Throwable throwable;

            public ErrorValidateOtp(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.throwable = th;
            }

            public static /* synthetic */ ErrorValidateOtp copy$default(ErrorValidateOtp errorValidateOtp, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = errorValidateOtp.throwable;
                }
                return errorValidateOtp.copy(th);
            }

            @C12579k
            public final Throwable component1() {
                return this.throwable;
            }

            @C12579k
            public final ErrorValidateOtp copy(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new ErrorValidateOtp(th);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorValidateOtp) && Intrinsics.areEqual((Object) this.throwable, (Object) ((ErrorValidateOtp) obj).throwable);
            }

            @C12579k
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.throwable;
                return "ErrorValidateOtp(throwable=" + th + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent$NavigateToCreateSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent;", "otpCode", "", "loyaltyCard", "(Ljava/lang/String;Ljava/lang/String;)V", "getLoyaltyCard", "()Ljava/lang/String;", "getOtpCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class NavigateToCreateSecretCode implements UiEvent {
            @C12579k
            private final String loyaltyCard;
            @C12580l
            private final String otpCode;

            public NavigateToCreateSecretCode(@C12580l String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str2, "loyaltyCard");
                this.otpCode = str;
                this.loyaltyCard = str2;
            }

            public static /* synthetic */ NavigateToCreateSecretCode copy$default(NavigateToCreateSecretCode navigateToCreateSecretCode, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = navigateToCreateSecretCode.otpCode;
                }
                if ((i & 2) != 0) {
                    str2 = navigateToCreateSecretCode.loyaltyCard;
                }
                return navigateToCreateSecretCode.copy(str, str2);
            }

            @C12580l
            public final String component1() {
                return this.otpCode;
            }

            @C12579k
            public final String component2() {
                return this.loyaltyCard;
            }

            @C12579k
            public final NavigateToCreateSecretCode copy(@C12580l String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str2, "loyaltyCard");
                return new NavigateToCreateSecretCode(str, str2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NavigateToCreateSecretCode)) {
                    return false;
                }
                NavigateToCreateSecretCode navigateToCreateSecretCode = (NavigateToCreateSecretCode) obj;
                return Intrinsics.areEqual((Object) this.otpCode, (Object) navigateToCreateSecretCode.otpCode) && Intrinsics.areEqual((Object) this.loyaltyCard, (Object) navigateToCreateSecretCode.loyaltyCard);
            }

            @C12579k
            public final String getLoyaltyCard() {
                return this.loyaltyCard;
            }

            @C12580l
            public final String getOtpCode() {
                return this.otpCode;
            }

            public int hashCode() {
                String str = this.otpCode;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.loyaltyCard.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.otpCode;
                String str2 = this.loyaltyCard;
                return "NavigateToCreateSecretCode(otpCode=" + str + ", loyaltyCard=" + str2 + ")";
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "CheckDigitNumber", "ValidationOtpCode", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction$CheckDigitNumber;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction$ValidationOtpCode;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction$CheckDigitNumber;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction;", "digitNumber", "", "(Ljava/lang/String;)V", "getDigitNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class CheckDigitNumber implements UserAction {
            @C12579k
            private final String digitNumber;

            public CheckDigitNumber(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "digitNumber");
                this.digitNumber = str;
            }

            public static /* synthetic */ CheckDigitNumber copy$default(CheckDigitNumber checkDigitNumber, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checkDigitNumber.digitNumber;
                }
                return checkDigitNumber.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.digitNumber;
            }

            @C12579k
            public final CheckDigitNumber copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "digitNumber");
                return new CheckDigitNumber(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckDigitNumber) && Intrinsics.areEqual((Object) this.digitNumber, (Object) ((CheckDigitNumber) obj).digitNumber);
            }

            @C12579k
            public final String getDigitNumber() {
                return this.digitNumber;
            }

            public int hashCode() {
                return this.digitNumber.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.digitNumber;
                return "CheckDigitNumber(digitNumber=" + str + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction$ValidationOtpCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction;", "otpCode", "", "loyaltyCardNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getLoyaltyCardNumber", "()Ljava/lang/String;", "getOtpCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ValidationOtpCode implements UserAction {
            @C12579k
            private final String loyaltyCardNumber;
            @C12579k
            private final String otpCode;

            public ValidationOtpCode(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "otpCode");
                Intrinsics.checkNotNullParameter(str2, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                this.otpCode = str;
                this.loyaltyCardNumber = str2;
            }

            public static /* synthetic */ ValidationOtpCode copy$default(ValidationOtpCode validationOtpCode, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = validationOtpCode.otpCode;
                }
                if ((i & 2) != 0) {
                    str2 = validationOtpCode.loyaltyCardNumber;
                }
                return validationOtpCode.copy(str, str2);
            }

            @C12579k
            public final String component1() {
                return this.otpCode;
            }

            @C12579k
            public final String component2() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final ValidationOtpCode copy(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "otpCode");
                Intrinsics.checkNotNullParameter(str2, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                return new ValidationOtpCode(str, str2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ValidationOtpCode)) {
                    return false;
                }
                ValidationOtpCode validationOtpCode = (ValidationOtpCode) obj;
                return Intrinsics.areEqual((Object) this.otpCode, (Object) validationOtpCode.otpCode) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) validationOtpCode.loyaltyCardNumber);
            }

            @C12579k
            public final String getLoyaltyCardNumber() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final String getOtpCode() {
                return this.otpCode;
            }

            public int hashCode() {
                return (this.otpCode.hashCode() * 31) + this.loyaltyCardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.otpCode;
                String str2 = this.loyaltyCardNumber;
                return "ValidationOtpCode(otpCode=" + str + ", loyaltyCardNumber=" + str2 + ")";
            }
        }
    }

    private ValidateOtp() {
    }
}
