package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.appcompat.widget.C0696c;
import androidx.window.core.C20994d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C20994d
/* renamed from: androidx.window.embedding.r */
public final class C21021r {
    @C12579k

    /* renamed from: a */
    public static final C21021r f54206a = new C21021r();

    /* renamed from: b */
    public static final boolean f54207b = false;
    @C12579k

    /* renamed from: c */
    public static final String f54208c = "SplitRuleResolution";

    /* renamed from: a */
    public final boolean mo62848a(@C12579k Activity activity, @C12579k ComponentName componentName) {
        ComponentName component;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(componentName, "ruleComponent");
        if (mo62849b(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f54206a.mo62849b(component, componentName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo62849b(@org.jetbrains.annotations.C12580l android.content.ComponentName r7, @org.jetbrains.annotations.C12579k android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L_0x0022
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0020
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            return r1
        L_0x0022:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r3, (java.lang.CharSequence) r0, (boolean) r2, (int) r4, (java.lang.Object) r5)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r0 = r6.mo62850c(r0, r3)
            if (r0 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r0 = r2
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 != 0) goto L_0x0087
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            boolean r7 = r6.mo62850c(r7, r8)
            if (r7 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r7 = r2
            goto L_0x0088
        L_0x0087:
            r7 = r1
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            if (r7 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            return r1
        L_0x008f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.C21021r.mo62849b(android.content.ComponentName, android.content.ComponentName):boolean");
    }

    /* renamed from: c */
    public final boolean mo62850c(String str, String str2) {
        boolean z;
        if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "*", false, 2, (Object) null)) {
            return false;
        }
        if (Intrinsics.areEqual((Object) str2, (Object) "*")) {
            return true;
        }
        String str3 = str2;
        if (StringsKt__StringsKt.indexOf$default((CharSequence) str3, "*", 0, false, 6, (Object) null) != StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, "*", 0, false, 6, (Object) null) || !C11622t.endsWith$default(str2, "*", false, 2, (Object) null)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String substring = str2.substring(0, str2.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return C11622t.startsWith$default(str, substring, false, 2, (Object) null);
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
    }
}
