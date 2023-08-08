package com.usabilla.sdk.ubform.eventengine.rules;

import com.usabilla.sdk.ubform.eventengine.C9827Event;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u001a"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/rules/LeafRule;", "Lcom/usabilla/sdk/ubform/eventengine/rules/BaseRule;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "event", "", "", "activeStatuses", "", "a", "j0", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "rule", "I1", "", "Lkotlin/Pair;", "", "h0", "Lcom/usabilla/sdk/ubform/eventengine/Event;", "alreadyTriggered", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/Event;Z)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "c", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class LeafRule extends BaseRule implements Serializable {
    @C12579k

    /* renamed from: c */
    public static final C9841a f26910c = new C9841a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final String f26911d = "name";
    private static final long serialVersionUID = 1;
    @C12579k
    private final C9827Event event;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.rules.LeafRule$a */
    public static final class C9841a {
        public /* synthetic */ C9841a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9841a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LeafRule(C9827Event event2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(event2, (i & 2) != 0 ? false : z);
    }

    /* renamed from: I1 */
    public boolean mo20231I1(@C12579k Rule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (!(rule instanceof LeafRule) || !super.mo20231I1(rule) || !Intrinsics.areEqual((Object) this.event, (Object) ((LeafRule) rule).event)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo20233a(@C12579k C9827Event event2, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event2, "event");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        return Intrinsics.areEqual((Object) this.event.mo20168d(), (Object) event2.mo20168d());
    }

    @C12579k
    /* renamed from: h0 */
    public List<Pair<String, Object>> mo20234h0() {
        return C10976s.m41419k(C11078d1.m42659a("name", this.event.mo20168d()));
    }

    /* renamed from: j0 */
    public boolean mo20235j0(@C12579k C9827Event event2) {
        Intrinsics.checkNotNullParameter(event2, "event");
        return Intrinsics.areEqual((Object) this.event.mo20168d(), (Object) event2.mo20168d());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeafRule(@C12579k C9827Event event2, boolean z) {
        super(RuleType.LEAF, new ArrayList(), z);
        Intrinsics.checkNotNullParameter(event2, "event");
        this.event = event2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LeafRule(@org.jetbrains.annotations.C12579k org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.usabilla.sdk.ubform.eventengine.Event r0 = new com.usabilla.sdk.ubform.eventengine.Event
            java.lang.String r1 = "name"
            java.lang.String r4 = r4.getString(r1)
            java.lang.String r1 = "json.getString(NAME)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4)
            r4 = 2
            r1 = 0
            r2 = 0
            r3.<init>(r0, r2, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.eventengine.rules.LeafRule.<init>(org.json.JSONObject):void");
    }
}
