package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37820h;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006*\u0004\u0018\u00010\u0002H\u0002J4\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u00060\bHBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetSelectedServiceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/h;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "Lkotlin/Pair;", "Lcom/carrefour/fid/android/domain/models/basket/BasketType;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Lcom/carrefour/fid/android/domain/interactors/service/BasketTypeAndStoreServiceType;", "getStoreServiceType", "Lkotlin/Result;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/service/k;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceGetSelectedServiceUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceGetSelectedServiceUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceGetSelectedServiceUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class ServiceGetSelectedServiceUseCase implements C37820h {
    @C12579k
    private final C37823k getServiceSelectionUseCase;

    @Inject
    public ServiceGetSelectedServiceUseCase(@C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.getServiceSelectionUseCase = kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreServiceType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreServiceType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreServiceType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreServiceType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreServiceType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.Pair<com.carrefour.fid.android.domain.models.basket.BasketType, com.carrefour.fid.android.domain.models.service.models.StoreServiceType> getStoreServiceType(com.carrefour.fid.android.domain.models.service.models.StoreService r7) {
        /*
            r6 = this;
            com.carrefour.fid.android.domain.models.basket.BasketType$a r0 = com.carrefour.fid.android.domain.models.basket.BasketType.f95520a
            r1 = 0
            if (r7 == 0) goto L_0x000a
            java.lang.String r2 = r7.mo119180X()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            com.carrefour.fid.android.domain.models.basket.BasketType r0 = r0.mo117009a(r2)
            java.util.Map r2 = com.carrefour.fid.android.domain.models.basket.C37969b.m156161a()
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x003f
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0021:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r4 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r4
            if (r7 == 0) goto L_0x0035
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r5 = r7.mo119176T()
            goto L_0x0036
        L_0x0035:
            r5 = r1
        L_0x0036:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0021
            r1 = r3
        L_0x003d:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r1
        L_0x003f:
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase.getStoreServiceType(com.carrefour.fid.android.domain.models.service.models.StoreService):kotlin.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172853invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends kotlin.Pair<? extends com.carrefour.fid.android.domain.models.basket.BasketType, ? extends com.carrefour.fid.android.domain.models.service.models.StoreServiceType>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.getServiceSelectionUseCase
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r5)
            if (r1 != 0) goto L_0x0063
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119354f()
            kotlin.Result$a r1 = kotlin.Result.f28060a
            kotlin.Pair r5 = r0.getStoreServiceType(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0063:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase.m172853invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
