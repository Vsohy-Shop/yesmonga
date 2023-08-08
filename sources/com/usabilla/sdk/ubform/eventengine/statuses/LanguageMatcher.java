package com.usabilla.sdk.ubform.eventengine.statuses;

import java.io.Serializable;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/statuses/LanguageMatcher;", "Lcom/usabilla/sdk/ubform/eventengine/statuses/a;", "Ljava/io/Serializable;", "", "value", "", "a", "", "other", "equals", "", "hashCode", "<init>", "()V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class LanguageMatcher implements C9846a, Serializable {
    @C12579k

    /* renamed from: a */
    public static final C9844a f26922a = new C9844a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: b */
    public static final int f26923b = 5;
    @Deprecated

    /* renamed from: c */
    public static final int f26924c = 2;
    @Deprecated
    private static final long serialVersionUID = 1;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.statuses.LanguageMatcher$a */
    public static final class C9844a {
        public /* synthetic */ C9844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9844a() {
        }
    }

    /* renamed from: a */
    public boolean mo20248a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        int length = str.length();
        if (length == 2) {
            return Intrinsics.areEqual((Object) str, (Object) Locale.getDefault().getLanguage());
        }
        if (length != 5) {
            return false;
        }
        return Intrinsics.areEqual((Object) StringsKt__StringsKt.substringBefore$default(str, '_', (String) null, 2, (Object) null), (Object) Locale.getDefault().getLanguage());
    }

    public boolean equals(@C12580l Object obj) {
        return true;
    }

    public int hashCode() {
        return LanguageMatcher.class.hashCode();
    }
}
