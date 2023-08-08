package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.C40974d0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

@C40974d0
/* renamed from: com.google.android.gms.analytics.h */
public class C40396h implements C40375c {

    /* renamed from: a */
    public final TreeSet<String> f102956a = new TreeSet<>();

    public C40396h(@RecentlyNonNull Context context, @RecentlyNonNull Collection<String> collection) {
        mo133387e(context, collection);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public String mo133267a(@C0363p0 String str, @RecentlyNonNull Throwable th) {
        return mo133386d(mo133385c(th), mo133384b(mo133385c(th)), str);
    }

    @RecentlyNullable
    /* renamed from: b */
    public StackTraceElement mo133384b(@RecentlyNonNull Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || (r0 = stackTrace.length) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator<String> it = this.f102956a.iterator();
            while (it.hasNext()) {
                if (className.startsWith(it.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }

    @RecentlyNonNull
    /* renamed from: c */
    public Throwable mo133385c(@RecentlyNonNull Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public String mo133386d(@RecentlyNonNull Throwable th, @C0363p0 StackTraceElement stackTraceElement, @C0363p0 String str) {
        String str2;
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            if (split == null || (length = split.length) <= 0) {
                str2 = "unknown";
            } else {
                str2 = split[length - 1];
            }
            sb.append(String.format(" (@%s:%s:%s)", new Object[]{str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
        }
        if (str != null) {
            sb.append(String.format(" {%s}", new Object[]{str}));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public void mo133387e(@RecentlyNonNull Context context, @RecentlyNonNull Collection<String> collection) {
        this.f102956a.clear();
        HashSet<String> hashSet = new HashSet<>();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            Iterator<String> it = this.f102956a.iterator();
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (str.startsWith(next)) {
                    z = false;
                } else if (next.startsWith(str)) {
                    this.f102956a.remove(next);
                }
            }
            if (z) {
                this.f102956a.add(str);
            }
        }
    }
}
