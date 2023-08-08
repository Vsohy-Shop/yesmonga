package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.C16261i;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.runtime.C8578k2;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.x */
public final class C16250x {
    @C12579k
    /* renamed from: a */
    public static final C16242u.C16244b m73191a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), C16197g.m72982a(context), (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (C16225n0) null, 28, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final C16242u.C16244b m73192b(@C12579k Context context, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), C16197g.m72982a(context), C16248w.m73190b(), new FontListFontFamilyTypefaceAdapter(C16248w.m73189a(), coroutineContext), (C16225n0) null, 16, (DefaultConstructorMarker) null);
    }

    @C16261i
    @C12579k
    /* renamed from: c */
    public static final C16242u.C16244b m73193c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), (C16229p0) null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), (CoroutineContext) null, 2, (DefaultConstructorMarker) null), (C16225n0) null, 18, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: d */
    public static final C8578k2<Typeface> m73194d(@C12579k C16242u.C16244b bVar, @C12580l C16242u uVar, @C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(bVar, "$this$resolveAsTypeface");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        C8578k2<Object> b = bVar.mo46784b(uVar, i0Var, i, i2);
        Intrinsics.checkNotNull(b, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return b;
    }

    /* renamed from: e */
    public static /* synthetic */ C8578k2 m73195e(C16242u.C16244b bVar, C16242u uVar, C16209i0 i0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uVar = null;
        }
        if ((i3 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i3 & 4) != 0) {
            i = C16190e0.f40252b.mo46883b();
        }
        if ((i3 & 8) != 0) {
            i2 = C16194f0.f40257b.mo46895a();
        }
        return m73194d(bVar, uVar, i0Var, i, i2);
    }
}
