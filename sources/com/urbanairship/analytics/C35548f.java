package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import java.util.Map;

/* renamed from: com.urbanairship.analytics.f */
public class C35548f extends C35554i {

    /* renamed from: L0 */
    public static final String f87715L0 = "associate_identifiers";
    @C0359n0

    /* renamed from: K0 */
    public final Map<String, String> f87716K0;

    public C35548f(@C0359n0 C35549g gVar) {
        this.f87716K0 = gVar.mo106483c();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public C9323b mo18411e() {
        return JsonValue.m34975U(this.f87716K0).mo18749A();
    }

    @C0359n0
    /* renamed from: j */
    public String mo18412j() {
        return f87715L0;
    }

    /* renamed from: l */
    public boolean mo106481l() {
        boolean z;
        if (this.f87716K0.size() > 100) {
            C36059m.m148409e("Associated identifiers exceeds %s", 100);
            z = false;
        } else {
            z = true;
        }
        for (Map.Entry next : this.f87716K0.entrySet()) {
            if (((String) next.getKey()).length() > 255) {
                C36059m.m148409e("Associated identifiers key %s exceeds %s characters.", next.getKey(), 255);
                z = false;
            }
            if (((String) next.getValue()).length() > 255) {
                C36059m.m148409e("Associated identifiers for key %s exceeds %s characters.", next.getKey(), 255);
                z = false;
            }
        }
        return z;
    }
}
