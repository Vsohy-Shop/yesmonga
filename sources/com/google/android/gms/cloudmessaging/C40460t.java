package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.cloudmessaging.t */
public abstract class C40460t<T> {

    /* renamed from: a */
    public final int f103095a;

    /* renamed from: b */
    public final C31049l<T> f103096b = new C31049l<>();

    /* renamed from: c */
    public final int f103097c;

    /* renamed from: d */
    public final Bundle f103098d;

    public C40460t(int i, int i2, Bundle bundle) {
        this.f103095a = i;
        this.f103097c = i2;
        this.f103098d = bundle;
    }

    /* renamed from: a */
    public abstract void mo133574a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo133575b();

    /* renamed from: c */
    public final void mo133576c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.f103096b.mo87742b(zzq);
    }

    /* renamed from: d */
    public final void mo133577d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.f103096b.mo87743c(t);
    }

    public final String toString() {
        int i = this.f103097c;
        int i2 = this.f103095a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo133575b());
        sb.append("}");
        return sb.toString();
    }
}
