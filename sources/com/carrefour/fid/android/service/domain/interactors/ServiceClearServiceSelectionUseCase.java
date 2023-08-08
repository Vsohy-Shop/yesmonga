package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceClearServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "Lkotlin/Result;", "Lkotlin/d2;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceClearServiceSelectionUseCase implements C37811a {
    /* access modifiers changed from: private */
    @C12579k
    public final ServiceSelectionRepository serviceSelectionRepository;

    @Inject
    public ServiceClearServiceSelectionUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172840invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x004e }
            kotlinx.coroutines.o2 r6 = kotlinx.coroutines.C12076o2.f29720b     // Catch:{ all -> 0x004e }
            com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$2$1 r2 = new com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase$invoke$2$1     // Catch:{ all -> 0x004e }
            r4 = 0
            r2.<init>(r5, r4)     // Catch:{ all -> 0x004e }
            r0.label = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = kotlinx.coroutines.C11965h.m47673h(r6, r2, r0)     // Catch:{ all -> 0x004e }
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x004e }
            goto L_0x0059
        L_0x004e:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase.m172840invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
