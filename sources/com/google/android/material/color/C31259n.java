package com.google.android.material.color;

import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import com.google.android.material.C31076a;

/* renamed from: com.google.android.material.color.n */
public final class C31259n {

    /* renamed from: c */
    public static final int[] f75247c = {C31076a.C31079c.colorError, C31076a.C31079c.colorOnError, C31076a.C31079c.colorErrorContainer, C31076a.C31079c.colorOnErrorContainer};

    /* renamed from: a */
    public final int[] f75248a;
    @C0327c1

    /* renamed from: b */
    public final int f75249b;

    public C31259n(@C0336f @C0359n0 int[] iArr, @C0327c1 int i) {
        if (i == 0 || iArr.length != 0) {
            this.f75248a = iArr;
            this.f75249b = i;
            return;
        }
        throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
    }

    @C0359n0
    /* renamed from: a */
    public static C31259n m125912a(@C0336f @C0359n0 int[] iArr) {
        return new C31259n(iArr, 0);
    }

    @C0359n0
    /* renamed from: b */
    public static C31259n m125913b(@C0336f @C0359n0 int[] iArr, @C0327c1 int i) {
        return new C31259n(iArr, i);
    }

    @C0359n0
    /* renamed from: c */
    public static C31259n m125914c() {
        return m125913b(f75247c, C31076a.C31090n.ThemeOverlay_Material3_HarmonizedColors);
    }

    @C0359n0
    /* renamed from: d */
    public int[] mo89223d() {
        return this.f75248a;
    }

    @C0327c1
    /* renamed from: e */
    public int mo89224e() {
        return this.f75249b;
    }
}
