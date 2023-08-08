package com.usabilla.sdk.ubform.eventengine;

import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/Event;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "a", "name", "b", "toString", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.eventengine.Event */
public final class C9827Event implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C9828a f26881a = new C9828a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;
    @C12579k
    private final String name;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.Event$a */
    public static final class C9828a {
        public /* synthetic */ C9828a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9828a() {
        }
    }

    public C9827Event(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.name = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C9827Event m36779c(C9827Event event, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = event.name;
        }
        return event.mo20167b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo20166a() {
        return this.name;
    }

    @C12579k
    /* renamed from: b */
    public final C9827Event mo20167b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C9827Event(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo20168d() {
        return this.name;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C9827Event) {
            return Intrinsics.areEqual((Object) ((C9827Event) obj).name, (Object) this.name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @C12579k
    public String toString() {
        return "Event(name=" + this.name + ')';
    }
}
