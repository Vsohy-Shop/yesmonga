package androidx.compose.p004ui.text.style;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"", "a", "()Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$merge$1 */
public final class TextForegroundStyle$merge$1 extends Lambda implements C11289a<Float> {
    final /* synthetic */ TextForegroundStyle this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextForegroundStyle$merge$1(TextForegroundStyle textForegroundStyle) {
        super(0);
        this.this$0 = textForegroundStyle;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        return Float.valueOf(this.this$0.getAlpha());
    }
}
