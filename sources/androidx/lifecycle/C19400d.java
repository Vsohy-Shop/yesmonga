package androidx.lifecycle;

import androidx.annotation.C0363p0;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.d */
public final class C19400d {

    /* renamed from: c */
    public static C19400d f49780c = new C19400d();

    /* renamed from: d */
    public static final int f49781d = 0;

    /* renamed from: e */
    public static final int f49782e = 1;

    /* renamed from: f */
    public static final int f49783f = 2;

    /* renamed from: a */
    public final Map<Class<?>, C19401a> f49784a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f49785b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.d$a */
    public static class C19401a {

        /* renamed from: a */
        public final Map<Lifecycle.C19372Event, List<C19402b>> f49786a = new HashMap();

        /* renamed from: b */
        public final Map<C19402b, Lifecycle.C19372Event> f49787b;

        public C19401a(Map<C19402b, Lifecycle.C19372Event> map) {
            this.f49787b = map;
            for (Map.Entry next : map.entrySet()) {
                Lifecycle.C19372Event event = (Lifecycle.C19372Event) next.getValue();
                List list = this.f49786a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f49786a.put(event, list);
                }
                list.add((C19402b) next.getKey());
            }
        }

        /* renamed from: b */
        public static void m90675b(List<C19402b> list, C19499w wVar, Lifecycle.C19372Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo57567a(wVar, event, obj);
                }
            }
        }

        /* renamed from: a */
        public void mo57566a(C19499w wVar, Lifecycle.C19372Event event, Object obj) {
            m90675b(this.f49786a.get(event), wVar, event, obj);
            m90675b(this.f49786a.get(Lifecycle.C19372Event.ON_ANY), wVar, event, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.d$b */
    public static final class C19402b {

        /* renamed from: a */
        public final int f49788a;

        /* renamed from: b */
        public final Method f49789b;

        public C19402b(int i, Method method) {
            this.f49788a = i;
            this.f49789b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void mo57567a(C19499w wVar, Lifecycle.C19372Event event, Object obj) {
            try {
                int i = this.f49788a;
                if (i == 0) {
                    this.f49789b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f49789b.invoke(obj, new Object[]{wVar});
                } else if (i == 2) {
                    this.f49789b.invoke(obj, new Object[]{wVar, event});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19402b)) {
                return false;
            }
            C19402b bVar = (C19402b) obj;
            if (this.f49788a != bVar.f49788a || !this.f49789b.getName().equals(bVar.f49789b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f49788a * 31) + this.f49789b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C19401a mo57561a(Class<?> cls, @C0363p0 Method[] methodArr) {
        int i;
        C19401a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo57563c(superclass)) == null)) {
            hashMap.putAll(c.f49787b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo57563c(c2).f49787b.entrySet()) {
                mo57565e(hashMap, (C19402b) next.getKey(), (Lifecycle.C19372Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = mo57562b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C19428i0 i0Var = (C19428i0) method.getAnnotation(C19428i0.class);
            if (i0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (C19499w.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.C19372Event value = i0Var.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.C19372Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.C19372Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo57565e(hashMap, new C19402b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C19401a aVar = new C19401a(hashMap);
        this.f49784a.put(cls, aVar);
        this.f49785b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] mo57562b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C19401a mo57563c(Class<?> cls) {
        C19401a aVar = this.f49784a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return mo57561a(cls, (Method[]) null);
    }

    /* renamed from: d */
    public boolean mo57564d(Class<?> cls) {
        Boolean bool = this.f49785b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = mo57562b(cls);
        for (Method annotation : b) {
            if (((C19428i0) annotation.getAnnotation(C19428i0.class)) != null) {
                mo57561a(cls, b);
                return true;
            }
        }
        this.f49785b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void mo57565e(Map<C19402b, Lifecycle.C19372Event> map, C19402b bVar, Lifecycle.C19372Event event, Class<?> cls) {
        Lifecycle.C19372Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f49789b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }
}
