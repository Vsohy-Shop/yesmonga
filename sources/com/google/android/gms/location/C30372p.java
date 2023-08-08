package com.google.android.gms.location;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.p */
public final class C30372p {

    /* renamed from: a */
    public static final int f72836a = 0;

    /* renamed from: b */
    public static final int f72837b = 1;

    /* renamed from: c */
    public static final int f72838c = 1000;

    /* renamed from: d */
    public static final int f72839d = 1001;

    /* renamed from: e */
    public static final int f72840e = 1002;

    /* renamed from: a */
    public static int m122198a(int i) {
        if ((i < 0 || i > 1) && (i < 1000 || i >= 1006)) {
            return 1;
        }
        return i;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static Status m122199b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
