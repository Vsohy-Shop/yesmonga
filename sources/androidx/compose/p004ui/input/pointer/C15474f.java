package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.layout.C15588o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n366#2,12:539\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:539,12\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.f */
public final class C15474f {
    @C12579k

    /* renamed from: a */
    public final C15588o f38488a;
    @C12579k

    /* renamed from: b */
    public final C15489m f38489b = new C15489m();

    public C15474f(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "rootCoordinates");
        this.f38488a = oVar;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m68562c(C15474f fVar, C15476g gVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return fVar.mo44045b(gVar, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44044a(long r12, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.node.C15689g1> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pointerInputNodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            androidx.compose.ui.input.pointer.m r0 = r11.f38489b
            int r1 = r14.size()
            r2 = 1
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r1) goto L_0x007a
            java.lang.Object r5 = r14.get(r4)
            androidx.compose.ui.node.g1 r5 = (androidx.compose.p004ui.node.C15689g1) r5
            if (r2 == 0) goto L_0x005f
            androidx.compose.runtime.collection.g r6 = r0.mo44100g()
            int r7 = r6.mo15469h0()
            if (r7 <= 0) goto L_0x003b
            java.lang.Object[] r6 = r6.mo15462d0()
            r8 = r3
        L_0x0027:
            r9 = r6[r8]
            r10 = r9
            androidx.compose.ui.input.pointer.l r10 = (androidx.compose.p004ui.input.pointer.C15487l) r10
            androidx.compose.ui.node.g1 r10 = r10.mo44092l()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r5)
            if (r10 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x0027
        L_0x003b:
            r9 = 0
        L_0x003c:
            androidx.compose.ui.input.pointer.l r9 = (androidx.compose.p004ui.input.pointer.C15487l) r9
            if (r9 == 0) goto L_0x005e
            r9.mo44094n()
            androidx.compose.runtime.collection.g r0 = r9.mo44091k()
            androidx.compose.ui.input.pointer.v r5 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r12)
            boolean r0 = r0.mo15492x(r5)
            if (r0 != 0) goto L_0x005c
            androidx.compose.runtime.collection.g r0 = r9.mo44091k()
            androidx.compose.ui.input.pointer.v r5 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r12)
            r0.mo15463e(r5)
        L_0x005c:
            r0 = r9
            goto L_0x0077
        L_0x005e:
            r2 = r3
        L_0x005f:
            androidx.compose.ui.input.pointer.l r6 = new androidx.compose.ui.input.pointer.l
            r6.<init>(r5)
            androidx.compose.runtime.collection.g r5 = r6.mo44091k()
            androidx.compose.ui.input.pointer.v r7 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r12)
            r5.mo15463e(r7)
            androidx.compose.runtime.collection.g r0 = r0.mo44100g()
            r0.mo15463e(r6)
            r0 = r6
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15474f.mo44044a(long, java.util.List):void");
    }

    /* renamed from: b */
    public final boolean mo44045b(@C12579k C15476g gVar, boolean z) {
        Intrinsics.checkNotNullParameter(gVar, "internalPointerEvent");
        if (!this.f38489b.mo44084a(gVar.mo44049a(), this.f38488a, gVar, z)) {
            return false;
        }
        boolean f = this.f38489b.mo44088f(gVar.mo44049a(), this.f38488a, gVar, z);
        if (this.f38489b.mo44087e(gVar) || f) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: d */
    public final C15489m mo44046d() {
        return this.f38489b;
    }

    /* renamed from: e */
    public final void mo44047e() {
        this.f38489b.mo44086d();
        this.f38489b.mo44099c();
    }

    /* renamed from: f */
    public final void mo44048f() {
        this.f38489b.mo44101h();
    }
}
