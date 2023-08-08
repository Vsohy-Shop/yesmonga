package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.C8547h2;
import java.util.List;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.v */
public final class C16246v {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C16242u m73185a(@C12579k C16251x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "typeface");
        return new C16221l0(x0Var);
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C16242u m73186b(@C12579k List<? extends C16238t> list) {
        Intrinsics.checkNotNullParameter(list, "fonts");
        return new C16176a0(list);
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public static final C16242u m73187c(@C12579k C16238t... tVarArr) {
        Intrinsics.checkNotNullParameter(tVarArr, "fonts");
        return new C16176a0(C10956m.m41290t(tVarArr));
    }
}
