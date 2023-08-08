package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.modifier.C15630f;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,305:1\n135#2:306\n135#2:307\n135#2:308\n135#2:309\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:306\n75#1:307\n102#1:308\n126#1:309\n*E\n"})
public final class WindowInsetsPaddingKt {
    @C12579k

    /* renamed from: a */
    public static final C15638m<C2354e1> f6222a = C15630f.m69509a(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.f6223f);

    @C8547h2
    @C12579k
    @C2396p
    /* renamed from: a */
    public static final C8767m m10241a(@C12579k C8767m mVar, @C12579k C2366i0 i0Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2306x7feb0d2b(i0Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2371j0(i0Var, lVar));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m10242b(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2305x7feb0d2a(e1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2342b1(e1Var, lVar));
    }

    @C11395k(message = "Use consumeWindowInsets", replaceWith = @C11587t0(expression = "this.consumeWindowInsets(paddingValues)", imports = {}))
    @C8547h2
    @C2396p
    @C12579k
    /* renamed from: c */
    public static final C8767m m10243c(@C12579k C8767m mVar, @C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        return m10241a(mVar, i0Var);
    }

    @C11395k(message = "Use consumeWindowInsets", replaceWith = @C11587t0(expression = "this.consumeWindowInsets(insets)", imports = {}))
    @C8547h2
    @C2396p
    @C12579k
    /* renamed from: d */
    public static final C8767m m10244d(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        return m10242b(mVar, e1Var);
    }

    @C12579k
    /* renamed from: e */
    public static final C15638m<C2354e1> m10245e() {
        return f6222a;
    }

    @C8547h2
    @C12579k
    /* renamed from: f */
    public static final C8767m m10246f(@C12579k C8767m mVar, @C12579k C11300l<? super C2354e1, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C2307xe0c3dfaf(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2377l(lVar, lVar2));
    }

    @C8547h2
    @C12579k
    /* renamed from: g */
    public static final C8767m m10247g(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2308x6f3b7473(e1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new InsetsPaddingModifier(e1Var, lVar));
    }

    @C11395k(message = "Use onConsumedWindowInsetsChanged", replaceWith = @C11587t0(expression = "onConsumedWindowInsetsChanged(block)", imports = {}))
    @C8547h2
    @C2396p
    @C12579k
    /* renamed from: h */
    public static final C8767m m10248h(@C12579k C8767m mVar, @C12579k C11300l<? super C2354e1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return m10246f(mVar, lVar);
    }
}
