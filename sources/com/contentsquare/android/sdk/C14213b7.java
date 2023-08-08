package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.contentsquare.android.sdk.b7 */
public class C14213b7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: c */
    public static C14453jf f35111c = new C14453jf("PreferencesStore");

    /* renamed from: a */
    public final Map<C14214a, Boolean> f35112a = new WeakHashMap();

    /* renamed from: b */
    public final Context f35113b;

    /* renamed from: com.contentsquare.android.sdk.b7$a */
    public interface C14214a {
        /* renamed from: d */
        void mo34382d(String str);
    }

    public C14213b7(Context context) {
        this.f35113b = context;
        mo34672d().registerOnSharedPreferenceChangeListener(this);
    }

    /* renamed from: a */
    public float mo34669a(C14477k8 k8Var, float f) {
        return mo34672d().getFloat(k8Var.toString(), f);
    }

    /* renamed from: b */
    public int mo34670b(C14477k8 k8Var, int i) {
        return mo34672d().getInt(k8Var.toString(), i);
    }

    /* renamed from: c */
    public long mo34671c(C14477k8 k8Var, long j) {
        return mo34672d().getLong(k8Var.toString(), j);
    }

    /* renamed from: d */
    public final SharedPreferences mo34672d() {
        return this.f35113b.getSharedPreferences("CONTENTSQUARE_SHARED_PREFS", 0);
    }

    /* renamed from: e */
    public String mo34673e(C14477k8 k8Var, String str) {
        return mo34672d().getString(k8Var.toString(), str);
    }

    /* renamed from: f */
    public Set<String> mo34674f(C14477k8 k8Var, Set<String> set) {
        return mo34672d().getStringSet(k8Var.toString(), set);
    }

    /* renamed from: g */
    public void mo34675g(C14214a aVar) {
        this.f35112a.put(aVar, Boolean.TRUE);
    }

    /* renamed from: h */
    public boolean mo34676h(C14477k8 k8Var, boolean z) {
        return mo34672d().getBoolean(k8Var.toString(), z);
    }

    /* renamed from: i */
    public void mo34677i() {
        SharedPreferences.Editor edit = mo34672d().edit();
        for (C14477k8 k8Var : C14477k8.values()) {
            if (k8Var.mo35777g()) {
                edit.remove(k8Var.toString());
            }
        }
        edit.apply();
    }

    /* renamed from: j */
    public void mo34678j(C14477k8 k8Var, float f) {
        mo34672d().edit().putFloat(k8Var.toString(), f).apply();
    }

    /* renamed from: k */
    public void mo34679k(C14477k8 k8Var, int i) {
        mo34672d().edit().putInt(k8Var.toString(), i).apply();
    }

    /* renamed from: l */
    public void mo34680l(C14477k8 k8Var, long j) {
        mo34672d().edit().putLong(k8Var.toString(), j).apply();
    }

    /* renamed from: m */
    public void mo34681m(C14477k8 k8Var, String str) {
        mo34672d().edit().putString(k8Var.toString(), str).apply();
    }

    /* renamed from: n */
    public void mo34682n(C14477k8 k8Var, Set<String> set) {
        mo34672d().edit().putStringSet(k8Var.toString(), set).apply();
    }

    /* renamed from: o */
    public void mo34683o(C14477k8 k8Var, boolean z) {
        mo34672d().edit().putBoolean(k8Var.toString(), z).apply();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = new HashSet(this.f35112a.keySet()).iterator();
            while (it.hasNext()) {
                ((C14214a) it.next()).mo34382d(str);
            }
        }
    }
}
