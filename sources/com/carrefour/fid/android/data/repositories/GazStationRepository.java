package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.provider.headers.C36579u;
import com.carrefour.fid.android.data.service.C36635n;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.urbanairship.wallet.C9700d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class GazStationRepository {

    /* renamed from: c */
    public static final int f90379c = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C36579u f90380a;
    @C12579k

    /* renamed from: b */
    public final C36635n f90381b;

    @Inject
    public GazStationRepository(@C12579k C36579u uVar, @C12579k C36635n nVar) {
        Intrinsics.checkNotNullParameter(uVar, C9700d.f26570q);
        Intrinsics.checkNotNullParameter(nVar, "service");
        this.f90380a = uVar;
        this.f90381b = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111501c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.CurrentCampaignsResponse>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$1 r0 = (com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$1 r0 = new com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$2 r5 = new com.carrefour.fid.android.data.repositories.GazStationRepository$fetchCurrentCampaigns$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.GazStationRepository.mo111501c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111502d(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.io.File r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.ServiceStationsTicketCardResponse>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$1 r0 = (com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$1 r0 = new com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$2 r14 = new com.carrefour.fid.android.data.repositories.GazStationRepository$sendTicketCard$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r13
            r7 = r12
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.GazStationRepository.mo111502d(java.lang.String, java.io.File, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
