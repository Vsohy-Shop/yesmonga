package com.usabilla.sdk.ubform.screenshot.annotation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/UbDraft;", "Landroid/os/Parcelable;", "", "n", "m", "a", "b", "c", "d", "Landroid/graphics/Bitmap;", "e", "left", "top", "right", "bottom", "bitmap", "f", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "F", "j", "()F", "l", "k", "i", "Landroid/graphics/Bitmap;", "h", "()Landroid/graphics/Bitmap;", "<init>", "(FFFFLandroid/graphics/Bitmap;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UbDraft implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UbDraft> CREATOR = new C9886a();

    /* renamed from: a */
    public final float f27145a;

    /* renamed from: b */
    public final float f27146b;

    /* renamed from: c */
    public final float f27147c;

    /* renamed from: d */
    public final float f27148d;
    @C12579k

    /* renamed from: e */
    public final Bitmap f27149e;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.UbDraft$a */
    public static final class C9886a implements Parcelable.Creator<UbDraft> {
        @C12579k
        /* renamed from: a */
        public final UbDraft createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UbDraft(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), (Bitmap) parcel.readParcelable(UbDraft.class.getClassLoader()));
        }

        @C12579k
        /* renamed from: b */
        public final UbDraft[] newArray(int i) {
            return new UbDraft[i];
        }
    }

    public UbDraft(float f, float f2, float f3, float f4, @C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f27145a = f;
        this.f27146b = f2;
        this.f27147c = f3;
        this.f27148d = f4;
        this.f27149e = bitmap;
    }

    /* renamed from: g */
    public static /* synthetic */ UbDraft m37102g(UbDraft ubDraft, float f, float f2, float f3, float f4, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ubDraft.f27145a;
        }
        if ((i & 2) != 0) {
            f2 = ubDraft.f27146b;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = ubDraft.f27147c;
        }
        float f6 = f3;
        if ((i & 8) != 0) {
            f4 = ubDraft.f27148d;
        }
        float f7 = f4;
        if ((i & 16) != 0) {
            bitmap = ubDraft.f27149e;
        }
        return ubDraft.mo20434f(f, f5, f6, f7, bitmap);
    }

    /* renamed from: a */
    public final float mo20427a() {
        return this.f27145a;
    }

    /* renamed from: b */
    public final float mo20428b() {
        return this.f27146b;
    }

    /* renamed from: c */
    public final float mo20429c() {
        return this.f27147c;
    }

    /* renamed from: d */
    public final float mo20430d() {
        return this.f27148d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final Bitmap mo20432e() {
        return this.f27149e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UbDraft)) {
            return false;
        }
        UbDraft ubDraft = (UbDraft) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f27145a), (Object) Float.valueOf(ubDraft.f27145a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f27146b), (Object) Float.valueOf(ubDraft.f27146b)) && Intrinsics.areEqual((Object) Float.valueOf(this.f27147c), (Object) Float.valueOf(ubDraft.f27147c)) && Intrinsics.areEqual((Object) Float.valueOf(this.f27148d), (Object) Float.valueOf(ubDraft.f27148d)) && Intrinsics.areEqual((Object) this.f27149e, (Object) ubDraft.f27149e);
    }

    @C12579k
    /* renamed from: f */
    public final UbDraft mo20434f(float f, float f2, float f3, float f4, @C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new UbDraft(f, f2, f3, f4, bitmap);
    }

    @C12579k
    /* renamed from: h */
    public final Bitmap mo20435h() {
        return this.f27149e;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f27145a) * 31) + Float.hashCode(this.f27146b)) * 31) + Float.hashCode(this.f27147c)) * 31) + Float.hashCode(this.f27148d)) * 31) + this.f27149e.hashCode();
    }

    /* renamed from: i */
    public final float mo20437i() {
        return this.f27148d;
    }

    /* renamed from: j */
    public final float mo20438j() {
        return this.f27145a;
    }

    /* renamed from: k */
    public final float mo20439k() {
        return this.f27147c;
    }

    /* renamed from: l */
    public final float mo20440l() {
        return this.f27146b;
    }

    /* renamed from: m */
    public final float mo20441m() {
        return this.f27148d - this.f27146b;
    }

    /* renamed from: n */
    public final float mo20442n() {
        return this.f27147c - this.f27145a;
    }

    @C12579k
    public String toString() {
        return "UbDraft(left=" + this.f27145a + ", top=" + this.f27146b + ", right=" + this.f27147c + ", bottom=" + this.f27148d + ", bitmap=" + this.f27149e + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.f27145a);
        parcel.writeFloat(this.f27146b);
        parcel.writeFloat(this.f27147c);
        parcel.writeFloat(this.f27148d);
        parcel.writeParcelable(this.f27149e, i);
    }
}
