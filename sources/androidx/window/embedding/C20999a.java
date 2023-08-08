package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.appcompat.widget.C0696c;
import androidx.preference.C19965r;
import androidx.window.core.C20994d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.a */
public final class C20999a {
    @C12579k

    /* renamed from: a */
    public final ComponentName f54170a;
    @C12580l

    /* renamed from: b */
    public final String f54171b;

    public C20999a(@C12579k ComponentName componentName, @C12580l String str) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.f54170a = componentName;
        this.f54171b = str;
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        boolean z4 = true;
        if (packageName.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (className.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!StringsKt__StringsKt.contains$default((CharSequence) packageName, (CharSequence) "*", false, 2, (Object) null) || StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null) == packageName.length() - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "*", false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    @C12579k
    /* renamed from: a */
    public final ComponentName mo62787a() {
        return this.f54170a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo62788b() {
        return this.f54171b;
    }

    /* renamed from: c */
    public final boolean mo62789c(@C12579k Activity activity) {
        String str;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        if (C21021r.f54206a.mo62848a(activity, this.f54170a)) {
            String str2 = this.f54171b;
            if (str2 != null) {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    str = null;
                } else {
                    str = intent.getAction();
                }
                if (Intrinsics.areEqual((Object) str2, (Object) str)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo62790d(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        if (!C21021r.f54206a.mo62849b(intent.getComponent(), this.f54170a)) {
            return false;
        }
        String str = this.f54171b;
        if (str == null || Intrinsics.areEqual((Object) str, (Object) intent.getAction())) {
            return true;
        }
        return false;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20999a)) {
            return false;
        }
        C20999a aVar = (C20999a) obj;
        if (Intrinsics.areEqual((Object) this.f54170a, (Object) aVar.f54170a) && Intrinsics.areEqual((Object) this.f54171b, (Object) aVar.f54171b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f54170a.hashCode() * 31;
        String str = this.f54171b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        return "ActivityFilter(componentName=" + this.f54170a + ", intentAction=" + this.f54171b + ')';
    }
}
