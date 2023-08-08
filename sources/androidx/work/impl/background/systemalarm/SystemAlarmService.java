package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.C0353k0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19391a0;
import androidx.work.C21377l;
import androidx.work.impl.background.systemalarm.C21116g;
import androidx.work.impl.utils.C21300c0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends C19391a0 implements C21116g.C21119c {

    /* renamed from: d */
    public static final String f54504d = C21377l.m98584i("SystemAlarmService");

    /* renamed from: b */
    public C21116g f54505b;

    /* renamed from: c */
    public boolean f54506c;

    @C0353k0
    /* renamed from: b */
    public void mo63233b() {
        this.f54506c = true;
        C21377l.m98582e().mo63774a(f54504d, "All commands completed in dispatcher");
        C21300c0.m98370a();
        stopSelf();
    }

    @C0353k0
    /* renamed from: e */
    public final void mo63234e() {
        C21116g gVar = new C21116g(this);
        this.f54505b = gVar;
        gVar.mo63262l(this);
    }

    public void onCreate() {
        super.onCreate();
        mo63234e();
        this.f54506c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f54506c = true;
        this.f54505b.mo63260j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f54506c) {
            C21377l.m98582e().mo63778f(f54504d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f54505b.mo63260j();
            mo63234e();
            this.f54506c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f54505b.mo63252a(intent, i2);
        return 3;
    }
}
