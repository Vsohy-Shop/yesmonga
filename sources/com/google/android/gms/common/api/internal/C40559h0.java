package com.google.android.gms.common.api.internal;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C31049l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
public final class C40559h0 {

    /* renamed from: a */
    public final Map f103380a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f103381b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void mo133910c(BasePendingResult basePendingResult, boolean z) {
        this.f103380a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo133783c(new C40547f0(this, basePendingResult));
    }

    /* renamed from: d */
    public final void mo133911d(C31049l lVar, boolean z) {
        this.f103381b.put(lVar, Boolean.valueOf(z));
        lVar.mo87741a().mo87721e(new C40553g0(this, lVar));
    }

    /* renamed from: e */
    public final void mo133912e(int i, @C0363p0 String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        mo133915h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo133913f() {
        mo133915h(false, C40564i.f103398t);
    }

    /* renamed from: g */
    public final boolean mo133914g() {
        return !this.f103380a.isEmpty() || !this.f103381b.isEmpty();
    }

    /* renamed from: h */
    public final void mo133915h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f103380a) {
            hashMap = new HashMap(this.f103380a);
        }
        synchronized (this.f103381b) {
            hashMap2 = new HashMap(this.f103381b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo133790l(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C31049l) entry2.getKey()).mo87744d(new ApiException(status));
            }
        }
    }
}
