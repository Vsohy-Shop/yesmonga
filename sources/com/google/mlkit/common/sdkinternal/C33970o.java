package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32608v;
import com.google.mlkit.common.model.C33920d;
import java.util.UUID;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.o */
public class C33970o {
    @RecentlyNonNull
    @C40473a
    @C0344h1

    /* renamed from: b */
    public static final String f82467b = "com.google.mlkit.internal";
    @RecentlyNonNull
    @C40473a

    /* renamed from: c */
    public static final C32580g<?> f82468c = C32580g.m131636h(C33970o.class).mo94693b(C32608v.m131747m(C33947j.class)).mo94693b(C32608v.m131747m(Context.class)).mo94697f(C33936d0.f82355a).mo94695d();

    /* renamed from: a */
    public final Context f82469a;

    public C33970o(@RecentlyNonNull Context context) {
        this.f82469a = context;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: g */
    public static C33970o m136702g(@RecentlyNonNull C33947j jVar) {
        return (C33970o) jVar.mo98717a(C33970o.class);
    }

    @C40473a
    /* renamed from: a */
    public synchronized void mo98808a(@RecentlyNonNull C33920d dVar) {
        String d = mo98811d(dVar);
        mo98825s().edit().remove(String.format("downloading_model_id_%s", new Object[]{dVar.mo98683f()})).remove(String.format("downloading_model_hash_%s", new Object[]{dVar.mo98683f()})).remove(String.format("downloading_model_type_%s", new Object[]{d})).remove(String.format("downloading_begin_time_%s", new Object[]{dVar.mo98683f()})).remove(String.format("model_first_use_time_%s", new Object[]{dVar.mo98683f()})).apply();
    }

    @C40473a
    /* renamed from: b */
    public synchronized void mo98809b(@RecentlyNonNull C33920d dVar) {
        mo98825s().edit().remove(String.format("bad_hash_%s", new Object[]{dVar.mo98683f()})).remove("app_version").apply();
    }

    @C0348i1
    @C40473a
    /* renamed from: c */
    public synchronized void mo98810c(@RecentlyNonNull C33920d dVar) {
        mo98825s().edit().remove(String.format("current_model_hash_%s", new Object[]{dVar.mo98683f()})).commit();
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: d */
    public synchronized String mo98811d(@RecentlyNonNull C33920d dVar) {
        return mo98825s().getString(String.format("downloading_model_hash_%s", new Object[]{dVar.mo98683f()}), (String) null);
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: e */
    public synchronized Long mo98812e(@RecentlyNonNull C33920d dVar) {
        long j = mo98825s().getLong(String.format("downloading_model_id_%s", new Object[]{dVar.mo98683f()}), -1);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: f */
    public synchronized String mo98813f(@RecentlyNonNull C33920d dVar) {
        return mo98825s().getString(String.format("bad_hash_%s", new Object[]{dVar.mo98683f()}), (String) null);
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: h */
    public synchronized String mo98814h(@RecentlyNonNull C33920d dVar) {
        return mo98825s().getString(String.format("current_model_hash_%s", new Object[]{dVar.mo98683f()}), (String) null);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: i */
    public synchronized String mo98815i() {
        String string = mo98825s().getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        mo98825s().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @C40473a
    /* renamed from: j */
    public synchronized long mo98816j(@RecentlyNonNull C33920d dVar) {
        return mo98825s().getLong(String.format("downloading_begin_time_%s", new Object[]{dVar.mo98683f()}), 0);
    }

    @C40473a
    /* renamed from: k */
    public synchronized long mo98817k(@RecentlyNonNull C33920d dVar) {
        return mo98825s().getLong(String.format("model_first_use_time_%s", new Object[]{dVar.mo98683f()}), 0);
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: l */
    public synchronized String mo98818l() {
        return mo98825s().getString("app_version", (String) null);
    }

    @C40473a
    /* renamed from: m */
    public synchronized void mo98819m(long j, @RecentlyNonNull C33949l lVar) {
        String b = lVar.mo98723b();
        String a = lVar.mo98722a();
        mo98825s().edit().putString(String.format("downloading_model_hash_%s", new Object[]{b}), a).putLong(String.format("downloading_model_id_%s", new Object[]{b}), j).putLong(String.format("downloading_begin_time_%s", new Object[]{b}), SystemClock.elapsedRealtime()).apply();
    }

    @C40473a
    /* renamed from: n */
    public synchronized void mo98820n(@RecentlyNonNull C33920d dVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        mo98825s().edit().putString(String.format("bad_hash_%s", new Object[]{dVar.mo98683f()}), str).putString("app_version", str2).apply();
    }

    @C40473a
    /* renamed from: o */
    public synchronized void mo98821o(@RecentlyNonNull C33920d dVar, @RecentlyNonNull String str) {
        mo98825s().edit().putString(String.format("current_model_hash_%s", new Object[]{dVar.mo98683f()}), str).apply();
    }

    @C40473a
    /* renamed from: p */
    public synchronized void mo98822p(@RecentlyNonNull C33920d dVar, long j) {
        mo98825s().edit().putLong(String.format("model_first_use_time_%s", new Object[]{dVar.mo98683f()}), j).apply();
    }

    @RecentlyNullable
    /* renamed from: q */
    public final synchronized String mo98823q(@RecentlyNonNull String str, long j) {
        return mo98825s().getString(String.format("cached_local_model_hash_%1s_%2s", new Object[]{C40843u.m166202l(str), Long.valueOf(j)}), (String) null);
    }

    /* renamed from: r */
    public final synchronized void mo98824r(@RecentlyNonNull String str, long j, @RecentlyNonNull String str2) {
        mo98825s().edit().putString(String.format("cached_local_model_hash_%1s_%2s", new Object[]{C40843u.m166202l(str), Long.valueOf(j)}), str2).apply();
    }

    /* renamed from: s */
    public final SharedPreferences mo98825s() {
        return this.f82469a.getSharedPreferences(f82467b, 0);
    }
}
