package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/GetPendingServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/e;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "Lkotlin/Result;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nGetPendingServiceSelectionUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPendingServiceSelectionUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/GetPendingServiceSelectionUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1045#2:40\n*S KotlinDebug\n*F\n+ 1 GetPendingServiceSelectionUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/GetPendingServiceSelectionUseCase\n*L\n29#1:40\n*E\n"})
public final class GetPendingServiceSelectionUseCase implements C37678e<C38162k> {
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;

    @Inject
    public GetPendingServiceSelectionUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172838invokeIoAF18A(@C12579k C11045c<? super Result<C38162k>> cVar) {
        List list;
        List<DeliveryFee> E;
        C38162k pendingServiceSelection = this.serviceSelectionRepository.getPendingServiceSelection();
        StoreService f = pendingServiceSelection.mo119354f();
        StoreService storeService = null;
        if (f == null) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(new C38162k(pendingServiceSelection.mo119352e(), (StoreService) null));
        } else if (!f.mo119165I()) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new IllegalArgumentException("Fees can't have a negative value")));
        } else {
            StoreService f2 = pendingServiceSelection.mo119354f();
            if (f2 == null || (E = f2.mo119161E()) == null || (list = CollectionsKt___CollectionsKt.m40675p5(E, new C28355xcee28db9())) == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            List list2 = list;
            Result.C10852a aVar3 = Result.f28060a;
            StoreService f3 = pendingServiceSelection.mo119354f();
            if (f3 != null) {
                storeService = StoreService.m157998C(f3, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, (StoreServiceType) null, false, false, list2, 33554431, (Object) null);
            }
            return Result.m38702b(new C38162k(pendingServiceSelection.mo119352e(), storeService));
        }
    }
}
