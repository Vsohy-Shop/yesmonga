package com.carrefour.fid.android.domain.interactors.gazStation;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.GazStationRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.CurrentCampaignsDomain;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetGazStationsCampaignUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetGazStationsCampaignUseCase.kt\ncom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class GetGazStationsCampaignUseCase implements C37678e<CurrentCampaignsDomain> {

    /* renamed from: c */
    public static final int f94549c = 8;
    @C12579k

    /* renamed from: a */
    public final GazStationRepository f94550a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94551b;

    @Inject
    public GetGazStationsCampaignUseCase(@C12579k GazStationRepository gazStationRepository, @C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(gazStationRepository, "repository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.f94550a = gazStationRepository;
        this.f94551b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114718c(kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.CurrentCampaignsDomain>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1 r0 = (com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1 r0 = new com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1
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
            com.carrefour.fid.android.data.repositories.GazStationRepository r5 = r4.f94550a
            r0.label = r3
            java.lang.Object r5 = r5.mo111501c(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x0053
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.data.entities.CurrentCampaignsResponse r5 = (com.carrefour.fid.android.data.entities.CurrentCampaignsResponse) r5
            com.carrefour.fid.android.domain.models.CurrentCampaignsDomain r5 = com.carrefour.fid.android.domain.extension.C37502d.m153942a(r5)
        L_0x0053:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase.mo114718c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[SYNTHETIC, Splitter:B:22:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172969invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.CurrentCampaignsDomain>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            kotlin.Result r7 = (kotlin.Result) r7     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r7.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x007b
        L_0x0032:
            r7 = move-exception
            goto L_0x0085
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase r2 = (com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0062
        L_0x004a:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r7 = r6.f94551b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.GazStation
            r2.<init>(r5)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m172966invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r2 = r6
        L_0x0062:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x008b
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0032 }
            r7.booleanValue()     // Catch:{ all -> 0x0032 }
            r7 = 0
            r0.L$0 = r7     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r2.mo114718c(r0)     // Catch:{ all -> 0x0032 }
            if (r7 != r1) goto L_0x007b
            return r1
        L_0x007b:
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.domain.models.CurrentCampaignsDomain r7 = (com.carrefour.fid.android.domain.models.CurrentCampaignsDomain) r7     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x008f
        L_0x0085:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
        L_0x008b:
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x008f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase.m172969invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
