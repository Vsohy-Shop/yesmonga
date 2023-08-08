package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n35#2,3:153\n38#2,2:160\n40#2:163\n33#3,4:156\n38#3:162\n151#3,5:164\n38#3:169\n156#3:170\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n141#1:153,3\n141#1:160,2\n141#1:163\n141#1:156,4\n141#1:162\n141#1:164,5\n141#1:169\n141#1:170\n*E\n"})
/* renamed from: androidx.compose.ui.text.l */
public final class C16351l {
    /* renamed from: b */
    public static final List<C16156d.C16159b<C16454v>> m73679b(List<C16156d.C16159b<C16454v>> list, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C16156d.C16159b<C16454v> bVar = list.get(i3);
            C16156d.C16159b bVar2 = bVar;
            if (AnnotatedStringKt.m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            C16156d.C16159b bVar3 = (C16156d.C16159b) arrayList.get(i4);
            if (i > bVar3.mo46740i() || bVar3.mo46737g() > i2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(new C16156d.C16159b(bVar3.mo46738h(), bVar3.mo46740i() - i, bVar3.mo46737g() - i));
                i4++;
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
