package androidx.compose.p004ui.text.android.selection;

import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.selection.a */
public final class C16112a {

    /* renamed from: b */
    public static final int f40066b = 8;
    @C12579k

    /* renamed from: a */
    public final C16113b f40067a;

    public C16112a(@C12579k Locale locale, @C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        this.f40067a = new C16113b(charSequence, 0, charSequence.length(), locale);
    }

    /* renamed from: a */
    public final int mo46528a(int i) {
        int i2;
        if (this.f40067a.mo46538i(this.f40067a.mo46543n(i))) {
            i2 = this.f40067a.mo46536g(i);
        } else {
            i2 = this.f40067a.mo46533d(i);
        }
        if (i2 == -1) {
            return i;
        }
        return i2;
    }

    /* renamed from: b */
    public final int mo46529b(int i) {
        int i2;
        if (this.f40067a.mo46540k(this.f40067a.mo46544o(i))) {
            i2 = this.f40067a.mo46535f(i);
        } else {
            i2 = this.f40067a.mo46534e(i);
        }
        if (i2 == -1) {
            return i;
        }
        return i2;
    }
}
