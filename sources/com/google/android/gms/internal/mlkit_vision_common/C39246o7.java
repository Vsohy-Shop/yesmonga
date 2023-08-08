package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.annotation.C0348i1;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.o7 */
public final class C39246o7 {
    @C0348i1
    /* renamed from: a */
    public static void m161291a(C39136c7 c7Var, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        c7Var.mo123238b(m161293c(i, i2, j, i3, i4, i5, i6), zzfs.INPUT_IMAGE_CONSTRUCTION);
    }

    @C0348i1
    /* renamed from: b */
    public static void m161292b(C39136c7 c7Var, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        c7Var.mo123238b(m161293c(i, i2, j, i3, i4, i5, i6), zzfs.ODML_IMAGE);
    }

    /* renamed from: c */
    public static C39237n7 m161293c(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new C39237n7(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
