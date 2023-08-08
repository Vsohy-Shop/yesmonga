package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.common.internal.C40802q;
import com.google.android.gms.common.util.C40974d0;
import java.util.ArrayList;
import java.util.Collections;

@C40974d0
/* renamed from: com.google.android.gms.analytics.p */
public final class C40404p implements C40376c0 {

    /* renamed from: b */
    public static final Uri f102972b;

    /* renamed from: a */
    public final LogPrinter f102973a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority(C40802q.f103911b);
        f102972b = builder.build();
    }

    /* renamed from: d */
    public final void mo133268d(C40405q qVar) {
        ArrayList arrayList = new ArrayList(qVar.mo133434e());
        Collections.sort(arrayList, new C40403o(this));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((C40407s) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f102973a.println(sb.toString());
    }

    public final Uri zzb() {
        return f102972b;
    }
}
