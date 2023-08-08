package androidx.compose.p004ui.text.font;

import android.content.Context;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.o */
public final class C16226o {
    @C11395k(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @C11587t0(expression = "createFontFamilyResolver()", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final C16242u.C16244b m73118a(@C12579k C16238t.C16240b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "fontResourceLoader");
        return new FontFamilyResolverImpl(new C16224n(bVar), (C16229p0) null, (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (C16225n0) null, 30, (DefaultConstructorMarker) null);
    }

    @C11395k(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @C11587t0(expression = "createFontFamilyResolver()", imports = {}))
    @C12579k
    /* renamed from: b */
    public static final C16242u.C16244b m73119b(@C12579k C16238t.C16240b bVar, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(bVar, "fontResourceLoader");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return new FontFamilyResolverImpl(new C16222m(bVar, applicationContext), (C16229p0) null, (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (C16225n0) null, 30, (DefaultConstructorMarker) null);
    }
}
