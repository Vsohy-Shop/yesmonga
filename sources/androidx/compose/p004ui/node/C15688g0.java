package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.C15700k0;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,141:1\n33#2,6:142\n116#2,2:148\n33#2,6:150\n118#2:156\n116#2,2:157\n33#2,6:159\n118#2:165\n33#2,6:166\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:142,6\n59#1:148,2\n59#1:150,6\n59#1:156\n82#1:157,2\n82#1:159,6\n82#1:165\n134#1:166,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.g0 */
public final class C15688g0 {
    @C12579k

    /* renamed from: a */
    public final LayoutNode f38999a;
    @C12579k

    /* renamed from: b */
    public final DepthSortedSet f39000b;
    @C12579k

    /* renamed from: c */
    public final List<C15700k0.C15701a> f39001c;

    public C15688g0(@C12579k LayoutNode layoutNode, @C12579k DepthSortedSet depthSortedSet, @C12579k List<C15700k0.C15701a> list) {
        Intrinsics.checkNotNullParameter(layoutNode, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(depthSortedSet, "relayoutNodes");
        Intrinsics.checkNotNullParameter(list, "postponedMeasureRequests");
        this.f38999a = layoutNode;
        this.f39000b = depthSortedSet;
        this.f39001c = list;
    }

    /* renamed from: e */
    public static final void m70262e(C15688g0 g0Var, StringBuilder sb, LayoutNode layoutNode, int i) {
        boolean z;
        String f = g0Var.mo45014f(layoutNode);
        if (f.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(f);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append(10);
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> Z = layoutNode.mo44667Z();
        int size = Z.size();
        for (int i3 = 0; i3 < size; i3++) {
            m70262e(g0Var, sb, Z.get(i3), i);
        }
    }

    /* renamed from: a */
    public final void mo45010a() {
        if (!mo45012c(this.f38999a)) {
            System.out.println(mo45013d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45011b(androidx.compose.p004ui.node.LayoutNode r12) {
        /*
            r11 = this;
            androidx.compose.ui.node.LayoutNode r0 = r12.mo44613C0()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r0.mo44691m0()
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            boolean r3 = r12.mo44456p()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x002b
            int r3 = r12.mo44614D0()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r6) goto L_0x00a5
            if (r0 == 0) goto L_0x0028
            boolean r3 = r0.mo44456p()
            if (r3 != r5) goto L_0x0028
            r3 = r5
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            if (r3 == 0) goto L_0x00a5
        L_0x002b:
            boolean r3 = r12.mo44704t0()
            if (r3 == 0) goto L_0x005e
            java.util.List<androidx.compose.ui.node.k0$a> r3 = r11.f39001c
            int r6 = r3.size()
            r7 = r4
        L_0x0038:
            if (r7 >= r6) goto L_0x005a
            java.lang.Object r8 = r3.get(r7)
            r9 = r8
            androidx.compose.ui.node.k0$a r9 = (androidx.compose.p004ui.node.C15700k0.C15701a) r9
            androidx.compose.ui.node.LayoutNode r10 = r9.mo45071a()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r12)
            if (r10 == 0) goto L_0x0053
            boolean r9 = r9.mo45073c()
            if (r9 != 0) goto L_0x0053
            r9 = r5
            goto L_0x0054
        L_0x0053:
            r9 = r4
        L_0x0054:
            if (r9 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            int r7 = r7 + 1
            goto L_0x0038
        L_0x005a:
            r8 = r1
        L_0x005b:
            if (r8 == 0) goto L_0x005e
            return r5
        L_0x005e:
            boolean r3 = r12.mo44704t0()
            if (r3 == 0) goto L_0x007f
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f39000b
            boolean r12 = r1.mo44599b(r12)
            if (r12 != 0) goto L_0x007d
            if (r0 == 0) goto L_0x0076
            boolean r12 = r0.mo44704t0()
            if (r12 != r5) goto L_0x0076
            r12 = r5
            goto L_0x0077
        L_0x0076:
            r12 = r4
        L_0x0077:
            if (r12 != 0) goto L_0x007d
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring
            if (r2 != r12) goto L_0x007e
        L_0x007d:
            r4 = r5
        L_0x007e:
            return r4
        L_0x007f:
            boolean r3 = r12.mo44689l0()
            if (r3 == 0) goto L_0x00a5
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f39000b
            boolean r12 = r1.mo44599b(r12)
            if (r12 != 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            boolean r12 = r0.mo44704t0()
            if (r12 != 0) goto L_0x00a3
            boolean r12 = r0.mo44689l0()
            if (r12 != 0) goto L_0x00a3
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring
            if (r2 == r12) goto L_0x00a3
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LayingOut
            if (r2 != r12) goto L_0x00a4
        L_0x00a3:
            r4 = r5
        L_0x00a4:
            return r4
        L_0x00a5:
            java.lang.Boolean r3 = r12.mo44668Z0()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r3 == 0) goto L_0x0160
            boolean r3 = r12.mo44695o0()
            if (r3 == 0) goto L_0x00e4
            java.util.List<androidx.compose.ui.node.k0$a> r3 = r11.f39001c
            int r6 = r3.size()
            r7 = r4
        L_0x00be:
            if (r7 >= r6) goto L_0x00e1
            java.lang.Object r8 = r3.get(r7)
            r9 = r8
            androidx.compose.ui.node.k0$a r9 = (androidx.compose.p004ui.node.C15700k0.C15701a) r9
            androidx.compose.ui.node.LayoutNode r10 = r9.mo45071a()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r12)
            if (r10 == 0) goto L_0x00d9
            boolean r9 = r9.mo45073c()
            if (r9 == 0) goto L_0x00d9
            r9 = r5
            goto L_0x00da
        L_0x00d9:
            r9 = r4
        L_0x00da:
            if (r9 == 0) goto L_0x00de
            r1 = r8
            goto L_0x00e1
        L_0x00de:
            int r7 = r7 + 1
            goto L_0x00be
        L_0x00e1:
            if (r1 == 0) goto L_0x00e4
            return r5
        L_0x00e4:
            boolean r1 = r12.mo44695o0()
            if (r1 == 0) goto L_0x0123
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f39000b
            boolean r1 = r1.mo44599b(r12)
            if (r1 != 0) goto L_0x0121
            if (r0 == 0) goto L_0x00fc
            boolean r1 = r0.mo44695o0()
            if (r1 != r5) goto L_0x00fc
            r1 = r5
            goto L_0x00fd
        L_0x00fc:
            r1 = r4
        L_0x00fd:
            if (r1 != 0) goto L_0x0121
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r2 == r1) goto L_0x0121
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.mo44704t0()
            if (r0 != r5) goto L_0x010d
            r0 = r5
            goto L_0x010e
        L_0x010d:
            r0 = r4
        L_0x010e:
            if (r0 == 0) goto L_0x0122
            androidx.compose.ui.layout.d0 r0 = r12.mo44701r0()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.compose.ui.node.LayoutNode r0 = r0.mo44379a()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x0122
        L_0x0121:
            r4 = r5
        L_0x0122:
            return r4
        L_0x0123:
            boolean r1 = r12.mo44693n0()
            if (r1 == 0) goto L_0x0160
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f39000b
            boolean r1 = r1.mo44599b(r12)
            if (r1 != 0) goto L_0x015e
            if (r0 == 0) goto L_0x015e
            boolean r1 = r0.mo44695o0()
            if (r1 != 0) goto L_0x015e
            boolean r1 = r0.mo44693n0()
            if (r1 != 0) goto L_0x015e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r2 == r1) goto L_0x015e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r2 == r1) goto L_0x015e
            boolean r0 = r0.mo44689l0()
            if (r0 == 0) goto L_0x015f
            androidx.compose.ui.layout.d0 r0 = r12.mo44701r0()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.compose.ui.node.LayoutNode r0 = r0.mo44379a()
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x015f
        L_0x015e:
            r4 = r5
        L_0x015f:
            return r4
        L_0x0160:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.C15688g0.mo45011b(androidx.compose.ui.node.LayoutNode):boolean");
    }

    /* renamed from: c */
    public final boolean mo45012c(LayoutNode layoutNode) {
        if (!mo45011b(layoutNode)) {
            return false;
        }
        List<LayoutNode> Z = layoutNode.mo44667Z();
        int size = Z.size();
        for (int i = 0; i < size; i++) {
            if (!mo45012c(Z.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final String mo45013d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        m70262e(this, sb, this.f38999a, 0);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String mo45014f(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C12361b.f30260k);
        sb2.append(layoutNode.mo44691m0());
        sb2.append(C12361b.f30261l);
        sb.append(sb2.toString());
        if (!layoutNode.mo44456p()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.mo44707u0() + C12361b.f30261l);
        if (!mo45011b(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }
}
