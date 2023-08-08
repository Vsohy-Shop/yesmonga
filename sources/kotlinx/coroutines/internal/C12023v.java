package kotlinx.coroutines.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.internal.v */
public final class C12023v {

    /* renamed from: a */
    public static final int f29631a = 0;

    /* renamed from: b */
    public static final int f29632b = 1;

    /* renamed from: c */
    public static final int f29633c = 2;
    @C12579k

    /* renamed from: d */
    public static final Object f29634d = new C12009o0("CONDITION_FALSE");

    @C12579k
    /* renamed from: a */
    public static final Object m47976a() {
        return f29634d;
    }

    @C11532s0
    /* renamed from: b */
    public static /* synthetic */ void m47977b() {
    }

    @C11532s0
    /* renamed from: c */
    public static /* synthetic */ void m47978c() {
    }

    @C11532s0
    /* renamed from: d */
    public static /* synthetic */ void m47979d() {
    }

    @C11532s0
    /* renamed from: e */
    public static /* synthetic */ void m47980e() {
    }

    @C12579k
    @C11532s0
    /* renamed from: f */
    public static final LockFreeLinkedListNode m47981f(@C12579k Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        C11997i0 i0Var = obj instanceof C11997i0 ? (C11997i0) obj : null;
        if (i0Var != null && (lockFreeLinkedListNode = i0Var.f29597a) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) obj;
    }
}
