package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15689g1;
import androidx.compose.p004ui.node.C15692h1;
import androidx.compose.runtime.collection.C8423g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,538:1\n486#1,5:542\n493#1:558\n486#1,5:559\n493#1:575\n1182#2:539\n1161#2,2:540\n460#3,11:547\n460#3,11:564\n48#3:582\n523#3:583\n460#3,11:593\n33#4,6:576\n116#4,2:584\n33#4,6:586\n118#4:592\n33#4,6:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:542,5\n292#1:558\n326#1:559,5\n326#1:575\n263#1:539\n263#1:540,2\n300#1:547,11\n334#1:564,11\n407#1:582\n408#1:583\n504#1:593,11\n377#1:576,6\n415#1:584,2\n415#1:586,6\n415#1:592\n519#1:604,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.l */
public final class C15487l extends C15489m {
    @C12579k

    /* renamed from: b */
    public final C15689g1 f38509b;
    @C12579k

    /* renamed from: c */
    public final C8423g<C15506v> f38510c = new C8423g<>(new C15506v[16], 0);
    @C12579k

    /* renamed from: d */
    public final Map<C15506v, C15507w> f38511d = new LinkedHashMap();
    @C12580l

    /* renamed from: e */
    public C15588o f38512e;
    @C12580l

    /* renamed from: f */
    public C15491o f38513f;

    /* renamed from: g */
    public boolean f38514g;

    /* renamed from: h */
    public boolean f38515h = true;

    /* renamed from: i */
    public boolean f38516i = true;

    public C15487l(@C12579k C15689g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "pointerInputNode");
        this.f38509b = g1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44084a(@org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.p004ui.input.pointer.C15506v, androidx.compose.p004ui.input.pointer.C15507w> r31, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15588o r32, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15476g r33, boolean r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "changes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "internalPointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            boolean r4 = super.mo44084a(r31, r32, r33, r34)
            androidx.compose.ui.node.g1 r5 = r0.f38509b
            boolean r5 = androidx.compose.p004ui.node.C15692h1.m70288c(r5)
            r6 = 1
            if (r5 != 0) goto L_0x0025
            return r6
        L_0x0025:
            androidx.compose.ui.node.g1 r5 = r0.f38509b
            androidx.compose.ui.layout.o r5 = androidx.compose.p004ui.node.C15692h1.m70286a(r5)
            r0.f38512e = r5
            java.util.Set r5 = r31.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0035:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            androidx.compose.ui.input.pointer.v r9 = (androidx.compose.p004ui.input.pointer.C15506v) r9
            long r9 = r9.mo44164h()
            java.lang.Object r7 = r7.getValue()
            r11 = r7
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            androidx.compose.runtime.collection.g<androidx.compose.ui.input.pointer.v> r7 = r0.f38510c
            androidx.compose.ui.input.pointer.v r12 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r9)
            boolean r7 = r7.mo15492x(r12)
            if (r7 == 0) goto L_0x0035
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r12 = r11.mo44175n()
            int r13 = r12.size()
        L_0x006c:
            if (r8 >= r13) goto L_0x009c
            java.lang.Object r14 = r12.get(r8)
            androidx.compose.ui.input.pointer.e r14 = (androidx.compose.p004ui.input.pointer.C15471e) r14
            androidx.compose.ui.input.pointer.e r15 = new androidx.compose.ui.input.pointer.e
            long r16 = r14.mo44041b()
            androidx.compose.ui.layout.o r6 = r0.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r21 = r12
            r22 = r13
            long r12 = r14.mo44040a()
            long r18 = r6.mo44430K(r2, r12)
            r20 = 0
            r6 = r15
            r15.<init>(r16, r18, r20)
            r7.add(r6)
            int r8 = r8 + 1
            r12 = r21
            r13 = r22
            r6 = 1
            goto L_0x006c
        L_0x009c:
            java.util.Map<androidx.compose.ui.input.pointer.v, androidx.compose.ui.input.pointer.w> r6 = r0.f38511d
            androidx.compose.ui.input.pointer.v r8 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r9)
            androidx.compose.ui.layout.o r9 = r0.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            long r12 = r11.mo44181u()
            long r21 = r9.mo44430K(r2, r12)
            androidx.compose.ui.layout.o r9 = r0.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            long r12 = r11.mo44177q()
            long r16 = r9.mo44430K(r2, r12)
            r12 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 731(0x2db, float:1.024E-42)
            r29 = 0
            r25 = r7
            androidx.compose.ui.input.pointer.w r7 = androidx.compose.p004ui.input.pointer.C15507w.m68798i(r11, r12, r14, r16, r18, r19, r21, r23, r24, r25, r26, r28, r29)
            r6.put(r8, r7)
            r6 = 1
            goto L_0x0035
        L_0x00da:
            java.util.Map<androidx.compose.ui.input.pointer.v, androidx.compose.ui.input.pointer.w> r2 = r0.f38511d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00f0
            androidx.compose.runtime.collection.g<androidx.compose.ui.input.pointer.v> r1 = r0.f38510c
            r1.mo15490w()
            androidx.compose.runtime.collection.g r1 = r30.mo44100g()
            r1.mo15490w()
            r2 = 1
            return r2
        L_0x00f0:
            r2 = 1
            androidx.compose.runtime.collection.g<androidx.compose.ui.input.pointer.v> r5 = r0.f38510c
            int r5 = r5.mo15469h0()
            int r5 = r5 - r2
        L_0x00f8:
            r2 = -1
            if (r2 >= r5) goto L_0x011b
            androidx.compose.runtime.collection.g<androidx.compose.ui.input.pointer.v> r2 = r0.f38510c
            java.lang.Object[] r2 = r2.mo15462d0()
            r2 = r2[r5]
            androidx.compose.ui.input.pointer.v r2 = (androidx.compose.p004ui.input.pointer.C15506v) r2
            long r6 = r2.mo44164h()
            androidx.compose.ui.input.pointer.v r2 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r6)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x0118
            androidx.compose.runtime.collection.g<androidx.compose.ui.input.pointer.v> r2 = r0.f38510c
            r2.mo15437D0(r5)
        L_0x0118:
            int r5 = r5 + -1
            goto L_0x00f8
        L_0x011b:
            androidx.compose.ui.input.pointer.o r1 = new androidx.compose.ui.input.pointer.o
            java.util.Map<androidx.compose.ui.input.pointer.v, androidx.compose.ui.input.pointer.w> r2 = r0.f38511d
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r2)
            r1.<init>(r2, r3)
            java.util.List r2 = r1.mo44110e()
            int r5 = r2.size()
            r6 = r8
        L_0x0135:
            if (r6 >= r5) goto L_0x014c
            java.lang.Object r7 = r2.get(r6)
            r9 = r7
            androidx.compose.ui.input.pointer.w r9 = (androidx.compose.p004ui.input.pointer.C15507w) r9
            long r9 = r9.mo44176p()
            boolean r9 = r3.mo44053e(r9)
            if (r9 == 0) goto L_0x0149
            goto L_0x014d
        L_0x0149:
            int r6 = r6 + 1
            goto L_0x0135
        L_0x014c:
            r7 = 0
        L_0x014d:
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            if (r7 == 0) goto L_0x01fc
            if (r34 != 0) goto L_0x0156
            r0.f38515h = r8
            goto L_0x0178
        L_0x0156:
            boolean r2 = r0.f38515h
            if (r2 != 0) goto L_0x0178
            boolean r2 = r7.mo44178r()
            if (r2 != 0) goto L_0x0166
            boolean r2 = r7.mo44182v()
            if (r2 == 0) goto L_0x0178
        L_0x0166:
            androidx.compose.ui.layout.o r2 = r0.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            long r2 = r2.mo44434a()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15492p.m68689i(r7, r2)
            r3 = 1
            r2 = r2 ^ r3
            r0.f38515h = r2
            goto L_0x0179
        L_0x0178:
            r3 = 1
        L_0x0179:
            boolean r2 = r0.f38515h
            boolean r5 = r0.f38514g
            if (r2 == r5) goto L_0x01bc
            int r2 = r1.mo44114i()
            androidx.compose.ui.input.pointer.q$a r5 = androidx.compose.p004ui.input.pointer.C15493q.f38527b
            int r6 = r5.mo44122c()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r6)
            if (r2 != 0) goto L_0x01ab
            int r2 = r1.mo44114i()
            int r6 = r5.mo44120a()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r6)
            if (r2 != 0) goto L_0x01ab
            int r2 = r1.mo44114i()
            int r6 = r5.mo44121b()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r6)
            if (r2 == 0) goto L_0x01bc
        L_0x01ab:
            boolean r2 = r0.f38515h
            if (r2 == 0) goto L_0x01b4
            int r2 = r5.mo44120a()
            goto L_0x01b8
        L_0x01b4:
            int r2 = r5.mo44121b()
        L_0x01b8:
            r1.mo44115j(r2)
            goto L_0x01fd
        L_0x01bc:
            int r2 = r1.mo44114i()
            androidx.compose.ui.input.pointer.q$a r5 = androidx.compose.p004ui.input.pointer.C15493q.f38527b
            int r6 = r5.mo44120a()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r6)
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r0.f38514g
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r0.f38516i
            if (r2 != 0) goto L_0x01dc
            int r2 = r5.mo44122c()
            r1.mo44115j(r2)
            goto L_0x01fd
        L_0x01dc:
            int r2 = r1.mo44114i()
            int r6 = r5.mo44121b()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r6)
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r0.f38515h
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r7.mo44178r()
            if (r2 == 0) goto L_0x01fd
            int r2 = r5.mo44122c()
            r1.mo44115j(r2)
            goto L_0x01fd
        L_0x01fc:
            r3 = 1
        L_0x01fd:
            if (r4 != 0) goto L_0x021a
            int r2 = r1.mo44114i()
            androidx.compose.ui.input.pointer.q$a r4 = androidx.compose.p004ui.input.pointer.C15493q.f38527b
            int r4 = r4.mo44122c()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r4)
            if (r2 == 0) goto L_0x021a
            androidx.compose.ui.input.pointer.o r2 = r0.f38513f
            boolean r2 = r0.mo44093m(r2, r1)
            if (r2 == 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            r6 = r8
            goto L_0x021b
        L_0x021a:
            r6 = r3
        L_0x021b:
            r0.f38513f = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15487l.mo44084a(java.util.Map, androidx.compose.ui.layout.o, androidx.compose.ui.input.pointer.g, boolean):boolean");
    }

    /* renamed from: b */
    public void mo44085b(@C12579k C15476g gVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(gVar, "internalPointerEvent");
        super.mo44085b(gVar);
        C15491o oVar = this.f38513f;
        if (oVar != null) {
            this.f38514g = this.f38515h;
            List<C15507w> e = oVar.mo44110e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                C15507w wVar = e.get(i);
                if (wVar.mo44178r() || (gVar.mo44053e(wVar.mo44176p()) && this.f38515h)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f38510c.mo15495z0(C15506v.m68786a(wVar.mo44176p()));
                }
            }
            this.f38515h = false;
            this.f38516i = C15493q.m68708k(oVar.mo44114i(), C15493q.f38527b.mo44121b());
        }
    }

    /* renamed from: d */
    public void mo44086d() {
        C8423g<C15487l> g = mo44100g();
        int h0 = g.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = g.mo15462d0();
            int i = 0;
            do {
                ((C15487l) d0[i]).mo44086d();
                i++;
            } while (i < h0);
        }
        this.f38509b.mo44570y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44087e(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15476g r7) {
        /*
            r6 = this;
            java.lang.String r0 = "internalPointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Map<androidx.compose.ui.input.pointer.v, androidx.compose.ui.input.pointer.w> r0 = r6.f38511d
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000f
            goto L_0x004f
        L_0x000f:
            androidx.compose.ui.node.g1 r0 = r6.f38509b
            boolean r0 = androidx.compose.p004ui.node.C15692h1.m70288c(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x004f
        L_0x0018:
            androidx.compose.ui.input.pointer.o r0 = r6.f38513f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.compose.ui.layout.o r2 = r6.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            long r2 = r2.mo44434a()
            androidx.compose.ui.node.g1 r4 = r6.f38509b
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r4.mo44557l(r0, r5, r2)
            androidx.compose.ui.node.g1 r0 = r6.f38509b
            boolean r0 = androidx.compose.p004ui.node.C15692h1.m70288c(r0)
            r2 = 1
            if (r0 == 0) goto L_0x004e
            androidx.compose.runtime.collection.g r0 = r6.mo44100g()
            int r3 = r0.mo15469h0()
            if (r3 <= 0) goto L_0x004e
            java.lang.Object[] r0 = r0.mo15462d0()
        L_0x0044:
            r4 = r0[r1]
            androidx.compose.ui.input.pointer.l r4 = (androidx.compose.p004ui.input.pointer.C15487l) r4
            r4.mo44087e(r7)
            int r1 = r1 + r2
            if (r1 < r3) goto L_0x0044
        L_0x004e:
            r1 = r2
        L_0x004f:
            r6.mo44085b(r7)
            r6.mo44089i()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15487l.mo44087e(androidx.compose.ui.input.pointer.g):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        r2 = mo44100g();
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44088f(@org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.p004ui.input.pointer.C15506v, androidx.compose.p004ui.input.pointer.C15507w> r9, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15588o r10, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15476g r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r9)
            java.util.Map<androidx.compose.ui.input.pointer.v, androidx.compose.ui.input.pointer.w> r9 = r8.f38511d
            boolean r9 = r9.isEmpty()
            r10 = 0
            if (r9 == 0) goto L_0x0019
            goto L_0x006f
        L_0x0019:
            androidx.compose.ui.node.g1 r9 = r8.f38509b
            boolean r9 = androidx.compose.p004ui.node.C15692h1.m70288c(r9)
            if (r9 != 0) goto L_0x0022
            goto L_0x006f
        L_0x0022:
            androidx.compose.ui.input.pointer.o r9 = r8.f38513f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            androidx.compose.ui.layout.o r0 = r8.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r0 = r0.mo44434a()
            androidx.compose.ui.node.g1 r2 = r8.f38509b
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial
            r2.mo44557l(r9, r3, r0)
            androidx.compose.ui.node.g1 r2 = r8.f38509b
            boolean r2 = androidx.compose.p004ui.node.C15692h1.m70288c(r2)
            r3 = 1
            if (r2 == 0) goto L_0x005f
            androidx.compose.runtime.collection.g r2 = r8.mo44100g()
            int r4 = r2.mo15469h0()
            if (r4 <= 0) goto L_0x005f
            java.lang.Object[] r2 = r2.mo15462d0()
        L_0x004e:
            r5 = r2[r10]
            androidx.compose.ui.input.pointer.l r5 = (androidx.compose.p004ui.input.pointer.C15487l) r5
            java.util.Map<androidx.compose.ui.input.pointer.v, androidx.compose.ui.input.pointer.w> r6 = r8.f38511d
            androidx.compose.ui.layout.o r7 = r8.f38512e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r5.mo44088f(r6, r7, r11, r12)
            int r10 = r10 + r3
            if (r10 < r4) goto L_0x004e
        L_0x005f:
            androidx.compose.ui.node.g1 r10 = r8.f38509b
            boolean r10 = androidx.compose.p004ui.node.C15692h1.m70288c(r10)
            if (r10 == 0) goto L_0x006e
            androidx.compose.ui.node.g1 r10 = r8.f38509b
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p004ui.input.pointer.PointerEventPass.Main
            r10.mo44557l(r9, r11, r0)
        L_0x006e:
            r10 = r3
        L_0x006f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15487l.mo44088f(java.util.Map, androidx.compose.ui.layout.o, androidx.compose.ui.input.pointer.g, boolean):boolean");
    }

    /* renamed from: i */
    public final void mo44089i() {
        this.f38511d.clear();
        this.f38512e = null;
    }

    /* renamed from: j */
    public final boolean mo44090j(C11289a<C11079d2> aVar) {
        if (this.f38511d.isEmpty() || !C15692h1.m70288c(this.f38509b)) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @C12579k
    /* renamed from: k */
    public final C8423g<C15506v> mo44091k() {
        return this.f38510c;
    }

    @C12579k
    /* renamed from: l */
    public final C15689g1 mo44092l() {
        return this.f38509b;
    }

    /* renamed from: m */
    public final boolean mo44093m(C15491o oVar, C15491o oVar2) {
        if (oVar == null || oVar.mo44110e().size() != oVar2.mo44110e().size()) {
            return true;
        }
        int size = oVar2.mo44110e().size();
        for (int i = 0; i < size; i++) {
            if (!C15094f.m64876l(oVar.mo44110e().get(i).mo44177q(), oVar2.mo44110e().get(i).mo44177q())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo44094n() {
        this.f38515h = true;
    }

    @C12579k
    public String toString() {
        return "Node(pointerInputFilter=" + this.f38509b + ", children=" + mo44100g() + ", pointerIds=" + this.f38510c + ')';
    }
}
