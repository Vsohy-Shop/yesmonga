package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.l */
public class C33949l {

    /* renamed from: a */
    public final String f82370a;

    /* renamed from: b */
    public final Uri f82371b;

    /* renamed from: c */
    public final String f82372c;

    /* renamed from: d */
    public final ModelType f82373d;

    @C40473a
    public C33949l(@RecentlyNonNull String str, @RecentlyNonNull Uri uri, @RecentlyNonNull String str2, @RecentlyNonNull ModelType modelType) {
        this.f82370a = str;
        this.f82371b = uri;
        this.f82372c = str2;
        this.f82373d = modelType;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public String mo98722a() {
        return this.f82372c;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public String mo98723b() {
        return this.f82370a;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: c */
    public ModelType mo98724c() {
        return this.f82373d;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: d */
    public Uri mo98725d() {
        return this.f82371b;
    }
}
