package com.carrefour.fid.android.shared.util;

import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ParallelMapKt {
    @C12580l
    /* renamed from: a */
    public static final <A, B> Object m119521a(@C12579k Iterable<? extends A> iterable, @C12579k C11304p<? super A, ? super C11045c<? super B>, ? extends Object> pVar, @C12579k C11045c<? super List<? extends B>> cVar) {
        return C12079p0.m48266g(new ParallelMapKt$pmap$2(iterable, pVar, (C11045c<? super ParallelMapKt$pmap$2>) null), cVar);
    }
}
