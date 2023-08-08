package dev.chrisbanes.snapper;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Ldev/chrisbanes/snapper/f;", "it", "", "a", "(Ldev/chrisbanes/snapper/f;)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SnapperFlingBehaviorDefaults$MaximumFlingDistance$1 extends Lambda implements C11300l<C10368f, Float> {

    /* renamed from: f */
    public static final SnapperFlingBehaviorDefaults$MaximumFlingDistance$1 f28012f = new SnapperFlingBehaviorDefaults$MaximumFlingDistance$1();

    public SnapperFlingBehaviorDefaults$MaximumFlingDistance$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke(@C12579k C10368f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "it");
        return Float.valueOf(Float.MAX_VALUE);
    }
}
