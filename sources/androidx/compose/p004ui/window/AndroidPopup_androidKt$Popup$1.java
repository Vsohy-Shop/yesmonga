package androidx.compose.p004ui.window;

import androidx.compose.p004ui.C8734c;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 */
public final class AndroidPopup_androidKt$Popup$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $offset;
    final /* synthetic */ C11289a<C11079d2> $onDismissRequest;
    final /* synthetic */ C16547h $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(C8734c cVar, long j, C11289a<C11079d2> aVar, C16547h hVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, int i2) {
        super(2);
        this.$alignment = cVar;
        this.$offset = j;
        this.$onDismissRequest = aVar;
        this.$properties = hVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AndroidPopup_androidKt.m74870c(this.$alignment, this.$offset, this.$onDismissRequest, this.$properties, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
