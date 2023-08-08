package com.usabilla.sdk.ubform.eventengine;

import com.usabilla.sdk.ubform.eventengine.decorators.PercentageDecorator;
import com.usabilla.sdk.ubform.eventengine.decorators.RepetitionDecorator;
import com.usabilla.sdk.ubform.eventengine.rules.AndRule;
import com.usabilla.sdk.ubform.eventengine.rules.LeafActiveStatusRule;
import com.usabilla.sdk.ubform.eventengine.rules.LeafPassiveStatusRule;
import com.usabilla.sdk.ubform.eventengine.rules.LeafRule;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import com.usabilla.sdk.ubform.eventengine.rules.RuleType;
import com.usabilla.sdk.ubform.eventengine.statuses.ActiveStatus;
import com.usabilla.sdk.ubform.eventengine.statuses.LanguageMatcher;
import com.usabilla.sdk.ubform.eventengine.statuses.PassiveStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.eventengine.c */
public final class C9834c {
    @C12579k

    /* renamed from: a */
    public static final C9834c f26896a = new C9834c();
    @C12579k

    /* renamed from: b */
    public static final String f26897b = "name";
    @C12579k

    /* renamed from: c */
    public static final String f26898c = "value";
    @C12579k

    /* renamed from: d */
    public static final String f26899d = "type";

    /* renamed from: com.usabilla.sdk.ubform.eventengine.c$a */
    public /* synthetic */ class C9835a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PassiveStatus.StatusType.values().length];
            iArr[PassiveStatus.StatusType.LANGUAGE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public final LanguageMatcher mo20224a(PassiveStatus.StatusType statusType) {
        if (C9835a.$EnumSwitchMapping$0[statusType.ordinal()] == 1) {
            return new LanguageMatcher();
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: b */
    public final Rule mo20225b(@C12579k JSONObject jSONObject) throws Exception {
        Intrinsics.checkNotNullParameter(jSONObject, "targetingOptions");
        String string = jSONObject.getString("type");
        if (Intrinsics.areEqual((Object) string, (Object) RuleType.PERCENTAGE.mo20245q())) {
            return new PercentageDecorator(jSONObject, new Random());
        }
        if (Intrinsics.areEqual((Object) string, (Object) RuleType.REPETITION.mo20245q())) {
            return new RepetitionDecorator(jSONObject);
        }
        if (Intrinsics.areEqual((Object) string, (Object) RuleType.LEAF.mo20245q())) {
            return new LeafRule(jSONObject);
        }
        if (Intrinsics.areEqual((Object) string, (Object) RuleType.AND.mo20245q())) {
            JSONArray jSONArray = jSONObject.getJSONArray("children");
            C11466l W1 = C11479u.m44378W1(0, jSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList<>(C10978t.m41495Y(W1, 10));
            Iterator it = W1.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.getJSONObject(((C10953k0) it).mo6374c()));
            }
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (JSONObject jSONObject2 : arrayList) {
                C9834c cVar = f26896a;
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "it");
                arrayList2.add(cVar.mo20225b(jSONObject2));
            }
            return new AndRule(new ArrayList(arrayList2), false, 2, (DefaultConstructorMarker) null);
        } else if (Intrinsics.areEqual((Object) string, (Object) RuleType.PASSIVE_STATUS.mo20245q())) {
            String string2 = jSONObject.getString("name");
            Intrinsics.checkNotNullExpressionValue(string2, "targetingStatus");
            PassiveStatus.StatusType c = mo20226c(string2);
            if (c != null) {
                String string3 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string3, "value");
                PassiveStatus passiveStatus = new PassiveStatus(c, string3);
                return new LeafPassiveStatusRule(passiveStatus, mo20224a(passiveStatus.mo20251a()));
            }
            throw new NullPointerException(Intrinsics.stringPlus("Error parsing targeting status ", string2));
        } else if (Intrinsics.areEqual((Object) string, (Object) RuleType.ACTIVE_STATUS.mo20245q())) {
            String string4 = jSONObject.getString("name");
            String string5 = jSONObject.getString("value");
            Intrinsics.checkNotNullExpressionValue(string4, "name");
            Intrinsics.checkNotNullExpressionValue(string5, "value");
            return new LeafActiveStatusRule(new ActiveStatus(string4, string5));
        } else {
            throw new ClassNotFoundException(Intrinsics.stringPlus("Invalid rule type ", jSONObject.getString("type")));
        }
    }

    /* renamed from: c */
    public final PassiveStatus.StatusType mo20226c(String str) {
        PassiveStatus.StatusType statusType = PassiveStatus.StatusType.LANGUAGE;
        if (Intrinsics.areEqual((Object) str, (Object) statusType.mo20255q())) {
            return statusType;
        }
        return null;
    }

    @C12579k
    /* renamed from: d */
    public final JSONObject mo20227d(@C12579k Rule rule) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(rule, "rule");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", rule.mo20232N1().mo20245q());
        if (rule instanceof PercentageDecorator) {
            z = true;
        } else {
            z = rule instanceof RepetitionDecorator;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = rule instanceof LeafRule;
        }
        if (z2) {
            for (Pair pair : rule.mo20234h0()) {
                jSONObject.put((String) pair.mo21849e(), pair.mo21851f());
            }
        } else if (rule instanceof LeafPassiveStatusRule) {
            jSONObject.put("type", RuleType.PASSIVE_STATUS.mo20245q());
            LeafPassiveStatusRule leafPassiveStatusRule = (LeafPassiveStatusRule) rule;
            jSONObject.put("name", leafPassiveStatusRule.mo20244d().mo20251a().mo20255q());
            jSONObject.put("value", leafPassiveStatusRule.mo20244d().mo20252b());
        } else if (rule instanceof LeafActiveStatusRule) {
            jSONObject.put("type", RuleType.ACTIVE_STATUS.mo20245q());
            LeafActiveStatusRule leafActiveStatusRule = (LeafActiveStatusRule) rule;
            jSONObject.put("name", leafActiveStatusRule.mo20242c().mo20246a());
            jSONObject.put("value", leafActiveStatusRule.mo20242c().mo20247b());
        } else if (!(rule instanceof AndRule)) {
            throw new ClassNotFoundException(Intrinsics.stringPlus("Invalid rule type ", rule.mo20232N1()));
        }
        if (!rule.mo20239i0().isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Rule d : rule.mo20239i0()) {
                jSONArray.put(f26896a.mo20227d(d));
            }
            jSONObject.put("children", jSONArray);
        }
        return jSONObject;
    }
}
