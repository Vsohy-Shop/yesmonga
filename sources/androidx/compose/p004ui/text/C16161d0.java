package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.intl.C16340e;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.platform.C16382k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.d0 */
public final class C16161d0 {
    @C12579k

    /* renamed from: a */
    public static final C16461z f40192a = C16382k.m73941a();

    @C12579k
    /* renamed from: a */
    public static final String m72787a(@C12579k String str, @C12579k C16340e eVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "locale");
        return f40192a.mo47544b(str, eVar.mo47355b());
    }

    @C12579k
    /* renamed from: b */
    public static final String m72788b(@C12579k String str, @C12579k C16342f fVar) {
        C16340e eVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        if (fVar.isEmpty()) {
            eVar = C16340e.f40568b.mo47362a();
        } else {
            eVar = fVar.mo47372i(0);
        }
        return m72787a(str, eVar);
    }

    @C12579k
    /* renamed from: c */
    public static final String m72789c(@C12579k String str, @C12579k C16340e eVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "locale");
        return f40192a.mo47545c(str, eVar.mo47355b());
    }

    @C12579k
    /* renamed from: d */
    public static final String m72790d(@C12579k String str, @C12579k C16342f fVar) {
        C16340e eVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        if (fVar.isEmpty()) {
            eVar = C16340e.f40568b.mo47362a();
        } else {
            eVar = fVar.mo47372i(0);
        }
        return m72789c(str, eVar);
    }

    @C12579k
    /* renamed from: e */
    public static final String m72791e(@C12579k String str, @C12579k C16340e eVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "locale");
        return f40192a.mo47543a(str, eVar.mo47355b());
    }

    @C12579k
    /* renamed from: f */
    public static final String m72792f(@C12579k String str, @C12579k C16342f fVar) {
        C16340e eVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        if (fVar.isEmpty()) {
            eVar = C16340e.f40568b.mo47362a();
        } else {
            eVar = fVar.mo47372i(0);
        }
        return m72791e(str, eVar);
    }

    @C12579k
    /* renamed from: g */
    public static final String m72793g(@C12579k String str, @C12579k C16340e eVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "locale");
        return f40192a.mo47546d(str, eVar.mo47355b());
    }

    @C12579k
    /* renamed from: h */
    public static final String m72794h(@C12579k String str, @C12579k C16342f fVar) {
        C16340e eVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "localeList");
        if (fVar.isEmpty()) {
            eVar = C16340e.f40568b.mo47362a();
        } else {
            eVar = fVar.mo47372i(0);
        }
        return m72793g(str, eVar);
    }
}
