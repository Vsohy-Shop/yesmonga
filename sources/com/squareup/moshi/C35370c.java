package com.squareup.moshi;

import com.squareup.moshi.internal.C35393c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.moshi.c */
public abstract class C35370c<T> {

    /* renamed from: com.squareup.moshi.c$a */
    public class C35371a extends C35370c<T> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f86920a;

        /* renamed from: b */
        public final /* synthetic */ Class f86921b;

        public C35371a(Constructor constructor, Class cls) {
            this.f86920a = constructor;
            this.f86921b = cls;
        }

        /* renamed from: b */
        public T mo105955b() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.f86920a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.f86921b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$b */
    public class C35372b extends C35370c<T> {

        /* renamed from: a */
        public final /* synthetic */ Method f86922a;

        /* renamed from: b */
        public final /* synthetic */ Object f86923b;

        /* renamed from: c */
        public final /* synthetic */ Class f86924c;

        public C35372b(Method method, Object obj, Class cls) {
            this.f86922a = method;
            this.f86923b = obj;
            this.f86924c = cls;
        }

        /* renamed from: b */
        public T mo105955b() throws InvocationTargetException, IllegalAccessException {
            return this.f86922a.invoke(this.f86923b, new Object[]{this.f86924c});
        }

        public String toString() {
            return this.f86924c.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$c */
    public class C35373c extends C35370c<T> {

        /* renamed from: a */
        public final /* synthetic */ Method f86925a;

        /* renamed from: b */
        public final /* synthetic */ Class f86926b;

        /* renamed from: c */
        public final /* synthetic */ int f86927c;

        public C35373c(Method method, Class cls, int i) {
            this.f86925a = method;
            this.f86926b = cls;
            this.f86927c = i;
        }

        /* renamed from: b */
        public T mo105955b() throws InvocationTargetException, IllegalAccessException {
            return this.f86925a.invoke((Object) null, new Object[]{this.f86926b, Integer.valueOf(this.f86927c)});
        }

        public String toString() {
            return this.f86926b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$d */
    public class C35374d extends C35370c<T> {

        /* renamed from: a */
        public final /* synthetic */ Method f86928a;

        /* renamed from: b */
        public final /* synthetic */ Class f86929b;

        public C35374d(Method method, Class cls) {
            this.f86928a = method;
            this.f86929b = cls;
        }

        /* renamed from: b */
        public T mo105955b() throws InvocationTargetException, IllegalAccessException {
            return this.f86928a.invoke((Object) null, new Object[]{this.f86929b, Object.class});
        }

        public String toString() {
            return this.f86929b.getName();
        }
    }

    /* renamed from: a */
    public static <T> C35370c<T> m145778a(Class<?> cls) {
        Class<ObjectStreamClass> cls2 = ObjectStreamClass.class;
        Class<Class> cls3 = Class.class;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C35371a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls4 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls4.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C35372b(cls4.getMethod("allocateInstance", new Class[]{cls3}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("getConstructorId", new Class[]{cls3});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = cls2.getDeclaredMethod("newInstance", new Class[]{cls3, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C35373c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    throw C35393c.m145823v(e);
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls3, cls3});
                        declaredMethod3.setAccessible(true);
                        return new C35374d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public abstract T mo105955b() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
