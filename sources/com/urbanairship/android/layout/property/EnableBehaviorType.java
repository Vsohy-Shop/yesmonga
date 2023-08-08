package com.urbanairship.android.layout.property;

import com.urbanairship.json.JsonException;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/urbanairship/android/layout/property/EnableBehaviorType;", "", "", "toString", "value", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public enum EnableBehaviorType {
    FORM_VALIDATION("form_validation"),
    PAGER_NEXT("pager_next"),
    PAGER_PREVIOUS("pager_previous"),
    FORM_SUBMISSION("form_submission");
    
    @C12579k

    /* renamed from: a */
    public static final C35814a f88453a = null;
    /* access modifiers changed from: private */
    @C12579k
    public final String value;

    /* renamed from: com.urbanairship.android.layout.property.EnableBehaviorType$a */
    public static final class C35814a {
        public /* synthetic */ C35814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final EnableBehaviorType mo107260a(@C12579k String str) throws JsonException {
            Intrinsics.checkNotNullParameter(str, "value");
            for (EnableBehaviorType enableBehaviorType : EnableBehaviorType.values()) {
                String q = enableBehaviorType.value;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (Intrinsics.areEqual((Object) q, (Object) lowerCase)) {
                    return enableBehaviorType;
                }
            }
            throw new JsonException("Unknown EnableBehaviorType value: " + str);
        }

        public C35814a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f88453a = new C35814a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    EnableBehaviorType(String str) {
        this.value = str;
    }

    @C12579k
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
