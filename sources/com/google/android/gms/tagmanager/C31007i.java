package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.C41534r;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.i */
public final class C31007i extends C41534r implements C31011k {
    public C31007i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    /* renamed from: F2 */
    public final void mo87699F2(String str, Map map) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeString(str);
        m0.writeMap(map);
        mo135790O0(1, m0);
    }

    /* renamed from: e2 */
    public final String mo87700e2(String str, Map map) throws RemoteException {
        Parcel m0 = mo135793m0();
        m0.writeString(str);
        m0.writeMap(map);
        Parcel H0 = mo135789H0(2, m0);
        String readString = H0.readString();
        H0.recycle();
        return readString;
    }
}
