package androidx.compose.p004ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15601t;
import androidx.compose.p004ui.node.C15703k1;
import androidx.compose.p004ui.node.C15706l1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p004ui.semantics.C16023a;
import androidx.compose.p004ui.semantics.C16034i;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.C16040m;
import androidx.compose.p004ui.semantics.C16041n;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3169:1\n1#2:3170\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* renamed from: A */
    public static final boolean m70903A(SemanticsNode semanticsNode) {
        return semanticsNode.mo46036x().mo46161i(C16034i.f39806a.mo46151t());
    }

    /* renamed from: B */
    public static final boolean m70904B(SemanticsNode semanticsNode) {
        return !semanticsNode.mo46010B() && !semanticsNode.mo46036x().mo46161i(SemanticsProperties.f39725a.mo46057l());
    }

    /* renamed from: C */
    public static /* synthetic */ void m70905C(SemanticsNode semanticsNode) {
    }

    /* renamed from: D */
    public static final boolean m70906D(C15880f1<Float> f1Var, C15880f1<Float> f1Var2) {
        return !f1Var.isEmpty() && !f1Var2.isEmpty() && Math.max(f1Var.getStart().floatValue(), f1Var2.getStart().floatValue()) < Math.min(f1Var.mo45718h().floatValue(), f1Var2.mo45718h().floatValue());
    }

    /* renamed from: E */
    public static final boolean m70907E(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.C15764h hVar) {
        Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> it = hVar.mo45450c().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.mo46023k().mo46161i((SemanticsPropertyKey) it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: F */
    public static final C15880f1<Float> m70908F(float f, float f2) {
        return new C15874e1(f, f2);
    }

    /* renamed from: m */
    public static final boolean m70921m(C16023a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof C16023a)) {
            return false;
        }
        C16023a aVar2 = (C16023a) obj;
        if (!Intrinsics.areEqual((Object) aVar.mo46089b(), (Object) aVar2.mo46089b())) {
            return false;
        }
        if (aVar.mo46088a() == null && aVar2.mo46088a() != null) {
            return false;
        }
        if (aVar.mo46088a() == null || aVar2.mo46088a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m70922n(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.m71865a(semanticsNode.mo46023k(), SemanticsProperties.f39725a.mo46049d()) == null;
    }

    /* renamed from: o */
    public static final boolean m70923o(SemanticsNode semanticsNode) {
        boolean z;
        C16035j a;
        if (m70903A(semanticsNode) && !Intrinsics.areEqual(SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), SemanticsProperties.f39725a.mo46052g()), (Object) Boolean.TRUE)) {
            return true;
        }
        LayoutNode q = m70925q(semanticsNode.mo46026n(), C15784x93be146e.f39266f);
        if (q != null) {
            C15703k1 j = C16040m.m72168j(q);
            if (j == null || (a = C15706l1.m70387a(j)) == null) {
                z = false;
            } else {
                z = Intrinsics.areEqual(SemanticsConfigurationKt.m71865a(a, SemanticsProperties.f39725a.mo46052g()), (Object) Boolean.TRUE);
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @C12580l
    /* renamed from: p */
    public static final C15975t3 m70924p(@C12579k List<C15975t3> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).mo45961e() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: q */
    public static final LayoutNode m70925q(LayoutNode layoutNode, C11300l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode C0 = layoutNode.mo44613C0(); C0 != null; C0 = C0.mo44613C0()) {
            if (lVar.invoke(C0).booleanValue()) {
                return C0;
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: r */
    public static final Map<Integer, C15981u3> m70926r(@C12579k C16041n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        SemanticsNode b = nVar.mo46174b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b.mo46026n().mo44456p() && b.mo46026n().mo44455k()) {
            Region region = new Region();
            C15098i g = b.mo46019g();
            region.set(new Rect(C11409d.m43851L0(g.mo42279t()), C11409d.m43851L0(g.mo42249B()), C11409d.m43851L0(g.mo42283x()), C11409d.m43851L0(g.mo42271j())));
            m70927s(region, b, linkedHashMap, b);
        }
        return linkedHashMap;
    }

    /* renamed from: s */
    public static final void m70927s(Region region, SemanticsNode semanticsNode, Map<Integer, C15981u3> map, SemanticsNode semanticsNode2) {
        boolean z;
        int i;
        C15098i iVar;
        C15601t m;
        boolean z2 = false;
        if (!semanticsNode2.mo46026n().mo44456p() || !semanticsNode2.mo46026n().mo44455k()) {
            z = true;
        } else {
            z = false;
        }
        if (region.isEmpty() && semanticsNode2.mo46024l() != semanticsNode.mo46024l()) {
            return;
        }
        if (!z || semanticsNode2.mo46037y()) {
            Rect rect = new Rect(C11409d.m43851L0(semanticsNode2.mo46035w().mo42279t()), C11409d.m43851L0(semanticsNode2.mo46035w().mo42249B()), C11409d.m43851L0(semanticsNode2.mo46035w().mo42283x()), C11409d.m43851L0(semanticsNode2.mo46035w().mo42271j()));
            Region region2 = new Region();
            region2.set(rect);
            if (semanticsNode2.mo46024l() == semanticsNode.mo46024l()) {
                i = -1;
            } else {
                i = semanticsNode2.mo46024l();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                Rect bounds = region2.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                map.put(valueOf, new C15981u3(semanticsNode2, bounds));
                List<SemanticsNode> t = semanticsNode2.mo46032t();
                for (int size = t.size() - 1; -1 < size; size--) {
                    m70927s(region, semanticsNode, map, t.get(size));
                }
                region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.mo46037y()) {
                SemanticsNode q = semanticsNode2.mo46029q();
                if (!(q == null || (m = q.mo46025m()) == null || !m.mo44456p())) {
                    z2 = true;
                }
                if (z2) {
                    iVar = q.mo46019g();
                } else {
                    iVar = new C15098i(0.0f, 0.0f, 10.0f, 10.0f);
                }
                map.put(Integer.valueOf(i), new C15981u3(semanticsNode2, new Rect(C11409d.m43851L0(iVar.mo42279t()), C11409d.m43851L0(iVar.mo42249B()), C11409d.m43851L0(iVar.mo42283x()), C11409d.m43851L0(iVar.mo42271j()))));
            } else if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                Rect bounds2 = region2.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                map.put(valueOf2, new C15981u3(semanticsNode2, bounds2));
            }
        }
    }

    /* renamed from: t */
    public static final boolean m70928t(SemanticsNode semanticsNode) {
        return semanticsNode.mo46023k().mo46161i(SemanticsProperties.f39725a.mo46046a());
    }

    /* renamed from: u */
    public static final boolean m70929u(SemanticsNode semanticsNode) {
        if (Intrinsics.areEqual((Object) m70931w(semanticsNode), (Object) Boolean.FALSE)) {
            return false;
        }
        if (Intrinsics.areEqual((Object) m70931w(semanticsNode), (Object) Boolean.TRUE) || m70928t(semanticsNode) || m70934z(semanticsNode)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static final boolean m70930v(SemanticsNode semanticsNode) {
        return semanticsNode.mo46023k().mo46161i(SemanticsProperties.f39725a.mo46062r());
    }

    /* renamed from: w */
    public static final Boolean m70931w(SemanticsNode semanticsNode) {
        return (Boolean) SemanticsConfigurationKt.m71865a(semanticsNode.mo46023k(), SemanticsProperties.f39725a.mo46058n());
    }

    /* renamed from: x */
    public static final boolean m70932x(SemanticsNode semanticsNode) {
        return semanticsNode.mo46023k().mo46161i(SemanticsProperties.f39725a.mo46063s());
    }

    /* renamed from: y */
    public static final boolean m70933y(SemanticsNode semanticsNode) {
        return semanticsNode.mo46025m().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* renamed from: z */
    public static final boolean m70934z(SemanticsNode semanticsNode) {
        return semanticsNode.mo46023k().mo46161i(C16034i.f39806a.mo46147p());
    }
}
