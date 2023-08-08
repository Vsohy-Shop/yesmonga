package com.carrefour.fid.android.shared.extension;

import androidx.annotation.RestrictTo;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class InitialValueFlowKt {
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static final <T> C28744a0<T> m118854a(@C12579k C11907e<? extends T> eVar, T t) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new C28744a0<>(C11909g.m47472m1(eVar, new InitialValueFlowKt$asInitialValueFlow$1(t, (C11045c<? super InitialValueFlowKt$asInitialValueFlow$1>) null)));
    }
}
