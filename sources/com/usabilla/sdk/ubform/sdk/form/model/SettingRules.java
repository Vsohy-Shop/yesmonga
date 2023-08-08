package com.usabilla.sdk.ubform.sdk.form.model;

import com.squareup.moshi.C35390i;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/SettingRules;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class SettingRules {
    @C12579k
    private final String name;
    @C12579k
    private final String value;

    public SettingRules(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.name = str;
        this.value = str2;
    }

    public static /* synthetic */ SettingRules copy$default(SettingRules settingRules, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingRules.name;
        }
        if ((i & 2) != 0) {
            str2 = settingRules.value;
        }
        return settingRules.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component2() {
        return this.value;
    }

    @C12579k
    public final SettingRules copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "value");
        return new SettingRules(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingRules)) {
            return false;
        }
        SettingRules settingRules = (SettingRules) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) settingRules.name) && Intrinsics.areEqual((Object) this.value, (Object) settingRules.value);
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @C12579k
    public String toString() {
        return "SettingRules(name=" + this.name + ", value=" + this.value + ')';
    }
}
