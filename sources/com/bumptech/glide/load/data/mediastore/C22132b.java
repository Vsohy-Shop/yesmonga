package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.urbanairship.iam.C9127a0;

/* renamed from: com.bumptech.glide.load.data.mediastore.b */
public final class C22132b {

    /* renamed from: a */
    public static final int f56830a = 512;

    /* renamed from: b */
    public static final int f56831b = 384;

    /* renamed from: a */
    public static boolean m100805a(Uri uri) {
        return m100806b(uri) && !m100809e(uri);
    }

    /* renamed from: b */
    public static boolean m100806b(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m100807c(Uri uri) {
        return m100806b(uri) && m100809e(uri);
    }

    /* renamed from: d */
    public static boolean m100808d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    public static boolean m100809e(Uri uri) {
        return uri.getPathSegments().contains(C9127a0.f24710e);
    }
}
