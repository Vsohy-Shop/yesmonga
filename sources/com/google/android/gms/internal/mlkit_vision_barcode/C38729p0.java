package com.google.android.gms.internal.mlkit_vision_barcode;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.p0 */
public final class C38729p0 {
    /* renamed from: a */
    public static int m160099a(@NullableDecl Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }
}
