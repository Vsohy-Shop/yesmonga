package com.usabilla.sdk.ubform.eventengine.rules;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0000H\u0016J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0016J8\u0010\u0016\u001a\u00020\u00072\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0012j\b\u0012\u0004\u0012\u00020\u0000`\u00132\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0012j\b\u0012\u0004\u0012\u00020\u0000`\u0013H\u0002R\u0014\u0010\u0019\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0012j\b\u0012\u0004\u0012\u00020\u0000`\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "E1", "j0", "Lkotlin/d2;", "reset", "rule", "I1", "", "Lkotlin/Pair;", "", "h0", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listA", "listB", "areChildRulesEqual", "l1", "()Ljava/lang/String;", "ruleID", "Q1", "()Z", "a2", "(Z)V", "isTriggered", "Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "N1", "()Lcom/usabilla/sdk/ubform/eventengine/rules/RuleType;", "ruleType", "i0", "()Ljava/util/ArrayList;", "childRules", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public interface Rule extends Serializable {

    /* renamed from: com.usabilla.sdk.ubform.eventengine.rules.Rule$a */
    public static final class C9842a {
        /* renamed from: a */
        public static boolean m36875a(Rule rule, ArrayList<Rule> arrayList, ArrayList<Rule> arrayList2) {
            return Intrinsics.areEqual((Object) arrayList, (Object) arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public static List<Pair<String, Object>> m36876b(@C12579k Rule rule) {
            Intrinsics.checkNotNullParameter(rule, "this");
            return CollectionsKt__CollectionsKt.m40441E();
        }

        /* renamed from: c */
        public static boolean m36877c(@C12579k Rule rule, @C12579k Rule rule2) {
            Intrinsics.checkNotNullParameter(rule, "this");
            Intrinsics.checkNotNullParameter(rule2, "rule");
            if (!Intrinsics.areEqual((Object) rule.mo20240l1(), (Object) rule2.mo20240l1()) || rule.mo20228Q1() != rule2.mo20228Q1() || rule.mo20232N1() != rule2.mo20232N1() || !m36875a(rule, rule.mo20239i0(), rule2.mo20239i0())) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public static /* synthetic */ boolean m36878d(Rule rule, C9827Event event, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = new HashMap();
                }
                return rule.mo20236E1(event, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggersWith");
        }
    }

    /* renamed from: E1 */
    boolean mo20236E1(@C12579k C9827Event event, @C12579k Map<String, String> map);

    /* renamed from: I1 */
    boolean mo20231I1(@C12579k Rule rule);

    @C12579k
    /* renamed from: N1 */
    RuleType mo20232N1();

    /* renamed from: Q1 */
    boolean mo20228Q1();

    /* renamed from: a2 */
    void mo20229a2(boolean z);

    @C12579k
    /* renamed from: h0 */
    List<Pair<String, Object>> mo20234h0();

    @C12579k
    /* renamed from: i0 */
    ArrayList<Rule> mo20239i0();

    /* renamed from: j0 */
    boolean mo20235j0(@C12579k C9827Event event);

    @C12579k
    /* renamed from: l1 */
    String mo20240l1();

    void reset();
}
