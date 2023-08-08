package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class UpdateOrderOnlineUseCase implements C37738n {

    /* renamed from: c */
    public static final int f94703c = 8;
    @C12579k

    /* renamed from: a */
    public final C37886i f94704a;
    @C12579k

    /* renamed from: b */
    public final OrderOnlineRepository f94705b;

    @Inject
    public UpdateOrderOnlineUseCase(@C12579k C37886i iVar, @C12579k OrderOnlineRepository orderOnlineRepository) {
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        Intrinsics.checkNotNullParameter(orderOnlineRepository, "repository");
        this.f94704a = iVar;
        this.f94705b = orderOnlineRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[SYNTHETIC, Splitter:B:22:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172985invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.C37738n.C37739a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            kotlin.Result r7 = (kotlin.Result) r7     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r7.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x0083
        L_0x0032:
            r6 = move-exception
            goto L_0x008d
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.order.n$a r6 = (com.carrefour.fid.android.domain.interactors.order.C37738n.C37739a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0061
        L_0x004e:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.user.i r7 = r5.f94704a
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r5
        L_0x0061:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x0098
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            kotlin.d2 r7 = (kotlin.C11079d2) r7     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r7 = r2.f94705b     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r6.mo114891e()     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r6.mo114893f()     // Catch:{ all -> 0x0032 }
            r4 = 0
            r0.L$0 = r4     // Catch:{ all -> 0x0032 }
            r0.L$1 = r4     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r7.mo111539l(r2, r6, r0)     // Catch:{ all -> 0x0032 }
            if (r6 != r1) goto L_0x0083
            return r1
        L_0x0083:
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0032 }
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x009c
        L_0x008d:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x009c
        L_0x0098:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x009c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase.m172985invokegIAlus(com.carrefour.fid.android.domain.interactors.order.n$a, kotlin.coroutines.c):java.lang.Object");
    }
}
