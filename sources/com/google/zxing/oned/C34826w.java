package com.google.zxing.oned;

import com.google.zxing.C34761k;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.w */
public final class C34826w {

    /* renamed from: c */
    public static final int[] f84512c = {1, 1, 2};

    /* renamed from: a */
    public final C34824u f84513a = new C34824u();

    /* renamed from: b */
    public final C34825v f84514b = new C34825v();

    /* renamed from: a */
    public C34761k mo103021a(int i, C34709a aVar, int i2) throws NotFoundException {
        int[] n = C34827x.m142192n(aVar, i2, false, f84512c);
        try {
            return this.f84514b.mo103020b(i, aVar, n);
        } catch (ReaderException unused) {
            return this.f84513a.mo103018b(i, aVar, n);
        }
    }
}
