package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.concurrent.futures.C16564b;
import androidx.core.app.unusedapprestrictions.C17266a;
import androidx.core.app.unusedapprestrictions.C17270b;

/* renamed from: androidx.core.content.y0 */
public class C17504y0 implements ServiceConnection {
    @C0363p0
    @C0344h1

    /* renamed from: c */
    public C17270b f45806c = null;
    @C0359n0

    /* renamed from: d */
    public C16564b<Integer> f45807d;

    /* renamed from: e */
    public final Context f45808e;

    /* renamed from: f */
    public boolean f45809f = false;

    /* renamed from: androidx.core.content.y0$a */
    public class C17505a extends C17266a.C17268b {
        public C17505a() {
        }

        /* renamed from: o4 */
        public void mo51731o4(boolean z, boolean z2) throws RemoteException {
            if (!z) {
                C17504y0.this.f45807d.mo48106j0(0);
            } else if (z2) {
                C17504y0.this.f45807d.mo48106j0(3);
            } else {
                C17504y0.this.f45807d.mo48106j0(2);
            }
        }
    }

    public C17504y0(@C0359n0 Context context) {
        this.f45808e = context;
    }

    /* renamed from: a */
    public void mo51919a(@C0359n0 C16564b<Integer> bVar) {
        if (!this.f45809f) {
            this.f45809f = true;
            this.f45807d = bVar;
            this.f45808e.bindService(new Intent(C17501x0.f45802b).setPackage(C17486s0.m80257b(this.f45808e.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    /* renamed from: b */
    public void mo51920b() {
        if (this.f45809f) {
            this.f45809f = false;
            this.f45808e.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    /* renamed from: c */
    public final C17266a mo51921c() {
        return new C17505a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C17270b m0 = C17270b.C17272b.m79666m0(iBinder);
        this.f45806c = m0;
        try {
            m0.mo51737e6(mo51921c());
        } catch (RemoteException unused) {
            this.f45807d.mo48106j0(0);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f45806c = null;
    }
}
