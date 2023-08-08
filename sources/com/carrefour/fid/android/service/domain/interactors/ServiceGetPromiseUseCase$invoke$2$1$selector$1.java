package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"<no name provided>", "", "storeService", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "invoke", "(Lcom/carrefour/fid/android/domain/models/service/models/StoreService;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceGetPromiseUseCase$invoke$2$1$selector$1 extends Lambda implements C11300l<StoreService, Boolean> {
    final /* synthetic */ C37818g.C37819a $param;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceGetPromiseUseCase$invoke$2$1$selector$1(C37818g.C37819a aVar) {
        super(1);
        this.$param = aVar;
    }

    @C12579k
    public final Boolean invoke(@C12579k StoreService storeService) {
        boolean z;
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        if (this.$param.mo115239h()) {
            z = storeService.mo119183a0();
        } else {
            z = !storeService.mo119183a0();
        }
        return Boolean.valueOf(z);
    }
}
