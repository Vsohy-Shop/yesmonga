package com.usabilla.sdk.ubform.eventengine.rules;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\tB)\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0014"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/rules/AndRule;", "Lcom/usabilla/sdk/ubform/eventengine/rules/BaseRule;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "a", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "rule", "I1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mChildRules", "mAlreadyTriggered", "<init>", "(Ljava/util/ArrayList;Z)V", "c", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class AndRule extends BaseRule implements Serializable {
    @C12579k

    /* renamed from: c */
    public static final C9839a f26907c = new C9839a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.rules.AndRule$a */
    public static final class C9839a {
        public /* synthetic */ C9839a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9839a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndRule(ArrayList arrayList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? false : z);
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (rule instanceof AndRule) {
            return super.mo20231I1(rule);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo20233a(@C12579k C9827Event event, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        for (Rule rule : mo20239i0()) {
            if (!rule.mo20236E1(event, map) && !rule.mo20228Q1()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndRule(@C12579k ArrayList<Rule> arrayList, boolean z) {
        super(RuleType.f26915d, arrayList, z);
        Intrinsics.checkNotNullParameter(arrayList, "mChildRules");
    }
}
