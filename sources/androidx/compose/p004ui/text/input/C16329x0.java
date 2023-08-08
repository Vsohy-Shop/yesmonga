package androidx.compose.p004ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16273a0;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.input.C16332z;
import androidx.core.view.inputmethod.C18245g;
import androidx.emoji2.text.C19019f;
import com.urbanairship.util.C9647e0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.x0 */
public final class C16329x0 {
    @C12579k

    /* renamed from: a */
    public static final String f40551a = "TextInputServiceAndroid";

    @C12579k
    /* renamed from: d */
    public static final Executor m73567d(@C12579k Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new C16327w0(choreographer);
    }

    /* renamed from: e */
    public static final void m73568e(Choreographer choreographer, Runnable runnable) {
        Intrinsics.checkNotNullParameter(choreographer, "$this_asExecutor");
        choreographer.postFrameCallback(new C16325v0(runnable));
    }

    /* renamed from: f */
    public static final void m73569f(Runnable runnable, long j) {
        runnable.run();
    }

    /* renamed from: g */
    public static final boolean m73570g(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: h */
    public static final void m73571h(@C12579k EditorInfo editorInfo, @C12579k C16313q qVar, @C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int f = qVar.mo47297f();
        C16310p.C16311a aVar = C16310p.f40516b;
        int i = 6;
        if (C16310p.m73495l(f, aVar.mo47279a())) {
            if (!qVar.mo47299h()) {
                i = 0;
            }
        } else if (C16310p.m73495l(f, aVar.mo47283i())) {
            i = 1;
        } else if (C16310p.m73495l(f, aVar.mo47281e())) {
            i = 2;
        } else if (C16310p.m73495l(f, aVar.mo47282g())) {
            i = 5;
        } else if (C16310p.m73495l(f, aVar.mo47284k())) {
            i = 7;
        } else if (C16310p.m73495l(f, aVar.mo47285m())) {
            i = 3;
        } else if (C16310p.m73495l(f, aVar.mo47286o())) {
            i = 4;
        } else if (!C16310p.m73495l(f, aVar.mo47280c())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int g = qVar.mo47298g();
        C16273a0.C16274a aVar2 = C16273a0.f40446b;
        if (C16273a0.m73366m(g, aVar2.mo47159o())) {
            editorInfo.inputType = 1;
        } else if (C16273a0.m73366m(g, aVar2.mo47152a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C16273a0.m73366m(g, aVar2.mo47155g())) {
            editorInfo.inputType = 2;
        } else if (C16273a0.m73366m(g, aVar2.mo47158m())) {
            editorInfo.inputType = 3;
        } else if (C16273a0.m73366m(g, aVar2.mo47160q())) {
            editorInfo.inputType = 17;
        } else if (C16273a0.m73366m(g, aVar2.mo47154e())) {
            editorInfo.inputType = 33;
        } else if (C16273a0.m73366m(g, aVar2.mo47157k())) {
            editorInfo.inputType = 129;
        } else if (C16273a0.m73366m(g, aVar2.mo47156i())) {
            editorInfo.inputType = 18;
        } else if (C16273a0.m73366m(g, aVar2.mo47153c())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!qVar.mo47299h() && m73570g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (C16310p.m73495l(qVar.mo47297f(), aVar.mo47279a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m73570g(editorInfo.inputType, 1)) {
            int e = qVar.mo47295e();
            C16332z.C16333a aVar3 = C16332z.f40555b;
            if (C16332z.m73588h(e, aVar3.mo47338a())) {
                editorInfo.inputType |= 4096;
            } else if (C16332z.m73588h(e, aVar3.mo47341g())) {
                editorInfo.inputType |= 8192;
            } else if (C16332z.m73588h(e, aVar3.mo47340e())) {
                editorInfo.inputType |= 16384;
            }
            if (qVar.mo47294d()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = C16356n0.m73742n(textFieldValue.mo47113h());
        editorInfo.initialSelEnd = C16356n0.m73737i(textFieldValue.mo47113h());
        C18245g.m82846j(editorInfo, textFieldValue.mo47115i());
        editorInfo.imeOptions |= C9647e0.f26435a;
    }

    /* renamed from: i */
    public static final void m73572i(EditorInfo editorInfo) {
        if (C19019f.m88870q()) {
            C19019f.m88864c().mo55959G(editorInfo);
        }
    }
}
