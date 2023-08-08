package com.carrefour.fid.android.domain.interactors.criteo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.catalog.C37611c;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCriteoGetCatalogCriteoBannerUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoGetCatalogCriteoBannerUseCase.kt\ncom/carrefour/fid/android/domain/interactors/criteo/CriteoGetCatalogCriteoBannerUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class CriteoGetCatalogCriteoBannerUseCase implements C37611c {

    /* renamed from: b */
    public static final int f94491b = 8;
    @C12579k

    /* renamed from: a */
    public final GetCriteoBannerUseCase f94492a;

    @Inject
    public CriteoGetCatalogCriteoBannerUseCase(@C12579k GetCriteoBannerUseCase getCriteoBannerUseCase) {
        Intrinsics.checkNotNullParameter(getCriteoBannerUseCase, "getCriteoBannerUseCase");
        this.f94492a = getCriteoBannerUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172958invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.criteo.C37999a>> r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0072
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase r1 = r0.f94492a
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a r4 = new com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a
            com.carrefour.fid.android.domain.models.criteo.h r15 = new com.carrefour.fid.android.domain.models.criteo.h
            r6 = r15
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r7 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_CATALOGUE
            com.carrefour.fid.android.domain.models.criteo.CriteoEventType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoEventType.EVENT_TYPE_VIEW_HOME
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r5 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 32764(0x7ffc, float:4.5912E-41)
            r23 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.<init>(r5)
            r5 = 1
            r2.label = r5
            java.lang.Object r1 = r1.m172963invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0072
            return r3
        L_0x0072:
            boolean r2 = kotlin.Result.m38710j(r1)
            if (r2 == 0) goto L_0x0082
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r1)
            com.carrefour.fid.android.domain.models.criteo.a r1 = (com.carrefour.fid.android.domain.models.criteo.C37999a) r1
        L_0x0082:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase.m172958invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
