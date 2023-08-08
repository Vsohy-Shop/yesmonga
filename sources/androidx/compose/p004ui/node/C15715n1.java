package androidx.compose.p004ui.node;

import androidx.compose.runtime.C8403a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.n1 */
public final class C15715n1 extends C8403a<LayoutNode> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15715n1(@C12579k LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, C10108c.f27819v);
    }

    /* renamed from: b */
    public void mo15555b(int i, int i2, int i3) {
        ((LayoutNode) mo15321a()).mo44686j1(i, i2, i3);
    }

    /* renamed from: c */
    public void mo15556c(int i, int i2) {
        ((LayoutNode) mo15321a()).mo44705t1(i, i2);
    }

    /* renamed from: f */
    public void mo15558f() {
        super.mo15558f();
        C15675c1 B0 = ((LayoutNode) mo15325l()).mo44611B0();
        if (B0 != null) {
            B0.mo44961H();
        }
    }

    /* renamed from: n */
    public void mo15327n() {
        ((LayoutNode) mo15325l()).mo44703s1();
    }

    /* renamed from: q */
    public void mo15559h(int i, @C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "instance");
        ((LayoutNode) mo15321a()).mo44641O0(i, layoutNode);
    }

    /* renamed from: r */
    public void mo15557e(int i, @C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "instance");
    }
}
