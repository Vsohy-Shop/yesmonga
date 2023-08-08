package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.startup.C20497c;
import androidx.tracing.C20530b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.startup.a */
public final class C20495a {

    /* renamed from: d */
    public static final String f52828d = "Startup";

    /* renamed from: e */
    public static volatile C20495a f52829e;

    /* renamed from: f */
    public static final Object f52830f = new Object();
    @C0359n0

    /* renamed from: a */
    public final Map<Class<?>, Object> f52831a = new HashMap();
    @C0359n0

    /* renamed from: b */
    public final Set<Class<? extends C20496b<?>>> f52832b = new HashSet();
    @C0359n0

    /* renamed from: c */
    public final Context f52833c;

    public C20495a(@C0359n0 Context context) {
        this.f52833c = context.getApplicationContext();
    }

    @C0359n0
    /* renamed from: e */
    public static C20495a m95528e(@C0359n0 Context context) {
        if (f52829e == null) {
            synchronized (f52830f) {
                if (f52829e == null) {
                    f52829e = new C20495a(context);
                }
            }
        }
        return f52829e;
    }

    /* renamed from: h */
    public static void m95529h(@C0359n0 C20495a aVar) {
        synchronized (f52830f) {
            f52829e = aVar;
        }
    }

    /* renamed from: a */
    public void mo61435a() {
        try {
            C20530b.m95652c(f52828d);
            mo61436b(this.f52833c.getPackageManager().getProviderInfo(new ComponentName(this.f52833c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C20530b.m95655f();
        } catch (PackageManager.NameNotFoundException e) {
            throw new StartupException((Throwable) e);
        } catch (Throwable th) {
            C20530b.m95655f();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo61436b(@C0363p0 Bundle bundle) {
        String string = this.f52833c.getString(C20497c.C20498a.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C20496b.class.isAssignableFrom(cls)) {
                            this.f52832b.add(cls);
                        }
                    }
                }
                for (Class<? extends C20496b<?>> d : this.f52832b) {
                    mo61438d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException((Throwable) e);
            }
        }
    }

    @C0359n0
    /* renamed from: c */
    public <T> T mo61437c(@C0359n0 Class<? extends C20496b<?>> cls) {
        T t;
        synchronized (f52830f) {
            t = this.f52831a.get(cls);
            if (t == null) {
                t = mo61438d(cls, new HashSet());
            }
        }
        return t;
    }

    @C0359n0
    /* renamed from: d */
    public final <T> T mo61438d(@C0359n0 Class<? extends C20496b<?>> cls, @C0359n0 Set<Class<?>> set) {
        T t;
        if (C20530b.m95657h()) {
            try {
                C20530b.m95652c(cls.getSimpleName());
            } catch (Throwable th) {
                C20530b.m95655f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f52831a.containsKey(cls)) {
                set.add(cls);
                C20496b bVar = (C20496b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C20496b<?>>> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class next : dependencies) {
                        if (!this.f52831a.containsKey(next)) {
                            mo61438d(next, set);
                        }
                    }
                }
                t = bVar.mo55933a(this.f52833c);
                set.remove(cls);
                this.f52831a.put(cls, t);
            } else {
                t = this.f52831a.get(cls);
            }
            C20530b.m95655f();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    @C0359n0
    /* renamed from: f */
    public <T> T mo61439f(@C0359n0 Class<? extends C20496b<T>> cls) {
        return mo61437c(cls);
    }

    /* renamed from: g */
    public boolean mo61440g(@C0359n0 Class<? extends C20496b<?>> cls) {
        return this.f52832b.contains(cls);
    }
}
