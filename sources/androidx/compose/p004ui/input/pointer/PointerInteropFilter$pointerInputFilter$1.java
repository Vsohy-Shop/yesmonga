package androidx.compose.p004ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.PointerInteropFilter;
import androidx.compose.p004ui.layout.C15588o;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n86#2,2:360\n33#2,6:362\n88#2:368\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,6:378\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:351,2\n223#1:353,6\n223#1:359\n238#1:360,2\n238#1:362,6\n238#1:368\n280#1:369,2\n280#1:371,6\n280#1:377\n314#1:378,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1 */
public final class PointerInteropFilter$pointerInputFilter$1 extends C15467c0 {
    @C12579k

    /* renamed from: d */
    public PointerInteropFilter.DispatchToViewState f38453d = PointerInteropFilter.DispatchToViewState.Unknown;

    /* renamed from: e */
    public final /* synthetic */ PointerInteropFilter f38454e;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f38454e = pointerInteropFilter;
    }

    /* renamed from: D1 */
    public void mo43978D1() {
        if (this.f38453d == PointerInteropFilter.DispatchToViewState.Dispatching) {
            C15477g0.m68589a(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.f38454e));
            mo43982q2();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43979G1(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15491o r6, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.PointerEventPass r7, long r8) {
        /*
            r5 = this;
            java.lang.String r8 = "pointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            java.lang.String r8 = "pass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.util.List r8 = r6.mo44110e()
            androidx.compose.ui.input.pointer.PointerInteropFilter r9 = r5.f38454e
            boolean r9 = r9.mo43972a()
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0042
            int r9 = r8.size()
            r2 = r0
        L_0x001d:
            if (r2 >= r9) goto L_0x003c
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.input.pointer.w r3 = (androidx.compose.p004ui.input.pointer.C15507w) r3
            boolean r4 = androidx.compose.p004ui.input.pointer.C15492p.m68683c(r3)
            if (r4 != 0) goto L_0x0034
            boolean r3 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r3)
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = r0
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r9 = r1
            goto L_0x003d
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x003c:
            r9 = r0
        L_0x003d:
            if (r9 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r9 = r0
            goto L_0x0043
        L_0x0042:
            r9 = r1
        L_0x0043:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = r5.f38453d
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r3 = androidx.compose.p004ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r2 == r3) goto L_0x005b
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial
            if (r7 != r2) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            r5.mo43980R1(r6)
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            if (r7 != r2) goto L_0x005b
            if (r9 != 0) goto L_0x005b
            r5.mo43980R1(r6)
        L_0x005b:
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            if (r7 != r6) goto L_0x007c
            int r6 = r8.size()
            r7 = r0
        L_0x0064:
            if (r7 >= r6) goto L_0x0076
            java.lang.Object r9 = r8.get(r7)
            androidx.compose.ui.input.pointer.w r9 = (androidx.compose.p004ui.input.pointer.C15507w) r9
            boolean r9 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r9)
            if (r9 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            int r7 = r7 + 1
            goto L_0x0064
        L_0x0076:
            r0 = r1
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            r5.mo43982q2()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo43979G1(androidx.compose.ui.input.pointer.o, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }

    /* renamed from: R1 */
    public final void mo43980R1(C15491o oVar) {
        boolean z;
        List<C15507w> e = oVar.mo44110e();
        int size = e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (e.get(i).mo44167A()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (this.f38453d == PointerInteropFilter.DispatchToViewState.Dispatching) {
                C15588o f0 = mo44034f0();
                if (f0 != null) {
                    C15477g0.m68591c(oVar, f0.mo44440z0(C15094f.f37256b.mo42248e()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.f38454e));
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.f38453d = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        C15588o f02 = mo44034f0();
        if (f02 != null) {
            C15477g0.m68592d(oVar, f02.mo44440z0(C15094f.f37256b.mo42248e()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.f38454e));
            if (this.f38453d == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    e.get(i2).mo44168a();
                }
                C15476g f = oVar.mo44111f();
                if (f != null) {
                    f.mo44054f(!this.f38454e.mo43972a());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    /* renamed from: l0 */
    public boolean mo43981l0() {
        return true;
    }

    /* renamed from: q2 */
    public final void mo43982q2() {
        this.f38453d = PointerInteropFilter.DispatchToViewState.Unknown;
        this.f38454e.mo43975g(false);
    }
}
