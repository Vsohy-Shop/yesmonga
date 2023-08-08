package com.usabilla.sdk.ubform.eventengine.rules;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import com.usabilla.sdk.ubform.eventengine.statuses.ActiveStatus;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/rules/LeafActiveStatusRule;", "Lcom/usabilla/sdk/ubform/eventengine/rules/BaseRule;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "a", "j0", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "rule", "I1", "Lcom/usabilla/sdk/ubform/eventengine/statuses/ActiveStatus;", "status", "Lcom/usabilla/sdk/ubform/eventengine/statuses/ActiveStatus;", "c", "()Lcom/usabilla/sdk/ubform/eventengine/statuses/ActiveStatus;", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/statuses/ActiveStatus;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class LeafActiveStatusRule extends BaseRule {
    @C12579k
    private final ActiveStatus status;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeafActiveStatusRule(@C12579k ActiveStatus activeStatus) {
        super(RuleType.LEAF, new ArrayList(), false);
        Intrinsics.checkNotNullParameter(activeStatus, "status");
        this.status = activeStatus;
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (!(rule instanceof LeafActiveStatusRule)) {
            return false;
        }
        LeafActiveStatusRule leafActiveStatusRule = (LeafActiveStatusRule) rule;
        if (!Intrinsics.areEqual((Object) this.status.mo20246a(), (Object) leafActiveStatusRule.status.mo20246a()) || !Intrinsics.areEqual((Object) this.status.mo20247b(), (Object) leafActiveStatusRule.status.mo20247b())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo20233a(@C12579k C9827Event event, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        if (Intrinsics.areEqual((Object) map.get(this.status.mo20246a()), (Object) this.status.mo20247b())) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: c */
    public final ActiveStatus mo20242c() {
        return this.status;
    }

    /* renamed from: j0 */
    public boolean mo20235j0(@C12579k C9827Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }
}
