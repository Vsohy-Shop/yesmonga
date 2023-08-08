package com.google.android.gms.common.images;

import android.net.Uri;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.android.gms.common.images.e */
public final class C40724e {

    /* renamed from: a */
    public final Uri f103733a;

    public C40724e(Uri uri) {
        this.f103733a = uri;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40724e)) {
            return false;
        }
        return C40808s.m166010b(((C40724e) obj).f103733a, this.f103733a);
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f103733a);
    }
}
