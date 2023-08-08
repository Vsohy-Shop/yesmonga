package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CrossfadeKt$Crossfade$4$1 extends Lambda implements C11300l<T, Boolean> {
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(T t) {
        return Boolean.valueOf(!Intrinsics.areEqual((Object) t, (Object) this.$this_Crossfade.mo6706o()));
    }
}
