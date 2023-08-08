package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.node.C15689g1;
import androidx.compose.p004ui.node.C15707m;
import androidx.compose.p004ui.node.LayoutNode;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1747#2,3:238\n1855#2,2:241\n1747#2,3:243\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n78#1:238,3\n81#1:241,2\n104#1:243,3\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.a0 */
public final class C15462a0 {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f38473a;
    @C12579k

    /* renamed from: b */
    public final C15474f f38474b;
    @C12579k

    /* renamed from: c */
    public final C15508x f38475c = new C15508x();
    @C12579k

    /* renamed from: d */
    public final C15707m<C15689g1> f38476d = new C15707m<>();

    /* renamed from: e */
    public boolean f38477e;

    public C15462a0(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, C10108c.f27819v);
        this.f38473a = layoutNode;
        this.f38474b = new C15474f(layoutNode.mo44460v());
    }

    /* renamed from: c */
    public static /* synthetic */ int m68447c(C15462a0 a0Var, C15510y yVar, C15484j0 j0Var, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return a0Var.mo44025b(yVar, j0Var, z);
    }

    @C12579k
    /* renamed from: a */
    public final LayoutNode mo44024a() {
        return this.f38473a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x005e A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo44025b(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15510y r18, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15484j0 r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "pointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "positionCalculator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            boolean r3 = r1.f38477e
            r4 = 0
            if (r3 == 0) goto L_0x001a
            int r0 = androidx.compose.p004ui.input.pointer.C15464b0.m68452a(r4, r4)
            return r0
        L_0x001a:
            r3 = 1
            r1.f38477e = r3     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.x r5 = r1.f38475c     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.g r0 = r5.mo44188b(r0, r2)     // Catch:{ all -> 0x0113 }
            java.util.Map r2 = r0.mo44049a()     // Catch:{ all -> 0x0113 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0113 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0113 }
            boolean r5 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x003c
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x0113 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x003c
        L_0x003a:
            r2 = r4
            goto L_0x005f
        L_0x003c:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0113 }
        L_0x0040:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x003a
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.w r5 = (androidx.compose.p004ui.input.pointer.C15507w) r5     // Catch:{ all -> 0x0113 }
            boolean r6 = r5.mo44178r()     // Catch:{ all -> 0x0113 }
            if (r6 != 0) goto L_0x005b
            boolean r5 = r5.mo44182v()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r5 = r4
            goto L_0x005c
        L_0x005b:
            r5 = r3
        L_0x005c:
            if (r5 == 0) goto L_0x0040
            r2 = r3
        L_0x005f:
            if (r2 != 0) goto L_0x0063
            r2 = r3
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            java.util.Map r5 = r0.mo44049a()     // Catch:{ all -> 0x0113 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0113 }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x0113 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0113 }
        L_0x0072:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0113 }
            if (r6 == 0) goto L_0x00be
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.w r6 = (androidx.compose.p004ui.input.pointer.C15507w) r6     // Catch:{ all -> 0x0113 }
            if (r2 != 0) goto L_0x0086
            boolean r7 = androidx.compose.p004ui.input.pointer.C15492p.m68683c(r6)     // Catch:{ all -> 0x0113 }
            if (r7 == 0) goto L_0x0072
        L_0x0086:
            int r7 = r6.mo44185y()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.i0$a r8 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b     // Catch:{ all -> 0x0113 }
            int r8 = r8.mo44075d()     // Catch:{ all -> 0x0113 }
            boolean r13 = androidx.compose.p004ui.input.pointer.C15481i0.m68620i(r7, r8)     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.node.LayoutNode r9 = r1.f38473a     // Catch:{ all -> 0x0113 }
            long r10 = r6.mo44177q()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.node.m<androidx.compose.ui.node.g1> r12 = r1.f38476d     // Catch:{ all -> 0x0113 }
            r14 = 0
            r15 = 8
            r16 = 0
            androidx.compose.p004ui.node.LayoutNode.m69651K0(r9, r10, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.node.m<androidx.compose.ui.node.g1> r7 = r1.f38476d     // Catch:{ all -> 0x0113 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0113 }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0072
            androidx.compose.ui.input.pointer.f r7 = r1.f38474b     // Catch:{ all -> 0x0113 }
            long r8 = r6.mo44176p()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.node.m<androidx.compose.ui.node.g1> r6 = r1.f38476d     // Catch:{ all -> 0x0113 }
            r7.mo44044a(r8, r6)     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.node.m<androidx.compose.ui.node.g1> r6 = r1.f38476d     // Catch:{ all -> 0x0113 }
            r6.clear()     // Catch:{ all -> 0x0113 }
            goto L_0x0072
        L_0x00be:
            androidx.compose.ui.input.pointer.f r2 = r1.f38474b     // Catch:{ all -> 0x0113 }
            r2.mo44048f()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.f r2 = r1.f38474b     // Catch:{ all -> 0x0113 }
            r5 = r20
            boolean r2 = r2.mo44045b(r0, r5)     // Catch:{ all -> 0x0113 }
            boolean r5 = r0.mo44052d()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00d3
        L_0x00d1:
            r3 = r4
            goto L_0x010c
        L_0x00d3:
            java.util.Map r0 = r0.mo44049a()     // Catch:{ all -> 0x0113 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0113 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0113 }
            boolean r5 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00eb
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x0113 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00eb
            goto L_0x00d1
        L_0x00eb:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0113 }
        L_0x00ef:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00d1
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0113 }
            androidx.compose.ui.input.pointer.w r5 = (androidx.compose.p004ui.input.pointer.C15507w) r5     // Catch:{ all -> 0x0113 }
            boolean r6 = androidx.compose.p004ui.input.pointer.C15492p.m68697q(r5)     // Catch:{ all -> 0x0113 }
            if (r6 == 0) goto L_0x0109
            boolean r5 = r5.mo44167A()     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x0109
            r5 = r3
            goto L_0x010a
        L_0x0109:
            r5 = r4
        L_0x010a:
            if (r5 == 0) goto L_0x00ef
        L_0x010c:
            int r0 = androidx.compose.p004ui.input.pointer.C15464b0.m68452a(r2, r3)     // Catch:{ all -> 0x0113 }
            r1.f38477e = r4
            return r0
        L_0x0113:
            r0 = move-exception
            r1.f38477e = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15462a0.mo44025b(androidx.compose.ui.input.pointer.y, androidx.compose.ui.input.pointer.j0, boolean):int");
    }

    /* renamed from: d */
    public final void mo44026d() {
        if (!this.f38477e) {
            this.f38475c.mo44187a();
            this.f38474b.mo44047e();
        }
    }
}
