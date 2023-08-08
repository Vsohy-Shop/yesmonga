package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"", "a", "()Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n171#2,13:153\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n75#1:153,13\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2 */
public final class MultiParagraphIntrinsics$minIntrinsicWidth$2 extends Lambda implements C11289a<Float> {
    final /* synthetic */ MultiParagraphIntrinsics this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics$minIntrinsicWidth$2(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        super(0);
        this.this$0 = multiParagraphIntrinsics;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        C16360p pVar;
        float f;
        C16401q g;
        List<C16360p> f2 = this.this$0.mo46231f();
        if (f2.isEmpty()) {
            pVar = null;
        } else {
            C16360p pVar2 = f2.get(0);
            float b = pVar2.mo47469g().mo46228b();
            int G = CollectionsKt__CollectionsKt.m40443G(f2);
            int i = 1;
            if (1 <= G) {
                while (true) {
                    C16360p pVar3 = f2.get(i);
                    float b2 = pVar3.mo47469g().mo46228b();
                    if (Float.compare(b, b2) < 0) {
                        pVar2 = pVar3;
                        b = b2;
                    }
                    if (i == G) {
                        break;
                    }
                    i++;
                }
            }
            pVar = pVar2;
        }
        C16360p pVar4 = pVar;
        if (pVar4 == null || (g = pVar4.mo47469g()) == null) {
            f = 0.0f;
        } else {
            f = g.mo46228b();
        }
        return Float.valueOf(f);
    }
}
