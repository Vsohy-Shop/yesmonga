package com.google.android.play.core.internal;

import android.os.Build;
import java.io.File;

/* renamed from: com.google.android.play.core.internal.a0 */
public final class C32028a0 {
    /* renamed from: a */
    public static C32107z m129761a() {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return new C32045e0((short[]) null);
            case 25:
                return new C32045e0((int[]) null);
            case 26:
                return new C32045e0((boolean[]) null);
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new C32045e0((float[]) null);
                }
                break;
        }
        return new C32045e0((byte[][]) null);
    }

    /* renamed from: b */
    public static String m129762b(File file) {
        if (file.getName().endsWith(".apk")) {
            String str = "";
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: c */
    public static void m129763c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static <T> void m129764d(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }
}
