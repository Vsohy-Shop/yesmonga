package androidx.compose.foundation.text;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 extends Lambda implements C11300l<Float, Float> {
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    @C12579k
    /* renamed from: a */
    public final Float mo9414a(float f) {
        float d = this.$scrollerPosition.mo9417d() + f;
        if (d > this.$scrollerPosition.mo9416c()) {
            f = this.$scrollerPosition.mo9416c() - this.$scrollerPosition.mo9417d();
        } else if (d < 0.0f) {
            f = -this.$scrollerPosition.mo9417d();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        textFieldScrollerPosition.mo9422i(textFieldScrollerPosition.mo9417d() + f);
        return Float.valueOf(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo9414a(((Number) obj).floatValue());
    }
}
