package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.C1641m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.volley.s */
public class C21776s {

    /* renamed from: a */
    public static String f56328a = "Volley";

    /* renamed from: b */
    public static boolean f56329b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    public static final String f56330c = C21776s.class.getName();

    /* renamed from: com.android.volley.s$a */
    public static class C21777a {

        /* renamed from: c */
        public static final boolean f56331c = C21776s.f56329b;

        /* renamed from: d */
        public static final long f56332d = 0;

        /* renamed from: a */
        public final List<C21778a> f56333a = new ArrayList();

        /* renamed from: b */
        public boolean f56334b = false;

        /* renamed from: com.android.volley.s$a$a */
        public static class C21778a {

            /* renamed from: a */
            public final String f56335a;

            /* renamed from: b */
            public final long f56336b;

            /* renamed from: c */
            public final long f56337c;

            public C21778a(String str, long j, long j2) {
                this.f56335a = str;
                this.f56336b = j;
                this.f56337c = j2;
            }
        }

        /* renamed from: a */
        public synchronized void mo64961a(String str, long j) {
            if (!this.f56334b) {
                this.f56333a.add(new C21778a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: b */
        public synchronized void mo64962b(String str) {
            this.f56334b = true;
            long c = mo64963c();
            if (c > 0) {
                long j = this.f56333a.get(0).f56337c;
                C21776s.m100098b("(%-4d ms) %s", Long.valueOf(c), str);
                for (C21778a next : this.f56333a) {
                    long j2 = next.f56337c;
                    C21776s.m100098b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(next.f56336b), next.f56335a);
                    j = j2;
                }
            }
        }

        /* renamed from: c */
        public final long mo64963c() {
            if (this.f56333a.size() == 0) {
                return 0;
            }
            long j = this.f56333a.get(0).f56337c;
            List<C21778a> list = this.f56333a;
            return list.get(list.size() - 1).f56337c - j;
        }

        public void finalize() throws Throwable {
            if (!this.f56334b) {
                mo64962b("Request on the loose");
                C21776s.m100099c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static String m100097a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = C1641m.f4590a;
                break;
            } else if (!stackTrace[i].getClassName().equals(f56330c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* renamed from: b */
    public static void m100098b(String str, Object... objArr) {
        m100097a(str, objArr);
    }

    /* renamed from: c */
    public static void m100099c(String str, Object... objArr) {
        m100097a(str, objArr);
    }

    /* renamed from: d */
    public static void m100100d(Throwable th, String str, Object... objArr) {
        m100097a(str, objArr);
    }

    /* renamed from: e */
    public static void m100101e(String str) {
        m100098b("Changing log tag to %s", str);
        f56328a = str;
        f56329b = Log.isLoggable(str, 2);
    }

    /* renamed from: f */
    public static void m100102f(String str, Object... objArr) {
        if (f56329b) {
            m100097a(str, objArr);
        }
    }

    /* renamed from: g */
    public static void m100103g(String str, Object... objArr) {
        Log.wtf(f56328a, m100097a(str, objArr));
    }

    /* renamed from: h */
    public static void m100104h(Throwable th, String str, Object... objArr) {
        Log.wtf(f56328a, m100097a(str, objArr), th);
    }
}
