package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.C0323b0;
import androidx.collection.C1866a;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
public final class C42225v6 {
    @C0323b0("PhenotypeConstants.class")

    /* renamed from: a */
    public static final C1866a f106462a = new C1866a();

    /* renamed from: a */
    public static synchronized Uri m170951a(String str) {
        synchronized (C42225v6.class) {
            C1866a aVar = f106462a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
