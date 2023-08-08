package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16185d;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.m0 */
public final class C16223m0 implements C16185d.C16186a {
    @C12579k

    /* renamed from: a */
    public static final C16223m0 f40324a = new C16223m0();

    @C12580l
    /* renamed from: a */
    public Object mo46871a(@C12579k Context context, @C12579k C16185d dVar, @C12579k C11045c<? super Typeface> cVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @C12580l
    /* renamed from: b */
    public Typeface mo46872b(@C12579k Context context, @C12579k C16185d dVar) {
        C16232q qVar;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(dVar, "font");
        if (dVar instanceof C16232q) {
            qVar = (C16232q) dVar;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            return qVar.mo46995e(context);
        }
        return null;
    }
}
