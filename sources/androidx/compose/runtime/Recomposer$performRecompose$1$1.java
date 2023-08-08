package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8419d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,1408:1\n105#2,5:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1044#1:1409,5\n*E\n"})
public final class Recomposer$performRecompose$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8696y $composition;
    final /* synthetic */ C8419d<Object> $modifiedValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(C8419d<Object> dVar, C8696y yVar) {
        super(0);
        this.$modifiedValues = dVar;
        this.$composition = yVar;
    }

    public final void invoke() {
        C8419d<Object> dVar = this.$modifiedValues;
        C8696y yVar = this.$composition;
        int size = dVar.size();
        for (int i = 0; i < size; i++) {
            yVar.mo16369t(dVar.get(i));
        }
    }
}
