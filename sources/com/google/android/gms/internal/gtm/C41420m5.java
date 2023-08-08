package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import androidx.annotation.C0348i1;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: com.google.android.gms.internal.gtm.m5 */
public final class C41420m5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41588t5 f104791a;

    public /* synthetic */ C41420m5(C41588t5 t5Var, C41396l5 l5Var) {
        this.f104791a = t5Var;
    }

    @C0348i1
    public final void run() {
        this.f104791a.f104991m = 3;
        String i = this.f104791a.f104980b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Container ");
        sb.append(i);
        sb.append(" loading failed.");
        C41493p6.m168153e(sb.toString());
        if (this.f104791a.f104992n != null) {
            for (C41132a6 a6Var : this.f104791a.f104992n) {
                if (a6Var.mo135002i()) {
                    try {
                        this.f104791a.f104987i.mo87697o2(FirebaseMessaging.f80405r, a6Var.mo134998e(), a6Var.mo134997d(), a6Var.mo134768a());
                        String e = a6Var.mo134998e();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 50);
                        sb2.append("Logged event ");
                        sb2.append(e);
                        sb2.append(" to Firebase (marked as passthrough).");
                        C41493p6.m168152d(sb2.toString());
                    } catch (RemoteException e2) {
                        C41660w5.m168644b("Error logging event with measurement proxy:", e2, this.f104791a.f104979a);
                    }
                } else {
                    String e3 = a6Var.mo134998e();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(e3).length() + 45);
                    sb3.append("Discarded event ");
                    sb3.append(e3);
                    sb3.append(" (marked as non-passthrough).");
                    C41493p6.m168152d(sb3.toString());
                }
            }
            this.f104791a.f104992n = null;
        }
    }
}
