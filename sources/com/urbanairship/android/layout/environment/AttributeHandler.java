package com.urbanairship.android.layout.environment;

import com.urbanairship.C36059m;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.channel.C9022g;
import com.urbanairship.json.JsonValue;
import java.util.Map;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AttributeHandler {
    @C12579k

    /* renamed from: a */
    public final C11289a<C9022g> f87979a;
    @C12579k

    /* renamed from: b */
    public final C11289a<C9022g> f87980b;

    public AttributeHandler() {
        this((C11289a) null, (C11289a) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo106606a(C9022g gVar, String str, JsonValue jsonValue) {
        if (jsonValue.mo18783y()) {
            gVar.mo17835i(str, jsonValue.mo18750B());
        } else if (jsonValue.mo18773p()) {
            gVar.mo17831e(str, jsonValue.mo18758d(-1.0d));
        } else if (jsonValue.mo18774r()) {
            gVar.mo17832f(str, jsonValue.mo18760e(-1.0f));
        } else if (jsonValue.mo18775s()) {
            gVar.mo17833g(str, jsonValue.mo18762f(-1));
        } else if (jsonValue.mo18779v()) {
            gVar.mo17834h(str, jsonValue.mo18766i(-1));
        }
    }

    /* renamed from: b */
    public final void mo106607b(@C12579k Map<C35865a, ? extends JsonValue> map) {
        String str;
        String str2;
        C9022g gVar;
        Intrinsics.checkNotNullParameter(map, "attributes");
        C9022g invoke = this.f87979a.invoke();
        C9022g invoke2 = this.f87980b.invoke();
        for (Map.Entry next : map.entrySet()) {
            C35865a aVar = (C35865a) next.getKey();
            JsonValue jsonValue = (JsonValue) next.getValue();
            if (aVar.mo107457f()) {
                str = aVar.mo107454d();
            } else {
                str = aVar.mo107453c();
            }
            if (str != null && !jsonValue.mo18780w()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting ");
                if (aVar.mo107455e()) {
                    str2 = "channel";
                } else {
                    str2 = "contact";
                }
                sb.append(str2);
                sb.append(" attribute: '");
                sb.append(str);
                sb.append("' => '");
                sb.append(jsonValue);
                sb.append('\'');
                C36059m.m148419o(sb.toString(), new Object[0]);
                if (aVar.mo107457f()) {
                    gVar = invoke;
                } else {
                    gVar = invoke2;
                }
                mo106606a(gVar, str, jsonValue);
            }
        }
        invoke.mo17828a();
        invoke2.mo17828a();
    }

    public AttributeHandler(@C12579k C11289a<? extends C9022g> aVar, @C12579k C11289a<? extends C9022g> aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "contactEditorFactory");
        Intrinsics.checkNotNullParameter(aVar2, "channelEditorFactory");
        this.f87979a = aVar;
        this.f87980b = aVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttributeHandler(C11289a aVar, C11289a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C355821.f87981f : aVar, (i & 2) != 0 ? C355832.f87982f : aVar2);
    }
}
