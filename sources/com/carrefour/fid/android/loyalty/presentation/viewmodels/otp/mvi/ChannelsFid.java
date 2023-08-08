package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi;

import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid;", "", "Lcom/carrefour/fid/android/shared/base/u$c;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState;", "reducer", "Lcom/carrefour/fid/android/shared/base/u$c;", "getReducer", "()Lcom/carrefour/fid/android/shared/base/u$c;", "<init>", "()V", "PartialState", "UIState", "UiEvent", "UserAction", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ChannelsFid {
    @C12579k
    public static final ChannelsFid INSTANCE = new ChannelsFid();
    @C12579k
    private static final C28505u.C28508c<UIState, PartialState> reducer = new C38300a();

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "Loading", "UserChannels", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState$Loading;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState$UserChannels;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface PartialState extends C28505u.C28509d {

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class DefaultImpls {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public static C28505u.C28509d reset(@C12579k PartialState partialState) {
                return C28505u.C28509d.C28510a.m118428a(partialState);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState$Loading;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState;", "isLoading", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Loading implements PartialState {
            private final boolean isLoading;

            public Loading() {
                this(false, 1, (DefaultConstructorMarker) null);
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

            public Loading(boolean z) {
                this.isLoading = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Loading(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState$UserChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState;", "isLoading", "", "isEmptyChannels", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class UserChannels implements PartialState {
            private final boolean isEmptyChannels;
            private final boolean isLoading;

            public UserChannels() {
                this(false, false, 3, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ UserChannels copy$default(UserChannels userChannels, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = userChannels.isLoading;
                }
                if ((i & 2) != 0) {
                    z2 = userChannels.isEmptyChannels;
                }
                return userChannels.copy(z, z2);
            }

            public final boolean component1() {
                return this.isLoading;
            }

            public final boolean component2() {
                return this.isEmptyChannels;
            }

            @C12579k
            public final UserChannels copy(boolean z, boolean z2) {
                return new UserChannels(z, z2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserChannels)) {
                    return false;
                }
                UserChannels userChannels = (UserChannels) obj;
                return this.isLoading == userChannels.isLoading && this.isEmptyChannels == userChannels.isEmptyChannels;
            }

            public int hashCode() {
                boolean z = this.isLoading;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.isEmptyChannels;
                if (!z3) {
                    z2 = z3;
                }
                return i + (z2 ? 1 : 0);
            }

            public final boolean isEmptyChannels() {
                return this.isEmptyChannels;
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
                boolean z2 = this.isEmptyChannels;
                return "UserChannels(isLoading=" + z + ", isEmptyChannels=" + z2 + ")";
            }

            public UserChannels(boolean z, boolean z2) {
                this.isLoading = z;
                this.isEmptyChannels = z2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ UserChannels(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "component2", "isLoading", "isEmptyChannels", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "()Z", "<init>", "(ZZ)V", "Companion", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class UIState implements C28505u.C28509d {
        @C12579k
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        @C12579k
        public static final UIState initialState = new UIState(false, false, 3, (DefaultConstructorMarker) null);
        private final boolean isEmptyChannels;
        private final boolean isLoading;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState$Companion;", "", "()V", "initialState", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState;", "getInitialState", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            public final UIState getInitialState() {
                return UIState.initialState;
            }

            private Companion() {
            }
        }

        public UIState() {
            this(false, false, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uIState.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = uIState.isEmptyChannels;
            }
            return uIState.copy(z, z2);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final boolean component2() {
            return this.isEmptyChannels;
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
            return this.isLoading == uIState.isLoading && this.isEmptyChannels == uIState.isEmptyChannels;
        }

        public int hashCode() {
            boolean z = this.isLoading;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.isEmptyChannels;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public final boolean isEmptyChannels() {
            return this.isEmptyChannels;
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
            boolean z2 = this.isEmptyChannels;
            return "UIState(isLoading=" + z + ", isEmptyChannels=" + z2 + ")";
        }

        public UIState(boolean z, boolean z2) {
            this.isLoading = z;
            this.isEmptyChannels = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "ErrorChannelsFid", "ShowChannelEmail", "ShowChannelSms", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent$ErrorChannelsFid;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent$ShowChannelEmail;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent$ShowChannelSms;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent$ErrorChannelsFid;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ErrorChannelsFid implements UiEvent {
            @C12579k
            private final Throwable throwable;

            public ErrorChannelsFid(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.throwable = th;
            }

            public static /* synthetic */ ErrorChannelsFid copy$default(ErrorChannelsFid errorChannelsFid, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = errorChannelsFid.throwable;
                }
                return errorChannelsFid.copy(th);
            }

            @C12579k
            public final Throwable component1() {
                return this.throwable;
            }

            @C12579k
            public final ErrorChannelsFid copy(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new ErrorChannelsFid(th);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorChannelsFid) && Intrinsics.areEqual((Object) this.throwable, (Object) ((ErrorChannelsFid) obj).throwable);
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
                return "ErrorChannelsFid(throwable=" + th + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent$ShowChannelEmail;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent;", "channelEmail", "Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "loyaltyCardNumber", "", "(Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;Ljava/lang/String;)V", "getChannelEmail", "()Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "getLoyaltyCardNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ShowChannelEmail implements UiEvent {
            @C12579k
            private final UserChannelsMediaModel channelEmail;
            @C12579k
            private final String loyaltyCardNumber;

            public ShowChannelEmail(@C12579k UserChannelsMediaModel userChannelsMediaModel, @C12579k String str) {
                Intrinsics.checkNotNullParameter(userChannelsMediaModel, "channelEmail");
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                this.channelEmail = userChannelsMediaModel;
                this.loyaltyCardNumber = str;
            }

            public static /* synthetic */ ShowChannelEmail copy$default(ShowChannelEmail showChannelEmail, UserChannelsMediaModel userChannelsMediaModel, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    userChannelsMediaModel = showChannelEmail.channelEmail;
                }
                if ((i & 2) != 0) {
                    str = showChannelEmail.loyaltyCardNumber;
                }
                return showChannelEmail.copy(userChannelsMediaModel, str);
            }

            @C12579k
            public final UserChannelsMediaModel component1() {
                return this.channelEmail;
            }

            @C12579k
            public final String component2() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final ShowChannelEmail copy(@C12579k UserChannelsMediaModel userChannelsMediaModel, @C12579k String str) {
                Intrinsics.checkNotNullParameter(userChannelsMediaModel, "channelEmail");
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                return new ShowChannelEmail(userChannelsMediaModel, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowChannelEmail)) {
                    return false;
                }
                ShowChannelEmail showChannelEmail = (ShowChannelEmail) obj;
                return Intrinsics.areEqual((Object) this.channelEmail, (Object) showChannelEmail.channelEmail) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) showChannelEmail.loyaltyCardNumber);
            }

            @C12579k
            public final UserChannelsMediaModel getChannelEmail() {
                return this.channelEmail;
            }

            @C12579k
            public final String getLoyaltyCardNumber() {
                return this.loyaltyCardNumber;
            }

            public int hashCode() {
                return (this.channelEmail.hashCode() * 31) + this.loyaltyCardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                UserChannelsMediaModel userChannelsMediaModel = this.channelEmail;
                String str = this.loyaltyCardNumber;
                return "ShowChannelEmail(channelEmail=" + userChannelsMediaModel + ", loyaltyCardNumber=" + str + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent$ShowChannelSms;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent;", "channelSms", "Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "loyaltyCardNumber", "", "(Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;Ljava/lang/String;)V", "getChannelSms", "()Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "getLoyaltyCardNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class ShowChannelSms implements UiEvent {
            @C12579k
            private final UserChannelsMediaModel channelSms;
            @C12579k
            private final String loyaltyCardNumber;

            public ShowChannelSms(@C12579k UserChannelsMediaModel userChannelsMediaModel, @C12579k String str) {
                Intrinsics.checkNotNullParameter(userChannelsMediaModel, "channelSms");
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                this.channelSms = userChannelsMediaModel;
                this.loyaltyCardNumber = str;
            }

            public static /* synthetic */ ShowChannelSms copy$default(ShowChannelSms showChannelSms, UserChannelsMediaModel userChannelsMediaModel, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    userChannelsMediaModel = showChannelSms.channelSms;
                }
                if ((i & 2) != 0) {
                    str = showChannelSms.loyaltyCardNumber;
                }
                return showChannelSms.copy(userChannelsMediaModel, str);
            }

            @C12579k
            public final UserChannelsMediaModel component1() {
                return this.channelSms;
            }

            @C12579k
            public final String component2() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final ShowChannelSms copy(@C12579k UserChannelsMediaModel userChannelsMediaModel, @C12579k String str) {
                Intrinsics.checkNotNullParameter(userChannelsMediaModel, "channelSms");
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                return new ShowChannelSms(userChannelsMediaModel, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowChannelSms)) {
                    return false;
                }
                ShowChannelSms showChannelSms = (ShowChannelSms) obj;
                return Intrinsics.areEqual((Object) this.channelSms, (Object) showChannelSms.channelSms) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) showChannelSms.loyaltyCardNumber);
            }

            @C12579k
            public final UserChannelsMediaModel getChannelSms() {
                return this.channelSms;
            }

            @C12579k
            public final String getLoyaltyCardNumber() {
                return this.loyaltyCardNumber;
            }

            public int hashCode() {
                return (this.channelSms.hashCode() * 31) + this.loyaltyCardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                UserChannelsMediaModel userChannelsMediaModel = this.channelSms;
                String str = this.loyaltyCardNumber;
                return "ShowChannelSms(channelSms=" + userChannelsMediaModel + ", loyaltyCardNumber=" + str + ")";
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "FetchUserChannels", "GetOtpCode", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction$FetchUserChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction$GetOtpCode;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction$FetchUserChannels;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction;", "loyaltyCardNumber", "", "(Ljava/lang/String;)V", "getLoyaltyCardNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class FetchUserChannels implements UserAction {
            @C12579k
            private final String loyaltyCardNumber;

            public FetchUserChannels(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                this.loyaltyCardNumber = str;
            }

            public static /* synthetic */ FetchUserChannels copy$default(FetchUserChannels fetchUserChannels, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetchUserChannels.loyaltyCardNumber;
                }
                return fetchUserChannels.copy(str);
            }

            @C12579k
            public final String component1() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final FetchUserChannels copy(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                return new FetchUserChannels(str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchUserChannels) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) ((FetchUserChannels) obj).loyaltyCardNumber);
            }

            @C12579k
            public final String getLoyaltyCardNumber() {
                return this.loyaltyCardNumber;
            }

            public int hashCode() {
                return this.loyaltyCardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.loyaltyCardNumber;
                return "FetchUserChannels(loyaltyCardNumber=" + str + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction$GetOtpCode;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction;", "channelId", "", "loyaltyCardNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getLoyaltyCardNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class GetOtpCode implements UserAction {
            @C12579k
            private final String channelId;
            @C12579k
            private final String loyaltyCardNumber;

            public GetOtpCode(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "channelId");
                Intrinsics.checkNotNullParameter(str2, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                this.channelId = str;
                this.loyaltyCardNumber = str2;
            }

            public static /* synthetic */ GetOtpCode copy$default(GetOtpCode getOtpCode, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = getOtpCode.channelId;
                }
                if ((i & 2) != 0) {
                    str2 = getOtpCode.loyaltyCardNumber;
                }
                return getOtpCode.copy(str, str2);
            }

            @C12579k
            public final String component1() {
                return this.channelId;
            }

            @C12579k
            public final String component2() {
                return this.loyaltyCardNumber;
            }

            @C12579k
            public final GetOtpCode copy(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "channelId");
                Intrinsics.checkNotNullParameter(str2, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
                return new GetOtpCode(str, str2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GetOtpCode)) {
                    return false;
                }
                GetOtpCode getOtpCode = (GetOtpCode) obj;
                return Intrinsics.areEqual((Object) this.channelId, (Object) getOtpCode.channelId) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) getOtpCode.loyaltyCardNumber);
            }

            @C12579k
            public final String getChannelId() {
                return this.channelId;
            }

            @C12579k
            public final String getLoyaltyCardNumber() {
                return this.loyaltyCardNumber;
            }

            public int hashCode() {
                return (this.channelId.hashCode() * 31) + this.loyaltyCardNumber.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.channelId;
                String str2 = this.loyaltyCardNumber;
                return "GetOtpCode(channelId=" + str + ", loyaltyCardNumber=" + str2 + ")";
            }
        }
    }

    private ChannelsFid() {
    }

    /* access modifiers changed from: private */
    public static final UIState reducer$lambda$0(UIState uIState, PartialState partialState) {
        Intrinsics.checkNotNullParameter(uIState, "state");
        Intrinsics.checkNotNullParameter(partialState, "partialState");
        if (partialState instanceof PartialState.Loading) {
            return UIState.copy$default(uIState, ((PartialState.Loading) partialState).isLoading(), false, 2, (Object) null);
        }
        if (partialState instanceof PartialState.UserChannels) {
            PartialState.UserChannels userChannels = (PartialState.UserChannels) partialState;
            return uIState.copy(userChannels.isLoading(), userChannels.isEmptyChannels());
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    public final C28505u.C28508c<UIState, PartialState> getReducer() {
        return reducer;
    }
}
