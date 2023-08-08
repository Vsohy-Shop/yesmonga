package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.C0363p0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.backends.k */
public class C40113k implements C40106e {

    /* renamed from: d */
    public static final String f102337d = "BackendRegistry";

    /* renamed from: e */
    public static final String f102338e = "backend:";

    /* renamed from: a */
    public final C40114a f102339a;

    /* renamed from: b */
    public final C40111i f102340b;

    /* renamed from: c */
    public final Map<String, C40116m> f102341c;

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    public static class C40114a {

        /* renamed from: a */
        public final Context f102342a;

        /* renamed from: b */
        public Map<String, String> f102343b = null;

        public C40114a(Context context) {
            this.f102342a = context;
        }

        /* renamed from: d */
        public static Bundle m163317d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> mo132719a(Context context) {
            Bundle d = m163317d(context);
            if (d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String next : d.keySet()) {
                Object obj = d.get(next);
                if ((obj instanceof String) && next.startsWith(C40113k.f102338e)) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, next.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        @C0363p0
        /* renamed from: b */
        public C40105d mo132720b(String str) {
            String str2 = mo132721c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C40105d) Class.forName(str2).asSubclass(C40105d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", new Object[]{str2});
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> mo132721c() {
            if (this.f102343b == null) {
                this.f102343b = mo132719a(this.f102342a);
            }
            return this.f102343b;
        }
    }

    @Inject
    public C40113k(Context context, C40111i iVar) {
        this(new C40114a(context), iVar);
    }

    @C0363p0
    public synchronized C40116m get(String str) {
        if (this.f102341c.containsKey(str)) {
            return this.f102341c.get(str);
        }
        C40105d b = this.f102339a.mo132720b(str);
        if (b == null) {
            return null;
        }
        C40116m create = b.create(this.f102340b.mo132717a(str));
        this.f102341c.put(str, create);
        return create;
    }

    public C40113k(C40114a aVar, C40111i iVar) {
        this.f102341c = new HashMap();
        this.f102339a = aVar;
        this.f102340b = iVar;
    }
}
