package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.v1 */
public abstract class C32097v1 extends C32067l1 implements C32100w1 {
    public C32097v1() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* renamed from: m0 */
    public final boolean mo92735m0(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo92636D0(parcel.readInt(), (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR);
                mo92643a2(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR);
                mo92641W2(readInt2);
                return true;
            case 5:
                mo92639R0(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C32070m1.m129880a(parcel, creator);
                mo92645b6((Bundle) C32070m1.m129880a(parcel, creator));
                return true;
            case 7:
                mo92640V7((Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C32070m1.m129880a(parcel, creator2);
                mo92637I3((Bundle) C32070m1.m129880a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) C32070m1.m129880a(parcel, creator3);
                mo92644b3((Bundle) C32070m1.m129880a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo92638K7((Bundle) C32070m1.m129880a(parcel, creator4), (Bundle) C32070m1.m129880a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo92642X7((Bundle) C32070m1.m129880a(parcel, creator5), (Bundle) C32070m1.m129880a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo92648p8((Bundle) C32070m1.m129880a(parcel, creator6), (Bundle) C32070m1.m129880a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C32070m1.m129880a(parcel, creator7);
                Bundle bundle7 = (Bundle) C32070m1.m129880a(parcel, creator7);
                mo92647n();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C32070m1.m129880a(parcel, Bundle.CREATOR);
                mo92646i();
                return true;
            default:
                return false;
        }
    }
}
