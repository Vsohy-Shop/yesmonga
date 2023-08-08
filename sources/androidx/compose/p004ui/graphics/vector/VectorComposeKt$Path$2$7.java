package androidx.compose.p004ui.graphics.vector;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7 */
public final class VectorComposeKt$Path$2$7 extends Lambda implements C11304p<PathComponent, Float, C11079d2> {

    /* renamed from: f */
    public static final VectorComposeKt$Path$2$7 f37792f = new VectorComposeKt$Path$2$7();

    public VectorComposeKt$Path$2$7() {
        super(2);
    }

    /* renamed from: a */
    public final void mo43117a(@C12579k PathComponent pathComponent, float f) {
        Intrinsics.checkNotNullParameter(pathComponent, "$this$set");
        pathComponent.mo43077z(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo43117a((PathComponent) obj, ((Number) obj2).floatValue());
        return C11079d2.f28267a;
    }
}
