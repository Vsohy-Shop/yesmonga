package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.C11078d1;
import kotlin.collections.C10927c1;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n33#2,4:118\n38#2:124\n108#3,3:115\n111#3,2:122\n113#3:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:118,4\n74#1:124\n74#1:115,3\n74#1:122,2\n74#1:125\n*E\n"})
/* renamed from: androidx.compose.ui.text.JvmAnnotatedString_jvmKt */
public final class JvmAnnotatedString_jvmKt {
    /* renamed from: a */
    public static final void m72273a(List<? extends C16156d.C16159b<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C16156d.C16159b bVar = (C16156d.C16159b) list.get(i);
                sortedSet.add(Integer.valueOf(bVar.mo46740i()));
                sortedSet.add(Integer.valueOf(bVar.mo46737g()));
            }
        }
    }

    @C12579k
    /* renamed from: b */
    public static final C16156d m72274b(@C12579k C16156d dVar, @C12579k C11305q<? super String, ? super Integer, ? super Integer, String> qVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "transform");
        TreeSet h = C10927c1.m40885h(0, Integer.valueOf(dVar.mo46683j().length()));
        m72273a(dVar.mo46679g(), h);
        m72273a(dVar.mo46676e(), h);
        m72273a(dVar.mo46672b(), h);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a(0, 0));
        CollectionsKt___CollectionsKt.m40612b6(h, 2, 0, false, new JvmAnnotatedString_jvmKt$transform$1(objectRef, qVar, dVar, j0), 6, (Object) null);
        List<C16156d.C16159b<C16151c0>> g = dVar.mo46679g();
        ArrayList arrayList3 = null;
        if (g != null) {
            arrayList = new ArrayList(g.size());
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C16156d.C16159b bVar = g.get(i);
                Object h2 = bVar.mo46738h();
                Object obj = j0.get(Integer.valueOf(bVar.mo46740i()));
                Intrinsics.checkNotNull(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = j0.get(Integer.valueOf(bVar.mo46737g()));
                Intrinsics.checkNotNull(obj2);
                arrayList.add(new C16156d.C16159b(h2, intValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<C16156d.C16159b<C16451t>> e = dVar.mo46676e();
        if (e != null) {
            arrayList2 = new ArrayList(e.size());
            int size2 = e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C16156d.C16159b bVar2 = e.get(i2);
                Object h3 = bVar2.mo46738h();
                Object obj3 = j0.get(Integer.valueOf(bVar2.mo46740i()));
                Intrinsics.checkNotNull(obj3);
                int intValue2 = ((Number) obj3).intValue();
                Object obj4 = j0.get(Integer.valueOf(bVar2.mo46737g()));
                Intrinsics.checkNotNull(obj4);
                arrayList2.add(new C16156d.C16159b(h3, intValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<C16156d.C16159b<? extends Object>> b = dVar.mo46672b();
        if (b != null) {
            arrayList3 = new ArrayList(b.size());
            int size3 = b.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C16156d.C16159b bVar3 = b.get(i3);
                Object h4 = bVar3.mo46738h();
                Object obj5 = j0.get(Integer.valueOf(bVar3.mo46740i()));
                Intrinsics.checkNotNull(obj5);
                int intValue3 = ((Number) obj5).intValue();
                Object obj6 = j0.get(Integer.valueOf(bVar3.mo46737g()));
                Intrinsics.checkNotNull(obj6);
                arrayList3.add(new C16156d.C16159b(h4, intValue3, ((Number) obj6).intValue()));
            }
        }
        return new C16156d((String) objectRef.element, arrayList, arrayList2, arrayList3);
    }
}
