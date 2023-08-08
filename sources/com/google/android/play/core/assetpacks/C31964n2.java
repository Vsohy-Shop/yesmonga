package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32062k;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.play.core.assetpacks.n2 */
public final class C31964n2 {

    /* renamed from: b */
    public static final C32062k f78009b = new C32062k("VerifySliceTaskHandler");

    /* renamed from: a */
    public final C31906c0 f78010a;

    public C31964n2(C31906c0 c0Var) {
        this.f78010a = c0Var;
    }

    /* renamed from: a */
    public final void mo92634a(C31956m2 m2Var) {
        File x = this.f78010a.mo92530x(m2Var.f77956b, m2Var.f77974c, m2Var.f77975d, m2Var.f77976e);
        if (x.exists()) {
            mo92635b(m2Var, x);
            File y = this.f78010a.mo92531y(m2Var.f77956b, m2Var.f77974c, m2Var.f77975d, m2Var.f77976e);
            if (!y.exists()) {
                y.mkdirs();
            }
            if (!x.renameTo(y)) {
                throw new C31904bk(String.format("Failed to move slice %s after verification.", new Object[]{m2Var.f77976e}), m2Var.f77955a);
            }
            return;
        }
        throw new C31904bk(String.format("Cannot find unverified files for slice %s.", new Object[]{m2Var.f77976e}), m2Var.f77955a);
    }

    /* renamed from: b */
    public final void mo92635b(C31956m2 m2Var, File file) {
        try {
            File E = this.f78010a.mo92501E(m2Var.f77956b, m2Var.f77974c, m2Var.f77975d, m2Var.f77976e);
            if (E.exists()) {
                try {
                    if (C31987t1.m129666a(C31952l2.m129569a(file, E)).equals(m2Var.f77977f)) {
                        f78009b.mo92778d("Verification of slice %s of pack %s successful.", m2Var.f77976e, m2Var.f77956b);
                        return;
                    }
                    throw new C31904bk(String.format("Verification failed for slice %s.", new Object[]{m2Var.f77976e}), m2Var.f77955a);
                } catch (NoSuchAlgorithmException e) {
                    throw new C31904bk("SHA256 algorithm not supported.", e, m2Var.f77955a);
                } catch (IOException e2) {
                    throw new C31904bk(String.format("Could not digest file during verification for slice %s.", new Object[]{m2Var.f77976e}), e2, m2Var.f77955a);
                }
            } else {
                throw new C31904bk(String.format("Cannot find metadata files for slice %s.", new Object[]{m2Var.f77976e}), m2Var.f77955a);
            }
        } catch (IOException e3) {
            throw new C31904bk(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{m2Var.f77976e}), e3, m2Var.f77955a);
        }
    }
}
