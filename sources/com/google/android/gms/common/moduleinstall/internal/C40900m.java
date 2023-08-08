package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.C31045j;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.m */
public final /* synthetic */ class C40900m implements C31045j {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f104064a;

    public /* synthetic */ C40900m(AtomicReference atomicReference) {
        this.f104064a = atomicReference;
    }

    /* renamed from: a */
    public final C31047k mo87716a(Object obj) {
        AtomicReference atomicReference = this.f104064a;
        Void voidR = (Void) obj;
        int i = C40887a0.f104053n;
        if (atomicReference.get() != null) {
            return C31053n.m124525g((ModuleInstallResponse) atomicReference.get());
        }
        return C31053n.m124524f(new ApiException(Status.f103186w));
    }
}
