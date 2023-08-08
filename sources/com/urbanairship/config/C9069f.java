package com.urbanairship.config;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.config.f */
public class C9069f {

    /* renamed from: a */
    public Uri.Builder f24431a;

    public C9069f(@C0363p0 String str) {
        if (str != null) {
            this.f24431a = Uri.parse(str).buildUpon();
        }
    }

    @C0359n0
    /* renamed from: a */
    public C9069f mo17988a(@C0359n0 String str) {
        Uri.Builder builder = this.f24431a;
        if (builder != null) {
            builder.appendEncodedPath(str);
        }
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public C9069f mo17989b(@C0359n0 String str) {
        Uri.Builder builder = this.f24431a;
        if (builder != null) {
            builder.appendPath(str);
        }
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public C9069f mo17990c(@C0359n0 String str, @C0359n0 String str2) {
        Uri.Builder builder = this.f24431a;
        if (builder != null) {
            builder.appendQueryParameter(str, str2);
        }
        return this;
    }

    @C0363p0
    /* renamed from: d */
    public Uri mo17991d() {
        Uri.Builder builder = this.f24431a;
        if (builder == null) {
            return null;
        }
        return builder.build();
    }
}
