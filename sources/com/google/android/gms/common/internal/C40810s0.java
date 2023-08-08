package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.api.C40477a;

/* renamed from: com.google.android.gms.common.internal.s0 */
public final class C40810s0 {

    /* renamed from: a */
    public final SparseIntArray f103931a;

    /* renamed from: b */
    public C40715h f103932b;

    public C40810s0() {
        this(C40713g.m165640x());
    }

    /* renamed from: a */
    public final int mo134477a(Context context, int i) {
        return this.f103931a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo134478b(@C0359n0 Context context, @C0359n0 C40477a.C40489f fVar) {
        C40843u.m166202l(context);
        C40843u.m166202l(fVar);
        int i = 0;
        if (!fVar.mo133678l()) {
            return 0;
        }
        int t = fVar.mo87439t();
        int a = mo134477a(context, t);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f103931a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f103931a.keyAt(i2);
                if (keyAt > t && this.f103931a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            if (i == -1) {
                a = this.f103932b.mo134209k(context, t);
            } else {
                a = i;
            }
            this.f103931a.put(t, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo134479c() {
        this.f103931a.clear();
    }

    public C40810s0(@C0359n0 C40715h hVar) {
        this.f103931a = new SparseIntArray();
        C40843u.m166202l(hVar);
        this.f103932b = hVar;
    }
}
