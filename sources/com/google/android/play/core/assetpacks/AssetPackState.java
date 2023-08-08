package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.play.core.assetpacks.model.C31957a;
import com.google.android.play.core.assetpacks.model.C31958b;
import com.google.android.play.core.internal.C32061j1;

public abstract class AssetPackState {
    /* renamed from: d */
    public static AssetPackState m129378d(@NonNull String str, @C31958b int i, @C31957a int i2, long j, long j2, double d, int i3, String str2) {
        return new C31931h0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2);
    }

    /* renamed from: e */
    public static AssetPackState m129379e(Bundle bundle, String str, C31998w0 w0Var, C31895a0 a0Var) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int c = a0Var.mo92479c(bundle2.getInt(C32061j1.m129824e("status", str2)), str2);
        int i = bundle2.getInt(C32061j1.m129824e("error_code", str2));
        long j = bundle2.getLong(C32061j1.m129824e("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C32061j1.m129824e("total_bytes_to_download", str2));
        double b = w0Var.mo92703b(str2);
        long j3 = bundle2.getLong(C32061j1.m129824e("pack_version", str2));
        long j4 = bundle2.getLong(C32061j1.m129824e("pack_base_version", str2));
        int i2 = 1;
        if (!(c != 4 || j4 == 0 || j4 == j3)) {
            i2 = 2;
        }
        return m129378d(str, c, i, j, j2, b, i2, bundle2.getString(C32061j1.m129824e("pack_version_tag", str2), ""));
    }

    /* renamed from: a */
    public abstract int mo92460a();

    /* renamed from: b */
    public abstract String mo92461b();

    /* renamed from: c */
    public abstract long mo92462c();

    @C31957a
    /* renamed from: f */
    public abstract int mo92463f();

    /* renamed from: g */
    public abstract String mo92464g();

    @C31958b
    /* renamed from: h */
    public abstract int mo92465h();

    /* renamed from: i */
    public abstract long mo92466i();

    /* renamed from: j */
    public abstract int mo92467j();
}
