package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37806a;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37809c;
import com.carrefour.fid.android.various.domain.repository.AppMessageRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ThirdPartyCheckAppMessageUseCase implements C37806a {
    @C12579k

    /* renamed from: a */
    public final C37809c f58330a;
    @C12579k

    /* renamed from: b */
    public final AppMessageRepository f58331b;

    @Inject
    public ThirdPartyCheckAppMessageUseCase(@C12579k C37809c cVar, @C12579k AppMessageRepository appMessageRepository) {
        Intrinsics.checkNotNullParameter(cVar, "fetchRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(appMessageRepository, "appMessageRepository");
        this.f58330a = cVar;
        this.f58331b = appMessageRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[SYNTHETIC, Splitter:B:27:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[Catch:{ all -> 0x004d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172810invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase$invoke$1 r0 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase$invoke$1 r0 = new com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase$invoke$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x004f
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r0 = r0.L$0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x004d }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x004d }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x004d }
            goto L_0x009c
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase r2 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x004d }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x004d }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x004d }
            goto L_0x008a
        L_0x004d:
            r9 = move-exception
            goto L_0x00b7
        L_0x004f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase r2 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006e
        L_0x005d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.remoteconfig.c r9 = r8.f58330a
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r8
        L_0x006e:
            boolean r6 = kotlin.Result.m38710j(r9)
            if (r6 == 0) goto L_0x00bd
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x004d }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x004d }
            r9.booleanValue()     // Catch:{ all -> 0x004d }
            com.carrefour.fid.android.various.domain.repository.AppMessageRepository r9 = r2.f58331b     // Catch:{ all -> 0x004d }
            com.carrefour.fid.android.various.domain.model.AppMessageType r6 = com.carrefour.fid.android.various.domain.model.AppMessageType.BROADCAST     // Catch:{ all -> 0x004d }
            r0.L$0 = r2     // Catch:{ all -> 0x004d }
            r0.label = r4     // Catch:{ all -> 0x004d }
            java.lang.Object r9 = r9.mo67239b(r6, r0)     // Catch:{ all -> 0x004d }
            if (r9 != r1) goto L_0x008a
            return r1
        L_0x008a:
            com.carrefour.fid.android.various.domain.repository.AppMessageRepository r2 = r2.f58331b     // Catch:{ all -> 0x004d }
            com.carrefour.fid.android.various.domain.model.AppMessageType r4 = com.carrefour.fid.android.various.domain.model.AppMessageType.VERSION     // Catch:{ all -> 0x004d }
            r0.L$0 = r9     // Catch:{ all -> 0x004d }
            r0.label = r3     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r2.mo67239b(r4, r0)     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x009c:
            boolean r0 = kotlin.Result.m38709i(r0)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x00b0
            boolean r9 = kotlin.Result.m38709i(r9)     // Catch:{ all -> 0x004d }
            if (r9 != 0) goto L_0x00a9
            goto L_0x00b0
        L_0x00a9:
            com.carrefour.fid.android.various.core.NoAppNotificationThrowable r9 = new com.carrefour.fid.android.various.core.NoAppNotificationThrowable     // Catch:{ all -> 0x004d }
            r0 = 0
            r9.<init>(r0, r5, r0)     // Catch:{ all -> 0x004d }
            throw r9     // Catch:{ all -> 0x004d }
        L_0x00b0:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004d }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x004d }
            goto L_0x00c1
        L_0x00b7:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
        L_0x00bd:
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x00c1:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 == 0) goto L_0x00d5
            boolean r0 = r2 instanceof com.carrefour.fid.android.various.core.NoAppNotificationThrowable
            if (r0 != 0) goto L_0x00d5
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = "Failed to check app messages"
            r3 = 0
            r4 = 4
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
        L_0x00d5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase.m172810invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
