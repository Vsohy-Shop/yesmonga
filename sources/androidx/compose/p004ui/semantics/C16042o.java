package androidx.compose.p004ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,72:1\n33#2,6:73\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n63#1:73,6\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.o */
public final class C16042o {
    @C12579k
    /* renamed from: a */
    public static final List<SemanticsNode> m72174a(@C12579k C16041n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return CollectionsKt___CollectionsKt.m40557Q5(m72175b(nVar, !z).values());
    }

    @C12579k
    /* renamed from: b */
    public static final Map<Integer, SemanticsNode> m72175b(@C12579k C16041n nVar, boolean z) {
        SemanticsNode semanticsNode;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            semanticsNode = nVar.mo46174b();
        } else {
            semanticsNode = nVar.mo46173a();
        }
        m72177d(linkedHashMap, semanticsNode);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static /* synthetic */ Map m72176c(C16041n nVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m72175b(nVar, z);
    }

    /* renamed from: d */
    public static final void m72177d(Map<Integer, SemanticsNode> map, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.mo46024l()), semanticsNode);
        List<SemanticsNode> i = semanticsNode.mo46021i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            m72177d(map, i.get(i2));
        }
    }
}
