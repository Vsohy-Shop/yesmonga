package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.domain.models.consent.extension.C37997a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"<anonymous>", "", "it", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "invoke", "(Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase$invoke$2$missingOptIns$1$1 */
public final class C36110x22ba56a6 extends Lambda implements C11300l<ConsentOptIn, Boolean> {
    public static final C36110x22ba56a6 INSTANCE = new C36110x22ba56a6();

    public C36110x22ba56a6() {
        super(1);
    }

    @C12579k
    public final Boolean invoke(@C12579k ConsentOptIn consentOptIn) {
        Intrinsics.checkNotNullParameter(consentOptIn, "it");
        return Boolean.valueOf(consentOptIn.mo117326h() == C37997a.m156419e());
    }
}
