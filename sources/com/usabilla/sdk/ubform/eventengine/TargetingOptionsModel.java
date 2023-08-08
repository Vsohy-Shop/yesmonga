package com.usabilla.sdk.ubform.eventengine;

import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB!\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/eventengine/TargetingOptionsModel;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "a", "", "b", "c", "rule", "id", "lastModified", "d", "toString", "Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "h", "()Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "<init>", "(Lcom/usabilla/sdk/ubform/eventengine/rules/Rule;Ljava/lang/String;Ljava/lang/String;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class TargetingOptionsModel implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C9830a f26884a = new C9830a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;
    @C12579k

    /* renamed from: id */
    private final String f26885id;
    @C12580l
    private final String lastModified;
    @C12579k
    private final Rule rule;

    /* renamed from: com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel$a */
    public static final class C9830a {
        public /* synthetic */ C9830a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9830a() {
        }
    }

    public TargetingOptionsModel(@C12579k Rule rule2, @C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(rule2, "rule");
        Intrinsics.checkNotNullParameter(str, "id");
        this.rule = rule2;
        this.f26885id = str;
        this.lastModified = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ TargetingOptionsModel m36791e(TargetingOptionsModel targetingOptionsModel, Rule rule2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            rule2 = targetingOptionsModel.rule;
        }
        if ((i & 2) != 0) {
            str = targetingOptionsModel.f26885id;
        }
        if ((i & 4) != 0) {
            str2 = targetingOptionsModel.lastModified;
        }
        return targetingOptionsModel.mo20189d(rule2, str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final Rule mo20186a() {
        return this.rule;
    }

    @C12579k
    /* renamed from: b */
    public final String mo20187b() {
        return this.f26885id;
    }

    @C12580l
    /* renamed from: c */
    public final String mo20188c() {
        return this.lastModified;
    }

    @C12579k
    /* renamed from: d */
    public final TargetingOptionsModel mo20189d(@C12579k Rule rule2, @C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(rule2, "rule");
        Intrinsics.checkNotNullParameter(str, "id");
        return new TargetingOptionsModel(rule2, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof TargetingOptionsModel)) {
            return false;
        }
        TargetingOptionsModel targetingOptionsModel = (TargetingOptionsModel) obj;
        if (!Intrinsics.areEqual((Object) this.rule, (Object) targetingOptionsModel.rule) || !Intrinsics.areEqual((Object) this.f26885id, (Object) targetingOptionsModel.f26885id) || !Intrinsics.areEqual((Object) this.lastModified, (Object) targetingOptionsModel.lastModified)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: f */
    public final String mo20191f() {
        return this.f26885id;
    }

    @C12580l
    /* renamed from: g */
    public final String mo20192g() {
        return this.lastModified;
    }

    @C12579k
    /* renamed from: h */
    public final Rule mo20193h() {
        return this.rule;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.rule.hashCode() * 31) + this.f26885id.hashCode()) * 31;
        String str = this.lastModified;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        return "TargetingOptionsModel(rule=" + this.rule + ", id=" + this.f26885id + ", lastModified=" + this.lastModified + ')';
    }
}
