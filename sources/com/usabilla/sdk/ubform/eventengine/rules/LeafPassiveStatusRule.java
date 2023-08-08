package com.usabilla.sdk.ubform.eventengine.rules;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import com.usabilla.sdk.ubform.eventengine.statuses.C9846a;
import com.usabilla.sdk.ubform.eventengine.statuses.PassiveStatus;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/rules/LeafPassiveStatusRule;", "Lcom/usabilla/sdk/ubform/eventengine/rules/BaseRule;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "a", "j0", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "rule", "I1", "Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus;", "status", "Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus;", "d", "()Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus;", "Lcom/usabilla/sdk/ubform/eventengine/statuses/a;", "matcher", "Lcom/usabilla/sdk/ubform/eventengine/statuses/a;", "c", "()Lcom/usabilla/sdk/ubform/eventengine/statuses/a;", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/statuses/PassiveStatus;Lcom/usabilla/sdk/ubform/eventengine/statuses/a;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class LeafPassiveStatusRule extends BaseRule {
    @C12579k
    private final C9846a matcher;
    @C12579k
    private final PassiveStatus status;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeafPassiveStatusRule(@C12579k PassiveStatus passiveStatus, @C12579k C9846a aVar) {
        super(RuleType.LEAF, new ArrayList(), false);
        Intrinsics.checkNotNullParameter(passiveStatus, "status");
        Intrinsics.checkNotNullParameter(aVar, "matcher");
        this.status = passiveStatus;
        this.matcher = aVar;
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (!(rule instanceof LeafPassiveStatusRule) || !super.mo20231I1(rule) || !Intrinsics.areEqual((Object) this.status, (Object) ((LeafPassiveStatusRule) rule).status)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo20233a(@C12579k C9827Event event, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        return this.matcher.mo20248a(this.status.mo20252b());
    }

    @C12579k
    /* renamed from: c */
    public final C9846a mo20243c() {
        return this.matcher;
    }

    @C12579k
    /* renamed from: d */
    public final PassiveStatus mo20244d() {
        return this.status;
    }

    /* renamed from: j0 */
    public boolean mo20235j0(@C12579k C9827Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }
}
