package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16185d;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.j */
public final class C16212j implements C16185d.C16186a {
    @C12579k

    /* renamed from: a */
    public static final C16212j f40305a = new C16212j();

    @C12580l
    /* renamed from: a */
    public Object mo46871a(@C12579k Context context, @C12579k C16185d dVar, @C12579k C11045c<?> cVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @C12580l
    /* renamed from: b */
    public Typeface mo46872b(@C12579k Context context, @C12579k C16185d dVar) {
        C16208i iVar;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(dVar, "font");
        if (dVar instanceof C16208i) {
            iVar = (C16208i) dVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return iVar.mo46933h(context);
        }
        return null;
    }
}
