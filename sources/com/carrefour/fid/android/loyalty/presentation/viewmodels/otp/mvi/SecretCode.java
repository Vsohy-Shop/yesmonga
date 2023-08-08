package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi;

import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode;", "", "Lcom/carrefour/fid/android/shared/base/u$c;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState;", "reducer", "Lcom/carrefour/fid/android/shared/base/u$c;", "getReducer", "()Lcom/carrefour/fid/android/shared/base/u$c;", "<init>", "()V", "PartialState", "UIState", "UiEvent", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class SecretCode {
    @C12579k
    public static final SecretCode INSTANCE = new SecretCode();
    @C12579k
    private static final C28505u.C28508c<UIState, PartialState> reducer = new C38301b();

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "Loading", "PushDigitFieldError", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState$Loading;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState$PushDigitFieldError;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface PartialState extends C28505u.C28509d {

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class DefaultImpls {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public static C28505u.C28509d reset(@C12579k PartialState partialState) {
                return C28505u.C28509d.C28510a.m118428a(partialState);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState$Loading;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState;", "isLoading", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Loading implements PartialState {
            private final boolean isLoading;

            public Loading(boolean z) {
                this.isLoading = z;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = loading.isLoading;
                }
                return loading.copy(z);
            }

            public final boolean component1() {
                return this.isLoading;
            }

            @C12579k
            public final Loading copy(boolean z) {
                return new Loading(z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && this.isLoading == ((Loading) obj).isLoading;
            }

            public int hashCode() {
                boolean z = this.isLoading;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.isLoading;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.isLoading;
                return "Loading(isLoading=" + z + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState$PushDigitFieldError;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState;", "isErrorDigitCode", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class PushDigitFieldError implements PartialState {
            private final boolean isErrorDigitCode;

            public PushDigitFieldError(boolean z) {
                this.isErrorDigitCode = z;
            }

            public static /* synthetic */ PushDigitFieldError copy$default(PushDigitFieldError pushDigitFieldError, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = pushDigitFieldError.isErrorDigitCode;
                }
                return pushDigitFieldError.copy(z);
            }

            public final boolean component1() {
                return this.isErrorDigitCode;
            }

            @C12579k
            public final PushDigitFieldError copy(boolean z) {
                return new PushDigitFieldError(z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PushDigitFieldError) && this.isErrorDigitCode == ((PushDigitFieldError) obj).isErrorDigitCode;
            }

            public int hashCode() {
                boolean z = this.isErrorDigitCode;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isErrorDigitCode() {
                return this.isErrorDigitCode;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.isErrorDigitCode;
                return "PushDigitFieldError(isErrorDigitCode=" + z + ")";
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "component2", "isLoading", "isErrorDigitCode", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "<init>", "(ZZ)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
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

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "ErrorUpdateSecretCode", "ShowNextDestination", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent$ErrorUpdateSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent$ShowNextDestination;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent$ErrorUpdateSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ErrorUpdateSecretCode implements UiEvent {
            @C12579k
            private final Throwable throwable;

            public ErrorUpdateSecretCode(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.throwable = th;
            }

            public static /* synthetic */ ErrorUpdateSecretCode copy$default(ErrorUpdateSecretCode errorUpdateSecretCode, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = errorUpdateSecretCode.throwable;
                }
                return errorUpdateSecretCode.copy(th);
            }

            @C12579k
            public final Throwable component1() {
                return this.throwable;
            }

            @C12579k
            public final ErrorUpdateSecretCode copy(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new ErrorUpdateSecretCode(th);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorUpdateSecretCode) && Intrinsics.areEqual((Object) this.throwable, (Object) ((ErrorUpdateSecretCode) obj).throwable);
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
                return "ErrorUpdateSecretCode(throwable=" + th + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent$ShowNextDestination;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent;", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ShowNextDestination implements UiEvent {
            @C12579k
            public static final ShowNextDestination INSTANCE = new ShowNextDestination();

            private ShowNextDestination() {
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "CheckDigitNumber", "UpdateSecretCode", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction$CheckDigitNumber;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction$UpdateSecretCode;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction$CheckDigitNumber;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction;", "digitNumber", "", "(Ljava/lang/String;)V", "getDigitNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
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

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction$UpdateSecretCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction;", "otpCode", "", "secretCode", "loyaltyCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoyaltyCard", "()Ljava/lang/String;", "getOtpCode", "getSecretCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class UpdateSecretCode implements UserAction {
            @C12579k
            private final String loyaltyCard;
            @C12579k
            private final String otpCode;
            @C12579k
            private final String secretCode;

            public UpdateSecretCode(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "otpCode");
                Intrinsics.checkNotNullParameter(str2, "secretCode");
                Intrinsics.checkNotNullParameter(str3, "loyaltyCard");
                this.otpCode = str;
                this.secretCode = str2;
                this.loyaltyCard = str3;
            }

            public static /* synthetic */ UpdateSecretCode copy$default(UpdateSecretCode updateSecretCode, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateSecretCode.otpCode;
                }
                if ((i & 2) != 0) {
                    str2 = updateSecretCode.secretCode;
                }
                if ((i & 4) != 0) {
                    str3 = updateSecretCode.loyaltyCard;
                }
                return updateSecretCode.copy(str, str2, str3);
            }

            @C12579k
            public final String component1() {
                return this.otpCode;
            }

            @C12579k
            public final String component2() {
                return this.secretCode;
            }

            @C12579k
            public final String component3() {
                return this.loyaltyCard;
            }

            @C12579k
            public final UpdateSecretCode copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "otpCode");
                Intrinsics.checkNotNullParameter(str2, "secretCode");
                Intrinsics.checkNotNullParameter(str3, "loyaltyCard");
                return new UpdateSecretCode(str, str2, str3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateSecretCode)) {
                    return false;
                }
                UpdateSecretCode updateSecretCode = (UpdateSecretCode) obj;
                return Intrinsics.areEqual((Object) this.otpCode, (Object) updateSecretCode.otpCode) && Intrinsics.areEqual((Object) this.secretCode, (Object) updateSecretCode.secretCode) && Intrinsics.areEqual((Object) this.loyaltyCard, (Object) updateSecretCode.loyaltyCard);
            }

            @C12579k
            public final String getLoyaltyCard() {
                return this.loyaltyCard;
            }

            @C12579k
            public final String getOtpCode() {
                return this.otpCode;
            }

            @C12579k
            public final String getSecretCode() {
                return this.secretCode;
            }

            public int hashCode() {
                return (((this.otpCode.hashCode() * 31) + this.secretCode.hashCode()) * 31) + this.loyaltyCard.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.otpCode;
                String str2 = this.secretCode;
                String str3 = this.loyaltyCard;
                return "UpdateSecretCode(otpCode=" + str + ", secretCode=" + str2 + ", loyaltyCard=" + str3 + ")";
            }
        }
    }

    private SecretCode() {
    }

    /* access modifiers changed from: private */
    public static final UIState reducer$lambda$0(UIState uIState, PartialState partialState) {
        Intrinsics.checkNotNullParameter(uIState, "state");
        Intrinsics.checkNotNullParameter(partialState, "partialState");
        if (partialState instanceof PartialState.PushDigitFieldError) {
            return uIState.copy(false, ((PartialState.PushDigitFieldError) partialState).isErrorDigitCode());
        }
        if (partialState instanceof PartialState.Loading) {
            return UIState.copy$default(uIState, ((PartialState.Loading) partialState).isLoading(), false, 2, (Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    public final C28505u.C28508c<UIState, PartialState> getReducer() {
        return reducer;
    }
}
