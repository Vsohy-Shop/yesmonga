package com.carrefour.fid.android.domain.interactors.slot;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class ShiftSlotRemoteConfigUseCase implements C37678e<Boolean> {

    /* renamed from: b */
    public static final int f94947b = 8;
    @C12579k

    /* renamed from: a */
    public final C37807b f94948a;

    @Inject
    public ShiftSlotRemoteConfigUseCase(@C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "shiftSlotRemoteConfigRepository");
        this.f94948a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173009invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r6 = r5.f94948a
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r4 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.DriveSlotShift
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase.m173009invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
