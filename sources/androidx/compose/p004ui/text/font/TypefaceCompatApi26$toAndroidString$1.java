package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/text/font/h0$a;", "setting", "", "a", "(Landroidx/compose/ui/text/font/h0$a;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1 */
public final class TypefaceCompatApi26$toAndroidString$1 extends Lambda implements C11300l<C16201h0.C16202a, CharSequence> {
    final /* synthetic */ C16479d $density;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(C16479d dVar) {
        super(1);
        this.$density = dVar;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C16201h0.C16202a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "setting");
        return '\'' + aVar.mo46913c() + "' " + aVar.mo46912b(this.$density);
    }
}
