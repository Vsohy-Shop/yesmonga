package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.o0 */
public abstract class C32075o0 extends C32067l1 implements C32078p0 {
    public C32075o0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* renamed from: m0 */
    public final boolean mo92735m0(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo92802D3(parcel.readInt(), (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR);
                mo92812w3(readInt);
                return true;
            case 4:
                mo92801D0(parcel.readInt(), (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo92803E6(parcel.readInt(), (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                mo92805G6((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo92808V(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                mo92811r8((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                mo92806H((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle2 = (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR);
                mo92810m();
                return true;
            case 11:
                Bundle bundle3 = (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR);
                mo92809l();
                return true;
            case 12:
                mo92807K0((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo92804F0((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
