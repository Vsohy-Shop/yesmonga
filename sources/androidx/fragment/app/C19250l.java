package androidx.fragment.app;

import androidx.annotation.C0359n0;
import androidx.collection.C1886l;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.l */
public class C19250l {

    /* renamed from: a */
    public static final C1886l<ClassLoader, C1886l<String, Class<?>>> f49545a = new C1886l<>();

    /* renamed from: b */
    public static boolean m90282b(@C0359n0 ClassLoader classLoader, @C0359n0 String str) {
        try {
            return Fragment.class.isAssignableFrom(m90283c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @C0359n0
    /* renamed from: c */
    public static Class<?> m90283c(@C0359n0 ClassLoader classLoader, @C0359n0 String str) throws ClassNotFoundException {
        C1886l<ClassLoader, C1886l<String, Class<?>>> lVar = f49545a;
        C1886l lVar2 = lVar.get(classLoader);
        if (lVar2 == null) {
            lVar2 = new C1886l();
            lVar.put(classLoader, lVar2);
        }
        Class<?> cls = (Class) lVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        lVar2.put(str, cls2);
        return cls2;
    }

    @C0359n0
    /* renamed from: d */
    public static Class<? extends Fragment> m90284d(@C0359n0 ClassLoader classLoader, @C0359n0 String str) {
        try {
            return m90283c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    @C0359n0
    /* renamed from: a */
    public Fragment mo56932a(@C0359n0 ClassLoader classLoader, @C0359n0 String str) {
        try {
            return (Fragment) m90284d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
