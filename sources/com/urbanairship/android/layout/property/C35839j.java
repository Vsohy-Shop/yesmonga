package com.urbanairship.android.layout.property;

import android.graphics.Color;
import androidx.annotation.C0354l;
import androidx.annotation.C0363p0;
import androidx.core.graphics.C17586h0;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;

/* renamed from: com.urbanairship.android.layout.property.j */
public final class C35839j {
    @C0363p0
    @C0354l
    /* renamed from: a */
    public static Integer m147767a(@C0363p0 C9323b bVar) {
        int i;
        if (bVar != null && !bVar.isEmpty()) {
            String B = bVar.mo18801A("hex").mo18750B();
            float e = bVar.mo18801A("alpha").mo18760e(1.0f);
            if (B.isEmpty() || e > 1.0f || e < 0.0f) {
                C36059m.m148421q("Invalid Color json: %s", bVar.toString());
            } else {
                int parseColor = Color.parseColor(B);
                if (i != 0) {
                    parseColor = C17586h0.m80563B(parseColor, (int) (e * 255.0f));
                }
                return Integer.valueOf(parseColor);
            }
        }
        return null;
    }
}
