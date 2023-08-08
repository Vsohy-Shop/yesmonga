package com.urbanairship.automation;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.d0 */
public class C8828d0 implements C9333e {

    /* renamed from: c */
    public static final String f23662c = "trigger";

    /* renamed from: d */
    public static final String f23663d = "event";

    /* renamed from: a */
    public Trigger f23664a;

    /* renamed from: b */
    public JsonValue f23665b;

    public C8828d0(@C0359n0 Trigger trigger, @C0359n0 JsonValue jsonValue) {
        this.f23664a = trigger;
        this.f23665b = jsonValue;
    }

    @C0359n0
    /* renamed from: a */
    public static C8828d0 m32844a(@C0359n0 JsonValue jsonValue) throws JsonException {
        return new C8828d0(Trigger.m32681c(jsonValue.mo18749A().mo18801A("trigger")), jsonValue.mo18749A().mo18801A("event"));
    }

    @C0359n0
    /* renamed from: b */
    public JsonValue mo17387b() {
        return this.f23665b;
    }

    @C0359n0
    /* renamed from: c */
    public Trigger mo17388c() {
        return this.f23664a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8828d0 d0Var = (C8828d0) obj;
        if (!this.f23664a.equals(d0Var.f23664a)) {
            return false;
        }
        return this.f23665b.equals(d0Var.f23665b);
    }

    public int hashCode() {
        return (this.f23664a.hashCode() * 31) + this.f23665b.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18822f("trigger", this.f23664a).mo18822f("event", this.f23665b).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return "TriggerContext{trigger=" + this.f23664a + ", event=" + this.f23665b + C12361b.f30259j;
    }
}
