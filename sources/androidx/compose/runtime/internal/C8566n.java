package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8579l;
import androidx.compose.runtime.C8595o0;
import androidx.compose.runtime.C8700z0;
import java.util.HashMap;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,99:1\n361#2,7:100\n361#2,7:107\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:100,7\n92#1:107,7\n*E\n"})
/* renamed from: androidx.compose.runtime.internal.n */
public final class C8566n {
    @C12579k

    /* renamed from: a */
    public static final HashMap<String, C8700z0<Object>> f22996a = new HashMap<>();

    /* renamed from: b */
    public static boolean f22997b;

    @C8595o0
    /* renamed from: a */
    public static final void m31058a() {
        f22997b = true;
    }

    /* renamed from: b */
    public static final boolean m31059b() {
        return f22997b;
    }

    @C8595o0
    @C8579l
    /* renamed from: c */
    public static /* synthetic */ void m31060c() {
    }

    @C8595o0
    @C8579l
    @C12579k
    /* renamed from: d */
    public static final <T> C8578k2<T> m31061d(@C12579k String str, T t) {
        Intrinsics.checkNotNullParameter(str, "key");
        HashMap<String, C8700z0<Object>> hashMap = f22996a;
        C8700z0<Object> z0Var = hashMap.get(str);
        if (z0Var == null) {
            z0Var = C8539f2.m30981g(t, (C8410b2) null, 2, (Object) null);
            hashMap.put(str, z0Var);
        }
        Intrinsics.checkNotNull(z0Var, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return z0Var;
    }

    @C8595o0
    /* renamed from: e */
    public static final void m31062e(@C12579k String str, @C12580l Object obj) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "key");
        HashMap<String, C8700z0<Object>> hashMap = f22996a;
        C8700z0<Object> z0Var = hashMap.get(str);
        if (z0Var == null) {
            z0Var = C8539f2.m30981g(obj, (C8410b2) null, 2, (Object) null);
            hashMap.put(str, z0Var);
            z = false;
        } else {
            z = true;
        }
        C8700z0 z0Var2 = z0Var;
        if (z) {
            z0Var2.setValue(obj);
        }
    }
}
