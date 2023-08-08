package com.google.android.gms.internal.mlkit_common;

import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.mlkit_common.h9 */
public final class C42390h9 {

    /* renamed from: a */
    public static final Method f107088a;

    /* renamed from: b */
    public static final Method f107089b;

    /* renamed from: c */
    public static final Method f107090c;

    /* renamed from: d */
    public static final Field f107091d;

    /* renamed from: e */
    public static final Field f107092e;

    /* renamed from: f */
    public static final Field f107093f;

    /* renamed from: g */
    public static final Object f107094g;

    /* renamed from: h */
    public static final Throwable f107095h;

    static {
        Field field;
        Field field2;
        Method method;
        Method method2;
        Method method3;
        Field field3;
        Object obj;
        Throwable th;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            method3 = cls3.getDeclaredMethod("S_ISLNK", new Class[]{Integer.TYPE});
            try {
                method3.setAccessible(true);
                method = cls4.getDeclaredMethod("lstat", new Class[]{String.class});
            } catch (Throwable th2) {
                th = th2;
                field3 = null;
                method2 = null;
                method = method2;
                field2 = method;
                field = field2;
                th = th;
                obj = field;
                f107088a = method3;
                f107089b = method;
                f107090c = method2;
                f107091d = field2;
                f107092e = field;
                f107093f = field3;
                f107094g = obj;
                f107095h = th;
            }
            try {
                method2 = cls4.getDeclaredMethod("fstat", new Class[]{FileDescriptor.class});
            } catch (Throwable th3) {
                th = th3;
                field3 = null;
                method2 = null;
                field2 = null;
                field = field2;
                th = th;
                obj = field;
                f107088a = method3;
                f107089b = method;
                f107090c = method2;
                f107091d = field2;
                f107092e = field;
                f107093f = field3;
                f107094g = obj;
                f107095h = th;
            }
            try {
                Field declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                obj = declaredField.get(cls);
            } catch (Throwable th4) {
                th = th4;
                field3 = null;
                field2 = null;
                field = field2;
                th = th;
                obj = field;
                f107088a = method3;
                f107089b = method;
                f107090c = method2;
                f107091d = field2;
                f107092e = field;
                f107093f = field3;
                f107094g = obj;
                f107095h = th;
            }
            try {
                field2 = cls2.getField("st_dev");
                try {
                    field = cls2.getField("st_ino");
                    try {
                        field3 = cls2.getField("st_mode");
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        field3 = null;
                        th = th6;
                        f107088a = method3;
                        f107089b = method;
                        f107090c = method2;
                        f107091d = field2;
                        f107092e = field;
                        f107093f = field3;
                        f107094g = obj;
                        f107095h = th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    field = null;
                    th = th;
                    field3 = field;
                    f107088a = method3;
                    f107089b = method;
                    f107090c = method2;
                    f107091d = field2;
                    f107092e = field;
                    f107093f = field3;
                    f107094g = obj;
                    f107095h = th;
                }
                try {
                    field2.setAccessible(true);
                    field.setAccessible(true);
                    field3.setAccessible(true);
                    f107088a = method3;
                    f107089b = method;
                    f107090c = method2;
                    f107091d = field2;
                    f107092e = field;
                    f107093f = field3;
                    f107094g = obj;
                    f107095h = null;
                } catch (Throwable th8) {
                    th = th8;
                    f107088a = method3;
                    f107089b = method;
                    f107090c = method2;
                    f107091d = field2;
                    f107092e = field;
                    f107093f = field3;
                    f107094g = obj;
                    f107095h = th;
                }
            } catch (Throwable th9) {
                th = th9;
                field2 = null;
                field = null;
                th = th;
                field3 = field;
                f107088a = method3;
                f107089b = method;
                f107090c = method2;
                f107091d = field2;
                f107092e = field;
                f107093f = field3;
                f107094g = obj;
                f107095h = th;
            }
        } catch (Throwable th10) {
            th = th10;
            field3 = null;
            method3 = null;
            method2 = null;
            method = method2;
            field2 = method;
            field = field2;
            th = th;
            obj = field;
            f107088a = method3;
            f107089b = method;
            f107090c = method2;
            f107091d = field2;
            f107092e = field;
            f107093f = field3;
            f107094g = obj;
            f107095h = th;
        }
    }

    /* renamed from: a */
    public static C42412j9 m171526a(FileDescriptor fileDescriptor) throws IOException {
        return (C42412j9) m171531f(new C42573y8(fileDescriptor));
    }

    /* renamed from: d */
    public static C42412j9 m171529d(String str) throws IOException {
        return (C42412j9) m171531f(new C42379g9(str));
    }

    /* renamed from: e */
    public static C42412j9 m171530e(Object obj) throws Exception {
        long longValue = ((Long) f107091d.get(obj)).longValue();
        long longValue2 = ((Long) f107092e.get(obj)).longValue();
        int intValue = ((Integer) f107093f.get(obj)).intValue();
        return new C42412j9(longValue, longValue2, ((Boolean) f107088a.invoke((Object) null, new Object[]{Integer.valueOf(intValue)})).booleanValue());
    }

    /* renamed from: f */
    public static <T> T m171531f(Callable<T> callable) throws IOException {
        try {
            th = f107095h;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } finally {
            IOException iOException = new IOException(th);
        }
    }
}
