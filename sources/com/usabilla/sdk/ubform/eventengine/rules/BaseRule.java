package com.usabilla.sdk.ubform.eventengine.rules;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B'\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b'\u0010(J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J&\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/rules/BaseRule;", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "E1", "j0", "Lkotlin/d2;", "reset", "", "other", "equals", "", "hashCode", "a", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "ruleType", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "N1", "()Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "Ljava/util/ArrayList;", "childRules", "Ljava/util/ArrayList;", "i0", "()Ljava/util/ArrayList;", "isTriggered", "Z", "Q1", "()Z", "a2", "(Z)V", "ruleID", "Ljava/lang/String;", "l1", "()Ljava/lang/String;", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;Ljava/util/ArrayList;Z)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class BaseRule implements Rule, Serializable {
    @C12579k

    /* renamed from: a */
    public static final C9840a f26908a = new C9840a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public static final String f26909b = "children";
    private static final long serialVersionUID = 1;
    @C12579k
    private final ArrayList<Rule> childRules;
    private boolean isTriggered;
    @C12579k
    private final String ruleID;
    @C12579k
    private final RuleType ruleType;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.rules.BaseRule$a */
    public static final class C9840a {
        public /* synthetic */ C9840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9840a() {
        }
    }

    public BaseRule(@C12579k RuleType ruleType2, @C12579k ArrayList<Rule> arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(ruleType2, "ruleType");
        Intrinsics.checkNotNullParameter(arrayList, "childRules");
        this.ruleType = ruleType2;
        this.childRules = arrayList;
        this.isTriggered = z;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.ruleID = uuid;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m36842b(BaseRule baseRule, C9827Event event, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                map = new HashMap();
            }
            return baseRule.mo20233a(event, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: customTriggersWith");
    }

    /* renamed from: E1 */
    public boolean mo20236E1(@C12579k C9827Event event, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        if (!mo20228Q1()) {
            mo20229a2(mo20233a(event, map));
        }
        return mo20228Q1();
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        return Rule.C9842a.m36877c(this, rule);
    }

    @C12579k
    /* renamed from: N1 */
    public RuleType mo20232N1() {
        return this.ruleType;
    }

    /* renamed from: Q1 */
    public boolean mo20228Q1() {
        return this.isTriggered;
    }

    /* renamed from: a */
    public abstract boolean mo20233a(@C12579k C9827Event event, @C12579k Map<String, String> map);

    /* renamed from: a2 */
    public void mo20229a2(boolean z) {
        this.isTriggered = z;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof Rule)) {
            return false;
        }
        return mo20231I1((Rule) obj);
    }

    @C12579k
    /* renamed from: h0 */
    public List<Pair<String, Object>> mo20234h0() {
        return Rule.C9842a.m36876b(this);
    }

    public int hashCode() {
        return (((((mo20232N1().hashCode() * 31) + mo20239i0().hashCode()) * 31) + Boolean.hashCode(mo20228Q1())) * 31) + mo20240l1().hashCode();
    }

    @C12579k
    /* renamed from: i0 */
    public ArrayList<Rule> mo20239i0() {
        return this.childRules;
    }

    /* renamed from: j0 */
    public boolean mo20235j0(@C12579k C9827Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        for (Rule j0 : mo20239i0()) {
            if (j0.mo20235j0(event)) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: l1 */
    public String mo20240l1() {
        return this.ruleID;
    }

    public void reset() {
        mo20229a2(false);
        for (Rule reset : mo20239i0()) {
            reset.reset();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseRule(RuleType ruleType2, ArrayList arrayList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ruleType2, arrayList, (i & 4) != 0 ? false : z);
    }
}
