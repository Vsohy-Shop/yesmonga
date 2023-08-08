package androidx.compose.material.internal;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,475:1\n151#2,3:476\n33#2,4:479\n154#2,2:483\n38#2:485\n156#2:486\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$SimpleStack$1\n*L\n189#1:476,3\n189#1:479,4\n189#1:483,2\n189#1:485\n189#1:486\n*E\n"})
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements C15560f0 {

    /* renamed from: a */
    public static final ExposedDropdownMenuPopupKt$SimpleStack$1 f18835a = new ExposedDropdownMenuPopupKt$SimpleStack$1();

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(((C15557e0) list.get(i4)).mo44324t0(j));
                }
                int G = CollectionsKt__CollectionsKt.m40443G(arrayList);
                if (G >= 0) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        C15611w0 w0Var = (C15611w0) arrayList.get(i3);
                        i5 = Math.max(i5, w0Var.mo44471K0());
                        i6 = Math.max(i6, w0Var.mo44468G0());
                        if (i3 == G) {
                            break;
                        }
                        i3++;
                    }
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = 0;
                    i = 0;
                }
                return C15568h0.m69206r2(h0Var, i2, i, (Map) null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(arrayList), 4, (Object) null);
            }
            C15611w0 t0 = ((C15557e0) list.get(0)).mo44324t0(j);
            return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2(t0), 4, (Object) null);
        }
        return C15568h0.m69206r2(h0Var, 0, 0, (Map) null, ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1.f18836f, 4, (Object) null);
    }
}
