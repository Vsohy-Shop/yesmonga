package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class StdCheckBasketPermissionsUseCase implements C37678e<C11079d2> {
    @C12579k

    /* renamed from: a */
    public final BasketCheckSelectedServiceAndBasketSynchronicityUseCase f34050a;
    @C12579k

    /* renamed from: b */
    public final C37886i f34051b;

    @Inject
    public StdCheckBasketPermissionsUseCase(@C12579k BasketCheckSelectedServiceAndBasketSynchronicityUseCase basketCheckSelectedServiceAndBasketSynchronicityUseCase, @C12579k C37886i iVar) {
        Intrinsics.checkNotNullParameter(basketCheckSelectedServiceAndBasketSynchronicityUseCase, "basketCheckSelectedServiceAndBasketSynchronicityUseCase");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        this.f34050a = basketCheckSelectedServiceAndBasketSynchronicityUseCase;
        this.f34051b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[SYNTHETIC, Splitter:B:22:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172794invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0032 }
            kotlin.Result r6 = (kotlin.Result) r6     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r6.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x0073
        L_0x0032:
            r6 = move-exception
            goto L_0x007d
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005b
        L_0x004a:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.user.i r6 = r5.f34051b
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r5
        L_0x005b:
            boolean r4 = kotlin.Result.m38710j(r6)
            if (r4 == 0) goto L_0x0083
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            kotlin.d2 r6 = (kotlin.C11079d2) r6     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase r6 = r2.f34050a     // Catch:{ all -> 0x0032 }
            r2 = 0
            r0.L$0 = r2     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r6.m172780invokeIoAF18A(r0)     // Catch:{ all -> 0x0032 }
            if (r6 != r1) goto L_0x0073
            return r1
        L_0x0073:
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0032 }
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0087
        L_0x007d:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
        L_0x0083:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase.m172794invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
