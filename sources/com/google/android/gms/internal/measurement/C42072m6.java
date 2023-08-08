package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.C1886l;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
public final class C42072m6 {

    /* renamed from: a */
    public final C1886l f106292a;

    public C42072m6(C1886l lVar) {
        this.f106292a = lVar;
    }

    @Nullable
    /* renamed from: a */
    public final String mo137151a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C1886l lVar = (C1886l) this.f106292a.get(uri.toString());
        if (lVar == null) {
            return null;
        }
        return (String) lVar.get("".concat(str3));
    }
}
