package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import androidx.annotation.C0348i1;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: com.google.android.gms.internal.gtm.p5 */
public final class C41492p5 implements Runnable {

    /* renamed from: a */
    public final C41132a6 f104856a;

    /* renamed from: b */
    public final /* synthetic */ C41588t5 f104857b;

    public C41492p5(C41588t5 t5Var, C41132a6 a6Var) {
        this.f104857b = t5Var;
        this.f104856a = a6Var;
    }

    @C0348i1
    public final void run() {
        String str;
        String str2;
        if (this.f104857b.f104991m == 2) {
            String valueOf = String.valueOf(this.f104856a.mo134998e());
            if (valueOf.length() != 0) {
                str2 = "Evaluating tags for event ".concat(valueOf);
            } else {
                str2 = new String("Evaluating tags for event ");
            }
            C41493p6.m168152d(str2);
            this.f104857b.f104990l.mo135217f(this.f104856a);
        } else if (this.f104857b.f104991m == 1) {
            this.f104857b.f104992n.add(this.f104856a);
            String e = this.f104856a.mo134998e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 30);
            sb.append("Added event ");
            sb.append(e);
            sb.append(" to pending queue.");
            C41493p6.m168152d(sb.toString());
        } else if (this.f104857b.f104991m == 3) {
            String e2 = this.f104856a.mo134998e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 61);
            sb2.append("Failed to evaluate tags for event ");
            sb2.append(e2);
            sb2.append(" (container failed to load)");
            C41493p6.m168152d(sb2.toString());
            if (this.f104856a.mo135002i()) {
                try {
                    this.f104857b.f104987i.mo87697o2(FirebaseMessaging.f80405r, this.f104856a.mo134998e(), this.f104856a.mo134997d(), this.f104856a.mo134768a());
                    String e3 = this.f104856a.mo134998e();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(e3).length() + 38);
                    sb3.append("Logged passthrough event ");
                    sb3.append(e3);
                    sb3.append(" to Firebase.");
                    C41493p6.m168152d(sb3.toString());
                } catch (RemoteException e4) {
                    C41660w5.m168644b("Error logging event with measurement proxy:", e4, this.f104857b.f104979a);
                }
            } else {
                String valueOf2 = String.valueOf(this.f104856a.mo134998e());
                if (valueOf2.length() != 0) {
                    str = "Discarded non-passthrough event ".concat(valueOf2);
                } else {
                    str = new String("Discarded non-passthrough event ");
                }
                C41493p6.m168152d(str);
            }
        }
    }
}
