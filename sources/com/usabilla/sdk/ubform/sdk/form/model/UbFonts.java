package com.usabilla.sdk.ubform.sdk.form.model;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0383y;
import androidx.core.content.res.C17465i;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UbFonts;", "Landroid/os/Parcelable;", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeFonts;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "getFont", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "regular", "I", "getRegular", "()I", "", "bold", "Z", "getBold", "()Z", "titleSize", "getTitleSize", "textSize", "getTextSize", "miniSize", "getMiniSize", "<init>", "(IZIII)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbFonts implements Parcelable, ThemeFonts {
    @C12579k
    public static final Parcelable.Creator<UbFonts> CREATOR = new Creator();
    private final boolean bold;
    private final int miniSize;
    private final int regular;
    private final int textSize;
    private final int titleSize;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UbFonts> {
        @C12579k
        public final UbFonts createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UbFonts(parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @C12579k
        public final UbFonts[] newArray(int i) {
            return new UbFonts[i];
        }
    }

    @C11315i
    public UbFonts() {
        this(0, false, 0, 0, 0, 31, (DefaultConstructorMarker) null);
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
        int i = this.regular;
        if (i != 0) {
            return C17465i.m80178j(context, i);
        }
        return Typeface.DEFAULT;
    }

    public int getMiniSize() {
        return this.miniSize;
    }

    public final int getRegular() {
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
        parcel.writeInt(this.regular);
        parcel.writeInt(this.bold ? 1 : 0);
        parcel.writeInt(this.titleSize);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.miniSize);
    }

    @C11315i
    public UbFonts(@C0383y int i) {
        this(i, false, 0, 0, 0, 30, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFonts(@C0383y int i, boolean z) {
        this(i, z, 0, 0, 0, 28, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFonts(@C0383y int i, boolean z, int i2) {
        this(i, z, i2, 0, 0, 24, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFonts(@C0383y int i, boolean z, int i2, int i3) {
        this(i, z, i2, i3, 0, 16, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbFonts(@C0383y int i, boolean z, int i2, int i3, int i4) {
        this.regular = i;
        this.bold = z;
        this.titleSize = i2;
        this.textSize = i3;
        this.miniSize = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UbFonts(int r4, boolean r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.form.model.UbFonts.<init>(int, boolean, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
