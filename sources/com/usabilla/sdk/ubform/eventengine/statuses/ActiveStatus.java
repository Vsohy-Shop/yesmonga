package com.usabilla.sdk.ubform.eventengine.statuses;

import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/statuses/ActiveStatus;", "Ljava/io/Serializable;", "", "name", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "value", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class ActiveStatus implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C9843a f26921a = new C9843a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;
    @C12579k
    private final String name;
    @C12579k
    private final String value;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.statuses.ActiveStatus$a */
    public static final class C9843a {
        public /* synthetic */ C9843a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9843a() {
        }
    }

    public ActiveStatus(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.name = str;
        this.value = str2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo20246a() {
        return this.name;
    }

    @C12579k
    /* renamed from: b */
    public final String mo20247b() {
        return this.value;
    }
}
