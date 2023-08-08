package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C17318d;
import com.google.firebase.installations.local.C33093b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.z0 */
public class C33260z0 {

    /* renamed from: b */
    public static final String f80873b = "|T|";

    /* renamed from: c */
    public static final String f80874c = "*";

    /* renamed from: d */
    public static final String f80875d = "com.google.android.gms.appid";

    /* renamed from: e */
    public static final String f80876e = "com.google.android.gms.appid-no-backup";

    /* renamed from: a */
    public final SharedPreferences f80877a;

    /* renamed from: com.google.firebase.messaging.z0$a */
    public static class C33261a {

        /* renamed from: d */
        public static final String f80878d = "token";

        /* renamed from: e */
        public static final String f80879e = "appVersion";

        /* renamed from: f */
        public static final String f80880f = "timestamp";

        /* renamed from: g */
        public static final long f80881g = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f80882a;

        /* renamed from: b */
        public final String f80883b;

        /* renamed from: c */
        public final long f80884c;

        public C33261a(String str, String str2, long j) {
            this.f80882a = str;
            this.f80883b = str2;
            this.f80884c = j;
        }

        /* renamed from: a */
        public static String m134144a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to encode token: ");
                sb.append(e);
                return null;
            }
        }

        /* renamed from: c */
        public static C33261a m134145c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith(C33093b.f80281i)) {
                return new C33261a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C33261a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse token: ");
                sb.append(e);
                return null;
            }
        }

        /* renamed from: b */
        public boolean mo96244b(String str) {
            if (System.currentTimeMillis() > this.f80884c + f80881g || !str.equals(this.f80883b)) {
                return true;
            }
            return false;
        }
    }

    public C33260z0(Context context) {
        this.f80877a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        mo96237a(context, f80876e);
    }

    /* renamed from: a */
    public final void mo96237a(Context context, String str) {
        File file = new File(C17318d.m79730m(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo96242f()) {
                    mo96239c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error creating file in no backup dir: ");
                    sb.append(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo96238b(String str, String str2) {
        return str + "|T|" + str2 + C33093b.f80279g + "*";
    }

    /* renamed from: c */
    public synchronized void mo96239c() {
        this.f80877a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void mo96240d(String str, String str2) {
        String b = mo96238b(str, str2);
        SharedPreferences.Editor edit = this.f80877a.edit();
        edit.remove(b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C33261a mo96241e(String str, String str2) {
        return C33261a.m134145c(this.f80877a.getString(mo96238b(str, str2), (String) null));
    }

    /* renamed from: f */
    public synchronized boolean mo96242f() {
        return this.f80877a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void mo96243g(String str, String str2, String str3, String str4) {
        String a = C33261a.m134144a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f80877a.edit();
            edit.putString(mo96238b(str, str2), a);
            edit.commit();
        }
    }
}
