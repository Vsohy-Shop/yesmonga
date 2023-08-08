package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C40974d0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.j3 */
public final class C40574j3 {

    /* renamed from: c */
    public static final Status f103464c = new Status(8, "The connection to Google Play services was lost");
    @C40974d0

    /* renamed from: a */
    public final Set f103465a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    public final C40568i3 f103466b = new C40568i3(this);

    /* renamed from: a */
    public final void mo133974a(BasePendingResult basePendingResult) {
        this.f103465a.add(basePendingResult);
        basePendingResult.mo133798v(this.f103466b);
    }

    /* renamed from: b */
    public final void mo133975b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f103465a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo133798v((C40568i3) null);
            if (basePendingResult.mo133797u()) {
                this.f103465a.remove(basePendingResult);
            }
        }
    }
}
