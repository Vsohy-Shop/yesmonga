package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.C16163e0;
import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.p004ui.unit.C16475a;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(26)
/* renamed from: androidx.compose.ui.text.font.TypefaceCompatApi26 */
public final class TypefaceCompatApi26 {
    @C12579k

    /* renamed from: a */
    public static final TypefaceCompatApi26 f40229a = new TypefaceCompatApi26();
    @C12579k

    /* renamed from: b */
    public static ThreadLocal<Paint> f40230b = new ThreadLocal<>();

    @C16259h
    @C12580l
    /* renamed from: a */
    public final Typeface mo46802a(@C12580l Typeface typeface, @C12579k C16201h0.C16206e eVar, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (typeface == null) {
            return null;
        }
        if (eVar.mo46927b().isEmpty()) {
            return typeface;
        }
        Paint paint = f40230b.get();
        if (paint == null) {
            paint = new Paint();
            f40230b.set(paint);
        }
        paint.setTypeface(typeface);
        boolean unused = paint.setFontVariationSettings(mo46803b(eVar, context));
        return paint.getTypeface();
    }

    @C16259h
    /* renamed from: b */
    public final String mo46803b(C16201h0.C16206e eVar, Context context) {
        return C16163e0.m72807l(eVar.mo46927b(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new TypefaceCompatApi26$toAndroidString$1(C16475a.m74346a(context)), 31, (Object) null);
    }
}
