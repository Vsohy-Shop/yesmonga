package androidx.compose.material3;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,770:1\n76#2:771\n102#2,2:772\n76#2:774\n102#2,2:775\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipState\n*L\n449#1:771\n449#1:772,2\n459#1:774\n459#1:775,2\n*E\n"})
/* renamed from: androidx.compose.material3.e2 */
public final class C8194e2 implements C8265p3 {

    /* renamed from: c */
    public static final int f20114c = 0;
    @C12579k

    /* renamed from: a */
    public final C8700z0 f20115a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f20116b;

    public C8194e2() {
        Boolean bool = Boolean.FALSE;
        this.f20115a = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f20116b = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
    }

    @C12580l
    /* renamed from: a */
    public Object mo12562a(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = TooltipSync.f19952a.mo12393a(this, cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: b */
    public Object mo12563b(@C12579k C11045c<? super C11079d2> cVar) {
        Object e = TooltipSync.f19952a.mo12397e(this, mo12564c(), cVar);
        if (e == C11063b.m42612h()) {
            return e;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: c */
    public final boolean mo12564c() {
        return ((Boolean) this.f20116b.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final void mo12565d(boolean z) {
        this.f20116b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public void mo12566e(boolean z) {
        this.f20115a.setValue(Boolean.valueOf(z));
    }

    public boolean isVisible() {
        return ((Boolean) this.f20115a.getValue()).booleanValue();
    }
}
