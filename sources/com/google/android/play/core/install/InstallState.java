package com.google.android.play.core.install;

import android.support.annotation.NonNull;
import com.google.android.play.core.install.model.C32023c;
import com.google.android.play.core.install.model.C32024d;

public abstract class InstallState {
    /* renamed from: a */
    public static InstallState m129748a(@C32024d int i, long j, long j2, @C32023c int i2, @NonNull String str) {
        return new C32020b(i, j, j2, i2, str);
    }

    /* renamed from: b */
    public abstract long mo92717b();

    @C32023c
    /* renamed from: c */
    public abstract int mo92718c();

    @C32024d
    /* renamed from: d */
    public abstract int mo92719d();

    /* renamed from: e */
    public abstract String mo92720e();

    /* renamed from: f */
    public abstract long mo92721f();
}
