package com.usabilla.sdk.ubform.sdk.banner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.C35390i;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C35390i(generateAdapter = true)
@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0019\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b.\u0010)¨\u00061"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "k", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "a", "", "b", "c", "d", "e", "f", "g", "assetName", "height", "width", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "h", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "I", "getHeight", "()I", "getWidth", "m", "o", "n", "l", "<init>", "(Ljava/lang/String;IIIIII)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class BannerConfigLogo implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BannerConfigLogo> CREATOR = new C9913a();
    @C12580l

    /* renamed from: a */
    public final String f27229a;

    /* renamed from: b */
    public final int f27230b;

    /* renamed from: c */
    public final int f27231c;

    /* renamed from: d */
    public final int f27232d;

    /* renamed from: e */
    public final int f27233e;

    /* renamed from: f */
    public final int f27234f;

    /* renamed from: g */
    public final int f27235g;

    /* renamed from: com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo$a */
    public static final class C9913a implements Parcelable.Creator<BannerConfigLogo> {
        @C12579k
        /* renamed from: a */
        public final BannerConfigLogo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BannerConfigLogo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final BannerConfigLogo[] newArray(int i) {
            return new BannerConfigLogo[i];
        }
    }

    @C11315i
    public BannerConfigLogo() {
        this((String) null, 0, 0, 0, 0, 0, 0, 127, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public static /* synthetic */ BannerConfigLogo m37242i(BannerConfigLogo bannerConfigLogo, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bannerConfigLogo.f27229a;
        }
        if ((i7 & 2) != 0) {
            i = bannerConfigLogo.f27230b;
        }
        int i8 = i;
        if ((i7 & 4) != 0) {
            i2 = bannerConfigLogo.f27231c;
        }
        int i9 = i2;
        if ((i7 & 8) != 0) {
            i3 = bannerConfigLogo.f27232d;
        }
        int i10 = i3;
        if ((i7 & 16) != 0) {
            i4 = bannerConfigLogo.f27233e;
        }
        int i11 = i4;
        if ((i7 & 32) != 0) {
            i5 = bannerConfigLogo.f27234f;
        }
        int i12 = i5;
        if ((i7 & 64) != 0) {
            i6 = bannerConfigLogo.f27235g;
        }
        return bannerConfigLogo.mo20573h(str, i8, i9, i10, i11, i12, i6);
    }

    @C12580l
    /* renamed from: a */
    public final String mo20562a() {
        return this.f27229a;
    }

    /* renamed from: b */
    public final int mo20563b() {
        return this.f27230b;
    }

    /* renamed from: c */
    public final int mo20564c() {
        return this.f27231c;
    }

    /* renamed from: d */
    public final int mo20565d() {
        return this.f27232d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo20567e() {
        return this.f27233e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerConfigLogo)) {
            return false;
        }
        BannerConfigLogo bannerConfigLogo = (BannerConfigLogo) obj;
        return Intrinsics.areEqual((Object) this.f27229a, (Object) bannerConfigLogo.f27229a) && this.f27230b == bannerConfigLogo.f27230b && this.f27231c == bannerConfigLogo.f27231c && this.f27232d == bannerConfigLogo.f27232d && this.f27233e == bannerConfigLogo.f27233e && this.f27234f == bannerConfigLogo.f27234f && this.f27235g == bannerConfigLogo.f27235g;
    }

    /* renamed from: f */
    public final int mo20569f() {
        return this.f27234f;
    }

    /* renamed from: g */
    public final int mo20570g() {
        return this.f27235g;
    }

    public final int getHeight() {
        return this.f27230b;
    }

    public final int getWidth() {
        return this.f27231c;
    }

    @C12579k
    /* renamed from: h */
    public final BannerConfigLogo mo20573h(@C12580l String str, int i, int i2, int i3, int i4, int i5, int i6) {
        return new BannerConfigLogo(str, i, i2, i3, i4, i5, i6);
    }

    public int hashCode() {
        String str = this.f27229a;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f27230b)) * 31) + Integer.hashCode(this.f27231c)) * 31) + Integer.hashCode(this.f27232d)) * 31) + Integer.hashCode(this.f27233e)) * 31) + Integer.hashCode(this.f27234f)) * 31) + Integer.hashCode(this.f27235g);
    }

    @C12580l
    /* renamed from: j */
    public final String mo20575j() {
        return this.f27229a;
    }

    @C12580l
    /* renamed from: k */
    public final Drawable mo20576k(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String str = this.f27229a;
        if (str == null) {
            return null;
        }
        return C10133g.m38339a(context, str);
    }

    /* renamed from: l */
    public final int mo20577l() {
        return this.f27235g;
    }

    /* renamed from: m */
    public final int mo20578m() {
        return this.f27232d;
    }

    /* renamed from: n */
    public final int mo20579n() {
        return this.f27234f;
    }

    /* renamed from: o */
    public final int mo20580o() {
        return this.f27233e;
    }

    @C12579k
    public String toString() {
        return "BannerConfigLogo(assetName=" + this.f27229a + ", height=" + this.f27230b + ", width=" + this.f27231c + ", leftMargin=" + this.f27232d + ", topMargin=" + this.f27233e + ", rightMargin=" + this.f27234f + ", bottomMargin=" + this.f27235g + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f27229a);
        parcel.writeInt(this.f27230b);
        parcel.writeInt(this.f27231c);
        parcel.writeInt(this.f27232d);
        parcel.writeInt(this.f27233e);
        parcel.writeInt(this.f27234f);
        parcel.writeInt(this.f27235g);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str) {
        this(str, 0, 0, 0, 0, 0, 0, 126, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str, int i) {
        this(str, i, 0, 0, 0, 0, 0, 124, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str, int i, int i2) {
        this(str, i, i2, 0, 0, 0, 0, 120, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str, int i, int i2, int i3) {
        this(str, i, i2, i3, 0, 0, 0, 112, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str, int i, int i2, int i3, int i4) {
        this(str, i, i2, i3, i4, 0, 0, 96, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str, int i, int i2, int i3, int i4, int i5) {
        this(str, i, i2, i3, i4, i5, 0, 64, (DefaultConstructorMarker) null);
    }

    @C11315i
    public BannerConfigLogo(@C12580l String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f27229a = str;
        this.f27230b = i;
        this.f27231c = i2;
        this.f27232d = i3;
        this.f27233e = i4;
        this.f27234f = i5;
        this.f27235g = i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BannerConfigLogo(java.lang.String r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0005
            r6 = 0
        L_0x0005:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000b
            r7 = 150(0x96, float:2.1E-43)
        L_0x000b:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0012
            r8 = 115(0x73, float:1.61E-43)
        L_0x0012:
            r0 = r8
            r7 = r13 & 8
            r8 = 0
            if (r7 == 0) goto L_0x001a
            r1 = r8
            goto L_0x001b
        L_0x001a:
            r1 = r9
        L_0x001b:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            r2 = r8
            goto L_0x0022
        L_0x0021:
            r2 = r10
        L_0x0022:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            r3 = r8
            goto L_0x0029
        L_0x0028:
            r3 = r11
        L_0x0029:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            r4 = r8
            goto L_0x0030
        L_0x002f:
            r4 = r12
        L_0x0030:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo.<init>(java.lang.String, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
