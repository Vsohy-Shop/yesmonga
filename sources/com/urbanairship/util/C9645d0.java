package com.urbanairship.util;

import android.content.SharedPreferences;
import androidx.annotation.C0337f0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

/* renamed from: com.urbanairship.util.d0 */
public class C9645d0 {

    /* renamed from: a */
    public static final String f26426a = "com.urbanairship.notificationidgenerator";

    /* renamed from: b */
    public static final String f26427b = "count";

    /* renamed from: c */
    public static final int f26428c = 50;

    /* renamed from: d */
    public static int f26429d = 1000;

    /* renamed from: e */
    public static int f26430e = 40;

    /* renamed from: a */
    public static int m36132a(String str, int i) {
        return m36133b().getInt(str, i);
    }

    /* renamed from: b */
    public static SharedPreferences m36133b() {
        return UAirship.m146200l().getSharedPreferences(f26426a, 0);
    }

    /* renamed from: c */
    public static int m36134c() {
        return f26430e;
    }

    /* renamed from: d */
    public static int m36135d() {
        return f26429d;
    }

    /* renamed from: e */
    public static int m36136e() {
        int a = m36132a("count", f26429d) + 1;
        if (a < f26429d + f26430e) {
            C36059m.m148419o("Incrementing notification ID count", new Object[0]);
            m36137f("count", a);
        } else {
            C36059m.m148419o("Resetting notification ID count", new Object[0]);
            m36137f("count", f26429d);
        }
        C36059m.m148419o("Notification ID: %s", Integer.valueOf(a));
        return a;
    }

    /* renamed from: f */
    public static void m36137f(String str, int i) {
        SharedPreferences.Editor edit = m36133b().edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: g */
    public static void m36138g(@C0337f0(from = 0, mo995to = 50) int i) {
        if (i > 50) {
            C36059m.m148409e("The maximum number of notifications allowed is %s. Limiting alert id range to conform.", 50);
            i = 50;
        }
        m36137f("count", f26429d);
        f26430e = i;
    }

    /* renamed from: h */
    public static void m36139h(int i) {
        m36137f("count", i);
        f26429d = i;
    }
}
