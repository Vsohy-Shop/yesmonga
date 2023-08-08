package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.domain.models.OfferProductDomain;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$2", mo22502f = "APIMProductDetailsRepository.kt", mo22503i = {1, 2, 4}, mo22504l = {41, 44, 42, 57, 76}, mo22505m = "invokeSuspend", mo22506n = {"slotIdPreferences", "slotIdPreferences", "throwable"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/OfferProductDomain;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAPIMProductDetailsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMProductDetailsRepository.kt\ncom/carrefour/fid/android/data/repositories/APIMProductDetailsRepository$getOfferList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n*S KotlinDebug\n*F\n+ 1 APIMProductDetailsRepository.kt\ncom/carrefour/fid/android/data/repositories/APIMProductDetailsRepository$getOfferList$2\n*L\n65#1:102\n65#1:103,3\n*E\n"})
public final class APIMProductDetailsRepository$getOfferList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends OfferProductDomain>>>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ List<String> $gtinList;
    final /* synthetic */ boolean $hasFidCard;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ APIMProductDetailsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APIMProductDetailsRepository$getOfferList$2(List<String> list, APIMProductDetailsRepository aPIMProductDetailsRepository, String str, boolean z, C11045c<? super APIMProductDetailsRepository$getOfferList$2> cVar) {
        super(1, cVar);
        this.$gtinList = list;
        this.this$0 = aPIMProductDetailsRepository;
        this.$facilityServiceId = str;
        this.$hasFidCard = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new APIMProductDetailsRepository$getOfferList$2(this.$gtinList, this.this$0, this.$facilityServiceId, this.$hasFidCard, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0052
            if (r1 == r6) goto L_0x0048
            if (r1 == r5) goto L_0x0037
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r13.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x017d
        L_0x0021:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0029:
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0116
        L_0x002e:
            java.lang.Object r1 = r13.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00c4
        L_0x0037:
            java.lang.Object r1 = r13.L$2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r13.L$1
            com.carrefour.fid.android.data.service.a r5 = (com.carrefour.fid.android.data.service.C36620a) r5
            java.lang.Object r8 = r13.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00b2
        L_0x0048:
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x007b
        L_0x0052:
            kotlin.C11661u0.m45747n(r14)
            java.util.List<java.lang.String> r14 = r13.$gtinList
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x006c
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.util.List r14 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            kotlin.Result r14 = kotlin.Result.m38701a(r14)
            return r14
        L_0x006c:
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository r14 = r13.this$0
            com.carrefour.fid.android.domain.interactors.slot.d r14 = r14.f90350f
            r13.label = r6
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r13)
            if (r14 != r0) goto L_0x007b
            return r0
        L_0x007b:
            boolean r1 = kotlin.Result.m38709i(r14)
            if (r1 == 0) goto L_0x0082
            r14 = r7
        L_0x0082:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x0088
            java.lang.String r14 = "1A"
        L_0x0088:
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository r1 = r13.this$0
            com.carrefour.fid.android.data.service.a r1 = r1.f90346b
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository r8 = r13.this$0
            com.carrefour.fid.android.data.provider.headers.o r8 = r8.f90348d
            java.util.HashMap r8 = r8.mo111442a()
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository r9 = r13.this$0
            java.util.List<java.lang.String> r10 = r13.$gtinList
            java.lang.String r11 = r13.$facilityServiceId
            r13.L$0 = r14
            r13.L$1 = r1
            r13.L$2 = r8
            r13.label = r5
            java.lang.Object r5 = r9.mo111475j(r10, r11, r13)
            if (r5 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            r12 = r8
            r8 = r14
            r14 = r5
            r5 = r1
            r1 = r12
        L_0x00b2:
            com.carrefour.fid.android.data.entities.APIMProductDetailsBody r14 = (com.carrefour.fid.android.data.entities.APIMProductDetailsBody) r14
            r13.L$0 = r8
            r13.L$1 = r7
            r13.L$2 = r7
            r13.label = r4
            java.lang.Object r14 = r5.mo111631a(r1, r14, r13)
            if (r14 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r1 = r8
        L_0x00c4:
            com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository r4 = r13.this$0
            boolean r5 = r13.$hasFidCard
            retrofit2.w r14 = (retrofit2.C13091w) r14
            boolean r8 = r14.mo30576g()
            if (r8 != 0) goto L_0x00e2
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.String r0 = "Error fetching product details"
            com.carrefour.fid.android.shared.io.ResponseThrowable r14 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r14, r0)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            goto L_0x015f
        L_0x00e2:
            r4.mo111414b(r14)
            java.lang.Object r14 = r14.mo30572a()
            com.carrefour.fid.android.data.entities.APIMProductDetailsResponse r14 = (com.carrefour.fid.android.data.entities.APIMProductDetailsResponse) r14
            if (r14 == 0) goto L_0x00f2
            java.util.List r14 = r14.getContent()
            goto L_0x00f3
        L_0x00f2:
            r14 = r7
        L_0x00f3:
            r8 = r14
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = 0
            if (r8 == 0) goto L_0x0102
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r8 = r9
            goto L_0x0103
        L_0x0102:
            r8 = r6
        L_0x0103:
            if (r8 == 0) goto L_0x0126
            com.carrefour.fid.android.domain.interactors.logm.a r14 = r4.f90349e
            r13.L$0 = r7
            r13.label = r3
            java.lang.String r1 = "Error fetching product details: Body empty"
            java.lang.Object r14 = r4.mo111413a(r14, r1, r13)
            if (r14 != r0) goto L_0x0116
            return r0
        L_0x0116:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ProductDetailsThrowable r14 = new com.carrefour.fid.android.shared.io.ProductDetailsThrowable
            r14.<init>(r7, r6, r7)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            goto L_0x015f
        L_0x0126:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x0164 }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ all -> 0x0164 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0164 }
            r7 = 10
            int r7 = kotlin.collections.C10978t.m41495Y(r14, r7)     // Catch:{ all -> 0x0164 }
            r3.<init>(r7)     // Catch:{ all -> 0x0164 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0164 }
        L_0x0139:
            boolean r7 = r14.hasNext()     // Catch:{ all -> 0x0164 }
            if (r7 == 0) goto L_0x015b
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x0164 }
            com.carrefour.fid.android.data.entities.APIMProductDetails r7 = (com.carrefour.fid.android.data.entities.APIMProductDetails) r7     // Catch:{ all -> 0x0164 }
            com.carrefour.fid.android.data.entities.mapper.k r8 = r4.f90347c     // Catch:{ all -> 0x0164 }
            com.carrefour.fid.android.data.entities.mapper.k$a r10 = new com.carrefour.fid.android.data.entities.mapper.k$a     // Catch:{ all -> 0x0164 }
            if (r5 == 0) goto L_0x014f
            r11 = r6
            goto L_0x0150
        L_0x014f:
            r11 = r9
        L_0x0150:
            r10.<init>(r7, r11, r1)     // Catch:{ all -> 0x0164 }
            com.carrefour.fid.android.domain.models.OfferProductDomain r7 = r8.mo72340a(r10)     // Catch:{ all -> 0x0164 }
            r3.add(r7)     // Catch:{ all -> 0x0164 }
            goto L_0x0139
        L_0x015b:
            java.lang.Object r14 = kotlin.Result.m38702b(r3)     // Catch:{ all -> 0x0164 }
        L_0x015f:
            kotlin.Result r14 = kotlin.Result.m38701a(r14)
            return r14
        L_0x0164:
            r14 = move-exception
            com.carrefour.fid.android.domain.interactors.logm.a r1 = r4.f90349e
            java.lang.String r3 = r14.getMessage()
            if (r3 != 0) goto L_0x0171
            java.lang.String r3 = ""
        L_0x0171:
            r13.L$0 = r14
            r13.label = r2
            java.lang.Object r1 = r4.mo111413a(r1, r3, r13)
            if (r1 != r0) goto L_0x017c
            return r0
        L_0x017c:
            r0 = r14
        L_0x017d:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r14 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r0)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            kotlin.Result r14 = kotlin.Result.m38701a(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository$getOfferList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<OfferProductDomain>>> cVar) {
        return ((APIMProductDetailsRepository$getOfferList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
