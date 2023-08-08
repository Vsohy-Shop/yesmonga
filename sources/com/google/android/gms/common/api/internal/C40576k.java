package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C41065b;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.api.internal.k */
public interface C40576k extends IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    public static abstract class C40577a extends C41065b implements C40576k {
        public C40577a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @C0359n0
        /* renamed from: F8 */
        public static C40576k m165204F8(@C0359n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof C40576k) {
                return (C40576k) queryLocalInterface;
            }
            return new C40535d2(iBinder);
        }

        /* renamed from: E8 */
        public final boolean mo87664E8(int i, @C0359n0 Parcel parcel, @C0359n0 Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            C41066c.m166936b(parcel);
            mo85758f6((Status) C41066c.m166935a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: f6 */
    void mo85758f6(@C0359n0 Status status) throws RemoteException;
}
