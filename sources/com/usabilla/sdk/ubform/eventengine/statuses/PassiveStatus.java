package com.usabilla.sdk.ubform.eventengine.statuses;

import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\u0014B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus$StatusType;", "type", "Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus$StatusType;", "a", "()Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus$StatusType;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus$StatusType;Ljava/lang/String;)V", "StatusType", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class PassiveStatus implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C9845a f26925a = new C9845a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;
    @C12579k
    private final StatusType type;
    @C12579k
    private final String value;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus$StatusType;", "", "", "type", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public enum StatusType {
        LANGUAGE("language");
        
        @C12579k
        private final String type;

        /* access modifiers changed from: public */
        StatusType(String str) {
            this.type = str;
        }

        @C12579k
        /* renamed from: q */
        public final String mo20255q() {
            return this.type;
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.eventengine.statuses.PassiveStatus$a */
    public static final class C9845a {
        public /* synthetic */ C9845a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9845a() {
        }
    }

    public PassiveStatus(@C12579k StatusType statusType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(statusType, "type");
        Intrinsics.checkNotNullParameter(str, "value");
        this.type = statusType;
        this.value = str;
    }

    @C12579k
    /* renamed from: a */
    public final StatusType mo20251a() {
        return this.type;
    }

    @C12579k
    /* renamed from: b */
    public final String mo20252b() {
        return this.value;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof PassiveStatus)) {
            return false;
        }
        PassiveStatus passiveStatus = (PassiveStatus) obj;
        if (this.type != passiveStatus.type || !Intrinsics.areEqual((Object) this.value, (Object) passiveStatus.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.value.hashCode();
    }
}
