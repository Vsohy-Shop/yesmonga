package androidx.compose.p004ui.graphics;

import android.graphics.Canvas;
import com.urbanairship.iam.C9127a0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.f0 */
public final class C15208f0 {
    @C12579k

    /* renamed from: a */
    public static final Canvas f37527a = new Canvas();

    @C12579k
    /* renamed from: a */
    public static final C15118b2 m65926a(@C12579k C15403w2 w2Var) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        C15201e0 e0Var = new C15201e0();
        e0Var.mo42734V(new Canvas(C15247k0.m66138b(w2Var)));
        return e0Var;
    }

    @C12579k
    /* renamed from: b */
    public static final C15118b2 m65927b(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "c");
        C15201e0 e0Var = new C15201e0();
        e0Var.mo42734V(canvas);
        return e0Var;
    }

    @C12579k
    /* renamed from: d */
    public static final Canvas m65929d(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        return ((C15201e0) b2Var).mo42733T();
    }
}
