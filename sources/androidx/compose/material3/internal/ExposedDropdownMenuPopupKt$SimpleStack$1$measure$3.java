package androidx.compose.material3.internal;

import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3\n*L\n1#1,476:1\n*E\n"})
public final class ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<C15611w0> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(List<? extends C15611w0> list) {
        super(1);
        this.$placeables = list;
    }

    /* renamed from: a */
    public final void mo12674a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        int G = CollectionsKt__CollectionsKt.m40443G(this.$placeables);
        if (G >= 0) {
            int i = 0;
            while (true) {
                C15611w0.C15612a.m69414v(aVar, this.$placeables.get(i), 0, 0, 0.0f, 4, (Object) null);
                if (i != G) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12674a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
