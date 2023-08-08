package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.snapshots.C8637b;
import androidx.compose.runtime.snapshots.C8646f;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScope\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,52:1\n122#2,5:53\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScope\n*L\n44#1:53,5\n*E\n"})
/* renamed from: androidx.compose.ui.layout.d0 */
public final class C15553d0 {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f38707a;
    @C12580l

    /* renamed from: b */
    public C8637b f38708b;

    public C15553d0(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, C10108c.f27819v);
        this.f38707a = layoutNode;
    }

    @C12579k
    /* renamed from: a */
    public final LayoutNode mo44379a() {
        return this.f38707a;
    }

    /* renamed from: b */
    public final <T> T mo44380b(@C12579k C11289a<? extends T> aVar) {
        boolean z;
        C8646f p;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (this.f38708b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8637b n = C8646f.C8647a.m31748n(C8646f.f23196e, (C11300l) null, (C11300l) null, 3, (Object) null);
            this.f38708b = n;
            try {
                p = n.mo16617p();
                T invoke = aVar.invoke();
                n.mo16619w(p);
                n.mo16415d();
                this.f38708b = null;
                return invoke;
            } catch (Throwable th) {
                n.mo16415d();
                this.f38708b = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Disposable snapshot is already active".toString());
        }
    }
}
