package com.usabilla.sdk.ubform.sdk.banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.C17075f2;
import com.squareup.moshi.C35390i;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import okio.C12520s0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B­\u0001\b\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u000206\u0012\b\b\u0002\u0010@\u001a\u00020;¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\n\u0010\u0018R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006C"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Z", "f", "()Z", "enableClickThrough", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "contourBgAssetName", "c", "I", "g", "()I", "leftMargin", "o", "topMargin", "e", "m", "rightMargin", "bottomMargin", "h", "leftPadding", "v", "p", "topPadding", "w", "n", "rightPadding", "x", "bottomPadding", "y", "cornerRadius", "z", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "maxHeight", "X", "k", "maxWidth", "Y", "componentsDistance", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;", "i", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;", "logo", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "E0", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "l", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "navigation", "<init>", "(ZLjava/lang/String;IIIIIIIIILjava/lang/Integer;Ljava/lang/Integer;ILcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class BannerConfiguration implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BannerConfiguration> CREATOR = new C9918a();
    @C12579k

    /* renamed from: E0 */
    public final BannerConfigNavigation f27279E0;
    @C12580l

    /* renamed from: X */
    public final Integer f27280X;

    /* renamed from: Y */
    public final int f27281Y;
    @C12579k

    /* renamed from: Z */
    public final BannerConfigLogo f27282Z;

    /* renamed from: a */
    public final boolean f27283a;
    @C12580l

    /* renamed from: b */
    public final String f27284b;

    /* renamed from: c */
    public final int f27285c;

    /* renamed from: d */
    public final int f27286d;

    /* renamed from: e */
    public final int f27287e;

    /* renamed from: f */
    public final int f27288f;

    /* renamed from: g */
    public final int f27289g;

    /* renamed from: v */
    public final int f27290v;

    /* renamed from: w */
    public final int f27291w;

    /* renamed from: x */
    public final int f27292x;

    /* renamed from: y */
    public final int f27293y;
    @C12580l

    /* renamed from: z */
    public final Integer f27294z;

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration$a */
    public static final class C9918a implements Parcelable.Creator<BannerConfiguration> {
        @C12579k
        /* renamed from: a */
        public final BannerConfiguration createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            return new BannerConfiguration(parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), BannerConfigLogo.CREATOR.createFromParcel(parcel2), BannerConfigNavigation.CREATOR.createFromParcel(parcel2));
        }

        @C12579k
        /* renamed from: b */
        public final BannerConfiguration[] newArray(int i) {
            return new BannerConfiguration[i];
        }
    }

    @C11315i
    public BannerConfiguration(@C12580l String str) {
        this(false, str, 0, 0, 0, 0, 0, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, C12520s0.f30504c, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final int mo20660a() {
        return this.f27288f;
    }

    /* renamed from: b */
    public final int mo20661b() {
        return this.f27292x;
    }

    /* renamed from: c */
    public final int mo20662c() {
        return this.f27281Y;
    }

    @C12580l
    /* renamed from: d */
    public final String mo20663d() {
        return this.f27284b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo20665e() {
        return this.f27293y;
    }

    /* renamed from: f */
    public final boolean mo20666f() {
        return this.f27283a;
    }

    /* renamed from: g */
    public final int mo20667g() {
        return this.f27285c;
    }

    /* renamed from: h */
    public final int mo20668h() {
        return this.f27289g;
    }

    @C12579k
    /* renamed from: i */
    public final BannerConfigLogo mo20669i() {
        return this.f27282Z;
    }

    @C12580l
    /* renamed from: j */
    public final Integer mo20670j() {
        return this.f27294z;
    }

    @C12580l
    /* renamed from: k */
    public final Integer mo20671k() {
        return this.f27280X;
    }

    @C12579k
    /* renamed from: l */
    public final BannerConfigNavigation mo20672l() {
        return this.f27279E0;
    }

    /* renamed from: m */
    public final int mo20673m() {
        return this.f27287e;
    }

    /* renamed from: n */
    public final int mo20674n() {
        return this.f27291w;
    }

    /* renamed from: o */
    public final int mo20675o() {
        return this.f27286d;
    }

    /* renamed from: p */
    public final int mo20676p() {
        return this.f27290v;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f27283a ? 1 : 0);
        parcel.writeString(this.f27284b);
        parcel.writeInt(this.f27285c);
        parcel.writeInt(this.f27286d);
        parcel.writeInt(this.f27287e);
        parcel.writeInt(this.f27288f);
        parcel.writeInt(this.f27289g);
        parcel.writeInt(this.f27290v);
        parcel.writeInt(this.f27291w);
        parcel.writeInt(this.f27292x);
        parcel.writeInt(this.f27293y);
        Integer num = this.f27294z;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f27280X;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.f27281Y);
        this.f27282Z.writeToParcel(parcel, i);
        this.f27279E0.writeToParcel(parcel, i);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str) {
        this(z, str, 0, 0, 0, 0, 0, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65532, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i) {
        this(z, str, i, 0, 0, 0, 0, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65528, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2) {
        this(z, str, i, i2, 0, 0, 0, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65520, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3) {
        this(z, str, i, i2, i3, 0, 0, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65504, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4) {
        this(z, str, i, i2, i3, i4, 0, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65472, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5) {
        this(z, str, i, i2, i3, i4, i5, 0, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65408, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this(z, str, i, i2, i3, i4, i5, i6, 0, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65280, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, 0, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 65024, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, i8, 0, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 64512, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, i8, i9, (Integer) null, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 63488, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @C12580l Integer num) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, i8, i9, num, (Integer) null, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 61440, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @C12580l Integer num, @C12580l Integer num2) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, i8, i9, num, num2, 0, (BannerConfigLogo) null, (BannerConfigNavigation) null, 57344, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @C12580l Integer num, @C12580l Integer num2, int i10) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, i8, i9, num, num2, i10, (BannerConfigLogo) null, (BannerConfigNavigation) null, 49152, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @C12580l Integer num, @C12580l Integer num2, int i10, @C12579k BannerConfigLogo bannerConfigLogo) {
        this(z, str, i, i2, i3, i4, i5, i6, i7, i8, i9, num, num2, i10, bannerConfigLogo, (BannerConfigNavigation) null, 32768, (DefaultConstructorMarker) null);
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(bannerConfigLogo, "logo");
    }

    @C11315i
    public BannerConfiguration(boolean z, @C12580l String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @C12580l Integer num, @C12580l Integer num2, int i10, @C12579k BannerConfigLogo bannerConfigLogo, @C12579k BannerConfigNavigation bannerConfigNavigation) {
        BannerConfigLogo bannerConfigLogo2 = bannerConfigLogo;
        BannerConfigNavigation bannerConfigNavigation2 = bannerConfigNavigation;
        Intrinsics.checkNotNullParameter(bannerConfigLogo2, "logo");
        Intrinsics.checkNotNullParameter(bannerConfigNavigation2, C17075f2.f45106r0);
        this.f27283a = z;
        this.f27284b = str;
        this.f27285c = i;
        this.f27286d = i2;
        this.f27287e = i3;
        this.f27288f = i4;
        this.f27289g = i5;
        this.f27290v = i6;
        this.f27291w = i7;
        this.f27292x = i8;
        this.f27293y = i9;
        this.f27294z = num;
        this.f27280X = num2;
        this.f27281Y = i10;
        this.f27282Z = bannerConfigLogo2;
        this.f27279E0 = bannerConfigNavigation2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BannerConfiguration(boolean r28, java.lang.String r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, java.lang.Integer r39, java.lang.Integer r40, int r41, com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo r42, com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r27 = this;
            r0 = r44
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r3 = r1
            goto L_0x000b
        L_0x0009:
            r3 = r28
        L_0x000b:
            r1 = r0 & 4
            r2 = 20
            if (r1 == 0) goto L_0x0013
            r5 = r2
            goto L_0x0015
        L_0x0013:
            r5 = r30
        L_0x0015:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001b
            r6 = r2
            goto L_0x001d
        L_0x001b:
            r6 = r31
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r7 = r2
            goto L_0x0025
        L_0x0023:
            r7 = r32
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r8 = r2
            goto L_0x002d
        L_0x002b:
            r8 = r33
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r9 = r2
            goto L_0x0035
        L_0x0033:
            r9 = r34
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r10 = r2
            goto L_0x003d
        L_0x003b:
            r10 = r35
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0043
            r11 = r2
            goto L_0x0045
        L_0x0043:
            r11 = r36
        L_0x0045:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004b
            r12 = r2
            goto L_0x004d
        L_0x004b:
            r12 = r37
        L_0x004d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0055
            r1 = 8
            r13 = r1
            goto L_0x0057
        L_0x0055:
            r13 = r38
        L_0x0057:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r4 = 0
            if (r1 == 0) goto L_0x005e
            r14 = r4
            goto L_0x0060
        L_0x005e:
            r14 = r39
        L_0x0060:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0066
            r15 = r4
            goto L_0x0068
        L_0x0066:
            r15 = r40
        L_0x0068:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006f
            r16 = r2
            goto L_0x0071
        L_0x006f:
            r16 = r41
        L_0x0071:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x00a1
            com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo r1 = new com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo
            r2 = 0
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 127(0x7f, float:1.78E-43)
            r23 = 0
            r30 = r1
            r31 = r2
            r32 = r4
            r33 = r17
            r34 = r18
            r35 = r19
            r36 = r20
            r37 = r21
            r38 = r22
            r39 = r23
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r17 = r1
            goto L_0x00a3
        L_0x00a1:
            r17 = r42
        L_0x00a3:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00e0
            com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation r0 = new com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation
            r1 = 0
            r2 = 0
            r4 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1023(0x3ff, float:1.434E-42)
            r26 = 0
            r30 = r0
            r31 = r1
            r32 = r2
            r33 = r4
            r34 = r18
            r35 = r19
            r36 = r20
            r37 = r21
            r38 = r22
            r39 = r23
            r40 = r24
            r41 = r25
            r42 = r26
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r18 = r0
            goto L_0x00e2
        L_0x00e0:
            r18 = r43
        L_0x00e2:
            r2 = r27
            r4 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration.<init>(boolean, java.lang.String, int, int, int, int, int, int, int, int, int, java.lang.Integer, java.lang.Integer, int, com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo, com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
