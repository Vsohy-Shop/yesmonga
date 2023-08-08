package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$rememberTopAppBarState$1$1 extends Lambda implements C11289a<TopAppBarState> {
    final /* synthetic */ float $initialContentOffset;
    final /* synthetic */ float $initialHeightOffset;
    final /* synthetic */ float $initialHeightOffsetLimit;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$rememberTopAppBarState$1$1(float f, float f2, float f3) {
        super(0);
        this.$initialHeightOffsetLimit = f;
        this.$initialHeightOffset = f2;
        this.$initialContentOffset = f3;
    }

    @C12579k
    /* renamed from: a */
    public final TopAppBarState invoke() {
        return new TopAppBarState(this.$initialHeightOffsetLimit, this.$initialHeightOffset, this.$initialContentOffset);
    }
}
