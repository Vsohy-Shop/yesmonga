package com.usabilla.sdk.ubform.sdk.form.model;

import com.squareup.moshi.C35390i;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/Setting;", "", "variable", "Lcom/usabilla/sdk/ubform/sdk/form/model/VariableName;", "value", "", "rules", "", "Lcom/usabilla/sdk/ubform/sdk/form/model/SettingRules;", "(Lcom/usabilla/sdk/ubform/sdk/form/model/VariableName;Ljava/lang/String;Ljava/util/List;)V", "getRules", "()Ljava/util/List;", "getValue", "()Ljava/lang/String;", "getVariable", "()Lcom/usabilla/sdk/ubform/sdk/form/model/VariableName;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class Setting {
    @C12579k
    private final List<SettingRules> rules;
    @C12579k
    private final String value;
    @C12579k
    private final VariableName variable;

    public Setting(@C12579k VariableName variableName, @C12579k String str, @C12579k List<SettingRules> list) {
        Intrinsics.checkNotNullParameter(variableName, "variable");
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(list, "rules");
        this.variable = variableName;
        this.value = str;
        this.rules = list;
    }

    public static /* synthetic */ Setting copy$default(Setting setting, VariableName variableName, String str, List<SettingRules> list, int i, Object obj) {
        if ((i & 1) != 0) {
            variableName = setting.variable;
        }
        if ((i & 2) != 0) {
            str = setting.value;
        }
        if ((i & 4) != 0) {
            list = setting.rules;
        }
        return setting.copy(variableName, str, list);
    }

    @C12579k
    public final VariableName component1() {
        return this.variable;
    }

    @C12579k
    public final String component2() {
        return this.value;
    }

    @C12579k
    public final List<SettingRules> component3() {
        return this.rules;
    }

    @C12579k
    public final Setting copy(@C12579k VariableName variableName, @C12579k String str, @C12579k List<SettingRules> list) {
        Intrinsics.checkNotNullParameter(variableName, "variable");
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(list, "rules");
        return new Setting(variableName, str, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Setting)) {
            return false;
        }
        Setting setting = (Setting) obj;
        return this.variable == setting.variable && Intrinsics.areEqual((Object) this.value, (Object) setting.value) && Intrinsics.areEqual((Object) this.rules, (Object) setting.rules);
    }

    @C12579k
    public final List<SettingRules> getRules() {
        return this.rules;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }

    @C12579k
    public final VariableName getVariable() {
        return this.variable;
    }

    public int hashCode() {
        return (((this.variable.hashCode() * 31) + this.value.hashCode()) * 31) + this.rules.hashCode();
    }

    @C12579k
    public String toString() {
        return "Setting(variable=" + this.variable + ", value=" + this.value + ", rules=" + this.rules + ')';
    }
}
