package androidx.compose.p004ui.platform.accessibility;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.semantics.C16024b;
import androidx.compose.p004ui.semantics.C16025c;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.C18065l0;
import com.carrefour.fid.android.shared.constant.C28531e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCollectionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n1#1,153:1\n33#2,6:154\n33#2,6:160\n38#3,11:166\n68#3,7:177\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n*L\n43#1:154,6\n87#1:160,6\n122#1:166,11\n130#1:177,7\n*E\n"})
/* renamed from: androidx.compose.ui.platform.accessibility.CollectionInfoKt */
public final class CollectionInfoKt {
    /* renamed from: a */
    public static final boolean m71226a(List<SemanticsNode> list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list2 = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int G = CollectionsKt__CollectionsKt.m40443G(list);
            int i = 0;
            while (i < G) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                list2.add(C15094f.m64868d(C15096g.m64898a(Math.abs(C15094f.m64880p(semanticsNode4.mo46019g().mo42275o()) - C15094f.m64880p(semanticsNode3.mo46019g().mo42275o())), Math.abs(C15094f.m64882r(semanticsNode4.mo46019g().mo42275o()) - C15094f.m64882r(semanticsNode3.mo46019g().mo42275o())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (list2.size() == 1) {
            j = ((C15094f) CollectionsKt___CollectionsKt.m40706w2(list2)).mo42242A();
        } else if (!list2.isEmpty()) {
            Object w2 = CollectionsKt___CollectionsKt.m40706w2(list2);
            int G2 = CollectionsKt__CollectionsKt.m40443G(list2);
            if (1 <= G2) {
                int i2 = 1;
                while (true) {
                    w2 = C15094f.m64868d(C15094f.m64886v(((C15094f) w2).mo42242A(), ((C15094f) list2.get(i2)).mo42242A()));
                    if (i2 == G2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((C15094f) w2).mo42242A();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (C15094f.m64870f(j) < C15094f.m64869e(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m71227b(@C12579k SemanticsNode semanticsNode) {
        Intrinsics.checkNotNullParameter(semanticsNode, "<this>");
        C16035j k = semanticsNode.mo46023k();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (SemanticsConfigurationKt.m71865a(k, semanticsProperties.mo46046a()) == null && SemanticsConfigurationKt.m71865a(semanticsNode.mo46023k(), semanticsProperties.mo46066v()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m71228c(C16024b bVar) {
        return bVar.mo46094b() < 0 || bVar.mo46093a() < 0;
    }

    /* renamed from: d */
    public static final void m71229d(@C12579k SemanticsNode semanticsNode, @C12579k C18065l0 l0Var) {
        int i;
        Intrinsics.checkNotNullParameter(semanticsNode, "node");
        Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
        C16035j k = semanticsNode.mo46023k();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        C16024b bVar = (C16024b) SemanticsConfigurationKt.m71865a(k, semanticsProperties.mo46046a());
        if (bVar != null) {
            l0Var.mo52600b1(m71231f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.m71865a(semanticsNode.mo46023k(), semanticsProperties.mo46066v()) != null) {
            List<SemanticsNode> t = semanticsNode.mo46032t();
            int size = t.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = t.get(i2);
                if (semanticsNode2.mo46023k().mo46161i(SemanticsProperties.f39725a.mo46067w())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i3 = 1;
        if (!arrayList.isEmpty()) {
            boolean a = m71226a(arrayList);
            if (a) {
                i = 1;
            } else {
                i = arrayList.size();
            }
            if (a) {
                i3 = arrayList.size();
            }
            l0Var.mo52600b1(C18065l0.C18068c.m82100f(i, i3, false, 0));
        }
    }

    /* renamed from: e */
    public static final void m71230e(@C12579k SemanticsNode semanticsNode, @C12579k C18065l0 l0Var) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(semanticsNode, "node");
        Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
        C16035j k = semanticsNode.mo46023k();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        C16025c cVar = (C16025c) SemanticsConfigurationKt.m71865a(k, semanticsProperties.mo46047b());
        if (cVar != null) {
            l0Var.mo52604c1(m71232g(cVar, semanticsNode));
        }
        SemanticsNode q = semanticsNode.mo46029q();
        if (q != null && SemanticsConfigurationKt.m71865a(q.mo46023k(), semanticsProperties.mo46066v()) != null) {
            C16024b bVar = (C16024b) SemanticsConfigurationKt.m71865a(q.mo46023k(), semanticsProperties.mo46046a());
            if ((bVar == null || !m71228c(bVar)) && semanticsNode.mo46023k().mo46161i(semanticsProperties.mo46067w())) {
                ArrayList arrayList = new ArrayList();
                List<SemanticsNode> t = q.mo46032t();
                int size = t.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    SemanticsNode semanticsNode2 = t.get(i4);
                    if (semanticsNode2.mo46023k().mo46161i(SemanticsProperties.f39725a.mo46067w())) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.mo46026n().mo44614D0() < semanticsNode.mo46026n().mo44614D0()) {
                            i3++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a = m71226a(arrayList);
                    if (a) {
                        i = 0;
                    } else {
                        i = i3;
                    }
                    if (a) {
                        i2 = i3;
                    } else {
                        i2 = 0;
                    }
                    C18065l0.C18069d h = C18065l0.C18069d.m82106h(i, 1, i2, 1, false, ((Boolean) semanticsNode.mo46023k().mo46166w(SemanticsProperties.f39725a.mo46067w(), CollectionInfoKt$setCollectionItemInfo$itemInfo$1.f39481f)).booleanValue());
                    if (h != null) {
                        l0Var.mo52604c1(h);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static final C18065l0.C18068c m71231f(C16024b bVar) {
        return C18065l0.C18068c.m82100f(bVar.mo46094b(), bVar.mo46093a(), false, 0);
    }

    /* renamed from: g */
    public static final C18065l0.C18069d m71232g(C16025c cVar, SemanticsNode semanticsNode) {
        return C18065l0.C18069d.m82106h(cVar.mo46097c(), cVar.mo46098d(), cVar.mo46095a(), cVar.mo46096b(), false, ((Boolean) semanticsNode.mo46023k().mo46166w(SemanticsProperties.f39725a.mo46067w(), CollectionInfoKt$toAccessibilityCollectionItemInfo$1.f39482f)).booleanValue());
    }
}
