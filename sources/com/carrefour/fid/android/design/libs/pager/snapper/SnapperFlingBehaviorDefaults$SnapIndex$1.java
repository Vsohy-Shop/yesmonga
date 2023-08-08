package com.carrefour.fid.android.design.libs.pager.snapper;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/libs/pager/snapper/d;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "targetIndex", "a", "(Lcom/carrefour/fid/android/design/libs/pager/snapper/d;II)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapperFlingBehaviorDefaults$SnapIndex$1 extends Lambda implements C11305q<C37472d, Integer, Integer, Integer> {

    /* renamed from: f */
    public static final SnapperFlingBehaviorDefaults$SnapIndex$1 f94123f = new SnapperFlingBehaviorDefaults$SnapIndex$1();

    public SnapperFlingBehaviorDefaults$SnapIndex$1() {
        super(3);
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo114169a(@C12579k C37472d dVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(dVar, "<anonymous parameter 0>");
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo114169a((C37472d) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
