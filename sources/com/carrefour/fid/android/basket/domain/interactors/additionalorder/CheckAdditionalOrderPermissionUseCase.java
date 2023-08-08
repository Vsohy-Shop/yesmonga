package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.models.additionalorder.C37952a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class CheckAdditionalOrderPermissionUseCase implements C37678e<C37952a> {
    @C12579k

    /* renamed from: a */
    public final C37540a f33920a;

    @Inject
    public CheckAdditionalOrderPermissionUseCase(@C12579k C37540a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "getAdditionalOrderContextUseCase");
        this.f33920a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172777invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.additionalorder.C37952a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase$invoke$1
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
            com.carrefour.fid.android.domain.interactors.additionalorder.a r5 = r4.f33920a
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x009f
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0098 }
            com.carrefour.fid.android.domain.models.additionalorder.a r5 = (com.carrefour.fid.android.domain.models.additionalorder.C37952a) r5     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0092
            java.lang.String r0 = r5.mo116800g()     // Catch:{ all -> 0x0098 }
            int r0 = r0.length()     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r0 != 0) goto L_0x005e
            r0 = r3
            goto L_0x005f
        L_0x005e:
            r0 = r1
        L_0x005f:
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = r5.mo116803i()     // Catch:{ all -> 0x0098 }
            int r0 = r0.length()     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x006d
            r0 = r3
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = r5.mo116804j()     // Catch:{ all -> 0x0098 }
            int r0 = r0.length()     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x007c
            r0 = r3
            goto L_0x007d
        L_0x007c:
            r0 = r1
        L_0x007d:
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = r5.mo116801h()     // Catch:{ all -> 0x0098 }
            int r0 = r0.length()     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 != 0) goto L_0x0092
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0098 }
            goto L_0x00a3
        L_0x0092:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
            throw r5     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
        L_0x009f:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x00a3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase.m172777invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
