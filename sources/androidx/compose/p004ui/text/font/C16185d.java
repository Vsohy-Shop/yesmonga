package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.d */
public abstract class C16185d implements C16238t {

    /* renamed from: f */
    public static final int f40248f = 0;

    /* renamed from: c */
    public final int f40249c;
    @C12579k

    /* renamed from: d */
    public final C16186a f40250d;
    @C12579k

    /* renamed from: e */
    public final C16201h0.C16206e f40251e;

    /* renamed from: androidx.compose.ui.text.font.d$a */
    public interface C16186a {
        @C12580l
        /* renamed from: a */
        Object mo46871a(@C12579k Context context, @C12579k C16185d dVar, @C12579k C11045c<? super Typeface> cVar);

        @C12580l
        /* renamed from: b */
        Typeface mo46872b(@C12579k Context context, @C12579k C16185d dVar);
    }

    public /* synthetic */ C16185d(int i, C16186a aVar, C16201h0.C16206e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, aVar, eVar);
    }

    /* renamed from: a */
    public final int mo46868a() {
        return this.f40249c;
    }

    @C12579k
    /* renamed from: c */
    public final C16186a mo46869c() {
        return this.f40250d;
    }

    @C12579k
    /* renamed from: d */
    public final C16201h0.C16206e mo46870d() {
        return this.f40251e;
    }

    @C11395k(message = "Replaced with fontVariation constructor", replaceWith = @C11587t0(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ C16185d(int i, C16186a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, aVar);
    }

    public C16185d(int i, C16186a aVar, C16201h0.C16206e eVar) {
        this.f40249c = i;
        this.f40250d = aVar;
        this.f40251e = eVar;
    }

    public C16185d(int i, C16186a aVar) {
        this(i, aVar, new C16201h0.C16206e(new C16201h0.C16202a[0]), (DefaultConstructorMarker) null);
    }
}
