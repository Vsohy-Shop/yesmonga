package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.c0 */
public abstract class C15467c0 {

    /* renamed from: c */
    public static final int f38479c = 8;
    @C12580l

    /* renamed from: a */
    public C15588o f38480a;

    /* renamed from: b */
    public boolean f38481b;

    @C8761g
    /* renamed from: i1 */
    public static /* synthetic */ void m68495i1() {
    }

    /* renamed from: D1 */
    public abstract void mo43978D1();

    /* renamed from: G1 */
    public abstract void mo43979G1(@C12579k C15491o oVar, @C12579k PointerEventPass pointerEventPass, long j);

    /* renamed from: K1 */
    public final void mo44031K1(boolean z) {
        this.f38481b = z;
    }

    /* renamed from: M1 */
    public final void mo44032M1(@C12580l C15588o oVar) {
        this.f38480a = oVar;
    }

    /* renamed from: a */
    public final long mo44033a() {
        C15588o oVar = this.f38480a;
        return oVar != null ? oVar.mo44434a() : C16500q.f40900b.mo47897a();
    }

    @C12580l
    /* renamed from: f0 */
    public final C15588o mo44034f0() {
        return this.f38480a;
    }

    /* renamed from: j5 */
    public boolean mo43996j5() {
        return false;
    }

    @C8761g
    /* renamed from: l0 */
    public boolean mo43981l0() {
        return false;
    }

    /* renamed from: z1 */
    public final boolean mo44035z1() {
        return this.f38481b;
    }
}
