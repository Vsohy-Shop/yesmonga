package com.carrefour.fid.android.consent.presentation.viewmodels;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.consent.C36099R;
import com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.extension.C28767m;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.p046io.ResponseThrowable;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J+\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u001b\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/ConfigureConsentOptinsViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UIState;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;", "Lkotlin/d2;", "fetchNotCompletedConsents", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "handleBackClick", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "refusedOrMissingConsents", "handleRefusedOrMissingConsentsResult", "", "isCarrefourPersonalizedAdsAccepted", "isPartnerPersonalizedAdsAccepted", "saveConsents", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "determineEventLabel", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "eventAction", "eventLabel", "trackConsent", "", "errorEvent", "", "getErrorMessageRes", "intent", "processIntent", "(Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentOptinsMVI$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "getRefusedAndMissingConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "updateConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticsDispatcher", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/consent/b;Lcom/carrefour/fid/android/domain/interactors/consent/c;Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nConfigureConsentOptinsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigureConsentOptinsViewModel.kt\ncom/carrefour/fid/android/consent/presentation/viewmodels/ConfigureConsentOptinsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n288#2,2:162\n288#2,2:164\n1#3:166\n*S KotlinDebug\n*F\n+ 1 ConfigureConsentOptinsViewModel.kt\ncom/carrefour/fid/android/consent/presentation/viewmodels/ConfigureConsentOptinsViewModel\n*L\n73#1:162,2\n75#1:164,2\n*E\n"})
public final class ConfigureConsentOptinsViewModel extends BaseMVIViewModel<ConsentOptinsMVI.UIState, ConsentOptinsMVI.UserAction> {
    @C12579k
    private final C13783a analyticsDispatcher;
    @C12579k
    private final C37630b getRefusedAndMissingConsentsUseCase;
    @C12579k
    private final C37631c updateConsentsUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ConfigureConsentOptinsViewModel(@C12579k C37630b bVar, @C12579k C37631c cVar, @C12579k C13783a aVar) {
        super(new ConsentOptinsMVI.UIState(false, false, false, false, false, (Integer) null, 63, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(bVar, "getRefusedAndMissingConsentsUseCase");
        Intrinsics.checkNotNullParameter(cVar, "updateConsentsUseCase");
        Intrinsics.checkNotNullParameter(aVar, "analyticsDispatcher");
        this.getRefusedAndMissingConsentsUseCase = bVar;
        this.updateConsentsUseCase = cVar;
        this.analyticsDispatcher = aVar;
    }

    private final String determineEventLabel(Boolean bool, Boolean bool2) {
        StringBuilder sb = new StringBuilder();
        if (bool != null) {
            int a = C28767m.m119074a(bool.booleanValue());
            sb.append("dv1-" + a + "-");
        }
        if (bool2 != null) {
            int a2 = C28767m.m119074a(bool2.booleanValue());
            sb.append("dv2-" + a2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "eventLabelBuilder.toString()");
        return StringsKt__StringsKt.removeSuffix(sb2, (CharSequence) "-");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchNotCompletedConsents(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$fetchNotCompletedConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$fetchNotCompletedConsents$1 r0 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$fetchNotCompletedConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$fetchNotCompletedConsents$1 r0 = new com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$fetchNotCompletedConsents$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel r0 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0063
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003b:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.shared.base.u$d r14 = r13.getCurrentState()
            r4 = r14
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UIState r4 = (com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 47
            r12 = 0
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UIState r14 = com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.publishState(r14)
            com.carrefour.fid.android.domain.interactors.consent.b r14 = r13.getRefusedAndMissingConsentsUseCase
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r0 = r13
        L_0x0063:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r14)
            if (r1 != 0) goto L_0x006f
            java.util.List r14 = (java.util.List) r14
            r0.handleRefusedOrMissingConsentsResult(r14)
            goto L_0x009e
        L_0x006f:
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r14 = r1.getMessage()
            if (r14 != 0) goto L_0x0079
            java.lang.String r14 = ""
        L_0x0079:
            r3 = r14
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.shared.base.u$d r14 = r0.getCurrentState()
            r2 = r14
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UIState r2 = (com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState) r2
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            int r14 = r0.getErrorMessageRes(r1)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r14)
            r9 = 15
            r10 = 0
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UIState r14 = com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.publishState(r14)
        L_0x009e:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel.fetchNotCompletedConsents(kotlin.coroutines.c):java.lang.Object");
    }

    private final int getErrorMessageRes(Throwable th) {
        if (th instanceof NetWorkResponseThrowable) {
            return C36099R.string.general_error_no_network_message;
        }
        if (th instanceof ResponseThrowable) {
            return C36099R.string.general_error_server_not_responding_message;
        }
        return C36099R.string.general_error_parameters_server_not_responding_01;
    }

    private final void handleBackClick() {
        trackConsent$default(this, C28526d.f68932i2, (String) null, 2, (Object) null);
        emitEvent(new ConsentOptinsMVI.UiEvent.CloseScreen(true));
    }

    private final void handleRefusedOrMissingConsentsResult(List<ConsentOptIn> list) {
        ChoiceOptIn choiceOptIn;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        ChoiceOptIn choiceOptIn2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Iterable T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        Iterator it = T5.iterator();
        while (true) {
            choiceOptIn = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ConsentOptIn) obj).mo117326h() == ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING) {
                z6 = true;
                continue;
            } else {
                z6 = false;
                continue;
            }
            if (z6) {
                break;
            }
        }
        ConsentOptIn consentOptIn = (ConsentOptIn) obj;
        Iterator it2 = T5.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((ConsentOptIn) obj2).mo117326h() == ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING) {
                z5 = true;
                continue;
            } else {
                z5 = false;
                continue;
            }
            if (z5) {
                break;
            }
        }
        ConsentOptIn consentOptIn2 = (ConsentOptIn) obj2;
        ConsentOptinsMVI.UIState uIState = (ConsentOptinsMVI.UIState) getCurrentState();
        if (consentOptIn != null) {
            z = true;
        } else {
            z = false;
        }
        if (consentOptIn2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (consentOptIn != null) {
            choiceOptIn2 = consentOptIn.mo117324f();
        } else {
            choiceOptIn2 = null;
        }
        ChoiceOptIn choiceOptIn3 = ChoiceOptIn.REFUSED;
        if (choiceOptIn2 == choiceOptIn3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (consentOptIn2 != null) {
            choiceOptIn = consentOptIn2.mo117324f();
        }
        if (choiceOptIn == choiceOptIn3) {
            z4 = true;
        } else {
            z4 = false;
        }
        publishState(ConsentOptinsMVI.UIState.copy$default(uIState, z, z2, z3, z4, false, (Integer) null, 32, (Object) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object saveConsents(java.lang.Boolean r14, java.lang.Boolean r15, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r16) {
        /*
            r13 = this;
            r0 = r13
            r1 = r16
            boolean r2 = r1 instanceof com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$saveConsents$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$saveConsents$1 r2 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$saveConsents$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$saveConsents$1 r2 = new com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel$saveConsents$1
            r2.<init>(r13, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003f
            if (r4 != r6) goto L_0x0037
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel r2 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00a6
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            kotlin.C11661u0.m45747n(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r14 == 0) goto L_0x0061
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r4 = new com.carrefour.fid.android.domain.models.consent.ConsentOptIn
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn$a r7 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.f95635a
            boolean r9 = r14.booleanValue()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r9 = r7.mo117316a(r9)
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r4)
        L_0x0061:
            if (r15 == 0) goto L_0x007b
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r4 = new com.carrefour.fid.android.domain.models.consent.ConsentOptIn
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn$a r7 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.f95635a
            boolean r9 = r15.booleanValue()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r9 = r7.mo117316a(r9)
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r4)
        L_0x007b:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x008a
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UiEvent$CloseScreen r1 = new com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UiEvent$CloseScreen
            r1.<init>(r5)
            r13.emitEvent(r1)
            goto L_0x00eb
        L_0x008a:
            java.lang.String r4 = r13.determineEventLabel(r14, r15)
            java.lang.String r7 = "popin-configuration-sauvegarder"
            r13.trackConsent(r7, r4)
            com.carrefour.fid.android.domain.interactors.consent.c r4 = r0.updateConsentsUseCase
            com.carrefour.fid.android.domain.interactors.consent.c$a r7 = new com.carrefour.fid.android.domain.interactors.consent.c$a
            r7.<init>(r1)
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r4.m172966invokegIAlus(r7, r2)
            if (r1 != r3) goto L_0x00a5
            return r3
        L_0x00a5:
            r2 = r0
        L_0x00a6:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x00b7
            r3 = r1
            kotlin.d2 r3 = (kotlin.C11079d2) r3
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UiEvent$CloseScreen r3 = new com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UiEvent$CloseScreen
            r3.<init>(r5)
            r2.emitEvent(r3)
        L_0x00b7:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x00eb
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto L_0x00c7
            java.lang.String r4 = ""
        L_0x00c7:
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.shared.base.u$d r3 = r2.getCurrentState()
            r4 = r3
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UIState r4 = (com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState) r4
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r1 = r2.getErrorMessageRes(r1)
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r1)
            r11 = 31
            r12 = 0
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI$UIState r1 = com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentOptinsMVI.UIState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.publishState(r1)
        L_0x00eb:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel.saveConsents(java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ Object saveConsents$default(ConfigureConsentOptinsViewModel configureConsentOptinsViewModel, Boolean bool, Boolean bool2, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        return configureConsentOptinsViewModel.saveConsents(bool, bool2, cVar);
    }

    private final void trackConsent(String str, String str2) {
        C13783a.m58668o(this.analyticsDispatcher, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "accueil"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68899b2), C11078d1.m42659a(C28526d.f68933j, str), C11078d1.m42659a(C28526d.f68937k, str2)), false, 2, (Object) null);
    }

    public static /* synthetic */ void trackConsent$default(ConfigureConsentOptinsViewModel configureConsentOptinsViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        configureConsentOptinsViewModel.trackConsent(str, str2);
    }

    @C12580l
    public Object processIntent(@C12579k ConsentOptinsMVI.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof ConsentOptinsMVI.UserAction.Init) {
            trackConsent$default(this, C28526d.f68924g2, (String) null, 2, (Object) null);
        } else if (userAction instanceof ConsentOptinsMVI.UserAction.SaveChoices) {
            ConsentOptinsMVI.UserAction.SaveChoices saveChoices = (ConsentOptinsMVI.UserAction.SaveChoices) userAction;
            Object saveConsents = saveConsents(saveChoices.isPersonalizedAdvertisementAccepted(), saveChoices.isPartnerPersonalizedAdvertisementAccepted(), cVar);
            return saveConsents == C11063b.m42612h() ? saveConsents : C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) userAction, (Object) ConsentOptinsMVI.UserAction.FetchRefusedAndMissingConsents.INSTANCE)) {
            Object fetchNotCompletedConsents = fetchNotCompletedConsents(cVar);
            return fetchNotCompletedConsents == C11063b.m42612h() ? fetchNotCompletedConsents : C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) userAction, (Object) ConsentOptinsMVI.UserAction.OnBackClicked.INSTANCE)) {
            handleBackClick();
        }
        return C11079d2.f28267a;
    }
}
