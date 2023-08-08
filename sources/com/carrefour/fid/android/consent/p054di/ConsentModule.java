package com.carrefour.fid.android.consent.p054di;

import com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase;
import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C10159h
@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001R\u0018\u0010\u0006\u001a\u00020\u0003*\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00020\r*\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/di/ConsentModule;", "", "Lcom/carrefour/fid/android/consent/domain/interactors/ConsentGetConsentsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "getBindGetConsentsUseCase", "(Lcom/carrefour/fid/android/consent/domain/interactors/ConsentGetConsentsUseCase;)Lcom/carrefour/fid/android/domain/interactors/consent/a;", "bindGetConsentsUseCase", "Lcom/carrefour/fid/android/consent/domain/interactors/ConsentUpdateConsentsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "getBindUpdateConsentsUseCase", "(Lcom/carrefour/fid/android/consent/domain/interactors/ConsentUpdateConsentsUseCase;)Lcom/carrefour/fid/android/domain/interactors/consent/c;", "bindUpdateConsentsUseCase", "Lcom/carrefour/fid/android/consent/domain/interactors/ConsentGetRefusedAndMissingConsentsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/consent/b;", "getBindGetRefusedAndMissingConsentsUseCase", "(Lcom/carrefour/fid/android/consent/domain/interactors/ConsentGetRefusedAndMissingConsentsUseCase;)Lcom/carrefour/fid/android/domain/interactors/consent/b;", "bindGetRefusedAndMissingConsentsUseCase", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.consent.di.ConsentModule */
public interface ConsentModule {
    @C10147a
    @C12579k
    C37629a getBindGetConsentsUseCase(@C12579k ConsentGetConsentsUseCase consentGetConsentsUseCase);

    @C10147a
    @C12579k
    C37630b getBindGetRefusedAndMissingConsentsUseCase(@C12579k ConsentGetRefusedAndMissingConsentsUseCase consentGetRefusedAndMissingConsentsUseCase);

    @C10147a
    @C12579k
    C37631c getBindUpdateConsentsUseCase(@C12579k ConsentUpdateConsentsUseCase consentUpdateConsentsUseCase);
}
