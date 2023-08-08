package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import java.io.IOException;

/* renamed from: com.google.android.gms.cloudmessaging.y */
public final /* synthetic */ class C40465y implements C31031c {

    /* renamed from: a */
    public static final /* synthetic */ C40465y f103109a = new C40465y();

    /* renamed from: a */
    public final Object mo85756a(C31047k kVar) {
        if (kVar.mo87738v()) {
            return (Bundle) kVar.mo87734r();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(kVar.mo87733q());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", kVar.mo87733q());
    }
}
