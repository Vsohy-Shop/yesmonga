package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0339g;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.t1 */
public final class C40842t1 extends C40754e1 {
    @C0363p0

    /* renamed from: g */
    public final IBinder f103947g;

    /* renamed from: h */
    public final /* synthetic */ C40747e f103948h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0339g
    public C40842t1(C40747e eVar, @C0363p0 int i, @C0363p0 IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.f103948h = eVar;
        this.f103947g = iBinder;
    }

    /* renamed from: f */
    public final void mo134378f(ConnectionResult connectionResult) {
        if (this.f103948h.f103836x != null) {
            this.f103948h.f103836x.mo86927O0(connectionResult);
        }
        this.f103948h.mo134346U(connectionResult);
    }

    /* renamed from: g */
    public final boolean mo134379g() {
        try {
            IBinder iBinder = this.f103947g;
            C40843u.m166202l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f103948h.mo87437N().equals(interfaceDescriptor)) {
                String N = this.f103948h.mo87437N();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(N);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface A = this.f103948h.mo87436A(this.f103947g);
            if (A == null) {
                return false;
            }
            if (!C40747e.m165798o0(this.f103948h, 2, 4, A) && !C40747e.m165798o0(this.f103948h, 3, 4, A)) {
                return false;
            }
            this.f103948h.f103811B = null;
            Bundle F = this.f103948h.mo134334F();
            C40747e eVar = this.f103948h;
            if (eVar.f103835w != null) {
                eVar.f103835w.mo86931m0(F);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
