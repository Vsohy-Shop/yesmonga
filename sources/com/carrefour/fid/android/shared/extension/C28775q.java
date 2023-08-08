package com.carrefour.fid.android.shared.extension;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.C0324b1;
import androidx.appcompat.app.C0475e;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.content.C17318d;
import com.google.android.material.internal.C31391c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.extension.q */
public final class C28775q {
    /* renamed from: a */
    public static final void m119093a(@C12579k Context context, @C12579k String str, @C0324b1 int i) {
        ClipboardManager clipboardManager;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "value");
        Object systemService = context.getSystemService("clipboard");
        if (systemService instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) systemService;
        } else {
            clipboardManager = null;
        }
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("value", str));
        }
        m119100h(context, i, 0, false, 6, (Object) null);
    }

    @SuppressLint({"RestrictedApi"})
    @C12579k
    /* renamed from: b */
    public static final C0475e m119094b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Activity a = C31391c.m126854a(context);
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (C0475e) a;
    }

    @C12579k
    /* renamed from: c */
    public static final Executor m119095c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Executor l = C17318d.m79729l(context);
        Intrinsics.checkNotNullExpressionValue(l, "getMainExecutor(this)");
        return l;
    }

    @C12579k
    /* renamed from: d */
    public static final String m119096d(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "stringName");
        int identifier = context.getResources().getIdentifier(str, C16717v.C16719b.f42182e, context.getPackageName());
        if (identifier == 0) {
            return new String();
        }
        String string = context.getString(identifier);
        Intrinsics.checkNotNullExpressionValue(string, "{\n        getString(resId)\n    }");
        return string;
    }

    @C12580l
    /* renamed from: e */
    public static final InputMethodManager m119097e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        throw r2;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m119098f(@org.jetbrains.annotations.C12579k android.content.Context r1, @org.jetbrains.annotations.C12579k java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r1 = r1.open(r2)
            java.lang.String r2 = "assets.open(fileName)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.nio.charset.Charset r2 = kotlin.text.C11602d.f28868b
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            boolean r1 = r0 instanceof java.io.BufferedReader
            if (r1 == 0) goto L_0x0025
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x002d
        L_0x0025:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r0, r2)
            r0 = r1
        L_0x002d:
            java.lang.String r1 = kotlin.p010io.TextStreamsKt.m42916k(r0)     // Catch:{ all -> 0x0036 }
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r0, r2)
            return r1
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.C28775q.m119098f(android.content.Context, java.lang.String):java.lang.String");
    }

    @C12579k
    /* renamed from: g */
    public static final Toast m119099g(@C12579k Context context, @C0324b1 int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast makeText = Toast.makeText(context, i, i2);
        if (z) {
            makeText.show();
        }
        Intrinsics.checkNotNullExpressionValue(makeText, "makeText(this, message, …   if (show) show()\n    }");
        return makeText;
    }

    /* renamed from: h */
    public static /* synthetic */ Toast m119100h(Context context, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return m119099g(context, i, i2, z);
    }
}
