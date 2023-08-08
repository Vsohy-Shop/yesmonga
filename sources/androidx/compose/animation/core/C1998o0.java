package androidx.compose.animation.core;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n103#1:1156\n103#1:1157,2\n115#1:1159\n115#1:1160,2\n127#1:1162\n127#1:1163,2\n*E\n"})
/* renamed from: androidx.compose.animation.core.o0 */
public final class C1998o0<S> {

    /* renamed from: d */
    public static final int f5575d = 0;
    @C12579k

    /* renamed from: a */
    public final C8700z0 f5576a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f5577b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f5578c = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    public C1998o0(S s) {
        this.f5576a = C8539f2.m30981g(s, (C8410b2) null, 2, (Object) null);
        this.f5577b = C8539f2.m30981g(s, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public final S mo6943a() {
        return this.f5576a.getValue();
    }

    /* renamed from: b */
    public final S mo6944b() {
        return this.f5577b.getValue();
    }

    /* renamed from: c */
    public final boolean mo6945c() {
        return Intrinsics.areEqual(mo6943a(), mo6944b()) && !mo6946d();
    }

    /* renamed from: d */
    public final boolean mo6946d() {
        return ((Boolean) this.f5578c.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final void mo6947e(S s) {
        this.f5576a.setValue(s);
    }

    /* renamed from: f */
    public final void mo6948f(boolean z) {
        this.f5578c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public final void mo6949g(S s) {
        this.f5577b.setValue(s);
    }
}
