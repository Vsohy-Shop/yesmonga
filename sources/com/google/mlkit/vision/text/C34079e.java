package com.google.mlkit.vision.text;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* renamed from: com.google.mlkit.vision.text.e */
public interface C34079e {

    /* renamed from: a */
    public static final int f82723a = 1;

    /* renamed from: b */
    public static final int f82724b = 2;

    /* renamed from: c */
    public static final int f82725c = 3;

    /* renamed from: d */
    public static final int f82726d = 4;

    /* renamed from: e */
    public static final int f82727e = 5;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.vision.text.e$a */
    public @interface C34080a {
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: a */
    Executor mo99045a();

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    String mo99046b();

    @C40473a
    /* renamed from: c */
    boolean mo99047c();

    @C40473a
    /* renamed from: d */
    int mo99048d();

    @RecentlyNonNull
    @C40473a
    /* renamed from: e */
    String mo99049e();

    @C40473a
    @C34080a
    /* renamed from: f */
    int mo99050f();

    @RecentlyNonNull
    @C40473a
    /* renamed from: g */
    String mo99051g();
}
