package androidx.compose.p004ui.text.input;

import androidx.camera.view.C1814q;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.crashlytics.internal.settings.C32937f;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.t0 */
public class C16321t0 {

    /* renamed from: c */
    public static final int f40545c = 8;
    @C12579k

    /* renamed from: a */
    public final C16303l0 f40546a;
    @C12579k

    /* renamed from: b */
    public final AtomicReference<C16331y0> f40547b = new AtomicReference<>((Object) null);

    public C16321t0(@C12579k C16303l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "platformTextInputService");
        this.f40546a = l0Var;
    }

    @C12580l
    /* renamed from: a */
    public final C16331y0 mo47317a() {
        return this.f40547b.get();
    }

    @C11395k(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @C11587t0(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    /* renamed from: b */
    public final void mo47318b() {
        this.f40546a.mo47123d();
    }

    @C11395k(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @C11587t0(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    /* renamed from: c */
    public final void mo47319c() {
        if (this.f40547b.get() != null) {
            this.f40546a.mo47124e();
        }
    }

    @C12579k
    /* renamed from: d */
    public C16331y0 mo47320d(@C12579k TextFieldValue textFieldValue, @C12579k C16313q qVar, @C12579k C11300l<? super List<? extends C16293h>, C11079d2> lVar, @C12579k C11300l<? super C16310p, C11079d2> lVar2) {
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        Intrinsics.checkNotNullParameter(qVar, "imeOptions");
        Intrinsics.checkNotNullParameter(lVar, "onEditCommand");
        Intrinsics.checkNotNullParameter(lVar2, "onImeActionPerformed");
        this.f40546a.mo47122c(textFieldValue, qVar, lVar, lVar2);
        C16331y0 y0Var = new C16331y0(this, this.f40546a);
        this.f40547b.set(y0Var);
        return y0Var;
    }

    /* renamed from: e */
    public void mo47321e(@C12579k C16331y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, C32937f.f80028b);
        if (C1814q.m7242a(this.f40547b, y0Var, (Object) null)) {
            this.f40546a.mo47120a();
        }
    }
}
