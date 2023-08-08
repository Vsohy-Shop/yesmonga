package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

@C0376v0(api = 28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface C17005a {
        /* renamed from: a */
        Object mo51176a();
    }

    /* renamed from: a */
    public static <T> T m78706a(T t) {
        T a;
        if (!(t instanceof C17005a) || (a = ((C17005a) t).mo51176a()) == null) {
            return t;
        }
        return a;
    }

    @C0359n0
    public Activity instantiateActivity(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) m78706a(super.instantiateActivity(classLoader, str, intent));
    }

    @C0359n0
    public Application instantiateApplication(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) m78706a(super.instantiateApplication(classLoader, str));
    }

    @C0359n0
    public ContentProvider instantiateProvider(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) m78706a(super.instantiateProvider(classLoader, str));
    }

    @C0359n0
    public BroadcastReceiver instantiateReceiver(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) m78706a(super.instantiateReceiver(classLoader, str, intent));
    }

    @C0359n0
    public Service instantiateService(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) m78706a(super.instantiateService(classLoader, str, intent));
    }
}
