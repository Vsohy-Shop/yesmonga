package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.mapper.C36501k;
import com.carrefour.fid.android.data.logm.ParsingWithLog;
import com.carrefour.fid.android.data.provider.headers.C36573o;
import com.carrefour.fid.android.data.service.C36620a;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.repositories.C38199h;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C8567o(parameters = 0)
public final class APIMProductDetailsRepository implements C38199h, ParsingWithLog {

    /* renamed from: h */
    public static final int f90344h = 8;
    @C12579k

    /* renamed from: a */
    public final C37823k f90345a;
    @C12579k

    /* renamed from: b */
    public final C36620a f90346b;
    @C12579k

    /* renamed from: c */
    public final C36501k f90347c;
    @C12579k

    /* renamed from: d */
    public final C36573o f90348d;
    @C12579k

    /* renamed from: e */
    public final C37694a f90349e;
    @C12579k

    /* renamed from: f */
    public final C37857d f90350f;

    /* renamed from: g */
    public C13091w<?> f90351g;

    @Inject
    public APIMProductDetailsRepository(@C12579k C37823k kVar, @C12579k C36620a aVar, @C12579k C36501k kVar2, @C12579k C36573o oVar, @C12579k C37694a aVar2, @C12579k C37857d dVar) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(aVar, "productsService");
        Intrinsics.checkNotNullParameter(kVar2, "apimOfferProductApiMapper");
        Intrinsics.checkNotNullParameter(oVar, "productHeaders");
        Intrinsics.checkNotNullParameter(aVar2, "remoteLogUseCase");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        this.f90345a = kVar;
        this.f90346b = aVar;
        this.f90347c = kVar2;
        this.f90348d = oVar;
        this.f90349e = aVar2;
        this.f90350f = dVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo111413a(@C12579k C37694a aVar, @C12579k String str, @C12579k C11045c<? super C11079d2> cVar) {
        return ParsingWithLog.DefaultImpls.m149880a(this, aVar, str, cVar);
    }

    /* renamed from: b */
    public void mo111414b(@C12579k C13091w<?> wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f90351g = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111474c(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r11, boolean r12, @org.jetbrains.annotations.C12580l java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.OfferProductDomain>>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$1 r0 = (com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$1 r0 = new com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$1
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
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$2 r14 = new com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$2
            r9 = 0
            r4 = r14
            r5 = r11
            r6 = r10
            r7 = r13
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository.mo111474c(java.util.List, boolean, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public C13091w<?> getResponse() {
        C13091w<?> wVar = this.f90351g;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111475j(java.util.List<java.lang.String> r7, java.lang.String r8, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.data.entities.APIMProductDetailsBody> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$buildProductDetailsBody$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$buildProductDetailsBody$1 r0 = (com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$buildProductDetailsBody$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$buildProductDetailsBody$1 r0 = new com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$buildProductDetailsBody$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.shared.util.ServiceUtil r7 = (com.carrefour.fid.android.shared.util.ServiceUtil) r7
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0065
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.C11661u0.m45747n(r9)
            if (r8 == 0) goto L_0x004e
            boolean r9 = kotlin.text.C11622t.isBlank(r8)
            if (r9 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r9 = r3
            goto L_0x004f
        L_0x004e:
            r9 = r4
        L_0x004f:
            if (r9 == 0) goto L_0x007a
            com.carrefour.fid.android.shared.util.ServiceUtil r8 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.interactors.service.k r9 = r6.f90345a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0065:
            boolean r0 = kotlin.Result.m38709i(r9)
            r1 = 0
            if (r0 == 0) goto L_0x006d
            r9 = r1
        L_0x006d:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x0075
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r9.mo119354f()
        L_0x0075:
            java.lang.String r7 = r7.mo84123e(r1)
            goto L_0x0087
        L_0x007a:
            com.carrefour.fid.android.shared.util.ServiceUtil r9 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            java.lang.String r8 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r8)
            java.lang.String r8 = r9.mo84124f(r8)
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0087:
            java.util.List r7 = kotlin.collections.C10976s.m41419k(r7)
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            com.carrefour.fid.android.data.entities.APIMProductDetailsBody r0 = new com.carrefour.fid.android.data.entities.APIMProductDetailsBody
            r0.<init>(r7, r8, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository.mo111475j(java.util.List, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
