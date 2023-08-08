package com.google.android.play.core.internal;

import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.core.internal.k */
public final class C32062k {

    /* renamed from: a */
    public final String f78274a;

    public C32062k(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f78274a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    public static String m129841g(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    "Unable to format ".concat(valueOf);
                }
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo92775a(String str, @Nullable Object... objArr) {
        mo92780f(3, str, objArr);
    }

    /* renamed from: b */
    public final void mo92776b(String str, @Nullable Object... objArr) {
        mo92780f(6, str, objArr);
    }

    /* renamed from: c */
    public final void mo92777c(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m129841g(this.f78274a, str, objArr);
        }
    }

    /* renamed from: d */
    public final void mo92778d(String str, @Nullable Object... objArr) {
        mo92780f(4, str, objArr);
    }

    /* renamed from: e */
    public final void mo92779e(String str, @Nullable Object... objArr) {
        mo92780f(5, str, objArr);
    }

    /* renamed from: f */
    public final int mo92780f(int i, String str, @Nullable Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m129841g(this.f78274a, str, objArr));
        }
        return 0;
    }
}
