package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.drawable.l */
public class C22466l implements C22278g<Uri, Drawable> {

    /* renamed from: b */
    public static final String f57599b = "android";

    /* renamed from: c */
    public static final int f57600c = 0;

    /* renamed from: d */
    public static final int f57601d = 2;

    /* renamed from: e */
    public static final int f57602e = 0;

    /* renamed from: f */
    public static final int f57603f = 1;

    /* renamed from: g */
    public static final int f57604g = 1;

    /* renamed from: h */
    public static final int f57605h = 0;

    /* renamed from: a */
    public final Context f57606a;

    public C22466l(Context context) {
        this.f57606a = context.getApplicationContext();
    }

    @C0363p0
    /* renamed from: c */
    public C22270s<Drawable> mo66237b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        Context d = mo66484d(uri, uri.getAuthority());
        return C22465k.m101938e(C22462h.m101923b(this.f57606a, d, mo66487g(d, uri)));
    }

    @C0359n0
    /* renamed from: d */
    public final Context mo66484d(Uri uri, String str) {
        if (str.equals(this.f57606a.getPackageName())) {
            return this.f57606a;
        }
        try {
            return this.f57606a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f57606a.getPackageName())) {
                return this.f57606a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @C0375v
    /* renamed from: e */
    public final int mo66485e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    @C0375v
    /* renamed from: f */
    public final int mo66486f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @C0375v
    /* renamed from: g */
    public final int mo66487g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return mo66486f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return mo66485e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: h */
    public boolean mo66236a(@C0359n0 Uri uri, @C0359n0 C22277f fVar) {
        return uri.getScheme().equals("android.resource");
    }
}
