package com.usabilla.sdk.ubform.sdk.form.model;

import com.squareup.moshi.C35390i;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/SettingsModel;", "", "settings", "", "Lcom/usabilla/sdk/ubform/sdk/form/model/Setting;", "(Ljava/util/List;)V", "getSettings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class SettingsModel {
    @C12579k
    private final List<Setting> settings;

    public SettingsModel(@C12579k List<Setting> list) {
        Intrinsics.checkNotNullParameter(list, "settings");
        this.settings = list;
    }

    public static /* synthetic */ SettingsModel copy$default(SettingsModel settingsModel, List<Setting> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = settingsModel.settings;
        }
        return settingsModel.copy(list);
    }

    @C12579k
    public final List<Setting> component1() {
        return this.settings;
    }

    @C12579k
    public final SettingsModel copy(@C12579k List<Setting> list) {
        Intrinsics.checkNotNullParameter(list, "settings");
        return new SettingsModel(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SettingsModel) && Intrinsics.areEqual((Object) this.settings, (Object) ((SettingsModel) obj).settings);
    }

    @C12579k
    public final List<Setting> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode();
    }

    @C12579k
    public String toString() {
        return "SettingsModel(settings=" + this.settings + ')';
    }
}
