package com.carrefour.fid.android.domain.interactors.arsenal;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.ArsenalGameRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.ArsenalGenericBanner;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetArsenalTopBannersUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetArsenalTopBannersUseCase.kt\ncom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalTopBannersUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1549#2:43\n1620#2,3:44\n766#2:47\n857#2,2:48\n*S KotlinDebug\n*F\n+ 1 GetArsenalTopBannersUseCase.kt\ncom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalTopBannersUseCase\n*L\n22#1:43\n22#1:44,3\n30#1:47\n30#1:48,2\n*E\n"})
public final class GetArsenalTopBannersUseCase implements C37678e<List<? extends ArsenalGenericBanner>> {

    /* renamed from: c */
    public static final int f94301c = 8;
    @C12579k

    /* renamed from: a */
    public final C37807b f94302a;
    @C12579k

    /* renamed from: b */
    public final ArsenalGameRepository f94303b;

    @Inject
    public GetArsenalTopBannersUseCase(@C12579k C37807b bVar, @C12579k ArsenalGameRepository arsenalGameRepository) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(arsenalGameRepository, "arsenalGameRepository");
        this.f94302a = bVar;
        this.f94303b = arsenalGameRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172941invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.ArsenalGenericBanner>>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase$invoke$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0079
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase r2 = (com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0060
        L_0x0048:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r12 = r11.f94302a
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.ArsenalTopBanner
            r2.<init>(r5)
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r12 = r12.m172966invokegIAlus(r2, r0)
            if (r12 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r2 = r11
        L_0x0060:
            boolean r5 = kotlin.Result.m38710j(r12)
            if (r5 == 0) goto L_0x0110
            r5 = r12
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            com.carrefour.fid.android.data.repositories.ArsenalGameRepository r2 = r2.f94303b
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r12 = r2.mo111482b(r0)
            if (r12 != r1) goto L_0x0079
            return r1
        L_0x0079:
            boolean r0 = kotlin.Result.m38710j(r12)
            if (r0 == 0) goto L_0x00f8
            java.util.List r12 = (java.util.List) r12
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x0094:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00be
            java.lang.Object r1 = r12.next()
            com.carrefour.fid.android.data.entities.ArsenalGameContentResponse r1 = (com.carrefour.fid.android.data.entities.ArsenalGameContentResponse) r1
            com.carrefour.fid.android.domain.models.ArsenalGenericBanner r2 = new com.carrefour.fid.android.domain.models.ArsenalGenericBanner
            java.lang.String r6 = r1.getGameUrl()
            java.lang.String r7 = r1.getBannerUrl()
            java.lang.String r8 = r1.getOpName()
            java.lang.String r9 = r1.getOpCode()
            java.lang.String r10 = r1.getTextAlt()
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.add(r2)
            goto L_0x0094
        L_0x00be:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f3
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.ArsenalGenericBanner r2 = (com.carrefour.fid.android.domain.models.ArsenalGenericBanner) r2
            java.lang.String r3 = r2.getGameUrl()
            boolean r3 = kotlin.text.C11622t.isBlank(r3)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00ec
            java.lang.String r2 = r2.getBannerUrl()
            boolean r2 = kotlin.text.C11622t.isBlank(r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x00ec
            r2 = r4
            goto L_0x00ed
        L_0x00ec:
            r2 = 0
        L_0x00ed:
            if (r2 == 0) goto L_0x00c7
            r12.add(r1)
            goto L_0x00c7
        L_0x00f3:
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        L_0x00f8:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r12)
            if (r12 == 0) goto L_0x0110
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r0 = "Could not fetch Arsenal"
            r12.<init>(r0)
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        L_0x0110:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r0 = "No Arsenal game available"
            r12.<init>(r0)
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase.m172941invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
