package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0014\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HBø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceObserveServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/r;", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "invoke", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "serviceSelectionRepository", "Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;", "<init>", "(Lcom/carrefour/fid/android/service/domain/repositories/ServiceSelectionRepository;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceObserveServiceSelectionUseCase implements C37835r {
    @C12579k
    private final ServiceSelectionRepository serviceSelectionRepository;

    @Inject
    public ServiceObserveServiceSelectionUseCase(@C12579k ServiceSelectionRepository serviceSelectionRepository2) {
        Intrinsics.checkNotNullParameter(serviceSelectionRepository2, "serviceSelectionRepository");
        this.serviceSelectionRepository = serviceSelectionRepository2;
    }

    @C12580l
    public Object invoke(@C12579k C11045c<? super C11907e<C38162k>> cVar) {
        return this.serviceSelectionRepository.getServiceSelectionFlow();
    }
}
