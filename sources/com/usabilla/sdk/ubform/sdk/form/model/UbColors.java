package com.usabilla.sdk.ubform.sdk.form.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00198\u0002XD¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u001e\u0010\n\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\f¨\u0006#"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UbColors;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "accent", "I", "getAccent", "()I", "accentedText", "getAccentedText", "background", "getBackground", "card", "getCard", "error", "getError", "text", "getText", "title", "getTitle", "", "alpha", "F", "getAlpha$annotations", "()V", "hint", "getHint", "getHint$annotations", "<init>", "(IIIIIII)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbColors implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UbColors> CREATOR = new Creator();
    private final int accent;
    private final int accentedText;
    private final float alpha;
    private final int background;
    private final int card;
    private final int error;
    private final int hint;
    private final int text;
    private final int title;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UbColors> {
        @C12579k
        public final UbColors createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UbColors(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @C12579k
        public final UbColors[] newArray(int i) {
            return new UbColors[i];
        }
    }

    @C11315i
    public UbColors() {
        this(0, 0, 0, 0, 0, 0, 0, 127, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getHint$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public final int getAccent() {
        return this.accent;
    }

    public final int getAccentedText() {
        return this.accentedText;
    }

    public final int getBackground() {
        return this.background;
    }

    public final int getCard() {
        return this.card;
    }

    public final int getError() {
        return this.error;
    }

    public final int getHint() {
        return this.hint;
    }

    public final int getText() {
        return this.text;
    }

    public final int getTitle() {
        return this.title;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.accent);
        parcel.writeInt(this.accentedText);
        parcel.writeInt(this.background);
        parcel.writeInt(this.card);
        parcel.writeInt(this.error);
        parcel.writeInt(this.text);
        parcel.writeInt(this.title);
    }

    @C11315i
    public UbColors(int i) {
        this(i, 0, 0, 0, 0, 0, 0, 126, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbColors(int i, int i2) {
        this(i, i2, 0, 0, 0, 0, 0, 124, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbColors(int i, int i2, int i3) {
        this(i, i2, i3, 0, 0, 0, 0, 120, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbColors(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, 0, 0, 0, 112, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbColors(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0, 0, 96, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbColors(int i, int i2, int i3, int i4, int i5, int i6) {
        this(i, i2, i3, i4, i5, i6, 0, 64, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UbColors(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.accent = i;
        this.accentedText = i2;
        this.background = i3;
        this.card = i4;
        this.error = i5;
        this.text = i6;
        this.title = i7;
        this.alpha = 0.38f;
        this.hint = Color.argb(Math.round(((float) Color.alpha(i6)) * 0.38f), Color.red(i6), Color.green(i6), Color.blue(i6));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UbColors(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = -1
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.form.model.UbColors.<init>(int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
