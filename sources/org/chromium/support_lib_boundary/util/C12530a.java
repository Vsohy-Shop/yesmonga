package org.chromium.support_lib_boundary.util;

import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: org.chromium.support_lib_boundary.util.a */
public class C12530a {

    /* renamed from: a */
    public static final /* synthetic */ boolean f30527a = false;

    @C0376v0(19)
    /* renamed from: org.chromium.support_lib_boundary.util.a$a */
    public static class C12531a implements InvocationHandler {

        /* renamed from: a */
        public final Object f30528a;

        public C12531a(@C0359n0 Object obj) {
            this.f30528a = obj;
        }

        @C0359n0
        /* renamed from: a */
        public Object mo27596a() {
            return this.f30528a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return C12530a.m51114f(method, this.f30528a.getClass().getClassLoader()).invoke(this.f30528a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    @C0363p0
    /* renamed from: a */
    public static <T> T m51109a(@C0359n0 Class<T> cls, @C0363p0 InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C12530a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m51110b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m51117i()) {
                if (collection.contains(str + C12532b.f30555a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m51111c(String[] strArr, String str) {
        return m51110b(Arrays.asList(strArr), str);
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: d */
    public static InvocationHandler m51112d(@C0363p0 Object obj) {
        if (obj == null) {
            return null;
        }
        return new C12531a(obj);
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: e */
    public static InvocationHandler[] m51113e(@C0363p0 Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[length];
        for (int i = 0; i < length; i++) {
            invocationHandlerArr[i] = m51112d(objArr[i]);
        }
        return invocationHandlerArr;
    }

    /* renamed from: f */
    public static Method m51114f(Method method, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: g */
    public static Object m51115g(@C0363p0 InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C12531a) invocationHandler).mo27596a();
    }

    /* renamed from: h */
    public static boolean m51116h(Object obj, String str) {
        try {
            return Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m51117i() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
