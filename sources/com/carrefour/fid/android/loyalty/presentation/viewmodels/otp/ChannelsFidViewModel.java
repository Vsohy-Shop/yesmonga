package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ChannelsFidViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction;", "", "loyaltyCardNumber", "Lkotlin/d2;", "fetchUserChannels", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "channelId", "Lkotlin/Result;", "getOtpCode-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getOtpCode", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$PartialState;", "partialState", "publishState", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserChannelsUseCase;", "getUserChannelsUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserChannelsUseCase;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetOtpUseCase;", "getOtpUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetOtpUseCase;", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserChannelsUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetOtpUseCase;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nChannelsFidViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelsFidViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ChannelsFidViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,3:82\n288#2,2:85\n288#2,2:87\n*S KotlinDebug\n*F\n+ 1 ChannelsFidViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ChannelsFidViewModel\n*L\n40#1:81\n40#1:82,3\n41#1:85,2\n42#1:87,2\n*E\n"})
public final class ChannelsFidViewModel extends BaseMVIViewModel<ChannelsFid.UIState, ChannelsFid.UserAction> {
    @C12579k
    private final GetOtpUseCase getOtpUseCase;
    @C12579k
    private final GetUserChannelsUseCase getUserChannelsUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ChannelsFidViewModel(@C12579k GetUserChannelsUseCase getUserChannelsUseCase2, @C12579k GetOtpUseCase getOtpUseCase2) {
        super(ChannelsFid.UIState.Companion.getInitialState(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getUserChannelsUseCase2, "getUserChannelsUseCase");
        Intrinsics.checkNotNullParameter(getOtpUseCase2, "getOtpUseCase");
        this.getUserChannelsUseCase = getUserChannelsUseCase2;
        this.getOtpUseCase = getOtpUseCase2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchUserChannels(java.lang.String r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$fetchUserChannels$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$fetchUserChannels$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$fetchUserChannels$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$fetchUserChannels$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$fetchUserChannels$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0061
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$PartialState$Loading r10 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$PartialState$Loading
            r10.<init>(r4, r5, r3)
            r8.publishState(r10)
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase r10 = r8.getUserChannelsUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase$Param
            r2.<init>(r9)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.m173052invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain>>>) r0)
            if (r10 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r8
        L_0x0061:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r10)
            if (r1 != 0) goto L_0x00f0
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r10, r2)
            r1.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r10.next()
            com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain r2 = (com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain) r2
            com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel r2 = com.carrefour.fid.android.loyalty.presentation.models.extension.UserChannelsMediaDomainKt.toUserChannelsMediaModel(r2)
            r1.add(r2)
            goto L_0x007a
        L_0x008e:
            java.util.Iterator r10 = r1.iterator()
        L_0x0092:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r10.next()
            r5 = r2
            com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel r5 = (com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel) r5
            java.lang.String r5 = r5.getMediaType()
            java.lang.String r6 = "E-mail"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0092
            goto L_0x00ad
        L_0x00ac:
            r2 = r3
        L_0x00ad:
            com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel r2 = (com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel) r2
            java.util.Iterator r10 = r1.iterator()
        L_0x00b3:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r10.next()
            r6 = r5
            com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel r6 = (com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel) r6
            java.lang.String r6 = r6.getMediaType()
            java.lang.String r7 = "SMS"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x00b3
            r3 = r5
        L_0x00cd:
            com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel r3 = (com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel) r3
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$PartialState$UserChannels r10 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$PartialState$UserChannels
            boolean r1 = r1.isEmpty()
            r10.<init>(r4, r1)
            r0.publishState(r10)
            if (r2 == 0) goto L_0x00e5
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UiEvent$ShowChannelEmail r10 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UiEvent$ShowChannelEmail
            r10.<init>(r2, r9)
            r0.emitEvent(r10)
        L_0x00e5:
            if (r3 == 0) goto L_0x0100
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UiEvent$ShowChannelSms r10 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UiEvent$ShowChannelSms
            r10.<init>(r3, r9)
            r0.emitEvent(r10)
            goto L_0x0100
        L_0x00f0:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$PartialState$Loading r9 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$PartialState$Loading
            r9.<init>(r4)
            r0.publishState(r9)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UiEvent$ErrorChannelsFid r9 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UiEvent$ErrorChannelsFid
            r9.<init>(r1)
            r0.emitEvent(r9)
        L_0x0100:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel.fetchUserChannels(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: getOtpCode-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173093getOtpCode0E7RQCE(java.lang.String r5, java.lang.String r6, kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$getOtpCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$getOtpCode$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$getOtpCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$getOtpCode$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$getOtpCode$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase r7 = r4.getOtpUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase$Param
            r2.<init>(r6, r5)
            r0.label = r3
            java.lang.Object r5 = r7.m173050invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel.m173093getOtpCode0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    private final void publishState(ChannelsFid.PartialState partialState) {
        reduceAndPublishState(ChannelsFid.INSTANCE.getReducer(), partialState);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid.UserAction r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$processIntent$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$processIntent$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel$processIntent$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            r7.mo21858l()
            goto L_0x006d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0053
        L_0x003d:
            kotlin.C11661u0.m45747n(r7)
            boolean r7 = r6 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid.UserAction.FetchUserChannels
            if (r7 == 0) goto L_0x0056
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UserAction$FetchUserChannels r6 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid.UserAction.FetchUserChannels) r6
            java.lang.String r6 = r6.getLoyaltyCardNumber()
            r0.label = r4
            java.lang.Object r6 = r5.fetchUserChannels(r6, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0056:
            boolean r7 = r6 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid.UserAction.GetOtpCode
            if (r7 == 0) goto L_0x0070
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UserAction$GetOtpCode r6 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid.UserAction.GetOtpCode) r6
            java.lang.String r7 = r6.getChannelId()
            java.lang.String r6 = r6.getLoyaltyCardNumber()
            r0.label = r3
            java.lang.Object r6 = r5.m173093getOtpCode0E7RQCE(r7, r6, r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0070:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel.processIntent(com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid$UserAction, kotlin.coroutines.c):java.lang.Object");
    }
}
