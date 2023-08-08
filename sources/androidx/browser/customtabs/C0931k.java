package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0005a;
import android.support.customtabs.C0013c;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.browser.customtabs.k */
public class C0931k extends Service {

    /* renamed from: a */
    public C0013c.C0015b f2939a = new C0932a();

    /* renamed from: androidx.browser.customtabs.k$a */
    public class C0932a extends C0013c.C0015b {
        public C0932a() {
        }

        /* renamed from: b7 */
        public void mo30b7(@C0359n0 C0005a aVar, @C0359n0 String str, @C0363p0 Bundle bundle) throws RemoteException {
            aVar.mo5S0(str, bundle);
        }

        /* renamed from: y2 */
        public void mo31y2(@C0359n0 C0005a aVar, @C0363p0 Bundle bundle) throws RemoteException {
            aVar.mo7o8(bundle);
        }
    }

    @C0359n0
    public IBinder onBind(@C0363p0 Intent intent) {
        return this.f2939a;
    }
}
