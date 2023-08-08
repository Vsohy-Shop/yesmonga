package com.carrefour.fid.android.shared.base;

import androidx.lifecycle.C19499w;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.base.s */
public interface C28502s {

    /* renamed from: com.carrefour.fid.android.shared.base.s$a */
    public static final class C28503a {
        /* renamed from: a */
        public static /* synthetic */ void m118425a(C28502s sVar, C19499w wVar, Boolean bool, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bool = Boolean.TRUE;
                }
                sVar.mo74786r(wVar, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeObservers");
        }
    }

    /* renamed from: r */
    void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool);
}
