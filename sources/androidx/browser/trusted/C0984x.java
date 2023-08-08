package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.C0017a;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.browser.trusted.x */
public class C0984x {

    /* renamed from: a */
    public final C0017a f3058a;

    public C0984x(@C0359n0 C0017a aVar) {
        this.f3058a = aVar;
    }

    @C0363p0
    /* renamed from: a */
    public static C0984x m4349a(@C0363p0 IBinder iBinder) {
        C0017a aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            aVar = C0017a.C0019b.m78m0(iBinder);
        }
        if (aVar == null) {
            return null;
        }
        return new C0984x(aVar);
    }

    /* renamed from: b */
    public void mo4076b(@C0359n0 String str, @C0359n0 Bundle bundle) throws RemoteException {
        this.f3058a.mo37l8(str, bundle);
    }
}
