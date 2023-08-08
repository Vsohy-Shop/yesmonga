package com.urbanairship.analytics.data;

import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17970d;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.analytics.data.a */
public final class C35533a {

    /* renamed from: a */
    public static final int f87659a = 999;

    @C0344h1
    /* renamed from: a */
    public static <T> void m146616a(@C0337f0(from = 1) int i, @C0359n0 List<T> list, @C0359n0 C17970d<List<T>> dVar) {
        if (i != 0) {
            int ceil = (int) Math.ceil(((double) list.size()) / ((double) i));
            for (int i2 = 0; i2 < ceil; i2++) {
                int i3 = i2 * i;
                dVar.accept(list.subList(i3, Math.min(list.size() - i3, i) + i3));
            }
            return;
        }
        throw new IllegalArgumentException("Failed to run batched! 'batchSize' must be greater than zero.");
    }

    /* renamed from: b */
    public static <T> void m146617b(@C0359n0 List<T> list, @C0359n0 C17970d<List<T>> dVar) {
        m146616a(999, list, dVar);
    }
}
