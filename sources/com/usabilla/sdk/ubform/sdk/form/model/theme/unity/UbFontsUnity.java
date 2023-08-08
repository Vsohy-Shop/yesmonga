package com.usabilla.sdk.ubform.sdk.form.model.theme.unity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.C35390i;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.form.model.ThemeFonts;
import kotlin.C11076d0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import unity.ForceToBoolean;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnity;", "Landroid/os/Parcelable;", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeFonts;", "Landroid/content/Context;", "context", "", "fontName", "addFontExtension", "Landroid/graphics/Typeface;", "getFont", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "regular", "Ljava/lang/String;", "getRegular", "()Ljava/lang/String;", "", "bold", "Z", "getBold", "()Z", "titleSize", "I", "getTitleSize", "()I", "textSize", "getTextSize", "miniSize", "getMiniSize", "<init>", "(Ljava/lang/String;ZIII)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbFontsUnity implements Parcelable, ThemeFonts {
    @C12579k
    public static final Parcelable.Creator<UbFontsUnity> CREATOR = new Creator();
    private final boolean bold;
    private final int miniSize;
    @C12580l
    private final String regular;
    private final int textSize;
    private final int titleSize;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UbFontsUnity> {
        @C12579k
        public final UbFontsUnity createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UbFontsUnity(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @C12579k
        public final UbFontsUnity[] newArray(int i) {
            return new UbFontsUnity[i];
        }
    }

    @C11315i
    public UbFontsUnity() {
        this((String) null, false, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    private final String addFontExtension(Context context, String str) {
        String stringPlus;
        String[] list = context.getAssets().list("");
        if (list == null) {
            return str;
        }
        if (ArraysKt___ArraysKt.m39388T8(list, Intrinsics.stringPlus(str, ".ttf"))) {
            stringPlus = Intrinsics.stringPlus(str, ".ttf");
        } else if (!ArraysKt___ArraysKt.m39388T8(list, Intrinsics.stringPlus(str, ".otf"))) {
            return str;
        } else {
            stringPlus = Intrinsics.stringPlus(str, ".otf");
        }
        return stringPlus;
    }

    public int describeContents() {
        return 0;
    }

    public boolean getBold() {
        return this.bold;
    }

    @C12580l
    public Typeface getFont(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String str = this.regular;
        if (str == null) {
            return null;
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), addFontExtension(context, str));
        } catch (IllegalArgumentException unused) {
            return Typeface.DEFAULT;
        } catch (RuntimeException unused2) {
            return Typeface.DEFAULT;
        }
    }

    public int getMiniSize() {
        return this.miniSize;
    }

    @C12580l
    public final String getRegular() {
        return this.regular;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public int getTitleSize() {
        return this.titleSize;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.regular);
        parcel.writeInt(this.bold ? 1 : 0);
        parcel.writeInt(this.titleSize);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.miniSize);
    }

    @C11315i
    public UbFontsUnity(@C12580l String str) {
        this(str, false, 0, 0, 0, 30, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFontsUnity(@C12580l String str, @ForceToBoolean boolean z) {
        this(str, z, 0, 0, 0, 28, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFontsUnity(@C12580l String str, @ForceToBoolean boolean z, int i) {
        this(str, z, i, 0, 0, 24, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFontsUnity(@C12580l String str, @ForceToBoolean boolean z, int i, int i2) {
        this(str, z, i, i2, 0, 16, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFontsUnity(@C12580l String str, @ForceToBoolean boolean z, int i, int i2, int i3) {
        this.regular = str;
        this.bold = z;
        this.titleSize = i;
        this.textSize = i2;
        this.miniSize = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UbFontsUnity(java.lang.String r4, boolean r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000a
            r5 = 1
        L_0x000a:
            r10 = r5
            r5 = r9 & 4
            r0 = 18
            if (r5 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r6
        L_0x0014:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = r7
        L_0x001a:
            r5 = 16
            r6 = r9 & 16
            if (r6 == 0) goto L_0x0022
            r2 = r5
            goto L_0x0023
        L_0x0022:
            r2 = r8
        L_0x0023:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UbFontsUnity.<init>(java.lang.String, boolean, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
