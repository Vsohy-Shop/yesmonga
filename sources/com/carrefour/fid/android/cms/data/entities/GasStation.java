package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/GasStation;", "Ljava/io/Serializable;", "()V", "fuelPrices", "", "Lcom/carrefour/fid/android/cms/data/entities/FuelPricePojo;", "getFuelPrices", "()Ljava/util/List;", "setFuelPrices", "(Ljava/util/List;)V", "idGasStation", "", "getIdGasStation", "()Ljava/lang/String;", "setIdGasStation", "(Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public class GasStation implements Serializable {
    @C33608c("fuel_prices")
    @C12580l
    private List<? extends FuelPricePojo> fuelPrices;
    @C33608c("id")
    @C12579k
    private String idGasStation = "";

    @C12580l
    public final List<FuelPricePojo> getFuelPrices() {
        return this.fuelPrices;
    }

    @C12579k
    public final String getIdGasStation() {
        return this.idGasStation;
    }

    public final void setFuelPrices(@C12580l List<? extends FuelPricePojo> list) {
        this.fuelPrices = list;
    }

    public final void setIdGasStation(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idGasStation = str;
    }
}
