package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.C0363p0;

public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C40447g();

    /* renamed from: a */
    public Messenger f103113a;

    /* renamed from: b */
    public C40438b f103114b;

    public zzd(IBinder iBinder) {
        this.f103113a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo133585a() {
        Messenger messenger = this.f103113a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f103114b.asBinder();
    }

    /* renamed from: b */
    public final void mo133586b(Message message) throws RemoteException {
        Messenger messenger = this.f103113a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f103114b.mo133540F5(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo133585a().equals(((zzd) obj).mo133585a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo133585a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f103113a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f103114b.asBinder());
        }
    }
}
