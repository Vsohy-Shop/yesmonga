package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.content.Context;
import dagger.hilt.android.internal.C10184a;
import dagger.hilt.internal.C10274c;
import dagger.hilt.internal.C10280f;

/* renamed from: dagger.hilt.android.internal.managers.e */
public final class C10227e {
    /* renamed from: a */
    public static Object m38468a(Context context) {
        Application a = C10184a.m38402a(context.getApplicationContext());
        C10280f.m38505a(a instanceof C10274c, "Hilt BroadcastReceiver must be attached to an @AndroidEntryPoint Application. Found: %s", a.getClass());
        return ((C10274c) a).generatedComponent();
    }
}
