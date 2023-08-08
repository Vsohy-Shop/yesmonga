package androidx.compose.foundation.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PointerMoveDetectorKt {
    @C12580l
    /* renamed from: a */
    public static final Object m12328a(@C12579k C15472e0 e0Var, @C12579k PointerEventPass pointerEventPass, @C12579k C11300l<? super C15094f, C11079d2> lVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new PointerMoveDetectorKt$detectMoves$2(e0Var, pointerEventPass, lVar, (C11045c<? super PointerMoveDetectorKt$detectMoves$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m12329b(C15472e0 e0Var, PointerEventPass pointerEventPass, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return m12328a(e0Var, pointerEventPass, lVar, cVar);
    }
}
