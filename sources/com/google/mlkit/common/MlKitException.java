package com.google.mlkit.common;

import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MlKitException extends Exception {

    /* renamed from: E0 */
    public static final int f82253E0 = 16;

    /* renamed from: F0 */
    public static final int f82254F0 = 17;

    /* renamed from: G0 */
    public static final int f82255G0 = 100;

    /* renamed from: H0 */
    public static final int f82256H0 = 101;

    /* renamed from: I0 */
    public static final int f82257I0 = 102;

    /* renamed from: X */
    public static final int f82258X = 13;

    /* renamed from: Y */
    public static final int f82259Y = 14;

    /* renamed from: Z */
    public static final int f82260Z = 15;

    /* renamed from: a */
    public static final int f82261a = 1;

    /* renamed from: b */
    public static final int f82262b = 2;

    /* renamed from: c */
    public static final int f82263c = 3;

    /* renamed from: d */
    public static final int f82264d = 4;

    /* renamed from: e */
    public static final int f82265e = 5;

    /* renamed from: f */
    public static final int f82266f = 6;

    /* renamed from: g */
    public static final int f82267g = 7;

    /* renamed from: v */
    public static final int f82268v = 8;

    /* renamed from: w */
    public static final int f82269w = 9;

    /* renamed from: x */
    public static final int f82270x = 10;

    /* renamed from: y */
    public static final int f82271y = 11;

    /* renamed from: z */
    public static final int f82272z = 12;
    @C33891a
    private final int zza;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.common.MlKitException$a */
    public @interface C33891a {
    }

    @C40473a
    public MlKitException(@RecentlyNonNull String str, @C33891a int i) {
        super(C40843u.m166199i(str, "Provided message must not be empty."));
        this.zza = i;
    }

    @C33891a
    /* renamed from: a */
    public int mo98621a() {
        return this.zza;
    }

    @C40473a
    public MlKitException(@RecentlyNonNull String str, @C33891a int i, @C0363p0 Throwable th) {
        super(C40843u.m166199i(str, "Provided message must not be empty."), th);
        this.zza = i;
    }
}
