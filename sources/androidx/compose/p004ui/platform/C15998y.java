package androidx.compose.p004ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16245u0;
import androidx.core.content.res.C17465i;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @C11587t0(expression = "PlatformFontLoader", imports = {}))
/* renamed from: androidx.compose.ui.platform.y */
public final class C15998y implements C16238t.C16240b {
    @C12579k

    /* renamed from: a */
    public final Context f39688a;

    public C15998y(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f39688a = context;
    }

    @C11395k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @C11587t0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @C12579k
    /* renamed from: b */
    public Typeface mo45979a(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "font");
        if (!(tVar instanceof C16245u0)) {
            throw new IllegalArgumentException("Unknown font type: " + tVar);
        } else if (Build.VERSION.SDK_INT >= 26) {
            return C15842a0.f39476a.mo45637a(this.f39688a, ((C16245u0) tVar).mo47015h());
        } else {
            Typeface j = C17465i.m80178j(this.f39688a, ((C16245u0) tVar).mo47015h());
            Intrinsics.checkNotNull(j);
            Intrinsics.checkNotNullExpressionValue(j, "{\n                    Re…esId)!!\n                }");
            return j;
        }
    }
}
