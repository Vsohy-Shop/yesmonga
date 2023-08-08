package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.content.v0 */
public final class C17497v0 {
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public static final void m80267a(@C12579k SharedPreferences sharedPreferences, boolean z, @C12579k C11300l<? super SharedPreferences.Editor, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m80268b(SharedPreferences sharedPreferences, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
