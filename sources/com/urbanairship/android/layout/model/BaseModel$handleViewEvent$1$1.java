package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.property.StateAction;
import com.urbanairship.json.JsonValue;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroid/view/View;", "T", "Lcom/urbanairship/android/layout/model/BaseModel$a;", "L", "Lcom/urbanairship/android/layout/environment/o$c;", "it", "a", "(Lcom/urbanairship/android/layout/environment/o$c;)Lcom/urbanairship/android/layout/environment/o$c;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class BaseModel$handleViewEvent$1$1 extends Lambda implements C11300l<C35608o.C35611c, C35608o.C35611c> {
    final /* synthetic */ StateAction $action;
    final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseModel$handleViewEvent$1$1(StateAction stateAction, Object obj) {
        super(1);
        this.$action = stateAction;
        this.$value = obj;
    }

    @C12579k
    /* renamed from: a */
    public final C35608o.C35611c invoke(@C12579k C35608o.C35611c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "it");
        return cVar.mo106715b(C10977s0.m41474o0(cVar.mo106716d(), C11078d1.m42659a(((StateAction.C35826c) this.$action).mo107306e(), JsonValue.m34975U(this.$value))));
    }
}
