package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.app.unusedapprestrictions.C17266a;
import androidx.core.app.unusedapprestrictions.C17270b;

/* renamed from: androidx.core.content.x0 */
public abstract class C17501x0 extends Service {
    @SuppressLint({"ActionValue"})

    /* renamed from: b */
    public static final String f45802b = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: a */
    public C17270b.C17272b f45803a = new C17502a();

    /* renamed from: androidx.core.content.x0$a */
    public class C17502a extends C17270b.C17272b {
        public C17502a() {
        }

        /* renamed from: e6 */
        public void mo51737e6(@C0363p0 C17266a aVar) throws RemoteException {
            if (aVar != null) {
                C17501x0.this.mo51917a(new C17499w0(aVar));
            }
        }
    }

    /* renamed from: a */
    public abstract void mo51917a(@C0359n0 C17499w0 w0Var);

    @C0363p0
    public IBinder onBind(@C0363p0 Intent intent) {
        return this.f45803a;
    }
}
