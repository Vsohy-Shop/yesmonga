package com.carrefour.fid.android.domain.interactors.delivery;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.repositories.DlvRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class AppGetDeliveryOptionsUseCase implements C37676b {

    /* renamed from: b */
    public static final int f94533b = 8;
    @C12579k

    /* renamed from: a */
    public final DlvRepository f94534a;

    @Inject
    public AppGetDeliveryOptionsUseCase(@C12579k DlvRepository dlvRepository) {
        Intrinsics.checkNotNullParameter(dlvRepository, "repository");
        this.f94534a = dlvRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172964invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.delivery.C37676b.C37677a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.delivery.C38017b>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.repositories.DlvRepository r6 = r4.f94534a
            java.lang.String r2 = r5.mo114702e()
            java.util.List r5 = r5.mo114704f()
            r0.label = r3
            java.lang.Object r5 = r6.mo119610a(r2, r5, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase.m172964invokegIAlus(com.carrefour.fid.android.domain.interactors.delivery.b$a, kotlin.coroutines.c):java.lang.Object");
    }
}
