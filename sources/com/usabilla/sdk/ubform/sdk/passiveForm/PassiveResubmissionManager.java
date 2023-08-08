package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.p007db.unsent.C9785a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

public final class PassiveResubmissionManager {
    @C12579k

    /* renamed from: a */
    public final PassiveFormService f27720a;
    @C12579k

    /* renamed from: b */
    public final C9785a f27721b;

    public PassiveResubmissionManager(@C12579k PassiveFormService passiveFormService, @C12579k C9785a aVar) {
        Intrinsics.checkNotNullParameter(passiveFormService, "submissionService");
        Intrinsics.checkNotNullParameter(aVar, "unsentFeedbackDao");
        this.f27720a = passiveFormService;
        this.f27721b = aVar;
    }

    @C12579k
    /* renamed from: c */
    public final C11907e<Integer> mo21490c() {
        return new C10081x5276b7ec(this.f27721b.mo20062b(), this);
    }
}
