package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C42100o0;
import com.google.android.gms.internal.measurement.C42117p0;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.j3 */
public abstract class C30767j3 extends C42100o0 implements C30779k3 {
    public C30767j3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: m0 */
    public final boolean mo87178m0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C42117p0.m170703c(parcel);
                mo87154M2((zzaw) C42117p0.m170701a(parcel, zzaw.CREATOR), (zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                C42117p0.m170703c(parcel);
                mo87160c4((zzli) C42117p0.m170701a(parcel, zzli.CREATOR), (zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                C42117p0.m170703c(parcel);
                mo87157T2((zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C42117p0.m170703c(parcel);
                mo87165o7((zzaw) C42117p0.m170701a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C42117p0.m170703c(parcel);
                mo87162f5((zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean f = C42117p0.m170706f(parcel);
                C42117p0.m170703c(parcel);
                List z1 = mo87169z1((zzq) C42117p0.m170701a(parcel, zzq.CREATOR), f);
                parcel2.writeNoException();
                parcel2.writeTypedList(z1);
                return true;
            case 9:
                String readString3 = parcel.readString();
                C42117p0.m170703c(parcel);
                byte[] H5 = mo87152H5((zzaw) C42117p0.m170701a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(H5);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                C42117p0.m170703c(parcel);
                mo87161e3(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C42117p0.m170703c(parcel);
                String M5 = mo87155M5((zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(M5);
                return true;
            case 12:
                C42117p0.m170703c(parcel);
                mo87158Z7((zzac) C42117p0.m170701a(parcel, zzac.CREATOR), (zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                C42117p0.m170703c(parcel);
                mo87167u1((zzac) C42117p0.m170701a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                C42117p0.m170703c(parcel);
                List S3 = mo87156S3(parcel.readString(), parcel.readString(), C42117p0.m170706f(parcel), (zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(S3);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean f2 = C42117p0.m170706f(parcel);
                C42117p0.m170703c(parcel);
                List t5 = mo87166t5(readString7, readString8, readString9, f2);
                parcel2.writeNoException();
                parcel2.writeTypedList(t5);
                return true;
            case 16:
                C42117p0.m170703c(parcel);
                List a7 = mo87159a7(parcel.readString(), parcel.readString(), (zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a7);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                C42117p0.m170703c(parcel);
                List v0 = mo87168v0(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(v0);
                return true;
            case 18:
                C42117p0.m170703c(parcel);
                mo87163h4((zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                C42117p0.m170703c(parcel);
                mo87164o5((Bundle) C42117p0.m170701a(parcel, Bundle.CREATOR), (zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                C42117p0.m170703c(parcel);
                mo87153K3((zzq) C42117p0.m170701a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
