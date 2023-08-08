package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.C8585m0;
import kotlin.C11395k;
import kotlin.C11587t0;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.ui.text.font.t */
public interface C16238t {
    @C12579k

    /* renamed from: a */
    public static final C16239a f40336a = C16239a.f40338a;

    /* renamed from: b */
    public static final long f40337b = 15000;

    /* renamed from: androidx.compose.ui.text.font.t$a */
    public static final class C16239a {

        /* renamed from: a */
        public static final /* synthetic */ C16239a f40338a = new C16239a();

        /* renamed from: b */
        public static final long f40339b = 15000;
    }

    @C11395k(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    /* renamed from: androidx.compose.ui.text.font.t$b */
    public interface C16240b {
        @C11395k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @C11587t0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @C12579k
        /* renamed from: a */
        Object mo45979a(@C12579k C16238t tVar);
    }

    /* renamed from: a */
    int mo46868a() {
        return C16182c0.f40243b.mo46866b();
    }

    /* renamed from: b */
    int mo46930b();

    @C12579k
    C16209i0 getWeight();
}
