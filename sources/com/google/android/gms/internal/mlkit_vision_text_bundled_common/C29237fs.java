package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.fs */
public final class C29237fs {
    /* renamed from: a */
    public static <F, T> List<T> m120389a(List<F> list, C29457lr<? super F, ? extends T> lrVar) {
        if (list instanceof RandomAccess) {
            return new zbqf(list, lrVar);
        }
        return new zbqh(list, lrVar);
    }
}
