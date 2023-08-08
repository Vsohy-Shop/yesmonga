package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.platform.C16365b;
import androidx.compose.p004ui.text.platform.C16366c;
import androidx.compose.p004ui.text.platform.C16368d;
import androidx.compose.p004ui.text.platform.C16387p;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.k */
public final class C16215k {
    @C12579k
    /* renamed from: a */
    public static final C16242u m73097a(@C12579k Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return C16246v.m73185a(m73099c(typeface));
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @C11587t0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @C12579k
    /* renamed from: b */
    public static final C16251x0 m73098b(@C12579k Context context, @C12579k C16242u uVar, @C12580l List<Pair<C16209i0, C16190e0>> list) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(uVar, "fontFamily");
        if (uVar instanceof C16176a0) {
            return new C16366c((C16176a0) uVar, context, list, (C16187d0) null, 8, (DefaultConstructorMarker) null);
        }
        if (uVar instanceof C16216k0) {
            return new C16368d((C16216k0) uVar);
        }
        if (uVar instanceof C16220l) {
            return new C16365b();
        }
        if (uVar instanceof C16221l0) {
            return ((C16221l0) uVar).mo46980H();
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: c */
    public static final C16251x0 m73099c(@C12579k Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new C16387p(typeface);
    }

    /* renamed from: d */
    public static /* synthetic */ C16251x0 m73100d(Context context, C16242u uVar, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return m73098b(context, uVar, list);
    }
}
