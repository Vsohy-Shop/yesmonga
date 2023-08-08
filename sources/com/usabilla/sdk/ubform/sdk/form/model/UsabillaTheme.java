package com.usabilla.sdk.ubform.sdk.form.model;

import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UsabillaTheme;", "", "fonts", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;", "images", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;", "(Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;)V", "getFonts", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;", "getImages", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class UsabillaTheme {
    @C12580l
    private final UbFonts fonts;
    @C12580l
    private final UbImages images;

    @C11315i
    public UsabillaTheme() {
        this((UbFonts) null, (UbImages) null, 3, (DefaultConstructorMarker) null);
    }

    @C12580l
    public final UbFonts getFonts() {
        return this.fonts;
    }

    @C12580l
    public final UbImages getImages() {
        return this.images;
    }

    @C11315i
    public UsabillaTheme(@C12580l UbFonts ubFonts) {
        this(ubFonts, (UbImages) null, 2, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UsabillaTheme(@C12580l UbFonts ubFonts, @C12580l UbImages ubImages) {
        this.fonts = ubFonts;
        this.images = ubImages;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UsabillaTheme(UbFonts ubFonts, UbImages ubImages, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ubFonts, (i & 2) != 0 ? null : ubImages);
    }
}
