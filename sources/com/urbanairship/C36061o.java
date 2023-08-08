package com.urbanairship;

import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.util.C9669o0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.urbanairship.o */
public class C36061o {

    /* renamed from: e */
    public static final List<String> f89104e = Arrays.asList(new String[]{C36061o.class.getName(), C36059m.class.getName()});

    /* renamed from: a */
    public String f89105a;

    /* renamed from: b */
    public int f89106b;

    /* renamed from: c */
    public boolean f89107c = true;

    /* renamed from: d */
    public final List<C36060n> f89108d = new CopyOnWriteArrayList();

    public C36061o(int i, @C0359n0 String str) {
        this.f89106b = i;
        this.f89105a = str;
    }

    @C0363p0
    /* renamed from: b */
    public static String m148425b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i = 1; i < stackTrace.length; i++) {
            String className = stackTrace[i].getClassName();
            if (!f89104e.contains(className)) {
                String[] split = className.split("\\.");
                return split[split.length - 1].replaceAll("(\\$.+)+$", "");
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m148426e(String str) {
        if (str == null) {
            return "";
        }
        String b = m148425b();
        if (b == null || str.startsWith(b)) {
            return str;
        }
        return b + " - " + str;
    }

    /* renamed from: a */
    public void mo107817a(@C0359n0 C36060n nVar) {
        this.f89108d.add(nVar);
    }

    /* renamed from: c */
    public int mo107818c() {
        return this.f89106b;
    }

    /* renamed from: d */
    public void mo107819d(int i, @C0363p0 Throwable th, @C0363p0 String str, @C0363p0 Object... objArr) {
        if (this.f89106b <= i) {
            if (str != null || th != null) {
                if (i == 3 || i == 2) {
                    str = m148426e(str);
                }
                if (C9669o0.m36224e(str)) {
                    str = "";
                } else if (objArr != null) {
                    try {
                        if (objArr.length != 0) {
                            str = String.format(Locale.ROOT, str, objArr);
                        }
                    } catch (Exception e) {
                        th = e;
                        str = "Unable to format log message: " + str;
                        i = 6;
                    }
                }
                for (C36060n a : this.f89108d) {
                    a.mo107816a(i, th, str);
                }
                if (!this.f89107c) {
                    return;
                }
                if (th == null) {
                    if (i == 7) {
                        Log.wtf(this.f89105a, str);
                    } else {
                        Log.println(i, this.f89105a, str);
                    }
                } else if (i == 7) {
                    Log.wtf(this.f89105a, str, th);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo107820f(@C0359n0 C36060n nVar) {
        this.f89108d.remove(nVar);
    }

    /* renamed from: g */
    public void mo107821g(boolean z) {
        this.f89107c = z;
    }

    /* renamed from: h */
    public void mo107822h(int i) {
        this.f89106b = i;
    }

    /* renamed from: i */
    public void mo107823i(@C0359n0 String str) {
        this.f89105a = str;
    }
}
