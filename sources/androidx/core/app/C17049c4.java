package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p002v4.app.C0025a;

/* renamed from: androidx.core.app.c4 */
public abstract class C17049c4 extends Service {

    /* renamed from: androidx.core.app.c4$a */
    public class C17050a extends C0025a.C0027b {
        public C17050a() {
        }

        /* renamed from: a6 */
        public void mo55a6(String str) {
            C17049c4.this.mo51241c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C17049c4.this.mo51240b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: n3 */
        public void mo56n3(String str, int i, String str2) throws RemoteException {
            C17049c4.this.mo51241c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C17049c4.this.mo51239a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: q8 */
        public void mo57q8(String str, int i, String str2, Notification notification) throws RemoteException {
            C17049c4.this.mo51241c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C17049c4.this.mo51242d(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo51239a(String str, int i, String str2);

    /* renamed from: b */
    public abstract void mo51240b(String str);

    /* renamed from: c */
    public void mo51241c(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    /* renamed from: d */
    public abstract void mo51242d(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        intent.getAction().equals(C17180n4.f45409g);
        return null;
    }
}
