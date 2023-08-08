package com.usabilla.sdk.ubform.eventengine.decorators;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import com.usabilla.sdk.ubform.eventengine.rules.RuleType;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001\tB\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\"J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006$"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/decorators/PercentageDecorator;", "Lcom/usabilla/sdk/ubform/eventengine/decorators/BaseDecorator;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "a", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "rule", "I1", "", "Lkotlin/Pair;", "", "h0", "", "percentage", "I", "Ljava/util/Random;", "randomiser", "Ljava/util/Random;", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "ruleType", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "N1", "()Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "diceAlreadyRolled", "Z", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;ILjava/util/Random;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;Ljava/util/Random;)V", "d", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class PercentageDecorator extends BaseDecorator implements Serializable {
    @C12579k

    /* renamed from: d */
    public static final C9837a f26901d = new C9837a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f26902e = "percentage";

    /* renamed from: f */
    public static final int f26903f = 100;
    private static final long serialVersionUID = 1;
    private boolean diceAlreadyRolled;
    private final int percentage;
    @C12579k
    private final Random randomiser;
    @C12579k
    private final RuleType ruleType;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.decorators.PercentageDecorator$a */
    public static final class C9837a {
        public /* synthetic */ C9837a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9837a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PercentageDecorator(@C12579k Rule rule, int i, @C12579k Random random) {
        super(rule, false, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(random, "randomiser");
        this.percentage = i;
        this.randomiser = random;
        this.ruleType = RuleType.PERCENTAGE;
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (!(rule instanceof PercentageDecorator) || !super.mo20231I1(rule) || this.percentage != ((PercentageDecorator) rule).percentage) {
            return false;
        }
        return true;
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
        if (!mo20230c().mo20236E1(event, map) || this.diceAlreadyRolled) {
            return false;
        }
        this.diceAlreadyRolled = true;
        if (this.randomiser.nextInt(100) < this.percentage) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: h0 */
    public List<Pair<String, Object>> mo20234h0() {
        return C10976s.m41419k(C11078d1.m42659a(f26902e, Integer.valueOf(this.percentage)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PercentageDecorator(@org.jetbrains.annotations.C12579k org.json.JSONObject r4, @org.jetbrains.annotations.C12579k java.util.Random r5) {
        /*
            r3 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "randomiser"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.usabilla.sdk.ubform.eventengine.c r0 = com.usabilla.sdk.ubform.eventengine.C9834c.f26896a
            java.lang.String r1 = "children"
            org.json.JSONArray r1 = r4.getJSONArray(r1)
            r2 = 0
            org.json.JSONObject r1 = r1.getJSONObject(r2)
            java.lang.String r2 = "json.getJSONArray(CHILDREN).getJSONObject(0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.usabilla.sdk.ubform.eventengine.rules.Rule r0 = r0.mo20225b(r1)
            java.lang.String r1 = "percentage"
            int r4 = r4.getInt(r1)
            r3.<init>(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.eventengine.decorators.PercentageDecorator.<init>(org.json.JSONObject, java.util.Random):void");
    }
}
