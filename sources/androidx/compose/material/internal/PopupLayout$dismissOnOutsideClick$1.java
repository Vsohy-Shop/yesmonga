package androidx.compose.material.internal;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.unit.C16497o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/ui/geometry/f;", "offset", "Landroidx/compose/ui/unit/o;", "bounds", "", "a", "(Landroidx/compose/ui/geometry/f;Landroidx/compose/ui/unit/o;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements C11304p<C15094f, C16497o, Boolean> {

    /* renamed from: f */
    public static final PopupLayout$dismissOnOutsideClick$1 f18854f = new PopupLayout$dismissOnOutsideClick$1();

    public PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12580l C15094f fVar, @C12579k C16497o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "bounds");
        boolean z = false;
        if (fVar != null && (C15094f.m64880p(fVar.mo42242A()) < ((float) oVar.mo47886t()) || C15094f.m64880p(fVar.mo42242A()) > ((float) oVar.mo47890x()) || C15094f.m64882r(fVar.mo42242A()) < ((float) oVar.mo47858B()) || C15094f.m64882r(fVar.mo42242A()) > ((float) oVar.mo47878j()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
