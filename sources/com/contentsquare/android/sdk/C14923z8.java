package com.contentsquare.android.sdk;

import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/z8;", "", "", "toString", "", "fps", "I", "q", "()I", "", "densityScaleDown", "F", "g", "()F", "<init>", "(Ljava/lang/String;IIF)V", "a", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
/* renamed from: com.contentsquare.android.sdk.z8 */
public enum C14923z8 {
    LOW(5, 2.0f),
    MEDIUM(10, 1.5f),
    HIGH(10, 1.0f);
    

    /* renamed from: g */
    public static final String f36995g = null;

    /* renamed from: v */
    public static final C14924a f36996v = null;

    /* renamed from: a */
    public final int f36997a;

    /* renamed from: b */
    public final float f36998b;

    /* renamed from: com.contentsquare.android.sdk.z8$a */
    public static final class C14924a {
        public C14924a() {
        }

        @C11384m
        /* renamed from: a */
        public final C14923z8 mo36949a(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return C14923z8.valueOf(upperCase);
        }

        public /* synthetic */ C14924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        C14923z8 z8Var;
        f36996v = new C14924a((DefaultConstructorMarker) null);
        String name = z8Var.name();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        f36995g = lowerCase;
    }

    /* access modifiers changed from: public */
    C14923z8(int i, float f) {
        this.f36997a = i;
        this.f36998b = f;
    }

    @C11384m
    /* renamed from: b */
    public static final C14923z8 m64202b(String str) {
        return f36996v.mo36949a(str);
    }

    /* renamed from: g */
    public final float mo36946g() {
        return this.f36998b;
    }

    /* renamed from: q */
    public final int mo36947q() {
        return this.f36997a;
    }

    public String toString() {
        String name = name();
        int i = this.f36997a;
        float f = this.f36998b;
        int ordinal = ordinal();
        return name + " (FPS=" + i + " ImageQuality=" + f + "(" + ordinal + "))";
    }
}
