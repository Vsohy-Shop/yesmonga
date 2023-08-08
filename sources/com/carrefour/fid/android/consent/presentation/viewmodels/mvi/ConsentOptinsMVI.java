package com.carrefour.fid.android.consent.presentation.viewmodels.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI;", "", "()V", "UIState", "UiEvent", "UserAction", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ConsentOptinsMVI {
    @C12579k
    public static final ConsentOptinsMVI INSTANCE = new ConsentOptinsMVI();

    @C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJN\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000b\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\f\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\r\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\n¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UIState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Integer;", "isPersonalizedAdsOptinAvailable", "isSharingToPartnersOptinAvailable", "isPersonalizedAdsOptinRefused", "isSharingToPartnersOptinRefused", "isLoading", "errorMessageRes", "copy", "(ZZZZZLjava/lang/Integer;)Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UIState;", "", "toString", "hashCode", "", "other", "equals", "Z", "()Z", "Ljava/lang/Integer;", "getErrorMessageRes", "<init>", "(ZZZZZLjava/lang/Integer;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class UIState implements C28505u.C28509d {
        public static final int $stable = 0;
        @C12580l
        private final Integer errorMessageRes;
        private final boolean isLoading;
        private final boolean isPersonalizedAdsOptinAvailable;
        private final boolean isPersonalizedAdsOptinRefused;
        private final boolean isSharingToPartnersOptinAvailable;
        private final boolean isSharingToPartnersOptinRefused;

        public UIState() {
            this(false, false, false, false, false, (Integer) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ UIState copy$default(UIState uIState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uIState.isPersonalizedAdsOptinAvailable;
            }
            if ((i & 2) != 0) {
                z2 = uIState.isSharingToPartnersOptinAvailable;
            }
            boolean z6 = z2;
            if ((i & 4) != 0) {
                z3 = uIState.isPersonalizedAdsOptinRefused;
            }
            boolean z7 = z3;
            if ((i & 8) != 0) {
                z4 = uIState.isSharingToPartnersOptinRefused;
            }
            boolean z8 = z4;
            if ((i & 16) != 0) {
                z5 = uIState.isLoading;
            }
            boolean z9 = z5;
            if ((i & 32) != 0) {
                num = uIState.errorMessageRes;
            }
            return uIState.copy(z, z6, z7, z8, z9, num);
        }

        public final boolean component1() {
            return this.isPersonalizedAdsOptinAvailable;
        }

        public final boolean component2() {
            return this.isSharingToPartnersOptinAvailable;
        }

        public final boolean component3() {
            return this.isPersonalizedAdsOptinRefused;
        }

        public final boolean component4() {
            return this.isSharingToPartnersOptinRefused;
        }

        public final boolean component5() {
            return this.isLoading;
        }

        @C12580l
        public final Integer component6() {
            return this.errorMessageRes;
        }

        @C12579k
        public final UIState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @C12580l Integer num) {
            return new UIState(z, z2, z3, z4, z5, num);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) obj;
            return this.isPersonalizedAdsOptinAvailable == uIState.isPersonalizedAdsOptinAvailable && this.isSharingToPartnersOptinAvailable == uIState.isSharingToPartnersOptinAvailable && this.isPersonalizedAdsOptinRefused == uIState.isPersonalizedAdsOptinRefused && this.isSharingToPartnersOptinRefused == uIState.isSharingToPartnersOptinRefused && this.isLoading == uIState.isLoading && Intrinsics.areEqual((Object) this.errorMessageRes, (Object) uIState.errorMessageRes);
        }

        @C12580l
        public final Integer getErrorMessageRes() {
            return this.errorMessageRes;
        }

        public int hashCode() {
            boolean z = this.isPersonalizedAdsOptinAvailable;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.isSharingToPartnersOptinAvailable;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.isPersonalizedAdsOptinRefused;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.isSharingToPartnersOptinRefused;
            if (z5) {
                z5 = true;
            }
            int i4 = (i3 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.isLoading;
            if (!z6) {
                z2 = z6;
            }
            int i5 = (i4 + (z2 ? 1 : 0)) * 31;
            Integer num = this.errorMessageRes;
            return i5 + (num == null ? 0 : num.hashCode());
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isPersonalizedAdsOptinAvailable() {
            return this.isPersonalizedAdsOptinAvailable;
        }

        public final boolean isPersonalizedAdsOptinRefused() {
            return this.isPersonalizedAdsOptinRefused;
        }

        public final boolean isSharingToPartnersOptinAvailable() {
            return this.isSharingToPartnersOptinAvailable;
        }

        public final boolean isSharingToPartnersOptinRefused() {
            return this.isSharingToPartnersOptinRefused;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.isPersonalizedAdsOptinAvailable;
            boolean z2 = this.isSharingToPartnersOptinAvailable;
            boolean z3 = this.isPersonalizedAdsOptinRefused;
            boolean z4 = this.isSharingToPartnersOptinRefused;
            boolean z5 = this.isLoading;
            Integer num = this.errorMessageRes;
            return "UIState(isPersonalizedAdsOptinAvailable=" + z + ", isSharingToPartnersOptinAvailable=" + z2 + ", isPersonalizedAdsOptinRefused=" + z3 + ", isSharingToPartnersOptinRefused=" + z4 + ", isLoading=" + z5 + ", errorMessageRes=" + num + ")";
        }

        public UIState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @C12580l Integer num) {
            this.isPersonalizedAdsOptinAvailable = z;
            this.isSharingToPartnersOptinAvailable = z2;
            this.isPersonalizedAdsOptinRefused = z3;
            this.isSharingToPartnersOptinRefused = z4;
            this.isLoading = z5;
            this.errorMessageRes = num;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ UIState(boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, java.lang.Integer r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r11 & 16
                if (r5 == 0) goto L_0x0022
                goto L_0x0023
            L_0x0022:
                r0 = r9
            L_0x0023:
                r5 = r11 & 32
                if (r5 == 0) goto L_0x0028
                r10 = 0
            L_0x0028:
                r11 = r10
                r5 = r4
                r6 = r12
                r7 = r1
                r8 = r2
                r9 = r3
                r10 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState.<init>(boolean, boolean, boolean, boolean, boolean, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "<init>", "()V", "CloseScreen", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UiEvent$CloseScreen;", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static abstract class UiEvent implements C28505u.C28506a {
        public static final int $stable = 0;

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UiEvent$CloseScreen;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UiEvent;", "displayConsentBackDrop", "", "(Z)V", "getDisplayConsentBackDrop", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class CloseScreen extends UiEvent {
            public static final int $stable = 0;
            private final boolean displayConsentBackDrop;

            public CloseScreen() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ CloseScreen copy$default(CloseScreen closeScreen, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = closeScreen.displayConsentBackDrop;
                }
                return closeScreen.copy(z);
            }

            public final boolean component1() {
                return this.displayConsentBackDrop;
            }

            @C12579k
            public final CloseScreen copy(boolean z) {
                return new CloseScreen(z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseScreen) && this.displayConsentBackDrop == ((CloseScreen) obj).displayConsentBackDrop;
            }

            public final boolean getDisplayConsentBackDrop() {
                return this.displayConsentBackDrop;
            }

            public int hashCode() {
                boolean z = this.displayConsentBackDrop;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.displayConsentBackDrop;
                return "CloseScreen(displayConsentBackDrop=" + z + ")";
            }

            public CloseScreen(boolean z) {
                super((DefaultConstructorMarker) null);
                this.displayConsentBackDrop = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ CloseScreen(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        public /* synthetic */ UiEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UiEvent() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "<init>", "()V", "FetchRefusedAndMissingConsents", "Init", "OnBackClicked", "SaveChoices", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$FetchRefusedAndMissingConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$Init;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$OnBackClicked;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$SaveChoices;", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static abstract class UserAction implements C28505u.C28507b {
        public static final int $stable = 0;

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$FetchRefusedAndMissingConsents;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class FetchRefusedAndMissingConsents extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final FetchRefusedAndMissingConsents INSTANCE = new FetchRefusedAndMissingConsents();

            private FetchRefusedAndMissingConsents() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$Init;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class Init extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final Init INSTANCE = new Init();

            private Init() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$OnBackClicked;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;", "()V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class OnBackClicked extends UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final OnBackClicked INSTANCE = new OnBackClicked();

            private OnBackClicked() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$SaveChoices;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;", "isPersonalizedAdvertisementAccepted", "", "isPartnerPersonalizedAdvertisementAccepted", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction$SaveChoices;", "equals", "other", "", "hashCode", "", "toString", "", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class SaveChoices extends UserAction {
            public static final int $stable = 0;
            @C12580l
            private final Boolean isPartnerPersonalizedAdvertisementAccepted;
            @C12580l
            private final Boolean isPersonalizedAdvertisementAccepted;

            public SaveChoices() {
                this((Boolean) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ SaveChoices copy$default(SaveChoices saveChoices, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = saveChoices.isPersonalizedAdvertisementAccepted;
                }
                if ((i & 2) != 0) {
                    bool2 = saveChoices.isPartnerPersonalizedAdvertisementAccepted;
                }
                return saveChoices.copy(bool, bool2);
            }

            @C12580l
            public final Boolean component1() {
                return this.isPersonalizedAdvertisementAccepted;
            }

            @C12580l
            public final Boolean component2() {
                return this.isPartnerPersonalizedAdvertisementAccepted;
            }

            @C12579k
            public final SaveChoices copy(@C12580l Boolean bool, @C12580l Boolean bool2) {
                return new SaveChoices(bool, bool2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SaveChoices)) {
                    return false;
                }
                SaveChoices saveChoices = (SaveChoices) obj;
                return Intrinsics.areEqual((Object) this.isPersonalizedAdvertisementAccepted, (Object) saveChoices.isPersonalizedAdvertisementAccepted) && Intrinsics.areEqual((Object) this.isPartnerPersonalizedAdvertisementAccepted, (Object) saveChoices.isPartnerPersonalizedAdvertisementAccepted);
            }

            public int hashCode() {
                Boolean bool = this.isPersonalizedAdvertisementAccepted;
                int i = 0;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.isPartnerPersonalizedAdvertisementAccepted;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                return hashCode + i;
            }

            @C12580l
            public final Boolean isPartnerPersonalizedAdvertisementAccepted() {
                return this.isPartnerPersonalizedAdvertisementAccepted;
            }

            @C12580l
            public final Boolean isPersonalizedAdvertisementAccepted() {
                return this.isPersonalizedAdvertisementAccepted;
            }

            @C12579k
            public String toString() {
                Boolean bool = this.isPersonalizedAdvertisementAccepted;
                Boolean bool2 = this.isPartnerPersonalizedAdvertisementAccepted;
                return "SaveChoices(isPersonalizedAdvertisementAccepted=" + bool + ", isPartnerPersonalizedAdvertisementAccepted=" + bool2 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ SaveChoices(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }

            public SaveChoices(@C12580l Boolean bool, @C12580l Boolean bool2) {
                super((DefaultConstructorMarker) null);
                this.isPersonalizedAdvertisementAccepted = bool;
                this.isPartnerPersonalizedAdvertisementAccepted = bool2;
            }
        }

        public /* synthetic */ UserAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UserAction() {
        }
    }

    private ConsentOptinsMVI() {
    }
}
