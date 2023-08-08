package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.installations.local.C33093b;
import java.util.HashMap;

@C40473a
/* renamed from: com.google.android.gms.common.util.s */
public class C40993s {
    @C40473a
    /* renamed from: a */
    public static void m166674a(@C0359n0 StringBuilder sb, @C0359n0 HashMap<String, String> hashMap) {
        sb.append(C33093b.f80281i);
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
