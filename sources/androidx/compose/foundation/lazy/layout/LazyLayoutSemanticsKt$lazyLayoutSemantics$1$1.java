package androidx.compose.foundation.lazy.layout;

import androidx.compose.p004ui.semantics.C16024b;
import androidx.compose.p004ui.semantics.C16033h;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C16033h $accessibilityScrollState;
    final /* synthetic */ C16024b $collectionInfo;
    final /* synthetic */ C11300l<Object, Integer> $indexForKeyMapping;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C11304p<Float, Float, Boolean> $scrollByAction;
    final /* synthetic */ C11300l<Integer, Boolean> $scrollToIndexAction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(C11300l<Object, Integer> lVar, boolean z, C16033h hVar, C11304p<? super Float, ? super Float, Boolean> pVar, C11300l<? super Integer, Boolean> lVar2, C16024b bVar) {
        super(1);
        this.$indexForKeyMapping = lVar;
        this.$isVertical = z;
        this.$accessibilityScrollState = hVar;
        this.$scrollByAction = pVar;
        this.$scrollToIndexAction = lVar2;
        this.$collectionInfo = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m72005c0(qVar, this.$indexForKeyMapping);
        if (this.$isVertical) {
            SemanticsPropertiesKt.m72006c1(qVar, this.$accessibilityScrollState);
        } else {
            SemanticsPropertiesKt.m71967K0(qVar, this.$accessibilityScrollState);
        }
        C11304p<Float, Float, Boolean> pVar = this.$scrollByAction;
        if (pVar != null) {
            SemanticsPropertiesKt.m72053z0(qVar, (String) null, pVar, 1, (Object) null);
        }
        C11300l<Integer, Boolean> lVar = this.$scrollToIndexAction;
        if (lVar != null) {
            SemanticsPropertiesKt.m71949B0(qVar, (String) null, lVar, 1, (Object) null);
        }
        SemanticsPropertiesKt.m71953D0(qVar, this.$collectionInfo);
    }
}
