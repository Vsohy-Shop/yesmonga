package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.inject.C33058b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.j */
public final class C32588j<T> {

    /* renamed from: c */
    public static final String f79074c = "ComponentDiscovery";

    /* renamed from: d */
    public static final String f79075d = "com.google.firebase.components.ComponentRegistrar";

    /* renamed from: e */
    public static final String f79076e = "com.google.firebase.components:";

    /* renamed from: a */
    public final T f79077a;

    /* renamed from: b */
    public final C32591c<T> f79078b;

    /* renamed from: com.google.firebase.components.j$b */
    public static class C32590b implements C32591c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f79079a;

        /* renamed from: b */
        public final Bundle mo94717b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f79079a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f79079a);
                sb.append(" has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo94716a(Context context) {
            Bundle b = mo94717b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b.keySet()) {
                if (C32588j.f79075d.equals(b.get(next)) && next.startsWith(C32588j.f79076e)) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }

        public C32590b(Class<? extends Service> cls) {
            this.f79079a = cls;
        }
    }

    @C0344h1
    /* renamed from: com.google.firebase.components.j$c */
    public interface C32591c<T> {
        /* renamed from: a */
        List<String> mo94716a(T t);
    }

    @C0344h1
    public C32588j(T t, C32591c<T> cVar) {
        this.f79077a = t;
        this.f79078b = cVar;
    }

    /* renamed from: d */
    public static C32588j<Context> m131686d(Context context, Class<? extends Service> cls) {
        return new C32588j<>(context, new C32590b(cls));
    }

    @C0363p0
    /* renamed from: e */
    public static ComponentRegistrar m131687e(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, f79075d}));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", new Object[]{str});
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    @Deprecated
    /* renamed from: b */
    public List<ComponentRegistrar> mo94714b() {
        ArrayList arrayList = new ArrayList();
        for (String e : this.f79078b.mo94716a(this.f79077a)) {
            try {
                ComponentRegistrar e2 = m131687e(e);
                if (e2 != null) {
                    arrayList.add(e2);
                }
            } catch (InvalidRegistrarException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<C33058b<ComponentRegistrar>> mo94715c() {
        ArrayList arrayList = new ArrayList();
        for (String iVar : this.f79078b.mo94716a(this.f79077a)) {
            arrayList.add(new C32587i(iVar));
        }
        return arrayList;
    }
}
