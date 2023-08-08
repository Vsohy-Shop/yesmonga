package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.rd */
public final class C29665rd {

    /* renamed from: b */
    public static final C29665rd f71433b = new C29665rd("VisionKit", 2);

    /* renamed from: a */
    public final String f71434a = "VisionKit";

    public C29665rd(String str, int i) {
    }

    /* renamed from: f */
    public static final String m120975f(String str, Object... objArr) {
        if (objArr.length > 0) {
            return String.format(str, objArr);
        }
        return str;
    }

    /* renamed from: g */
    public static final String m120976g(Object obj, String str, Object... objArr) {
        String str2;
        String f = m120975f(str, objArr);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] split = name.split("\\.");
            int length = split.length;
            if (length == 0) {
                str2 = "";
            } else {
                str2 = split[length - 1];
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(f).length());
        sb.append("[");
        sb.append(str2);
        sb.append("] ");
        sb.append(f);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo84806a(Throwable th, String str, Object... objArr) {
        if (mo84810e(6)) {
            m120975f(str, objArr);
        }
    }

    /* renamed from: b */
    public final void mo84807b(@Nullable Object obj, String str, Object... objArr) {
        if (mo84810e(4)) {
            m120976g(obj, str, objArr);
        }
    }

    /* renamed from: c */
    public final void mo84808c(@Nullable Object obj, String str, Object... objArr) {
        if (mo84810e(2)) {
            m120976g(obj, str, objArr);
        }
    }

    /* renamed from: d */
    public final void mo84809d(@Nullable Object obj, String str, Object... objArr) {
        if (mo84810e(5)) {
            m120976g(obj, str, objArr);
        }
    }

    /* renamed from: e */
    public final boolean mo84810e(int i) {
        if (Log.isLoggable(this.f71434a, i)) {
            return true;
        }
        return false;
    }
}
