package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.C0009b;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.browser.customtabs.g */
public abstract class C0922g implements ServiceConnection {
    @C0363p0

    /* renamed from: c */
    public Context f2924c;

    /* renamed from: androidx.browser.customtabs.g$a */
    public class C0923a extends C0904c {
        public C0923a(C0009b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public Context mo3957a() {
        return this.f2924c;
    }

    /* renamed from: b */
    public abstract void mo3909b(@C0359n0 ComponentName componentName, @C0359n0 C0904c cVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public void mo3958c(@C0359n0 Context context) {
        this.f2924c = context;
    }

    public final void onServiceConnected(@C0359n0 ComponentName componentName, @C0359n0 IBinder iBinder) {
        if (this.f2924c != null) {
            mo3909b(componentName, new C0923a(C0009b.C0011b.m51m0(iBinder), componentName, this.f2924c));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
