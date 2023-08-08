package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/FuelPricePojo;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "fuelId", "getFuelId", "setFuelId", "name", "getName", "setName", "price", "getPrice", "setPrice", "updateDate", "getUpdateDate", "setUpdateDate", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public class FuelPricePojo implements Serializable {
    @C33608c("code")
    @C12579k
    private String code = "";
    @C33608c("fuel_id")
    @C12579k
    private String fuelId = "";
    @C33608c("name")
    @C12579k
    private String name = "";
    @C33608c("price")
    @C12579k
    private String price = "";
    @C33608c("update_date")
    @C12579k
    private String updateDate = "";

    @C12579k
    public final String getCode() {
        return this.code;
    }

    @C12579k
    public final String getFuelId() {
        return this.fuelId;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getPrice() {
        return this.price;
    }

    @C12579k
    public final String getUpdateDate() {
        return this.updateDate;
    }

    public final void setCode(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setFuelId(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fuelId = str;
    }

    public final void setName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPrice(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final void setUpdateDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.updateDate = str;
    }
}
