package dev.chrisbanes.snapper;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Ldev/chrisbanes/snapper/f;", "layout", "Ldev/chrisbanes/snapper/g;", "item", "", "a", "(Ldev/chrisbanes/snapper/f;Ldev/chrisbanes/snapper/g;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SnapOffsets$End$1 extends Lambda implements C11304p<C10368f, C10369g, Integer> {

    /* renamed from: f */
    public static final SnapOffsets$End$1 f27998f = new SnapOffsets$End$1();

    public SnapOffsets$End$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(@C12579k C10368f fVar, @C12579k C10369g gVar) {
        Intrinsics.checkNotNullParameter(fVar, "layout");
        Intrinsics.checkNotNullParameter(gVar, "item");
        return Integer.valueOf(fVar.mo21757f() - gVar.mo21794c());
    }
}
