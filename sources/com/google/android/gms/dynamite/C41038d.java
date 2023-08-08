package com.google.android.gms.dynamite;

import android.os.Looper;
import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.dynamite.d */
public final class C41038d {
    @C0363p0
    @C0323b0("DynamiteLoaderV2ClassLoader.class")

    /* renamed from: a */
    public static volatile ClassLoader f104340a;
    @C0363p0
    @C0323b0("DynamiteLoaderV2ClassLoader.class")

    /* renamed from: b */
    public static volatile Thread f104341b;

    @C0363p0
    /* renamed from: a */
    public static synchronized ClassLoader m166894a() {
        ClassLoader classLoader;
        synchronized (C41038d.class) {
            if (f104340a == null) {
                f104340a = m166895b();
            }
            classLoader = f104340a;
        }
        return classLoader;
    }

    @C0363p0
    /* renamed from: b */
    public static synchronized ClassLoader m166895b() {
        synchronized (C41038d.class) {
            ClassLoader classLoader = null;
            if (f104341b == null) {
                f104341b = m166896c();
                if (f104341b == null) {
                    return null;
                }
            }
            synchronized (f104341b) {
                try {
                    classLoader = f104341b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get thread context classloader ");
                    sb.append(message);
                }
            }
            return classLoader;
        }
    }

    @C0363p0
    /* renamed from: c */
    public static synchronized Thread m166896c() {
        C41037c cVar;
        C41037c cVar2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (C41038d.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            cVar = null;
                            break;
                        }
                        cVar = threadArr[i];
                        if ("GmsDynamite".equals(cVar.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (cVar == null) {
                        try {
                            cVar2 = new C41037c(threadGroup, "GmsDynamite");
                            try {
                                cVar2.setContextClassLoader((ClassLoader) null);
                                cVar2.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            cVar2 = cVar;
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to enumerate thread/threadgroup ");
                            sb.append(message);
                            cVar = cVar2;
                            return cVar;
                        }
                        cVar = cVar2;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    cVar2 = null;
                    String message2 = e.getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to enumerate thread/threadgroup ");
                    sb2.append(message2);
                    cVar = cVar2;
                    return cVar;
                }
            }
            return cVar;
        }
    }
}
