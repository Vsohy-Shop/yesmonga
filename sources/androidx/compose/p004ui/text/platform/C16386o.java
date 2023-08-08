package androidx.compose.p004ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.C1879j;
import androidx.compose.p004ui.text.font.C16185d;
import androidx.compose.p004ui.text.font.C16208i;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16245u0;
import androidx.core.content.res.C17465i;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11395k;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Duplicate cache")
@C11363r0({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.o */
public final class C16386o {
    @C12579k

    /* renamed from: a */
    public static final C16386o f40639a = new C16386o();
    @C12579k

    /* renamed from: b */
    public static final C1879j<String, Typeface> f40640b = new C1879j<>(16);

    @C12580l
    /* renamed from: a */
    public final String mo47556a(@C12579k Context context, @C12579k C16238t tVar) {
        String str;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(tVar, "font");
        if (tVar instanceof C16245u0) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((C16245u0) tVar).mo47015h(), typedValue, true);
            StringBuilder sb = new StringBuilder();
            sb.append("res:");
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            Intrinsics.checkNotNull(str);
            sb.append(str);
            return sb.toString();
        } else if (tVar instanceof C16208i) {
            return ((C16208i) tVar).mo46813f();
        } else {
            throw new IllegalArgumentException("Unknown font type: " + tVar);
        }
    }

    @C12579k
    /* renamed from: b */
    public final Typeface mo47557b(@C12579k Context context, @C12579k C16238t tVar) {
        Typeface typeface;
        Typeface f;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(tVar, "font");
        String a = mo47556a(context, tVar);
        if (a == null || (f = f40640b.mo6246f(a)) == null) {
            if (tVar instanceof C16245u0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    typeface = C16380i.f40634a.mo47542a(context, ((C16245u0) tVar).mo47015h());
                } else {
                    typeface = C17465i.m80178j(context, ((C16245u0) tVar).mo47015h());
                    Intrinsics.checkNotNull(typeface);
                    Intrinsics.checkNotNullExpressionValue(typeface, "{\n                    Re…esId)!!\n                }");
                }
            } else if (tVar instanceof C16185d) {
                C16185d dVar = (C16185d) tVar;
                typeface = dVar.mo46869c().mo46872b(context, dVar);
            } else {
                throw new IllegalArgumentException("Unknown font type: " + tVar);
            }
            if (typeface != null) {
                if (a != null) {
                    Typeface j = f40640b.mo6250j(a, typeface);
                }
                return typeface;
            }
            throw new IllegalArgumentException("Unable to load font " + tVar);
        }
        Intrinsics.checkNotNullExpressionValue(f, "it");
        return f;
    }
}
