package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.cloudmessaging.r */
public final class C40458r {
    @C0363p0

    /* renamed from: a */
    public final Messenger f103093a;
    @C0363p0

    /* renamed from: b */
    public final zzd f103094b;

    public C40458r(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f103093a = new Messenger(iBinder);
            this.f103094b = null;
        } else if (C40438b.f103057j.equals(interfaceDescriptor)) {
            this.f103094b = new zzd(iBinder);
            this.f103093a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo133573a(Message message) throws RemoteException {
        Messenger messenger = this.f103093a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzd = this.f103094b;
        if (zzd != null) {
            zzd.mo133586b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
