package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.e2 */
public final /* synthetic */ class C8437e2 {
    @C12579k
    /* renamed from: a */
    public static final <T> C8410b2<T> m30454a() {
        C8405a1 a1Var = C8405a1.f22761a;
        Intrinsics.checkNotNull(a1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return a1Var;
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C8410b2<T> m30455b() {
        C8604q1 q1Var = C8604q1.f23041a;
        Intrinsics.checkNotNull(q1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return q1Var;
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C8410b2<T> m30456c() {
        C8591n2 n2Var = C8591n2.f23031a;
        Intrinsics.checkNotNull(n2Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return n2Var;
    }
}
