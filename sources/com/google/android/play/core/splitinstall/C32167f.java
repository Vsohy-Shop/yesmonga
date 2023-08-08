package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.C32183a;
import com.google.android.play.core.splitinstall.model.C32184b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.f */
public abstract class C32167f {
    /* renamed from: e */
    public static C32167f m130174e(int i, @C32184b int i2, @C32183a int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            return new C32171h(i, i2, i3, j, j2, list, list2, (PendingIntent) null, (List<Intent>) null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* renamed from: f */
    public static C32167f m130175f(Bundle bundle) {
        return new C32171h(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    @Nullable
    /* renamed from: a */
    public abstract List<String> mo92955a();

    @Nullable
    /* renamed from: b */
    public abstract List<String> mo92956b();

    /* renamed from: c */
    public abstract long mo92957c();

    @Nullable
    /* renamed from: d */
    public abstract List<Intent> mo92958d();

    @C32183a
    /* renamed from: g */
    public abstract int mo92959g();

    /* renamed from: h */
    public boolean mo92960h() {
        int m = mo92965m();
        return m == 0 || m == 5 || m == 6 || m == 7;
    }

    @NonNull
    /* renamed from: i */
    public List<String> mo92961i() {
        return mo92956b() != null ? new ArrayList(mo92956b()) : new ArrayList();
    }

    @NonNull
    /* renamed from: j */
    public List<String> mo92962j() {
        return mo92955a() != null ? new ArrayList(mo92955a()) : new ArrayList();
    }

    @Nullable
    @Deprecated
    /* renamed from: k */
    public abstract PendingIntent mo92963k();

    /* renamed from: l */
    public abstract int mo92964l();

    @C32184b
    /* renamed from: m */
    public abstract int mo92965m();

    /* renamed from: n */
    public abstract long mo92966n();
}
