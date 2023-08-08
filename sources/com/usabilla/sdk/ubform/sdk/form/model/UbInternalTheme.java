package com.usabilla.sdk.ubform.sdk.form.model;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UbFontsUnity;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UbImagesUnity;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 K2\u00020\u0001:\u0001KBI\b\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\bI\u0010JJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\t\u0010\b\u001a\u00020\u0007HÂ\u0003J\t\u0010\n\u001a\u00020\tHÂ\u0003J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0011HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\u0019\u0010'\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\"\u0010\u001a\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R.\u00101\u001a\u0004\u0018\u00010\u000f2\b\u00100\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R.\u00107\u001a\u0004\u0018\u00010\u000f2\b\u00100\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b7\u00102\u0012\u0004\b9\u00106\u001a\u0004\b8\u00104R\u001a\u0010=\u001a\u00020\u00048BX\u0004¢\u0006\f\u0012\u0004\b<\u00106\u001a\u0004\b:\u0010;R\u0011\u0010A\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\bG\u00106\u001a\u0004\bF\u0010;¨\u0006L"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "Landroid/os/Parcelable;", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UsabillaThemeUnity;", "component1", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "component2", "component3", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;", "component4", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;", "component5", "Landroid/content/Context;", "context", "Lkotlin/d2;", "initializeFont", "Landroid/graphics/Typeface;", "getTitleFont", "", "component6$ubform_sdkRelease", "()Z", "component6", "unityTheme", "lightModeColors", "darkColors", "themeFonts", "themeImages", "isDarkModeActive", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UsabillaThemeUnity;", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;", "Z", "isDarkModeActive$ubform_sdkRelease", "setDarkModeActive$ubform_sdkRelease", "(Z)V", "<set-?>", "typefaceRegular", "Landroid/graphics/Typeface;", "getTypefaceRegular", "()Landroid/graphics/Typeface;", "getTypefaceRegular$annotations", "()V", "typefaceBold", "getTypefaceBold", "getTypefaceBold$annotations", "getDarkModeColors", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "getDarkModeColors$annotations", "darkModeColors", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeImages;", "getImages", "()Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeImages;", "images", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeFonts;", "getFonts", "()Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeFonts;", "fonts", "getColors", "getColors$annotations", "colors", "<init>", "(Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UsabillaThemeUnity;Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;Lcom/usabilla/sdk/ubform/sdk/form/model/UbImages;Z)V", "Companion", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbInternalTheme implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UbInternalTheme> CREATOR = new Creator();
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    public static final String defaultFont = "sans-serif-medium";
    @C12580l
    private final UbColors darkColors;
    private boolean isDarkModeActive;
    @C12579k
    private final UbColors lightModeColors;
    @C12579k
    private final UbFonts themeFonts;
    @C12579k
    private final UbImages themeImages;
    @C12580l
    private Typeface typefaceBold;
    @C12580l
    private Typeface typefaceRegular;
    @C12580l
    private final UsabillaThemeUnity unityTheme;

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme$Companion;", "", "()V", "defaultFont", "", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UbInternalTheme> {
        @C12579k
        public final UbInternalTheme createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UbColors ubColors = null;
            UsabillaThemeUnity createFromParcel = parcel.readInt() == 0 ? null : UsabillaThemeUnity.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<UbColors> creator = UbColors.CREATOR;
            UbColors createFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                ubColors = creator.createFromParcel(parcel);
            }
            return new UbInternalTheme(createFromParcel, createFromParcel2, ubColors, UbFonts.CREATOR.createFromParcel(parcel), UbImages.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @C12579k
        public final UbInternalTheme[] newArray(int i) {
            return new UbInternalTheme[i];
        }
    }

    @C11315i
    public UbInternalTheme() {
        this((UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, (UbFonts) null, (UbImages) null, false, 63, (DefaultConstructorMarker) null);
    }

    private final UsabillaThemeUnity component1() {
        return this.unityTheme;
    }

    private final UbColors component2() {
        return this.lightModeColors;
    }

    private final UbColors component3() {
        return this.darkColors;
    }

    private final UbFonts component4() {
        return this.themeFonts;
    }

    private final UbImages component5() {
        return this.themeImages;
    }

    public static /* synthetic */ UbInternalTheme copy$default(UbInternalTheme ubInternalTheme, UsabillaThemeUnity usabillaThemeUnity, UbColors ubColors, UbColors ubColors2, UbFonts ubFonts, UbImages ubImages, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            usabillaThemeUnity = ubInternalTheme.unityTheme;
        }
        if ((i & 2) != 0) {
            ubColors = ubInternalTheme.lightModeColors;
        }
        UbColors ubColors3 = ubColors;
        if ((i & 4) != 0) {
            ubColors2 = ubInternalTheme.darkColors;
        }
        UbColors ubColors4 = ubColors2;
        if ((i & 8) != 0) {
            ubFonts = ubInternalTheme.themeFonts;
        }
        UbFonts ubFonts2 = ubFonts;
        if ((i & 16) != 0) {
            ubImages = ubInternalTheme.themeImages;
        }
        UbImages ubImages2 = ubImages;
        if ((i & 32) != 0) {
            z = ubInternalTheme.isDarkModeActive;
        }
        return ubInternalTheme.copy(usabillaThemeUnity, ubColors3, ubColors4, ubFonts2, ubImages2, z);
    }

    public static /* synthetic */ void getColors$annotations() {
    }

    private final UbColors getDarkModeColors() {
        if (this.darkColors != null) {
            return new UbColors(this.darkColors.getAccent(), this.darkColors.getAccentedText(), this.darkColors.getBackground(), this.darkColors.getCard(), this.darkColors.getError(), this.darkColors.getText(), this.darkColors.getTitle());
        }
        return this.lightModeColors;
    }

    private static /* synthetic */ void getDarkModeColors$annotations() {
    }

    public static /* synthetic */ void getTypefaceBold$annotations() {
    }

    public static /* synthetic */ void getTypefaceRegular$annotations() {
    }

    public final boolean component6$ubform_sdkRelease() {
        return this.isDarkModeActive;
    }

    @C12579k
    public final UbInternalTheme copy(@C12580l UsabillaThemeUnity usabillaThemeUnity, @C12579k UbColors ubColors, @C12580l UbColors ubColors2, @C12579k UbFonts ubFonts, @C12579k UbImages ubImages, boolean z) {
        Intrinsics.checkNotNullParameter(ubColors, "lightModeColors");
        Intrinsics.checkNotNullParameter(ubFonts, "themeFonts");
        Intrinsics.checkNotNullParameter(ubImages, "themeImages");
        return new UbInternalTheme(usabillaThemeUnity, ubColors, ubColors2, ubFonts, ubImages, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UbInternalTheme)) {
            return false;
        }
        UbInternalTheme ubInternalTheme = (UbInternalTheme) obj;
        return Intrinsics.areEqual((Object) this.unityTheme, (Object) ubInternalTheme.unityTheme) && Intrinsics.areEqual((Object) this.lightModeColors, (Object) ubInternalTheme.lightModeColors) && Intrinsics.areEqual((Object) this.darkColors, (Object) ubInternalTheme.darkColors) && Intrinsics.areEqual((Object) this.themeFonts, (Object) ubInternalTheme.themeFonts) && Intrinsics.areEqual((Object) this.themeImages, (Object) ubInternalTheme.themeImages) && this.isDarkModeActive == ubInternalTheme.isDarkModeActive;
    }

    @C12579k
    public final UbColors getColors() {
        if (this.isDarkModeActive) {
            return getDarkModeColors();
        }
        return this.lightModeColors;
    }

    @C12579k
    public final ThemeFonts getFonts() {
        UsabillaThemeUnity usabillaThemeUnity = this.unityTheme;
        UbFontsUnity fontsUnity = usabillaThemeUnity == null ? null : usabillaThemeUnity.getFontsUnity();
        return fontsUnity == null ? this.themeFonts : fontsUnity;
    }

    @C12579k
    public final ThemeImages getImages() {
        UsabillaThemeUnity usabillaThemeUnity = this.unityTheme;
        UbImagesUnity imagesUnity = usabillaThemeUnity == null ? null : usabillaThemeUnity.getImagesUnity();
        return imagesUnity == null ? this.themeImages : imagesUnity;
    }

    @C12580l
    public final Typeface getTitleFont(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Typeface typeface = this.typefaceRegular;
        if (typeface == null) {
            typeface = Typeface.create(defaultFont, 0);
        }
        if (!getFonts().getBold()) {
            return typeface;
        }
        Typeface create = Typeface.create(typeface, 1);
        if (this.typefaceRegular == null) {
            return this.typefaceBold;
        }
        return create;
    }

    @C12580l
    public final Typeface getTypefaceBold() {
        return this.typefaceBold;
    }

    @C12580l
    public final Typeface getTypefaceRegular() {
        return this.typefaceRegular;
    }

    public int hashCode() {
        UsabillaThemeUnity usabillaThemeUnity = this.unityTheme;
        int i = 0;
        int hashCode = (((usabillaThemeUnity == null ? 0 : usabillaThemeUnity.hashCode()) * 31) + this.lightModeColors.hashCode()) * 31;
        UbColors ubColors = this.darkColors;
        if (ubColors != null) {
            i = ubColors.hashCode();
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.themeFonts.hashCode()) * 31) + this.themeImages.hashCode()) * 31;
        boolean z = this.isDarkModeActive;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final void initializeFont(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.typefaceBold = Typeface.create(defaultFont, 0);
        Typeface font = getFonts().getFont(context);
        if (font == null) {
            font = this.typefaceRegular;
        }
        this.typefaceRegular = font;
    }

    public final boolean isDarkModeActive$ubform_sdkRelease() {
        return this.isDarkModeActive;
    }

    public final void setDarkModeActive$ubform_sdkRelease(boolean z) {
        this.isDarkModeActive = z;
    }

    @C12579k
    public String toString() {
        return "UbInternalTheme(unityTheme=" + this.unityTheme + ", lightModeColors=" + this.lightModeColors + ", darkColors=" + this.darkColors + ", themeFonts=" + this.themeFonts + ", themeImages=" + this.themeImages + ", isDarkModeActive=" + this.isDarkModeActive + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        UsabillaThemeUnity usabillaThemeUnity = this.unityTheme;
        if (usabillaThemeUnity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usabillaThemeUnity.writeToParcel(parcel, i);
        }
        this.lightModeColors.writeToParcel(parcel, i);
        UbColors ubColors = this.darkColors;
        if (ubColors == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ubColors.writeToParcel(parcel, i);
        }
        this.themeFonts.writeToParcel(parcel, i);
        this.themeImages.writeToParcel(parcel, i);
        parcel.writeInt(this.isDarkModeActive ? 1 : 0);
    }

    @C11315i
    public UbInternalTheme(@C12580l UsabillaThemeUnity usabillaThemeUnity) {
        this(usabillaThemeUnity, (UbColors) null, (UbColors) null, (UbFonts) null, (UbImages) null, false, 62, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbInternalTheme(@C12580l UsabillaThemeUnity usabillaThemeUnity, @C12579k UbColors ubColors) {
        this(usabillaThemeUnity, ubColors, (UbColors) null, (UbFonts) null, (UbImages) null, false, 60, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ubColors, "lightModeColors");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbInternalTheme(@C12580l UsabillaThemeUnity usabillaThemeUnity, @C12579k UbColors ubColors, @C12580l UbColors ubColors2) {
        this(usabillaThemeUnity, ubColors, ubColors2, (UbFonts) null, (UbImages) null, false, 56, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ubColors, "lightModeColors");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbInternalTheme(@C12580l UsabillaThemeUnity usabillaThemeUnity, @C12579k UbColors ubColors, @C12580l UbColors ubColors2, @C12579k UbFonts ubFonts) {
        this(usabillaThemeUnity, ubColors, ubColors2, ubFonts, (UbImages) null, false, 48, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ubColors, "lightModeColors");
        Intrinsics.checkNotNullParameter(ubFonts, "themeFonts");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbInternalTheme(@C12580l UsabillaThemeUnity usabillaThemeUnity, @C12579k UbColors ubColors, @C12580l UbColors ubColors2, @C12579k UbFonts ubFonts, @C12579k UbImages ubImages) {
        this(usabillaThemeUnity, ubColors, ubColors2, ubFonts, ubImages, false, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ubColors, "lightModeColors");
        Intrinsics.checkNotNullParameter(ubFonts, "themeFonts");
        Intrinsics.checkNotNullParameter(ubImages, "themeImages");
    }

    @C11315i
    public UbInternalTheme(@C12580l UsabillaThemeUnity usabillaThemeUnity, @C12579k UbColors ubColors, @C12580l UbColors ubColors2, @C12579k UbFonts ubFonts, @C12579k UbImages ubImages, boolean z) {
        Intrinsics.checkNotNullParameter(ubColors, "lightModeColors");
        Intrinsics.checkNotNullParameter(ubFonts, "themeFonts");
        Intrinsics.checkNotNullParameter(ubImages, "themeImages");
        this.unityTheme = usabillaThemeUnity;
        this.lightModeColors = ubColors;
        this.darkColors = ubColors2;
        this.themeFonts = ubFonts;
        this.themeImages = ubImages;
        this.isDarkModeActive = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UbInternalTheme(com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity r13, com.usabilla.sdk.ubform.sdk.form.model.UbColors r14, com.usabilla.sdk.ubform.sdk.form.model.UbColors r15, com.usabilla.sdk.ubform.sdk.form.model.UbFonts r16, com.usabilla.sdk.ubform.sdk.form.model.UbImages r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r12 = this;
            r0 = r19 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r13
        L_0x0008:
            r2 = r19 & 2
            if (r2 == 0) goto L_0x003b
            com.usabilla.sdk.ubform.sdk.form.model.UbColors r2 = new com.usabilla.sdk.ubform.sdk.form.model.UbColors
            java.lang.String r3 = "#258060"
            int r4 = android.graphics.Color.parseColor(r3)
            java.lang.String r3 = "#FFFFFF"
            int r5 = android.graphics.Color.parseColor(r3)
            java.lang.String r6 = "#F3F3F5"
            int r6 = android.graphics.Color.parseColor(r6)
            int r7 = android.graphics.Color.parseColor(r3)
            java.lang.String r3 = "#C43E3E"
            int r8 = android.graphics.Color.parseColor(r3)
            java.lang.String r3 = "#555B6E"
            int r9 = android.graphics.Color.parseColor(r3)
            java.lang.String r3 = "#0F1013"
            int r10 = android.graphics.Color.parseColor(r3)
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x003c
        L_0x003b:
            r2 = r14
        L_0x003c:
            r3 = r19 & 4
            if (r3 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r15
        L_0x0042:
            r3 = r19 & 8
            if (r3 == 0) goto L_0x0055
            com.usabilla.sdk.ubform.sdk.form.model.UbFonts r3 = new com.usabilla.sdk.ubform.sdk.form.model.UbFonts
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 31
            r11 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0057
        L_0x0055:
            r3 = r16
        L_0x0057:
            r4 = r19 & 16
            if (r4 == 0) goto L_0x0069
            com.usabilla.sdk.ubform.sdk.form.model.UbImages r4 = new com.usabilla.sdk.ubform.sdk.form.model.UbImages
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 15
            r11 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x006b
        L_0x0069:
            r4 = r17
        L_0x006b:
            r5 = r19 & 32
            if (r5 == 0) goto L_0x0071
            r5 = 0
            goto L_0x0073
        L_0x0071:
            r5 = r18
        L_0x0073:
            r13 = r12
            r14 = r0
            r15 = r2
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme.<init>(com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity, com.usabilla.sdk.ubform.sdk.form.model.UbColors, com.usabilla.sdk.ubform.sdk.form.model.UbColors, com.usabilla.sdk.ubform.sdk.form.model.UbFonts, com.usabilla.sdk.ubform.sdk.form.model.UbImages, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
