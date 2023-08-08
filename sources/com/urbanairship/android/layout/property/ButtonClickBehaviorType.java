package com.urbanairship.android.layout.property;

import com.urbanairship.json.C9322a;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/urbanairship/android/layout/property/ButtonClickBehaviorType;", "", "", "toString", "value", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public enum ButtonClickBehaviorType {
    FORM_SUBMIT("form_submit"),
    PAGER_NEXT("pager_next"),
    PAGER_PREVIOUS("pager_previous"),
    DISMISS("dismiss"),
    CANCEL("cancel");
    
    @C12579k

    /* renamed from: a */
    public static final C35810a f88434a = null;
    /* access modifiers changed from: private */
    @C12579k
    public final String value;

    /* renamed from: com.urbanairship.android.layout.property.ButtonClickBehaviorType$a */
    public static final class C35810a {
        public /* synthetic */ C35810a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ButtonClickBehaviorType mo107244a(@C12579k String str) throws JsonException {
            Intrinsics.checkNotNullParameter(str, "value");
            for (ButtonClickBehaviorType buttonClickBehaviorType : ButtonClickBehaviorType.values()) {
                String q = buttonClickBehaviorType.value;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (Intrinsics.areEqual((Object) q, (Object) lowerCase)) {
                    return buttonClickBehaviorType;
                }
            }
            throw new JsonException("Unknown ButtonClickBehaviorType value: " + str);
        }

        @C12579k
        /* renamed from: b */
        public final List<ButtonClickBehaviorType> mo107245b(@C12579k C9322a aVar) throws JsonException {
            Intrinsics.checkNotNullParameter(aVar, "json");
            if (aVar.isEmpty()) {
                return CollectionsKt__CollectionsKt.m40441E();
            }
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(aVar, 10));
            Iterator it = aVar.iterator();
            while (it.hasNext()) {
                C35810a aVar2 = ButtonClickBehaviorType.f88434a;
                String B = ((JsonValue) it.next()).mo18750B();
                Intrinsics.checkNotNullExpressionValue(B, "it.optString()");
                arrayList.add(aVar2.mo107244a(B));
            }
            return CollectionsKt___CollectionsKt.m40659l5(arrayList);
        }

        public C35810a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f88434a = new C35810a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ButtonClickBehaviorType(String str) {
        this.value = str;
    }

    @C12579k
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
