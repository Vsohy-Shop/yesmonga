package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.C32164e;
import com.google.android.play.core.splitinstall.C32167f;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.splitinstall.testing.f */
public final /* synthetic */ class C32205f implements C32210k {

    /* renamed from: a */
    public final C32164e f78530a;

    public C32205f(C32164e eVar) {
        this.f78530a = eVar;
    }

    /* renamed from: a */
    public final C32167f mo93003a(C32167f fVar) {
        C32164e eVar = this.f78530a;
        int i = C32200a.f78503p;
        if (fVar == null || fVar.mo92960h()) {
            int i2 = 1;
            if (fVar != null) {
                i2 = 1 + fVar.mo92964l();
            }
            return C32167f.m130174e(i2, 1, 0, 0, 0, eVar.mo92947b(), new ArrayList());
        }
        throw new SplitInstallException(-1);
    }
}
