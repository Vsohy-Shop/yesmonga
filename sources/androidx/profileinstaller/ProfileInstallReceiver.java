package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.profileinstaller.C20009i;

public class ProfileInstallReceiver extends BroadcastReceiver {
    @C0359n0

    /* renamed from: a */
    public static final String f51174a = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @C0359n0

    /* renamed from: b */
    public static final String f51175b = "androidx.profileinstaller.action.SAVE_PROFILE";
    @C0359n0

    /* renamed from: c */
    public static final String f51176c = "androidx.profileinstaller.action.SKIP_FILE";
    @C0359n0

    /* renamed from: d */
    public static final String f51177d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    @C0359n0

    /* renamed from: e */
    public static final String f51178e = "EXTRA_SKIP_FILE_OPERATION";
    @C0359n0

    /* renamed from: f */
    public static final String f51179f = "WRITE_SKIP_FILE";
    @C0359n0

    /* renamed from: g */
    public static final String f51180g = "DELETE_SKIP_FILE";
    @C0359n0

    /* renamed from: h */
    public static final String f51181h = "EXTRA_BENCHMARK_OPERATION";
    @C0359n0

    /* renamed from: i */
    public static final String f51182i = "DROP_SHADER_CACHE";

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C19995a implements C20009i.C20013d {
        public C19995a() {
        }

        /* renamed from: a */
        public void mo59255a(int i, @C0363p0 Object obj) {
            C20009i.f51228h.mo59255a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        /* renamed from: b */
        public void mo59256b(int i, @C0363p0 Object obj) {
            C20009i.f51228h.mo59256b(i, obj);
        }
    }

    /* renamed from: a */
    public static void m92936a(@C0359n0 C20009i.C20013d dVar) {
        Process.sendSignal(Process.myPid(), 10);
        dVar.mo59255a(12, (Object) null);
    }

    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if (f51174a.equals(action)) {
                C20009i.m93003n(context, new C20006f(), new C19995a(), true);
            } else if (f51176c.equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString(f51178e);
                    if (f51179f.equals(string)) {
                        C20009i.m93004o(context, new C20006f(), new C19995a());
                    } else if (f51180g.equals(string)) {
                        C20009i.m92993d(context, new C20006f(), new C19995a());
                    }
                }
            } else if (f51175b.equals(action)) {
                m92936a(new C19995a());
            } else if (f51177d.equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString(f51181h);
                C19995a aVar = new C19995a();
                if (f51182i.equals(string2)) {
                    C19999a.m92955b(context, aVar);
                } else {
                    aVar.mo59255a(16, (Object) null);
                }
            }
        }
    }
}
