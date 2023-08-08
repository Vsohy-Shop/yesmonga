package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8761g;
import androidx.compose.runtime.C8547h2;
import kotlin.C11395k;
import kotlin.C11587t0;

@C8547h2
@C8761g
/* renamed from: androidx.compose.ui.platform.w3 */
public interface C15991w3 {
    /* renamed from: a */
    void mo45848a();

    /* renamed from: c */
    void mo45850c();

    @C11395k(message = "Use hide instead.", replaceWith = @C11587t0(expression = "hide()", imports = {}))
    /* renamed from: d */
    void mo45976d() {
        mo45850c();
    }

    @C11395k(message = "Use show instead.", replaceWith = @C11587t0(expression = "show()", imports = {}))
    /* renamed from: e */
    void mo45977e() {
        mo45848a();
    }
}
