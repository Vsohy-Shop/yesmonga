package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1983k;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "I", "a", "()I", "Landroidx/compose/animation/core/i;", "", "Landroidx/compose/animation/core/k;", "previousAnimation", "Landroidx/compose/animation/core/i;", "b", "()Landroidx/compose/animation/core/i;", "<init>", "(ILandroidx/compose/animation/core/i;)V", "foundation_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    @C12579k
    private final C1976i<Float, C1983k> previousAnimation;

    public ItemFoundInScroll(int i, @C12579k C1976i<Float, C1983k> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "previousAnimation");
        this.itemOffset = i;
        this.previousAnimation = iVar;
    }

    /* renamed from: a */
    public final int mo8672a() {
        return this.itemOffset;
    }

    @C12579k
    /* renamed from: b */
    public final C1976i<Float, C1983k> mo8673b() {
        return this.previousAnimation;
    }
}
