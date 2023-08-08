package androidx.compose.foundation;

import android.view.View;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.$view = view;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(Clickable_androidKt.m8916f(this.$view));
    }
}
