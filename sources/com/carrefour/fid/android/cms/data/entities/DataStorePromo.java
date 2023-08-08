package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\"\u0010-\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\b¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DataStorePromo;", "", "()V", "brand", "", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "customLegalNotice", "getCustomLegalNotice", "setCustomLegalNotice", "description", "getDescription", "setDescription", "designation", "getDesignation", "setDesignation", "endDate", "getEndDate", "setEndDate", "image", "Lcom/carrefour/fid/android/cms/data/entities/ImageStorePromo;", "getImage", "()Lcom/carrefour/fid/android/cms/data/entities/ImageStorePromo;", "setImage", "(Lcom/carrefour/fid/android/cms/data/entities/ImageStorePromo;)V", "isFood", "setFood", "mechanism", "getMechanism", "setMechanism", "price", "", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "reference", "getReference", "setReference", "startDate", "getStartDate", "setStartDate", "strokePrice", "getStrokePrice", "setStrokePrice", "templateId", "getTemplateId", "setTemplateId", "title", "getTitle", "setTitle", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class DataStorePromo {
    @C33608c("brand")
    @C12579k
    private String brand = "";
    @C33608c("custom_legal_notice")
    @C12579k
    private String customLegalNotice = "";
    @C33608c("description")
    @C12579k
    private String description = "";
    @C33608c("designation")
    @C12579k
    private String designation = "";
    @C33608c("end_date")
    @C12579k
    private String endDate = "";
    @C33608c("image")
    @C12580l
    private ImageStorePromo image;
    @C33608c("is_food")
    @C12579k
    private String isFood = "";
    @C33608c("mechanism")
    @C12579k
    private String mechanism = "";
    @C33608c("price")
    @C12580l
    private Double price;
    @C33608c("reference")
    @C12579k
    private String reference = "";
    @C33608c("start_date")
    @C12579k
    private String startDate = "";
    @C33608c("stroke_price")
    @C12580l
    private Double strokePrice;
    @C33608c("template_id")
    @C12579k
    private String templateId = "";
    @C33608c("title")
    @C12579k
    private String title = "";

    @C12579k
    public final String getBrand() {
        return this.brand;
    }

    @C12579k
    public final String getCustomLegalNotice() {
        return this.customLegalNotice;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getDesignation() {
        return this.designation;
    }

    @C12579k
    public final String getEndDate() {
        return this.endDate;
    }

    @C12580l
    public final ImageStorePromo getImage() {
        return this.image;
    }

    @C12579k
    public final String getMechanism() {
        return this.mechanism;
    }

    @C12580l
    public final Double getPrice() {
        return this.price;
    }

    @C12579k
    public final String getReference() {
        return this.reference;
    }

    @C12579k
    public final String getStartDate() {
        return this.startDate;
    }

    @C12580l
    public final Double getStrokePrice() {
        return this.strokePrice;
    }

    @C12579k
    public final String getTemplateId() {
        return this.templateId;
    }

    @C12579k
    public final String getTitle() {
        return this.title;
    }

    @C12579k
    public final String isFood() {
        return this.isFood;
    }

    public final void setBrand(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brand = str;
    }

    public final void setCustomLegalNotice(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customLegalNotice = str;
    }

    public final void setDescription(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setDesignation(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.designation = str;
    }

    public final void setEndDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endDate = str;
    }

    public final void setFood(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isFood = str;
    }

    public final void setImage(@C12580l ImageStorePromo imageStorePromo) {
        this.image = imageStorePromo;
    }

    public final void setMechanism(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mechanism = str;
    }

    public final void setPrice(@C12580l Double d) {
        this.price = d;
    }

    public final void setReference(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reference = str;
    }

    public final void setStartDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDate = str;
    }

    public final void setStrokePrice(@C12580l Double d) {
        this.strokePrice = d;
    }

    public final void setTemplateId(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.templateId = str;
    }

    public final void setTitle(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
