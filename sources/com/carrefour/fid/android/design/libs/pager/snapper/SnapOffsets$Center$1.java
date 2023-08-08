package com.carrefour.fid.android.design.libs.pager.snapper;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/libs/pager/snapper/d;", "layout", "Lcom/carrefour/fid/android/design/libs/pager/snapper/e;", "item", "", "a", "(Lcom/carrefour/fid/android/design/libs/pager/snapper/d;Lcom/carrefour/fid/android/design/libs/pager/snapper/e;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapOffsets$Center$1 extends Lambda implements C11304p<C37472d, C37473e, Integer> {

    /* renamed from: f */
    public static final SnapOffsets$Center$1 f94107f = new SnapOffsets$Center$1();

    public SnapOffsets$Center$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(@C12579k C37472d dVar, @C12579k C37473e eVar) {
        Intrinsics.checkNotNullParameter(dVar, "layout");
        Intrinsics.checkNotNullParameter(eVar, "item");
        return Integer.valueOf(dVar.mo114137g() + (((dVar.mo114136f() - dVar.mo114137g()) - eVar.mo114172c()) / 2));
    }
}
