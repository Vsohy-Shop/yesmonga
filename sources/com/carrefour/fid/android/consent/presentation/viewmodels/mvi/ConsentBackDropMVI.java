package com.carrefour.fid.android.consent.presentation.viewmodels.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI;", "", "()V", "UIState", "UiEvent", "UserAction", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ConsentBackDropMVI {
    @C12579k
    public static final ConsentBackDropMVI INSTANCE = new ConsentBackDropMVI();

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "component2", "displayCarrefourAdsContent", "displayPartnerAdsContent", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Z", "getDisplayCarrefourAdsContent", "()Z", "getDisplayPartnerAdsContent", "<init>", "(ZZ)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class UIState implements C28505u.C28509d {
        public static final int $stable = 0;
        private final boolean displayCarrefourAdsContent;
        private final boolean displayPartnerAdsContent;

        public UIState() {
            this(false, false, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uIState.displayCarrefourAdsContent;
            }
            if ((i & 2) != 0) {
                z2 = uIState.displayPartnerAdsContent;
            }
            return uIState.copy(z, z2);
        }

        public final boolean component1() {
            return this.displayCarrefourAdsContent;
        }

        public final boolean component2() {
            return this.displayPartnerAdsContent;
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
            return this.displayCarrefourAdsContent == uIState.displayCarrefourAdsContent && this.displayPartnerAdsContent == uIState.displayPartnerAdsContent;
        }

        public final boolean getDisplayCarrefourAdsContent() {
            return this.displayCarrefourAdsContent;
        }

        public final boolean getDisplayPartnerAdsContent() {
            return this.displayPartnerAdsContent;
        }

        public int hashCode() {
            boolean z = this.displayCarrefourAdsContent;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.displayPartnerAdsContent;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.displayCarrefourAdsContent;
            boolean z2 = this.displayPartnerAdsContent;
            return "UIState(displayCarrefourAdsContent=" + z + ", displayPartnerAdsContent=" + z2 + ")";
        }

        public UIState(boolean z, boolean z2) {
            this.displayCarrefourAdsContent = z;
            this.displayPartnerAdsContent = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UIState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "<init>", "()V", "DismissBackDrop", "OpenConfigureConsentPage", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent$DismissBackDrop;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent$OpenConfigureConsentPage;", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static abstract class UiEvent implements C28505u.C28506a {
        public static final int $stable = 0;

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent$DismissBackDrop;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class DismissBackDrop extends UiEvent {
            public static final int $stable = 0;
            @C12579k
            public static final DismissBackDrop INSTANCE = new DismissBackDrop();

            private DismissBackDrop() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent$OpenConfigureConsentPage;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UiEvent;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class OpenConfigureConsentPage extends UiEvent {
            public static final int $stable = 0;
            @C12579k
            public static final OpenConfigureConsentPage INSTANCE = new OpenConfigureConsentPage();

            private OpenConfigureConsentPage() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ UiEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UiEvent() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "<init>", "()V", "AcceptAllConsents", "ConfigureConsents", "FetchNotCompletedConsents", "SkipConsents", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$AcceptAllConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$ConfigureConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$FetchNotCompletedConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$SkipConsents;", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static abstract class UserAction implements C28505u.C28507b {
        public static final int $stable = 0;

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$AcceptAllConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class AcceptAllConsents extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final AcceptAllConsents INSTANCE = new AcceptAllConsents();

            private AcceptAllConsents() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$ConfigureConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class ConfigureConsents extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final ConfigureConsents INSTANCE = new ConfigureConsents();

            private ConfigureConsents() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$FetchNotCompletedConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class FetchNotCompletedConsents extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final FetchNotCompletedConsents INSTANCE = new FetchNotCompletedConsents();

            private FetchNotCompletedConsents() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction$SkipConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class SkipConsents extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final SkipConsents INSTANCE = new SkipConsents();

            private SkipConsents() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ UserAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UserAction() {
        }
    }

    private ConsentBackDropMVI() {
    }
}
