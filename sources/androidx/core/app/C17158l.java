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
import java.lang.reflect.InvocationTargetException;

@C0376v0(28)
/* renamed from: androidx.core.app.l */
public class C17158l extends AppComponentFactory {
    @C0359n0
    /* renamed from: a */
    public Activity mo51586a(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public Application mo51587b(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public ContentProvider mo51588c(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @C0359n0
    /* renamed from: d */
    public BroadcastReceiver mo51589d(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @C0359n0
    /* renamed from: e */
    public Service mo51590e(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @C0359n0
    public final Activity instantiateActivity(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.m78706a(mo51586a(classLoader, str, intent));
    }

    @C0359n0
    public final Application instantiateApplication(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.m78706a(mo51587b(classLoader, str));
    }

    @C0359n0
    public final ContentProvider instantiateProvider(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.m78706a(mo51588c(classLoader, str));
    }

    @C0359n0
    public final BroadcastReceiver instantiateReceiver(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.m78706a(mo51589d(classLoader, str, intent));
    }

    @C0359n0
    public final Service instantiateService(@C0359n0 ClassLoader classLoader, @C0359n0 String str, @C0363p0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.m78706a(mo51590e(classLoader, str, intent));
    }
}
