package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C41065b;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.signin.internal.d */
public abstract class C30984d extends C41065b implements C30985e {
    public C30984d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: E8 */
    public final boolean mo87664E8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C41066c.m166935a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) C41066c.m166935a(parcel, zaa.CREATOR);
                C41066c.m166936b(parcel);
                break;
            case 4:
                Status status = (Status) C41066c.m166935a(parcel, Status.CREATOR);
                C41066c.m166936b(parcel);
                break;
            case 6:
                Status status2 = (Status) C41066c.m166935a(parcel, Status.CREATOR);
                C41066c.m166936b(parcel);
                break;
            case 7:
                Status status3 = (Status) C41066c.m166935a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C41066c.m166935a(parcel, GoogleSignInAccount.CREATOR);
                C41066c.m166936b(parcel);
                break;
            case 8:
                C41066c.m166936b(parcel);
                mo87663O1((zak) C41066c.m166935a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) C41066c.m166935a(parcel, zag.CREATOR);
                C41066c.m166936b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
