package com.usabilla.sdk.ubform.eventengine.decorators;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import com.usabilla.sdk.ubform.eventengine.rules.RuleType;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\tB!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/decorators/RepetitionDecorator;", "Lcom/usabilla/sdk/ubform/eventengine/decorators/BaseDecorator;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "a", "j0", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "rule", "I1", "", "Lkotlin/Pair;", "", "h0", "", "requiredOccurrences", "I", "currentCount", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "ruleType", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "N1", "()Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;II)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "d", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class RepetitionDecorator extends BaseDecorator implements Serializable {
    @C12579k

    /* renamed from: d */
    public static final C9838a f26904d = new C9838a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f26905e = "repetition";
    @C12579k

    /* renamed from: f */
    public static final String f26906f = "occurred";
    private static final long serialVersionUID = 1;
    private int currentCount;
    private final int requiredOccurrences;
    @C12579k
    private final RuleType ruleType;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.decorators.RepetitionDecorator$a */
    public static final class C9838a {
        public /* synthetic */ C9838a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9838a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepetitionDecorator(Rule rule, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(rule, i, (i3 & 4) != 0 ? 0 : i2);
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (!(rule instanceof RepetitionDecorator) || !super.mo20231I1(rule)) {
            return false;
        }
        RepetitionDecorator repetitionDecorator = (RepetitionDecorator) rule;
        if (mo20230c().mo20231I1(repetitionDecorator.mo20230c()) && this.requiredOccurrences == repetitionDecorator.requiredOccurrences && this.currentCount == repetitionDecorator.currentCount) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: N1 */
    public RuleType mo20232N1() {
        return this.ruleType;
    }

    /* renamed from: a */
    public boolean mo20233a(@C12579k C9827Event event, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        if (!mo20230c().mo20236E1(event, map)) {
            return false;
        }
        mo20230c().reset();
        if (this.currentCount >= this.requiredOccurrences) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: h0 */
    public List<Pair<String, Object>> mo20234h0() {
        return CollectionsKt__CollectionsKt.m40448L(C11078d1.m42659a(f26905e, Integer.valueOf(this.requiredOccurrences)), C11078d1.m42659a(f26906f, Integer.valueOf(this.currentCount)));
    }

    /* renamed from: j0 */
    public boolean mo20235j0(@C12579k C9827Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean j0 = super.mo20235j0(event);
        if (j0) {
            this.currentCount++;
        }
        return j0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepetitionDecorator(@C12579k Rule rule, int i, int i2) {
        super(rule, false, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.requiredOccurrences = i;
        this.currentCount = i2;
        this.ruleType = RuleType.REPETITION;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RepetitionDecorator(@org.jetbrains.annotations.C12579k org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.usabilla.sdk.ubform.eventengine.c r0 = com.usabilla.sdk.ubform.eventengine.C9834c.f26896a
            java.lang.String r1 = "children"
            org.json.JSONArray r1 = r5.getJSONArray(r1)
            r2 = 0
            org.json.JSONObject r1 = r1.getJSONObject(r2)
            java.lang.String r3 = "json.getJSONArray(CHILDREN).getJSONObject(0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            com.usabilla.sdk.ubform.eventengine.rules.Rule r0 = r0.mo20225b(r1)
            java.lang.String r1 = "repetition"
            int r1 = r5.getInt(r1)
            java.lang.String r3 = "occurred"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.eventengine.decorators.RepetitionDecorator.<init>(org.json.JSONObject):void");
    }
}
