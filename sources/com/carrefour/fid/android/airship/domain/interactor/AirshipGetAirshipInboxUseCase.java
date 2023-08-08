package com.carrefour.fid.android.airship.domain.interactor;

import com.carrefour.fid.android.domain.interactors.airship.C37545b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AirshipGetAirshipInboxUseCase implements C37545b {
    @C12579k

    /* renamed from: a */
    public final C13750a f33390a;

    @Inject
    public AirshipGetAirshipInboxUseCase(@C12579k C13750a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "areAirshipNotificationsEnabledUseCase");
        this.f33390a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172746invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.accountmenu.C37950a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase$invoke$1 r0 = (com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase$invoke$1 r0 = new com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.airship.domain.interactor.a r5 = r4.f33390a
            r0.label = r3
            java.lang.Object r5 = r5.m172748invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x0078
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            com.urbanairship.messagecenter.h r5 = com.urbanairship.messagecenter.C9372h.m35254H()
            com.urbanairship.messagecenter.c r5 = r5.mo18999B()
            int r5 = r5.mo18928k()
            com.urbanairship.messagecenter.h r0 = com.urbanairship.messagecenter.C9372h.m35254H()
            com.urbanairship.messagecenter.c r0 = r0.mo18999B()
            int r0 = r0.mo18937t()
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.accountmenu.a r1 = new com.carrefour.fid.android.domain.models.accountmenu.a
            if (r5 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            r1.<init>(r3, r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r1)
            goto L_0x0082
        L_0x0078:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase.m172746invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
