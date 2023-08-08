package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.k0 */
public final class C30106k0 {
    /* renamed from: a */
    public static <F, T> List<T> m121751a(List<F> list, C30248va<? super F, ? extends T> vaVar) {
        if (list instanceof RandomAccess) {
            return new zzbq(list, vaVar);
        }
        return new zzbs(list, vaVar);
    }
}
