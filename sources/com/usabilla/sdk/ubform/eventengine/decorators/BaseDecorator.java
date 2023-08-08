package com.usabilla.sdk.ubform.eventengine.decorators;

import com.usabilla.sdk.ubform.eventengine.rules.BaseRule;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b \u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0011B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/decorators/BaseDecorator;", "Lcom/usabilla/sdk/ubform/eventengine/rules/BaseRule;", "Ljava/io/Serializable;", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "mRule", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "c", "()Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "", "isTriggered", "Z", "Q1", "()Z", "a2", "(Z)V", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;Z)V", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class BaseDecorator extends BaseRule implements Serializable {
    @C12579k

    /* renamed from: c */
    public static final C9836a f26900c = new C9836a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;
    private boolean isTriggered;
    @C12579k
    private final Rule mRule;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.decorators.BaseDecorator$a */
    public static final class C9836a {
        public /* synthetic */ C9836a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9836a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseDecorator(Rule rule, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rule, (i & 2) != 0 ? false : z);
    }

    /* renamed from: Q1 */
    public boolean mo20228Q1() {
        return this.isTriggered;
    }

    /* renamed from: a2 */
    public void mo20229a2(boolean z) {
        this.isTriggered = z;
    }

    @C12579k
    /* renamed from: c */
    public final Rule mo20230c() {
        return this.mRule;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDecorator(@C12579k Rule rule, boolean z) {
        super(rule.mo20232N1(), CollectionsKt__CollectionsKt.m40463r(rule), z);
        Intrinsics.checkNotNullParameter(rule, "mRule");
        this.mRule = rule;
        this.isTriggered = z;
    }
}
