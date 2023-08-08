package com.carrefour.fid.android.consent.presentation.viewmodels;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.extension.C28767m;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b-\u0010.J\u0013\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0013\u0010\f\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\u0004H\u0002J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0002J(\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J7\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/presentation/viewmodels/ConsentBackDropViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UIState;", "Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;", "Lkotlin/d2;", "fetchNotCompletedConsents", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "userConsentModelList", "handleUserConsentListResult", "processSkipConsents", "processAcceptAll", "processConfigureConsents", "", "eventAction", "eventLabel", "trackConsent", "", "isCarrefourGroupSmsDisplayed", "isCarrefourGroupEmailDisplayed", "isCarrefourPersonalizedAdsDisplayed", "isPartnerPersonalizedAdsDisplayed", "determineDisplayEventLabel", "isCarrefourGroupSmsAccepted", "isCarrefourGroupEmailAccepted", "isCarrefourPersonalizedAdsAccepted", "isPartnerPersonalizedAdsAccepted", "determineEventLabel", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "intent", "processIntent", "(Lcom/carrefour/fid/android/consent/presentation/viewmodels/mvi/ConsentBackDropMVI$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "getRefusedAndMissingConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "updateConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticsDispatcher", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "Lcom/carrefour/fid/android/domain/models/consent/ConsentName;", "notCompletedConsents", "Ljava/util/List;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/consent/b;Lcom/carrefour/fid/android/domain/interactors/consent/c;Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nConsentBackDropViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentBackDropViewModel.kt\ncom/carrefour/fid/android/consent/presentation/viewmodels/ConsentBackDropViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n766#2:193\n857#2,2:194\n1549#2:196\n1620#2,3:197\n766#2:200\n857#2,2:201\n1747#2,3:204\n1747#2,3:207\n1747#2,3:210\n1747#2,3:213\n1747#2,3:216\n1747#2,3:219\n1747#2,3:222\n1747#2,3:225\n1549#2:228\n1620#2,3:229\n1#3:203\n*S KotlinDebug\n*F\n+ 1 ConsentBackDropViewModel.kt\ncom/carrefour/fid/android/consent/presentation/viewmodels/ConsentBackDropViewModel\n*L\n56#1:193\n56#1:194,2\n63#1:196\n63#1:197,3\n64#1:200\n64#1:201,2\n96#1:204,3\n97#1:207,3\n98#1:210,3\n99#1:213,3\n110#1:216,3\n111#1:219,3\n112#1:222,3\n113#1:225,3\n117#1:228\n117#1:229,3\n*E\n"})
public final class ConsentBackDropViewModel extends BaseMVIViewModel<ConsentBackDropMVI.UIState, ConsentBackDropMVI.UserAction> {
    @C12579k
    private final C13783a analyticsDispatcher;
    @C12579k
    private final C37630b getRefusedAndMissingConsentsUseCase;
    @C12579k
    private List<? extends ConsentName> notCompletedConsents = CollectionsKt__CollectionsKt.m40441E();
    @C12579k
    private final C37631c updateConsentsUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ConsentBackDropViewModel(@C12579k C37630b bVar, @C12579k C37631c cVar, @C12579k C13783a aVar) {
        super(new ConsentBackDropMVI.UIState(false, false, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(bVar, "getRefusedAndMissingConsentsUseCase");
        Intrinsics.checkNotNullParameter(cVar, "updateConsentsUseCase");
        Intrinsics.checkNotNullParameter(aVar, "analyticsDispatcher");
        this.getRefusedAndMissingConsentsUseCase = bVar;
        this.updateConsentsUseCase = cVar;
        this.analyticsDispatcher = aVar;
    }

    private final String determineDisplayEventLabel(boolean z, boolean z2, boolean z3, boolean z4) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("sms-");
        }
        if (z2) {
            sb.append("e-");
        }
        if (z3) {
            sb.append("dv1-");
        }
        if (z4) {
            sb.append("dv2");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "eventLabelBuilder.toString()");
        return StringsKt__StringsKt.removeSuffix(sb2, (CharSequence) "-");
    }

    private final String determineEventLabel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        StringBuilder sb = new StringBuilder();
        if (bool != null) {
            int a = C28767m.m119074a(bool.booleanValue());
            sb.append("sms-" + a + "-");
        }
        if (bool2 != null) {
            int a2 = C28767m.m119074a(bool2.booleanValue());
            sb.append("e-" + a2 + "-");
        }
        if (bool3 != null) {
            int a3 = C28767m.m119074a(bool3.booleanValue());
            sb.append("dv1-" + a3 + "-");
        }
        if (bool4 != null) {
            int a4 = C28767m.m119074a(bool4.booleanValue());
            sb.append("dv2-" + a4);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "eventLabelBuilder.toString()");
        return StringsKt__StringsKt.removeSuffix(sb2, (CharSequence) "-");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchNotCompletedConsents(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$fetchNotCompletedConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$fetchNotCompletedConsents$1 r0 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$fetchNotCompletedConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$fetchNotCompletedConsents$1 r0 = new com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$fetchNotCompletedConsents$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel r0 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel) r0
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003b:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.domain.interactors.consent.b r11 = r10.getRefusedAndMissingConsentsUseCase
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r11.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r10
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r11)
            if (r1 != 0) goto L_0x0082
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x005f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r11.next()
            r3 = r2
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r3 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r3
            java.util.List r4 = com.carrefour.fid.android.domain.models.consent.extension.C37997a.m156415a()
            com.carrefour.fid.android.domain.models.consent.ConsentName r3 = r3.mo117326h()
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x005f
            r1.add(r2)
            goto L_0x005f
        L_0x007e:
            r0.handleUserConsentListResult(r1)
            goto L_0x0099
        L_0x0082:
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r11 = r1.getMessage()
            if (r11 != 0) goto L_0x008c
            java.lang.String r11 = ""
        L_0x008c:
            r5 = r11
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI$UiEvent$DismissBackDrop r11 = com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI.UiEvent.DismissBackDrop.INSTANCE
            r0.emitEvent(r11)
        L_0x0099:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel.fetchNotCompletedConsents(kotlin.coroutines.c):java.lang.Object");
    }

    private final void handleUserConsentListResult(List<ConsentOptIn> list) {
        Iterable<ConsentOptIn> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (ConsentOptIn h : iterable) {
            arrayList.add(h.mo117326h());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (ConsentBackDropViewModelKt.CONSENT_BACKDROP_TYPES.contains((ConsentName) next)) {
                arrayList2.add(next);
            }
        }
        this.notCompletedConsents = arrayList2;
        boolean contains = arrayList2.contains(ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING);
        boolean contains2 = this.notCompletedConsents.contains(ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING);
        if (!this.notCompletedConsents.isEmpty()) {
            trackConsent(C28526d.f68904c2, determineDisplayEventLabel(this.notCompletedConsents.contains(ConsentName.OPTIN_CARREFOUR_SMS), this.notCompletedConsents.contains(ConsentName.OPTIN_CARREFOUR_EMAIL), contains, contains2));
            publishState(((ConsentBackDropMVI.UIState) getCurrentState()).copy(contains, contains2));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processAcceptAll(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$processAcceptAll$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$processAcceptAll$1 r0 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$processAcceptAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$processAcceptAll$1 r0 = new com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel$processAcceptAll$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel r0 = (com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel) r0
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0170
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003c:
            kotlin.C11661u0.m45747n(r12)
            java.util.List<? extends com.carrefour.fid.android.domain.models.consent.ConsentName> r12 = r11.notCompletedConsents
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x004a
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x004a:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            r12.booleanValue()
            java.util.List<? extends com.carrefour.fid.android.domain.models.consent.ConsentName> r2 = r11.notCompletedConsents
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L_0x0065
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0065
        L_0x0063:
            r2 = r5
            goto L_0x007f
        L_0x0065:
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r2.next()
            com.carrefour.fid.android.domain.models.consent.ConsentName r4 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r4
            com.carrefour.fid.android.domain.models.consent.ConsentName r6 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_SMS
            if (r4 != r6) goto L_0x007b
            r4 = r3
            goto L_0x007c
        L_0x007b:
            r4 = r5
        L_0x007c:
            if (r4 == 0) goto L_0x0069
            r2 = r3
        L_0x007f:
            r4 = 0
            if (r2 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r12 = r4
        L_0x0084:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            r2.booleanValue()
            java.util.List<? extends com.carrefour.fid.android.domain.models.consent.ConsentName> r6 = r11.notCompletedConsents
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x009e
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x009e
        L_0x009c:
            r6 = r5
            goto L_0x00b8
        L_0x009e:
            java.util.Iterator r6 = r6.iterator()
        L_0x00a2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x009c
            java.lang.Object r7 = r6.next()
            com.carrefour.fid.android.domain.models.consent.ConsentName r7 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r7
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_EMAIL
            if (r7 != r8) goto L_0x00b4
            r7 = r3
            goto L_0x00b5
        L_0x00b4:
            r7 = r5
        L_0x00b5:
            if (r7 == 0) goto L_0x00a2
            r6 = r3
        L_0x00b8:
            if (r6 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r2 = r4
        L_0x00bc:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            r6.booleanValue()
            java.util.List<? extends com.carrefour.fid.android.domain.models.consent.ConsentName> r7 = r11.notCompletedConsents
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x00d6
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00d6
        L_0x00d4:
            r7 = r5
            goto L_0x00f0
        L_0x00d6:
            java.util.Iterator r7 = r7.iterator()
        L_0x00da:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r7.next()
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r8
            com.carrefour.fid.android.domain.models.consent.ConsentName r9 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING
            if (r8 != r9) goto L_0x00ec
            r8 = r3
            goto L_0x00ed
        L_0x00ec:
            r8 = r5
        L_0x00ed:
            if (r8 == 0) goto L_0x00da
            r7 = r3
        L_0x00f0:
            if (r7 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r6 = r4
        L_0x00f4:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            r7.booleanValue()
            java.util.List<? extends com.carrefour.fid.android.domain.models.consent.ConsentName> r8 = r11.notCompletedConsents
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x010d
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x010d
            goto L_0x0127
        L_0x010d:
            java.util.Iterator r8 = r8.iterator()
        L_0x0111:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0127
            java.lang.Object r9 = r8.next()
            com.carrefour.fid.android.domain.models.consent.ConsentName r9 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r9
            com.carrefour.fid.android.domain.models.consent.ConsentName r10 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING
            if (r9 != r10) goto L_0x0123
            r9 = r3
            goto L_0x0124
        L_0x0123:
            r9 = r5
        L_0x0124:
            if (r9 == 0) goto L_0x0111
            r5 = r3
        L_0x0127:
            if (r5 == 0) goto L_0x012a
            r4 = r7
        L_0x012a:
            java.lang.String r12 = r11.determineEventLabel(r12, r2, r6, r4)
            java.lang.String r2 = "popin-profilage-optin-accepter"
            r11.trackConsent(r2, r12)
            java.util.List<? extends com.carrefour.fid.android.domain.models.consent.ConsentName> r12 = r11.notCompletedConsents
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r12, r4)
            r2.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
        L_0x0146:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x015d
            java.lang.Object r4 = r12.next()
            com.carrefour.fid.android.domain.models.consent.ConsentName r4 = (com.carrefour.fid.android.domain.models.consent.ConsentName) r4
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r5 = new com.carrefour.fid.android.domain.models.consent.ConsentOptIn
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r6 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.ACCEPTED
            r5.<init>(r4, r6, r3)
            r2.add(r5)
            goto L_0x0146
        L_0x015d:
            com.carrefour.fid.android.domain.interactors.consent.c r12 = r11.updateConsentsUseCase
            com.carrefour.fid.android.domain.interactors.consent.c$a r4 = new com.carrefour.fid.android.domain.interactors.consent.c$a
            r4.<init>(r2)
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r12 = r12.m172966invokegIAlus(r4, r0)
            if (r12 != r1) goto L_0x016f
            return r1
        L_0x016f:
            r0 = r11
        L_0x0170:
            boolean r1 = kotlin.Result.m38710j(r12)
            if (r1 == 0) goto L_0x017e
            r1 = r12
            kotlin.d2 r1 = (kotlin.C11079d2) r1
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI$UiEvent$DismissBackDrop r1 = com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI.UiEvent.DismissBackDrop.INSTANCE
            r0.emitEvent(r1)
        L_0x017e:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r12)
            if (r12 == 0) goto L_0x019b
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r12 = r12.getMessage()
            if (r12 != 0) goto L_0x018e
            java.lang.String r12 = ""
        L_0x018e:
            r2 = r12
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI$UiEvent$DismissBackDrop r12 = com.carrefour.fid.android.consent.presentation.viewmodels.mvi.ConsentBackDropMVI.UiEvent.DismissBackDrop.INSTANCE
            r0.emitEvent(r12)
        L_0x019b:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel.processAcceptAll(kotlin.coroutines.c):java.lang.Object");
    }

    private final void processConfigureConsents() {
        trackConsent$default(this, C28526d.f68919f2, (String) null, 2, (Object) null);
        emitEvent(ConsentBackDropMVI.UiEvent.OpenConfigureConsentPage.INSTANCE);
    }

    private final void processSkipConsents() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (!this.notCompletedConsents.isEmpty()) {
            Boolean bool = Boolean.FALSE;
            Iterable iterable = this.notCompletedConsents;
            boolean z8 = true;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((ConsentName) it.next()) == ConsentName.OPTIN_CARREFOUR_SMS) {
                        z7 = true;
                        continue;
                    } else {
                        z7 = false;
                        continue;
                    }
                    if (z7) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            Boolean bool2 = null;
            if (!z) {
                bool = null;
            }
            Boolean bool3 = Boolean.FALSE;
            Iterable iterable2 = this.notCompletedConsents;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((ConsentName) it2.next()) == ConsentName.OPTIN_CARREFOUR_EMAIL) {
                        z6 = true;
                        continue;
                    } else {
                        z6 = false;
                        continue;
                    }
                    if (z6) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                bool3 = null;
            }
            Boolean bool4 = Boolean.FALSE;
            Iterable iterable3 = this.notCompletedConsents;
            if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                Iterator it3 = iterable3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((ConsentName) it3.next()) == ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING) {
                        z5 = true;
                        continue;
                    } else {
                        z5 = false;
                        continue;
                    }
                    if (z5) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (!z3) {
                bool4 = null;
            }
            Boolean bool5 = Boolean.FALSE;
            Iterable iterable4 = this.notCompletedConsents;
            if (!(iterable4 instanceof Collection) || !((Collection) iterable4).isEmpty()) {
                Iterator it4 = iterable4.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((ConsentName) it4.next()) == ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
            z8 = false;
            if (z8) {
                bool2 = bool5;
            }
            trackConsent(C28526d.f68914e2, determineEventLabel(bool, bool3, bool4, bool2));
            emitEvent(ConsentBackDropMVI.UiEvent.DismissBackDrop.INSTANCE);
        }
    }

    private final void trackConsent(String str, String str2) {
        C13783a.m58668o(this.analyticsDispatcher, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "accueil"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68899b2), C11078d1.m42659a(C28526d.f68933j, str), C11078d1.m42659a(C28526d.f68937k, str2)), false, 2, (Object) null);
    }

    public static /* synthetic */ void trackConsent$default(ConsentBackDropViewModel consentBackDropViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        consentBackDropViewModel.trackConsent(str, str2);
    }

    @C12580l
    public Object processIntent(@C12579k ConsentBackDropMVI.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) userAction, (Object) ConsentBackDropMVI.UserAction.FetchNotCompletedConsents.INSTANCE)) {
            Object fetchNotCompletedConsents = fetchNotCompletedConsents(cVar);
            return fetchNotCompletedConsents == C11063b.m42612h() ? fetchNotCompletedConsents : C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) userAction, (Object) ConsentBackDropMVI.UserAction.AcceptAllConsents.INSTANCE)) {
            Object processAcceptAll = processAcceptAll(cVar);
            return processAcceptAll == C11063b.m42612h() ? processAcceptAll : C11079d2.f28267a;
        } else {
            if (Intrinsics.areEqual((Object) userAction, (Object) ConsentBackDropMVI.UserAction.SkipConsents.INSTANCE)) {
                processSkipConsents();
            } else if (Intrinsics.areEqual((Object) userAction, (Object) ConsentBackDropMVI.UserAction.ConfigureConsents.INSTANCE)) {
                processConfigureConsents();
            }
            return C11079d2.f28267a;
        }
    }
}
